package tk.roccodev.labyzig.configs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import tk.roccodev.labyzig.Main;
import tk.roccodev.labyzig.support.Support;

public class LabyModConfig {

	
	private static File config;
	private static File zigConfig;
	
	
	public static void init() {
		config = new File(Main.LABY_DIR + "/LabyMod.json");
		zigConfig = new File(Main.ZIG_DIR + "/config.json");
	}
	
	public static void applyItem(Support item) throws FileNotFoundException, IOException, ParseException {
		String key = item.getKey();
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(new FileReader(config));
		Object result = item.getType().cast(json.get(key));
		
		System.out.println(result);
		System.out.println(item.zigEquivalent(result));
		
		JSONObject zigJson = (JSONObject) parser.parse(new FileReader(zigConfig));
		zigJson.remove(item.zigKey());
		zigJson.put(item.zigKey(), item.zigEquivalent(result));
		try (FileWriter file = new FileWriter(zigConfig)) {

            zigJson.writeJSONString(file);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

	}
	
	
}

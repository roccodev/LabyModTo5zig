package tk.roccodev.labyzig.configs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
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
		System.out.println("Loading " + item.getClass());
		String key = item.getKey();
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(new FileReader(config));
		Object result = item.getType().cast(json.get(key));
		
		if(item.zigEquivalent(result) == null) return;
		
		
		File zigFile = item.zigConfig() == ConfigType.CONFIG ? zigConfig : new File(Main.ZIG_DIR + "/modules.json");
		JSONObject zigJson = (JSONObject) parser.parse(new FileReader(zigFile));
		
		if(item.zigConfig().name().startsWith("MODULES")) {
			JSONArray modules = (JSONArray) zigJson.get("modules");
			ArrayList<JSONObject> toReplace = new ArrayList<JSONObject>();
			for(Object obj : modules) {
				if(obj instanceof JSONObject) {
					JSONObject jobj = (JSONObject) obj;
					if(((String) jobj.get("id")).equalsIgnoreCase("Imported from LabyMod")){
						
						if(item.zigConfig() == ConfigType.MODULES){
							
						jobj.remove(item.zigKey());
						jobj.put(item.zigKey(), item.zigEquivalent(result));
						
						}
						else if(item.zigConfig() == ConfigType.MODULES_ITEM) {
							JSONArray items = (JSONArray) jobj.get("items");
							items.add(item.zigEquivalent(result)); // Support#zigEquivalent MUST be a JSONObject instance.
							jobj.remove("items");
							jobj.put("items", items);
						}
					}
					else {
						JSONObject module = new JSONObject() {{
							
							put("id", "Imported from LabyMod");
							put("showLabel", true);
							put("scale", 1.0);
							put("location", "TOP_LEFT");
							put("boxOpacity", 0.0);
							put("enabled", true);
							put("items", new JSONArray());
						}};
					
						
						if(item.zigConfig() == ConfigType.MODULES){
							
							module.remove(item.zigKey());
							module.put(item.zigKey(), item.zigEquivalent(result));
							
							}
							else if(item.zigConfig() == ConfigType.MODULES_ITEM) {
								JSONArray items = (JSONArray) module.get("items");
								items.add(item.zigEquivalent(result)); // Support#zigEquivalent MUST be a JSONObject instance.
								module.remove("items");
								module.put("items", items);
							}
						toReplace.add(module);
						
					}
				}
			}
			for(JSONObject obj : toReplace) {
			
			if(modules.contains(obj)) modules.remove(obj);
			modules.add(obj);
			}
				
			
			zigJson.remove("modules");
			zigJson.put("modules", modules);
	
			
			
			
		} else {
		zigJson.remove(item.zigKey());
		zigJson.put(item.zigKey(), item.zigEquivalent(result));
		}
		try (FileWriter file = new FileWriter(zigFile)) {

            zigJson.writeJSONString(file);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

	}
	
	
}

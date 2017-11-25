package tk.roccodev.labyzig;

import java.io.File;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import tk.roccodev.labyzig.configs.LabyModConfig;
import tk.roccodev.labyzig.support.SpeedFOVSupport;
import tk.roccodev.labyzig.support.color.PrefixColorSupport;

public class Main {

	public static File MC_DIR;
	public static File LABY_DIR;
	public static File ZIG_DIR;
	
	
	
	public static void main(String args[]) {
		
		
		String OS = System.getProperty("os.name").toLowerCase();
		try{
		if (OS.contains("mac")) {
		    MC_DIR = new File(System.getProperty("user.home") + "/Library/Application Support/minecraft");
		} else if (OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0) {
			MC_DIR = new File(System.getProperty("user.home") + "/.minecraft");
		} else if (OS.contains("win")) {
		    MC_DIR = new File(System.getenv("APPDATA") + "/.minecraft");
		} else {
		   MC_DIR = new File(System.getProperty("user.home") + "/Minecraft5zig");
		}
		}catch(Exception e){
			 MC_DIR = new File(System.getProperty("user.home") + "/Minecraft5zig");
		}
		if(!MC_DIR.exists()) MC_DIR.mkdir();
		
		LABY_DIR = new File(MC_DIR + "/LabyMod");
		ZIG_DIR = new File(MC_DIR + "/the5zigmod");
		
		if(!LABY_DIR.exists()) {
			System.out.println("No LabyMod found!");
			System.exit(0);
		}
		if(!ZIG_DIR.exists()) {
			System.out.println("No 5zig found!");
			System.exit(0);
		}
		LabyModConfig.init();
		try {
			LabyModConfig.applyItem(new PrefixColorSupport());
			LabyModConfig.applyItem(new SpeedFOVSupport());
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

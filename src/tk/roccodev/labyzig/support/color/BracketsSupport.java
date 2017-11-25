package tk.roccodev.labyzig.support.color;

import tk.roccodev.labyzig.configs.ConfigType;
import tk.roccodev.labyzig.support.Support;
import tk.roccodev.labyzig.utils.ChatColor;

public class BracketsSupport implements Support {

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return "layout";
	}

	@Override
	public Class getType() {
		// TODO Auto-generated method stub
		return Long.class;
	}

	
	
	
	@Override
	public Object zigEquivalent(Object labyMod) {
		switch(Math.toIntExact((long)labyMod)) {
		
		case 1:
			return "COLON";
			
		case 2:
			return "BRACKETS";
			
		case 3:
			return "ARROW";
		
		
		
		}
		return null;
	}

	@Override
	public String zigKey() {
		// TODO Auto-generated method stub
		return "formattingBrackets";
	}

	@Override
	public Class zigType() {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public ConfigType zigConfig() {
		// TODO Auto-generated method stub
		return ConfigType.CONFIG;
	}

	
}

package tk.roccodev.labyzig.support.color;

import tk.roccodev.labyzig.configs.ConfigType;
import tk.roccodev.labyzig.support.Support;
import tk.roccodev.labyzig.utils.ChatColor;

public class BracketsColorSupport implements Support {

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return "color2";
	}

	@Override
	public Class getType() {
		// TODO Auto-generated method stub
		return String.class;
	}

	
	
	
	@Override
	public Object zigEquivalent(Object labyMod) {
		// TODO Auto-generated method stub
		return ChatColor.getByChar(((String)labyMod).replace("§", "").charAt(0)).name();
	}

	@Override
	public String zigKey() {
		// TODO Auto-generated method stub
		return "colorBrackets";
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

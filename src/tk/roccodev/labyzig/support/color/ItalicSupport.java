package tk.roccodev.labyzig.support.color;

import tk.roccodev.labyzig.configs.ConfigType;
import tk.roccodev.labyzig.support.Support;
import tk.roccodev.labyzig.utils.ChatColor;

public class ItalicSupport implements Support {

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return "italic";
	}

	@Override
	public Class getType() {
		// TODO Auto-generated method stub
		return Boolean.class;
	}

	
	
	
	@Override
	public Object zigEquivalent(Object labyMod) {
		if(labyMod instanceof Boolean) {
			if((boolean)labyMod) {
				return "ITALIC";
			}
		}
		return null;
	}

	@Override
	public String zigKey() {
		// TODO Auto-generated method stub
		return "formattingMain";
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

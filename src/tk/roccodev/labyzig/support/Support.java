package tk.roccodev.labyzig.support;

import tk.roccodev.labyzig.configs.ConfigType;

public interface Support {

	
	
	
	
	
	
	public String getKey();
	public Class getType();
	
	public Object zigEquivalent(Object labyMod);
	public String zigKey();
	public Class zigType();
	
	public ConfigType zigConfig();
	
	
	
	
}

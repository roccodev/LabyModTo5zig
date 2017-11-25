package tk.roccodev.labyzig.support;

import org.json.simple.JSONObject;

import tk.roccodev.labyzig.configs.ConfigType;

public class NameHeadSupport implements Support {

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return "showMyName";
	}

	@Override
	public Class getType() {
		// TODO Auto-generated method stub
		return Boolean.class;
	}

	
	
	
	@Override
	public Object zigEquivalent(Object labyMod) {
		if(labyMod instanceof Boolean) {
			return (boolean)labyMod;
		}
		
		return null;

	}

	@Override
	public String zigKey() {
		// TODO Auto-generated method stub
		return "showOwnNameTag"; // Irrelevant
	}

	@Override
	public Class zigType() {
		// TODO Auto-generated method stub
		return Boolean.class; // Irrelevant
	}

	@Override
	public ConfigType zigConfig() {
		// TODO Auto-generated method stub
		return ConfigType.CONFIG;
	}

	
}

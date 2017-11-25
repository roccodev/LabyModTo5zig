package tk.roccodev.labyzig.support;

import org.json.simple.JSONObject;

import tk.roccodev.labyzig.configs.ConfigType;

public class BiomeSupport implements Support {

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return "showBiome";
	}

	@Override
	public Class getType() {
		// TODO Auto-generated method stub
		return Boolean.class;
	}

	
	
	
	@Override
	public Object zigEquivalent(Object labyMod) {
		if((boolean)labyMod) {
			JSONObject obj = new JSONObject() {{
				
				put("type", "BIOME");
				
			}};
			return obj;
		}
		return null;
		
	}

	@Override
	public String zigKey() {
		// TODO Auto-generated method stub
		return ""; // Irrelevant
	}

	@Override
	public Class zigType() {
		// TODO Auto-generated method stub
		return JSONObject.class; // Irrelevant
	}

	@Override
	public ConfigType zigConfig() {
		// TODO Auto-generated method stub
		return ConfigType.MODULES_ITEM;
	}

	
}

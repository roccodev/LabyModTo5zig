package tk.roccodev.labyzig.support;

import org.json.simple.JSONObject;

import tk.roccodev.labyzig.configs.ConfigType;

public class CoordsSupport implements Support {

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return "showCoords";
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
				
				put("type", "COORDINATES");
				
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

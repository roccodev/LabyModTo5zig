package tk.roccodev.labyzig.support;

import tk.roccodev.labyzig.support.Support;
import tk.roccodev.labyzig.utils.ChatColor;

public class SpeedFOVSupport implements Support {

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return "speedFOV";
	}

	@Override
	public Class getType() {
		// TODO Auto-generated method stub
		return Boolean.class;
	}

	
	
	
	@Override
	public Object zigEquivalent(Object labyMod) {
		// TODO Auto-generated method stub
		return !((boolean)labyMod);
	}

	@Override
	public String zigKey() {
		// TODO Auto-generated method stub
		return "staticFOV";
	}

	@Override
	public Class zigType() {
		// TODO Auto-generated method stub
		return Boolean.class;
	}

	
}

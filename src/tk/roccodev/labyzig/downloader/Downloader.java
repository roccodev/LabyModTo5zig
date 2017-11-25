package tk.roccodev.labyzig.downloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Downloader {

	
	private URL url;
	private String name;
	
	
	public void download(File target) throws IOException {
		ReadableByteChannel rbc = Channels.newChannel(url.openStream());
		FileOutputStream fos = new FileOutputStream(target);
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		fos.close();
	}

	

	public Downloader(URL url, String name) {
		super();
		this.url = url;
		this.name = name;
	}



	public URL getUrl() {
		return url;
	}


	public String getName() {
		return name;
	}
	
	
	
}

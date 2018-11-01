//No longer used, was kept for running quick tests.
package Server;

import java.io.File;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {

		CreateThread("F:\\Third Year Semester 5\\Distributed Systems Programming\\MediaPlayer1.1\\src\\ServerFolder");

		CreateThread("F:\\Third Year Semester 5\\Distributed Systems Programming\\MediaPlayer1.1\\src\\ClientFolder");

	}
	//Creates a new Thread to observe the folder passed in
	public static void CreateThread(String url) {

		FolderObservable observable = new FolderObservable(url);

		Thread thread = new Thread(observable);

		thread.start();
	}

}

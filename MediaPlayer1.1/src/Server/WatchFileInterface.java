/**
 * Dan Coleman R00151926
 * Distributed Systems Programming Project 1: Media Player
 * WatchFileInterface : Methods for WatchFile come through here to avoid giving user access to anything other than exactly what is needed.
 */
package Server;

import java.io.File;
import java.io.IOException;


public interface WatchFileInterface {

	//If there is files in the directory it returns an array with the name of the files in it otherwise
	//returns nothing  
	public File[] ReturnFiles();
	
	//Takes in the name of a file then loops to find that file in the array, returns that file
	public File ReturnFile(String name);

	//Moves the file from the server folder over to the client folder
	public void CopyFile(File source) throws IOException;

}

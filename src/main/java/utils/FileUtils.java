package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.FileConstants;

public class FileUtils {
	
	
	public static String readPropertiesFile(String path, String key) throws IOException {
		File f = new File(path);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}

	
	/**
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String readUserMenuTestData(String key) throws IOException {
		File f = new File(FileConstants.USER_MENU_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
	
	public static String readOpportunitiesTestData(String key) throws IOException {
		File f = new File(FileConstants.OPP_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
	
	public static String readLeadTestData(String key) throws IOException {
		File f = new File(FileConstants.LEAD_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
	
	public static String readContactTestData(String key, String string) throws IOException {
		File f = new File(FileConstants.CONTACT_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
	
	
}

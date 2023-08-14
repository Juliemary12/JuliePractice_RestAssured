package Utilities;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.response.Response;



public class RestUtils {

	public static ResourceBundle routes = ResourceBundle.getBundle("Routes");

	public static Logger log = LogManager.getLogger();

	//Schema and xcell path
	public static ResourceBundle path = ResourceBundle.getBundle("path");
	public static XLUtils xlutils=new XLUtils(path.getString("Xlpath"));
	
	
	public static Response response;
	
}

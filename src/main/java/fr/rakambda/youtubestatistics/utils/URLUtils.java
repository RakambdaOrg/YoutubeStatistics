package fr.rakambda.youtubestatistics.utils;

import java.util.HashMap;
import java.util.Map;

public class URLUtils{
	public static Map<String, String> getQueryMap(String query){
		String[] params = query.split("&");
		Map<String, String> map = new HashMap<>();
		for(String param : params){
			String name = param.split("=")[0];
			String value = param.split("=")[1];
			map.put(name, value);
		}
		return map;
	}
}

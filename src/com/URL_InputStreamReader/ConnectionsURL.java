package com.URL_InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConnectionsURL {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://qldt.hanu.vn/");
			URLConnection urlConnection = url.openConnection();
			urlConnection.setDoOutput(true);
			urlConnection.connect();
			BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line = "";
			while (line != null) {
				line = inputStream.readLine();
				System.out.println(line);
			}
			inputStream.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

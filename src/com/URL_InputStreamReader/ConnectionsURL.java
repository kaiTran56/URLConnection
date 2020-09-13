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
			URL url = new URL("https://github.com/kaiTran56/URLConnection");
			URLConnection urlConnection = url.openConnection();
			urlConnection.setDoInput(true);
			urlConnection.connect();
			BufferedReader input = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line = "";
			while (line != null) {
				line = input.readLine();
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

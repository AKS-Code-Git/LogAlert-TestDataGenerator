package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateData {
	private static short RANGE= 4;
	public static void main(String[] args) {
		Random rand = new Random();
		long l = System.currentTimeMillis();
		int i = 0;
		File file = new File("D:\\Practice\\task\\src\\main\\java\\test.json");
		FileWriter fr=null;
		try {
			while (i < 20) {
				Thread.sleep(3000);
				fr = new FileWriter(file, true);
				i++;
				l = l + rand.nextInt(RANGE);
				fr.append("{\"id\":\"scsmbstgra\", \"state\":\"STARTED\",\"type\":\"APPLICATION_LOG\",\"host\":\"12345\",\"timestamp\":"+ l + "}\n");
				l = l + rand.nextInt(RANGE);
				fr.append("{\"id\":\"scsmbstgrb\",\"state\":\"STARTED\",\"timestamp\":" + l + "}\n");
				l = l + rand.nextInt(RANGE);
				fr.append("{\"id\":\"scsmbstgrc\",\"state\":\"STARTED\",\"timestamp\":" + l + "}\n");

				l = l + rand.nextInt(RANGE);
				fr.append("{\"id\":\"scsmbstgra\",\"state\":\"FINISHED\",\"type\":\"APPLICATION_LOG\",\"host\":\"12345\",\"timestamp\":"+ l + "}\n");
				l = l + rand.nextInt(RANGE);
				fr.append("{\"id\":\"scsmbstgrb\",\"state\":\"FINISHED\",\"timestamp\":" + l + "}\n");
				l = l + rand.nextInt(RANGE);
				fr.append("{\"id\":\"scsmbstgrc\",\"state\":\"FINISHED\",\"timestamp\":" + l + "}\n");
				fr.close();				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr!=null) {
			try {
				fr.close();
				file=null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
	}

	private static void appendFile() {
		File file = new File("append.txt");
		try {
			FileWriter fr = new FileWriter(file, true);
			fr.write("data");
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

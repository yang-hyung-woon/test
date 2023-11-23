package kr.or.ddit.crawler;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *  주석 테스트
 */
public class JsopTest {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.yes24.com/24/Category/Display/001001025008").get();
			String html = doc.html();
			File dir = new File("D:/data/list");
			System.out.println(dir);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

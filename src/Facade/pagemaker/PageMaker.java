package Facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public final class PageMaker {
	private PageMaker() {};

	public static void makeWelcomPage(String mailaddr, String fileName) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String userName = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
			writer.title("Welcome to " + userName + "'s page!");
			writer.paragraph(userName + "のページへようこそ");
			writer.paragraph("メールまってます");
			writer.mailto(mailaddr, userName);
			writer.close();
			System.out.println(fileName + " is created for " + mailaddr + " (" + userName + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

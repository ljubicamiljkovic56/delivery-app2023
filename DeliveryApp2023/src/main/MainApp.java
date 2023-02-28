package main;

import gui.Login.Login;
import listsPackage.Lists;

public class MainApp {

	public static void main(String[] args) {
		Lists lists = new Lists();
		
		Login login = new Login(lists);
		login.setVisible(true);

	}

}

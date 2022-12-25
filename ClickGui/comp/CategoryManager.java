package mc.red.Gui.ClickGui.comp;

import java.util.ArrayList;

import mc.red.RedClient;
import mc.red.Gui.ClickGui.ClickGui;
import mc.red.Gui.hud.HUDManager;

public class CategoryManager {
	
	public static int currentPage = 0;
	public static boolean openDragScreen = false;
	
	public static void thisPage(int number) {
		currentPage=number;
		ArrayList<ClickGuiCategoryButton> category = ClickGui.getClickGuiCategoryButton();
		
		for(int i = 0; i< category.size();i++) {
			if(i != currentPage) {
				category.get(i).setIsOnThisPage(false);
			}
		}
		
		if(currentPage == 4) {
			currentPage = 0;
			openDragScreen = true;
		}
	}


	
	
	
}

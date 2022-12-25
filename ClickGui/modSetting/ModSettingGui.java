package mc.red.Gui.ClickGui.modSetting;

import java.awt.Color;

import mc.red.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;

public class ModSettingGui {
	public Mod mod;
	public int x,y,w,h;
	
	public ModSettingGui(int x, int y, int w, int h,Mod mod) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.mod = mod;
	}
	
	
	public void render() {
		Gui.drawRoundedRect(x , y , x+w , y+h, 8, new Color(245, 242, 233,255).getRGB());
		Gui.drawRoundedRect(x , y , x+w , y+10, 8, new Color(138, 66, 88,255).getRGB());
		Minecraft.getMinecraft().fontRendererObj.drawString(mod.name + " : " + mod.isEnabled(), x + 3, y + 13, new Color(0,0,0,255).getRGB());
		Minecraft.getMinecraft().fontRendererObj.drawString(mod.description, x + 3, y + 23, new Color(0,0,0,255).getRGB());
	}
	
	
	
	
	
}

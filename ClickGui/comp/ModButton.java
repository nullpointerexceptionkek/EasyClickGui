package mc.red.Gui.ClickGui.comp;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import mc.red.Gui.ClickGui.ClickGui;
import mc.red.Gui.ClickGui.modSetting.ModSettingManager;
import mc.red.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class ModButton {
	
	public int x,y,w,h;
	public Mod mod;
	public int id;
	
	public ModButton(int x, int y, int w, int h, Mod mod, int id) {
		this.x = x-85;
		this.y = y-80;
		this.w = w;
		this.h = h;
		this.mod = mod;
		this.id = id;
	}
	
	public void render() {
		
		Gui.drawRoundedRect(x , y , x+w , y+h , 8, new Color(224,214,214,255).getRGB());
		Gui.drawRoundedRect((x+w)-28, (y+h)-18, (x+w)-5 , (y+h)-7, 8, getColor());
		Minecraft.getMinecraft().fontRendererObj.drawString(mod.name, x +8, y +8, new Color(0,0,0,255).getRGB());

	}
	
	private int getColor() {
		if(mod.isEnabled()) {
			return new Color(131,255,92,255).getRGB();
		} else {
			return new Color(255,64,59,255).getRGB();
		}

	}
	
	public void onClick(int mouseX, int mouseY, int button) {
		if(button == 0) {
			if(mouseX >= x && mouseX <= x + w && mouseY >= y && mouseY <= y + h) {
				if(mod.isEnabled()) {
					mod.setEnabled(false);
				}
				else {
					mod.setEnabled(true);
				}
	
			}
		}
		else if(button == 1) {
			if(mouseX >= x && mouseX <= x + w && mouseY >= y && mouseY <= y + h) {
				if(ModSettingManager.mod != mod) {
					ModSettingManager.mod = mod;
				}
				else {
					ModSettingManager.mod = null;
				}
			}
		}

	}
	

	
	

}

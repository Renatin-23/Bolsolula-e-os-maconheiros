package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import entities.Player;
import main.Game;

public class UI {
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(6, 7 ,50, 8);
		g.setColor(Color.green);
		g.fillRect(6, 7,(int)((Game.player.life/Game.player.maxlife)*50), 8);
		g.setColor(Color.white);
		g.setFont(new Font("arial",Font.BOLD, 9));
		g.drawString((int)Game.player.life+("/")+(int)Game.player.maxlife,15,15);
		
	}

}

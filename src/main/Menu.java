package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Menu {
	
	public String[] options = {"Novo Jogo", "Carregar", "Sair"};
	
	public int currentOption = 0;
	public int maxOption = options.length - 1;
	
	public boolean up,down;
	
	public void tick() {
		
		if(up) {
			up = false;
			currentOption--;
			if(currentOption < 0)
				currentOption = maxOption;
		}
		if(down) {
			down = false;
			currentOption++;
			if(currentOption > maxOption)
				currentOption = 0;
		}
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, Game.WIDTH*Game.SCALE, Game.HEIGHT*Game.SCALE);
		g.setColor(Color.white);
		g.setFont(new Font("arial",Font.BOLD,32));
		g.drawString(">Bolsula Contra Maconheiros<", (Game.WIDTH*Game.SCALE) / 2 - 250,Game.HEIGHT*Game.SCALE - 450);

		//OPCÕES 
		
		g.setFont(new Font("arial",Font.BOLD,24));
		g.drawString("Novo Jogo", (Game.WIDTH*Game.SCALE) / 2 - 340,200);
		
		g.setFont(new Font("arial",Font.BOLD,24));
		g.drawString("Carregar", (Game.WIDTH*Game.SCALE) / 2 - 340,250);

		g.setFont(new Font("arial",Font.BOLD,24));
		g.drawString("Sair", (Game.WIDTH*Game.SCALE) / 2 - 340,300);
		
		

		if(options[currentOption] == "Novo Jogo") {
			g.drawString(">", (Game.WIDTH*Game.SCALE) / 2 - 360, 200);
		}

		else if(options[currentOption] == "Carregar") {
			g.drawString(">", (Game.WIDTH*Game.SCALE) / 2 - 360, 250);
		}

		else if(options[currentOption] == "Sair") {
			g.drawString(">", (Game.WIDTH*Game.SCALE) / 2 - 360, 300);
		}



	}
	

}

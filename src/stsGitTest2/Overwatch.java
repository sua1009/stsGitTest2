package stsGitTest2;

public class Overwatch {

	public static void main(String[] args) {
		Player p = new Player();
		
		Genzi g = new Genzi();
		Triser t = new Triser();
		Character c = new Character();
		
		p.CMove(t);
		p.CStop(t);
		p.CAttack(t);
		p.CSkill(t);
		
		p.CMove(g);
		p.CStop(g);
		p.CAttack(g);
		p.CSkill(g);
		
		c = new Mac();
		
		p.CMove(c);
		p.CStop(c);
		p.CAttack(c);
		p.CSkill(c);
		
		c = t;
		
		
		p.CMove(c);
		p.CStop(c);
		p.CAttack(c);
		p.CSkill(c);

	}

}

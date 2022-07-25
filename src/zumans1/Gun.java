/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zumans1;

/**
 *
 * @author agila
 */
public class Gun {
    public Gun(String name, int level, int attack, int kill, int range, int bullet,int bulletr, char symbol,int taken){

	gname = name;
	glevel = level;
	gattack = attack;
	gkill = kill;
	grange = range;
	gbullet = bullet;
	gbulletr = bulletr;
	gsymbol = symbol;
        gtaken=taken;
}


	String gname;
	char gsymbol;
	int gattack;
	int grange;
	int gkill;
	int gbullet;
	int gbulletr;
	int glevel;
	int gx;
	int gy;
        int gtaken;

	

	void gsetpos(int x, int y) {
		gsetx(x);
		gsety(y);
	}
	void gsetx(int x) {
		gx = x;
	}
	void gsety(int y) {
		gy = y;
	}
	int  ggetposx() {
		return gx;
	}
	int  ggetposy() {
		return gy;
	}
}

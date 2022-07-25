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
public class citizen {
    citizen(String name, int health, int range, char symbol,int points, int door,int sex)
	{
		hname = name;
		hhealth = health;
		hrange = range;
		hsymbol = symbol;
                hpoints=points;
		hdoor=door;
                hsex=sex;
	}

	void hsetpos(int x, int y) {
		hsetx(x);
		hsety(y);
	}
	void hsetx(int x) {
		hx = x;
	}
	void hsety(int y) {
		hy = y;
	}
	int hgetposx() {
		return hx;
	}
	int hgetposy() {
		return hy;
	}

	String hname;
	int hhealth;
	int hrange;
        int hpoints;
	char hsymbol;
	int hdoor;
        int hsex;
	int hx;
	int hy;
}

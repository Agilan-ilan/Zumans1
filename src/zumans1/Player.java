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
public class Player {
    Player() {};
	void init(String name, int level,int attack,int defence, int range,int health,int xp) {
		_pname = name;
		_plevel = level;
		_pattack = attack;
		_pdefence = defence;
		_prange = range;
		_pxp = xp;
		_phealth = health;
		
	}
void psetpos(int x, int y) {
	psetx( x);
	psety( y);
}
void psetx(int x){
	_x = x;
}
void psety(int y) {
	_y = y;
}
int pgetposx() {
	return _x;
}
int pgetposy() {
	return _y;
}

void plife(String name) {
	lname = name;
}
void pfood(String name) {
	fname = name;
}
        int pbullet ;
	String lname;
	String _pname;
	String fname;
	int _phealth;
	int _plevel;
	int _pattack;
	int _pdefence;
	int _pxp;
	int _prange;
	
	int _x;
	int _y;
	
	int lx;
	int ly;

	int fx;
	int fy;
}

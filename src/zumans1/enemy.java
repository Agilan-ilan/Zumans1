/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zumans1;

import javax.swing.JButton;

/**
 *
 * @author agila
 */
public class enemy {
    public enemy(String name, int level, int attack,  int health ,char symbol,int points,int Id,int sex) {
		_ename = name;
		_elevel = level;
		_eattack = attack;		
		_ehealth = health;		
		_symbol = symbol;
                _epoints=points;
                _eId=Id;
                _esex=sex;
	}
    
public void esetpos(int x, int y) {
	esetx(x);
	esety(y);
}
public void esetx(int x) {
	_x = x;
}
public void esety(int y) {
	_y = y;
}
public int egetposx() {
	return _x;
}
public int egetposy() {
	return _y;
}

        int _esex;
	char _symbol;
	String _ename;
	int _ehealth;
	int _elevel;
	int _eattack;
        int _epoints;
	int _edefence;
	int _eId ;
	int _x;
	int _y;
	int _range;
	
}

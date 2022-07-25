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
public class Bullet {
    
	Bullet(String name, char symbol){
		 bname = name;
		 bsymbol = symbol;
}
	

	void bsetpos(int x, int y) {
		bsetx(x);
		bsety(y);
	}
	void bsetx(int x) {
		bx = x;
	}
	void bsety(int y) {
		by = y;
	}
	int bgetposx() {
		return bx;
	}
	int bgetposy() {
		return by;
	}
        
        String bname;
        char bsymbol;
	int bx=0;
	int by=0;
}

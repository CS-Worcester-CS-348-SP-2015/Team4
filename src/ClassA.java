/* 
 * Copyright (C) 2015 Karl R. Wurst
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 */

public class ClassA {

	private int a;
	private int b;
	private int y;
	private int z;

	//Adds int x
	private int x;

	//sets x
	public void setX(int temp1) {
		x = temp1;	
	}

	//gets x
	public int getX(){
		return x;
	}

	//getter for a
	public int getA() {
		return this.a;
	}
	//setter for a
	public void setA(int a) {
		this.a = a;
	}

	//@Override
	public String toString() {
		return "a : " + a + "b : " + b + "y : " + y + "z : " + z;
	}

	//sets z
	public void setZ(int temp2) {
		z = temp2;	
	}
	//gets z
	public int getZ(){
		return z;	
	}
}

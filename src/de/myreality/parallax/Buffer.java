/* Library which provides parallax scrolling support for Java 2D libraries such as LibGDX and Slick2D.
 * Copyright (C) 2013  Miguel Gonzalez
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package de.myreality.parallax;

import de.myreality.parallax.util.Bufferable;
import de.myreality.parallax.util.Clearable;

/**
 * Provides buffering functionality. A buffer can handle objects
 * of type {@see Bufferable} and process them via update method.
 * 
 * You can determine how many targets should get processed during
 * one method call by setting a new 
 * 
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 1.0
 * @version 1.0
 */
interface Buffer extends Clearable {

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	
	/**
	 * Sets a new buffer size. If the index is < 0, then it will be
	 * automatically set to 0. If the index equals 0, buffering will
	 * be disabled automatically.
	 * 
	 * @param buffer value to determine the number of calculations per update
	 */
	void setBufferSize(int buffer);
	
	/**
	 * Returns the current buffer size
	 * 
	 * @return
	 */
	int getBufferSize();
	
	/**
	 * Update this buffer
	 * 
	 */
	void update();
	
	/**
	 * Adds a new {@see Bufferable} to this buffer
	 * 
	 * @param bufferable
	 */
	void add(Bufferable bufferable);
	
	/**
	 * Checks if the target object has been already cached 
	 * 
	 * @param bufferable
	 * @return true when cached
	 */
	boolean isLoaded(Bufferable bufferable);
	
	/**
	 * Unload an already buffered object
	 * 
	 * @param bufferable
	 */
	public void unload(Bufferable bufferable);

}

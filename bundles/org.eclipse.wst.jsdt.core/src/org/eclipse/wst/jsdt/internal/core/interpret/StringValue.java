/*******************************************************************************
 * Copyright (c) 2005, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Mickael Istria (Red Hat Inc.) - Cleanup
 *******************************************************************************/
package org.eclipse.wst.jsdt.internal.core.interpret;

public class StringValue extends Value {

	String stringValue;

	public StringValue(String value) {
		super(Value.STRING);
		this.stringValue=value;
	}


	public boolean booleanValue() {
		return stringValue.length()!=0;
	}

	public int numberValue() {
		return Integer.parseInt(stringValue);
	}

	public String stringValue() {
		return stringValue;
	}
	
}

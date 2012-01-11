/*******************************************************************************
 * Copyright (c) 2010, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.jsdt.debug.internal.rhino.ui.launching;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;

/**
 * Rhino specific tab group
 * 
 * @since 1.0
 */
public class RhinoTabGroup extends AbstractLaunchConfigurationTabGroup {

	/**
	 * Constructor
	 */
	public RhinoTabGroup() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog, java.lang.String)
	 */
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		SourceLookupTab stab = new SourceLookupTab();
		CommonTab ctab = new CommonTab();
		setTabs(new ILaunchConfigurationTab[] {
					new RhinoMainTab(),
					new IncludeTab(),
					stab,
					ctab
				}
		);
//		PlatformUI.getWorkbench().getHelpSystem().setHelp(stab.getControl(),IHelpConstants.SOURCE_TAB_CONTEXT);
//		PlatformUI.getWorkbench().getHelpSystem().setHelp(ctab.getControl(),IHelpConstants.COMMON_TAB_CONTEXT);
	}
}

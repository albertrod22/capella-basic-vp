/******************************************************************************
* Copyright (c) 2006, 2016 Thales Global Services 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *    Thales - initial API and implementation
*****************************************************************************/
// Generated on 20.08.2015 at 04:49:15 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.price.design.service.edges;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.capella.vp.price.design.service.nodes.PriceLevelHelper;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[org.polarsys.capella.vp.price.design.service.edges.LinkPC_PriceNode_Service]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class LinkPC_PriceNode_Service {
	/**
	 * @generated NOT
	 */
	private PriceLevelHelper maPriceHelper = new PriceLevelHelper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject : the current semantic object
	 * @param view : the current view
	 * @param container : the semantic container of the current object
	 * @generated NOT
	 */
	public boolean isPriceSaturated(EObject eObject, EObject view, EObject container) {
		return maPriceHelper.isPriceSaturated(eObject, view, container);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject : the current semantic object
	 * @param view : the current view
	 * @param container : the semantic container of the current object
	 * @generated NOT
	 */
	public boolean isPriceOverhead(EObject eObject, EObject view, EObject container) {
		return maPriceHelper.isPriceOverhead(eObject, view, container);
	}
}
/*******************************************************************************
 * Copyright (c) 2018 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.filtering.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.filtering.CreationDefaultFilteringCriterionSet;

/**
 * @generated
 */
public class CreationDefaultFilteringCriterionSetHelper {

	private static final CreationDefaultFilteringCriterionSetHelper instance = new CreationDefaultFilteringCriterionSetHelper();

	/**
	 * @generated
	 */
	public static CreationDefaultFilteringCriterionSetHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(CreationDefaultFilteringCriterionSet object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}
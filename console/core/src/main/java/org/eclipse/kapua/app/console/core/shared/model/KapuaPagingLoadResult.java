/*******************************************************************************
 * Copyright (c) 2017, 2021 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.app.console.core.shared.model;

import java.util.Stack;

import com.extjs.gxt.ui.client.data.PagingLoadResult;
import org.eclipse.kapua.app.console.module.api.shared.model.KapuaBasePagingCursor;

public interface KapuaPagingLoadResult<Data> extends PagingLoadResult<Data> {

    public int getVirtualOffset();

    public void setVirtualOffset(int offset);

    public Stack<KapuaBasePagingCursor> getCursorOffset();

    public int getLastOffset();
}

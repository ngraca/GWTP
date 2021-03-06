/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.rest.client.testutils;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.client.parameters.HttpParameterFactory;
import com.gwtplatform.dispatch.rest.shared.DateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.HttpParameter.Type;

/**
 * Used by test code to expose protected methods from {@link com.gwtplatform.dispatch.rest.client.AbstractRestAction
 * AbstractRestAction}. The goal is to help clean up the test code.
 */
public abstract class ExposedRestAction<R> extends AbstractRestAction<R> {
    protected ExposedRestAction(
            HttpParameterFactory factory,
            HttpMethod httpMethod,
            String rawServicePath) {
        super(factory, DateFormat.DEFAULT, httpMethod, rawServicePath);
    }

    @Override
    public void setBodyParam(Object value) {
        super.setBodyParam(value);
    }

    @Override
    public void addParam(Type type, String name, Object value) {
        super.addParam(type, name, value);
    }
}

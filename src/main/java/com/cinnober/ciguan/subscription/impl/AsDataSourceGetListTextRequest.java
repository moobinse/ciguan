/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Cinnober Financial Technology AB (cinnober.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.cinnober.ciguan.subscription.impl;

import com.cinnober.ciguan.client.MvcModelAttributesIf;
import com.cinnober.ciguan.data.CwfMessage;
import com.cinnober.ciguan.subscription.AsDataSourceGetListTextRequestIf;

/**
 * Structured wrapper for a data source list text request
 */
public class AsDataSourceGetListTextRequest extends AsRequest
    implements AsDataSourceGetListTextRequestIf, MvcModelAttributesIf {

    public AsDataSourceGetListTextRequest(CwfMessage pMessage) {
        super(pMessage);
    }

    @Override
    public String getDataSourceId() {
        return getData().getProperty(ATTR_DATASOURCE_ID);
    }

    @Override
    public String getKey() {
        return getData().getProperty(ATTR_KEY);
    }

}

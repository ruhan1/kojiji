/**
 * Copyright (C) 2015 Red Hat, Inc. (jcasey@redhat.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.red.build.koji.model.xmlrpc;

import java.util.List;

import org.commonjava.rwx.anno.DataKey;
import org.commonjava.rwx.anno.StructPart;

@StructPart
public class KojiMultiCallFault
{
    @DataKey( "faultCode" )
    private Integer faultCode;

    @DataKey( "faultString" )
    private String faultString;

    @DataKey( "traceback" )
    private List<String> traceback;

    public KojiMultiCallFault()
    {

    }

    public KojiMultiCallFault( Integer faultCode )
    {
        this.faultCode = faultCode;
    }

    public Integer getFaultCode()
    {
        return faultCode;
    }

    public void setFaultCode( Integer faultCode )
    {
        this.faultCode = faultCode;
    }

    public String getFaultString()
    {
        return faultString;
    }

    public void setFaultString( String faultString )
    {
        this.faultString = faultString;
    }

    public List<String> getTraceback()
    {
        return traceback;
    }

    public void setTraceback( List<String> traceback )
    {
        this.traceback = traceback;
    }
}

/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.carproject.components.tklistcar;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class tklistcar__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_model = bindings.get("model");
Object _dynamic_item = bindings.get("item");
out.write("<!--<div data-sly-use.model=\"com.carproject.core.models.CarFilterModel\">-->\r\n<!--    <h2>Cars</h2>-->\r\n");
{
    String var_0 = (("<!--    <div data-sly-list=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_model, "filteredCars"), "comment"))) + "\">-->");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("\r\n<!--        <div>-->\r\n<!--            <div>-->\r\n");
{
    String var_1 = (("<!--                <h3>" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "brand"), "comment"))) + "</h3>-->");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("\r\n<!--            </div>-->\r\n<!--            <div>-->\r\n");
{
    String var_2 = (("<!--                <p>" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "description"), "comment"))) + " </p>-->");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("\r\n");
{
    String var_3 = (("<!--                <p>Model: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "model"), "comment"))) + " </p>-->");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("\r\n");
{
    String var_4 = (("<!--                <p>Kmj: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "km"), "comment"))) + " </p>-->");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("\r\n");
{
    String var_5 = (("<!--                <p>Year: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "year"), "comment"))) + " </p>-->");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("\r\n<!--            </div>-->\r\n<!--        </div>-->\r\n<!--    </div>-->\r\n<!--</div>-->\r\n<h1>Cars</h1>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


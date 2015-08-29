/*
 * Copyright 2015 Gamma Associates Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.pvanassen.highchart.api;

import nl.pvanassen.highchart.api.plotoption.PlotOptionsSeries;
import nl.pvanassen.highchart.api.utils.JsonArray;

/**
 *
 * @author shaun.lefeuvre
 */
public class BoxPlotSeries
    extends PlotOptionsSeries {
    
    private JsonArray<JsonArray<Double>> data;
    private String name;
    
    public BoxPlotSeries addBoxPlotData(
            final int series, 
            final Double value) {
        if(this.data == null) {
            this.data = new JsonArray<JsonArray<Double>>();
        }
        while(this.data.size() <= series) {
            this.data.add(new JsonArray<Double>());
        }
        this.data.get(series).add(value);
        return this;
    }
    
    public String getName() {
        return this.name;
    }
    
    public BoxPlotSeries setName(
            final String name) {
        this.name = name;
        return this;
    }
}

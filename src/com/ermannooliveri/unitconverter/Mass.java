/*
 * Copyright 2022 Ermanno Oliveri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ermannooliveri.unitconverter;

public class Mass {

    public Mass(){

    }

    /**
     * convert ounce to gram
     * @param ounce ounce
     * @return gram
     */
    public double fromOunceToGram(double ounce){
        return ounce / 0.035274;
    }

    /**
     * convert gram to ounce
     * @param gram gram
     * @return ounce
     */
    public double fromGramToOunce(double gram){
        return gram * 0.035274;
    }

    /**
     * convert kg to pound
     * @param kg kg
     * @return pound
     */
    public double fromKgToPound(double kg){
        return kg * 2.2046;
    }

    /**
     * convert pound to kg
     * @param pound pound
     * @return kg
     */
    public double fromPoundToKg(double pound){
        return pound / 2.2046;
    }
}

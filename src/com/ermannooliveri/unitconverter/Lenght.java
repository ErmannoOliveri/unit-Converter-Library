/*
 * Copyright 2021 Ermanno Oliveri
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

public class Lenght {


    public Lenght(){

    }
    /**
     * convert kilometer in miles
     * @param km kilometer
     * @return miles
     */
    static public double fromKmToMiles(double km){
        return km * 0.62137;
    }

    /**
     * convert miles in kilometer
     * @param miles miles
     * @return km
     */
    static public double fromMilesToKm(double miles){
        return miles / 0.62137;
    }

    /**
     * convert inch to centimeters
     * @param inch inch
     * @return centimeters
     */
    static public double fromInchToCm(double inch){
        return inch / 0.39370;
    }

    /**
     * convert centimeters to inch
     * @param cm centimeter
     * @return inch
     */
    static public double fromCmToInch(double cm){
        return cm * 0.39370;
    }

    /**
     * convert foot to meter
     * @param foot foot
     * @return meter
     */
    static public double fromFootToMeter(double foot){
        return foot / 3.2808;
    }

    /**
     * convert meter to foot
     * @param meter meter
     * @return foot
     */
    static public double fromMeterToFoot(double meter){
        return meter * 3.2808;
    }

    /**
     * convert meter to yard
     * @param meter meter
     * @return yard
     */
    static public double fromMeterToYard(double meter){
        return meter * 1.0936;
    }

    /**
     * convert yard to meter
     * @param yard yard
     * @return meter
     */
    static public double fromYardToMeter(double yard){
        return yard / 1.0936;
    }
}

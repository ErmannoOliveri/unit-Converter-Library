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

public class Surface {

    public Surface(){
    }


    /**
     * convert Square Inches to square centimeters
     * @param squareInches square inches
     * @return square centimeters
     */
    public double fromSquareInchesToSquareCm(double squareInches){
        return squareInches / 0.15500;
    }

    /**
     * convert square centimeters to square inches
     * @param squareCm square centimeters
     * @return square inches
     */
    public double fromSquareCmToSquareInches(double squareCm){
        return squareCm * 0.15500;
    }

    /**
     * convert square meter to square feet
     * @param squareMeter square meter
     * @return square feet
     */
    public double fromSquareMeterToSquareFeet(double squareMeter){
        return squareMeter * 10.764;
    }

    /**
     * convert square feet to square meter
     * @param squareFeet square feet
     * @return square meters
     */
    public double fromSquareFeetToSquareMeter(double squareFeet){
        return squareFeet / 10.764;
    }

    /**
     * convert square miles to square km
     * @param squareMiles square miles
     * @return square kilometers
     */
    public double fromSquareMilesToSquareKm(double squareMiles){
        return squareMiles / 0.38610;
    }

    /**
     * convert square km to square miles
     * @param squareKm square kilometers
     * @return square miles
     */
    public double fromSquareKmToSquareMiles(double squareKm){
        return squareKm * 0.38610;
    }

    /**
     * convert hectares to acre
     * @param hectares hectares
     * @return acre
     */
    public double fromHectaresToAcre(double hectares){
        return hectares / 0.40468726;
    }

    /**
     * conevrt acre to hectares
     * @param acre acre
     * @return hectares
     */
    public double fromAcreToHectares(double acre){
        return acre * 0.40468726;
    }
}

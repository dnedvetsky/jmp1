package com.tools;

import com.heresysystemfunctionality.charsheet.CharsheetHeresy;

/**
 * Created by Dmitry on 11.07.2016.
 */
public class PrintCharsheet {
    public static void printHeresyCharsheet(CharsheetHeresy charsheet) {
        System.out.println(charsheet.getAttributes().toString());
        System.out.println(charsheet.getTalents().toString());
        System.out.println("-=================================-");
    }
}

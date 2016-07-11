package com.mainfunctionality;

import com.heresysystemfunctionality.chargenutils.HeresyChargen;
import com.heresysystemfunctionality.charsheet.CharsheetHeresy;
import com.tools.PrintCharsheet;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        HeresyChargen chargen = new HeresyChargen();
        CharsheetHeresy charsheet1 = chargen.generateCharacter();
        charsheet1.addTalent("Name1");
        CharsheetHeresy charsheet2 = chargen.generateCharacter();
        charsheet2.addTalent("Name2");
        PrintCharsheet.printHeresyCharsheet(charsheet1);
        PrintCharsheet.printHeresyCharsheet(charsheet2);
    }
}


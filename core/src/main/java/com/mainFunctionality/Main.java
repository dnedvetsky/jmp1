package com.mainFunctionality;

import chargenUtils.HeresyChargen;
import com.Heresy.charsheet.CharsheetHeresy;

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
        System.out.println(charsheet1.getAttributes().toString());
        System.out.println(charsheet1.getTalents().toString());
        System.out.println("-=================================-");
        System.out.println(charsheet2.getAttributes().toString());
        System.out.println(charsheet2.getTalents().toString());
    }
}


package com.coreFuncionality.data;

/**
 * Created by Dmitry on 09.07.2016.
 */
public class CommonCharsheet {
    private int str;
    private int wis;
    private int dex;
    private int con;

    public CommonCharsheet(int str, int wis, int dex, int con) {
        this.str = str;
        this.wis = wis;
        this.dex = dex;
        this.con = con;
    }


    protected int getCon() {
        return con;
    }

    protected int getDex() {
        return dex;
    }

    protected int getWis() {
        return wis;
    }

    protected int getStr() {
        return str;
    }
}

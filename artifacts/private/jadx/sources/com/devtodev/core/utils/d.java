package com.devtodev.core.utils;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static double a(double d10, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        double dPow = (long) Math.pow(10.0d, i10);
        return Math.round(d10 * dPow) / dPow;
    }
}

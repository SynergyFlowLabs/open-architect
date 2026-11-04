package com.google.gson.internal;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f125485a = 10000;

    private e0() {
    }

    private static void a(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static BigDecimal b(String str) throws NumberFormatException {
        a(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: " + str);
    }

    public static BigInteger c(String str) throws NumberFormatException {
        a(str);
        return new BigInteger(str);
    }
}

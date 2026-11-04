package com.ionspin.kotlin.bignum.integer.util;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final int a(char c10, int i10) {
        int i11;
        int i12;
        if ('0' <= c10 && c10 < ':') {
            i12 = (char) (c10 - '0');
        } else if ('a' <= c10 && c10 < '{') {
            i12 = c10 - 87;
        } else if ('A' > c10 || c10 >= '[') {
            if (65313 <= c10 && c10 < 65339) {
                i11 = 65323;
            } else {
                if (65345 > c10 || c10 >= 65371) {
                    if (c10 != '.') {
                        throw new NumberFormatException("Invalid digit for radix " + c10);
                    }
                    throw new NumberFormatException("Invalid digit for radix " + c10 + " (Possibly a decimal value, which is not supported by BigInteger parser");
                }
                i11 = 65355;
            }
            i12 = c10 - i11;
        } else {
            i12 = c10 - 55;
        }
        if (i12 >= 0 && i12 < i10) {
            return i12;
        }
        throw new NumberFormatException(c10 + " is not a valid digit for number system with base " + i10);
    }

    public static /* synthetic */ int b(char c10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 10;
        }
        return a(c10, i10);
    }
}

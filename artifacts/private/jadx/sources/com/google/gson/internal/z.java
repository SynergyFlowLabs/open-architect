package com.google.gson.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f125553a = a();

    private z() {
    }

    private static int a() {
        return f(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb2.append(cCharAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return f125553a;
    }

    public static boolean d() {
        return f125553a >= 9;
    }

    private static int e(String str) {
        try {
            String[] strArrSplit = str.split("[._]", 3);
            int i10 = 4 >> 0;
            int i11 = Integer.parseInt(strArrSplit[0]);
            return (i11 != 1 || strArrSplit.length <= 1) ? i11 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int f(String str) {
        int iE = e(str);
        if (iE == -1) {
            iE = b(str);
        }
        if (iE == -1) {
            return 6;
        }
        return iE;
    }
}

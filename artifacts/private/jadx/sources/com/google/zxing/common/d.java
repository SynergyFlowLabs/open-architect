package com.google.zxing.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public enum d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, l.f130348c, "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f130310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f130311b;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final Map<Integer, d> f130295j3 = new HashMap();

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final Map<String, d> f130297k3 = new HashMap();

    static {
        for (d dVar : values()) {
            for (int i10 : dVar.f130310a) {
                f130295j3.put(Integer.valueOf(i10), dVar);
            }
            f130297k3.put(dVar.name(), dVar);
            for (String str : dVar.f130311b) {
                f130297k3.put(str, dVar);
            }
        }
    }

    d(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    public static d b(String str) {
        return f130297k3.get(str);
    }

    public static d c(int i10) throws com.google.zxing.h {
        if (i10 < 0 || i10 >= 900) {
            throw com.google.zxing.h.a();
        }
        return f130295j3.get(Integer.valueOf(i10));
    }

    public int k() {
        return this.f130310a[0];
    }

    d(int i10, String... strArr) {
        this.f130310a = new int[]{i10};
        this.f130311b = strArr;
    }

    d(int[] iArr, String... strArr) {
        this.f130310a = iArr;
        this.f130311b = strArr;
    }
}

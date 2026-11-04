package com.google.api.client.util.escape;

import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes4.dex */
public class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f116056d = "-_.*";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f116057e = "-_.!~*'()@:$&,;=";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f116058f = "-_.!~*'()@:$&,;=+/?";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f116059g = "-_.!~*'():$&,;=";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f116060h = "-_.!~*'()@:$,;/?:";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char[] f116061i = {'+'};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f116062j = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f116063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f116064c;

    public c(String str, boolean z10) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        if (z10 && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        this.f116063b = z10;
        this.f116064c = g(str);
    }

    private static boolean[] g(String str) {
        char[] charArray = str.toCharArray();
        int iMax = 122;
        for (char c10 : charArray) {
            iMax = Math.max((int) c10, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (int i10 = 48; i10 <= 57; i10++) {
            zArr[i10] = true;
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            zArr[i11] = true;
        }
        for (int i12 = 97; i12 <= 122; i12++) {
            zArr[i12] = true;
        }
        for (char c11 : charArray) {
            zArr[c11] = true;
        }
        return zArr;
    }

    @Override // com.google.api.client.util.escape.e, com.google.api.client.util.escape.b
    public String a(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            boolean[] zArr = this.f116064c;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return d(str, i10);
            }
        }
        return str;
    }

    @Override // com.google.api.client.util.escape.e
    protected char[] c(int i10) {
        boolean[] zArr = this.f116064c;
        if (i10 < zArr.length && zArr[i10]) {
            return null;
        }
        if (i10 == 32 && this.f116063b) {
            return f116061i;
        }
        if (i10 <= 127) {
            char[] cArr = f116062j;
            return new char[]{'%', cArr[i10 >>> 4], cArr[i10 & 15]};
        }
        if (i10 <= 2047) {
            char[] cArr2 = f116062j;
            return new char[]{'%', cArr2[(i10 >>> 10) | 12], cArr2[(i10 >>> 6) & 15], '%', cArr2[((i10 >>> 4) & 3) | 8], cArr2[i10 & 15]};
        }
        if (i10 <= 65535) {
            char[] cArr3 = f116062j;
            return new char[]{'%', 'E', cArr3[i10 >>> 12], '%', cArr3[((i10 >>> 10) & 3) | 8], cArr3[(i10 >>> 6) & 15], '%', cArr3[((i10 >>> 4) & 3) | 8], cArr3[i10 & 15]};
        }
        if (i10 <= 1114111) {
            char[] cArr4 = f116062j;
            return new char[]{'%', l.f338157g, cArr4[(i10 >>> 18) & 7], '%', cArr4[((i10 >>> 16) & 3) | 8], cArr4[(i10 >>> 12) & 15], '%', cArr4[((i10 >>> 10) & 3) | 8], cArr4[(i10 >>> 6) & 15], '%', cArr4[((i10 >>> 4) & 3) | 8], cArr4[i10 & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + i10);
    }

    @Override // com.google.api.client.util.escape.e
    protected int f(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            boolean[] zArr = this.f116064c;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i10++;
        }
        return i10;
    }
}

package com.google.common.net;

import com.google.common.base.j0;

/* JADX INFO: loaded from: classes5.dex */
@a
@com.google.common.annotations.b
public final class k extends com.google.common.escape.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f119676e = {'+'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char[] f119677f = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f119679d;

    public k(String safeChars, boolean plusForSpace) {
        j0.E(safeChars);
        if (safeChars.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String str = safeChars + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (plusForSpace && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f119678c = plusForSpace;
        this.f119679d = h(str);
    }

    private static boolean[] h(String safeChars) {
        char[] charArray = safeChars.toCharArray();
        int iMax = -1;
        for (char c10 : charArray) {
            iMax = Math.max((int) c10, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c11 : charArray) {
            zArr[c11] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.l, com.google.common.escape.h
    public String b(String s10) {
        int i10;
        j0.E(s10);
        int length = s10.length();
        while (i10 < length) {
            char cCharAt = s10.charAt(i10);
            boolean[] zArr = this.f119679d;
            i10 = (cCharAt < zArr.length && zArr[cCharAt]) ? i10 + 1 : 0;
            return e(s10, i10);
        }
        return s10;
    }

    @Override // com.google.common.escape.l
    @fj.a
    protected char[] d(int cp) {
        boolean[] zArr = this.f119679d;
        if (cp < zArr.length && zArr[cp]) {
            return null;
        }
        if (cp == 32 && this.f119678c) {
            return f119676e;
        }
        if (cp <= 127) {
            char[] cArr = f119677f;
            return new char[]{'%', cArr[cp >>> 4], cArr[cp & 15]};
        }
        if (cp <= 2047) {
            char[] cArr2 = f119677f;
            return new char[]{'%', cArr2[(cp >>> 10) | 12], cArr2[(cp >>> 6) & 15], '%', cArr2[((cp >>> 4) & 3) | 8], cArr2[cp & 15]};
        }
        if (cp <= 65535) {
            char[] cArr3 = f119677f;
            return new char[]{'%', 'E', cArr3[cp >>> 12], '%', cArr3[((cp >>> 10) & 3) | 8], cArr3[(cp >>> 6) & 15], '%', cArr3[((cp >>> 4) & 3) | 8], cArr3[cp & 15]};
        }
        if (cp <= 1114111) {
            char[] cArr4 = f119677f;
            return new char[]{'%', org.locationtech.jts.geom.l.f338157g, cArr4[(cp >>> 18) & 7], '%', cArr4[((cp >>> 16) & 3) | 8], cArr4[(cp >>> 12) & 15], '%', cArr4[((cp >>> 10) & 3) | 8], cArr4[(cp >>> 6) & 15], '%', cArr4[((cp >>> 4) & 3) | 8], cArr4[cp & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + cp);
    }

    @Override // com.google.common.escape.l
    protected int g(CharSequence csq, int index, int end) {
        j0.E(csq);
        while (index < end) {
            char cCharAt = csq.charAt(index);
            boolean[] zArr = this.f119679d;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            index++;
        }
        return index;
    }
}

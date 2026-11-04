package com.google.android.gms.common.util;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
@g6.a
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f106969a = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', org.locationtech.jts.geom.l.f338157g};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f106970b = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', ni.f.f333369f, 'e', 'f'};

    @NonNull
    @g6.a
    public static String a(@NonNull byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            char[] cArr2 = f106970b;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & com.google.common.base.c.f116464q];
            i10 += 2;
        }
        return new String(cArr);
    }

    @NonNull
    @g6.a
    public static String b(@NonNull byte[] bArr) {
        return c(bArr, false);
    }

    @NonNull
    @g6.a
    public static String c(@NonNull byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length && (!z10 || i10 != length - 1 || (bArr[i10] & 255) != 0); i10++) {
            char[] cArr = f106969a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & com.google.common.base.c.f116464q]);
        }
        return sb2.toString();
    }

    @NonNull
    @g6.a
    public static byte[] d(@NonNull String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
            i10 = i11;
        }
        return bArr;
    }
}

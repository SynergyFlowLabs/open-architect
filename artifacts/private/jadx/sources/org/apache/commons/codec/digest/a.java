package org.apache.commons.codec.digest;

import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f335230a = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    a() {
    }

    static void a(byte b10, byte b11, byte b12, int i10, StringBuilder sb2) {
        int i11 = ((b10 << com.google.common.base.c.f116465r) & 16777215) | ((b11 << 8) & 65535) | (b12 & 255);
        while (true) {
            int i12 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            sb2.append(f335230a.charAt(i11 & 63));
            i11 >>= 6;
            i10 = i12;
        }
    }

    static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 <= i10; i11++) {
            sb2.append(f335230a.charAt(new Random().nextInt(64)));
        }
        return sb2.toString();
    }
}

package com.google.android.gms.internal.common;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class e0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f107967a;

    e0(char c10) {
        this.f107967a = c10;
    }

    @Override // com.google.android.gms.internal.common.h0
    public final boolean a(char c10) {
        return c10 == this.f107967a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = this.f107967a;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}

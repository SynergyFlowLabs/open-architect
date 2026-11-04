package com.squareup.moshi;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f267192a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f267193b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f267194c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f267195d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f267196e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f267197f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f267198g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f267199h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f267200i = 9;

    private n() {
    }

    static String a(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(iArr2[i11]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }
}

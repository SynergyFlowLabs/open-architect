package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes4.dex */
public final class n {
    static Object[] a(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException("at index " + i11);
            }
        }
        return objArr;
    }
}

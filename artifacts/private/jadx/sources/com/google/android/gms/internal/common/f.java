package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f107968a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f107969b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f107970c;

    f(int i10) {
    }

    public final f a(Object obj) {
        int i10;
        obj.getClass();
        int length = this.f107968a.length;
        int i11 = this.f107969b;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
        }
        if (i10 > length || this.f107970c) {
            this.f107968a = Arrays.copyOf(this.f107968a, i10);
            this.f107970c = false;
        }
        Object[] objArr = this.f107968a;
        int i13 = this.f107969b;
        this.f107969b = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}

package com.badlogic.gdx.utils;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static x0 f95858b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t0 f95859a;

    private <T> int a(T[] tArr, Comparator<T> comparator, int i10) {
        int i11 = 0;
        for (int i12 = 1; i12 < i10; i12++) {
            if (comparator.compare(tArr[i12], tArr[i11]) > 0) {
                i11 = i12;
            }
        }
        return i11;
    }

    private <T> int b(T[] tArr, Comparator<T> comparator, int i10) {
        int i11 = 0;
        for (int i12 = 1; i12 < i10; i12++) {
            if (comparator.compare(tArr[i12], tArr[i11]) < 0) {
                i11 = i12;
            }
        }
        return i11;
    }

    public static x0 c() {
        if (f95858b == null) {
            f95858b = new x0();
        }
        return f95858b;
    }

    public <T> T d(T[] tArr, Comparator<T> comparator, int i10, int i11) {
        return tArr[e(tArr, comparator, i10, i11)];
    }

    public <T> int e(T[] tArr, Comparator<T> comparator, int i10, int i11) {
        if (i11 < 1) {
            throw new t("cannot select from empty array (size < 1)");
        }
        if (i10 > i11) {
            throw new t("Kth rank is larger than size. k: " + i10 + ", size: " + i11);
        }
        if (i10 == 1) {
            return b(tArr, comparator, i11);
        }
        if (i10 == i11) {
            return a(tArr, comparator, i11);
        }
        if (this.f95859a == null) {
            this.f95859a = new t0();
        }
        return this.f95859a.d(tArr, comparator, i10, i11);
    }
}

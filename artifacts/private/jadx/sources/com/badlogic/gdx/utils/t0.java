package com.badlogic.gdx.utils;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class t0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T[] f95754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Comparator<? super T> f95755b;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r6.f95755b.compare(r3, r0) > 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r6.f95755b.compare(r1, r0) > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(int r7, int r8) {
        /*
            r6 = this;
            java.lang.String r5 = "Androeed.ru"
            T[] r0 = r6.f95754a
            r1 = r0[r7]
            int r2 = r7 + r8
            int r2 = r2 / 2
            r3 = r0[r2]
            r5 = 4
            r0 = r0[r8]
            r5 = 6
            java.util.Comparator<? super T> r4 = r6.f95755b
            int r4 = r4.compare(r1, r3)
            if (r4 <= 0) goto L2c
            java.util.Comparator<? super T> r4 = r6.f95755b
            int r3 = r4.compare(r3, r0)
            if (r3 <= 0) goto L21
            goto L40
        L21:
            java.util.Comparator<? super T> r6 = r6.f95755b
            r5 = 3
            int r6 = r6.compare(r1, r0)
            r5 = 7
            if (r6 <= 0) goto L35
            goto L3e
        L2c:
            java.util.Comparator<? super T> r4 = r6.f95755b
            int r1 = r4.compare(r1, r0)
            r5 = 5
            if (r1 <= 0) goto L36
        L35:
            return r7
        L36:
            java.util.Comparator<? super T> r6 = r6.f95755b
            int r6 = r6.compare(r3, r0)
            if (r6 <= 0) goto L40
        L3e:
            r5 = 3
            return r8
        L40:
            r5 = 7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.t0.a(int, int):int");
    }

    private int b(int i10, int i11, int i12) {
        T t10 = this.f95754a[i12];
        e(i11, i12);
        int i13 = i10;
        while (i10 < i11) {
            if (this.f95755b.compare(this.f95754a[i10], t10) < 0) {
                e(i13, i10);
                i13++;
            }
            i10++;
        }
        e(i11, i13);
        return i13;
    }

    private int c(int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        int iB = b(i10, i11, a(i10, i11));
        int i13 = (iB - i10) + 1;
        if (i13 == i12) {
            return iB;
        }
        return i12 < i13 ? c(i10, iB - 1, i12) : c(iB + 1, i11, i12 - i13);
    }

    private void e(int i10, int i11) {
        T[] tArr = this.f95754a;
        T t10 = tArr[i10];
        tArr[i10] = tArr[i11];
        tArr[i11] = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int d(T[] tArr, Comparator<T> comparator, int i10, int i11) {
        this.f95754a = tArr;
        this.f95755b = comparator;
        return c(0, i11 - 1, i10);
    }
}

package com.badlogic.gdx.utils.compression.rangecoder;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    short[] f95429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95430b;

    public b(int i10) {
        this.f95430b = i10;
        this.f95429a = new short[1 << i10];
    }

    public static void e(short[] sArr, int i10, d dVar, int i11, int i12) throws IOException {
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i12 & 1;
            dVar.a(sArr, i10 + i13, i15);
            i13 = (i13 << 1) | i15;
            i12 >>= 1;
        }
    }

    public static int g(short[] sArr, int i10, int i11, int i12) {
        int iE = 0;
        int i13 = 1;
        while (i11 != 0) {
            int i14 = i12 & 1;
            i12 >>>= 1;
            iE += d.e(sArr[i10 + i13], i14);
            i13 = (i13 << 1) | i14;
            i11--;
        }
        return iE;
    }

    public void a(d dVar, int i10) throws IOException {
        int i11 = this.f95430b;
        int i12 = 1;
        while (i11 != 0) {
            i11--;
            int i13 = (i10 >>> i11) & 1;
            dVar.a(this.f95429a, i12, i13);
            i12 = (i12 << 1) | i13;
        }
    }

    public int b(int i10) {
        int i11 = this.f95430b;
        int iE = 0;
        int i12 = 1;
        while (i11 != 0) {
            i11--;
            int i13 = (i10 >>> i11) & 1;
            iE += d.e(this.f95429a[i12], i13);
            i12 = (i12 << 1) + i13;
        }
        return iE;
    }

    public void c() {
        c.d(this.f95429a);
    }

    public void d(d dVar, int i10) throws IOException {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f95430b; i12++) {
            int i13 = i10 & 1;
            dVar.a(this.f95429a, i11, i13);
            i11 = (i11 << 1) | i13;
            i10 >>= 1;
        }
    }

    public int f(int i10) {
        int iE = 0;
        int i11 = 1;
        for (int i12 = this.f95430b; i12 != 0; i12--) {
            int i13 = i10 & 1;
            i10 >>>= 1;
            iE += d.e(this.f95429a[i11], i13);
            i11 = (i11 << 1) | i13;
        }
        return iE;
    }
}

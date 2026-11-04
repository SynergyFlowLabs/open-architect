package com.badlogic.gdx.utils.compression.rangecoder;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    short[] f95427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95428b;

    public a(int i10) {
        this.f95428b = i10;
        this.f95427a = new short[1 << i10];
    }

    public static int d(short[] sArr, int i10, c cVar, int i11) throws IOException {
        int i12 = 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int iA = cVar.a(sArr, i10 + i12);
            i12 = (i12 << 1) + iA;
            i13 |= iA << i14;
        }
        return i13;
    }

    public int a(c cVar) throws IOException {
        int iA = 1;
        for (int i10 = this.f95428b; i10 != 0; i10--) {
            iA = cVar.a(this.f95427a, iA) + (iA << 1);
        }
        return iA - (1 << this.f95428b);
    }

    public void b() {
        c.d(this.f95427a);
    }

    public int c(c cVar) throws IOException {
        int i10 = 1;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f95428b; i12++) {
            int iA = cVar.a(this.f95427a, i10);
            i10 = (i10 << 1) + iA;
            i11 |= iA << i12;
        }
        return i11;
    }
}

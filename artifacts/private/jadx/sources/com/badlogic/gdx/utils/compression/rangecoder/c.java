package com.badlogic.gdx.utils.compression.rangecoder;

import androidx.media3.exoplayer.audio.s0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f95431d = -16777216;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f95432e = 11;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f95433f = 2048;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f95434g = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f95435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    InputStream f95437c;

    public static void d(short[] sArr) {
        for (int i10 = 0; i10 < sArr.length; i10++) {
            sArr[i10] = s0.f63371y;
        }
    }

    public int a(short[] sArr, int i10) throws IOException {
        short s10 = sArr[i10];
        int i11 = this.f95435a;
        int i12 = (i11 >>> 11) * s10;
        int i13 = this.f95436b;
        if ((i13 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i12)) {
            this.f95435a = i12;
            sArr[i10] = (short) (s10 + ((2048 - s10) >>> 5));
            if ((i12 & (-16777216)) == 0) {
                this.f95436b = (i13 << 8) | this.f95437c.read();
                this.f95435a <<= 8;
            }
            return 0;
        }
        int i14 = i11 - i12;
        this.f95435a = i14;
        int i15 = i13 - i12;
        this.f95436b = i15;
        sArr[i10] = (short) (s10 - (s10 >>> 5));
        if ((i14 & (-16777216)) != 0) {
            return 1;
        }
        this.f95436b = (i15 << 8) | this.f95437c.read();
        this.f95435a <<= 8;
        return 1;
    }

    public final int b(int i10) throws IOException {
        int i11 = 0;
        while (i10 != 0) {
            int i12 = this.f95435a >>> 1;
            this.f95435a = i12;
            int i13 = this.f95436b;
            int i14 = (i13 - i12) >>> 31;
            int i15 = i13 - ((i14 - 1) & i12);
            this.f95436b = i15;
            i11 = (i11 << 1) | (1 - i14);
            if ((i12 & (-16777216)) == 0) {
                this.f95436b = (i15 << 8) | this.f95437c.read();
                this.f95435a <<= 8;
            }
            i10--;
        }
        return i11;
    }

    public final void c() throws IOException {
        this.f95436b = 0;
        this.f95435a = -1;
        for (int i10 = 0; i10 < 5; i10++) {
            this.f95436b = (this.f95436b << 8) | this.f95437c.read();
        }
    }

    public final void e() {
        this.f95437c = null;
    }

    public final void f(InputStream inputStream) {
        this.f95437c = inputStream;
    }
}

package com.badlogic.gdx.utils.compression.rangecoder;

import androidx.media3.exoplayer.audio.s0;
import com.rabbitmq.client.k0;
import com.rabbitmq.client.r;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f95438g = -16777216;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f95439h = 11;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f95440i = 2048;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f95441j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f95442k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f95443l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int[] f95444m = new int[512];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    OutputStream f95445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f95446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f95447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f95450f;

    static {
        for (int i10 = 8; i10 >= 0; i10--) {
            int i11 = 8 - i10;
            int i12 = 1 << (9 - i10);
            for (int i13 = 1 << i11; i13 < i12; i13++) {
                f95444m[i13] = (i10 << 6) + (((i12 - i13) << 6) >>> i11);
            }
        }
    }

    public static int e(int i10, int i11) {
        return f95444m[(((i10 - i11) ^ (-i11)) & r.f265987x3) >>> 2];
    }

    public static int f(int i10) {
        return f95444m[i10 >>> 2];
    }

    public static int g(int i10) {
        return f95444m[(2048 - i10) >>> 2];
    }

    public static void j(short[] sArr) {
        for (int i10 = 0; i10 < sArr.length; i10++) {
            sArr[i10] = s0.f63371y;
        }
    }

    public void a(short[] sArr, int i10, int i11) throws IOException {
        short s10 = sArr[i10];
        int i12 = this.f95447c;
        int i13 = (i12 >>> 11) * s10;
        if (i11 == 0) {
            this.f95447c = i13;
            sArr[i10] = (short) (s10 + ((2048 - s10) >>> 5));
        } else {
            this.f95446b += ((long) i13) & k0.f265952a;
            this.f95447c = i12 - i13;
            sArr[i10] = (short) (s10 - (s10 >>> 5));
        }
        int i14 = this.f95447c;
        if (((-16777216) & i14) == 0) {
            this.f95447c = i14 << 8;
            m();
        }
    }

    public void b(int i10, int i11) throws IOException {
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            int i13 = this.f95447c >>> 1;
            this.f95447c = i13;
            if (((i10 >>> i12) & 1) == 1) {
                this.f95446b += (long) i13;
            }
            if (((-16777216) & i13) == 0) {
                this.f95447c = i13 << 8;
                m();
            }
        }
    }

    public void c() throws IOException {
        for (int i10 = 0; i10 < 5; i10++) {
            m();
        }
    }

    public void d() throws IOException {
        this.f95445a.flush();
    }

    public long h() {
        return ((long) this.f95448d) + this.f95450f + 4;
    }

    public void i() {
        this.f95450f = 0L;
        this.f95446b = 0L;
        this.f95447c = -1;
        this.f95448d = 1;
        this.f95449e = 0;
    }

    public void k() {
        this.f95445a = null;
    }

    public void l(OutputStream outputStream) {
        this.f95445a = outputStream;
    }

    public void m() throws IOException {
        long j10 = this.f95446b;
        int i10 = (int) (j10 >>> 32);
        if (i10 != 0 || j10 < 4278190080L) {
            this.f95450f += (long) this.f95448d;
            int i11 = this.f95449e;
            while (true) {
                this.f95445a.write(i11 + i10);
                int i12 = this.f95448d - 1;
                this.f95448d = i12;
                if (i12 == 0) {
                    break;
                } else {
                    i11 = 255;
                }
            }
            this.f95449e = ((int) this.f95446b) >>> 24;
        }
        this.f95448d++;
        this.f95446b = (this.f95446b & 16777215) << 8;
    }
}

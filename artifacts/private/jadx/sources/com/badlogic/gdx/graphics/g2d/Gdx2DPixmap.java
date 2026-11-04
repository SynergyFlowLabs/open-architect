package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.utils.t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class Gdx2DPixmap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f94216g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f94217h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f94218i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f94219j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f94220k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f94221l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f94222m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f94223n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f94224o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f94225p = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f94226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f94228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f94229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ByteBuffer f94230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long[] f94231f;

    static {
        setBlend(1);
        setScale(1);
    }

    public Gdx2DPixmap(byte[] bArr, int i10, int i11, int i12) throws IOException {
        long[] jArr = new long[4];
        this.f94231f = jArr;
        ByteBuffer byteBufferLoad = load(jArr, bArr, i10, i11);
        this.f94230e = byteBufferLoad;
        if (byteBufferLoad == null) {
            throw new IOException("Error loading pixmap: " + getFailureReason());
        }
        long[] jArr2 = this.f94231f;
        this.f94226a = jArr2[0];
        this.f94227b = (int) jArr2[1];
        this.f94228c = (int) jArr2[2];
        int i13 = (int) jArr2[3];
        this.f94229d = i13;
        if (i12 == 0 || i12 == i13) {
            return;
        }
        b(i12);
    }

    private void b(int i10) {
        Gdx2DPixmap gdx2DPixmap = new Gdx2DPixmap(this.f94227b, this.f94228c, i10);
        gdx2DPixmap.f(this, 0, 0, 0, 0, this.f94227b, this.f94228c);
        c();
        this.f94226a = gdx2DPixmap.f94226a;
        this.f94229d = gdx2DPixmap.f94229d;
        this.f94228c = gdx2DPixmap.f94228c;
        this.f94231f = gdx2DPixmap.f94231f;
        this.f94230e = gdx2DPixmap.f94230e;
        this.f94227b = gdx2DPixmap.f94227b;
    }

    private static native void clear(long j10, int i10);

    private static native void drawCircle(long j10, int i10, int i11, int i12, int i13);

    private static native void drawLine(long j10, int i10, int i11, int i12, int i13, int i14);

    private static native void drawPixmap(long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    private static native void drawRect(long j10, int i10, int i11, int i12, int i13, int i14);

    private static native void fillCircle(long j10, int i10, int i11, int i12, int i13);

    private static native void fillRect(long j10, int i10, int i11, int i12, int i13, int i14);

    private static native void fillTriangle(long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    private static native void free(long j10);

    public static native String getFailureReason();

    private static native int getPixel(long j10, int i10, int i11);

    private static native ByteBuffer load(long[] jArr, byte[] bArr, int i10, int i11);

    private static native ByteBuffer newPixmap(long[] jArr, int i10, int i11, int i12);

    public static native void setBlend(int i10);

    private static native void setPixel(long j10, int i10, int i11, int i12);

    public static native void setScale(int i10);

    public static Gdx2DPixmap u(int i10, int i11, int i12) {
        try {
            return new Gdx2DPixmap(i10, i11, i12);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static Gdx2DPixmap v(InputStream inputStream, int i10) {
        try {
            return new Gdx2DPixmap(inputStream, i10);
        } catch (IOException unused) {
            return null;
        }
    }

    public void a(int i10) {
        clear(this.f94226a, i10);
    }

    public void c() {
        free(this.f94226a);
    }

    public void d(int i10, int i11, int i12, int i13) {
        drawCircle(this.f94226a, i10, i11, i12, i13);
    }

    public void e(int i10, int i11, int i12, int i13, int i14) {
        drawLine(this.f94226a, i10, i11, i12, i13, i14);
    }

    public void f(Gdx2DPixmap gdx2DPixmap, int i10, int i11, int i12, int i13, int i14, int i15) {
        drawPixmap(gdx2DPixmap.f94226a, this.f94226a, i10, i11, i14, i15, i12, i13, i14, i15);
    }

    public void g(Gdx2DPixmap gdx2DPixmap, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        drawPixmap(gdx2DPixmap.f94226a, this.f94226a, i10, i11, i12, i13, i14, i15, i16, i17);
    }

    public void h(int i10, int i11, int i12, int i13, int i14) {
        drawRect(this.f94226a, i10, i11, i12, i13, i14);
    }

    public void i(int i10, int i11, int i12, int i13) {
        fillCircle(this.f94226a, i10, i11, i12, i13);
    }

    public void j(int i10, int i11, int i12, int i13, int i14) {
        fillRect(this.f94226a, i10, i11, i12, i13, i14);
    }

    public void k(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        fillTriangle(this.f94226a, i10, i11, i12, i13, i14, i15, i16);
    }

    public int l() {
        return this.f94229d;
    }

    public String m() {
        switch (this.f94229d) {
            case 1:
                return "alpha";
            case 2:
                return "luminance alpha";
            case 3:
                return "rgb888";
            case 4:
                return "rgba8888";
            case 5:
                return "rgb565";
            case 6:
                return "rgba4444";
            default:
                return "unknown";
        }
    }

    public int n() {
        return o();
    }

    public int o() {
        switch (this.f94229d) {
            case 1:
                return 6406;
            case 2:
                return 6410;
            case 3:
            case 5:
                return 6407;
            case 4:
            case 6:
                return 6408;
            default:
                throw new t("unknown format: " + this.f94229d);
        }
    }

    public int p() {
        switch (this.f94229d) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 5121;
            case 5:
                return 33635;
            case 6:
                return 32819;
            default:
                throw new t("unknown format: " + this.f94229d);
        }
    }

    public int q() {
        return this.f94228c;
    }

    public int r(int i10, int i11) {
        return getPixel(this.f94226a, i10, i11);
    }

    public ByteBuffer s() {
        return this.f94230e;
    }

    public int t() {
        return this.f94227b;
    }

    public void w(int i10, int i11, int i12) {
        setPixel(this.f94226a, i10, i11, i12);
    }

    public Gdx2DPixmap(InputStream inputStream, int i10) throws IOException {
        this.f94231f = new long[4];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byte[] bArr = new byte[1024];
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                break;
            } else {
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteBuffer byteBufferLoad = load(this.f94231f, byteArray, 0, byteArray.length);
        this.f94230e = byteBufferLoad;
        if (byteBufferLoad != null) {
            long[] jArr = this.f94231f;
            this.f94226a = jArr[0];
            this.f94227b = (int) jArr[1];
            this.f94228c = (int) jArr[2];
            int i12 = (int) jArr[3];
            this.f94229d = i12;
            if (i10 == 0 || i10 == i12) {
                return;
            }
            b(i10);
            return;
        }
        throw new IOException("Error loading pixmap: " + getFailureReason());
    }

    public Gdx2DPixmap(int i10, int i11, int i12) throws t {
        long[] jArr = new long[4];
        this.f94231f = jArr;
        ByteBuffer byteBufferNewPixmap = newPixmap(jArr, i10, i11, i12);
        this.f94230e = byteBufferNewPixmap;
        if (byteBufferNewPixmap == null) {
            throw new t("Error loading pixmap.");
        }
        long[] jArr2 = this.f94231f;
        this.f94226a = jArr2[0];
        this.f94227b = (int) jArr2[1];
        this.f94228c = (int) jArr2[2];
        int i13 = 1 << 3;
        this.f94229d = (int) jArr2[3];
    }

    public Gdx2DPixmap(ByteBuffer byteBuffer, long[] jArr) {
        this.f94231f = new long[4];
        this.f94230e = byteBuffer;
        int i10 = 4 >> 0;
        this.f94226a = jArr[0];
        this.f94227b = (int) jArr[1];
        this.f94228c = (int) jArr[2];
        this.f94229d = (int) jArr[3];
    }
}

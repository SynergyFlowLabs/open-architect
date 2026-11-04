package com.badlogic.gdx.graphics;

import com.badlogic.gdx.utils.h0;
import com.facebook.appevents.p;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f94168e = new b(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f94169f = new b(1.0f, 1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f94170g = new b(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f94171h = new b(1.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f94172i = new b(0.0f, 1.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f94173j = new b(0.0f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f94174k = new b(0.75f, 0.75f, 0.75f, 1.0f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f94175l = new b(0.5f, 0.5f, 0.5f, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f94176m = new b(0.25f, 0.25f, 0.25f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f94177n = new b(1.0f, 0.68f, 0.68f, 1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f94178o = new b(1.0f, 0.78f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f94179p = new b(1.0f, 1.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f94180q = new b(1.0f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f94181r = new b(0.0f, 1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f94182s = new b(0.5f, 0.5f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f94183t = new b(0.5f, 0.0f, 0.5f, 1.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f94184u = new b(0.5f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f94185v = new b(0.0f, 0.5f, 0.5f, 1.0f);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f94186w = new b(0.0f, 0.0f, 0.5f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f94187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f94188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f94189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f94190d;

    public b() {
    }

    public static void A(b bVar, int i10) {
        bVar.f94187a = (((-16777216) & i10) >>> 24) / 255.0f;
        bVar.f94188b = ((16711680 & i10) >>> 16) / 255.0f;
        bVar.f94189c = ((65280 & i10) >>> 8) / 255.0f;
        bVar.f94190d = (i10 & 255) / 255.0f;
    }

    public static float H(float f10, float f11, float f12, float f13) {
        return h0.f(((int) (f10 * 255.0f)) | (((int) (f11 * 255.0f)) << 8) | (((int) (f12 * 255.0f)) << 16) | (((int) (f13 * 255.0f)) << 24));
    }

    public static float I(int i10, int i11, int i12, int i13) {
        return h0.f(i10 | (i11 << 8) | (i12 << 16) | (i13 << 24));
    }

    public static int K(int i10, int i11, int i12, int i13) {
        return i10 | (i11 << 8) | (i12 << 16) | (i13 << 24);
    }

    public static b L(String str) {
        return new b(Integer.valueOf(str.substring(0, 2), 16).intValue() / 255.0f, Integer.valueOf(str.substring(2, 4), 16).intValue() / 255.0f, Integer.valueOf(str.substring(4, 6), 16).intValue() / 255.0f, (str.length() != 8 ? 255 : Integer.valueOf(str.substring(6, 8), 16).intValue()) / 255.0f);
    }

    public static int c(float f10) {
        return (int) (f10 * 255.0f);
    }

    public static int d(float f10, float f11, float f12, float f13) {
        return (((int) (f10 * 255.0f)) << 24) | (((int) (f11 * 255.0f)) << 16) | (((int) (f12 * 255.0f)) << 8) | ((int) (f13 * 255.0f));
    }

    public static int e(b bVar) {
        return ((int) (bVar.f94189c * 255.0f)) | (((int) (bVar.f94190d * 255.0f)) << 24) | (((int) (bVar.f94187a * 255.0f)) << 16) | (((int) (bVar.f94188b * 255.0f)) << 8);
    }

    public static void f(b bVar, int i10) {
        bVar.f94190d = (((-16777216) & i10) >>> 24) / 255.0f;
        bVar.f94187a = ((16711680 & i10) >>> 16) / 255.0f;
        bVar.f94188b = ((65280 & i10) >>> 8) / 255.0f;
        bVar.f94189c = (i10 & 255) / 255.0f;
    }

    public static int k(float f10, float f11) {
        return (((int) (f10 * 255.0f)) << 8) | ((int) (f11 * 255.0f));
    }

    public static int p(float f10, float f11, float f12) {
        return (((int) (f10 * 31.0f)) << 11) | (((int) (f11 * 63.0f)) << 5) | ((int) (f12 * 31.0f));
    }

    public static int q(b bVar) {
        return ((int) (bVar.f94189c * 31.0f)) | (((int) (bVar.f94187a * 31.0f)) << 11) | (((int) (bVar.f94188b * 63.0f)) << 5);
    }

    public static void r(b bVar, int i10) {
        bVar.f94187a = ((63488 & i10) >>> 11) / 31.0f;
        bVar.f94188b = ((i10 & 2016) >>> 5) / 63.0f;
        bVar.f94189c = (i10 & 31) / 31.0f;
    }

    public static int s(float f10, float f11, float f12) {
        return (((int) (f10 * 255.0f)) << 16) | (((int) (f11 * 255.0f)) << 8) | ((int) (f12 * 255.0f));
    }

    public static int t(b bVar) {
        return ((int) (bVar.f94189c * 255.0f)) | (((int) (bVar.f94187a * 255.0f)) << 16) | (((int) (bVar.f94188b * 255.0f)) << 8);
    }

    public static void u(b bVar, int i10) {
        bVar.f94187a = ((16711680 & i10) >>> 16) / 255.0f;
        bVar.f94188b = ((65280 & i10) >>> 8) / 255.0f;
        bVar.f94189c = (i10 & 255) / 255.0f;
    }

    public static int v(float f10, float f11, float f12, float f13) {
        return (((int) (f10 * 15.0f)) << 12) | (((int) (f11 * 15.0f)) << 8) | (((int) (f12 * 15.0f)) << 4) | ((int) (f13 * 15.0f));
    }

    public static int w(b bVar) {
        return ((int) (bVar.f94190d * 15.0f)) | (((int) (bVar.f94187a * 15.0f)) << 12) | (((int) (bVar.f94188b * 15.0f)) << 8) | (((int) (bVar.f94189c * 15.0f)) << 4);
    }

    public static void x(b bVar, int i10) {
        bVar.f94187a = ((61440 & i10) >>> 12) / 15.0f;
        bVar.f94188b = ((i10 & 3840) >>> 8) / 15.0f;
        bVar.f94189c = ((i10 & 240) >>> 4) / 15.0f;
        bVar.f94190d = (i10 & 15) / 15.0f;
    }

    public static int y(float f10, float f11, float f12, float f13) {
        return (((int) (f10 * 255.0f)) << 24) | (((int) (f11 * 255.0f)) << 16) | (((int) (f12 * 255.0f)) << 8) | ((int) (f13 * 255.0f));
    }

    public static int z(b bVar) {
        return ((int) (bVar.f94190d * 255.0f)) | (((int) (bVar.f94187a * 255.0f)) << 24) | (((int) (bVar.f94188b * 255.0f)) << 16) | (((int) (bVar.f94189c * 255.0f)) << 8);
    }

    public b B(float f10, float f11, float f12, float f13) {
        this.f94187a = f10;
        this.f94188b = f11;
        this.f94189c = f12;
        this.f94190d = f13;
        return g();
    }

    public b C(int i10) {
        A(this, i10);
        return this;
    }

    public b D(b bVar) {
        this.f94187a = bVar.f94187a;
        this.f94188b = bVar.f94188b;
        this.f94189c = bVar.f94189c;
        this.f94190d = bVar.f94190d;
        return this;
    }

    public b E(float f10, float f11, float f12, float f13) {
        this.f94187a -= f10;
        this.f94188b -= f11;
        this.f94189c -= f12;
        this.f94190d -= f13;
        return g();
    }

    public b F(b bVar) {
        this.f94187a -= bVar.f94187a;
        this.f94188b -= bVar.f94188b;
        this.f94189c -= bVar.f94189c;
        this.f94190d -= bVar.f94190d;
        return g();
    }

    public float G() {
        return h0.f(((int) (this.f94187a * 255.0f)) | (((int) (this.f94190d * 255.0f)) << 24) | (((int) (this.f94189c * 255.0f)) << 16) | (((int) (this.f94188b * 255.0f)) << 8));
    }

    public int J() {
        return ((int) (this.f94187a * 255.0f)) | (((int) (this.f94190d * 255.0f)) << 24) | (((int) (this.f94189c * 255.0f)) << 16) | (((int) (this.f94188b * 255.0f)) << 8);
    }

    public b a(float f10, float f11, float f12, float f13) {
        this.f94187a += f10;
        this.f94188b += f11;
        this.f94189c += f12;
        this.f94190d += f13;
        return g();
    }

    public b b(b bVar) {
        this.f94187a += bVar.f94187a;
        this.f94188b += bVar.f94188b;
        this.f94189c += bVar.f94189c;
        this.f94190d += bVar.f94190d;
        return g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && J() == ((b) obj).J();
    }

    public b g() {
        float f10 = this.f94187a;
        if (f10 < 0.0f) {
            this.f94187a = 0.0f;
        } else if (f10 > 1.0f) {
            this.f94187a = 1.0f;
        }
        float f11 = this.f94188b;
        if (f11 < 0.0f) {
            this.f94188b = 0.0f;
        } else if (f11 > 1.0f) {
            this.f94188b = 1.0f;
        }
        float f12 = this.f94189c;
        if (f12 < 0.0f) {
            this.f94189c = 0.0f;
        } else if (f12 > 1.0f) {
            this.f94189c = 1.0f;
        }
        float f13 = this.f94190d;
        if (f13 < 0.0f) {
            this.f94190d = 0.0f;
            return this;
        }
        if (f13 > 1.0f) {
            this.f94190d = 1.0f;
        }
        return this;
    }

    public b h() {
        return new b(this);
    }

    public int hashCode() {
        float f10 = this.f94187a;
        int iB = (f10 != 0.0f ? h0.b(f10) : 0) * 31;
        float f11 = this.f94188b;
        int iB2 = (iB + (f11 != 0.0f ? h0.b(f11) : 0)) * 31;
        float f12 = this.f94189c;
        int iB3 = (iB2 + (f12 != 0.0f ? h0.b(f12) : 0)) * 31;
        float f13 = this.f94190d;
        return iB3 + (f13 != 0.0f ? h0.b(f13) : 0);
    }

    public b i(float f10, float f11, float f12, float f13, float f14) {
        float f15 = this.f94187a;
        this.f94187a = f15 + ((f10 - f15) * f14);
        float f16 = this.f94188b;
        this.f94188b = f16 + ((f11 - f16) * f14);
        float f17 = this.f94189c;
        this.f94189c = f17 + ((f12 - f17) * f14);
        float f18 = this.f94190d;
        this.f94190d = f18 + (f14 * (f13 - f18));
        return g();
    }

    public b j(b bVar, float f10) {
        float f11 = this.f94187a;
        this.f94187a = f11 + ((bVar.f94187a - f11) * f10);
        float f12 = this.f94188b;
        this.f94188b = f12 + ((bVar.f94188b - f12) * f10);
        float f13 = this.f94189c;
        this.f94189c = f13 + ((bVar.f94189c - f13) * f10);
        float f14 = this.f94190d;
        this.f94190d = f14 + (f10 * (bVar.f94190d - f14));
        return g();
    }

    public b l(float f10) {
        this.f94187a *= f10;
        this.f94188b *= f10;
        this.f94189c *= f10;
        this.f94190d *= f10;
        return g();
    }

    public b m(float f10, float f11, float f12, float f13) {
        this.f94187a *= f10;
        this.f94188b *= f11;
        this.f94189c *= f12;
        this.f94190d *= f13;
        return g();
    }

    public b n(b bVar) {
        this.f94187a *= bVar.f94187a;
        this.f94188b *= bVar.f94188b;
        this.f94189c *= bVar.f94189c;
        this.f94190d *= bVar.f94190d;
        return g();
    }

    public b o() {
        float f10 = this.f94187a;
        float f11 = this.f94190d;
        this.f94187a = f10 * f11;
        this.f94188b *= f11;
        this.f94189c *= f11;
        return this;
    }

    public String toString() {
        String hexString = Integer.toHexString(((int) (this.f94190d * 255.0f)) | (((int) (this.f94187a * 255.0f)) << 24) | (((int) (this.f94188b * 255.0f)) << 16) | (((int) (this.f94189c * 255.0f)) << 8));
        while (hexString.length() < 8) {
            hexString = p.f99189d0 + hexString;
        }
        return hexString;
    }

    public b(int i10) {
        A(this, i10);
    }

    public b(float f10, float f11, float f12, float f13) {
        this.f94187a = f10;
        this.f94188b = f11;
        this.f94189c = f12;
        this.f94190d = f13;
        g();
    }

    public b(b bVar) {
        D(bVar);
    }
}

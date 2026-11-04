package com.badlogic.gdx.graphics;

import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.utils.t;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f94764d = a.SourceOver;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Gdx2DPixmap f94765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94766b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f94767c;

    public enum a {
        None,
        SourceOver;

        static {
            int i10 = 7 | 0;
        }
    }

    public enum b {
        NearestNeighbour,
        BiLinear;

        static {
            int i10 = 5 << 1;
        }
    }

    public enum c {
        Alpha,
        Intensity,
        LuminanceAlpha,
        RGB565,
        RGBA4444,
        RGB888,
        RGBA8888;

        static {
            int i10 = 3 & 2;
            int i11 = 3 ^ 5;
        }

        public static c l(int i10) {
            if (i10 == 1) {
                return Alpha;
            }
            if (i10 == 2) {
                return LuminanceAlpha;
            }
            if (i10 == 5) {
                return RGB565;
            }
            if (i10 == 6) {
                return RGBA4444;
            }
            if (i10 == 3) {
                return RGB888;
            }
            if (i10 == 4) {
                return RGBA8888;
            }
            throw new t("Unknown Gdx2DPixmap Format: " + i10);
        }

        public static int n(c cVar) {
            if (cVar == Alpha || cVar == Intensity) {
                return 1;
            }
            if (cVar == LuminanceAlpha) {
                return 2;
            }
            if (cVar == RGB565) {
                return 5;
            }
            if (cVar == RGBA4444) {
                return 6;
            }
            if (cVar == RGB888) {
                return 3;
            }
            if (cVar == RGBA8888) {
                return 4;
            }
            throw new t("Unknown Format: " + cVar);
        }
    }

    public i(int i10, int i11, c cVar) {
        this.f94765a = new Gdx2DPixmap(i10, i11, c.n(cVar));
        x(0.0f, 0.0f, 0.0f, 0.0f);
        j();
    }

    public static void A(b bVar) {
        Gdx2DPixmap.setScale(bVar == b.NearestNeighbour ? 0 : 1);
    }

    public static a n() {
        return f94764d;
    }

    public static void w(a aVar) {
        f94764d = aVar;
        Gdx2DPixmap.setBlend(aVar == a.None ? 0 : 1);
    }

    public void a() {
        if (this.f94767c) {
            throw new t("Pixmap already disposed!");
        }
        this.f94765a.c();
        this.f94767c = true;
    }

    public void b(int i10, int i11, int i12) {
        this.f94765a.d(i10, i11, i12, this.f94766b);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f94765a.e(i10, i11, i12, i13, this.f94766b);
    }

    public void d(int i10, int i11) {
        this.f94765a.w(i10, i11, this.f94766b);
    }

    public void e(int i10, int i11, int i12) {
        this.f94765a.w(i10, i11, i12);
    }

    public void f(i iVar, int i10, int i11) {
        int i12 = 0 >> 0;
        g(iVar, i10, i11, 0, 0, iVar.v(), iVar.s());
    }

    public void g(i iVar, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f94765a.f(iVar.f94765a, i12, i13, i10, i11, i14, i15);
    }

    public void h(i iVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f94765a.g(iVar.f94765a, i10, i11, i12, i13, i14, i15, i16, i17);
    }

    public void i(int i10, int i11, int i12, int i13) {
        this.f94765a.h(i10, i11, i12, i13, this.f94766b);
    }

    public void j() {
        this.f94765a.a(this.f94766b);
    }

    public void k(int i10, int i11, int i12) {
        this.f94765a.i(i10, i11, i12, this.f94766b);
    }

    public void l(int i10, int i11, int i12, int i13) {
        this.f94765a.j(i10, i11, i12, i13, this.f94766b);
    }

    public void m(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f94765a.k(i10, i11, i12, i13, i14, i15, this.f94766b);
    }

    public c o() {
        return c.l(this.f94765a.l());
    }

    public int p() {
        return this.f94765a.n();
    }

    public int q() {
        return this.f94765a.o();
    }

    public int r() {
        return this.f94765a.p();
    }

    public int s() {
        return this.f94765a.q();
    }

    public int t(int i10, int i11) {
        return this.f94765a.r(i10, i11);
    }

    public ByteBuffer u() {
        if (this.f94767c) {
            throw new t("Pixmap already disposed");
        }
        return this.f94765a.s();
    }

    public int v() {
        return this.f94765a.t();
    }

    public void x(float f10, float f11, float f12, float f13) {
        this.f94766b = com.badlogic.gdx.graphics.b.y(f10, f11, f12, f13);
    }

    public void y(int i10) {
        this.f94766b = i10;
    }

    public void z(com.badlogic.gdx.graphics.b bVar) {
        this.f94766b = com.badlogic.gdx.graphics.b.y(bVar.f94187a, bVar.f94188b, bVar.f94189c, bVar.f94190d);
    }

    public i(byte[] bArr, int i10, int i11) {
        try {
            this.f94765a = new Gdx2DPixmap(bArr, i10, i11, 0);
        } catch (IOException e10) {
            throw new t("Couldn't load pixmap from image data", e10);
        }
    }

    public i(com.badlogic.gdx.files.a aVar) {
        try {
            byte[] bArrF = aVar.F();
            this.f94765a = new Gdx2DPixmap(bArrF, 0, bArrF.length, 0);
        } catch (Exception e10) {
            throw new t("Couldn't load file: " + aVar, e10);
        }
    }

    public i(Gdx2DPixmap gdx2DPixmap) {
        this.f94765a = gdx2DPixmap;
    }
}

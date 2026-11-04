package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.math.s;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.badlogic.gdx.graphics.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f94691h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.badlogic.gdx.files.a f94692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f94694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.badlogic.gdx.graphics.i.c f94695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.badlogic.gdx.graphics.i f94696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f94697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f94698g = false;

    public b(com.badlogic.gdx.files.a aVar, com.badlogic.gdx.graphics.i iVar, com.badlogic.gdx.graphics.i.c cVar, boolean z10) {
        this.f94693b = 0;
        this.f94694c = 0;
        this.f94692a = aVar;
        this.f94696e = iVar;
        this.f94695d = cVar;
        this.f94697f = z10;
        if (iVar != null) {
            com.badlogic.gdx.graphics.i iVarH = h(iVar);
            this.f94696e = iVarH;
            this.f94693b = iVarH.v();
            this.f94694c = this.f94696e.s();
            if (cVar == null) {
                this.f94695d = this.f94696e.o();
            }
        }
    }

    private com.badlogic.gdx.graphics.i h(com.badlogic.gdx.graphics.i iVar) {
        if (f94691h) {
            int iV = iVar.v();
            int iS = iVar.s();
            int iU = s.u(iV);
            int iU2 = s.u(iS);
            if (iV != iU || iS != iU2) {
                com.badlogic.gdx.graphics.i iVar2 = new com.badlogic.gdx.graphics.i(iU, iU2, iVar.o());
                iVar2.g(iVar, 0, 0, 0, 0, iV, iS);
                iVar.a();
                return iVar2;
            }
        }
        return iVar;
    }

    @Override // com.badlogic.gdx.graphics.l
    public void A() {
        if (this.f94698g) {
            throw new t("Already prepared");
        }
        if (this.f94696e == null) {
            if (this.f94692a.m().equals("cim")) {
                this.f94696e = com.badlogic.gdx.graphics.j.a(this.f94692a);
            } else {
                this.f94696e = h(new com.badlogic.gdx.graphics.i(this.f94692a));
            }
            this.f94693b = this.f94696e.v();
            this.f94694c = this.f94696e.s();
            if (this.f94695d == null) {
                this.f94695d = this.f94696e.o();
            }
        }
        this.f94698g = true;
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean a() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean b() {
        return this.f94698g;
    }

    @Override // com.badlogic.gdx.graphics.l
    public com.badlogic.gdx.graphics.l.b c() {
        return com.badlogic.gdx.graphics.l.b.Pixmap;
    }

    @Override // com.badlogic.gdx.graphics.l
    public void d(int i10) {
        throw new t("This TextureData implementation does not upload data itself");
    }

    @Override // com.badlogic.gdx.graphics.l
    public com.badlogic.gdx.graphics.i e() {
        if (!this.f94698g) {
            throw new t("Call prepare() before calling getPixmap()");
        }
        this.f94698g = false;
        com.badlogic.gdx.graphics.i iVar = this.f94696e;
        this.f94696e = null;
        return iVar;
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean f() {
        return this.f94697f;
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean g() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.l
    public com.badlogic.gdx.graphics.i.c getFormat() {
        return this.f94695d;
    }

    @Override // com.badlogic.gdx.graphics.l
    public int getHeight() {
        return this.f94694c;
    }

    @Override // com.badlogic.gdx.graphics.l
    public int getWidth() {
        return this.f94693b;
    }

    public com.badlogic.gdx.files.a i() {
        return this.f94692a;
    }
}

package com.badlogic.gdx.graphics;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements gc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f94202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected k.a f94203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected k.a f94204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected k.b f94205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected k.b f94206f;

    public e(int i10) {
        this(i10, com.badlogic.gdx.graphics.glutils.d.h());
    }

    protected static void D(int i10, l lVar) {
        E(i10, lVar, 0);
    }

    public static void E(int i10, l lVar, int i11) {
        if (lVar == null) {
            return;
        }
        if (!lVar.b()) {
            lVar.A();
        }
        if (lVar.c() == l.b.Custom) {
            lVar.d(i10);
            return;
        }
        i iVarE = lVar.e();
        boolean zG = lVar.g();
        if (lVar.getFormat() != iVarE.o()) {
            i iVar = new i(iVarE.v(), iVarE.s(), lVar.getFormat());
            i.a aVarN = i.n();
            i.w(i.a.None);
            iVar.g(iVarE, 0, 0, 0, 0, iVarE.v(), iVarE.s());
            i.w(aVarN);
            if (lVar.g()) {
                iVarE.a();
            }
            iVarE = iVar;
            zG = true;
        }
        GLES20.glPixelStorei(3317, 1);
        if (lVar.f()) {
            com.badlogic.gdx.graphics.glutils.g.a(i10, iVarE, iVarE.v(), iVarE.s());
        } else {
            GLES20.glTexImage2D(i10, i11, iVarE.q(), iVarE.v(), iVarE.s(), 0, iVarE.p(), iVarE.r(), iVarE.u());
        }
        if (zG) {
            iVarE.a();
        }
    }

    public void A(k.a aVar, k.a aVar2, boolean z10) {
        if (aVar != null && (z10 || this.f94203c != aVar)) {
            GLES20.glTexParameterf(this.f94201a, 10241, aVar.l());
            this.f94203c = aVar;
        }
        if (aVar2 != null && (z10 || this.f94204d != aVar2)) {
            GLES20.glTexParameterf(this.f94201a, androidx.work.h.f76563d, aVar2.l());
            this.f94204d = aVar2;
        }
    }

    public void B(k.b bVar, k.b bVar2) {
        C(bVar, bVar2, false);
    }

    public void C(k.b bVar, k.b bVar2, boolean z10) {
        if (bVar != null && (z10 || this.f94205e != bVar)) {
            GLES20.glTexParameterf(this.f94201a, 10242, bVar.l());
            this.f94205e = bVar;
        }
        if (bVar2 != null && (z10 || this.f94206f != bVar2)) {
            GLES20.glTexParameterf(this.f94201a, 10243, bVar2.l());
            this.f94206f = bVar2;
        }
    }

    public void a(int i10) {
        GLES20.glActiveTexture(i10 + 33984);
        GLES20.glBindTexture(this.f94201a, this.f94202b);
    }

    protected void b() {
        int i10 = this.f94202b;
        if (i10 != 0) {
            com.badlogic.gdx.graphics.glutils.d.c(i10);
            this.f94202b = 0;
        }
    }

    @Override // gc.e
    public void dispose() {
        b();
    }

    public abstract int e();

    public abstract int f();

    public k.a g() {
        return this.f94204d;
    }

    public k.a h() {
        return this.f94203c;
    }

    public int i() {
        return this.f94202b;
    }

    public void i0() {
        GLES20.glBindTexture(this.f94201a, this.f94202b);
    }

    public k.b j() {
        return this.f94205e;
    }

    public k.b m() {
        return this.f94206f;
    }

    public abstract int o();

    public abstract boolean q();

    protected abstract void u();

    public void x(k.a aVar, k.a aVar2) {
        this.f94203c = aVar;
        this.f94204d = aVar2;
        i0();
        GLES20.glTexParameterf(this.f94201a, 10241, aVar.l());
        GLES20.glTexParameterf(this.f94201a, androidx.work.h.f76563d, aVar2.l());
    }

    public void y(k.b bVar, k.b bVar2) {
        this.f94205e = bVar;
        this.f94206f = bVar2;
        i0();
        GLES20.glTexParameterf(this.f94201a, 10242, bVar.l());
        GLES20.glTexParameterf(this.f94201a, 10243, bVar2.l());
    }

    public void z(k.a aVar, k.a aVar2) {
        A(aVar, aVar2, false);
    }

    public e(int i10, int i11) {
        k.a aVar = k.a.Nearest;
        this.f94203c = aVar;
        this.f94204d = aVar;
        k.b bVar = k.b.ClampToEdge;
        this.f94205e = bVar;
        this.f94206f = bVar;
        this.f94201a = i10;
        this.f94202b = i11;
    }
}

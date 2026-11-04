package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class i implements com.badlogic.gdx.graphics.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.badlogic.gdx.graphics.i f94724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.badlogic.gdx.graphics.i.c f94725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f94726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f94727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f94728e;

    public i(com.badlogic.gdx.graphics.i iVar, com.badlogic.gdx.graphics.i.c cVar, boolean z10, boolean z11) {
        this(iVar, cVar, z10, z11, false);
    }

    @Override // com.badlogic.gdx.graphics.l
    public void A() {
        throw new t("prepare() must not be called on a PixmapTextureData instance as it is already prepared.");
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean a() {
        return this.f94728e;
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean b() {
        return true;
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
        return this.f94724a;
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean f() {
        return this.f94726c;
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean g() {
        return this.f94727d;
    }

    @Override // com.badlogic.gdx.graphics.l
    public com.badlogic.gdx.graphics.i.c getFormat() {
        return this.f94725b;
    }

    @Override // com.badlogic.gdx.graphics.l
    public int getHeight() {
        return this.f94724a.s();
    }

    @Override // com.badlogic.gdx.graphics.l
    public int getWidth() {
        return this.f94724a.v();
    }

    public i(com.badlogic.gdx.graphics.i iVar, com.badlogic.gdx.graphics.i.c cVar, boolean z10, boolean z11, boolean z12) {
        this.f94724a = iVar;
        this.f94725b = cVar == null ? iVar.o() : cVar;
        this.f94726c = z10;
        this.f94727d = z11;
        this.f94728e = z12;
    }
}

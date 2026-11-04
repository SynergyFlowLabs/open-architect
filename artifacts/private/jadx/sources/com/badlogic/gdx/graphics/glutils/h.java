package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class h implements com.badlogic.gdx.graphics.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.badlogic.gdx.graphics.l[] f94723a;

    public h(com.badlogic.gdx.graphics.l... lVarArr) {
        com.badlogic.gdx.graphics.l[] lVarArr2 = new com.badlogic.gdx.graphics.l[lVarArr.length];
        this.f94723a = lVarArr2;
        System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
    }

    @Override // com.badlogic.gdx.graphics.l
    public void A() {
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean a() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean b() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.l
    public com.badlogic.gdx.graphics.l.b c() {
        return com.badlogic.gdx.graphics.l.b.Custom;
    }

    @Override // com.badlogic.gdx.graphics.l
    public void d(int i10) {
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.graphics.l[] lVarArr = this.f94723a;
            if (i11 >= lVarArr.length) {
                return;
            }
            com.badlogic.gdx.graphics.e.E(i10, lVarArr[i11], i11);
            i11++;
        }
    }

    @Override // com.badlogic.gdx.graphics.l
    public com.badlogic.gdx.graphics.i e() {
        throw new t("It's compressed, use the compressed method");
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean f() {
        return false;
    }

    @Override // com.badlogic.gdx.graphics.l
    public boolean g() {
        return false;
    }

    @Override // com.badlogic.gdx.graphics.l
    public com.badlogic.gdx.graphics.i.c getFormat() {
        return this.f94723a[0].getFormat();
    }

    @Override // com.badlogic.gdx.graphics.l
    public int getHeight() {
        return this.f94723a[0].getHeight();
    }

    @Override // com.badlogic.gdx.graphics.l
    public int getWidth() {
        return this.f94723a[0].getWidth();
    }
}

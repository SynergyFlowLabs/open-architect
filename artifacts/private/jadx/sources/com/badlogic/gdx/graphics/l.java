package com.badlogic.gdx.graphics;

/* JADX INFO: loaded from: classes3.dex */
public interface l {

    public static class a {
        public static l a(com.badlogic.gdx.files.a aVar, i.c cVar, boolean z10) {
            if (aVar == null) {
                return null;
            }
            return aVar.x().endsWith(".cim") ? new com.badlogic.gdx.graphics.glutils.b(aVar, j.a(aVar), cVar, z10) : new com.badlogic.gdx.graphics.glutils.b(aVar, new i(aVar), cVar, z10);
        }

        public static l b(com.badlogic.gdx.files.a aVar, boolean z10) {
            return a(aVar, null, z10);
        }
    }

    public enum b {
        Pixmap,
        Custom
    }

    void A();

    boolean a();

    boolean b();

    b c();

    void d(int i10);

    i e();

    boolean f();

    boolean g();

    i.c getFormat();

    int getHeight();

    int getWidth();
}

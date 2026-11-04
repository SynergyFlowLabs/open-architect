package com.badlogic.gdx;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public enum a {
        Classpath,
        Internal,
        External,
        Absolute,
        Local
    }

    com.badlogic.gdx.files.a a(String str);

    com.badlogic.gdx.files.a b(String str);

    String c();

    com.badlogic.gdx.files.a d(String str);

    com.badlogic.gdx.files.a e(String str, a aVar);

    boolean f();

    String g();

    boolean h();

    com.badlogic.gdx.files.a i(String str);

    com.badlogic.gdx.files.a j(String str);
}

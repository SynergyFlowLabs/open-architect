package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public class u0<T> extends o0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.badlogic.gdx.utils.reflect.d f95783d;

    public u0(Class<T> cls) {
        this(cls, 16, Integer.MAX_VALUE);
    }

    private com.badlogic.gdx.utils.reflect.d g(Class<T> cls) {
        try {
            try {
                return com.badlogic.gdx.utils.reflect.c.b(cls, null);
            } catch (Exception unused) {
                com.badlogic.gdx.utils.reflect.d dVarF = com.badlogic.gdx.utils.reflect.c.f(cls, null);
                dVarF.e(true);
                return dVarF;
            }
        } catch (com.badlogic.gdx.utils.reflect.g unused2) {
            return null;
        }
    }

    @Override // com.badlogic.gdx.utils.o0
    protected T e() {
        try {
            return (T) this.f95783d.d(null);
        } catch (Exception e10) {
            throw new t("Unable to create new instance: " + this.f95783d.a().getName(), e10);
        }
    }

    public u0(Class<T> cls, int i10) {
        this(cls, i10, Integer.MAX_VALUE);
    }

    public u0(Class<T> cls, int i10, int i11) {
        super(i10, i11);
        com.badlogic.gdx.utils.reflect.d dVarG = g(cls);
        this.f95783d = dVarG;
        if (dVarG != null) {
            return;
        }
        throw new RuntimeException("Class cannot be created (missing no-arg constructor): " + cls.getName());
    }
}

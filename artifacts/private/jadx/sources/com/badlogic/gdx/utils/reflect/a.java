package com.badlogic.gdx.utils.reflect;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Annotation f95741a;

    a(Annotation annotation) {
        this.f95741a = annotation;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        if (this.f95741a.annotationType().equals(cls)) {
            return (T) this.f95741a;
        }
        return null;
    }

    public Class<? extends Annotation> b() {
        return this.f95741a.annotationType();
    }
}

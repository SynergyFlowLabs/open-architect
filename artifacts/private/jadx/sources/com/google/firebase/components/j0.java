package com.google.firebase.components;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes5.dex */
public final class j0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f120781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<T> f120782b;

    private @interface a {
    }

    public j0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f120781a = cls;
        this.f120782b = cls2;
    }

    @NonNull
    public static <T> j0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new j0<>(cls, cls2);
    }

    @NonNull
    public static <T> j0<T> b(Class<T> cls) {
        return new j0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f120782b.equals(j0Var.f120782b)) {
            return this.f120781a.equals(j0Var.f120781a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f120782b.hashCode() * 31) + this.f120781a.hashCode();
    }

    public String toString() {
        if (this.f120781a == a.class) {
            return this.f120782b.getName();
        }
        return "@" + this.f120781a.getName() + " " + this.f120782b.getName();
    }
}

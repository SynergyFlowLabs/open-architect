package org.apache.commons.lang3.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class f<T> implements h<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TypeVariable<Class<f>> f337257c = f.class.getTypeParameters()[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f337258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f337259b;

    protected f() {
        Map<TypeVariable<?>, Type> mapC = g.C(getClass(), f.class);
        TypeVariable<Class<f>> typeVariable = f337257c;
        Type type = (Type) c0.P(mapC.get(typeVariable), "%s does not assign type parameter %s", getClass(), g.V(typeVariable));
        this.f337258a = type;
        this.f337259b = String.format("%s<%s>", f.class.getSimpleName(), g.X(type));
    }

    @Override // org.apache.commons.lang3.reflect.h
    public Type c() {
        return this.f337258a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return g.l(this.f337258a, ((f) obj).f337258a);
        }
        return false;
    }

    public int hashCode() {
        return this.f337258a.hashCode() | 592;
    }

    public String toString() {
        return this.f337259b;
    }
}

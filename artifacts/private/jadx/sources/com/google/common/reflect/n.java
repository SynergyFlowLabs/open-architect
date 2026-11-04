package com.google.common.reflect;

import com.google.common.base.j0;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes5.dex */
@d
public abstract class n<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TypeVariable<?> f119841a;

    protected n() {
        Type typeA = a();
        j0.u(typeA instanceof TypeVariable, "%s should be a type variable.", typeA);
        this.f119841a = (TypeVariable) typeA;
    }

    public final boolean equals(@fj.a Object o10) {
        if (o10 instanceof n) {
            return this.f119841a.equals(((n) o10).f119841a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f119841a.hashCode();
    }

    public String toString() {
        return this.f119841a.toString();
    }
}

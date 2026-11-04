package com.google.common.reflect;

import com.google.common.collect.z9;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@d
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Type> f119886a = z9.u();

    s() {
    }

    public final void a(Type... types) {
        for (Type type : types) {
            if (type != null && this.f119886a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        e((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        f((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        d((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        b((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            throw new AssertionError("Unknown type: " + type);
                        }
                        c((GenericArrayType) type);
                    }
                } catch (Throwable th2) {
                    this.f119886a.remove(type);
                    throw th2;
                }
            }
        }
    }

    void b(Class<?> t10) {
    }

    void c(GenericArrayType t10) {
    }

    void d(ParameterizedType t10) {
    }

    void e(TypeVariable<?> t10) {
    }

    void f(WildcardType t10) {
    }
}

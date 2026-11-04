package com.google.gson.internal.bind;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.internal.v;
import com.google.gson.t;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c0 f125338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c0 f125339d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f125340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, c0> f125341b = new ConcurrentHashMap();

    private static class b implements c0 {
        private b() {
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f125338c = new b();
        f125339d = new b();
    }

    public e(v vVar) {
        this.f125340a = vVar;
    }

    private static Object a(v vVar, Class<?> cls) {
        return vVar.x(com.google.gson.reflect.a.get((Class) cls), true).a();
    }

    private static com.google.gson.annotations.b b(Class<?> cls) {
        return (com.google.gson.annotations.b) cls.getAnnotation(com.google.gson.annotations.b.class);
    }

    private c0 e(Class<?> cls, c0 c0Var) {
        c0 c0VarPutIfAbsent = this.f125341b.putIfAbsent(cls, c0Var);
        return c0VarPutIfAbsent != null ? c0VarPutIfAbsent : c0Var;
    }

    b0<?> c(v vVar, com.google.gson.f fVar, com.google.gson.reflect.a<?> aVar, com.google.gson.annotations.b bVar, boolean z10) {
        b0<?> b0VarCreate;
        Object objA = a(vVar, bVar.value());
        boolean zNullSafe = bVar.nullSafe();
        if (objA instanceof b0) {
            b0VarCreate = (b0) objA;
        } else if (objA instanceof c0) {
            c0 c0VarE = (c0) objA;
            if (z10) {
                c0VarE = e(aVar.getRawType(), c0VarE);
            }
            b0VarCreate = c0VarE.create(fVar, aVar);
        } else {
            boolean z11 = objA instanceof t;
            if (!z11 && !(objA instanceof com.google.gson.k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            n nVar = new n(z11 ? (t) objA : null, objA instanceof com.google.gson.k ? (com.google.gson.k) objA : null, fVar, aVar, z10 ? f125338c : f125339d, zNullSafe);
            zNullSafe = false;
            b0VarCreate = nVar;
        }
        return (b0VarCreate == null || !zNullSafe) ? b0VarCreate : b0VarCreate.nullSafe();
    }

    @Override // com.google.gson.c0
    public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        com.google.gson.annotations.b bVarB = b(aVar.getRawType());
        if (bVarB == null) {
            return null;
        }
        return (b0<T>) c(this.f125340a, fVar, aVar, bVarB, true);
    }

    public boolean d(com.google.gson.reflect.a<?> aVar, c0 c0Var) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(c0Var);
        if (c0Var == f125338c) {
            return true;
        }
        Class<? super Object> rawType = aVar.getRawType();
        c0 c0Var2 = this.f125341b.get(rawType);
        if (c0Var2 != null) {
            return c0Var2 == c0Var;
        }
        com.google.gson.annotations.b bVarB = b(rawType);
        if (bVarB == null) {
            return false;
        }
        Class<?> clsValue = bVarB.value();
        return c0.class.isAssignableFrom(clsValue) && e(rawType, (c0) a(this.f125340a, clsValue)) == c0Var;
    }
}

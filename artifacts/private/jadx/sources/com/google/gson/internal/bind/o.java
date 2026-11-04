package com.google.gson.internal.bind;

import com.google.gson.b0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes5.dex */
final class o<T> extends b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.f f125405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0<T> f125406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f125407c;

    o(com.google.gson.f fVar, b0<T> b0Var, Type type) {
        this.f125405a = fVar;
        this.f125406b = b0Var;
        this.f125407c = type;
    }

    private static Type a(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    private static boolean b(b0<?> b0Var) {
        b0<?> b0VarA;
        while ((b0Var instanceof m) && (b0VarA = ((m) b0Var).a()) != b0Var) {
            b0Var = b0VarA;
        }
        return b0Var instanceof l.c;
    }

    @Override // com.google.gson.b0
    public T read(com.google.gson.stream.a aVar) throws IOException {
        return this.f125406b.read(aVar);
    }

    @Override // com.google.gson.b0
    public void write(com.google.gson.stream.d dVar, T t10) throws IOException {
        b0<T> b0VarT = this.f125406b;
        Type typeA = a(this.f125407c, t10);
        if (typeA != this.f125407c) {
            b0VarT = this.f125405a.t(com.google.gson.reflect.a.get(typeA));
            if ((b0VarT instanceof l.c) && !b(this.f125406b)) {
                b0VarT = this.f125406b;
            }
        }
        b0VarT.write(dVar, t10);
    }
}

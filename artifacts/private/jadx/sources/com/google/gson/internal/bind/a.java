package com.google.gson.internal.bind;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.internal.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class a<E> extends b0<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f125322c = new C1197a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<E> f125323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0<E> f125324b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    class C1197a implements c0 {
        C1197a() {
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeG = y.g(type);
            return new a(fVar, fVar.t(com.google.gson.reflect.a.get(typeG)), y.k(typeG));
        }
    }

    public a(com.google.gson.f fVar, b0<E> b0Var, Class<E> cls) {
        this.f125324b = new o(fVar, b0Var, cls);
        this.f125323a = cls;
    }

    @Override // com.google.gson.b0
    public Object read(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.x() == com.google.gson.stream.c.NULL) {
            aVar.a7();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.J0();
        while (aVar.hasNext()) {
            arrayList.add(this.f125324b.read(aVar));
        }
        aVar.F0();
        int size = arrayList.size();
        if (!this.f125323a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f125323a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f125323a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.b0
    public void write(com.google.gson.stream.d dVar, Object obj) throws IOException {
        if (obj == null) {
            dVar.y();
            return;
        }
        dVar.d();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f125324b.write(dVar, (E) Array.get(obj, i10));
        }
        dVar.g();
    }
}

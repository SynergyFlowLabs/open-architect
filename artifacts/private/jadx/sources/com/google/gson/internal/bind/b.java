package com.google.gson.internal.bind;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.internal.f0;
import com.google.gson.internal.v;
import com.google.gson.internal.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f125325a;

    private static final class a<E> extends b0<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0<E> f125326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f0<? extends Collection<E>> f125327b;

        a(b0<E> b0Var, f0<? extends Collection<E>> f0Var) {
            this.f125326a = b0Var;
            this.f125327b = f0Var;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<E> read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            Collection<E> collectionA = this.f125327b.a();
            aVar.J0();
            while (aVar.hasNext()) {
                collectionA.add(this.f125326a.read(aVar));
            }
            aVar.F0();
            return collectionA;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                dVar.y();
                return;
            }
            dVar.d();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f125326a.write(dVar, it.next());
            }
            dVar.g();
        }
    }

    public b(v vVar) {
        this.f125325a = vVar;
    }

    @Override // com.google.gson.c0
    public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeH = y.h(type, rawType);
        return new a(new o(fVar, fVar.t(com.google.gson.reflect.a.get(typeH)), typeH), this.f125325a.x(aVar, false));
    }
}

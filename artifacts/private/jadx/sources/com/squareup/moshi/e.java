package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
abstract class e<C extends Collection<T>, T> extends h<C> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h.e f267147b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<T> f267148a;

    class a implements h.e {
        a() {
        }

        @Override // com.squareup.moshi.h.e
        @fj.h
        public h<?> a(Type type, Set<? extends Annotation> set, w wVar) {
            Class<?> clsJ = a0.j(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsJ == List.class || clsJ == Collection.class) {
                return e.q(type, wVar).j();
            }
            if (clsJ == Set.class) {
                return e.s(type, wVar).j();
            }
            return null;
        }
    }

    class b extends e<Collection<T>, T> {
        b(h hVar) {
            super(hVar, null);
        }

        @Override // com.squareup.moshi.e, com.squareup.moshi.h
        public /* bridge */ /* synthetic */ Object b(m mVar) throws IOException {
            return super.b(mVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.e, com.squareup.moshi.h
        public /* bridge */ /* synthetic */ void m(t tVar, Object obj) throws IOException {
            super.m(tVar, (Collection) obj);
        }

        @Override // com.squareup.moshi.e
        Collection<T> r() {
            return new ArrayList();
        }
    }

    class c extends e<Set<T>, T> {
        c(h hVar) {
            super(hVar, null);
        }

        @Override // com.squareup.moshi.e, com.squareup.moshi.h
        public /* bridge */ /* synthetic */ Object b(m mVar) throws IOException {
            return super.b(mVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.e, com.squareup.moshi.h
        public /* bridge */ /* synthetic */ void m(t tVar, Object obj) throws IOException {
            super.m(tVar, (Collection) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.squareup.moshi.e
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public Set<T> r() {
            return new LinkedHashSet();
        }
    }

    /* synthetic */ e(h hVar, a aVar) {
        this(hVar);
    }

    static <T> h<Collection<T>> q(Type type, w wVar) {
        return new b(wVar.d(a0.c(type, Collection.class)));
    }

    static <T> h<Set<T>> s(Type type, w wVar) {
        return new c(wVar.d(a0.c(type, Collection.class)));
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C b(m mVar) throws IOException {
        C c10 = (C) r();
        mVar.J0();
        while (mVar.hasNext()) {
            c10.add(this.f267148a.b(mVar));
        }
        mVar.F0();
        return c10;
    }

    abstract C r();

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void m(t tVar, C c10) throws IOException {
        tVar.a();
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            this.f267148a.m(tVar, (T) it.next());
        }
        tVar.e();
    }

    public String toString() {
        return this.f267148a + ".collection()";
    }

    private e(h<T> hVar) {
        this.f267148a = hVar;
    }
}

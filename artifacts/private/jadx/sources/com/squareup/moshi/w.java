package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final List<h.e> f267308e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<h.e> f267309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f267310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal<e> f267311c = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Object, h<?>> f267312d = new LinkedHashMap();

    class a implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f267313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f267314b;

        a(Type type, h hVar) {
            this.f267313a = type;
            this.f267314b = hVar;
        }

        @Override // com.squareup.moshi.h.e
        @fj.h
        public h<?> a(Type type, Set<? extends Annotation> set, w wVar) {
            if (set.isEmpty() && Util.A(this.f267313a, type)) {
                return this.f267314b;
            }
            return null;
        }
    }

    class b implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f267315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f267316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f267317c;

        b(Type type, Class cls, h hVar) {
            this.f267315a = type;
            this.f267316b = cls;
            this.f267317c = hVar;
        }

        @Override // com.squareup.moshi.h.e
        @fj.h
        public h<?> a(Type type, Set<? extends Annotation> set, w wVar) {
            if (Util.A(this.f267315a, type) && set.size() == 1 && Util.k(set, this.f267316b)) {
                return this.f267317c;
            }
            return null;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<h.e> f267318a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f267319b = 0;

        public c a(h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<h.e> list = this.f267318a;
            int i10 = this.f267319b;
            this.f267319b = i10 + 1;
            list.add(i10, eVar);
            return this;
        }

        public c b(Object obj) {
            if (obj != null) {
                return a(com.squareup.moshi.a.d(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public <T> c c(Type type, h<T> hVar) {
            return a(w.j(type, hVar));
        }

        public <T> c d(Type type, Class<? extends Annotation> cls, h<T> hVar) {
            return a(w.k(type, cls, hVar));
        }

        public c e(h.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            this.f267318a.add(eVar);
            return this;
        }

        public c f(Object obj) {
            if (obj != null) {
                return e(com.squareup.moshi.a.d(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public <T> c g(Type type, h<T> hVar) {
            return e(w.j(type, hVar));
        }

        public <T> c h(Type type, Class<? extends Annotation> cls, h<T> hVar) {
            return e(w.k(type, cls, hVar));
        }

        @fj.c
        public w i() {
            return new w(this);
        }
    }

    static final class d<T> extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Type f267320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        final String f267321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f267322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.h
        h<T> f267323d;

        d(Type type, @fj.h String str, Object obj) {
            this.f267320a = type;
            this.f267321b = str;
            this.f267322c = obj;
        }

        @Override // com.squareup.moshi.h
        public T b(m mVar) throws IOException {
            h<T> hVar = this.f267323d;
            if (hVar != null) {
                return hVar.b(mVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.h
        public void m(t tVar, T t10) throws IOException {
            h<T> hVar = this.f267323d;
            if (hVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            hVar.m(tVar, t10);
        }

        public String toString() {
            h<T> hVar = this.f267323d;
            return hVar != null ? hVar.toString() : super.toString();
        }
    }

    final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<d<?>> f267324a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Deque<d<?>> f267325b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f267326c;

        e() {
        }

        <T> void a(h<T> hVar) {
            this.f267325b.getLast().f267323d = hVar;
        }

        IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (!this.f267326c) {
                this.f267326c = true;
                if (this.f267325b.size() != 1 || this.f267325b.getFirst().f267321b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<d<?>> itDescendingIterator = this.f267325b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        d<?> next = itDescendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.f267320a);
                        if (next.f267321b != null) {
                            sb2.append(' ');
                            sb2.append(next.f267321b);
                        }
                    }
                    return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        void c(boolean z10) {
            this.f267325b.removeLast();
            if (this.f267325b.isEmpty()) {
                w.this.f267311c.remove();
                if (z10) {
                    synchronized (w.this.f267312d) {
                        try {
                            int size = this.f267324a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                d<?> dVar = this.f267324a.get(i10);
                                h<T> hVar = (h) w.this.f267312d.put(dVar.f267322c, dVar.f267323d);
                                if (hVar != 0) {
                                    dVar.f267323d = hVar;
                                    w.this.f267312d.put(dVar.f267322c, hVar);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        <T> h<T> d(Type type, @fj.h String str, Object obj) {
            int size = this.f267324a.size();
            for (int i10 = 0; i10 < size; i10++) {
                d<?> dVar = this.f267324a.get(i10);
                if (dVar.f267322c.equals(obj)) {
                    this.f267325b.add(dVar);
                    h<T> hVar = (h<T>) dVar.f267323d;
                    return hVar != null ? hVar : dVar;
                }
            }
            d<?> dVar2 = new d<>(type, str, obj);
            this.f267324a.add(dVar2);
            this.f267325b.add(dVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f267308e = arrayList;
        arrayList.add(y.f267329a);
        arrayList.add(com.squareup.moshi.e.f267147b);
        arrayList.add(v.f267305c);
        arrayList.add(com.squareup.moshi.b.f267127c);
        arrayList.add(x.f267328a);
        arrayList.add(com.squareup.moshi.d.f267140d);
    }

    w(c cVar) {
        int size = cVar.f267318a.size();
        List<h.e> list = f267308e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(cVar.f267318a);
        arrayList.addAll(list);
        this.f267309a = Collections.unmodifiableList(arrayList);
        this.f267310b = cVar.f267319b;
    }

    private Object i(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    static <T> h.e j(Type type, h<T> hVar) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (hVar != null) {
            return new a(type, hVar);
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    static <T> h.e k(Type type, Class<? extends Annotation> cls, h<T> hVar) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (cls == null) {
            throw new IllegalArgumentException("annotation == null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("jsonAdapter == null");
        }
        if (cls.isAnnotationPresent(l.class)) {
            if (cls.getDeclaredMethods().length <= 0) {
                return new b(type, cls, hVar);
            }
            throw new IllegalArgumentException("Use JsonAdapter.Factory for annotations with elements");
        }
        throw new IllegalArgumentException(cls + " does not have @JsonQualifier");
    }

    @fj.c
    public <T> h<T> c(Class<T> cls) {
        return f(cls, Util.f267158a);
    }

    @fj.c
    public <T> h<T> d(Type type) {
        return f(type, Util.f267158a);
    }

    @fj.c
    public <T> h<T> e(Type type, Class<? extends Annotation> cls) {
        if (cls != null) {
            return f(type, Collections.singleton(a0.d(cls)));
        }
        throw new NullPointerException("annotationType == null");
    }

    @fj.c
    public <T> h<T> f(Type type, Set<? extends Annotation> set) {
        return g(type, set, null);
    }

    @fj.c
    public <T> h<T> g(Type type, Set<? extends Annotation> set, @fj.h String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeT = Util.t(Util.b(type));
        Object objI = i(typeT, set);
        synchronized (this.f267312d) {
            try {
                h<T> hVar = (h) this.f267312d.get(objI);
                if (hVar != null) {
                    return hVar;
                }
                e eVar = this.f267311c.get();
                if (eVar == null) {
                    eVar = new e();
                    this.f267311c.set(eVar);
                }
                h<T> hVarD = eVar.d(typeT, str, objI);
                try {
                    if (hVarD != null) {
                        eVar.c(false);
                        return hVarD;
                    }
                    try {
                        int size = this.f267309a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            h<T> hVar2 = (h<T>) this.f267309a.get(i10).a(typeT, set, this);
                            if (hVar2 != null) {
                                eVar.a(hVar2);
                                eVar.c(true);
                                return hVar2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + Util.y(typeT, set));
                    } catch (IllegalArgumentException e10) {
                        throw eVar.b(e10);
                    }
                } catch (Throwable th2) {
                    eVar.c(false);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @fj.c
    public <T> h<T> h(Type type, Class<? extends Annotation>... clsArr) {
        if (clsArr.length == 1) {
            return e(type, clsArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(clsArr.length);
        for (Class<? extends Annotation> cls : clsArr) {
            linkedHashSet.add(a0.d(cls));
        }
        return f(type, Collections.unmodifiableSet(linkedHashSet));
    }

    @fj.c
    public c l() {
        c cVar = new c();
        int i10 = this.f267310b;
        for (int i11 = 0; i11 < i10; i11++) {
            cVar.a(this.f267309a.get(i11));
        }
        int size = this.f267309a.size() - f267308e.size();
        for (int i12 = this.f267310b; i12 < size; i12++) {
            cVar.e(this.f267309a.get(i12));
        }
        return cVar;
    }

    @fj.c
    public <T> h<T> m(h.e eVar, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeT = Util.t(Util.b(type));
        int iIndexOf = this.f267309a.indexOf(eVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = this.f267309a.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            h<T> hVar = (h<T>) this.f267309a.get(i10).a(typeT, set, this);
            if (hVar != null) {
                return hVar;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + Util.y(typeT, set));
    }
}

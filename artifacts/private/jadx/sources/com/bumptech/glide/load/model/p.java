package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f96867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f96868b;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C0867a<?>> f96869a = new HashMap();

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.p$a$a, reason: collision with other inner class name */
        private static class C0867a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List<n<Model, ?>> f96870a;

            public C0867a(List<n<Model, ?>> list) {
                this.f96870a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f96869a.clear();
        }

        @p0
        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
            C0867a<?> c0867a = this.f96869a.get(cls);
            if (c0867a == null) {
                return null;
            }
            return (List<n<Model, ?>>) c0867a.f96870a;
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
            if (this.f96869a.put(cls, new C0867a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(@NonNull androidx.core.util.s.a<List<Throwable>> aVar) {
        this(new r(aVar));
    }

    @NonNull
    private static <A> Class<A> c(@NonNull A a10) {
        return (Class<A>) a10.getClass();
    }

    @NonNull
    private synchronized <A> List<n<A, ?>> f(@NonNull Class<A> cls) {
        List<n<A, ?>> listB;
        try {
            listB = this.f96868b.b(cls);
            if (listB == null) {
                listB = Collections.unmodifiableList(this.f96867a.e(cls));
                this.f96868b.c(cls, listB);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return listB;
    }

    private <Model, Data> void j(@NonNull List<o<? extends Model, ? extends Data>> list) {
        Iterator<o<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
        try {
            this.f96867a.b(cls, cls2, oVar);
            this.f96868b.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized <Model, Data> n<Model, Data> b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f96867a.d(cls, cls2);
    }

    @NonNull
    public synchronized List<Class<?>> d(@NonNull Class<?> cls) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f96867a.g(cls);
    }

    @NonNull
    public <A> List<n<A, ?>> e(@NonNull A a10) {
        List<n<A, ?>> listF = f(c(a10));
        if (listF.isEmpty()) {
            throw new com.bumptech.glide.j.c(a10);
        }
        int size = listF.size();
        List<n<A, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n<A, ?> nVar = listF.get(i10);
            if (nVar.b(a10)) {
                if (z10) {
                    arrayList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                arrayList.add(nVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new com.bumptech.glide.j.c(a10, listF);
        }
        return arrayList;
    }

    public synchronized <Model, Data> void g(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
        try {
            this.f96867a.i(cls, cls2, oVar);
            this.f96868b.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized <Model, Data> void h(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            j(this.f96867a.j(cls, cls2));
            this.f96868b.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
        j(this.f96867a.k(cls, cls2, oVar));
        this.f96868b.a();
    }

    private p(@NonNull r rVar) {
        this.f96868b = new a();
        this.f96867a = rVar;
    }
}

package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f96880e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n<Object, Object> f96881f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f96882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f96883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f96884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.util.s.a<List<Throwable>> f96885d;

    private static class a implements n<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.model.n
        @p0
        public n.a<Object> a(@NonNull Object obj, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
            return null;
        }

        @Override // com.bumptech.glide.load.model.n
        public boolean b(@NonNull Object obj) {
            return false;
        }
    }

    private static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<Model> f96886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<Data> f96887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? extends Model, ? extends Data> f96888c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
            this.f96886a = cls;
            this.f96887b = cls2;
            this.f96888c = oVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f96886a.isAssignableFrom(cls);
        }

        public boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return a(cls) && this.f96887b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        @NonNull
        public <Model, Data> q<Model, Data> a(@NonNull List<n<Model, Data>> list, @NonNull androidx.core.util.s.a<List<Throwable>> aVar) {
            return new q<>(list, aVar);
        }
    }

    public r(@NonNull androidx.core.util.s.a<List<Throwable>> aVar) {
        this(aVar, f96880e);
    }

    private <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, oVar);
        List<b<?, ?>> list = this.f96882a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    @NonNull
    private <Model, Data> n<Model, Data> c(@NonNull b<?, ?> bVar) {
        return (n) com.bumptech.glide.util.k.d(bVar.f96888c.c(this));
    }

    @NonNull
    private static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>) f96881f;
    }

    @NonNull
    private <Model, Data> o<Model, Data> h(@NonNull b<?, ?> bVar) {
        return (o<Model, Data>) bVar.f96888c;
    }

    synchronized <Model, Data> void b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    @NonNull
    public synchronized <Model, Data> n<Model, Data> d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f96882a) {
                if (this.f96884c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f96884c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f96884c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f96883b.a(arrayList, this.f96885d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z10) {
                throw new com.bumptech.glide.j.c((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f96884c.clear();
            throw th2;
        }
    }

    @NonNull
    synchronized <Model> List<n<Model, ?>> e(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f96882a) {
                if (!this.f96884c.contains(bVar) && bVar.a(cls)) {
                    this.f96884c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f96884c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f96884c.clear();
            throw th2;
        }
        return arrayList;
    }

    @NonNull
    synchronized List<Class<?>> g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f96882a) {
                if (!arrayList.contains(bVar.f96887b) && bVar.a(cls)) {
                    arrayList.add(bVar.f96887b);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
        try {
            a(cls, cls2, oVar, false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    synchronized <Model, Data> List<o<? extends Model, ? extends Data>> j(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<b<?, ?>> it = this.f96882a.iterator();
            while (it.hasNext()) {
                b<?, ?> next = it.next();
                if (next.b(cls, cls2)) {
                    it.remove();
                    arrayList.add(h(next));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @NonNull
    synchronized <Model, Data> List<o<? extends Model, ? extends Data>> k(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
        List<o<? extends Model, ? extends Data>> listJ;
        listJ = j(cls, cls2);
        b(cls, cls2, oVar);
        return listJ;
    }

    @l1
    r(@NonNull androidx.core.util.s.a<List<Throwable>> aVar, @NonNull c cVar) {
        this.f96882a = new ArrayList();
        this.f96884c = new HashSet();
        this.f96885d = aVar;
        this.f96883b = cVar;
    }
}

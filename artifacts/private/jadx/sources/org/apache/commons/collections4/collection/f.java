package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class f<E> extends a<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335614d = 8692300188161871514L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final w0<? super E, ? extends E> f335615c;

    protected f(Collection<E> collection, w0<? super E, ? extends E> w0Var) {
        super(collection);
        if (w0Var == null) {
            throw new NullPointerException("Transformer must not be null");
        }
        this.f335615c = w0Var;
    }

    public static <E> f<E> l(Collection<E> collection, w0<? super E, ? extends E> w0Var) {
        f<E> fVar = new f<>(collection, w0Var);
        if (collection.size() > 0) {
            Object[] array = collection.toArray();
            collection.clear();
            for (Object obj : array) {
                fVar.c().add(w0Var.a(obj));
            }
        }
        return fVar;
    }

    public static <E> f<E> m(Collection<E> collection, w0<? super E, ? extends E> w0Var) {
        return new f<>(collection, w0Var);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(E e10) {
        return c().add(i(e10));
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return c().addAll(k(collection));
    }

    protected E i(E e10) {
        return this.f335615c.a(e10);
    }

    protected Collection<E> k(Collection<? extends E> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(i(it.next()));
        }
        return arrayList;
    }
}

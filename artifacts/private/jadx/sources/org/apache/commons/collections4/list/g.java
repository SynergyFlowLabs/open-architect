package org.apache.commons.collections4.list;

import java.util.List;
import org.apache.commons.collections4.n;

/* JADX INFO: loaded from: classes14.dex */
public class g<E> extends c<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f335934f = -1708388017160694542L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n<? extends E> f335935e;

    protected g(List<E> list, n<? extends E> nVar) {
        super(list);
        if (nVar == null) {
            throw new IllegalArgumentException("Factory must not be null");
        }
        this.f335935e = nVar;
    }

    public static <E> g<E> k(List<E> list, n<? extends E> nVar) {
        return new g<>(list, nVar);
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public E get(int i10) {
        int size = c().size();
        if (i10 < size) {
            E e10 = c().get(i10);
            if (e10 != null) {
                return e10;
            }
            E eK = this.f335935e.k();
            c().set(i10, eK);
            return eK;
        }
        while (size < i10) {
            c().add(null);
            size++;
        }
        E eK2 = this.f335935e.k();
        c().add(eK2);
        return eK2;
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public List<E> subList(int i10, int i11) {
        return new g(c().subList(i10, i11), this.f335935e);
    }
}

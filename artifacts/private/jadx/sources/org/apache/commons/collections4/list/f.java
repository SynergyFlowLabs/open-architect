package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class f<E> extends c<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335933e = -3620001881672L;

    public f() {
        super(new ArrayList());
    }

    public static <E> f<E> k(List<E> list) {
        return new f<>(list);
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public void add(int i10, E e10) {
        int size = c().size();
        if (i10 > size) {
            c().addAll(Collections.nCopies(i10 - size, null));
        }
        c().add(i10, e10);
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        boolean z10;
        int size = c().size();
        if (i10 > size) {
            c().addAll(Collections.nCopies(i10 - size, null));
            z10 = true;
        } else {
            z10 = false;
        }
        return c().addAll(i10, collection) | z10;
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public E set(int i10, E e10) {
        int size = c().size();
        if (i10 >= size) {
            c().addAll(Collections.nCopies((i10 - size) + 1, null));
        }
        return c().set(i10, e10);
    }

    public f(int i10) {
        super(new ArrayList(i10));
    }

    protected f(List<E> list) {
        super(list);
    }
}

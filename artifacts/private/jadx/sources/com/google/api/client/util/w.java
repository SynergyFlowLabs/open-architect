package com.google.api.client.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class w {
    private w() {
    }

    public static <E> ArrayList<E> a() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> b(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new ArrayList<>(m.a(iterable)) : c(iterable.iterator());
    }

    public static <E> ArrayList<E> c(Iterator<? extends E> it) {
        ArrayList<E> arrayListA = a();
        while (it.hasNext()) {
            arrayListA.add(it.next());
        }
        return arrayListA;
    }

    public static <E> ArrayList<E> d(int i10) {
        return new ArrayList<>(i10);
    }
}

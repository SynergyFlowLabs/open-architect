package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class b<E extends Comparable<? super E>> implements Comparator<E>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335622a = -291439688585137865L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f335623b = new b();

    public static <E extends Comparable<? super E>> b<E> a() {
        return f335623b;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(E e10, E e11) {
        return e10.compareTo(e11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this != obj && (obj == null || !obj.getClass().equals(getClass()))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1769708912;
    }
}

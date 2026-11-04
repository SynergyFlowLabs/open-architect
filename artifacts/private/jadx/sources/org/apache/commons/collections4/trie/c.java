package org.apache.commons.collections4.trie;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<K> implements Comparator<K>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336375a = -20497563720380683L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f336376b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f336377c = -2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f336378d = -3;

    static boolean d(int i10) {
        return i10 == -2;
    }

    static boolean e(int i10) {
        return i10 == -1;
    }

    static boolean f(int i10) {
        return i10 == -3;
    }

    static boolean h(int i10) {
        return i10 >= 0;
    }

    public abstract int a(K k10, int i10, int i11, K k11, int i12, int i13);

    public abstract int b();

    public abstract boolean c(K k10, int i10, int i11);

    @Override // java.util.Comparator
    public int compare(K k10, K k11) {
        if (k10 == null) {
            return k11 == null ? 0 : -1;
        }
        if (k11 == null) {
            return 1;
        }
        return ((Comparable) k10).compareTo(k11);
    }

    public abstract boolean g(K k10, int i10, int i11, K k11);

    public abstract int i(K k10);
}

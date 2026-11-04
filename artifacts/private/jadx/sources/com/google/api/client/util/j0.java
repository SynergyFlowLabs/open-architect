package com.google.api.client.util;

import java.util.HashSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {
    private j0() {
    }

    public static <E> HashSet<E> a() {
        return new HashSet<>();
    }

    public static <E extends Comparable<?>> TreeSet<E> b() {
        return new TreeSet<>();
    }
}

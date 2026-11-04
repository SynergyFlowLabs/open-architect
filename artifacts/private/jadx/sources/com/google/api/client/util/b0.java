package com.google.api.client.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {
    private b0() {
    }

    public static <K, V> HashMap<K, V> a() {
        return new HashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> b() {
        return new LinkedHashMap<>();
    }

    public static <K extends Comparable<?>, V> TreeMap<K, V> c() {
        return new TreeMap<>();
    }
}

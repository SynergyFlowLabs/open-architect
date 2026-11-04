package com.google.firebase.inappmessaging.display.dagger.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class e<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, V> f122177a;

    private e(int i10) {
        this.f122177a = a.d(i10);
    }

    public static <K, V> e<K, V> b(int i10) {
        return new e<>(i10);
    }

    public Map<K, V> a() {
        return this.f122177a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f122177a);
    }

    public e<K, V> c(K k10, V v10) {
        this.f122177a.put(k10, v10);
        return this;
    }

    public e<K, V> d(Map<K, V> map) {
        this.f122177a.putAll(map);
        return this;
    }
}

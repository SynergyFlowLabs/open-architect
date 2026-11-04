package com.google.common.cache;

import com.google.common.base.j0;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes4.dex */
@i
@com.google.common.annotations.b
public final class a0<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f116726b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f116727a;

    private a0(@fj.a K key, @fj.a V value, v cause) {
        super(key, value);
        this.f116727a = (v) j0.E(cause);
    }

    public static <K, V> a0<K, V> a(@fj.a K key, @fj.a V value, v cause) {
        return new a0<>(key, value, cause);
    }

    public v b() {
        return this.f116727a;
    }

    public boolean c() {
        return this.f116727a.l();
    }
}

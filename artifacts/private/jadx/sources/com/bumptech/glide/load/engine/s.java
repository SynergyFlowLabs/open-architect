package com.bumptech.glide.load.engine;

import androidx.annotation.l1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.g, l<?>> f96740a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.g, l<?>> f96741b = new HashMap();

    s() {
    }

    private Map<com.bumptech.glide.load.g, l<?>> c(boolean z10) {
        return z10 ? this.f96741b : this.f96740a;
    }

    l<?> a(com.bumptech.glide.load.g gVar, boolean z10) {
        return c(z10).get(gVar);
    }

    @l1
    Map<com.bumptech.glide.load.g, l<?>> b() {
        return Collections.unmodifiableMap(this.f96740a);
    }

    void d(com.bumptech.glide.load.g gVar, l<?> lVar) {
        c(lVar.q()).put(gVar, lVar);
    }

    void e(com.bumptech.glide.load.g gVar, l<?> lVar) {
        Map<com.bumptech.glide.load.g, l<?>> mapC = c(lVar.q());
        if (lVar.equals(mapC.get(gVar))) {
            mapC.remove(gVar);
        }
    }
}

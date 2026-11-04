package com.bumptech.glide.provider;

import androidx.annotation.p0;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.resource.transcode.g;
import com.bumptech.glide.util.j;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t<?, ?, ?> f97246c = new t<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.a<j, t<?, ?, ?>> f97247a = new androidx.collection.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<j> f97248b = new AtomicReference<>();

    private j b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f97248b.getAndSet(null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    @p0
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f97247a) {
            try {
                tVar = (t) this.f97247a.get(jVarB);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f97248b.set(jVarB);
        return tVar;
    }

    public boolean c(@p0 t<?, ?, ?> tVar) {
        return f97246c.equals(tVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @p0 t<?, ?, ?> tVar) {
        synchronized (this.f97247a) {
            try {
                androidx.collection.a<j, t<?, ?, ?>> aVar = this.f97247a;
                j jVar = new j(cls, cls2, cls3);
                if (tVar == null) {
                    tVar = f97246c;
                }
                aVar.put(jVar, tVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

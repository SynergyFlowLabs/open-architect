package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.util.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<j> f97249a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<j, List<Class<?>>> f97250b = new androidx.collection.a<>();

    public void a() {
        synchronized (this.f97250b) {
            try {
                this.f97250b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @p0
    public List<Class<?>> b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f97249a.getAndSet(null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.f97250b) {
            try {
                list = this.f97250b.get(andSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f97249a.set(andSet);
        return list;
    }

    public void c(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f97250b) {
            try {
                this.f97250b.put(new j(cls, cls2, cls3), list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C0871a<?>> f97242a = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.provider.a$a, reason: collision with other inner class name */
    private static final class C0871a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f97243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.d<T> f97244b;

        C0871a(@NonNull Class<T> cls, @NonNull com.bumptech.glide.load.d<T> dVar) {
            this.f97243a = cls;
            this.f97244b = dVar;
        }

        boolean a(@NonNull Class<?> cls) {
            return this.f97243a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@NonNull Class<T> cls, @NonNull com.bumptech.glide.load.d<T> dVar) {
        try {
            this.f97242a.add(new C0871a<>(cls, dVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @p0
    public synchronized <T> com.bumptech.glide.load.d<T> b(@NonNull Class<T> cls) {
        for (C0871a<?> c0871a : this.f97242a) {
            if (c0871a.a(cls)) {
                return (com.bumptech.glide.load.d<T>) c0871a.f97244b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@NonNull Class<T> cls, @NonNull com.bumptech.glide.load.d<T> dVar) {
        try {
            this.f97242a.add(0, new C0871a<>(cls, dVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

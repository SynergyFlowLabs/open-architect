package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f97186a = new ArrayList();

    private static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<Z> f97187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<R> f97188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e<Z, R> f97189c;

        a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
            this.f97187a = cls;
            this.f97188b = cls2;
            this.f97189c = eVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f97187a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f97188b);
        }
    }

    @NonNull
    public synchronized <Z, R> e<Z, R> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        try {
            if (cls2.isAssignableFrom(cls)) {
                return g.b();
            }
            for (a<?, ?> aVar : this.f97186a) {
                if (aVar.a(cls, cls2)) {
                    return (e<Z, R>) aVar.f97189c;
                }
            }
            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            if (cls2.isAssignableFrom(cls)) {
                arrayList.add(cls2);
                return arrayList;
            }
            Iterator<a<?, ?>> it = this.f97186a.iterator();
            while (it.hasNext()) {
                if (it.next().a(cls, cls2)) {
                    arrayList.add(cls2);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized <Z, R> void c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
        try {
            this.f97186a.add(new a<>(cls, cls2, eVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

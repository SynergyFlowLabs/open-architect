package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.m;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<?>> f97256a = new ArrayList();

    private static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f97257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final m<T> f97258b;

        a(@NonNull Class<T> cls, @NonNull m<T> mVar) {
            this.f97257a = cls;
            this.f97258b = mVar;
        }

        boolean a(@NonNull Class<?> cls) {
            return this.f97257a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@NonNull Class<Z> cls, @NonNull m<Z> mVar) {
        try {
            this.f97256a.add(new a<>(cls, mVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @p0
    public synchronized <Z> m<Z> b(@NonNull Class<Z> cls) {
        try {
            int size = this.f97256a.size();
            for (int i10 = 0; i10 < size; i10++) {
                a<?> aVar = this.f97256a.get(i10);
                if (aVar.a(cls)) {
                    return (m<Z>) aVar.f97258b;
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized <Z> void c(@NonNull Class<Z> cls, @NonNull m<Z> mVar) {
        this.f97256a.add(0, new a<>(cls, mVar));
    }
}

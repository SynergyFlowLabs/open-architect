package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97494a = "FactoryPools";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f97495b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g<Object> f97496c = new C0874a();

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.a$a, reason: collision with other inner class name */
    class C0874a implements g<Object> {
        C0874a() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        public void a(@NonNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements d<List<T>> {
        b() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> k() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull List<T> list) {
            list.clear();
        }
    }

    public interface d<T> {
        T k();
    }

    private static final class e<T> implements s.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<T> f97497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g<T> f97498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s.a<T> f97499c;

        e(@NonNull s.a<T> aVar, @NonNull d<T> dVar, @NonNull g<T> gVar) {
            this.f97499c = aVar;
            this.f97497a = dVar;
            this.f97498b = gVar;
        }

        @Override // androidx.core.util.s.a
        public boolean a(@NonNull T t10) {
            if (t10 instanceof f) {
                ((f) t10).k().b(true);
            }
            this.f97498b.a(t10);
            return this.f97499c.a(t10);
        }

        @Override // androidx.core.util.s.a
        public T acquire() {
            T tAcquire = this.f97499c.acquire();
            if (tAcquire == null) {
                tAcquire = this.f97497a.k();
                if (Log.isLoggable(a.f97494a, 2)) {
                    tAcquire.getClass().toString();
                }
            }
            if (tAcquire instanceof f) {
                ((f) tAcquire).k().b(false);
            }
            return tAcquire;
        }
    }

    public interface f {
        @NonNull
        com.bumptech.glide.util.pool.c k();
    }

    public interface g<T> {
        void a(@NonNull T t10);
    }

    private a() {
    }

    @NonNull
    private static <T extends f> s.a<T> a(@NonNull s.a<T> aVar, @NonNull d<T> dVar) {
        return b(aVar, dVar, c());
    }

    @NonNull
    private static <T> s.a<T> b(@NonNull s.a<T> aVar, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    @NonNull
    private static <T> g<T> c() {
        return (g<T>) f97496c;
    }

    @NonNull
    public static <T extends f> s.a<T> d(int i10, @NonNull d<T> dVar) {
        return a(new s.b(i10), dVar);
    }

    @NonNull
    public static <T extends f> s.a<T> e(int i10, @NonNull d<T> dVar) {
        return a(new s.c(i10), dVar);
    }

    @NonNull
    public static <T> s.a<List<T>> f() {
        return g(20);
    }

    @NonNull
    public static <T> s.a<List<T>> g(int i10) {
        return b(new s.c(i10), new b(), new c());
    }
}

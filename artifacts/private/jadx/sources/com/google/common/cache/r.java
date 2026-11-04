package com.google.common.cache;

import com.google.common.base.s0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@i
@com.google.common.annotations.b(emulated = true)
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s0<q> f116975a;

    class a implements s0<q> {
        a() {
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q get() {
            return new s();
        }
    }

    class b implements s0<q> {
        b() {
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q get() {
            return new c(null);
        }
    }

    private static final class c extends AtomicLong implements q {
        private c() {
        }

        @Override // com.google.common.cache.q
        public void a() {
            getAndIncrement();
        }

        @Override // com.google.common.cache.q
        public void add(long x10) {
            getAndAdd(x10);
        }

        @Override // com.google.common.cache.q
        public long sum() {
            return get();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        s0<q> bVar;
        try {
            new s();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f116975a = bVar;
    }

    r() {
    }

    public static q a() {
        return f116975a.get();
    }
}

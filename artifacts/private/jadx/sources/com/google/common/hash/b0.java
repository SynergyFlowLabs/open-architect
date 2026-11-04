package com.google.common.hash;

import com.google.common.base.s0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@k
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s0<a0> f118752a;

    class a implements s0<a0> {
        a() {
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 get() {
            return new c0();
        }
    }

    class b implements s0<a0> {
        b() {
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 get() {
            return new c(null);
        }
    }

    private static final class c extends AtomicLong implements a0 {
        private c() {
        }

        @Override // com.google.common.hash.a0
        public void a() {
            getAndIncrement();
        }

        @Override // com.google.common.hash.a0
        public void add(long x10) {
            getAndAdd(x10);
        }

        @Override // com.google.common.hash.a0
        public long sum() {
            return get();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        s0<a0> bVar;
        try {
            new c0();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f118752a = bVar;
    }

    b0() {
    }

    public static a0 a() {
        return f118752a.get();
    }
}

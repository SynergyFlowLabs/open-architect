package com.google.common.util.concurrent;

import com.google.common.collect.z9;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@o0
@r9.h(r9.h.a.FULL)
@com.google.common.annotations.b(emulated = true)
abstract class u<OutputT> extends f.j<OutputT> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final b f120333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final s1 f120334l = new s1(u.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.a
    private volatile Set<Throwable> f120335i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile int f120336j;

    private static abstract class b {
        private b() {
        }

        abstract void a(u<?> state, @fj.a Set<Throwable> expect, Set<Throwable> update);

        abstract int b(u<?> state);
    }

    private static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super u<?>, ? super Set<Throwable>> f120337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicIntegerFieldUpdater<? super u<?>> f120338b;

        c(AtomicReferenceFieldUpdater<? super u<?>, ? super Set<Throwable>> seenExceptionsUpdater, AtomicIntegerFieldUpdater<? super u<?>> remainingCountUpdater) {
            super();
            this.f120337a = seenExceptionsUpdater;
            this.f120338b = remainingCountUpdater;
        }

        @Override // com.google.common.util.concurrent.u.b
        void a(u<?> state, @fj.a Set<Throwable> expect, Set<Throwable> update) {
            androidx.concurrent.futures.b.a(this.f120337a, state, expect, update);
        }

        @Override // com.google.common.util.concurrent.u.b
        int b(u<?> state) {
            return this.f120338b.decrementAndGet(state);
        }
    }

    private static final class d extends b {
        private d() {
            super();
        }

        @Override // com.google.common.util.concurrent.u.b
        void a(u<?> state, @fj.a Set<Throwable> expect, Set<Throwable> update) {
            synchronized (state) {
                try {
                    if (((u) state).f120335i == expect) {
                        ((u) state).f120335i = update;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.u.b
        int b(u<?> state) {
            int iH;
            synchronized (state) {
                try {
                    iH = u.H(state);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iH;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b dVar;
        Throwable th2 = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(u.class, Set.class, androidx.media3.exoplayer.upstream.h.f65997k), AtomicIntegerFieldUpdater.newUpdater(u.class, "j"));
        } catch (Throwable th3) {
            dVar = new d();
            th2 = th3;
        }
        f120333k = dVar;
        if (th2 != null) {
            f120334l.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    u(int remainingFutures) {
        this.f120336j = remainingFutures;
    }

    static /* synthetic */ int H(u uVar) {
        int i10 = uVar.f120336j - 1;
        uVar.f120336j = i10;
        return i10;
    }

    abstract void I(Set<Throwable> seen);

    final void J() {
        this.f120335i = null;
    }

    final int K() {
        return f120333k.b(this);
    }

    final Set<Throwable> L() {
        Set<Throwable> set = this.f120335i;
        if (set != null) {
            return set;
        }
        Set<Throwable> setP = z9.p();
        I(setP);
        f120333k.a(this, null, setP);
        Set<Throwable> set2 = this.f120335i;
        Objects.requireNonNull(set2);
        return set2;
    }
}

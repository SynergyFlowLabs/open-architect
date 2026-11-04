package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
final class g3 extends c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<m3, Thread> f109127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<m3, m3> f109128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<? super n3<?>, m3> f109129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<? super n3<?>, f3> f109130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<? super n3<?>, Object> f109131e;

    g3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f109127a = atomicReferenceFieldUpdater;
        this.f109128b = atomicReferenceFieldUpdater2;
        this.f109129c = atomicReferenceFieldUpdater3;
        this.f109130d = atomicReferenceFieldUpdater4;
        this.f109131e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final f3 a(n3 n3Var, f3 f3Var) {
        return this.f109130d.getAndSet(n3Var, f3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final m3 b(n3 n3Var, m3 m3Var) {
        return this.f109129c.getAndSet(n3Var, m3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final void c(m3 m3Var, @fj.a m3 m3Var2) {
        this.f109128b.lazySet(m3Var, m3Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final void d(m3 m3Var, Thread thread) {
        this.f109127a.lazySet(m3Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final boolean e(n3 n3Var, @fj.a f3 f3Var, f3 f3Var2) {
        return o3.a(this.f109130d, n3Var, f3Var, f3Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final boolean f(n3 n3Var, @fj.a Object obj, Object obj2) {
        return o3.a(this.f109131e, n3Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    final boolean g(n3 n3Var, @fj.a m3 m3Var, @fj.a m3 m3Var2) {
        return o3.a(this.f109129c, n3Var, m3Var, m3Var2);
    }
}

package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
final class xa extends r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f109437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f109438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f109439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f109440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f109441e;

    xa(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f109437a = atomicReferenceFieldUpdater;
        this.f109438b = atomicReferenceFieldUpdater2;
        this.f109439c = atomicReferenceFieldUpdater3;
        this.f109440d = atomicReferenceFieldUpdater4;
        this.f109441e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final void a(yb ybVar, yb ybVar2) {
        this.f109438b.lazySet(ybVar, ybVar2);
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final void b(yb ybVar, Thread thread) {
        this.f109437a.lazySet(ybVar, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final boolean c(ac acVar, v8 v8Var, v8 v8Var2) {
        return w9.a(this.f109440d, acVar, v8Var, v8Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final boolean d(ac acVar, Object obj, Object obj2) {
        return w9.a(this.f109441e, acVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.r4
    final boolean e(ac acVar, yb ybVar, yb ybVar2) {
        return w9.a(this.f109439c, acVar, ybVar, ybVar2);
    }
}

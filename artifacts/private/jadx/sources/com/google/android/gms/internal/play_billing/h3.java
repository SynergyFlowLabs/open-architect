package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class h3<V> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final n3<V> f109142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l4<? extends V> f109143b;

    h3(n3 n3Var, l4 l4Var) {
        this.f109142a = n3Var;
        this.f109143b = l4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((n3) this.f109142a).f109233a != this) {
            return;
        }
        l4<? extends V> l4Var = this.f109143b;
        if (n3.f109231f.f(this.f109142a, this, n3.q(l4Var))) {
            n3.v(this.f109142a, false);
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1 f105957a;

    public a1(m1 m1Var) {
        this.f105957a = m1Var;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void a() {
        Iterator it = this.f105957a.f106128f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.a.f) it.next()).d();
        }
        this.f105957a.f106136n.f106082s = Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void b() throws Throwable {
        this.f105957a.d();
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void c(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final e.a d(e.a aVar) {
        this.f105957a.f106136n.f106074k.add(aVar);
        return aVar;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final e.a f(e.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void g(@androidx.annotation.p0 Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void h(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z10) {
    }
}

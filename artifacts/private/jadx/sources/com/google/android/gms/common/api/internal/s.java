package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.v;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class s<R extends com.google.android.gms.common.api.v> extends com.google.android.gms.common.api.o<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BasePendingResult f106195a;

    public s(@NonNull com.google.android.gms.common.api.p pVar) {
        this.f106195a = (BasePendingResult) pVar;
    }

    @Override // com.google.android.gms.common.api.p
    public final void c(@NonNull com.google.android.gms.common.api.p.a aVar) {
        this.f106195a.c(aVar);
    }

    @Override // com.google.android.gms.common.api.p
    @NonNull
    public final R d() {
        return (R) this.f106195a.d();
    }

    @Override // com.google.android.gms.common.api.p
    @NonNull
    public final R e(long j10, @NonNull TimeUnit timeUnit) {
        return (R) this.f106195a.e(j10, timeUnit);
    }

    @Override // com.google.android.gms.common.api.p
    public final void f() {
        this.f106195a.f();
    }

    @Override // com.google.android.gms.common.api.p
    public final boolean g() {
        return this.f106195a.g();
    }

    @Override // com.google.android.gms.common.api.p
    public final void h(@NonNull com.google.android.gms.common.api.w<? super R> wVar) {
        this.f106195a.h(wVar);
    }

    @Override // com.google.android.gms.common.api.p
    public final void i(@NonNull com.google.android.gms.common.api.w<? super R> wVar, long j10, @NonNull TimeUnit timeUnit) {
        this.f106195a.i(wVar, j10, timeUnit);
    }

    @Override // com.google.android.gms.common.api.p
    @NonNull
    public final <S extends com.google.android.gms.common.api.v> com.google.android.gms.common.api.z<S> j(@NonNull com.google.android.gms.common.api.y<? super R, ? extends S> yVar) {
        return this.f106195a.j(yVar);
    }

    @Override // com.google.android.gms.common.api.o
    @NonNull
    public final R k() {
        if (this.f106195a.m()) {
            return (R) this.f106195a.e(0L, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    @Override // com.google.android.gms.common.api.o
    public final boolean l() {
        return this.f106195a.m();
    }
}

package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class l<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f110999a = new q0();

    public l() {
    }

    @NonNull
    public Task<TResult> a() {
        return this.f110999a;
    }

    public void b(@NonNull Exception exc) {
        this.f110999a.x(exc);
    }

    public void c(@androidx.annotation.p0 TResult tresult) {
        this.f110999a.y(tresult);
    }

    public boolean d(@NonNull Exception exc) {
        return this.f110999a.A(exc);
    }

    public boolean e(@androidx.annotation.p0 TResult tresult) {
        return this.f110999a.B(tresult);
    }

    public l(@NonNull a aVar) {
        aVar.b(new m0(this));
    }
}

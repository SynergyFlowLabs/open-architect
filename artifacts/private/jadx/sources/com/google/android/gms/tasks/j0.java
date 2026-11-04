package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class j0<TResult, TContinuationResult> implements g<TContinuationResult>, f, e, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f110996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f110997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f110998c;

    public j0(@NonNull Executor executor, @NonNull k kVar, @NonNull q0 q0Var) {
        this.f110996a = executor;
        this.f110997b = kVar;
        this.f110998c = q0Var;
    }

    @Override // com.google.android.gms.tasks.e
    public final void a() {
        this.f110998c.z();
    }

    @Override // com.google.android.gms.tasks.g
    public final void b(TContinuationResult tcontinuationresult) {
        this.f110998c.y(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.k0
    public final void c(@NonNull Task task) {
        this.f110996a.execute(new i0(this, task));
    }

    @Override // com.google.android.gms.tasks.f
    public final void d(@NonNull Exception exc) {
        this.f110998c.x(exc);
    }

    @Override // com.google.android.gms.tasks.k0
    public final void h() {
        throw new UnsupportedOperationException();
    }
}

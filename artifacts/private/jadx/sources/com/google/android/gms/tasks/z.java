package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class z<TResult, TContinuationResult> implements g<TContinuationResult>, f, e, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f111040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f111041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f111042c;

    public z(@NonNull Executor executor, @NonNull c cVar, @NonNull q0 q0Var) {
        this.f111040a = executor;
        this.f111041b = cVar;
        this.f111042c = q0Var;
    }

    @Override // com.google.android.gms.tasks.e
    public final void a() {
        this.f111042c.z();
    }

    @Override // com.google.android.gms.tasks.g
    public final void b(TContinuationResult tcontinuationresult) {
        this.f111042c.y(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.k0
    public final void c(@NonNull Task task) {
        this.f111040a.execute(new y(this, task));
    }

    @Override // com.google.android.gms.tasks.f
    public final void d(@NonNull Exception exc) {
        this.f111042c.x(exc);
    }

    @Override // com.google.android.gms.tasks.k0
    public final void h() {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class x implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f111035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f111036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f111037c;

    public x(@NonNull Executor executor, @NonNull c cVar, @NonNull q0 q0Var) {
        this.f111035a = executor;
        this.f111036b = cVar;
        this.f111037c = q0Var;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void c(@NonNull Task task) {
        this.f111035a.execute(new w(this, task));
    }

    @Override // com.google.android.gms.tasks.k0
    public final void h() {
        throw new UnsupportedOperationException();
    }
}

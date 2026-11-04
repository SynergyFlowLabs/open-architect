package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class h0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f110991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f110992b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private g f110993c;

    public h0(@NonNull Executor executor, @NonNull g gVar) {
        this.f110991a = executor;
        this.f110993c = gVar;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void c(@NonNull Task task) {
        if (task.u()) {
            synchronized (this.f110992b) {
                try {
                    if (this.f110993c == null) {
                        return;
                    }
                    this.f110991a.execute(new g0(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.k0
    public final void h() {
        synchronized (this.f110992b) {
            try {
                this.f110993c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class f0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f110986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f110987b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private f f110988c;

    public f0(@NonNull Executor executor, @NonNull f fVar) {
        this.f110986a = executor;
        this.f110988c = fVar;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void c(@NonNull Task task) {
        if (task.u() || task.s()) {
            return;
        }
        synchronized (this.f110987b) {
            try {
                if (this.f110988c == null) {
                    return;
                }
                this.f110986a.execute(new e0(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.k0
    public final void h() {
        synchronized (this.f110987b) {
            this.f110988c = null;
        }
    }
}

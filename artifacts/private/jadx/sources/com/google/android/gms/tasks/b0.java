package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class b0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f110976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f110977b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private e f110978c;

    public b0(@NonNull Executor executor, @NonNull e eVar) {
        this.f110976a = executor;
        this.f110978c = eVar;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void c(@NonNull Task task) {
        if (task.s()) {
            synchronized (this.f110977b) {
                try {
                    if (this.f110978c == null) {
                        return;
                    }
                    this.f110976a.execute(new a0(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.k0
    public final void h() {
        synchronized (this.f110977b) {
            this.f110978c = null;
        }
    }
}

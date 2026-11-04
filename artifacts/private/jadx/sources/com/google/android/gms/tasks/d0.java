package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class d0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f110981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f110982b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private OnCompleteListener f110983c;

    public d0(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.f110981a = executor;
        this.f110983c = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void c(@NonNull Task task) {
        synchronized (this.f110982b) {
            try {
                if (this.f110983c == null) {
                    return;
                }
                this.f110981a.execute(new c0(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.k0
    public final void h() {
        synchronized (this.f110982b) {
            try {
                this.f110983c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

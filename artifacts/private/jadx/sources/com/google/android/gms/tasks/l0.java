package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f111000a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f111001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f111002c;

    l0() {
    }

    public final void a(@NonNull k0 k0Var) {
        synchronized (this.f111000a) {
            try {
                if (this.f111001b == null) {
                    this.f111001b = new ArrayDeque();
                }
                this.f111001b.add(k0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@NonNull Task task) {
        k0 k0Var;
        synchronized (this.f111000a) {
            try {
                if (this.f111001b != null && !this.f111002c) {
                    this.f111002c = true;
                    while (true) {
                        synchronized (this.f111000a) {
                            try {
                                k0Var = (k0) this.f111001b.poll();
                                if (k0Var == null) {
                                    this.f111002c = false;
                                    return;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        k0Var.c(task);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

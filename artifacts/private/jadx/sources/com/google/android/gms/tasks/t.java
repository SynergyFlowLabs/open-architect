package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
final class t<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f111022a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f111023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f111024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Exception f111028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f111029h;

    public t(int i10, q0 q0Var) {
        this.f111023b = i10;
        this.f111024c = q0Var;
    }

    private final void c() {
        if (this.f111025d + this.f111026e + this.f111027f == this.f111023b) {
            if (this.f111028g == null) {
                if (this.f111029h) {
                    this.f111024c.z();
                    return;
                } else {
                    this.f111024c.y(null);
                    return;
                }
            }
            this.f111024c.x(new ExecutionException(this.f111026e + " out of " + this.f111023b + " underlying tasks failed", this.f111028g));
        }
    }

    @Override // com.google.android.gms.tasks.e
    public final void a() {
        synchronized (this.f111022a) {
            try {
                this.f111027f++;
                this.f111029h = true;
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.g
    public final void b(T t10) {
        synchronized (this.f111022a) {
            try {
                this.f111025d++;
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.f
    public final void d(@NonNull Exception exc) {
        synchronized (this.f111022a) {
            this.f111026e++;
            this.f111028g = exc;
            c();
        }
    }
}

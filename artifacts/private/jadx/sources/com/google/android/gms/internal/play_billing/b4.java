package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
final class b4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Future f109054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a4 f109055b;

    b4(Future future, a4 a4Var) {
        this.f109054a = future;
        this.f109055b = a4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA;
        Object obj2 = this.f109054a;
        if ((obj2 instanceof a5) && (thA = b5.a((a5) obj2)) != null) {
            this.f109055b.b(thA);
            return;
        }
        try {
            Future future = this.f109054a;
            if (!future.isDone()) {
                throw new IllegalStateException(h0.a("Future was expected to be done: %s", future));
            }
            boolean z10 = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.f109055b.a(obj);
        } catch (ExecutionException e10) {
            this.f109055b.b(e10.getCause());
        } catch (Throwable th3) {
            this.f109055b.b(th3);
        }
    }

    public final String toString() {
        c0 c0VarA = e0.a(this);
        c0VarA.a(this.f109055b);
        return c0VarA.toString();
    }
}

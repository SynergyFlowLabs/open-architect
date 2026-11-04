package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private static d0 f105770e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f105771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f105772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f105773c = new x(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105774d = 1;

    @l1
    d0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f105772b = scheduledExecutorService;
        this.f105771a = context.getApplicationContext();
    }

    public static synchronized d0 b(Context context) {
        try {
            if (f105770e == null) {
                com.google.android.gms.internal.cloudmessaging.e.a();
                f105770e = new d0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.b("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f105770e;
    }

    private final synchronized int f() {
        int i10;
        try {
            i10 = this.f105774d;
            this.f105774d = i10 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    private final synchronized Task g(a0 a0Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(a0Var.toString());
            }
            if (!this.f105773c.g(a0Var)) {
                x xVar = new x(this, null);
                this.f105773c = xVar;
                xVar.g(a0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a0Var.f105755b.a();
    }

    public final Task c(int i10, Bundle bundle) {
        return g(new z(f(), i10, bundle));
    }

    public final Task d(int i10, Bundle bundle) {
        return g(new c0(f(), i10, bundle));
    }
}

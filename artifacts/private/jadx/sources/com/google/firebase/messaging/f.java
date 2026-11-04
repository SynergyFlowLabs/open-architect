package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f123564d = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f123565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f123566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f123567c;

    public f(Context context, q0 q0Var, ExecutorService executorService) {
        this.f123565a = executorService;
        this.f123566b = context;
        this.f123567c = q0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f123566b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.v.j()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f123566b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.importance != 100) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void c(d.a aVar) {
        ((NotificationManager) this.f123566b.getSystemService("notification")).notify(aVar.f123460b, aVar.f123461c, aVar.f123459a.h());
    }

    @androidx.annotation.p0
    private l0 d() {
        l0 l0VarD = l0.d(this.f123567c.p(e.c.f123493j));
        if (l0VarD != null) {
            l0VarD.f(this.f123565a);
        }
        return l0VarD;
    }

    private void e(androidx.core.app.w.n nVar, @androidx.annotation.p0 l0 l0Var) {
        if (l0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) com.google.android.gms.tasks.n.b(l0Var.e(), 5L, TimeUnit.SECONDS);
            nVar.b0(bitmap);
            nVar.z0(new androidx.core.app.w.k().D(bitmap).B(null));
        } catch (InterruptedException unused) {
            l0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Objects.toString(e10.getCause());
        } catch (TimeoutException unused2) {
            l0Var.close();
        }
    }

    boolean a() {
        if (this.f123567c.a(e.c.f123489f)) {
            return true;
        }
        if (b()) {
            return false;
        }
        l0 l0VarD = d();
        d.a aVarE = d.e(this.f123566b, this.f123567c);
        e(aVarE.f123459a, l0VarD);
        c(aVarE);
        return true;
    }
}

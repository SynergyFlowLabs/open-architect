package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f123665a = "com.google.firebase.iid.WakeLockHolder.wakefulintent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f123666b = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f123667c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("WakeLockHolder.syncObject")
    private static com.google.android.gms.stats.d f123668d;

    m1() {
    }

    @z7.u(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void b(Intent intent, long j10) {
        synchronized (f123667c) {
            try {
                if (f123668d != null) {
                    i(intent, true);
                    f123668d.a(j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.b0("WakeLockHolder.syncObject")
    private static void c(Context context) {
        if (f123668d == null) {
            com.google.android.gms.stats.d dVar = new com.google.android.gms.stats.d(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f123668d = dVar;
            dVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(@NonNull Intent intent) {
        synchronized (f123667c) {
            try {
                if (f123668d != null && f(intent)) {
                    i(intent, false);
                    f123668d.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @z7.u(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void e(Context context) {
        synchronized (f123667c) {
            c(context);
        }
    }

    @androidx.annotation.l1
    static boolean f(@NonNull Intent intent) {
        return intent.getBooleanExtra(f123665a, false);
    }

    @z7.u(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    static void g() {
        synchronized (f123667c) {
            try {
                f123668d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @e.a({"TaskMainThread"})
    static void h(Context context, r1 r1Var, final Intent intent) {
        synchronized (f123667c) {
            try {
                c(context);
                boolean zF = f(intent);
                i(intent, true);
                if (!zF) {
                    f123668d.a(f123666b);
                }
                r1Var.d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.l1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        m1.d(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(@NonNull Intent intent, boolean z10) {
        intent.putExtra(f123665a, z10);
    }

    static ComponentName j(@NonNull Context context, @NonNull Intent intent) {
        synchronized (f123667c) {
            try {
                c(context);
                boolean zF = f(intent);
                i(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zF) {
                    f123668d.a(f123666b);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
@g6.a
public class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f123669c = "rawData";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f123670d = "gcm.rawData64";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f123671e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private static r1 f123672f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f123673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f123674b;

    public n(Context context) {
        this.f123673a = context;
        this.f123674b = new androidx.media3.exoplayer.offline.b();
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z10, Task task) {
        return (com.google.android.gms.common.util.v.n() && ((Integer) task.q()).intValue() == 402) ? e(context, intent, z10).m(new androidx.media3.exoplayer.offline.b(), new com.google.android.gms.tasks.c() { // from class: com.google.firebase.messaging.j
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task2) {
                return n.d(task2);
            }
        }) : task;
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer d(Task task) {
        return 403;
    }

    private static Task<Integer> e(Context context, Intent intent, boolean z10) {
        r1 r1VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return r1VarF.d(intent).m(new androidx.media3.exoplayer.offline.b(), new com.google.android.gms.tasks.c() { // from class: com.google.firebase.messaging.m
                @Override // com.google.android.gms.tasks.c
                public final Object a(Task task) {
                    return n.c(task);
                }
            });
        }
        if (b1.b().e(context)) {
            m1.h(context, r1VarF, intent);
        } else {
            r1VarF.d(intent);
        }
        return com.google.android.gms.tasks.n.g(-1);
    }

    private static r1 f(Context context, String str) {
        r1 r1Var;
        synchronized (f123671e) {
            try {
                if (f123672f == null) {
                    f123672f = new r1(context, str);
                }
                r1Var = f123672f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r1Var;
    }

    @androidx.annotation.l1
    public static void h() {
        synchronized (f123671e) {
            try {
                f123672f = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.l1
    public static void i(r1 r1Var) {
        synchronized (f123671e) {
            try {
                f123672f = r1Var;
            } finally {
            }
        }
    }

    @g6.a
    public Task<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra(f123670d);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(f123670d);
        }
        return j(this.f123673a, intent);
    }

    @e.a({"InlinedApi"})
    public Task<Integer> j(final Context context, final Intent intent) {
        boolean z10 = com.google.android.gms.common.util.v.n() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? com.google.android.gms.tasks.n.d(this.f123674b, new Callable() { // from class: com.google.firebase.messaging.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(b1.b().h(context, intent));
            }
        }).o(this.f123674b, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.messaging.l
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task) {
                return n.a(context, intent, z11, task);
            }
        }) : e(context, intent, z11);
    }

    public n(Context context, ExecutorService executorService) {
        this.f123673a = context;
        this.f123674b = executorService;
    }
}

package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
class j1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f123630i = "INTERNAL_SERVER_ERROR";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f123631j = "SERVICE_NOT_AVAILABLE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f123632k = 30;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f123633l = 30;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f123634m = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f123635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f123636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0 f123637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f123638d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f123640f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h1 f123642h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("pendingOperations")
    private final Map<String, ArrayDeque<com.google.android.gms.tasks.l<Void>>> f123639e = new androidx.collection.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f123641g = false;

    private j1(FirebaseMessaging firebaseMessaging, p0 p0Var, h1 h1Var, j0 j0Var, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f123638d = firebaseMessaging;
        this.f123636b = p0Var;
        this.f123642h = h1Var;
        this.f123637c = j0Var;
        this.f123635a = context;
        this.f123640f = scheduledExecutorService;
    }

    public static /* synthetic */ j1 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, p0 p0Var, j0 j0Var) {
        return new j1(firebaseMessaging, p0Var, h1.d(context, scheduledExecutorService), j0Var, context, scheduledExecutorService);
    }

    private void b(g1 g1Var, com.google.android.gms.tasks.l<Void> lVar) {
        ArrayDeque<com.google.android.gms.tasks.l<Void>> arrayDeque;
        synchronized (this.f123639e) {
            try {
                String strE = g1Var.e();
                if (this.f123639e.containsKey(strE)) {
                    arrayDeque = this.f123639e.get(strE);
                } else {
                    ArrayDeque<com.google.android.gms.tasks.l<Void>> arrayDeque2 = new ArrayDeque<>();
                    this.f123639e.put(strE, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(lVar);
            } finally {
            }
        }
    }

    @androidx.annotation.m1
    private static <T> void c(Task<T> task) throws IOException {
        try {
            com.google.android.gms.tasks.n.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException(f123631j, e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    @androidx.annotation.m1
    private void d(String str) throws IOException {
        c(this.f123637c.m(this.f123638d.r(), str));
    }

    @androidx.annotation.m1
    private void e(String str) throws IOException {
        c(this.f123637c.n(this.f123638d.r(), str));
    }

    @androidx.annotation.l1
    static Task<j1> f(final FirebaseMessaging firebaseMessaging, final p0 p0Var, final j0 j0Var, final Context context, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        return com.google.android.gms.tasks.n.d(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.i1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j1.a(context, scheduledExecutorService, firebaseMessaging, p0Var, j0Var);
            }
        });
    }

    static boolean i() {
        return Log.isLoggable(e.f123469a, 3);
    }

    private void k(g1 g1Var) {
        synchronized (this.f123639e) {
            try {
                String strE = g1Var.e();
                if (this.f123639e.containsKey(strE)) {
                    ArrayDeque<com.google.android.gms.tasks.l<Void>> arrayDeque = this.f123639e.get(strE);
                    com.google.android.gms.tasks.l<Void> lVarPoll = arrayDeque.poll();
                    if (lVarPoll != null) {
                        lVarPoll.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f123639e.remove(strE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void p() {
        if (j()) {
            return;
        }
        t(0L);
    }

    @androidx.annotation.l1
    h1 g() {
        return this.f123642h;
    }

    boolean h() {
        return this.f123642h.e() != null;
    }

    synchronized boolean j() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f123641g;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @androidx.annotation.m1
    boolean l(g1 g1Var) throws IOException {
        byte b10;
        try {
            String strB = g1Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (strB.equals(androidx.exifinterface.media.a.S4)) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                d(g1Var.c());
                if (i()) {
                    g1Var.c();
                }
            } else if (b10 != 1) {
                i();
            } else {
                e(g1Var.c());
                if (i()) {
                    g1Var.c();
                }
            }
            return true;
        } catch (IOException e10) {
            if (f123631j.equals(e10.getMessage()) || f123630i.equals(e10.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                e10.getMessage();
                return false;
            }
            if (e10.getMessage() == null) {
                return false;
            }
            throw e10;
        }
    }

    void m(Runnable runnable, long j10) {
        this.f123640f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    @androidx.annotation.l1
    Task<Void> n(g1 g1Var) {
        this.f123642h.a(g1Var);
        com.google.android.gms.tasks.l<Void> lVar = new com.google.android.gms.tasks.l<>();
        b(g1Var, lVar);
        return lVar.a();
    }

    synchronized void o(boolean z10) {
        this.f123641g = z10;
    }

    void q() {
        if (h()) {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> r(String str) {
        Task<Void> taskN = n(g1.f(str));
        q();
        return taskN;
    }

    @androidx.annotation.m1
    boolean s() throws IOException {
        while (true) {
            synchronized (this) {
                try {
                    g1 g1VarE = this.f123642h.e();
                    if (g1VarE == null) {
                        i();
                        int i10 = 4 >> 1;
                        return true;
                    }
                    if (!l(g1VarE)) {
                        return false;
                    }
                    this.f123642h.i(g1VarE);
                    k(g1VarE);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    void t(long j10) {
        m(new k1(this, this.f123635a, this.f123636b, Math.min(Math.max(30L, 2 * j10), f123634m)), j10);
        o(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> u(String str) {
        Task<Void> taskN = n(g1.g(str));
        q();
        return taskN;
    }
}

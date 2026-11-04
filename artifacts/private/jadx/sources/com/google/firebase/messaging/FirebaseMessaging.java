package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f123329m = "FirebaseMessaging";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f123330n = "com.google.android.gms";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f123331o = "com.google.android.gcm.intent.SEND";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f123332p = "app";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final String f123333q = "FCM";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f123334r = 30;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f123336t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.b0("FirebaseMessaging.class")
    private static e1 f123337u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.b0("FirebaseMessaging.class")
    @androidx.annotation.l1
    static ScheduledExecutorService f123339w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.h f123340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final p8.a f123341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f123342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0 f123343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z0 f123344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f123345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f123346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f123347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Task<j1> f123348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p0 f123349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f123350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f123351l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f123335s = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.l1
    static z8.b<com.google.android.datatransport.m> f123338v = new z8.b() { // from class: com.google.firebase.messaging.y
        @Override // z8.b
        public final Object get() {
            return FirebaseMessaging.h();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f123352f = "firebase_messaging_auto_init_enabled";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f123353g = "com.google.firebase.messaging";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f123354h = "auto_init";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m8.d f123355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private boolean f123356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.b0("this")
        @androidx.annotation.p0
        private m8.b<com.google.firebase.c> f123357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.b0("this")
        @androidx.annotation.p0
        private Boolean f123358d;

        a(m8.d dVar) {
            this.f123355a = dVar;
        }

        public static /* synthetic */ void a(a aVar, m8.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.S();
            }
        }

        @androidx.annotation.p0
        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextN = FirebaseMessaging.this.f123340a.n();
            SharedPreferences sharedPreferences = contextN.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(f123354h)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(f123354h, false));
            }
            try {
                PackageManager packageManager = contextN.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextN.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f123352f)) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean(f123352f));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return null;
        }

        synchronized void b() {
            try {
                if (this.f123356b) {
                    return;
                }
                Boolean boolD = d();
                this.f123358d = boolD;
                if (boolD == null) {
                    m8.b<com.google.firebase.c> bVar = new m8.b() { // from class: com.google.firebase.messaging.g0
                        @Override // m8.b
                        public final void a(m8.a aVar) {
                            FirebaseMessaging.a.a(this.f123578a, aVar);
                        }
                    };
                    this.f123357c = bVar;
                    this.f123355a.d(com.google.firebase.c.class, bVar);
                }
                this.f123356b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f123358d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f123340a.A();
        }

        synchronized void e(boolean z10) {
            try {
                b();
                m8.b<com.google.firebase.c> bVar = this.f123357c;
                if (bVar != null) {
                    this.f123355a.a(com.google.firebase.c.class, bVar);
                    this.f123357c = null;
                }
                int i10 = 3 ^ 0;
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.f123340a.n().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean(f123354h, z10);
                editorEdit.apply();
                if (z10) {
                    FirebaseMessaging.this.S();
                }
                this.f123358d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    FirebaseMessaging(com.google.firebase.h hVar, @androidx.annotation.p0 p8.a aVar, z8.b<com.google.firebase.platforminfo.i> bVar, z8.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar, z8.b<com.google.android.datatransport.m> bVar3, m8.d dVar) {
        this(hVar, aVar, bVar, bVar2, kVar, bVar3, dVar, new p0(hVar.n()));
    }

    private String A() {
        return com.google.firebase.h.f122060l.equals(this.f123340a.r()) ? "" : this.f123340a.t();
    }

    @androidx.annotation.p0
    public static com.google.android.datatransport.m E() {
        return f123338v.get();
    }

    private void F() {
        this.f123343d.f().k(this.f123346g, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.messaging.c0
            @Override // com.google.android.gms.tasks.g
            public final void b(Object obj) {
                FirebaseMessaging.j(this.f123448a, (CloudMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        t0.c(this.f123342c);
        v0.f(this.f123342c, this.f123343d, Q());
        if (Q()) {
            F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(String str) {
        if (com.google.firebase.h.f122060l.equals(this.f123340a.r())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                this.f123340a.r();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra(net.openid.appauth.x.f333313b, str);
            new n(this.f123342c).g(intent);
        }
    }

    private boolean Q() {
        t0.c(this.f123342c);
        if (!t0.d(this.f123342c)) {
            return false;
        }
        if (this.f123340a.l(com.google.firebase.analytics.connector.a.class) != null) {
            return true;
        }
        return n0.a() && f123338v != null;
    }

    private synchronized void R() {
        if (!this.f123350k) {
            U(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        p8.a aVar = this.f123341b;
        if (aVar != null) {
            aVar.I0();
        } else {
            if (V(C())) {
                R();
            }
        }
    }

    public static /* synthetic */ Task b(FirebaseMessaging firebaseMessaging, String str, e1.a aVar, String str2) {
        z(firebaseMessaging.f123342c).g(firebaseMessaging.A(), str, str2, firebaseMessaging.f123349j.a());
        if (aVar == null || !str2.equals(aVar.f123561a)) {
            firebaseMessaging.H(str2);
        }
        return com.google.android.gms.tasks.n.g(str2);
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.I()) {
            firebaseMessaging.S();
        }
    }

    public static /* synthetic */ void e(FirebaseMessaging firebaseMessaging, com.google.android.gms.tasks.l lVar) {
        firebaseMessaging.getClass();
        try {
            lVar.c(firebaseMessaging.r());
        } catch (Exception e10) {
            lVar.b(e10);
        }
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging, com.google.android.gms.tasks.l lVar) {
        firebaseMessaging.getClass();
        try {
            firebaseMessaging.f123341b.a(p0.c(firebaseMessaging.f123340a), f123333q);
            lVar.c(null);
        } catch (Exception e10) {
            lVar.b(e10);
        }
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull com.google.firebase.h hVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) hVar.l(FirebaseMessaging.class);
        com.google.android.gms.common.internal.w.s(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static /* synthetic */ com.google.android.datatransport.m h() {
        return null;
    }

    public static /* synthetic */ void j(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            n0.y(cloudMessage.e2());
            firebaseMessaging.F();
        }
    }

    public static /* synthetic */ com.google.android.datatransport.m k() {
        return null;
    }

    public static /* synthetic */ void m(FirebaseMessaging firebaseMessaging, j1 j1Var) {
        if (firebaseMessaging.I()) {
            j1Var.q();
        }
    }

    public static /* synthetic */ void o(FirebaseMessaging firebaseMessaging, com.google.android.gms.tasks.l lVar) {
        firebaseMessaging.getClass();
        try {
            com.google.android.gms.tasks.n.a(firebaseMessaging.f123343d.c());
            z(firebaseMessaging.f123342c).d(firebaseMessaging.A(), p0.c(firebaseMessaging.f123340a));
            lVar.c(null);
        } catch (Exception e10) {
            lVar.b(e10);
        }
    }

    @androidx.annotation.l1
    static synchronized void s() {
        try {
            f123337u = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static void t() {
        f123338v = new z8.b() { // from class: com.google.firebase.messaging.x
            @Override // z8.b
            public final Object get() {
                return FirebaseMessaging.k();
            }
        };
    }

    @NonNull
    public static synchronized FirebaseMessaging y() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return getInstance(com.google.firebase.h.p());
    }

    @NonNull
    private static synchronized e1 z(Context context) {
        try {
            if (f123337u == null) {
                f123337u = new e1(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f123337u;
    }

    @NonNull
    public Task<String> B() {
        p8.a aVar = this.f123341b;
        if (aVar != null) {
            return aVar.c();
        }
        final com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f123346g.execute(new Runnable() { // from class: com.google.firebase.messaging.b0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.e(this.f123427a, lVar);
            }
        });
        return lVar.a();
    }

    @androidx.annotation.l1
    @androidx.annotation.p0
    e1.a C() {
        return z(this.f123342c).e(A(), p0.c(this.f123340a));
    }

    Task<j1> D() {
        return this.f123348i;
    }

    public boolean I() {
        return this.f123345f.c();
    }

    @androidx.annotation.l1
    boolean J() {
        return this.f123349j.g();
    }

    public boolean K() {
        return t0.d(this.f123342c);
    }

    @Deprecated
    public void L(@NonNull RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.D2())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent(f123331o);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f123342c, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        remoteMessage.W2(intent);
        this.f123342c.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void M(boolean z10) {
        this.f123345f.e(z10);
    }

    public void N(boolean z10) {
        n0.B(z10);
        v0.f(this.f123342c, this.f123343d, Q());
    }

    @NonNull
    public Task<Void> O(boolean z10) {
        return t0.e(this.f123346g, this.f123342c, z10).k(new androidx.media3.exoplayer.offline.b(), new com.google.android.gms.tasks.g() { // from class: com.google.firebase.messaging.a0
            @Override // com.google.android.gms.tasks.g
            public final void b(Object obj) {
                FirebaseMessaging firebaseMessaging = this.f123416a;
                v0.f(firebaseMessaging.f123342c, firebaseMessaging.f123343d, firebaseMessaging.Q());
            }
        });
    }

    synchronized void P(boolean z10) {
        this.f123350k = z10;
    }

    @NonNull
    @e.a({"TaskMainThread"})
    public Task<Void> T(@NonNull final String str) {
        return this.f123348i.v(new com.google.android.gms.tasks.k() { // from class: com.google.firebase.messaging.r
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                return ((j1) obj).r(str);
            }
        });
    }

    synchronized void U(long j10) {
        try {
            w(new f1(this, Math.min(Math.max(f123334r, 2 * j10), f123335s)), j10);
            this.f123350k = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @androidx.annotation.l1
    boolean V(@androidx.annotation.p0 e1.a aVar) {
        return aVar == null || aVar.b(this.f123349j.a());
    }

    @NonNull
    @e.a({"TaskMainThread"})
    public Task<Void> W(@NonNull final String str) {
        return this.f123348i.v(new com.google.android.gms.tasks.k() { // from class: com.google.firebase.messaging.d0
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                return ((j1) obj).u(str);
            }
        });
    }

    String r() throws IOException {
        p8.a aVar = this.f123341b;
        if (aVar != null) {
            try {
                return (String) com.google.android.gms.tasks.n.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final e1.a aVarC = C();
        if (!V(aVarC)) {
            return aVarC.f123561a;
        }
        final String strC = p0.c(this.f123340a);
        try {
            return (String) com.google.android.gms.tasks.n.a(this.f123344e.b(strC, new z0.a() { // from class: com.google.firebase.messaging.e0
                @Override // com.google.firebase.messaging.z0.a
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f123549a;
                    return firebaseMessaging.f123343d.g().w(firebaseMessaging.f123347h, new com.google.android.gms.tasks.k() { // from class: com.google.firebase.messaging.z
                        @Override // com.google.android.gms.tasks.k
                        public final Task a(Object obj) {
                            return FirebaseMessaging.b(firebaseMessaging, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    @NonNull
    public Task<Void> u() {
        if (this.f123341b != null) {
            final com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
            this.f123346g.execute(new Runnable() { // from class: com.google.firebase.messaging.f0
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.f(this.f123568a, lVar);
                }
            });
            return lVar.a();
        }
        if (C() == null) {
            return com.google.android.gms.tasks.n.g(null);
        }
        final com.google.android.gms.tasks.l lVar2 = new com.google.android.gms.tasks.l();
        o.f().execute(new Runnable() { // from class: com.google.firebase.messaging.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.o(this.f123776a, lVar2);
            }
        });
        return lVar2.a();
    }

    @NonNull
    public boolean v() {
        return n0.a();
    }

    @e.a({"ThreadPoolCreation"})
    void w(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f123339w == null) {
                    f123339w = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b("TAG"));
                }
                f123339w.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    Context x() {
        return this.f123342c;
    }

    FirebaseMessaging(com.google.firebase.h hVar, @androidx.annotation.p0 p8.a aVar, z8.b<com.google.firebase.platforminfo.i> bVar, z8.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar, z8.b<com.google.android.datatransport.m> bVar3, m8.d dVar, p0 p0Var) {
        this(hVar, aVar, bVar3, dVar, p0Var, new j0(hVar, p0Var, bVar, bVar2, kVar), o.h(), o.d(), o.c());
    }

    FirebaseMessaging(com.google.firebase.h hVar, @androidx.annotation.p0 p8.a aVar, z8.b<com.google.android.datatransport.m> bVar, m8.d dVar, p0 p0Var, j0 j0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f123350k = false;
        f123338v = bVar;
        this.f123340a = hVar;
        this.f123341b = aVar;
        this.f123345f = new a(dVar);
        Context contextN = hVar.n();
        this.f123342c = contextN;
        q qVar = new q();
        this.f123351l = qVar;
        this.f123349j = p0Var;
        this.f123343d = j0Var;
        this.f123344e = new z0(executor);
        this.f123346g = executor2;
        this.f123347h = executor3;
        Context contextN2 = hVar.n();
        if (contextN2 instanceof Application) {
            ((Application) contextN2).registerActivityLifecycleCallbacks(qVar);
        } else {
            Objects.toString(contextN2);
        }
        if (aVar != null) {
            aVar.b(new p8.a.InterfaceC2456a() { // from class: com.google.firebase.messaging.t
                @Override // p8.a.InterfaceC2456a
                public final void a(String str) {
                    this.f123781a.H(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f123789a);
            }
        });
        Task<j1> taskF = j1.f(this, p0Var, j0Var, contextN, o.i());
        this.f123348i = taskF;
        taskF.k(executor2, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.messaging.v
            @Override // com.google.android.gms.tasks.g
            public final void b(Object obj) {
                FirebaseMessaging.m(this.f123792a, (j1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f123794a.G();
            }
        });
    }
}

package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public class c0 {
    static final String A = "crash_marker";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f120987r = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f120988s = 1024;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f120989t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final String f120990u = "com.crashlytics.RequireBuildId";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final boolean f120991v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f120992w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f120993x = "com.crashlytics.on-demand.recorded-exceptions";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f120994y = "com.crashlytics.on-demand.dropped-exceptions";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f120995z = "initialization_marker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f120996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.h f120997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f120998c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d0 f121001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d0 f121002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f121003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f121004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n0 f121005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f121006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    public final e8.b f121007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.analytics.a f121008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f121009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f121010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.l f121011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.concurrency.n f121012q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f121000e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s0 f120999d = new s0();

    public c0(com.google.firebase.h hVar, n0 n0Var, com.google.firebase.crashlytics.internal.a aVar, i0 i0Var, e8.b bVar, com.google.firebase.crashlytics.internal.analytics.a aVar2, com.google.firebase.crashlytics.internal.persistence.g gVar, m mVar, com.google.firebase.crashlytics.internal.l lVar, com.google.firebase.crashlytics.internal.concurrency.n nVar) {
        this.f120997b = hVar;
        this.f120998c = i0Var;
        this.f120996a = hVar.n();
        this.f121005j = n0Var;
        this.f121010o = aVar;
        this.f121007l = bVar;
        this.f121008m = aVar2;
        this.f121006k = gVar;
        this.f121009n = mVar;
        this.f121011p = lVar;
        this.f121012q = nVar;
    }

    public static /* synthetic */ void c(c0 c0Var, Throwable th2) {
        c0Var.f121004i.Y(f120993x, Integer.toString(c0Var.f120999d.b()));
        c0Var.f121004i.Y(f120994y, Integer.toString(c0Var.f120999d.a()));
        c0Var.f121004i.P(Thread.currentThread(), th2);
    }

    private void l() {
        try {
            this.f121003h = Boolean.TRUE.equals((Boolean) this.f121012q.f121233a.i().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.a0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f120973a.f121004i.t());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f121003h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(com.google.firebase.crashlytics.internal.settings.k kVar) {
        com.google.firebase.crashlytics.internal.concurrency.n.c();
        B();
        try {
            try {
                this.f121007l.a(new e8.a() { // from class: com.google.firebase.crashlytics.internal.common.t
                    @Override // e8.a
                    public final void a(String str) {
                        this.f121199a.x(str);
                    }
                });
                this.f121004i.U();
                if (!kVar.a().f121861b.f121868a) {
                    com.google.firebase.crashlytics.internal.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f121004i.A(kVar)) {
                    com.google.firebase.crashlytics.internal.g.f().m("Previous sessions could not be finalized.");
                }
                this.f121004i.a0(kVar.b());
                A();
            } catch (Exception e10) {
                com.google.firebase.crashlytics.internal.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
                A();
            }
        } catch (Throwable th2) {
            A();
            throw th2;
        }
    }

    private void s(final com.google.firebase.crashlytics.internal.settings.k kVar) {
        Future<?> futureSubmit = this.f121012q.f121233a.i().submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f121195a.q(kVar);
            }
        });
        com.google.firebase.crashlytics.internal.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            com.google.firebase.crashlytics.internal.g.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            com.google.firebase.crashlytics.internal.g.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            com.google.firebase.crashlytics.internal.g.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String u() {
        return "20.0.1";
    }

    static boolean v(String str, boolean z10) {
        if (z10) {
            return !TextUtils.isEmpty(str);
        }
        com.google.firebase.crashlytics.internal.g.f().k("Configured not to require a build ID.");
        return true;
    }

    void A() {
        com.google.firebase.crashlytics.internal.concurrency.n.c();
        try {
            if (!this.f121001f.d()) {
                com.google.firebase.crashlytics.internal.g.f().m("Initialization marker file was not properly removed.");
            }
        } catch (Exception e10) {
            com.google.firebase.crashlytics.internal.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    void B() {
        com.google.firebase.crashlytics.internal.concurrency.n.c();
        this.f121001f.a();
        com.google.firebase.crashlytics.internal.g.f().k("Initialization marker file was created.");
    }

    public boolean C(a aVar, com.google.firebase.crashlytics.internal.settings.k kVar) {
        if (!v(aVar.f120966b, i.i(this.f120996a, f120990u, true))) {
            throw new IllegalStateException(f120987r);
        }
        String strC = new h().c();
        try {
            this.f121002g = new d0(A, this.f121006k);
            this.f121001f = new d0(f120995z, this.f121006k);
            com.google.firebase.crashlytics.internal.metadata.p pVar = new com.google.firebase.crashlytics.internal.metadata.p(strC, this.f121006k, this.f121012q);
            com.google.firebase.crashlytics.internal.metadata.f fVar = new com.google.firebase.crashlytics.internal.metadata.f(this.f121006k);
            g8.a aVar2 = new g8.a(1024, new g8.c(10));
            this.f121011p.b(pVar);
            this.f121004i = new p(this.f120996a, this.f121005j, this.f120998c, this.f121006k, this.f121002g, aVar, pVar, fVar, e1.j(this.f120996a, this.f121005j, this.f121006k, aVar, fVar, pVar, aVar2, kVar, this.f120999d, this.f121009n, this.f121012q), this.f121010o, this.f121008m, this.f121009n, this.f121012q);
            boolean zP = p();
            l();
            this.f121004i.y(strC, Thread.getDefaultUncaughtExceptionHandler(), kVar);
            if (!zP || !i.d(this.f120996a)) {
                com.google.firebase.crashlytics.internal.g.f().b("Successfully configured exception handler.");
                return true;
            }
            com.google.firebase.crashlytics.internal.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            s(kVar);
            return false;
        } catch (Exception e10) {
            com.google.firebase.crashlytics.internal.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f121004i = null;
            return false;
        }
    }

    public Task<Void> D() {
        return this.f121004i.V();
    }

    public void E(@androidx.annotation.p0 Boolean bool) {
        this.f120998c.h(bool);
    }

    public void F(final String str, final String str2) {
        this.f121012q.f121233a.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f121206a.f121004i.W(str, str2);
            }
        });
    }

    public void G(final Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        this.f121012q.f121233a.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f121193a.f121004i.X(map);
            }
        });
    }

    public void H(final String str, final String str2) {
        this.f121012q.f121233a.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f121209a.f121004i.Y(str, str2);
            }
        });
    }

    public void I(final String str) {
        this.f121012q.f121233a.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f121204a.f121004i.Z(str);
            }
        });
    }

    @NonNull
    public Task<Boolean> m() {
        return this.f121004i.n();
    }

    public Task<Void> n() {
        return this.f121004i.s();
    }

    public boolean o() {
        return this.f121003h;
    }

    boolean p() {
        return this.f121001f.c();
    }

    @z7.a
    public Task<Void> r(final com.google.firebase.crashlytics.internal.settings.k kVar) {
        return this.f121012q.f121233a.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f121191a.q(kVar);
            }
        });
    }

    p t() {
        return this.f121004i;
    }

    public boolean w() {
        return this.f120998c.d();
    }

    public void x(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f121000e;
        this.f121012q.f121233a.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0 c0Var = this.f120977a;
                c0Var.f121012q.f121234b.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0Var.f121004i.e0(j, str);
                    }
                });
            }
        });
    }

    public void y(@NonNull final Throwable th2, @NonNull final Map<String, String> map) {
        this.f121012q.f121233a.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f121212a.f121004i.d0(Thread.currentThread(), th2, map);
            }
        });
    }

    public void z(final Throwable th2) {
        com.google.firebase.crashlytics.internal.g.f().b("Recorded on-demand fatal events: " + this.f120999d.b());
        com.google.firebase.crashlytics.internal.g.f().b("Dropped on-demand fatal events: " + this.f120999d.a());
        this.f121012q.f121233a.j(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.u
            @Override // java.lang.Runnable
            public final void run() {
                c0.c(this.f121202a, th2);
            }
        });
    }
}

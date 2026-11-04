package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.b0;
import io.sentry.protocol.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class j implements k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f123176n = "generatefid.lock";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f123177o = "CHIME_ANDROID_SDK";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f123178p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f123179q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f123180r = 30;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f123182t = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f123183u = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f123184v = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f123185w = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.h f123186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.installations.remote.c f123187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.local.c f123188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f123189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0<com.google.firebase.installations.local.b> f123190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f123191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f123192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f123193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f123194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private String f123195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("FirebaseInstallations.this")
    private Set<a9.a> f123196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0(z.b.f306551r)
    private final List<t> f123197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f123175m = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final ThreadFactory f123181s = new a();

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f123198a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @e.a({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f123198a.getAndIncrement())));
        }
    }

    class b implements a9.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a9.a f123199a;

        b(a9.a aVar) {
            this.f123199a = aVar;
        }

        @Override // a9.b
        public void a() {
            synchronized (j.this) {
                try {
                    j.this.f123196k.remove(this.f123199a);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f123202b;

        static {
            int[] iArr = new int[com.google.firebase.installations.remote.f.b.values().length];
            f123202b = iArr;
            try {
                iArr[com.google.firebase.installations.remote.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123202b[com.google.firebase.installations.remote.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123202b[com.google.firebase.installations.remote.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.google.firebase.installations.remote.d.b.values().length];
            f123201a = iArr2;
            try {
                iArr2[com.google.firebase.installations.remote.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f123201a[com.google.firebase.installations.remote.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @e.a({"ThreadPoolCreation"})
    j(final com.google.firebase.h hVar, @NonNull z8.b<com.google.firebase.heartbeatinfo.j> bVar, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, hVar, new com.google.firebase.installations.remote.c(hVar.n(), bVar), new com.google.firebase.installations.local.c(hVar), u.c(), new b0(new z8.b() { // from class: com.google.firebase.installations.e
            @Override // z8.b
            public final Object get() {
                return j.h(hVar);
            }
        }), new s());
    }

    private void A(com.google.firebase.installations.local.d dVar) {
        synchronized (f123175m) {
            try {
                d dVarA = d.a(this.f123186a.n(), f123176n);
                try {
                    this.f123188c.c(dVar);
                    if (dVarA != null) {
                        dVarA.b();
                    }
                } catch (Throwable th2) {
                    if (dVarA != null) {
                        dVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void B() {
        w.m(r(), f123183u);
        w.m(z(), f123184v);
        w.m(q(), f123182t);
        w.b(u.h(r()), f123183u);
        w.b(u.g(q()), f123182t);
    }

    private String C(com.google.firebase.installations.local.d dVar) {
        if ((!this.f123186a.r().equals(f123177o) && !this.f123186a.B()) || !dVar.m()) {
            return this.f123191f.a();
        }
        String strF = t().f();
        return TextUtils.isEmpty(strF) ? this.f123191f.a() : strF;
    }

    private com.google.firebase.installations.local.d D(com.google.firebase.installations.local.d dVar) throws l {
        com.google.firebase.installations.remote.d dVarD = this.f123187b.d(q(), dVar.d(), z(), r(), (dVar.d() == null || dVar.d().length() != 11) ? null : t().i());
        int i10 = c.f123201a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f123189d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new l("Firebase Installations Service is unavailable. Please try again later.", l.a.UNAVAILABLE);
    }

    private void E(Exception exc) {
        synchronized (this.f123192g) {
            try {
                Iterator<t> it = this.f123197l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void F(com.google.firebase.installations.local.d dVar) {
        synchronized (this.f123192g) {
            try {
                Iterator<t> it = this.f123197l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized void G(String str) {
        this.f123195j = str;
    }

    private synchronized void H(com.google.firebase.installations.local.d dVar, com.google.firebase.installations.local.d dVar2) {
        try {
            if (this.f123196k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
                Iterator<a9.a> it = this.f123196k.iterator();
                while (it.hasNext()) {
                    it.next().a(dVar2.d());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ com.google.firebase.installations.local.b h(com.google.firebase.h hVar) {
        return new com.google.firebase.installations.local.b(hVar);
    }

    private Task<p> j() {
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        l(new n(this.f123189d, lVar));
        return lVar.a();
    }

    private Task<String> k() {
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        l(new o(lVar));
        return lVar.a();
    }

    private void l(t tVar) {
        synchronized (this.f123192g) {
            this.f123197l.add(tVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void m() throws l {
        G(null);
        com.google.firebase.installations.local.d dVarW = w();
        if (dVarW.k()) {
            this.f123187b.e(q(), dVarW.d(), z(), dVarW.f());
        }
        A(dVarW.r());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(boolean z10) {
        com.google.firebase.installations.local.d dVarD;
        com.google.firebase.installations.local.d dVarW = w();
        try {
            if (dVarW.i() || dVarW.l()) {
                dVarD = D(dVarW);
            } else {
                if (!z10 && !this.f123189d.f(dVarW)) {
                    return;
                }
                dVarD = p(dVarW);
            }
            A(dVarD);
            H(dVarW, dVarD);
            if (dVarD.k()) {
                G(dVarD.d());
            }
            if (dVarD.i()) {
                E(new l(l.a.BAD_CONFIG));
            } else if (dVarD.j()) {
                E(new IOException(f123185w));
            } else {
                F(dVarD);
            }
        } catch (l e10) {
            E(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final boolean z10) {
        com.google.firebase.installations.local.d dVarY = y();
        if (z10) {
            dVarY = dVarY.p();
        }
        F(dVarY);
        this.f123194i.execute(new Runnable() { // from class: com.google.firebase.installations.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f123169a.n(z10);
            }
        });
    }

    private com.google.firebase.installations.local.d p(@NonNull com.google.firebase.installations.local.d dVar) throws l {
        com.google.firebase.installations.remote.f fVarF = this.f123187b.f(q(), dVar.d(), z(), dVar.f());
        int i10 = c.f123202b[fVarF.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarF.c(), fVarF.d(), this.f123189d.b());
        }
        int i11 = 5 ^ 2;
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new l("Firebase Installations Service is unavailable. Please try again later.", l.a.UNAVAILABLE);
        }
        G(null);
        return dVar.r();
    }

    private synchronized String s() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f123195j;
    }

    private com.google.firebase.installations.local.b t() {
        return this.f123190e.get();
    }

    @NonNull
    public static j u() {
        return v(com.google.firebase.h.p());
    }

    @NonNull
    public static j v(@NonNull com.google.firebase.h hVar) {
        w.b(hVar != null, "Null is not a valid value of FirebaseApp.");
        return (j) hVar.l(k.class);
    }

    private com.google.firebase.installations.local.d w() {
        com.google.firebase.installations.local.d dVarE;
        synchronized (f123175m) {
            try {
                d dVarA = d.a(this.f123186a.n(), f123176n);
                try {
                    dVarE = this.f123188c.e();
                    if (dVarA != null) {
                        dVarA.b();
                    }
                } catch (Throwable th2) {
                    if (dVarA != null) {
                        dVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarE;
    }

    private com.google.firebase.installations.local.d y() {
        com.google.firebase.installations.local.d dVarE;
        synchronized (f123175m) {
            try {
                d dVarA = d.a(this.f123186a.n(), f123176n);
                try {
                    dVarE = this.f123188c.e();
                    if (dVarE.j()) {
                        dVarE = this.f123188c.c(dVarE.t(C(dVarE)));
                    }
                    if (dVarA != null) {
                        dVarA.b();
                    }
                } catch (Throwable th2) {
                    if (dVarA != null) {
                        dVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarE;
    }

    @Override // com.google.firebase.installations.k
    @NonNull
    public Task<Void> a() {
        return com.google.android.gms.tasks.n.d(this.f123193h, new Callable() { // from class: com.google.firebase.installations.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f123172a.m();
            }
        });
    }

    @Override // com.google.firebase.installations.k
    @NonNull
    public Task<p> b(final boolean z10) {
        B();
        Task<p> taskJ = j();
        this.f123193h.execute(new Runnable() { // from class: com.google.firebase.installations.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f123173a.o(z10);
            }
        });
        return taskJ;
    }

    @Override // com.google.firebase.installations.k
    @NonNull
    public synchronized a9.b c(@NonNull a9.a aVar) {
        this.f123196k.add(aVar);
        return new b(aVar);
    }

    @Override // com.google.firebase.installations.k
    @NonNull
    public Task<String> getId() {
        B();
        String strS = s();
        if (strS != null) {
            return com.google.android.gms.tasks.n.g(strS);
        }
        Task<String> taskK = k();
        this.f123193h.execute(new Runnable() { // from class: com.google.firebase.installations.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f123171a.o(false);
            }
        });
        return taskK;
    }

    @p0
    String q() {
        return this.f123186a.s().i();
    }

    @l1
    String r() {
        return this.f123186a.s().j();
    }

    @l1
    String x() {
        return this.f123186a.r();
    }

    @p0
    String z() {
        return this.f123186a.s().n();
    }

    @e.a({"ThreadPoolCreation"})
    j(ExecutorService executorService, Executor executor, com.google.firebase.h hVar, com.google.firebase.installations.remote.c cVar, com.google.firebase.installations.local.c cVar2, u uVar, b0<com.google.firebase.installations.local.b> b0Var, s sVar) {
        this.f123192g = new Object();
        this.f123196k = new HashSet();
        this.f123197l = new ArrayList();
        this.f123186a = hVar;
        this.f123187b = cVar;
        this.f123188c = cVar2;
        this.f123189d = uVar;
        this.f123190e = b0Var;
        this.f123191f = sVar;
        this.f123193h = executorService;
        this.f123194i = executor;
    }
}

package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public class l0 implements com.google.firebase.inappmessaging.r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f122826l = "message click to metrics logger";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a1 f122827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.time.a f122828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q3 f122829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3 f122830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f122831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.model.m f122832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u2 f122833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q f122834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.model.i f122835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f122836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f122837k = false;

    @androidx.annotation.l1
    l0(a1 a1Var, com.google.firebase.inappmessaging.internal.time.a aVar, q3 q3Var, o3 o3Var, n nVar, com.google.firebase.inappmessaging.model.m mVar, u2 u2Var, q qVar, com.google.firebase.inappmessaging.model.i iVar, String str) {
        this.f122827a = a1Var;
        this.f122828b = aVar;
        this.f122829c = q3Var;
        this.f122830d = o3Var;
        this.f122831e = nVar;
        this.f122832f = mVar;
        this.f122833g = u2Var;
        this.f122834h = qVar;
        this.f122835i = iVar;
        this.f122836j = str;
        int i10 = 2 | 0;
    }

    public static /* synthetic */ Object i(com.google.android.gms.tasks.l lVar) {
        lVar.c(null);
        return null;
    }

    public static /* synthetic */ io.reactivex.y l(com.google.android.gms.tasks.l lVar, Throwable th2) {
        if (th2 instanceof Exception) {
            lVar.b((Exception) th2);
        } else {
            lVar.b(new RuntimeException(th2));
        }
        return io.reactivex.s.Y();
    }

    private boolean p(com.google.firebase.inappmessaging.model.a aVar, com.google.firebase.inappmessaging.model.a aVar2) {
        if (aVar != null) {
            return aVar.b().equals(aVar2.b());
        }
        if (aVar2 != null && !TextUtils.isEmpty(aVar2.b())) {
            return false;
        }
        return true;
    }

    private void q(String str) {
        r(str, null);
    }

    private void r(String str, io.reactivex.s<String> sVar) {
        if (sVar != null) {
            p2.a(String.format("Not recording: %s. Reason: %s", str, sVar));
            return;
        }
        if (this.f122835i.f().c()) {
            p2.a(String.format("Not recording: %s. Reason: Message is test message", str));
        } else if (this.f122834h.b()) {
            p2.a(String.format("Not recording: %s", str));
        } else {
            p2.a(String.format("Not recording: %s. Reason: Data collection is disabled", str));
        }
    }

    private Task<Void> s(io.reactivex.c cVar) {
        if (!this.f122837k) {
            c();
        }
        return v(cVar.Y0(), this.f122829c.b());
    }

    private Task<Void> t(final com.google.firebase.inappmessaging.model.a aVar) {
        p2.a("Attempting to record: message click to metrics logger");
        return s(io.reactivex.c.S(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.b0
            @Override // dj.a
            public final void run() {
                l0 l0Var = this.f122589a;
                l0Var.f122833g.p(l0Var.f122835i, aVar);
            }
        }));
    }

    private io.reactivex.c u() {
        String strA = this.f122835i.f().a();
        p2.a("Attempting to record message impression in impression store for id: " + strA);
        io.reactivex.c cVarJ = this.f122827a.m(com.google.internal.firebase.inappmessaging.v1.sdkserving.a.im().Sl(this.f122828b.a()).Ql(strA).build()).L(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.c0
            @Override // dj.g
            public final void accept(Object obj) {
                p2.b("Impression store write failure");
            }
        }).J(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.d0
            @Override // dj.a
            public final void run() {
                p2.a("Impression store write success");
            }
        });
        return m2.R(this.f122836j) ? this.f122830d.m(this.f122832f).L(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.e0
            @Override // dj.g
            public final void accept(Object obj) {
                p2.b("Rate limiter client write failure");
            }
        }).J(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.f0
            @Override // dj.a
            public final void run() {
                p2.a("Rate limiter client write success");
            }
        }).p0().i(cVarJ) : cVarJ;
    }

    private static <T> Task<T> v(io.reactivex.s<T> sVar, io.reactivex.j0 j0Var) {
        final com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        sVar.W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.h0
            @Override // dj.g
            public final void accept(Object obj) {
                lVar.c(obj);
            }
        }).v1(io.reactivex.s.n0(new Callable() { // from class: com.google.firebase.inappmessaging.internal.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l0.i(lVar);
            }
        })).V0(new dj.o() { // from class: com.google.firebase.inappmessaging.internal.j0
            @Override // dj.o
            public final Object apply(Object obj) {
                return l0.l(lVar, (Throwable) obj);
            }
        }).t1(j0Var).o1();
        return lVar.a();
    }

    private boolean x() {
        return this.f122834h.b();
    }

    private io.reactivex.c y() {
        return io.reactivex.c.S(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.z
            @Override // dj.a
            public final void run() {
                this.f123009a.f122837k = true;
            }
        });
    }

    @Override // com.google.firebase.inappmessaging.r
    public Task<Void> a(com.google.firebase.inappmessaging.model.a aVar) {
        if (x()) {
            return aVar.b() == null ? d(com.google.firebase.inappmessaging.r.a.CLICK) : t(aVar);
        }
        q(f122826l);
        return new com.google.android.gms.tasks.l().a();
    }

    @Override // com.google.firebase.inappmessaging.r
    public Task<Void> b(final com.google.firebase.inappmessaging.r.b bVar) {
        if (!x()) {
            q("render error to metrics logger");
            return new com.google.android.gms.tasks.l().a();
        }
        p2.a("Attempting to record: render error to metrics logger");
        return v(u().i(io.reactivex.c.S(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.g0
            @Override // dj.a
            public final void run() {
                l0 l0Var = this.f122637a;
                l0Var.f122833g.q(l0Var.f122835i, bVar);
            }
        })).i(y()).Y0(), this.f122829c.b());
    }

    @Override // com.google.firebase.inappmessaging.r
    public Task<Void> c() {
        if (!x() || this.f122837k) {
            q("message impression to metrics logger");
            return new com.google.android.gms.tasks.l().a();
        }
        p2.a("Attempting to record: message impression to metrics logger");
        return v(u().i(io.reactivex.c.S(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.k0
            @Override // dj.a
            public final void run() {
                l0 l0Var = this.f122821a;
                l0Var.f122833g.o(l0Var.f122835i);
            }
        })).i(y()).Y0(), this.f122829c.b());
    }

    @Override // com.google.firebase.inappmessaging.r
    public Task<Void> d(final com.google.firebase.inappmessaging.r.a aVar) {
        if (!x()) {
            q("message dismissal to metrics logger");
            return new com.google.android.gms.tasks.l().a();
        }
        p2.a("Attempting to record: message dismissal to metrics logger");
        return s(io.reactivex.c.S(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.a0
            @Override // dj.a
            public final void run() {
                l0 l0Var = this.f122580a;
                l0Var.f122833g.m(l0Var.f122835i, aVar);
            }
        }));
    }

    @Deprecated
    public Task<Void> w() {
        return a(this.f122835i.a());
    }

    @androidx.annotation.l1
    boolean z() {
        return this.f122837k;
    }
}

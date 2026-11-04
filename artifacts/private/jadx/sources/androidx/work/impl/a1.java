package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.m1;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.common.util.concurrent.t1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class a1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final String f76578w = androidx.work.v.i("WorkerWrapper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f76579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f76581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.work.impl.model.v f76582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.work.u f76583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.work.impl.utils.taskexecutor.b f76584f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.work.c f76586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.work.b f76587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.work.impl.foreground.a f76588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkDatabase f76589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.work.impl.model.w f76590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.work.impl.model.b f76591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<String> f76592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f76593o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    androidx.work.u.a f76585g = androidx.work.u.a.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    androidx.work.impl.utils.futures.c<Boolean> f76594s = androidx.work.impl.utils.futures.c.u();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    final androidx.work.impl.utils.futures.c<androidx.work.u.a> f76595t = androidx.work.impl.utils.futures.c.u();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile int f76596v = -256;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t1 f76597a;

        a(final t1 val$runExpedited) {
            this.f76597a = val$runExpedited;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a1.this.f76595t.isCancelled()) {
                return;
            }
            try {
                this.f76597a.get();
                androidx.work.v.e().a(a1.f76578w, "Starting work for " + a1.this.f76582d.f76985c);
                a1 a1Var = a1.this;
                a1Var.f76595t.r(a1Var.f76583e.startWork());
            } catch (Throwable th2) {
                a1.this.f76595t.q(th2);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f76599a;

        b(final String val$workDescription) {
            this.f76599a = val$workDescription;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    androidx.work.u.a aVar = a1.this.f76595t.get();
                    if (aVar == null) {
                        androidx.work.v.e().c(a1.f76578w, a1.this.f76582d.f76985c + " returned a null result. Treating it as a failure.");
                    } else {
                        androidx.work.v.e().a(a1.f76578w, a1.this.f76582d.f76985c + " returned a " + aVar + ".");
                        a1.this.f76585g = aVar;
                    }
                    a1.this.i();
                } catch (InterruptedException | ExecutionException e10) {
                    androidx.work.v.e().d(a1.f76578w, this.f76599a + " failed because it threw an exception/error", e10);
                    a1.this.i();
                } catch (CancellationException e11) {
                    androidx.work.v.e().g(a1.f76578w, this.f76599a + " was cancelled", e11);
                    a1.this.i();
                }
            } catch (Throwable th2) {
                a1.this.i();
                throw th2;
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        Context f76601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        androidx.work.u f76602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        androidx.work.impl.foreground.a f76603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        androidx.work.impl.utils.taskexecutor.b f76604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        androidx.work.c f76605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        WorkDatabase f76606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        androidx.work.impl.model.v f76607g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List<String> f76608h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        WorkerParameters.a f76609i = new WorkerParameters.a();

        @e.a({"LambdaLast"})
        public c(@NonNull Context context, @NonNull androidx.work.c configuration, @NonNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor, @NonNull androidx.work.impl.foreground.a foregroundProcessor, @NonNull WorkDatabase database, @NonNull androidx.work.impl.model.v workSpec, @NonNull List<String> tags) {
            this.f76601a = context.getApplicationContext();
            this.f76604d = workTaskExecutor;
            this.f76603c = foregroundProcessor;
            this.f76605e = configuration;
            this.f76606f = database;
            this.f76607g = workSpec;
            this.f76608h = tags;
        }

        @NonNull
        public a1 b() {
            return new a1(this);
        }

        @NonNull
        public c c(@androidx.annotation.p0 WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.f76609i = runtimeExtras;
            }
            return this;
        }

        @NonNull
        @l1
        public c d(@NonNull androidx.work.u worker) {
            this.f76602b = worker;
            return this;
        }
    }

    a1(@NonNull c builder) {
        this.f76579a = builder.f76601a;
        this.f76584f = builder.f76604d;
        this.f76588j = builder.f76603c;
        androidx.work.impl.model.v vVar = builder.f76607g;
        this.f76582d = vVar;
        this.f76580b = vVar.f76983a;
        this.f76581c = builder.f76609i;
        this.f76583e = builder.f76602b;
        androidx.work.c cVar = builder.f76605e;
        this.f76586h = cVar;
        this.f76587i = cVar.a();
        WorkDatabase workDatabase = builder.f76606f;
        this.f76589k = workDatabase;
        this.f76590l = workDatabase.k();
        this.f76591m = this.f76589k.e();
        this.f76592n = builder.f76608h;
    }

    public static /* synthetic */ void a(a1 a1Var, t1 t1Var) {
        if (a1Var.f76595t.isCancelled()) {
            t1Var.cancel(true);
        }
    }

    private String b(List<String> tags) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f76580b);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : tags) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void f(androidx.work.u.a result) {
        if (result instanceof androidx.work.u.a.c) {
            androidx.work.v.e().f(f76578w, "Worker result SUCCESS for " + this.f76593o);
            if (this.f76582d.J()) {
                k();
                return;
            } else {
                p();
                return;
            }
        }
        if (result instanceof androidx.work.u.a.b) {
            androidx.work.v.e().f(f76578w, "Worker result RETRY for " + this.f76593o);
            j();
            return;
        }
        androidx.work.v.e().f(f76578w, "Worker result FAILURE for " + this.f76593o);
        if (this.f76582d.J()) {
            k();
        } else {
            o();
        }
    }

    private void h(String workSpecId) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            if (this.f76590l.j(str) != androidx.work.l0.c.CANCELLED) {
                this.f76590l.q(androidx.work.l0.c.FAILED, str);
            }
            linkedList.addAll(this.f76591m.b(str));
        }
    }

    private void j() {
        this.f76589k.beginTransaction();
        try {
            this.f76590l.q(androidx.work.l0.c.ENQUEUED, this.f76580b);
            this.f76590l.t(this.f76580b, this.f76587i.currentTimeMillis());
            this.f76590l.B(this.f76580b, this.f76582d.E());
            this.f76590l.K(this.f76580b, -1L);
            this.f76589k.setTransactionSuccessful();
            this.f76589k.endTransaction();
            l(true);
        } catch (Throwable th2) {
            this.f76589k.endTransaction();
            l(true);
            throw th2;
        }
    }

    private void k() {
        this.f76589k.beginTransaction();
        try {
            this.f76590l.t(this.f76580b, this.f76587i.currentTimeMillis());
            this.f76590l.q(androidx.work.l0.c.ENQUEUED, this.f76580b);
            this.f76590l.y(this.f76580b);
            this.f76590l.B(this.f76580b, this.f76582d.E());
            this.f76590l.D(this.f76580b);
            this.f76590l.K(this.f76580b, -1L);
            this.f76589k.setTransactionSuccessful();
            WorkDatabase workDatabase = this.f76589k;
        } finally {
            this.f76589k.endTransaction();
            l(false);
        }
    }

    private void l(final boolean needsReschedule) {
        this.f76589k.beginTransaction();
        try {
            if (!this.f76589k.k().w()) {
                androidx.work.impl.utils.r.e(this.f76579a, RescheduleReceiver.class, false);
            }
            if (needsReschedule) {
                this.f76590l.q(androidx.work.l0.c.ENQUEUED, this.f76580b);
                this.f76590l.b(this.f76580b, this.f76596v);
                this.f76590l.K(this.f76580b, -1L);
            }
            this.f76589k.setTransactionSuccessful();
            this.f76589k.endTransaction();
            this.f76594s.p(Boolean.valueOf(needsReschedule));
        } catch (Throwable th2) {
            this.f76589k.endTransaction();
            throw th2;
        }
    }

    private void m() {
        androidx.work.l0.c cVarJ = this.f76590l.j(this.f76580b);
        if (cVarJ == androidx.work.l0.c.RUNNING) {
            androidx.work.v.e().a(f76578w, "Status for " + this.f76580b + " is RUNNING; not doing any work and rescheduling for later execution");
            l(true);
            return;
        }
        androidx.work.v.e().a(f76578w, "Status for " + this.f76580b + " is " + cVarJ + " ; not doing any work");
        l(false);
    }

    private void n() {
        androidx.work.h hVarA;
        if (q()) {
            return;
        }
        this.f76589k.beginTransaction();
        try {
            androidx.work.impl.model.v vVar = this.f76582d;
            if (vVar.f76984b != androidx.work.l0.c.ENQUEUED) {
                m();
                this.f76589k.setTransactionSuccessful();
                androidx.work.v.e().a(f76578w, this.f76582d.f76985c + " is not in ENQUEUED state. Nothing more to do");
                this.f76589k.endTransaction();
                return;
            }
            if ((vVar.J() || this.f76582d.I()) && this.f76587i.currentTimeMillis() < this.f76582d.c()) {
                androidx.work.v.e().a(f76578w, String.format("Delaying execution for %s because it is being executed before schedule.", this.f76582d.f76985c));
                l(true);
                this.f76589k.setTransactionSuccessful();
                this.f76589k.endTransaction();
                return;
            }
            this.f76589k.setTransactionSuccessful();
            this.f76589k.endTransaction();
            if (this.f76582d.J()) {
                hVarA = this.f76582d.f76987e;
            } else {
                androidx.work.p pVarB = this.f76586h.f().b(this.f76582d.f76986d);
                if (pVarB == null) {
                    androidx.work.v.e().c(f76578w, "Could not create Input Merger " + this.f76582d.f76986d);
                    o();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f76582d.f76987e);
                arrayList.addAll(this.f76590l.m(this.f76580b));
                hVarA = pVarB.a(arrayList);
            }
            androidx.work.h hVar = hVarA;
            UUID uuidFromString = UUID.fromString(this.f76580b);
            List<String> list = this.f76592n;
            WorkerParameters.a aVar = this.f76581c;
            androidx.work.impl.model.v vVar2 = this.f76582d;
            WorkerParameters workerParameters = new WorkerParameters(uuidFromString, hVar, list, aVar, vVar2.f76993k, vVar2.C(), this.f76586h.d(), this.f76584f, this.f76586h.n(), new androidx.work.impl.utils.h0(this.f76589k, this.f76584f), new androidx.work.impl.utils.g0(this.f76589k, this.f76588j, this.f76584f));
            if (this.f76583e == null) {
                this.f76583e = this.f76586h.n().b(this.f76579a, this.f76582d.f76985c, workerParameters);
            }
            androidx.work.u uVar = this.f76583e;
            if (uVar == null) {
                androidx.work.v.e().c(f76578w, "Could not create Worker " + this.f76582d.f76985c);
                o();
                return;
            }
            if (uVar.isUsed()) {
                androidx.work.v.e().c(f76578w, "Received an already-used Worker " + this.f76582d.f76985c + "; Worker Factory should return new instances");
                o();
                return;
            }
            this.f76583e.setUsed();
            if (!r()) {
                m();
                return;
            }
            if (q()) {
                return;
            }
            androidx.work.impl.utils.f0 f0Var = new androidx.work.impl.utils.f0(this.f76579a, this.f76582d, this.f76583e, workerParameters.b(), this.f76584f);
            this.f76584f.c().execute(f0Var);
            final t1<Void> t1VarB = f0Var.b();
            this.f76595t.m0(new Runnable() { // from class: androidx.work.impl.z0
                @Override // java.lang.Runnable
                public final void run() {
                    a1.a(this.f77335a, t1VarB);
                }
            }, new androidx.work.impl.utils.b0());
            t1VarB.m0(new a(t1VarB), this.f76584f.c());
            this.f76595t.m0(new b(this.f76593o), this.f76584f.d());
        } catch (Throwable th2) {
            this.f76589k.endTransaction();
            throw th2;
        }
    }

    private void p() {
        this.f76589k.beginTransaction();
        int i10 = 7 ^ 0;
        try {
            this.f76590l.q(androidx.work.l0.c.SUCCEEDED, this.f76580b);
            this.f76590l.N(this.f76580b, ((androidx.work.u.a.c) this.f76585g).c());
            long jCurrentTimeMillis = this.f76587i.currentTimeMillis();
            for (String str : this.f76591m.b(this.f76580b)) {
                if (this.f76590l.j(str) == androidx.work.l0.c.BLOCKED && this.f76591m.c(str)) {
                    androidx.work.v.e().f(f76578w, "Setting status to enqueued for " + str);
                    this.f76590l.q(androidx.work.l0.c.ENQUEUED, str);
                    this.f76590l.t(str, jCurrentTimeMillis);
                }
            }
            this.f76589k.setTransactionSuccessful();
            this.f76589k.endTransaction();
        } finally {
            this.f76589k.endTransaction();
            l(false);
        }
    }

    private boolean q() {
        if (this.f76596v == -256) {
            return false;
        }
        androidx.work.v.e().a(f76578w, "Work interrupted for " + this.f76593o);
        androidx.work.l0.c cVarJ = this.f76590l.j(this.f76580b);
        if (cVarJ == null) {
            l(false);
        } else {
            l(!cVarJ.l());
        }
        return true;
    }

    private boolean r() {
        boolean z10;
        this.f76589k.beginTransaction();
        try {
            if (this.f76590l.j(this.f76580b) == androidx.work.l0.c.ENQUEUED) {
                this.f76590l.q(androidx.work.l0.c.RUNNING, this.f76580b);
                this.f76590l.R(this.f76580b);
                this.f76590l.b(this.f76580b, -256);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f76589k.setTransactionSuccessful();
            WorkDatabase workDatabase = this.f76589k;
            return z10;
        } finally {
            this.f76589k.endTransaction();
        }
    }

    @NonNull
    public t1<Boolean> c() {
        return this.f76594s;
    }

    @NonNull
    public androidx.work.impl.model.n d() {
        return androidx.work.impl.model.z.a(this.f76582d);
    }

    @NonNull
    public androidx.work.impl.model.v e() {
        return this.f76582d;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void g(int stopReason) {
        this.f76596v = stopReason;
        q();
        this.f76595t.cancel(true);
        if (this.f76583e != null && this.f76595t.isCancelled()) {
            this.f76583e.stop(stopReason);
            return;
        }
        androidx.work.v.e().a(f76578w, "WorkSpec " + this.f76582d + " is already done. Not interrupting.");
    }

    void i() {
        if (q()) {
            return;
        }
        this.f76589k.beginTransaction();
        try {
            androidx.work.l0.c cVarJ = this.f76590l.j(this.f76580b);
            this.f76589k.j().a(this.f76580b);
            if (cVarJ == null) {
                l(false);
            } else if (cVarJ == androidx.work.l0.c.RUNNING) {
                f(this.f76585g);
            } else if (!cVarJ.l()) {
                this.f76596v = androidx.work.l0.f77348o;
                j();
            }
            this.f76589k.setTransactionSuccessful();
            this.f76589k.endTransaction();
        } catch (Throwable th2) {
            this.f76589k.endTransaction();
            throw th2;
        }
    }

    @l1
    void o() {
        this.f76589k.beginTransaction();
        try {
            h(this.f76580b);
            androidx.work.h hVarC = ((androidx.work.u.a.C0794a) this.f76585g).c();
            this.f76590l.B(this.f76580b, this.f76582d.E());
            this.f76590l.N(this.f76580b, hVarC);
            this.f76589k.setTransactionSuccessful();
            this.f76589k.endTransaction();
            l(false);
        } catch (Throwable th2) {
            this.f76589k.endTransaction();
            l(false);
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    @m1
    public void run() {
        this.f76593o = b(this.f76592n);
        n();
    }
}

package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class u implements androidx.work.impl.foreground.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f77136l = androidx.work.v.i("Processor");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f77137m = "ProcessorForegroundLck";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f77139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.c f77140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.work.impl.utils.taskexecutor.b f77141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WorkDatabase f77142e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, a1> f77144g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, a1> f77143f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f77146i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<f> f77147j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private PowerManager.WakeLock f77138a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f77148k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Set<a0>> f77145h = new HashMap();

    public u(@NonNull Context appContext, @NonNull androidx.work.c configuration, @NonNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor, @NonNull WorkDatabase workDatabase) {
        this.f77139b = appContext;
        this.f77140c = configuration;
        this.f77141d = workTaskExecutor;
        this.f77142e = workDatabase;
    }

    public static /* synthetic */ androidx.work.impl.model.v b(u uVar, ArrayList arrayList, String str) {
        arrayList.addAll(uVar.f77142e.l().d(str));
        return uVar.f77142e.k().H(str);
    }

    public static /* synthetic */ void c(u uVar, androidx.work.impl.model.n nVar, boolean z10) {
        synchronized (uVar.f77148k) {
            try {
                Iterator<f> it = uVar.f77147j.iterator();
                while (it.hasNext()) {
                    it.next().d(nVar, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(u uVar, t1 t1Var, a1 a1Var) {
        boolean zBooleanValue;
        uVar.getClass();
        try {
            zBooleanValue = ((Boolean) t1Var.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        uVar.m(a1Var, zBooleanValue);
    }

    @androidx.annotation.p0
    private a1 f(@NonNull String id2) {
        a1 a1VarRemove = this.f77143f.remove(id2);
        boolean z10 = a1VarRemove != null;
        if (!z10) {
            a1VarRemove = this.f77144g.remove(id2);
        }
        this.f77145h.remove(id2);
        if (z10) {
            s();
        }
        return a1VarRemove;
    }

    @androidx.annotation.p0
    private a1 h(@NonNull String workSpecId) {
        a1 a1Var = this.f77143f.get(workSpecId);
        return a1Var == null ? this.f77144g.get(workSpecId) : a1Var;
    }

    private static boolean j(@NonNull String id2, @androidx.annotation.p0 a1 wrapper, int stopReason) {
        if (wrapper == null) {
            androidx.work.v.e().a(f77136l, "WorkerWrapper could not be found for " + id2);
            return false;
        }
        wrapper.g(stopReason);
        androidx.work.v.e().a(f77136l, "WorkerWrapper interrupted for " + id2);
        return true;
    }

    private void m(@NonNull a1 wrapper, boolean needsReschedule) {
        synchronized (this.f77148k) {
            try {
                androidx.work.impl.model.n nVarD = wrapper.d();
                String strF = nVarD.f();
                if (h(strF) == wrapper) {
                    f(strF);
                }
                androidx.work.v.e().a(f77136l, getClass().getSimpleName() + " " + strF + " executed; reschedule = " + needsReschedule);
                Iterator<f> it = this.f77147j.iterator();
                while (it.hasNext()) {
                    it.next().d(nVarD, needsReschedule);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(@NonNull final androidx.work.impl.model.n id2, final boolean needsReschedule) {
        this.f77141d.c().execute(new Runnable() { // from class: androidx.work.impl.r
            @Override // java.lang.Runnable
            public final void run() {
                u.c(this.f77101a, id2, needsReschedule);
            }
        });
    }

    private void s() {
        synchronized (this.f77148k) {
            try {
                if (this.f77143f.isEmpty()) {
                    try {
                        this.f77139b.startService(androidx.work.impl.foreground.b.h(this.f77139b));
                    } catch (Throwable th2) {
                        androidx.work.v.e().d(f77136l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f77138a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f77138a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void a(@NonNull String workSpecId, @NonNull androidx.work.n foregroundInfo) {
        synchronized (this.f77148k) {
            try {
                androidx.work.v.e().f(f77136l, "Moving WorkSpec (" + workSpecId + ") to the foreground");
                a1 a1VarRemove = this.f77144g.remove(workSpecId);
                if (a1VarRemove != null) {
                    if (this.f77138a == null) {
                        PowerManager.WakeLock wakeLockB = androidx.work.impl.utils.c0.b(this.f77139b, f77137m);
                        this.f77138a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f77143f.put(workSpecId, a1VarRemove);
                    androidx.core.content.d.B(this.f77139b, androidx.work.impl.foreground.b.g(this.f77139b, a1VarRemove.d(), foregroundInfo));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(@NonNull f executionListener) {
        synchronized (this.f77148k) {
            this.f77147j.add(executionListener);
        }
    }

    @androidx.annotation.p0
    public androidx.work.impl.model.v g(@NonNull String workSpecId) {
        synchronized (this.f77148k) {
            try {
                a1 a1VarH = h(workSpecId);
                if (a1VarH == null) {
                    return null;
                }
                return a1VarH.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f77148k) {
            try {
                z10 = (this.f77144g.isEmpty() && this.f77143f.isEmpty()) ? false : true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean k(@NonNull String id2) {
        boolean zContains;
        synchronized (this.f77148k) {
            zContains = this.f77146i.contains(id2);
        }
        return zContains;
    }

    public boolean l(@NonNull String workSpecId) {
        boolean z10;
        synchronized (this.f77148k) {
            try {
                z10 = h(workSpecId) != null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void n(@NonNull f executionListener) {
        synchronized (this.f77148k) {
            try {
                this.f77147j.remove(executionListener);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean p(@NonNull a0 id2) {
        return q(id2, null);
    }

    public boolean q(@NonNull a0 startStopToken, @androidx.annotation.p0 WorkerParameters.a runtimeExtras) {
        androidx.work.impl.model.n nVarA = startStopToken.a();
        final String strF = nVarA.f();
        final ArrayList arrayList = new ArrayList();
        androidx.work.impl.model.v vVar = (androidx.work.impl.model.v) this.f77142e.runInTransaction(new Callable() { // from class: androidx.work.impl.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.b(this.f77127a, arrayList, strF);
            }
        });
        if (vVar == null) {
            androidx.work.v.e().l(f77136l, "Didn't find WorkSpec for id " + nVarA);
            o(nVarA, false);
            return false;
        }
        synchronized (this.f77148k) {
            try {
                if (l(strF)) {
                    Set<a0> set = this.f77145h.get(strF);
                    if (set.iterator().next().a().e() == nVarA.e()) {
                        set.add(startStopToken);
                        androidx.work.v.e().a(f77136l, "Work " + nVarA + " is already enqueued for processing");
                    } else {
                        o(nVarA, false);
                    }
                    return false;
                }
                if (vVar.C() != nVarA.e()) {
                    o(nVarA, false);
                    return false;
                }
                final a1 a1VarB = new a1.c(this.f77139b, this.f77140c, this.f77141d, this, this.f77142e, vVar, arrayList).c(runtimeExtras).b();
                final t1<Boolean> t1VarC = a1VarB.c();
                t1VarC.m0(new Runnable() { // from class: androidx.work.impl.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.d(this.f77132a, t1VarC, a1VarB);
                    }
                }, this.f77141d.c());
                this.f77144g.put(strF, a1VarB);
                HashSet hashSet = new HashSet();
                hashSet.add(startStopToken);
                this.f77145h.put(strF, hashSet);
                this.f77141d.d().execute(a1VarB);
                androidx.work.v.e().a(f77136l, getClass().getSimpleName() + ": processing " + nVarA);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean r(@NonNull String id2, int reason) {
        a1 a1VarF;
        synchronized (this.f77148k) {
            androidx.work.v.e().a(f77136l, "Processor cancelling " + id2);
            this.f77146i.add(id2);
            a1VarF = f(id2);
        }
        return j(id2, a1VarF, reason);
    }

    public boolean t(@NonNull a0 token, int reason) {
        a1 a1VarF;
        String strF = token.a().f();
        synchronized (this.f77148k) {
            a1VarF = f(strF);
        }
        return j(strF, a1VarF, reason);
    }

    public boolean u(@NonNull a0 runId, int reason) {
        String strF = runId.a().f();
        synchronized (this.f77148k) {
            try {
                if (this.f77143f.get(strF) == null) {
                    Set<a0> set = this.f77145h.get(strF);
                    if (set != null && set.contains(runId)) {
                        return j(strF, f(strF), reason);
                    }
                    return false;
                }
                androidx.work.v.e().a(f77136l, "Ignored stopWork. WorkerWrapper " + strF + " is in foreground");
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

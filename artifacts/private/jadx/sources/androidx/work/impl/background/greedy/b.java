package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.work.h0;
import androidx.work.impl.a0;
import androidx.work.impl.b0;
import androidx.work.impl.constraints.e;
import androidx.work.impl.constraints.trackers.o;
import androidx.work.impl.f;
import androidx.work.impl.model.n;
import androidx.work.impl.model.z;
import androidx.work.impl.p0;
import androidx.work.impl.u;
import androidx.work.impl.w;
import androidx.work.l0;
import androidx.work.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlinx.coroutines.p2;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b implements w, androidx.work.impl.constraints.d, f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f76619o = v.i("GreedyScheduler");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f76620s = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f76621a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.impl.background.greedy.a f76623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f76624d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u f76627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p0 f76628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.work.c f76629i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Boolean f76631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e f76632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.work.impl.utils.taskexecutor.b f76633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f76634n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<n, p2> f76622b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f76625e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b0 f76626f = new b0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<n, C0776b> f76630j = new HashMap();

    /* JADX INFO: renamed from: androidx.work.impl.background.greedy.b$b, reason: collision with other inner class name */
    private static class C0776b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f76635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f76636b;

        private C0776b(int runAttemptCount, long timeStamp) {
            this.f76635a = runAttemptCount;
            this.f76636b = timeStamp;
        }
    }

    public b(@NonNull Context context, @NonNull androidx.work.c configuration, @NonNull o trackers, @NonNull u processor, @NonNull p0 workLauncher, @NonNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        this.f76621a = context;
        h0 h0VarK = configuration.k();
        this.f76623c = new androidx.work.impl.background.greedy.a(this, h0VarK, configuration.a());
        this.f76634n = new d(h0VarK, workLauncher);
        this.f76633m = taskExecutor;
        this.f76632l = new e(trackers);
        this.f76629i = configuration;
        this.f76627g = processor;
        this.f76628h = workLauncher;
    }

    private void f() {
        this.f76631k = Boolean.valueOf(androidx.work.impl.utils.u.b(this.f76621a, this.f76629i));
    }

    private void g() {
        if (this.f76624d) {
            return;
        }
        this.f76627g.e(this);
        this.f76624d = true;
    }

    private void h(@NonNull n id2) {
        p2 p2VarRemove;
        synchronized (this.f76625e) {
            p2VarRemove = this.f76622b.remove(id2);
        }
        if (p2VarRemove != null) {
            v.e().a(f76619o, "Stopping tracking for " + id2);
            p2VarRemove.e(null);
        }
    }

    private long j(androidx.work.impl.model.v workSpec) {
        long jMax;
        synchronized (this.f76625e) {
            try {
                n nVarA = z.a(workSpec);
                C0776b c0776b = this.f76630j.get(nVarA);
                if (c0776b == null) {
                    c0776b = new C0776b(workSpec.f76993k, this.f76629i.a().currentTimeMillis());
                    this.f76630j.put(nVarA, c0776b);
                }
                jMax = c0776b.f76636b + (((long) Math.max((workSpec.f76993k - c0776b.f76635a) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }

    @Override // androidx.work.impl.w
    public boolean a() {
        return false;
    }

    @Override // androidx.work.impl.w
    public void b(@NonNull String workSpecId) {
        if (this.f76631k == null) {
            f();
        }
        if (!this.f76631k.booleanValue()) {
            v.e().f(f76619o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        v.e().a(f76619o, "Cancelling work ID " + workSpecId);
        androidx.work.impl.background.greedy.a aVar = this.f76623c;
        if (aVar != null) {
            aVar.b(workSpecId);
        }
        for (a0 a0Var : this.f76626f.d(workSpecId)) {
            this.f76634n.b(a0Var);
            this.f76628h.e(a0Var);
        }
    }

    @Override // androidx.work.impl.w
    public void c(@NonNull androidx.work.impl.model.v... workSpecs) {
        if (this.f76631k == null) {
            f();
        }
        if (!this.f76631k.booleanValue()) {
            v.e().f(f76619o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<androidx.work.impl.model.v> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (androidx.work.impl.model.v vVar : workSpecs) {
            if (!this.f76626f.a(z.a(vVar))) {
                long jMax = Math.max(vVar.c(), j(vVar));
                long jCurrentTimeMillis = this.f76629i.a().currentTimeMillis();
                if (vVar.f76984b == l0.c.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax) {
                        androidx.work.impl.background.greedy.a aVar = this.f76623c;
                        if (aVar != null) {
                            aVar.a(vVar, jMax);
                        }
                    } else if (vVar.H()) {
                        if (vVar.f76992j.h()) {
                            v.e().a(f76619o, "Ignoring " + vVar + ". Requires device idle.");
                        } else if (vVar.f76992j.e()) {
                            v.e().a(f76619o, "Ignoring " + vVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(vVar);
                            hashSet2.add(vVar.f76983a);
                        }
                    } else if (!this.f76626f.a(z.a(vVar))) {
                        v.e().a(f76619o, "Starting work for " + vVar.f76983a);
                        a0 a0VarF = this.f76626f.f(vVar);
                        this.f76634n.c(a0VarF);
                        this.f76628h.b(a0VarF);
                    }
                }
            }
        }
        synchronized (this.f76625e) {
            try {
                if (!hashSet.isEmpty()) {
                    v.e().a(f76619o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (androidx.work.impl.model.v vVar2 : hashSet) {
                        n nVarA = z.a(vVar2);
                        if (!this.f76622b.containsKey(nVarA)) {
                            this.f76622b.put(nVarA, androidx.work.impl.constraints.f.b(this.f76632l, vVar2, this.f76633m.a(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.f
    public void d(@NonNull n id2, boolean needsReschedule) {
        a0 a0VarB = this.f76626f.b(id2);
        if (a0VarB != null) {
            this.f76634n.b(a0VarB);
        }
        h(id2);
        if (needsReschedule) {
            return;
        }
        synchronized (this.f76625e) {
            try {
                this.f76630j.remove(id2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.constraints.d
    public void e(@NonNull androidx.work.impl.model.v workSpec, @NonNull androidx.work.impl.constraints.b state) {
        n nVarA = z.a(workSpec);
        if (!(state instanceof androidx.work.impl.constraints.b.a)) {
            v.e().a(f76619o, "Constraints not met: Cancelling work ID " + nVarA);
            a0 a0VarB = this.f76626f.b(nVarA);
            if (a0VarB != null) {
                this.f76634n.b(a0VarB);
                this.f76628h.a(a0VarB, ((androidx.work.impl.constraints.b.C0778b) state).d());
            }
        } else if (!this.f76626f.a(nVarA)) {
            v.e().a(f76619o, "Constraints met: Scheduling work ID " + nVarA);
            a0 a0VarE = this.f76626f.e(nVarA);
            this.f76634n.c(a0VarE);
            this.f76628h.b(a0VarE);
        }
    }

    @l1
    public void i(@NonNull androidx.work.impl.background.greedy.a delayedWorkTracker) {
        this.f76623c = delayedWorkTracker;
    }
}

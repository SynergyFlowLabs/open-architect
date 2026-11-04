package androidx.work.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.impl.utils.ForceStopRunnable;
import com.google.common.util.concurrent.t1;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class r0 extends androidx.work.m0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f77105m = 22;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f77106n = 23;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f77107o = 24;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f77108p = "androidx.work.multiprocess.RemoteWorkManagerClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f77112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.c f77113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkDatabase f77114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.work.impl.utils.taskexecutor.b f77115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<w> f77116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u f77117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.work.impl.utils.t f77118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f77119h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f77120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile androidx.work.multiprocess.e f77121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.work.impl.constraints.trackers.o f77122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f77104l = androidx.work.v.i("WorkManagerImpl");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static r0 f77109q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static r0 f77110r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Object f77111s = new Object();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f77123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.t f77124b;

        a(final androidx.work.impl.utils.futures.c val$future, final androidx.work.impl.utils.t val$preferenceUtils) {
            this.f77123a = val$future;
            this.f77124b = val$preferenceUtils;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f77123a.p(Long.valueOf(this.f77124b.b()));
            } catch (Throwable th2) {
                this.f77123a.q(th2);
            }
        }
    }

    class b implements n.a<List<androidx.work.impl.model.v.c>, androidx.work.l0> {
        b() {
        }

        @Override // n.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.work.l0 apply(List<androidx.work.impl.model.v.c> input) {
            if (input == null || input.size() <= 0) {
                return null;
            }
            return input.get(0).S();
        }
    }

    @androidx.annotation.w0(24)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public r0(@NonNull Context context, @NonNull androidx.work.c configuration, @NonNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor, @NonNull WorkDatabase workDatabase, @NonNull List<w> schedulers, @NonNull u processor, @NonNull androidx.work.impl.constraints.trackers.o trackers) {
        Context applicationContext = context.getApplicationContext();
        if (c.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        androidx.work.v.h(new androidx.work.v.a(configuration.j()));
        this.f77112a = applicationContext;
        this.f77115d = workTaskExecutor;
        this.f77114c = workDatabase;
        this.f77117f = processor;
        this.f77122k = trackers;
        this.f77113b = configuration;
        this.f77116e = schedulers;
        this.f77118g = new androidx.work.impl.utils.t(workDatabase);
        z.e(schedulers, this.f77117f, workTaskExecutor.d(), this.f77114c, configuration);
        this.f77115d.b(new ForceStopRunnable(applicationContext, this));
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static void F(@NonNull Context context, @NonNull androidx.work.c configuration) {
        synchronized (f77111s) {
            try {
                r0 r0Var = f77109q;
                if (r0Var != null && f77110r != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (r0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f77110r == null) {
                        f77110r = s0.d(applicationContext, configuration);
                    }
                    f77109q = f77110r;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static boolean G() {
        return L() != null;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @androidx.annotation.p0
    @Deprecated
    public static r0 L() {
        synchronized (f77111s) {
            try {
                r0 r0Var = f77109q;
                if (r0Var != null) {
                    return r0Var;
                }
                return f77110r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static r0 M(@NonNull Context context) {
        r0 r0VarL;
        synchronized (f77111s) {
            try {
                r0VarL = L();
                if (r0VarL == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof androidx.work.c.InterfaceC0774c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    F(applicationContext, ((androidx.work.c.InterfaceC0774c) applicationContext).h());
                    r0VarL = M(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r0VarL;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static void X(@androidx.annotation.p0 r0 delegate) {
        synchronized (f77111s) {
            f77109q = delegate;
        }
    }

    private void a0() {
        try {
            this.f77121j = (androidx.work.multiprocess.e) Class.forName(f77108p).getConstructor(Context.class, r0.class).newInstance(this.f77112a, this);
        } catch (Throwable th2) {
            androidx.work.v.e().b(f77104l, "Unable to initialize multi-process support", th2);
        }
    }

    @Override // androidx.work.m0
    @NonNull
    public kotlinx.coroutines.flow.i<List<androidx.work.l0>> A(@NonNull androidx.work.n0 workQuery) {
        return androidx.work.impl.model.h.a(this.f77114c.g(), this.f77115d.a(), androidx.work.impl.utils.w.b(workQuery));
    }

    @Override // androidx.work.m0
    @NonNull
    public t1<List<androidx.work.l0>> B(@NonNull String uniqueWorkName) {
        androidx.work.impl.utils.z<List<androidx.work.l0>> zVarD = androidx.work.impl.utils.z.d(this, uniqueWorkName);
        this.f77115d.d().execute(zVarD);
        return zVarD.f();
    }

    @Override // androidx.work.m0
    @NonNull
    public kotlinx.coroutines.flow.i<List<androidx.work.l0>> C(@NonNull String uniqueWorkName) {
        return androidx.work.impl.model.x.c(this.f77114c.k(), this.f77115d.a(), uniqueWorkName);
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.lifecycle.w0<List<androidx.work.l0>> D(@NonNull String uniqueWorkName) {
        return androidx.work.impl.utils.n.a(this.f77114c.k().s(uniqueWorkName), androidx.work.impl.model.v.A, this.f77115d);
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.lifecycle.w0<List<androidx.work.l0>> E(@NonNull androidx.work.n0 workQuery) {
        return androidx.work.impl.utils.n.a(this.f77114c.g().c(androidx.work.impl.utils.w.b(workQuery)), androidx.work.impl.model.v.A, this.f77115d);
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.a0 H() {
        androidx.work.impl.utils.v vVar = new androidx.work.impl.utils.v(this);
        this.f77115d.b(vVar);
        return vVar.a();
    }

    @Override // androidx.work.m0
    @NonNull
    public t1<androidx.work.m0.a> I(@NonNull androidx.work.o0 request) {
        return y0.h(this, request);
    }

    @NonNull
    public c0 J(@NonNull String uniqueWorkName, @NonNull androidx.work.l existingPeriodicWorkPolicy, @NonNull androidx.work.d0 periodicWork) {
        return new c0(this, uniqueWorkName, existingPeriodicWorkPolicy == androidx.work.l.KEEP ? androidx.work.m.KEEP : androidx.work.m.REPLACE, Collections.singletonList(periodicWork));
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public Context K() {
        return this.f77112a;
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public androidx.work.impl.utils.t N() {
        return this.f77118g;
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public u O() {
        return this.f77117f;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @androidx.annotation.p0
    public androidx.work.multiprocess.e P() {
        if (this.f77121j == null) {
            synchronized (f77111s) {
                try {
                    if (this.f77121j == null) {
                        a0();
                        if (this.f77121j == null && !TextUtils.isEmpty(this.f77113b.c())) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f77121j;
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public List<w> Q() {
        return this.f77116e;
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public androidx.work.impl.constraints.trackers.o R() {
        return this.f77122k;
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public WorkDatabase S() {
        return this.f77114c;
    }

    androidx.lifecycle.w0<List<androidx.work.l0>> T(@NonNull List<String> workSpecIds) {
        return androidx.work.impl.utils.n.a(this.f77114c.k().z(workSpecIds), androidx.work.impl.model.v.A, this.f77115d);
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public androidx.work.impl.utils.taskexecutor.b U() {
        return this.f77115d;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void V() {
        synchronized (f77111s) {
            try {
                this.f77119h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f77120i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f77120i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void W() {
        androidx.work.impl.background.systemjob.c.d(K());
        S().k().J();
        z.f(o(), S(), Q());
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void Y(@NonNull BroadcastReceiver.PendingResult rescheduleReceiverResult) {
        synchronized (f77111s) {
            try {
                BroadcastReceiver.PendingResult pendingResult = this.f77120i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                this.f77120i = rescheduleReceiverResult;
                if (this.f77119h) {
                    rescheduleReceiverResult.finish();
                    this.f77120i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void Z(@NonNull androidx.work.impl.model.n id2) {
        this.f77115d.b(new androidx.work.impl.utils.a0(this.f77117f, new a0(id2), true));
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.k0 b(@NonNull String uniqueWorkName, @NonNull androidx.work.m existingWorkPolicy, @NonNull List<androidx.work.y> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new c0(this, uniqueWorkName, existingWorkPolicy, work);
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.k0 d(@NonNull List<androidx.work.y> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new c0(this, work);
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.a0 e() {
        androidx.work.impl.utils.b bVarB = androidx.work.impl.utils.b.b(this);
        this.f77115d.b(bVarB);
        return bVarB.f();
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.a0 f(@NonNull final String tag) {
        androidx.work.impl.utils.b bVarE = androidx.work.impl.utils.b.e(tag, this);
        this.f77115d.b(bVarE);
        return bVarE.f();
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.a0 g(@NonNull String uniqueWorkName) {
        androidx.work.impl.utils.b bVarD = androidx.work.impl.utils.b.d(uniqueWorkName, this, true);
        this.f77115d.b(bVarD);
        return bVarD.f();
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.a0 h(@NonNull UUID id2) {
        androidx.work.impl.utils.b bVarC = androidx.work.impl.utils.b.c(id2, this);
        this.f77115d.b(bVarC);
        return bVarC.f();
    }

    @Override // androidx.work.m0
    @NonNull
    public PendingIntent i(@NonNull UUID id2) {
        return PendingIntent.getService(this.f77112a, 0, androidx.work.impl.foreground.b.c(this.f77112a, id2.toString()), Build.VERSION.SDK_INT >= 31 ? 167772160 : androidx.media3.common.j.W0);
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.a0 k(@NonNull List<? extends androidx.work.o0> requests) {
        if (requests.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new c0(this, requests).c();
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.a0 l(@NonNull String uniqueWorkName, @NonNull androidx.work.l existingPeriodicWorkPolicy, @NonNull androidx.work.d0 periodicWork) {
        return existingPeriodicWorkPolicy == androidx.work.l.UPDATE ? y0.d(this, uniqueWorkName, periodicWork) : J(uniqueWorkName, existingPeriodicWorkPolicy, periodicWork).c();
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.a0 n(@NonNull String uniqueWorkName, @NonNull androidx.work.m existingWorkPolicy, @NonNull List<androidx.work.y> work) {
        return new c0(this, uniqueWorkName, existingWorkPolicy, work).c();
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.work.c o() {
        return this.f77113b;
    }

    @Override // androidx.work.m0
    @NonNull
    public t1<Long> r() {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        this.f77115d.b(new a(cVarU, this.f77118g));
        return cVarU;
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.lifecycle.w0<Long> s() {
        return this.f77118g.c();
    }

    @Override // androidx.work.m0
    @NonNull
    public t1<androidx.work.l0> t(@NonNull UUID id2) {
        androidx.work.impl.utils.z<androidx.work.l0> zVarC = androidx.work.impl.utils.z.c(this, id2);
        this.f77115d.d().execute(zVarC);
        return zVarC.f();
    }

    @Override // androidx.work.m0
    @NonNull
    public kotlinx.coroutines.flow.i<androidx.work.l0> u(@NonNull UUID id2) {
        return androidx.work.impl.model.x.b(S().k(), id2);
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.lifecycle.w0<androidx.work.l0> v(@NonNull UUID id2) {
        return androidx.work.impl.utils.n.a(this.f77114c.k().z(Collections.singletonList(id2.toString())), new b(), this.f77115d);
    }

    @Override // androidx.work.m0
    @NonNull
    public t1<List<androidx.work.l0>> w(@NonNull androidx.work.n0 workQuery) {
        androidx.work.impl.utils.z<List<androidx.work.l0>> zVarE = androidx.work.impl.utils.z.e(this, workQuery);
        this.f77115d.d().execute(zVarE);
        return zVarE.f();
    }

    @Override // androidx.work.m0
    @NonNull
    public t1<List<androidx.work.l0>> x(@NonNull String tag) {
        androidx.work.impl.utils.z<List<androidx.work.l0>> zVarB = androidx.work.impl.utils.z.b(this, tag);
        this.f77115d.d().execute(zVarB);
        return zVarB.f();
    }

    @Override // androidx.work.m0
    @NonNull
    public kotlinx.coroutines.flow.i<List<androidx.work.l0>> y(@NonNull String tag) {
        return androidx.work.impl.model.x.d(this.f77114c.k(), this.f77115d.a(), tag);
    }

    @Override // androidx.work.m0
    @NonNull
    public androidx.lifecycle.w0<List<androidx.work.l0>> z(@NonNull String tag) {
        return androidx.work.impl.utils.n.a(this.f77114c.k().u(tag), androidx.work.impl.model.v.A, this.f77115d);
    }
}

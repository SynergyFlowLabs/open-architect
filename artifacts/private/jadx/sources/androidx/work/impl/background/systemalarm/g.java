package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.work.impl.b0;
import androidx.work.impl.model.n;
import androidx.work.impl.q0;
import androidx.work.impl.r0;
import androidx.work.impl.u;
import androidx.work.impl.utils.c0;
import androidx.work.impl.utils.i0;
import androidx.work.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class g implements androidx.work.impl.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f76702l = v.i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f76703m = "ProcessCommand";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f76704n = "KEY_START_ID";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f76705o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f76706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.work.impl.utils.taskexecutor.b f76707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f76708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f76709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f76710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f76711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final List<Intent> f76712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Intent f76713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private c f76714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b0 f76715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.work.impl.p0 f76716k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorC;
            d dVar;
            synchronized (g.this.f76712g) {
                try {
                    g gVar = g.this;
                    gVar.f76713h = gVar.f76712g.get(0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intent intent = g.this.f76713h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f76713h.getIntExtra(g.f76704n, 0);
                v vVarE = v.e();
                String str = g.f76702l;
                vVarE.a(str, "Processing command " + g.this.f76713h + ", " + intExtra);
                PowerManager.WakeLock wakeLockB = c0.b(g.this.f76706a, action + " (" + intExtra + ")");
                try {
                    v.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.acquire();
                    g gVar2 = g.this;
                    gVar2.f76711f.q(gVar2.f76713h, intExtra, gVar2);
                    v.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.release();
                    executorC = g.this.f76707b.c();
                    dVar = new d(g.this);
                } catch (Throwable th3) {
                    try {
                        v vVarE2 = v.e();
                        String str2 = g.f76702l;
                        vVarE2.d(str2, "Unexpected error in onHandleIntent", th3);
                        v.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        executorC = g.this.f76707b.c();
                        dVar = new d(g.this);
                    } catch (Throwable th4) {
                        v.e().a(g.f76702l, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        g.this.f76707b.c().execute(new d(g.this));
                        throw th4;
                    }
                }
                executorC.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f76718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f76719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f76720c;

        b(@NonNull g dispatcher, @NonNull Intent intent, int startId) {
            this.f76718a = dispatcher;
            this.f76719b = intent;
            this.f76720c = startId;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f76718a.a(this.f76719b, this.f76720c);
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f76721a;

        d(@NonNull g dispatcher) {
            this.f76721a = dispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f76721a.c();
        }
    }

    g(@NonNull Context context) {
        this(context, null, null, null);
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @l0
    private boolean j(@NonNull String action) {
        b();
        synchronized (this.f76712g) {
            try {
                Iterator<Intent> it = this.f76712g.iterator();
                while (it.hasNext()) {
                    if (action.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l0
    private void l() {
        b();
        PowerManager.WakeLock wakeLockB = c0.b(this.f76706a, f76703m);
        try {
            wakeLockB.acquire();
            this.f76710e.U().b(new a());
        } finally {
            wakeLockB.release();
        }
    }

    @l0
    public boolean a(@NonNull final Intent intent, final int startId) {
        v vVarE = v.e();
        String str = f76702l;
        vVarE.a(str, "Adding command " + intent + " (" + startId + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            v.e().l(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra(f76704n, startId);
        synchronized (this.f76712g) {
            try {
                boolean zIsEmpty = this.f76712g.isEmpty();
                this.f76712g.add(intent);
                if (zIsEmpty) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @l0
    void c() {
        v vVarE = v.e();
        String str = f76702l;
        vVarE.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f76712g) {
            try {
                if (this.f76713h != null) {
                    v.e().a(str, "Removing command " + this.f76713h);
                    if (!this.f76712g.remove(0).equals(this.f76713h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f76713h = null;
                }
                androidx.work.impl.utils.taskexecutor.a aVarD = this.f76707b.d();
                if (!this.f76711f.p() && this.f76712g.isEmpty() && !aVarD.B1()) {
                    v.e().a(str, "No more commands & intents.");
                    c cVar = this.f76714i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f76712g.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.f
    public void d(@NonNull n id2, boolean needsReschedule) {
        this.f76707b.c().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f76706a, id2, needsReschedule), 0));
    }

    u e() {
        return this.f76709d;
    }

    androidx.work.impl.utils.taskexecutor.b f() {
        return this.f76707b;
    }

    r0 g() {
        return this.f76710e;
    }

    i0 h() {
        return this.f76708c;
    }

    androidx.work.impl.p0 i() {
        return this.f76716k;
    }

    void k() {
        v.e().a(f76702l, "Destroying SystemAlarmDispatcher");
        this.f76709d.n(this);
        this.f76714i = null;
    }

    void m(@NonNull c listener) {
        if (this.f76714i != null) {
            v.e().c(f76702l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f76714i = listener;
        }
    }

    @l1
    g(@NonNull Context context, @p0 u processor, @p0 r0 workManager, @p0 androidx.work.impl.p0 launcher) {
        Context applicationContext = context.getApplicationContext();
        this.f76706a = applicationContext;
        this.f76715j = new b0();
        workManager = workManager == null ? r0.M(context) : workManager;
        this.f76710e = workManager;
        this.f76711f = new androidx.work.impl.background.systemalarm.b(applicationContext, workManager.o().a(), this.f76715j);
        this.f76708c = new i0(workManager.o().k());
        if (processor == null) {
            processor = workManager.O();
        }
        this.f76709d = processor;
        androidx.work.impl.utils.taskexecutor.b bVarU = workManager.U();
        this.f76707b = bVarU;
        if (launcher == null) {
            launcher = new q0(processor, bVarU);
        }
        this.f76716k = launcher;
        processor.e(this);
        this.f76712g = new ArrayList();
        this.f76713h = null;
    }
}

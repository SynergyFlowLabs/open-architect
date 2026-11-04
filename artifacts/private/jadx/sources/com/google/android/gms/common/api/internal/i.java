package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
@g6.a
public class i implements Handler.Callback {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private static i f106050w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private TelemetryData f106053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.gms.common.internal.d0 f106054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f106055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.f f106056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.internal.u0 f106057g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f106064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f106065o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public static final Status f106047s = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Status f106048t = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Object f106049v = new Object();
    private static volatile boolean X = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f106051a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f106052b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f106058h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f106059i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f106060j = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private i0 f106061k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f106062l = new androidx.collection.c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f106063m = new androidx.collection.c();

    @g6.a
    private i(Context context, Looper looper, com.google.android.gms.common.f fVar) {
        this.f106065o = true;
        this.f106055e = context;
        com.google.android.gms.internal.base.q qVar = new com.google.android.gms.internal.base.q(looper, this);
        this.f106064n = qVar;
        this.f106056f = fVar;
        this.f106057g = new com.google.android.gms.common.internal.u0(fVar);
        if (com.google.android.gms.common.util.l.a(context)) {
            this.f106065o = false;
        }
        qVar.sendMessage(qVar.obtainMessage(6));
    }

    @g6.a
    public static void a() {
        synchronized (f106049v) {
            try {
                i iVar = f106050w;
                if (iVar != null) {
                    iVar.f106059i.incrementAndGet();
                    Handler handler = iVar.f106064n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean f() {
        return X;
    }

    public static boolean g() {
        synchronized (f106049v) {
            try {
                if (f106050w != null) {
                    return false;
                }
                X = true;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status i(c cVar, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + cVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    @androidx.annotation.m1
    private final u1 j(com.google.android.gms.common.api.k kVar) {
        Map map = this.f106060j;
        c cVarK0 = kVar.k0();
        u1 u1Var = (u1) map.get(cVarK0);
        if (u1Var == null) {
            u1Var = new u1(this, kVar);
            this.f106060j.put(cVarK0, u1Var);
        }
        if (u1Var.a()) {
            this.f106063m.add(cVarK0);
        }
        u1Var.F();
        return u1Var;
    }

    @androidx.annotation.m1
    private final com.google.android.gms.common.internal.d0 k() {
        if (this.f106054d == null) {
            this.f106054d = com.google.android.gms.common.internal.c0.a(this.f106055e);
        }
        return this.f106054d;
    }

    @androidx.annotation.m1
    private final void l() {
        TelemetryData telemetryData = this.f106053c;
        if (telemetryData != null) {
            if (telemetryData.c() > 0 || e()) {
                k().F(telemetryData);
            }
            this.f106053c = null;
        }
    }

    private final void m(com.google.android.gms.tasks.l lVar, int i10, com.google.android.gms.common.api.k kVar) {
        i2 i2VarA;
        if (i10 == 0 || (i2VarA = i2.a(this, i10, kVar.k0())) == null) {
            return;
        }
        Task taskA = lVar.a();
        Handler handler = this.f106064n;
        Objects.requireNonNull(handler);
        taskA.e(new o1(handler), i2VarA);
    }

    @NonNull
    public static i w() {
        i iVar;
        synchronized (f106049v) {
            try {
                com.google.android.gms.common.internal.w.s(f106050w, "Must guarantee manager is non-null before using getInstance");
                iVar = f106050w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @NonNull
    public static i x(@NonNull Context context) {
        i iVar;
        synchronized (f106049v) {
            try {
                if (f106050w == null) {
                    f106050w = new i(context.getApplicationContext(), com.google.android.gms.common.internal.l.f().getLooper(), com.google.android.gms.common.f.x());
                    if (X) {
                        Handler handler = f106050w.f106064n;
                        Objects.requireNonNull(handler);
                        com.google.android.gms.common.internal.k.v0(new o1(handler));
                    }
                }
                iVar = f106050w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @NonNull
    public final Task A(@NonNull com.google.android.gms.common.api.k kVar) {
        j0 j0Var = new j0(kVar.k0());
        this.f106064n.sendMessage(this.f106064n.obtainMessage(14, j0Var));
        return j0Var.b().a();
    }

    @NonNull
    public final Task B(@NonNull com.google.android.gms.common.api.k kVar, @NonNull u uVar, @NonNull d0 d0Var, @NonNull Runnable runnable) {
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        m(lVar, uVar.e(), kVar);
        this.f106064n.sendMessage(this.f106064n.obtainMessage(8, new m2(new j3(new n2(uVar, d0Var, runnable), lVar), this.f106059i.get(), kVar)));
        return lVar.a();
    }

    @NonNull
    public final Task C(@NonNull com.google.android.gms.common.api.k kVar, @NonNull o.a aVar, int i10) {
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        m(lVar, i10, kVar);
        this.f106064n.sendMessage(this.f106064n.obtainMessage(13, new m2(new l3(aVar, lVar), this.f106059i.get(), kVar)));
        return lVar.a();
    }

    public final void H(@NonNull com.google.android.gms.common.api.k kVar, int i10, @NonNull e.a aVar) {
        this.f106064n.sendMessage(this.f106064n.obtainMessage(4, new m2(new i3(i10, aVar), this.f106059i.get(), kVar)));
    }

    public final void I(@NonNull com.google.android.gms.common.api.k kVar, int i10, @NonNull b0 b0Var, @NonNull com.google.android.gms.tasks.l lVar, @NonNull z zVar) {
        m(lVar, b0Var.d(), kVar);
        this.f106064n.sendMessage(this.f106064n.obtainMessage(4, new m2(new k3(i10, b0Var, lVar, zVar), this.f106059i.get(), kVar)));
    }

    final void J(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        this.f106064n.sendMessage(this.f106064n.obtainMessage(18, new j2(methodInvocation, i10, j10, i11)));
    }

    public final void K(@NonNull ConnectionResult connectionResult, int i10) {
        if (!h(connectionResult, i10)) {
            Handler handler = this.f106064n;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
        }
    }

    public final void L() {
        Handler handler = this.f106064n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void M(@NonNull com.google.android.gms.common.api.k kVar) {
        Handler handler = this.f106064n;
        handler.sendMessage(handler.obtainMessage(7, kVar));
    }

    public final void b(@NonNull i0 i0Var) {
        synchronized (f106049v) {
            try {
                if (this.f106061k != i0Var) {
                    this.f106061k = i0Var;
                    this.f106062l.clear();
                }
                this.f106062l.addAll(i0Var.u());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void c(@NonNull i0 i0Var) {
        synchronized (f106049v) {
            try {
                if (this.f106061k == i0Var) {
                    this.f106061k = null;
                    this.f106062l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.m1
    final boolean e() {
        if (this.f106052b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = com.google.android.gms.common.internal.y.b().a();
        if (rootTelemetryConfigurationA != null && !rootTelemetryConfigurationA.b2()) {
            return false;
        }
        int iA = this.f106057g.a(this.f106055e, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean h(ConnectionResult connectionResult, int i10) {
        return this.f106056f.M(this.f106055e, connectionResult, i10);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Code duplicated, block: B:64:0x020d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0243  */
    /* JADX WARN: Code duplicated, block: B:66:0x0250  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x020d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0250, please report this as an issue */
    @Override // android.os.Handler.Callback
    @androidx.annotation.m1
    public final boolean handleMessage(@NonNull Message message) {
        u1 u1Var = null;
        switch (message.what) {
            case 1:
                this.f106051a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f106064n.removeMessages(12);
                for (c cVar : this.f106060j.keySet()) {
                    Handler handler = this.f106064n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, cVar), this.f106051a);
                }
                return true;
            case 2:
                p3 p3Var = (p3) message.obj;
                for (c cVar2 : p3Var.b()) {
                    u1 u1Var2 = (u1) this.f106060j.get(cVar2);
                    if (u1Var2 == null) {
                        p3Var.c(cVar2, new ConnectionResult(13), null);
                        return true;
                    }
                    if (u1Var2.R()) {
                        p3Var.c(cVar2, ConnectionResult.f105824i3, u1Var2.w().q());
                    } else {
                        ConnectionResult connectionResultU = u1Var2.u();
                        if (connectionResultU != null) {
                            p3Var.c(cVar2, connectionResultU, null);
                        } else {
                            u1Var2.K(p3Var);
                            u1Var2.F();
                        }
                    }
                }
                return true;
            case 3:
                for (u1 u1Var3 : this.f106060j.values()) {
                    u1Var3.E();
                    u1Var3.F();
                }
                return true;
            case 4:
            case 8:
            case 13:
                m2 m2Var = (m2) message.obj;
                u1 u1VarJ = (u1) this.f106060j.get(m2Var.f106140c.k0());
                if (u1VarJ == null) {
                    u1VarJ = j(m2Var.f106140c);
                }
                if (!u1VarJ.a() || this.f106059i.get() == m2Var.f106139b) {
                    u1VarJ.G(m2Var.f106138a);
                } else {
                    m2Var.f106138a.a(f106047s);
                    u1VarJ.N();
                }
                return true;
            case 5:
                int i10 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (u1 u1Var4 : this.f106060j.values()) {
                    if (u1Var4.s() == i10) {
                        u1Var = u1Var4;
                        if (u1Var != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i10 + " while trying to fail enqueued calls.", new Exception());
                        } else if (connectionResult.O1() == 13) {
                            u1Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f106056f.h(connectionResult.O1()) + ": " + connectionResult.T1()));
                        } else {
                            u1Var.e(i(u1Var.f106218c, connectionResult));
                        }
                        return true;
                    }
                }
                if (u1Var != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i10 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.O1() == 13) {
                    u1Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f106056f.h(connectionResult.O1()) + ": " + connectionResult.T1()));
                } else {
                    u1Var.e(i(u1Var.f106218c, connectionResult));
                }
                return true;
            case 6:
                if (this.f106055e.getApplicationContext() instanceof Application) {
                    d.c((Application) this.f106055e.getApplicationContext());
                    d.b().a(new p1(this));
                    if (!d.b().e(true)) {
                        this.f106051a = 300000L;
                    }
                }
                return true;
            case 7:
                j((com.google.android.gms.common.api.k) message.obj);
                return true;
            case 9:
                if (this.f106060j.containsKey(message.obj)) {
                    ((u1) this.f106060j.get(message.obj)).M();
                }
                return true;
            case 10:
                Iterator it = this.f106063m.iterator();
                while (it.hasNext()) {
                    u1 u1Var5 = (u1) this.f106060j.remove((c) it.next());
                    if (u1Var5 != null) {
                        u1Var5.N();
                    }
                }
                this.f106063m.clear();
                return true;
            case 11:
                if (this.f106060j.containsKey(message.obj)) {
                    ((u1) this.f106060j.get(message.obj)).O();
                }
                return true;
            case 12:
                if (this.f106060j.containsKey(message.obj)) {
                    ((u1) this.f106060j.get(message.obj)).b();
                }
                return true;
            case 14:
                j0 j0Var = (j0) message.obj;
                c cVarA = j0Var.a();
                if (this.f106060j.containsKey(cVarA)) {
                    j0Var.b().c(Boolean.valueOf(((u1) this.f106060j.get(cVarA)).r(false)));
                } else {
                    j0Var.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                v1 v1Var = (v1) message.obj;
                if (this.f106060j.containsKey(v1Var.f106241a)) {
                    u1.C((u1) this.f106060j.get(v1Var.f106241a), v1Var);
                }
                return true;
            case 16:
                v1 v1Var2 = (v1) message.obj;
                if (this.f106060j.containsKey(v1Var2.f106241a)) {
                    u1.D((u1) this.f106060j.get(v1Var2.f106241a), v1Var2);
                }
                return true;
            case 17:
                l();
                return true;
            case 18:
                j2 j2Var = (j2) message.obj;
                if (j2Var.f106106c == 0) {
                    k().F(new TelemetryData(j2Var.f106105b, Arrays.asList(j2Var.f106104a)));
                } else {
                    TelemetryData telemetryData = this.f106053c;
                    if (telemetryData != null) {
                        List listO1 = telemetryData.O1();
                        if (telemetryData.c() != j2Var.f106105b || (listO1 != null && listO1.size() >= j2Var.f106107d)) {
                            this.f106064n.removeMessages(17);
                            l();
                        } else {
                            this.f106053c.T1(j2Var.f106104a);
                        }
                    }
                    if (this.f106053c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(j2Var.f106104a);
                        this.f106053c = new TelemetryData(j2Var.f106105b, arrayList);
                        Handler handler2 = this.f106064n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), j2Var.f106106c);
                    }
                }
                return true;
            case 19:
                this.f106052b = false;
                return true;
            default:
                return false;
        }
    }

    public final int n() {
        return this.f106058h.getAndIncrement();
    }

    @androidx.annotation.p0
    final u1 v(c cVar) {
        return (u1) this.f106060j.get(cVar);
    }

    @NonNull
    public final Task z(@NonNull Iterable iterable) {
        p3 p3Var = new p3(iterable);
        this.f106064n.sendMessage(this.f106064n.obtainMessage(2, p3Var));
        return p3Var.a();
    }
}

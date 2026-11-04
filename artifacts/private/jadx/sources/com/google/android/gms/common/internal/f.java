package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class f<T extends IInterface> {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @g6.a
    public static final int f106509k3 = 1;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @g6.a
    public static final int f106510l3 = 4;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @g6.a
    public static final int f106511m3 = 5;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106512n3 = "pendingIntent";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106513o3 = "<<default account>>";

    @androidx.annotation.p0
    private volatile String H1;
    private int X;

    @androidx.annotation.p0
    private final a Y;

    @androidx.annotation.p0
    private final b Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f106518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f106519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f106520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile String f106521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.l1
    l2 f106522g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @androidx.annotation.p0
    private ConnectionResult f106523g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f106524h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f106525h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Looper f106526i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile zzk f106527i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f106528j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NonNull
    @androidx.annotation.l1
    protected AtomicInteger f106529j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.g f106530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Handler f106531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f106532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f106533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private r f106534o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final int f106535p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f106536p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile com.google.android.gms.common.wrappers.a f106537p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    @androidx.annotation.l1
    protected c f106538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private IInterface f106539t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ArrayList f106540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private w1 f106541w;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final Feature[] f106515q3 = new Feature[0];

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String[] f106514p3 = {"service_esmobile", "service_googleme"};

    @g6.a
    public interface a {

        @g6.a
        public static final int Q1 = 1;

        @g6.a
        public static final int R1 = 3;

        @g6.a
        void i(@androidx.annotation.p0 Bundle bundle);

        @g6.a
        void k(int i10);
    }

    @g6.a
    public interface b {
        @g6.a
        void n(@NonNull ConnectionResult connectionResult);
    }

    @g6.a
    public interface c {
        @g6.a
        void a(@NonNull ConnectionResult connectionResult);
    }

    protected class d implements c {
        @g6.a
        public d() {
        }

        @Override // com.google.android.gms.common.internal.f.c
        public final void a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.f2()) {
                f fVar = f.this;
                fVar.k(null, fVar.L());
            } else if (f.this.Z != null) {
                f.this.Z.n(connectionResult);
            }
        }
    }

    @g6.a
    public interface e {
        @g6.a
        void a();
    }

    @androidx.annotation.l1
    @g6.a
    protected f(@NonNull Context context, @NonNull Handler handler, @NonNull l lVar, @NonNull com.google.android.gms.common.g gVar, int i10, @androidx.annotation.p0 a aVar, @androidx.annotation.p0 b bVar) {
        this.f106521f = null;
        this.f106532m = new Object();
        this.f106533n = new Object();
        this.f106540v = new ArrayList();
        this.X = 1;
        this.f106523g3 = null;
        this.f106525h3 = false;
        this.f106527i3 = null;
        this.f106529j3 = new AtomicInteger(0);
        w.s(context, "Context must not be null");
        this.f106524h = context;
        w.s(handler, "Handler must not be null");
        this.f106531l = handler;
        this.f106526i = handler.getLooper();
        w.s(lVar, "Supervisor must not be null");
        this.f106528j = lVar;
        w.s(gVar, "API availability must not be null");
        this.f106530k = gVar;
        this.f106535p0 = i10;
        this.Y = aVar;
        this.Z = bVar;
        this.f106536p1 = null;
    }

    static /* bridge */ /* synthetic */ void l0(f fVar, zzk zzkVar) {
        fVar.f106527i3 = zzkVar;
        if (fVar.b0()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.f106697d;
            y.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.n2());
        }
    }

    static /* bridge */ /* synthetic */ void m0(f fVar, int i10) {
        int i11;
        int i12;
        synchronized (fVar.f106532m) {
            i11 = fVar.X;
        }
        if (i11 == 3) {
            fVar.f106525h3 = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = fVar.f106531l;
        handler.sendMessage(handler.obtainMessage(i12, fVar.f106529j3.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean p0(f fVar, int i10, int i11, IInterface iInterface) {
        synchronized (fVar.f106532m) {
            try {
                if (fVar.X != i10) {
                    return false;
                }
                fVar.r0(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean q0(f fVar) {
        if (!fVar.f106525h3 && !TextUtils.isEmpty(fVar.N()) && !TextUtils.isEmpty(fVar.J())) {
            try {
                Class.forName(fVar.N());
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(int i10, @androidx.annotation.p0 IInterface iInterface) {
        l2 l2Var;
        w.a((i10 == 4) == (iInterface != null));
        synchronized (this.f106532m) {
            try {
                this.X = i10;
                this.f106539t = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    w1 w1Var = this.f106541w;
                    if (w1Var != null) {
                        l lVar = this.f106528j;
                        String strB = this.f106522g.b();
                        w.r(strB);
                        lVar.o(strB, this.f106522g.a(), 4225, w1Var, g0(), this.f106522g.c());
                        this.f106541w = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    w1 w1Var2 = this.f106541w;
                    if (w1Var2 != null && (l2Var = this.f106522g) != null) {
                        l2Var.b();
                        l2Var.a();
                        l lVar2 = this.f106528j;
                        String strB2 = this.f106522g.b();
                        w.r(strB2);
                        lVar2.o(strB2, this.f106522g.a(), 4225, w1Var2, g0(), this.f106522g.c());
                        this.f106529j3.incrementAndGet();
                    }
                    w1 w1Var3 = new w1(this, this.f106529j3.get());
                    this.f106541w = w1Var3;
                    l2 l2Var2 = (this.X != 3 || J() == null) ? new l2(P(), O(), false, 4225, R()) : new l2(G().getPackageName(), J(), true, 4225, false);
                    this.f106522g = l2Var2;
                    if (l2Var2.c() && n() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f106522g.b())));
                    }
                    l lVar3 = this.f106528j;
                    String strB3 = this.f106522g.b();
                    w.r(strB3);
                    ConnectionResult connectionResultM = lVar3.m(new f2(strB3, this.f106522g.a(), 4225, this.f106522g.c()), w1Var3, g0(), E());
                    if (!connectionResultM.f2()) {
                        this.f106522g.b();
                        this.f106522g.a();
                        int iO1 = connectionResultM.O1() == -1 ? 16 : connectionResultM.O1();
                        if (connectionResultM.b2() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(f106512n3, connectionResultM.b2());
                        }
                        n0(iO1, bundle, this.f106529j3.get());
                    }
                } else if (i10 == 4) {
                    w.r(iInterface);
                    T(iInterface);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    protected boolean A() {
        return false;
    }

    @androidx.annotation.p0
    @g6.a
    public Account B() {
        return null;
    }

    @NonNull
    @g6.a
    public Feature[] C() {
        return f106515q3;
    }

    @androidx.annotation.p0
    @g6.a
    public com.google.android.gms.common.wrappers.a D() {
        return this.f106537p2;
    }

    @androidx.annotation.p0
    @g6.a
    protected Executor E() {
        return null;
    }

    @androidx.annotation.p0
    @g6.a
    public Bundle F() {
        return null;
    }

    @NonNull
    @g6.a
    public final Context G() {
        return this.f106524h;
    }

    @g6.a
    public int H() {
        return this.f106535p0;
    }

    @NonNull
    @g6.a
    protected Bundle I() {
        return new Bundle();
    }

    @androidx.annotation.p0
    @g6.a
    protected String J() {
        return null;
    }

    @NonNull
    @g6.a
    public final Looper K() {
        return this.f106526i;
    }

    @NonNull
    @g6.a
    protected Set<Scope> L() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    @g6.a
    public final T M() throws DeadObjectException {
        T t10;
        synchronized (this.f106532m) {
            try {
                if (this.X == 5) {
                    throw new DeadObjectException();
                }
                y();
                IInterface iInterface = this.f106539t;
                w.s(iInterface, "Client is connected but service is null");
                t10 = (T) iInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    @NonNull
    @g6.a
    protected abstract String N();

    @NonNull
    @g6.a
    protected abstract String O();

    @NonNull
    @g6.a
    protected String P() {
        return "com.google.android.gms";
    }

    @androidx.annotation.p0
    @g6.a
    public ConnectionTelemetryConfiguration Q() {
        zzk zzkVar = this.f106527i3;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f106697d;
    }

    @g6.a
    protected boolean R() {
        return n() >= 211700000;
    }

    @g6.a
    public boolean S() {
        return this.f106527i3 != null;
    }

    @androidx.annotation.i
    @g6.a
    protected void T(@NonNull T t10) {
        this.f106518c = System.currentTimeMillis();
    }

    @androidx.annotation.i
    @g6.a
    protected void U(@NonNull ConnectionResult connectionResult) {
        this.f106519d = connectionResult.O1();
        this.f106520e = System.currentTimeMillis();
    }

    @androidx.annotation.i
    @g6.a
    protected void V(int i10) {
        this.f106516a = i10;
        this.f106517b = System.currentTimeMillis();
    }

    @g6.a
    protected void W(int i10, @androidx.annotation.p0 IBinder iBinder, @androidx.annotation.p0 Bundle bundle, int i11) {
        this.f106531l.sendMessage(this.f106531l.obtainMessage(1, i11, -1, new x1(this, i10, iBinder, bundle)));
    }

    @g6.a
    public void X(@NonNull com.google.android.gms.common.wrappers.a aVar) {
        this.f106537p2 = aVar;
    }

    @g6.a
    public void Y(@NonNull String str) {
        this.H1 = str;
    }

    @g6.a
    public void Z(int i10) {
        int i11 = 6 ^ 6;
        this.f106531l.sendMessage(this.f106531l.obtainMessage(6, this.f106529j3.get(), i10));
    }

    @g6.a
    public boolean a() {
        return false;
    }

    @androidx.annotation.l1
    @g6.a
    protected void a0(@NonNull c cVar, int i10, @androidx.annotation.p0 PendingIntent pendingIntent) {
        w.s(cVar, "Connection progress callbacks cannot be null.");
        this.f106538s = cVar;
        this.f106531l.sendMessage(this.f106531l.obtainMessage(3, this.f106529j3.get(), i10, pendingIntent));
    }

    @g6.a
    public boolean b() {
        return false;
    }

    @g6.a
    public boolean b0() {
        return false;
    }

    @g6.a
    public void d() {
        this.f106529j3.incrementAndGet();
        synchronized (this.f106540v) {
            try {
                int size = this.f106540v.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u1) this.f106540v.get(i10)).d();
                }
                this.f106540v.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f106533n) {
            this.f106534o = null;
        }
        r0(1, null);
    }

    @g6.a
    public void e(@NonNull String str) {
        this.f106521f = str;
        d();
    }

    @g6.a
    public boolean f() {
        boolean z10;
        synchronized (this.f106532m) {
            try {
                int i10 = this.X;
                z10 = true;
                if (i10 != 2 && i10 != 3) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @g6.a
    public void g(@NonNull c cVar) {
        w.s(cVar, "Connection progress callbacks cannot be null.");
        this.f106538s = cVar;
        int i10 = 6 << 0;
        r0(2, null);
    }

    @NonNull
    protected final String g0() {
        String str = this.f106536p1;
        return str == null ? this.f106524h.getClass().getName() : str;
    }

    @g6.a
    public boolean h() {
        return false;
    }

    @androidx.annotation.p0
    @g6.a
    public IBinder i() {
        synchronized (this.f106533n) {
            try {
                r rVar = this.f106534o;
                if (rVar == null) {
                    return null;
                }
                return rVar.asBinder();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public boolean isConnected() {
        boolean z10;
        synchronized (this.f106532m) {
            z10 = this.X == 4;
        }
        return z10;
    }

    @androidx.annotation.m1
    @g6.a
    public void k(@androidx.annotation.p0 o oVar, @NonNull Set<Scope> set) {
        AttributionSource attributionSourceA;
        Bundle bundleI = I();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f106537p2 == null || (attributionSourceA = this.f106537p2.a()) == null || attributionSourceA.getAttributionTag() == null) ? this.H1 : attributionSourceA.getAttributionTag();
        String str = attributionTag;
        int i10 = this.f106535p0;
        int i11 = com.google.android.gms.common.g.f106410a;
        Scope[] scopeArr = GetServiceRequest.f106469o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f106470s;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i10, i11, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f106474d = this.f106524h.getPackageName();
        getServiceRequest.f106477g = bundleI;
        if (set != null) {
            getServiceRequest.f106476f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (h()) {
            Account accountB = B();
            if (accountB == null) {
                accountB = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f106478h = accountB;
            if (oVar != null) {
                getServiceRequest.f106475e = oVar.asBinder();
            }
        } else if (a()) {
            getServiceRequest.f106478h = B();
        }
        getServiceRequest.f106479i = f106515q3;
        getServiceRequest.f106480j = C();
        if (b0()) {
            getServiceRequest.f106483m = true;
        }
        try {
            try {
                synchronized (this.f106533n) {
                    try {
                        r rVar = this.f106534o;
                        if (rVar != null) {
                            rVar.c6(new v1(this, this.f106529j3.get()), getServiceRequest);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                W(8, null, null, this.f106529j3.get());
            }
        } catch (DeadObjectException unused2) {
            Z(3);
        } catch (SecurityException e10) {
            throw e10;
        }
    }

    @g6.a
    public void m(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i10;
        IInterface iInterface;
        r rVar;
        synchronized (this.f106532m) {
            try {
                i10 = this.X;
                iInterface = this.f106539t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f106533n) {
            rVar = this.f106534o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append(AbstractJsonLexerKt.NULL);
        } else {
            printWriter.append((CharSequence) N()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (rVar == null) {
            printWriter.println(AbstractJsonLexerKt.NULL);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(rVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f106518c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f106518c;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.f106517b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f106516a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f106517b;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.f106520e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.h.a(this.f106519d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f106520e;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    @g6.a
    public int n() {
        return com.google.android.gms.common.g.f106410a;
    }

    protected final void n0(int i10, @androidx.annotation.p0 Bundle bundle, int i11) {
        this.f106531l.sendMessage(this.f106531l.obtainMessage(7, i11, -1, new y1(this, i10, bundle)));
    }

    @NonNull
    @g6.a
    public Intent p() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @NonNull
    @g6.a
    public String q() {
        l2 l2Var;
        if (!isConnected() || (l2Var = this.f106522g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return l2Var.a();
    }

    @g6.a
    public boolean s() {
        return true;
    }

    @g6.a
    public void t(@NonNull e eVar) {
        eVar.a();
    }

    @androidx.annotation.p0
    @g6.a
    public final Feature[] v() {
        zzk zzkVar = this.f106527i3;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f106695b;
    }

    @androidx.annotation.p0
    @g6.a
    public String w() {
        return this.f106521f;
    }

    @g6.a
    public void x() {
        int iK = this.f106530k.k(this.f106524h, n());
        if (iK == 0) {
            g(new d());
        } else {
            r0(1, null);
            a0(new d(), iK, null);
        }
    }

    @g6.a
    protected final void y() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @androidx.annotation.p0
    @g6.a
    protected abstract T z(@NonNull IBinder iBinder);

    /* JADX WARN: Illegal instructions before constructor call */
    @g6.a
    protected f(@NonNull Context context, @NonNull Looper looper, int i10, @androidx.annotation.p0 a aVar, @androidx.annotation.p0 b bVar, @androidx.annotation.p0 String str) {
        l lVarE = l.e(context);
        com.google.android.gms.common.g gVarI = com.google.android.gms.common.g.i();
        w.r(aVar);
        w.r(bVar);
        this(context, looper, lVarE, gVarI, i10, aVar, bVar, str);
    }

    @androidx.annotation.l1
    @g6.a
    protected f(@NonNull Context context, @NonNull Looper looper, @NonNull l lVar, @NonNull com.google.android.gms.common.g gVar, int i10, @androidx.annotation.p0 a aVar, @androidx.annotation.p0 b bVar, @androidx.annotation.p0 String str) {
        this.f106521f = null;
        this.f106532m = new Object();
        this.f106533n = new Object();
        this.f106540v = new ArrayList();
        int i11 = 5 >> 1;
        this.X = 1;
        this.f106523g3 = null;
        this.f106525h3 = false;
        this.f106527i3 = null;
        this.f106529j3 = new AtomicInteger(0);
        w.s(context, "Context must not be null");
        this.f106524h = context;
        w.s(looper, "Looper must not be null");
        this.f106526i = looper;
        w.s(lVar, "Supervisor must not be null");
        this.f106528j = lVar;
        w.s(gVar, "API availability must not be null");
        this.f106530k = gVar;
        this.f106531l = new t1(this, looper);
        this.f106535p0 = i10;
        this.Y = aVar;
        this.Z = bVar;
        this.f106536p1 = str;
    }
}

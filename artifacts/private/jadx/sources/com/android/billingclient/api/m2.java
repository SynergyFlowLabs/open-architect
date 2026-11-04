package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.aa;
import com.google.android.gms.internal.play_billing.bc;
import com.google.android.gms.internal.play_billing.fc;
import com.google.android.gms.internal.play_billing.n4;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.v9;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class m2 extends i {
    private final Context G;
    private volatile int H;

    @androidx.annotation.p0
    private volatile com.google.android.gms.internal.play_billing.w I;
    private volatile k2 J;

    @androidx.annotation.p0
    private volatile n4 K;

    @androidx.annotation.d
    m2(@androidx.annotation.p0 String str, Context context, @androidx.annotation.p0 r2 r2Var, @androidx.annotation.p0 ExecutorService executorService) {
        super(null, context, null, null);
        this.H = 0;
        this.G = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int T1(com.google.android.gms.internal.play_billing.l4 l4Var) {
        try {
            return ((Integer) l4Var.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            a2(114, 28, t2.G);
            com.google.android.gms.internal.play_billing.p3.m("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            a2(com.planner5d.library.engine.input.f.b.f160745y1, 28, t2.G);
            com.google.android.gms.internal.play_billing.p3.m("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    private final synchronized n4 U1() {
        try {
            if (this.K == null) {
                this.K = t4.b(Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.K;
    }

    private final synchronized void V1() {
        b2(27);
        try {
            try {
                l2 l2Var = null;
                if (this.J != null && this.I != null) {
                    com.google.android.gms.internal.play_billing.p3.k("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.G.unbindService(this.J);
                    this.J = new k2(this, l2Var);
                }
                this.I = null;
                if (this.K != null) {
                    this.K.shutdownNow();
                    this.K = null;
                }
            } catch (RuntimeException e10) {
                com.google.android.gms.internal.play_billing.p3.m("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
            }
            this.H = 3;
        } catch (Throwable th2) {
            this.H = 3;
            throw th2;
        }
    }

    private final synchronized void W1() {
        try {
            if (O1()) {
                com.google.android.gms.internal.play_billing.p3.k("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                b2(26);
                return;
            }
            int i10 = 1;
            if (this.H == 1) {
                com.google.android.gms.internal.play_billing.p3.l("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                return;
            }
            if (this.H == 3) {
                com.google.android.gms.internal.play_billing.p3.l("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                int i11 = 0 ^ (-1);
                a2(38, 26, t2.a(-1, "Billing Override Service connection is disconnected."));
                return;
            }
            this.H = 1;
            com.google.android.gms.internal.play_billing.p3.k("BillingClientTesting", "Starting Billing Override Service setup.");
            this.J = new k2(this, null);
            Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
            intent.setPackage("com.google.android.apps.play.billingtestcompanion");
            List<ResolveInfo> listQueryIntentServices = this.G.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                i10 = 41;
            } else {
                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                        com.google.android.gms.internal.play_billing.p3.l("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        if (this.G.bindService(intent2, this.J, 1)) {
                            com.google.android.gms.internal.play_billing.p3.k("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            return;
                        }
                        com.google.android.gms.internal.play_billing.p3.l("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                    i10 = 39;
                }
            }
            this.H = 0;
            com.google.android.gms.internal.play_billing.p3.k("BillingClientTesting", "Billing Override Service unavailable on device.");
            a2(i10, 26, t2.a(2, "Billing Override Service unavailable on device."));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X1(int i10) {
        return i10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n Y1(int i10, int i11) {
        n nVarA = t2.a(i11, "Billing override value was set by a license tester.");
        a2(105, i10, nVarA);
        return nVarA;
    }

    private final com.google.android.gms.internal.play_billing.l4 Z1(int i10) {
        if (O1()) {
            return fc.a(new b2(this, i10));
        }
        com.google.android.gms.internal.play_billing.p3.l("BillingClientTesting", "Billing Override Service is not ready.");
        a2(com.planner5d.library.engine.input.f.b.f160742x1, 28, t2.a(-1, "Billing Override Service connection is disconnected."));
        return com.google.android.gms.internal.play_billing.c4.a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(int i10, int i11, n nVar) {
        v9 v9VarB = q2.b(i10, i11, nVar);
        Objects.requireNonNull(v9VarB, "ApiFailure should not be null");
        s1().d(v9VarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2(int i10) {
        aa aaVarD = q2.d(i10);
        Objects.requireNonNull(aaVarD, "ApiSuccess should not be null");
        s1().g(aaVarD);
    }

    private final void c2(int i10, Consumer consumer, Runnable runnable) {
        com.google.android.gms.internal.play_billing.c4.c(com.google.android.gms.internal.play_billing.c4.b(Z1(i10), 28500L, TimeUnit.MILLISECONDS, U1()), new h2(this, i10, consumer, runnable), x1());
    }

    final /* synthetic */ void I1(b bVar, c cVar) {
        super.a(bVar, cVar);
    }

    final /* synthetic */ void J1(o oVar, p pVar) {
        super.b(oVar, pVar);
    }

    final /* synthetic */ void K1(n nVar) {
        super.u1(nVar);
    }

    final /* synthetic */ void L1(e0 e0Var, a0 a0Var) {
        super.n(e0Var, a0Var);
    }

    final /* synthetic */ void M1(h0 h0Var, i0 i0Var) {
        super.s(h0Var, i0Var);
    }

    public final synchronized boolean O1() {
        return (this.H != 2 || this.I == null || this.J == null) ? false : true;
    }

    final /* synthetic */ Object Q1(int i10, bc bcVar) throws Exception {
        String str;
        try {
            if (this.I == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.w wVar = this.I;
            String packageName = this.G.getPackageName();
            switch (i10) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            wVar.y9(packageName, str, new i2(bcVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            a2(com.planner5d.library.engine.input.f.b.f160745y1, 28, t2.G);
            com.google.android.gms.internal.play_billing.p3.m("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            bcVar.b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // com.android.billingclient.api.i, com.android.billingclient.api.h
    public final void a(final b bVar, final c cVar) {
        Objects.requireNonNull(cVar);
        c2(3, new Consumer() { // from class: com.android.billingclient.api.e2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cVar.b((n) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.f2
            @Override // java.lang.Runnable
            public final void run() {
                this.f89045a.I1(bVar, cVar);
            }
        });
    }

    @Override // com.android.billingclient.api.i, com.android.billingclient.api.h
    public final void b(final o oVar, final p pVar) {
        c2(4, new Consumer() { // from class: com.android.billingclient.api.z1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                pVar.d((n) obj, oVar.a());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.a2
            @Override // java.lang.Runnable
            public final void run() {
                this.f88996a.J1(oVar, pVar);
            }
        });
    }

    final /* synthetic */ n d2(Activity activity, m mVar) throws Exception {
        return super.l(activity, mVar);
    }

    @Override // com.android.billingclient.api.i, com.android.billingclient.api.h
    public final void e() {
        V1();
        super.e();
    }

    @Override // com.android.billingclient.api.i, com.android.billingclient.api.h
    public final n l(final Activity activity, final m mVar) {
        Consumer consumer = new Consumer() { // from class: com.android.billingclient.api.g2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f89058a.K1((n) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.x1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f89287a.d2(activity, mVar);
            }
        };
        int iT1 = T1(Z1(2));
        if (X1(iT1)) {
            n nVarY1 = Y1(2, iT1);
            consumer.accept(nVarY1);
            return nVarY1;
        }
        try {
            return (n) callable.call();
        } catch (Exception e10) {
            n nVar = t2.f89252k;
            a2(115, 2, nVar);
            com.google.android.gms.internal.play_billing.p3.m("BillingClientTesting", "An internal error occurred.", e10);
            return nVar;
        }
    }

    @Override // com.android.billingclient.api.i, com.android.billingclient.api.h
    public final void n(final e0 e0Var, final a0 a0Var) {
        c2(7, new Consumer() { // from class: com.android.billingclient.api.w1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                a0Var.onProductDetailsResponse((n) obj, arrayList);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.y1
            @Override // java.lang.Runnable
            public final void run() {
                this.f89299a.L1(e0Var, a0Var);
            }
        });
    }

    @Override // com.android.billingclient.api.i, com.android.billingclient.api.h
    public final void s(final h0 h0Var, final i0 i0Var) {
        c2(8, new Consumer() { // from class: com.android.billingclient.api.c2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                i0Var.a((n) obj, null);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.d2
            @Override // java.lang.Runnable
            public final void run() {
                this.f89019a.M1(h0Var, i0Var);
            }
        });
    }

    @Override // com.android.billingclient.api.i, com.android.billingclient.api.h
    public final void w(j jVar) {
        W1();
        super.w(jVar);
    }

    @androidx.annotation.d
    m2(@androidx.annotation.p0 String str, y yVar, Context context, y2 y2Var, @androidx.annotation.p0 r2 r2Var, @androidx.annotation.p0 ExecutorService executorService) {
        super(null, yVar, context, null, null, null);
        this.H = 0;
        this.G = context;
    }

    @androidx.annotation.d
    m2(@androidx.annotation.p0 String str, y yVar, Context context, d0 d0Var, @androidx.annotation.p0 j1 j1Var, @androidx.annotation.p0 r2 r2Var, @androidx.annotation.p0 ExecutorService executorService) {
        super((String) null, yVar, context, d0Var, (j1) null, (r2) null, (ExecutorService) null);
        this.H = 0;
        this.G = context;
    }

    @androidx.annotation.d
    m2(@androidx.annotation.p0 String str, y yVar, Context context, d0 d0Var, @androidx.annotation.p0 j0 j0Var, @androidx.annotation.p0 r2 r2Var, @androidx.annotation.p0 ExecutorService executorService) {
        super((String) null, yVar, context, d0Var, j0Var, (r2) null, (ExecutorService) null);
        this.H = 0;
        this.G = context;
    }
}

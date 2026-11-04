package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.ba;
import com.google.android.gms.internal.play_billing.fa;
import com.google.android.gms.internal.play_billing.ia;
import com.google.android.gms.internal.play_billing.mb;
import com.google.android.gms.internal.play_billing.ob;
import com.google.android.gms.internal.play_billing.sb;
import com.google.android.gms.internal.play_billing.t9;
import com.google.android.gms.internal.play_billing.v9;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class k1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f89148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f89149b;

    /* synthetic */ k1(i iVar, j jVar, v1 v1Var) {
        this.f89149b = iVar;
        this.f89148a = jVar;
    }

    private final void c(n nVar) {
        synchronized (this.f89149b.f89106a) {
            try {
                if (this.f89149b.f89107b == 3) {
                    return;
                }
                this.f89148a.onBillingSetupFinished(nVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0288  */
    /* JADX WARN: Code duplicated, block: B:163:0x028d  */
    final /* synthetic */ Object a() throws Exception {
        Bundle bundle;
        boolean z10;
        int i10;
        int i11;
        String strA;
        int iCc;
        com.google.android.gms.internal.play_billing.o oVar;
        synchronized (this.f89149b.f89106a) {
            try {
                if (this.f89149b.f89107b != 3) {
                    int i12 = this.f89149b.f89107b;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        i iVar = this.f89149b;
                        com.google.android.gms.internal.play_billing.p3.c(bundle, iVar.f89108c, iVar.F.longValue());
                    }
                    try {
                        synchronized (this.f89149b.f89106a) {
                            oVar = this.f89149b.f89113h;
                        }
                        if (oVar == null) {
                            this.f89149b.l0(0);
                            i iVar2 = this.f89149b;
                            n nVar = t2.f89254m;
                            iVar2.h1(119, 6, nVar);
                            c(nVar);
                        } else {
                            String packageName = this.f89149b.f89111f.getPackageName();
                            iCc = 3;
                            int i13 = 23;
                            while (true) {
                                if (i13 < 3) {
                                    i13 = 0;
                                    break;
                                }
                                iCc = bundle == null ? oVar.Cc(i13, packageName, "subs") : oVar.i8(i13, packageName, "subs", bundle);
                                if (iCc == 0) {
                                    com.google.android.gms.internal.play_billing.p3.k("BillingClient", "highestLevelSupportedForSubs: " + i13);
                                    break;
                                }
                                i13--;
                            }
                            this.f89149b.f89116k = i13 >= 5;
                            this.f89149b.f89115j = i13 >= 3;
                            if (i13 < 3) {
                                com.google.android.gms.internal.play_billing.p3.k("BillingClient", "In-app billing API does not support subscription on this device.");
                                i10 = 9;
                            } else {
                                i10 = 1;
                            }
                            for (int i14 = 23; i14 >= 3; i14--) {
                                iCc = bundle == null ? oVar.Cc(i14, packageName, "inapp") : oVar.i8(i14, packageName, "inapp", bundle);
                                if (iCc == 0) {
                                    this.f89149b.f89117l = i14;
                                    com.google.android.gms.internal.play_billing.p3.k("BillingClient", "mHighestLevelSupportedForInApp: " + this.f89149b.f89117l);
                                    break;
                                }
                            }
                            i iVar3 = this.f89149b;
                            iVar3.A = iVar3.f89117l >= 23;
                            i iVar4 = this.f89149b;
                            iVar4.f89131z = iVar4.f89117l >= 22;
                            i iVar5 = this.f89149b;
                            iVar5.f89130y = iVar5.f89117l >= 21;
                            i iVar6 = this.f89149b;
                            iVar6.f89129x = iVar6.f89117l >= 20;
                            i iVar7 = this.f89149b;
                            iVar7.f89128w = iVar7.f89117l >= 19;
                            i iVar8 = this.f89149b;
                            iVar8.f89127v = iVar8.f89117l >= 18;
                            i iVar9 = this.f89149b;
                            iVar9.f89126u = iVar9.f89117l >= 17;
                            i iVar10 = this.f89149b;
                            iVar10.f89125t = iVar10.f89117l >= 16;
                            i iVar11 = this.f89149b;
                            iVar11.f89124s = iVar11.f89117l >= 15;
                            i iVar12 = this.f89149b;
                            iVar12.f89123r = iVar12.f89117l >= 14;
                            i iVar13 = this.f89149b;
                            iVar13.f89122q = iVar13.f89117l >= 12;
                            i iVar14 = this.f89149b;
                            iVar14.f89121p = iVar14.f89117l >= 10;
                            i iVar15 = this.f89149b;
                            iVar15.f89120o = iVar15.f89117l >= 9;
                            i iVar16 = this.f89149b;
                            iVar16.f89119n = iVar16.f89117l >= 8;
                            i iVar17 = this.f89149b;
                            iVar17.f89118m = iVar17.f89117l >= 6;
                            if (this.f89149b.f89117l < 3) {
                                com.google.android.gms.internal.play_billing.p3.l("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i10 = 36;
                            }
                            if (iCc == 0) {
                                synchronized (this.f89149b.f89106a) {
                                    try {
                                        if (this.f89149b.f89107b != 3) {
                                            z10 = i12 != 1;
                                            this.f89149b.l0(2);
                                            z3 z3Var = this.f89149b.f89110e != null ? this.f89149b.f89110e : null;
                                            if (z3Var != null) {
                                                z3Var.g(this.f89149b.f89130y);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } else {
                                z10 = i12 != 1;
                                this.f89149b.l0(0);
                            }
                            strA = null;
                            if (iCc == 0) {
                                try {
                                    if (true != z10) {
                                        this.f89149b.j1(6);
                                    } else {
                                        r2 r2Var = this.f89149b.f89112g;
                                        mb mbVarE = ob.E();
                                        ba baVarH = fa.H();
                                        baVarH.t(0);
                                        mbVarE.r(baVarH);
                                        r2Var.b((ob) mbVarE.n());
                                    }
                                } catch (Throwable th3) {
                                    com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to log.", th3);
                                }
                                c(t2.f89253l);
                            } else {
                                n nVar2 = t2.f89242a;
                                try {
                                    if (true != z10) {
                                        this.f89149b.i1(i10, 6, nVar2, strA);
                                    } else {
                                        ba baVarH2 = fa.H();
                                        baVarH2.t(nVar2.b());
                                        baVarH2.s(nVar2.a());
                                        baVarH2.u(i10);
                                        if (strA != null) {
                                            baVarH2.r(strA);
                                        }
                                        r2 r2Var2 = this.f89149b.f89112g;
                                        mb mbVarE2 = ob.E();
                                        mbVarE2.s((fa) baVarH2.n());
                                        r2Var2.b((ob) mbVarE2.n());
                                    }
                                } catch (Throwable th4) {
                                    com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to log.", th4);
                                }
                                c(t2.f89242a);
                            }
                        }
                    } catch (Exception e10) {
                        z10 = i12 != 1;
                        com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                        if (e10 instanceof DeadObjectException) {
                            i11 = 101;
                        } else if (e10 instanceof RemoteException) {
                            i11 = 100;
                        } else {
                            if (e10 instanceof SecurityException) {
                                i11 = 102;
                            } else {
                                i10 = 42;
                            }
                            if (i10 == 42) {
                                strA = q2.a(e10);
                            } else {
                                strA = null;
                            }
                            this.f89149b.l0(0);
                            iCc = 6;
                        }
                        i10 = i11;
                        if (i10 == 42) {
                            strA = q2.a(e10);
                        } else {
                            strA = null;
                        }
                        this.f89149b.l0(0);
                        iCc = 6;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return null;
    }

    final /* synthetic */ void b() {
        this.f89149b.l0(0);
        n nVar = t2.f89255n;
        this.f89149b.h1(24, 6, nVar);
        c(nVar);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Billing service died.");
        try {
            if (i.S0(this.f89149b)) {
                r2 r2Var = this.f89149b.f89112g;
                t9 t9VarH = v9.H();
                t9VarH.t(6);
                ba baVarH = fa.H();
                baVarH.u(122);
                t9VarH.r(baVarH);
                r2Var.d((v9) t9VarH.n());
            } else {
                this.f89149b.f89112g.a(ia.C());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f89149b.f89106a) {
            try {
                if (this.f89149b.f89107b != 3 && this.f89149b.f89107b != 0) {
                    this.f89149b.l0(0);
                    this.f89149b.n0();
                    this.f89148a.onBillingServiceDisconnected();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.p3.k("BillingClient", "Billing service connected.");
        synchronized (this.f89149b.f89106a) {
            try {
                if (this.f89149b.f89107b == 3) {
                    return;
                }
                this.f89149b.f89113h = com.google.android.gms.internal.play_billing.n.k(iBinder);
                i iVar = this.f89149b;
                if (i.F(new Callable() { // from class: com.android.billingclient.api.h1
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Exception {
                        this.f89097a.a();
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f89132a.b();
                    }
                }, iVar.Z0(), iVar.f0()) == null) {
                    i iVar2 = this.f89149b;
                    n nVarC0 = iVar2.c0();
                    iVar2.h1(25, 6, nVarC0);
                    c(nVarC0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.p3.l("BillingClient", "Billing service disconnected.");
        try {
            if (i.S0(this.f89149b)) {
                r2 r2Var = this.f89149b.f89112g;
                t9 t9VarH = v9.H();
                t9VarH.t(6);
                ba baVarH = fa.H();
                baVarH.u(121);
                t9VarH.r(baVarH);
                r2Var.d((v9) t9VarH.n());
            } else {
                this.f89149b.f89112g.c(sb.C());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f89149b.f89106a) {
            try {
                if (this.f89149b.f89107b == 3) {
                    return;
                }
                this.f89149b.l0(0);
                this.f89148a.onBillingServiceDisconnected();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

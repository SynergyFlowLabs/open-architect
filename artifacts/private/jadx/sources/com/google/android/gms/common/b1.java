package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.l1;
import com.google.android.gms.common.internal.m1;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class b1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile m1 f106347g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private static Context f106349i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final z0 f106341a = new r0(x0.n("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final z0 f106342b = new s0(x0.n("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final z0 f106343c = new t0(x0.n("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final z0 f106344d = new u0(x0.n("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final z0 f106345e = new v0(x0.n("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final z0 f106346f = new w0(x0.n("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f106348h = new Object();

    @Deprecated
    static e0 a(String str, x0 x0Var, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return h(str, x0Var, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static e0 b(b0 b0Var) {
        e0 e0VarD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.w.r(f106349i);
            try {
                i();
                com.google.android.gms.common.internal.w.r(f106349i);
                zzs zzsVarA = b0Var.a(f106349i);
                try {
                    e0VarD = g(b0Var.b() ? f106347g.r8(zzsVarA) : f106347g.p1(zzsVarA));
                } catch (RemoteException e10) {
                    e0VarD = e0.d("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                e0VarD = e0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return e0VarD;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    static /* synthetic */ String c(boolean z10, String str, x0 x0Var) throws Exception {
        String str2 = (z10 || !h(str, x0Var, true, false).f106397a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = com.google.android.gms.common.util.a.b(org.apache.commons.codec.digest.g.f335251e);
        com.google.android.gms.common.internal.w.r(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.n.a(messageDigestB.digest(x0Var.p())), Boolean.valueOf(z10), "12451000.false");
    }

    static synchronized void d(Context context) {
        try {
            if (f106349i == null) {
                if (context != null) {
                    f106349i = context.getApplicationContext();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static boolean e() {
        boolean zQ;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            i();
            zQ = f106347g.q();
        } catch (RemoteException | DynamiteModule.a unused) {
            zQ = false;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return zQ;
    }

    static boolean f() {
        boolean zF;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            i();
            zF = f106347g.f();
        } catch (RemoteException | DynamiteModule.a unused) {
            zF = false;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return zF;
    }

    private static e0 g(zzu zzuVar) {
        if (zzuVar.e2()) {
            zzu zzuVarT1 = zzuVar.T1();
            return e0.f(zzuVar.f2(), zzuVar.O1(), zzuVarT1 != null ? g(zzuVarT1) : null);
        }
        String strB2 = zzuVar.b2();
        PackageManager.NameNotFoundException nameNotFoundException = zzuVar.n2() == 4 ? new PackageManager.NameNotFoundException() : null;
        if (strB2 == null) {
            strB2 = "error checking package certificate";
        }
        return e0.g(zzuVar.f2(), zzuVar.n2(), strB2, nameNotFoundException);
    }

    @Deprecated
    private static e0 h(final String str, final x0 x0Var, final boolean z10, boolean z11) {
        try {
            i();
            com.google.android.gms.common.internal.w.r(f106349i);
            try {
                return f106347g.Q7(new zzw(str, x0Var, z10, z11), com.google.android.gms.dynamic.f.p(f106349i.getPackageManager())) ? e0.b() : new c0(new Callable() { // from class: com.google.android.gms.common.q0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return b1.c(z10, str, x0Var);
                    }
                }, null);
            } catch (RemoteException e10) {
                return e0.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            return e0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    private static void i() throws DynamiteModule.a {
        if (f106347g != null) {
            return;
        }
        com.google.android.gms.common.internal.w.r(f106349i);
        synchronized (f106348h) {
            try {
                if (f106347g == null) {
                    f106347g = l1.k(DynamiteModule.e(f106349i, DynamiteModule.f107048j, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

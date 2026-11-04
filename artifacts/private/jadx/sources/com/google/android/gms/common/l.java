package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
@g6.a
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private static l f106715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.h
    private static volatile Set f106716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.h
    private static volatile Set f106717e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f106718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f106719b;

    public l(@NonNull Context context) {
        this.f106718a = context.getApplicationContext();
    }

    @NonNull
    @g6.a
    public static l a(@NonNull Context context) {
        com.google.android.gms.common.internal.w.r(context);
        synchronized (l.class) {
            try {
                if (f106715c == null) {
                    b1.d(context);
                    f106715c = new l(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f106715c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    static final boolean e(PackageInfo packageInfo, boolean z10) {
        com.google.android.gms.internal.common.m mVarW;
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo == null) {
            return false;
        }
        try {
            com.google.android.gms.internal.common.m mVar = z10 ? a1.f105869c : a1.f105868b;
            int i10 = com.google.android.gms.common.util.a.f106920b;
            com.google.android.gms.internal.common.l0.d(true);
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                mVarW = com.google.android.gms.internal.common.m.w();
            } else {
                int i11 = com.google.android.gms.internal.common.m.f107980c;
                com.google.android.gms.internal.common.i iVar = new com.google.android.gms.internal.common.i();
                for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                    iVar.b(signature.toByteArray());
                }
                mVarW = iVar.d();
            }
            if (mVarW.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            com.google.android.gms.internal.common.m mVarR = mVarW.r();
            int size = mVarR.size();
            int i12 = 0;
            while (i12 < size) {
                byte[] bArr = (byte[]) mVarR.get(i12);
                com.google.android.gms.internal.common.q qVarListIterator = mVar.listIterator(0);
                do {
                    int i13 = i12 + 1;
                    if (!qVarListIterator.hasNext()) {
                        i12 = i13;
                    }
                } while (!Arrays.equals(bArr, (byte[]) qVarListIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return (z10 ? f(packageInfo, a1.f105867a) : f(packageInfo, a1.f105867a[0])) != null;
        }
    }

    @fj.h
    private static x0 f(PackageInfo packageInfo, x0... x0VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        y0 y0Var = new y0(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < x0VarArr.length; i10++) {
            if (x0VarArr[i10].equals(y0Var)) {
                return x0VarArr[i10];
            }
        }
        return null;
    }

    @e.a({"PackageManagerGetSignatures"})
    private final e0 g(@fj.h String str, boolean z10, boolean z11) {
        e0 e0VarC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return e0.c("null pkg");
        }
        if (str.equals(this.f106719b)) {
            return e0.b();
        }
        if (b1.f()) {
            f1 f1Var = new f1(null);
            f1Var.c(str);
            f1Var.a(k.k(this.f106718a));
            f1Var.b(true);
            e0VarC = b1.b(f1Var.d());
        } else {
            try {
                PackageInfo packageInfo = this.f106718a.getPackageManager().getPackageInfo(str, 134217792);
                boolean zK = k.k(this.f106718a);
                if (packageInfo == null) {
                    e0VarC = e0.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        e0VarC = e0.c("single cert required");
                    } else {
                        y0 y0Var = new y0(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        e0 e0VarA = b1.a(str2, y0Var, zK, false);
                        e0VarC = (!e0VarA.f106397a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !b1.a(str2, y0Var, false, true).f106397a) ? e0VarA : e0.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                return e0.d("no pkg ".concat(str), e10);
            }
        }
        if (e0VarC.f106397a) {
            this.f106719b = str;
        }
        return e0VarC;
    }

    @g6.a
    public boolean b(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        return e(packageInfo, true) && k.k(this.f106718a);
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    public boolean c(@fj.h String str) {
        e0 e0VarG = g(str, false, false);
        e0VarG.e();
        return e0VarG.f106397a;
    }

    @com.google.android.gms.common.internal.a0
    @g6.a
    public boolean d(int i10) {
        e0 e0VarC;
        String[] packagesForUid = this.f106718a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            e0VarC = e0.c("no pkgs");
        } else {
            e0VarC = null;
            for (String str : packagesForUid) {
                e0VarC = g(str, false, false);
                if (!e0VarC.f106397a) {
                }
            }
            com.google.android.gms.common.internal.w.r(e0VarC);
        }
        e0VarC.e();
        return e0VarC.f106397a;
    }
}

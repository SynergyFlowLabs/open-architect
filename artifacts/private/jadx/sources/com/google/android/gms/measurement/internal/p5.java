package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class p5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f110345b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f110346c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f110347d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o5 f110348a;

    public p5(o5 o5Var) {
        this.f110348a = o5Var;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z10;
        String str2;
        com.google.android.gms.common.internal.w.r(strArr);
        com.google.android.gms.common.internal.w.r(strArr2);
        com.google.android.gms.common.internal.w.r(atomicReference);
        if (strArr.length == strArr2.length) {
            z10 = true;
            int i10 = 6 ^ 1;
        } else {
            z10 = false;
        }
        com.google.android.gms.common.internal.w.a(z10);
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (Objects.equals(str, strArr[i11])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i11];
                        if (str2 == null) {
                            str2 = strArr2[i11] + "(" + strArr[i11] + ")";
                            strArr3[i11] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f110348a.a() ? str : g(str, s8.f110477c, s8.f110475a, f110345b);
    }

    protected final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f110348a.a() ? str : g(str, t8.f110527b, t8.f110526a, f110346c);
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f110348a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, u8.f110584b, u8.f110583a, f110347d);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String d(zzbg zzbgVar) {
        String string;
        o5 o5Var = this.f110348a;
        if (!o5Var.a()) {
            return zzbgVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzbgVar.f110860c);
        sb2.append(",name=");
        sb2.append(a(zzbgVar.f110858a));
        sb2.append(",params=");
        zzbe zzbeVar = zzbgVar.f110859b;
        if (zzbeVar == null) {
            string = null;
        } else {
            string = !o5Var.a() ? zzbeVar.toString() : e(zzbeVar.n2());
        }
        sb2.append(string);
        return sb2.toString();
    }

    protected final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f110348a.a()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb2.append(strF);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String f(Object[] objArr) {
        if (objArr == null) {
            return okhttp3.v.f334777p;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                int i10 = 6 << 1;
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strE);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}

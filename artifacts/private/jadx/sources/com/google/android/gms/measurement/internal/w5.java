package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class w5 extends l8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char f110622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f110623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private String f110624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u5 f110625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u5 f110626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u5 f110627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u5 f110628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u5 f110629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u5 f110630k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u5 f110631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u5 f110632m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final u5 f110633n;

    w5(h7 h7Var) {
        super(h7Var);
        this.f110622c = (char) 0;
        this.f110623d = -1L;
        this.f110625f = new u5(this, 6, false, false);
        this.f110626g = new u5(this, 6, true, false);
        this.f110627h = new u5(this, 6, false, true);
        this.f110628i = new u5(this, 5, false, false);
        this.f110629j = new u5(this, 5, true, false);
        this.f110630k = new u5(this, 5, false, true);
        this.f110631l = new u5(this, 4, false, false);
        this.f110632m = new u5(this, 3, false, false);
        int i10 = 5 ^ 2;
        this.f110633n = new u5(this, 2, false, false);
    }

    static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(z10, obj);
        String strB2 = B(z10, obj2);
        String strB3 = B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb2.append(str2);
            sb2.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb2.append(str3);
            sb2.append(strB3);
        }
        return sb2.toString();
    }

    @androidx.annotation.l1
    static String B(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof v5) {
                return ((v5) obj).a();
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String strC = C(h7.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(strC)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
        }
        return sb3.toString();
    }

    @androidx.annotation.l1
    static String C(String str) {
        int iLastIndexOf;
        if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(46)) != -1) {
            return str.substring(0, iLastIndexOf);
        }
        return "";
    }

    protected static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new v5(str);
    }

    final /* synthetic */ char D() {
        return this.f110622c;
    }

    final /* synthetic */ void E(char c10) {
        this.f110622c = c10;
    }

    final /* synthetic */ long F() {
        return this.f110623d;
    }

    final /* synthetic */ void G(long j10) {
        this.f110623d = 133005L;
    }

    @Override // com.google.android.gms.measurement.internal.l8
    protected final boolean i() {
        return false;
    }

    public final u5 o() {
        return this.f110625f;
    }

    public final u5 p() {
        return this.f110626g;
    }

    public final u5 q() {
        return this.f110627h;
    }

    public final u5 r() {
        return this.f110628i;
    }

    public final u5 s() {
        return this.f110629j;
    }

    public final u5 t() {
        return this.f110630k;
    }

    public final u5 u() {
        return this.f110631l;
    }

    public final u5 v() {
        return this.f110632m;
    }

    public final u5 w() {
        return this.f110633n;
    }

    protected final void y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        com.google.android.gms.common.internal.w.r(str);
        d7 d7VarA = this.f110184a.A();
        if (d7VarA == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!d7VarA.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            d7VarA.t(new t5(this, i10, str, obj, obj2, obj3));
        }
    }

    @androidx.annotation.l1
    @il.d({"logTagDoNotUseDirectly"})
    protected final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f110624e == null) {
                    this.f110624e = this.f110184a.w().u();
                }
                com.google.android.gms.common.internal.w.r(this.f110624e);
                str = this.f110624e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}

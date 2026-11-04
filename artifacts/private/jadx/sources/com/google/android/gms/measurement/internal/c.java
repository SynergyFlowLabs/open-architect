package com.google.android.gms.measurement.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes4.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f109800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f109801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Boolean f109802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Boolean f109803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Long f109804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Long f109805f;

    c(String str, int i10) {
        this.f109800a = str;
        this.f109801b = i10;
    }

    private static Boolean d(String str, int i10, boolean z10, String str2, List list, String str3, w5 w5Var) {
        if (i10 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z10 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (w5Var != null) {
                        w5Var.r().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @androidx.annotation.l1
    static Boolean e(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    @androidx.annotation.l1
    static Boolean f(String str, com.google.android.gms.internal.measurement.v4 v4Var, w5 w5Var) {
        List list;
        com.google.android.gms.common.internal.w.r(v4Var);
        if (str == null || !v4Var.E() || v4Var.N() == 1 || (v4Var.N() != 7 ? !v4Var.F() : v4Var.K() == 0)) {
            return null;
        }
        int iN = v4Var.N();
        boolean zI = v4Var.I();
        String strG = (zI || iN == 2 || iN == 7) ? v4Var.G() : v4Var.G().toUpperCase(Locale.ENGLISH);
        if (v4Var.K() == 0) {
            list = null;
        } else {
            List listJ = v4Var.J();
            if (!zI) {
                ArrayList arrayList = new ArrayList(listJ.size());
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listJ = Collections.unmodifiableList(arrayList);
            }
            list = listJ;
        }
        return d(str, iN, zI, strG, list, iN == 2 ? strG : null, w5Var);
    }

    static Boolean g(long j10, com.google.android.gms.internal.measurement.p4 p4Var) {
        try {
            return j(new BigDecimal(j10), p4Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(double d10, com.google.android.gms.internal.measurement.p4 p4Var) {
        try {
            return j(new BigDecimal(d10), p4Var, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean i(String str, com.google.android.gms.internal.measurement.p4 p4Var) {
        if (!ve.O(str)) {
            return null;
        }
        try {
            return j(new BigDecimal(str), p4Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @androidx.annotation.l1
    static Boolean j(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.p4 p4Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.w.r(p4Var);
        if (p4Var.E()) {
            boolean z10 = true;
            if (p4Var.P() != 1) {
                if (p4Var.P() == 5) {
                    if (!p4Var.J() || !p4Var.L()) {
                        return null;
                    }
                } else if (!p4Var.H()) {
                    return null;
                }
                int iP = p4Var.P();
                if (p4Var.P() == 5) {
                    if (ve.O(p4Var.K()) && ve.O(p4Var.M())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(p4Var.K());
                            bigDecimal4 = new BigDecimal(p4Var.M());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!ve.O(p4Var.I())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(p4Var.I());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iP == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = iP - 1;
                if (i10 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
                if (i10 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i10 != 3) {
                    if (i10 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d10 == 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean b();

    abstract boolean c();
}

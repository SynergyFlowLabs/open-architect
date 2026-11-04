package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements Iterable, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f108857a;

    public t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f108857a = str;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p Y() {
        return new t(this.f108857a);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return new r(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f108857a.equals(((t) obj).f108857a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        return this.f108857a;
    }

    public final int hashCode() {
        return this.f108857a.hashCode();
    }

    final /* synthetic */ String i() {
        return this.f108857a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        return Boolean.valueOf(!this.f108857a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        String str = this.f108857a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        String str2;
        String str3;
        String str4;
        byte b10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean zIsEmpty;
        e5 e5Var2;
        int i14;
        String str5 = "hasOwnProperty";
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.c.f120629o.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str5 = str5;
                str3 = "charAt";
                str4 = "toString";
                b10 = str.equals(str5) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str3 = "charAt";
                str4 = "toString";
                if (str.equals(str4)) {
                    b10 = com.google.common.base.c.f116463p;
                    str5 = str5;
                } else {
                    str5 = str5;
                }
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b10 = com.google.common.base.c.f116461n;
                    str4 = "toString";
                }
                str4 = "toString";
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    str5 = str5;
                    str4 = "toString";
                    b10 = 0;
                } else {
                    str4 = "toString";
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str5 = str5;
                    str3 = "charAt";
                    str4 = "toString";
                    b10 = 1;
                } else {
                    str3 = "charAt";
                    str4 = "toString";
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b10 = com.google.common.base.c.f116462o;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.c.f120629o)) {
                    b10 = 7;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b10 = 11;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = 4;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b10 = com.google.common.base.c.f116464q;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 3568674:
                if (str.equals(str2)) {
                    b10 = com.google.common.base.c.f116465r;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b10 = 5;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = 8;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 9;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b10 = 10;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b10 = 6;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str5 = str5;
                    str3 = "charAt";
                    str4 = "toString";
                    b10 = 3;
                } else {
                    str3 = "charAt";
                    str4 = "toString";
                }
                break;
            default:
                str3 = "charAt";
                str4 = "toString";
                break;
        }
        String strH = "undefined";
        String str6 = str3;
        switch (b10) {
            case 0:
                f6.c(str6, 1, list);
                int i15 = !list.isEmpty() ? (int) f6.i(e5Var.a((p) list.get(0)).m().doubleValue()) : 0;
                String str7 = this.f108857a;
                return (i15 < 0 || i15 >= str7.length()) ? p.Z1 : new t(String.valueOf(str7.charAt(i15)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb2 = new StringBuilder(this.f108857a);
                for (int i16 = 0; i16 < list.size(); i16++) {
                    sb2.append(e5Var.a((p) list.get(i16)).h());
                }
                return new t(sb2.toString());
            case 2:
                f6.a(str5, 1, list);
                String str8 = this.f108857a;
                p pVarA = e5Var.a((p) list.get(0));
                if (io.sentry.n7.b.f305917e.equals(pVarA.h())) {
                    return p.X1;
                }
                double dDoubleValue = pVarA.m().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str8.length()) ? p.Y1 : p.X1;
            case 3:
                f6.c("indexOf", 2, list);
                return new i(Double.valueOf(this.f108857a.indexOf(list.size() > 0 ? e5Var.a((p) list.get(0)).h() : "undefined", (int) f6.i(list.size() >= 2 ? e5Var.a((p) list.get(1)).m().doubleValue() : 0.0d))));
            case 4:
                f6.c("lastIndexOf", 2, list);
                String str9 = this.f108857a;
                String strH2 = list.size() > 0 ? e5Var.a((p) list.get(0)).h() : "undefined";
                double dDoubleValue2 = list.size() < 2 ? Double.NaN : e5Var.a((p) list.get(1)).m().doubleValue();
                return new i(Double.valueOf(str9.lastIndexOf(strH2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : f6.i(dDoubleValue2)))));
            case 5:
                f6.c("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : e5Var.a((p) list.get(0)).h()).matcher(this.f108857a);
                return matcher.find() ? new f(Arrays.asList(new t(matcher.group()))) : p.T1;
            case 6:
                f6.c("replace", 2, list);
                p pVarA2 = p.S1;
                if (!list.isEmpty()) {
                    strH = e5Var.a((p) list.get(0)).h();
                    if (list.size() > 1) {
                        pVarA2 = e5Var.a((p) list.get(1));
                    }
                }
                String str10 = strH;
                String str11 = this.f108857a;
                int iIndexOf = str11.indexOf(str10);
                if (iIndexOf < 0) {
                    return this;
                }
                if (pVarA2 instanceof j) {
                    i11 = 0;
                    pVarA2 = ((j) pVarA2).a(e5Var, Arrays.asList(new t(str10), new i(Double.valueOf(iIndexOf)), this));
                } else {
                    i11 = 0;
                }
                String strSubstring = str11.substring(i11, iIndexOf);
                String strH3 = pVarA2.h();
                String strSubstring2 = str11.substring(iIndexOf + str10.length());
                StringBuilder sb3 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strH3).length() + String.valueOf(strSubstring2).length());
                sb3.append(strSubstring);
                sb3.append(strH3);
                sb3.append(strSubstring2);
                return new t(sb3.toString());
            case 7:
                f6.c(FirebaseAnalytics.c.f120629o, 1, list);
                Matcher matcher2 = Pattern.compile(list.isEmpty() ? "undefined" : e5Var.a((p) list.get(0)).h()).matcher(this.f108857a);
                return matcher2.find() ? new i(Double.valueOf(matcher2.start())) : new i(Double.valueOf(-1.0d));
            case 8:
                f6.c("slice", 2, list);
                String str12 = this.f108857a;
                double dI = f6.i(!list.isEmpty() ? e5Var.a((p) list.get(0)).m().doubleValue() : 0.0d);
                double dMax = dI < 0.0d ? Math.max(((double) str12.length()) + dI, 0.0d) : Math.min(dI, str12.length());
                double dI2 = f6.i(list.size() > 1 ? e5Var.a((p) list.get(1)).m().doubleValue() : str12.length());
                int i17 = (int) dMax;
                return new t(str12.substring(i17, Math.max(0, ((int) (dI2 < 0.0d ? Math.max(((double) str12.length()) + dI2, 0.0d) : Math.min(dI2, str12.length()))) - i17) + i17));
            case 9:
                f6.c("split", 2, list);
                String str13 = this.f108857a;
                if (str13.length() == 0) {
                    return new f(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strH4 = e5Var.a((p) list.get(0)).h();
                    long jH = list.size() > 1 ? f6.h(e5Var.a((p) list.get(1)).m().doubleValue()) : androidx.collection.g3.f12256c;
                    if (jH == 0) {
                        return new f();
                    }
                    String[] strArrSplit = str13.split(Pattern.quote(strH4), ((int) jH) + 1);
                    int length = strArrSplit.length;
                    if (!strH4.isEmpty() || length <= 0) {
                        i12 = length;
                        i13 = 0;
                    } else {
                        zIsEmpty = strArrSplit[0].isEmpty();
                        i12 = length - 1;
                        if (!strArrSplit[i12].isEmpty()) {
                            i13 = zIsEmpty;
                            i12 = length;
                            i13 = zIsEmpty;
                        }
                    }
                    i13 = zIsEmpty;
                    if (length > jH) {
                        i12--;
                    }
                    while (i13 < i12) {
                        arrayList.add(new t(strArrSplit[i13]));
                        i13++;
                    }
                }
                return new f(arrayList);
            case 10:
                f6.c("substring", 2, list);
                String str14 = this.f108857a;
                if (list.isEmpty()) {
                    e5Var2 = e5Var;
                    i14 = 0;
                } else {
                    e5Var2 = e5Var;
                    i14 = (int) f6.i(e5Var2.a((p) list.get(0)).m().doubleValue());
                }
                int i18 = list.size() > 1 ? (int) f6.i(e5Var2.a((p) list.get(1)).m().doubleValue()) : str14.length();
                int iMin = Math.min(Math.max(i14, 0), str14.length());
                int iMin2 = Math.min(Math.max(i18, 0), str14.length());
                return new t(str14.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                f6.a("toLocaleUpperCase", 0, list);
                return new t(this.f108857a.toUpperCase());
            case 12:
                f6.a("toLocaleLowerCase", 0, list);
                return new t(this.f108857a.toLowerCase());
            case 13:
                f6.a("toLowerCase", 0, list);
                return new t(this.f108857a.toLowerCase(Locale.ENGLISH));
            case 14:
                f6.a(str4, 0, list);
                return this;
            case 15:
                f6.a("toUpperCase", 0, list);
                return new t(this.f108857a.toUpperCase(Locale.ENGLISH));
            case 16:
                f6.a("toUpperCase", 0, list);
                return new t(this.f108857a.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        String str = this.f108857a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }
}

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final com.google.common.collect.l6 f110487a = com.google.common.collect.l6.T(com.google.vr.ndk.base.o0.f127193d, "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f110488b = 0;

    static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @androidx.annotation.l1
    static final boolean c(com.google.android.gms.internal.measurement.y9 y9Var, com.google.common.collect.n6 n6Var, com.google.common.collect.n6 n6Var2, com.google.common.collect.z6 z6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        com.google.common.collect.z6 z6Var2;
        String str4;
        rd rdVar;
        char c10;
        int iE = e(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (iE > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else {
                i15 = i11;
            }
            cArr[iE] = org.locationtech.jts.geom.l.f338162l;
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (i(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i14, str, str2, str3, z10, z11, true) == com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (y9Var == com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                z6Var2 = z6Var;
                str4 = str;
                if (i17 == 1) {
                    if (z6Var2.contains(str4)) {
                        if (iE > 0 && cArr[iE] != '2') {
                            cArr[iE] = org.locationtech.jts.geom.l.f338161k;
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                z6Var2 = z6Var;
                str4 = str;
            }
            if (n6Var.containsKey(y9Var) && (rdVar = (rd) n6Var.get(y9Var)) != null) {
                int iOrdinal = rdVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return i(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) == com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : g(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        if (iOrdinal == 3) {
                            return i(y9Var, n6Var, n6Var2, z6Var2, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z10, z11, true) == com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : h(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        c10 = '0';
                    } else if (i(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                    }
                } else if (i(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iE <= 0 || cArr[iE] == '2') {
            return false;
        }
        cArr[iE] = c10;
        return false;
    }

    public static final Map d(com.google.common.collect.n6 n6Var, com.google.common.collect.n6 n6Var2, com.google.common.collect.z6 z6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return com.google.common.collect.n6.q();
        }
        com.google.android.gms.internal.measurement.y9 y9Var = com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.z9 z9Var = (com.google.android.gms.internal.measurement.z9) n6Var2.get(y9Var);
        com.google.android.gms.internal.measurement.y9 y9Var2 = com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.z9 z9Var2 = (com.google.android.gms.internal.measurement.z9) n6Var2.get(y9Var2);
        com.google.android.gms.internal.measurement.y9 y9Var3 = com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.z9 z9Var3 = (com.google.android.gms.internal.measurement.z9) n6Var2.get(y9Var3);
        com.google.android.gms.internal.measurement.y9 y9Var4 = com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.z9 z9Var4 = (com.google.android.gms.internal.measurement.z9) n6Var2.get(y9Var4);
        return com.google.common.collect.n6.b().i(com.google.vr.ndk.base.o0.f127193d, "2").i("VendorConsent", true != z10 ? com.facebook.appevents.p.f99189d0 : "1").i("VendorLegitimateInterest", true != z11 ? com.facebook.appevents.p.f99189d0 : "1").i("gdprApplies", i12 != 1 ? com.facebook.appevents.p.f99189d0 : "1").i("EnableAdvertiserConsentMode", i11 != 1 ? com.facebook.appevents.p.f99189d0 : "1").i("PolicyVersion", String.valueOf(i13)).i("CmpSdkID", String.valueOf(i10)).i("PurposeOneTreatment", i14 != 1 ? com.facebook.appevents.p.f99189d0 : "1").i("PublisherCC", str).i("PublisherRestrictions1", String.valueOf(z9Var != null ? z9Var.a() : com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_UNDEFINED.a())).i("PublisherRestrictions3", String.valueOf(z9Var2 != null ? z9Var2.a() : com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_UNDEFINED.a())).i("PublisherRestrictions4", String.valueOf(z9Var3 != null ? z9Var3.a() : com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_UNDEFINED.a())).i("PublisherRestrictions7", String.valueOf(z9Var4 != null ? z9Var4.a() : com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_UNDEFINED.a())).l(com.google.common.collect.n6.v("Purpose1", f(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", f(y9Var2, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", f(y9Var3, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", f(y9Var4, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).l(com.google.common.collect.n6.w("AuthorizePurpose1", true != c(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? com.facebook.appevents.p.f99189d0 : "1", "AuthorizePurpose3", true != c(y9Var2, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? com.facebook.appevents.p.f99189d0 : "1", "AuthorizePurpose4", true != c(y9Var3, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? com.facebook.appevents.p.f99189d0 : "1", "AuthorizePurpose7", true != c(y9Var4, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? com.facebook.appevents.p.f99189d0 : "1", "PurposeDiagnostics", new String(cArr))).d();
    }

    private static final int e(com.google.android.gms.internal.measurement.y9 y9Var, com.google.common.collect.n6 n6Var, com.google.common.collect.n6 n6Var2, com.google.common.collect.z6 z6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (y9Var == com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (y9Var == com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (y9Var == com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return y9Var == com.google.android.gms.internal.measurement.y9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String f(com.google.android.gms.internal.measurement.y9 y9Var, com.google.common.collect.n6 n6Var, com.google.common.collect.n6 n6Var2, com.google.common.collect.z6 z6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        String strValueOf = com.facebook.appevents.p.f99189d0;
        String strValueOf2 = (zIsEmpty || str2.length() < y9Var.a()) ? com.facebook.appevents.p.f99189d0 : String.valueOf(str2.charAt(y9Var.a() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= y9Var.a()) {
            strValueOf = String.valueOf(str3.charAt(y9Var.a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean g(com.google.android.gms.internal.measurement.y9 y9Var, com.google.common.collect.n6 n6Var, com.google.common.collect.n6 n6Var2, com.google.common.collect.z6 z6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= y9Var.a()) {
                char cCharAt = str2.charAt(y9Var.a() - 1);
                char c11 = org.locationtech.jts.geom.l.f338161k;
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    if (cCharAt != '1') {
                        c11 = '6';
                    }
                    cArr[iE] = c11;
                }
                return z13;
            }
            c10 = org.locationtech.jts.geom.l.f338160j;
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final boolean h(com.google.android.gms.internal.measurement.y9 y9Var, com.google.common.collect.n6 n6Var, com.google.common.collect.n6 n6Var2, com.google.common.collect.z6 z6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(y9Var, n6Var, n6Var2, z6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= y9Var.a()) {
                char cCharAt = str3.charAt(y9Var.a() - 1);
                char c11 = org.locationtech.jts.geom.l.f338161k;
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    if (cCharAt != '1') {
                        c11 = '7';
                    }
                    cArr[iE] = c11;
                }
                return z13;
            }
            c10 = org.locationtech.jts.geom.l.f338160j;
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final com.google.android.gms.internal.measurement.z9 i(com.google.android.gms.internal.measurement.y9 y9Var, com.google.common.collect.n6 n6Var, com.google.common.collect.n6 n6Var2, com.google.common.collect.z6 z6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (com.google.android.gms.internal.measurement.z9) n6Var2.getOrDefault(y9Var, com.google.android.gms.internal.measurement.z9.PURPOSE_RESTRICTION_UNDEFINED);
    }
}

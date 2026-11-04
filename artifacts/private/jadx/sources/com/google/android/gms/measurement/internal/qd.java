package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f110397a;

    qd(Map map) {
        HashMap map2 = new HashMap();
        this.f110397a = map2;
        map2.putAll(map);
    }

    private final Bundle f() {
        int iG;
        Map map = this.f110397a;
        if ("1".equals(map.get("GoogleConsent")) && (iG = g()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(q8.AD_STORAGE.f110389a, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(q8.AD_PERSONALIZATION.f110389a, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iG >= 4) {
                    String str3 = q8.AD_USER_DATA.f110389a;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    private final int g() {
        try {
            String str = (String) this.f110397a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String a() {
        StringBuilder sb2 = new StringBuilder();
        com.google.common.collect.l6 l6Var = sd.f110487a;
        int size = l6Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) l6Var.get(i10);
            Map map = this.f110397a;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0084, please report this as an issue */
    public final Bundle b() {
        Map map;
        Bundle bundle;
        String str;
        String str2;
        y4 y4Var = z4.f110747a1;
        if (((Boolean) y4Var.b(null)).booleanValue()) {
            Map map2 = this.f110397a;
            if ("1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) y4Var.b(null)).booleanValue()) {
                    return f();
                }
                map = this.f110397a;
                if (map.get(com.google.vr.ndk.base.o0.f127193d) == null) {
                    return f();
                }
                if (g() < 0) {
                    bundle = new Bundle();
                    String str3 = q8.AD_STORAGE.f110389a;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                    String str4 = q8.AD_PERSONALIZATION.f110389a;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1") || !Objects.equals(map.get("AuthorizePurpose4"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString(str4, str2);
                    if (g() >= 4) {
                        bundle.putString(q8.AD_USER_DATA.f110389a, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        } else {
            Map map3 = this.f110397a;
            if ("1".equals(map3.get("GoogleConsent")) && "1".equals(map3.get("gdprApplies")) && "1".equals(map3.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) y4Var.b(null)).booleanValue()) {
                    return f();
                }
                map = this.f110397a;
                if (map.get(com.google.vr.ndk.base.o0.f127193d) == null) {
                    return f();
                }
                if (g() < 0) {
                    bundle = new Bundle();
                    String str5 = q8.AD_STORAGE.f110389a;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str5, str);
                    String str6 = q8.AD_PERSONALIZATION.f110389a;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString(str6, str2);
                    if (g() >= 4) {
                        bundle.putString(q8.AD_USER_DATA.f110389a, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        }
        return Bundle.EMPTY;
    }

    public final String c() {
        String str = (String) this.f110397a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String d(qd qdVar) {
        Map map = qdVar.f110397a;
        boolean zIsEmpty = map.isEmpty();
        String str = com.facebook.appevents.p.f99189d0;
        String str2 = (zIsEmpty || ((String) map.get(com.google.vr.ndk.base.o0.f127193d)) != null) ? com.facebook.appevents.p.f99189d0 : "1";
        Bundle bundleB = b();
        Bundle bundleB2 = qdVar.b();
        if (bundleB.size() != bundleB2.size() || !Objects.equals(bundleB.getString("ad_storage"), bundleB2.getString("ad_storage")) || !Objects.equals(bundleB.getString("ad_personalization"), bundleB2.getString("ad_personalization")) || !Objects.equals(bundleB.getString("ad_user_data"), bundleB2.getString("ad_user_data"))) {
            str = "1";
        }
        return str2.concat(str);
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int i10 = -1;
        try {
            String str = (String) this.f110397a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 < 0 || i10 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        }
        int iG = g();
        if (iG < 0 || iG > 63) {
            sb2.append(com.facebook.appevents.p.f99189d0);
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iG));
        }
        com.google.android.gms.common.internal.w.a(true);
        Map map = this.f110397a;
        int i11 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        int i12 = i11 | 4;
        if ("1".equals(map.get("EnableAdvertiserConsentMode"))) {
            i12 = i11 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12));
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qd) {
            return a().equalsIgnoreCase(((qd) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}

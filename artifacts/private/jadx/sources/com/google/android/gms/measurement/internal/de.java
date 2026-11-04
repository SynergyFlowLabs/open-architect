package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class de extends xd {
    de(qe qeVar) {
        super(qeVar);
    }

    private final String k(String str) {
        String strX = this.f110700b.D0().x(str);
        if (TextUtils.isEmpty(strX)) {
            return (String) z4.f110791r.b(null);
        }
        Uri uri = Uri.parse((String) z4.f110791r.b(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(authority).length());
        sb2.append(strX);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }

    private static final boolean l(String str) {
        String str2 = (String) z4.f110795t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final ce i(String str) {
        c6 c6VarJ0;
        qe qeVar = this.f110700b;
        c6 c6VarJ1 = qeVar.F0().J0(str);
        ce ceVar = null;
        if (c6VarJ1 != null && c6VarJ1.V()) {
            com.google.android.gms.internal.measurement.s7 s7VarF = com.google.android.gms.internal.measurement.z7.F();
            s7VarF.v(2);
            s7VarF.u((com.google.android.gms.internal.measurement.u7) com.google.android.gms.common.internal.w.r(com.google.android.gms.internal.measurement.u7.b(c6VarJ1.M())));
            String strP0 = c6VarJ1.p0();
            com.google.android.gms.internal.measurement.q5 q5VarW = qeVar.D0().w(str);
            if (q5VarW != null && (c6VarJ0 = qeVar.F0().J0(str)) != null && ((q5VarW.S() && q5VarW.T().G() == 100) || this.f110184a.C().P(str, c6VarJ0.l0()) || (!TextUtils.isEmpty(strP0) && Math.abs(strP0.hashCode() % 100) < q5VarW.T().G()))) {
                String strO0 = c6VarJ1.o0();
                s7VarF.v(2);
                com.google.android.gms.internal.measurement.q5 q5VarW2 = qeVar.D0().w(c6VarJ1.o0());
                if (q5VarW2 == null || !q5VarW2.S()) {
                    this.f110184a.a().w().b("[sgtm] Missing sgtm_setting in remote config. appId", strO0);
                    s7VarF.w(4);
                } else {
                    HashMap map = new HashMap();
                    if (!TextUtils.isEmpty(c6VarJ1.l0())) {
                        map.put("x-gtm-server-preview", c6VarJ1.l0());
                    }
                    String strH = q5VarW2.T().H();
                    com.google.android.gms.internal.measurement.u7 u7VarB = com.google.android.gms.internal.measurement.u7.b(c6VarJ1.M());
                    if (u7VarB != null && u7VarB != com.google.android.gms.internal.measurement.u7.CLIENT_UPLOAD_ELIGIBLE) {
                        s7VarF.u(u7VarB);
                    } else if (l(c6VarJ1.o0())) {
                        s7VarF.u(com.google.android.gms.internal.measurement.u7.PINNED_TO_SERVICE_UPLOAD);
                    } else if (TextUtils.isEmpty(strH)) {
                        s7VarF.u(com.google.android.gms.internal.measurement.u7.MISSING_SGTM_SERVER_URL);
                    } else {
                        this.f110184a.a().w().b("[sgtm] Eligible for client side upload. appId", strO0);
                        s7VarF.v(3);
                        s7VarF.u(com.google.android.gms.internal.measurement.u7.CLIENT_UPLOAD_ELIGIBLE);
                        ceVar = new ce(strH, map, cb.SGTM_CLIENT, (com.google.android.gms.internal.measurement.z7) s7VarF.r());
                    }
                    q5VarW2.T().E();
                    q5VarW2.T().F();
                    h7 h7Var = this.f110184a;
                    h7Var.c();
                    if (TextUtils.isEmpty(strH)) {
                        s7VarF.w(6);
                        h7Var.a().w().b("[sgtm] Local service, missing sgtm_server_url", c6VarJ1.o0());
                    } else {
                        h7Var.a().w().b("[sgtm] Eligible for local service direct upload. appId", strO0);
                        s7VarF.v(5);
                        s7VarF.w(2);
                        ceVar = new ce(strH, map, cb.SGTM, (com.google.android.gms.internal.measurement.z7) s7VarF.r());
                    }
                }
                return ceVar != null ? ceVar : new ce(k(str), Collections.EMPTY_MAP, cb.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.z7) s7VarF.r());
            }
            s7VarF.w(3);
            return new ce(k(str), Collections.EMPTY_MAP, cb.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.z7) s7VarF.r());
        }
        return new ce(k(str), Collections.EMPTY_MAP, cb.GOOGLE_ANALYTICS, null);
    }

    @androidx.annotation.m1
    final boolean j(String str, com.google.android.gms.internal.measurement.u7 u7Var) {
        com.google.android.gms.internal.measurement.q5 q5VarW;
        h();
        if (u7Var == com.google.android.gms.internal.measurement.u7.CLIENT_UPLOAD_ELIGIBLE && !l(str) && (q5VarW = this.f110700b.D0().w(str)) != null && q5VarW.S() && !q5VarW.T().H().isEmpty()) {
            return true;
        }
        return false;
    }
}

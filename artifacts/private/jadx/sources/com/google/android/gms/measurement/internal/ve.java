package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.fg;
import com.google.android.gms.internal.measurement.sg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ve extends be {
    ve(qe qeVar) {
        super(qeVar);
    }

    private static final String A(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final Object B(com.google.android.gms.internal.measurement.c7 c7Var) {
        if (c7Var.G()) {
            return c7Var.H();
        }
        if (c7Var.I()) {
            return Long.valueOf(c7Var.J());
        }
        if (c7Var.M()) {
            return Double.valueOf(c7Var.N());
        }
        if (c7Var.P() > 0) {
            return Y(c7Var.O());
        }
        return null;
    }

    private static final void C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z(builder, str3, string, set);
            }
        }
    }

    private static final void D(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.p7 p7Var) {
        if (p7Var == null) {
            return;
        }
        y(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (p7Var.H() != 0) {
            y(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : p7Var.G()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (p7Var.F() != 0) {
            y(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : p7Var.E()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (p7Var.J() != 0) {
            y(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.w6 w6Var : p7Var.I()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(w6Var.E() ? Integer.valueOf(w6Var.F()) : null);
                sb2.append(":");
                sb2.append(w6Var.G() ? Long.valueOf(w6Var.H()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (p7Var.L() != 0) {
            y(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.r7 r7Var : p7Var.K()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(r7Var.E() ? Integer.valueOf(r7Var.F()) : null);
                sb2.append(": [");
                Iterator it = r7Var.G().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        y(sb2, 3);
        sb2.append("}\n");
    }

    private static final void E(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void F(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.p4 p4Var) {
        String str2;
        if (p4Var == null) {
            return;
        }
        y(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (p4Var.E()) {
            int iP = p4Var.P();
            if (iP == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iP == 2) {
                str2 = "LESS_THAN";
            } else if (iP != 3) {
                str2 = iP != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            E(sb2, i10, "comparison_type", str2);
        }
        if (p4Var.F()) {
            E(sb2, i10, "match_as_float", Boolean.valueOf(p4Var.G()));
        }
        if (p4Var.H()) {
            E(sb2, i10, "comparison_value", p4Var.I());
        }
        if (p4Var.J()) {
            E(sb2, i10, "min_comparison_value", p4Var.K());
        }
        if (p4Var.L()) {
            E(sb2, i10, "max_comparison_value", p4Var.M());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean P(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    static List Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    static com.google.android.gms.internal.measurement.xc W(com.google.android.gms.internal.measurement.xc xcVar, byte[] bArr) throws com.google.android.gms.internal.measurement.cc {
        com.google.android.gms.internal.measurement.bb bbVarA = com.google.android.gms.internal.measurement.bb.a();
        return bbVarA != null ? xcVar.Hc(bArr, bbVarA) : xcVar.Lg(bArr);
    }

    static int X(com.google.android.gms.internal.measurement.j7 j7Var, String str) {
        for (int i10 = 0; i10 < j7Var.Y0(); i10++) {
            if (str.equals(j7Var.Z0(i10).G())) {
                return i10;
            }
        }
        return -1;
    }

    static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.c7 c7Var = (com.google.android.gms.internal.measurement.c7) it.next();
            if (c7Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.c7 c7Var2 : c7Var.O()) {
                    if (c7Var2.G()) {
                        bundle.putString(c7Var2.F(), c7Var2.H());
                    } else if (c7Var2.I()) {
                        bundle.putLong(c7Var2.F(), c7Var2.J());
                    } else if (c7Var2.M()) {
                        bundle.putDouble(c7Var2.F(), c7Var2.N());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static final void o(com.google.android.gms.internal.measurement.x6 x6Var, String str, Object obj) {
        List listU = x6Var.u();
        int i10 = 0;
        while (true) {
            if (i10 >= listU.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.c7) listU.get(i10)).F())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.b7 b7VarQ = com.google.android.gms.internal.measurement.c7.Q();
        b7VarQ.v(str);
        b7VarQ.A(((Long) obj).longValue());
        if (i10 >= 0) {
            x6Var.z(i10, b7VarQ);
        } else {
            x6Var.B(b7VarQ);
        }
    }

    @androidx.annotation.m1
    static final boolean p(zzbg zzbgVar, zzr zzrVar) {
        com.google.android.gms.common.internal.w.r(zzbgVar);
        com.google.android.gms.common.internal.w.r(zzrVar);
        return !TextUtils.isEmpty(zzrVar.f110882b);
    }

    static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.c7 c7Var = (com.google.android.gms.internal.measurement.c7) it.next();
            String strF = c7Var.F();
            if (c7Var.M()) {
                bundle.putDouble(strF, c7Var.N());
            } else if (c7Var.K()) {
                bundle.putFloat(strF, c7Var.L());
            } else if (c7Var.G()) {
                bundle.putString(strF, c7Var.H());
            } else if (c7Var.I()) {
                bundle.putLong(strF, c7Var.J());
            }
        }
        return bundle;
    }

    static final com.google.android.gms.internal.measurement.c7 r(com.google.android.gms.internal.measurement.y6 y6Var, String str) {
        for (com.google.android.gms.internal.measurement.c7 c7Var : y6Var.E()) {
            if (c7Var.F().equals(str)) {
                return c7Var;
            }
        }
        return null;
    }

    static final Map s(com.google.android.gms.internal.measurement.y6 y6Var, String... strArr) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.c7 c7Var : y6Var.E()) {
            if (Arrays.asList(strArr).contains(c7Var.F()) && (objB = B(c7Var)) != null) {
                map.put(c7Var.F(), objB);
            }
        }
        return map;
    }

    static final Map t(com.google.android.gms.internal.measurement.y6 y6Var, String str) {
        Object objB;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.c7 c7Var : y6Var.E()) {
            if (c7Var.F().startsWith("gad_") && (objB = B(c7Var)) != null) {
                map.put(c7Var.F(), objB);
            }
        }
        return map;
    }

    static final Object u(com.google.android.gms.internal.measurement.y6 y6Var, String str) {
        com.google.android.gms.internal.measurement.c7 c7VarR = r(y6Var, str);
        if (c7VarR == null) {
            return null;
        }
        return B(c7VarR);
    }

    static final Object v(com.google.android.gms.internal.measurement.y6 y6Var, String str, Object obj) {
        Object objU = u(y6Var, str);
        return objU == null ? obj : objU;
    }

    private final void w(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.c7 c7Var = (com.google.android.gms.internal.measurement.c7) it.next();
            if (c7Var != null) {
                y(sb2, i11);
                sb2.append("param {\n");
                E(sb2, i11, "name", c7Var.E() ? this.f110184a.D().b(c7Var.F()) : null);
                E(sb2, i11, "string_value", c7Var.G() ? c7Var.H() : null);
                E(sb2, i11, "int_value", c7Var.I() ? Long.valueOf(c7Var.J()) : null);
                E(sb2, i11, "double_value", c7Var.M() ? Double.valueOf(c7Var.N()) : null);
                if (c7Var.P() > 0) {
                    w(sb2, i11, c7Var.O());
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void x(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.l4 l4Var) {
        String str;
        if (l4Var == null) {
            return;
        }
        y(sb2, i10);
        sb2.append("filter {\n");
        if (l4Var.I()) {
            E(sb2, i10, "complement", Boolean.valueOf(l4Var.J()));
        }
        if (l4Var.K()) {
            E(sb2, i10, "param_name", this.f110184a.D().b(l4Var.L()));
        }
        if (l4Var.E()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.v4 v4VarF = l4Var.F();
            if (v4VarF != null) {
                y(sb2, i11);
                sb2.append("string_filter {\n");
                if (v4VarF.E()) {
                    switch (v4VarF.N()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    E(sb2, i11, "match_type", str);
                }
                if (v4VarF.F()) {
                    E(sb2, i11, "expression", v4VarF.G());
                }
                if (v4VarF.H()) {
                    E(sb2, i11, "case_sensitive", Boolean.valueOf(v4VarF.I()));
                }
                if (v4VarF.K() > 0) {
                    y(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : v4VarF.J()) {
                        y(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (l4Var.G()) {
            F(sb2, i10 + 1, "number_filter", l4Var.H());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    private static final void y(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final void z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    final void G(com.google.android.gms.internal.measurement.a8 a8Var, Object obj) {
        com.google.android.gms.common.internal.w.r(obj);
        a8Var.x();
        a8Var.A();
        a8Var.C();
        if (obj instanceof String) {
            a8Var.w((String) obj);
            return;
        }
        if (obj instanceof Long) {
            a8Var.z(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            a8Var.B(((Double) obj).doubleValue());
        } else {
            this.f110184a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final void H(com.google.android.gms.internal.measurement.b7 b7Var, Object obj) {
        com.google.android.gms.common.internal.w.r(obj);
        b7Var.z();
        b7Var.B();
        b7Var.D();
        b7Var.H();
        if (obj instanceof String) {
            b7Var.x((String) obj);
            return;
        }
        if (obj instanceof Long) {
            b7Var.A(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            b7Var.C(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f110184a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.b7 b7VarQ = com.google.android.gms.internal.measurement.c7.Q();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.b7 b7VarQ2 = com.google.android.gms.internal.measurement.c7.Q();
                    b7VarQ2.v(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        b7VarQ2.A(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        b7VarQ2.x((String) obj2);
                    } else if (obj2 instanceof Double) {
                        b7VarQ2.C(((Double) obj2).doubleValue());
                    }
                    b7VarQ.F(b7VarQ2);
                }
                if (b7VarQ.E() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.c7) b7VarQ.r());
                }
            }
        }
        b7Var.G(arrayList);
    }

    @e.b(30)
    final zzoh I(String str, com.google.android.gms.internal.measurement.j7 j7Var, com.google.android.gms.internal.measurement.x6 x6Var, String str2) {
        int iIndexOf;
        fg.a();
        h7 h7Var = this.f110184a;
        if (!h7Var.w().H(str, z4.Q0)) {
            return null;
        }
        long jCurrentTimeMillis = h7Var.e().currentTimeMillis();
        Set setA = ue.a(h7Var.w().C(str, z4.f110800v0).split(","));
        qe qeVar = this.f110700b;
        de deVarC0 = qeVar.C0();
        String strX = deVarC0.f110700b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        h7 h7Var2 = deVarC0.f110184a;
        builder.scheme(h7Var2.w().C(str, z4.f110786o0));
        if (TextUtils.isEmpty(strX)) {
            builder.authority(h7Var2.w().C(str, z4.f110788p0));
        } else {
            String strC = h7Var2.w().C(str, z4.f110788p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(strC).length());
            sb2.append(strX);
            sb2.append(".");
            sb2.append(strC);
            builder.authority(sb2.toString());
        }
        builder.path(h7Var2.w().C(str, z4.f110790q0));
        z(builder, "gmp_app_id", j7Var.q0(), setA);
        h7Var.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), setA);
        String strQ = j7Var.Q();
        k kVarW = h7Var.w();
        y4 y4Var = z4.T0;
        if (kVarW.H(str, y4Var) && qeVar.D0().N(str)) {
            strQ = "";
        }
        z(builder, "app_instance_id", strQ, setA);
        z(builder, "rdid", j7Var.K(), setA);
        z(builder, "bundle_id", j7Var.F(), setA);
        String strF = x6Var.F();
        String strA = s8.a(strF);
        if (true != TextUtils.isEmpty(strA)) {
            strF = strA;
        }
        z(builder, "app_event_name", strF, setA);
        z(builder, io.sentry.protocol.a.b.f306114f, String.valueOf(j7Var.w0()), setA);
        String strX2 = j7Var.x();
        if (h7Var.w().H(str, y4Var) && qeVar.D0().K(str) && !TextUtils.isEmpty(strX2) && (iIndexOf = strX2.indexOf(".")) != -1) {
            strX2 = strX2.substring(0, iIndexOf);
        }
        z(builder, "os_version", strX2, setA);
        z(builder, "timestamp", String.valueOf(x6Var.I()), setA);
        if (j7Var.N()) {
            z(builder, "lat", "1", setA);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(j7Var.d0()), setA);
        z(builder, "trigger_uri_source", "1", setA);
        z(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setA);
        z(builder, "request_uuid", str2, setA);
        List<com.google.android.gms.internal.measurement.c7> listU = x6Var.u();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.c7 c7Var : listU) {
            String strF2 = c7Var.F();
            if (c7Var.M()) {
                bundle.putString(strF2, String.valueOf(c7Var.N()));
            } else if (c7Var.K()) {
                bundle.putString(strF2, String.valueOf(c7Var.L()));
            } else if (c7Var.G()) {
                bundle.putString(strF2, c7Var.H());
            } else if (c7Var.I()) {
                bundle.putString(strF2, String.valueOf(c7Var.J()));
            }
        }
        C(builder, h7Var.w().C(str, z4.f110798u0).split("\\|"), bundle, setA);
        List<com.google.android.gms.internal.measurement.b8> listX0 = j7Var.X0();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.b8 b8Var : listX0) {
            String strG = b8Var.G();
            if (b8Var.N()) {
                bundle2.putString(strG, String.valueOf(b8Var.O()));
            } else if (b8Var.L()) {
                bundle2.putString(strG, String.valueOf(b8Var.M()));
            } else if (b8Var.H()) {
                bundle2.putString(strG, b8Var.I());
            } else if (b8Var.J()) {
                bundle2.putString(strG, String.valueOf(b8Var.K()));
            }
        }
        C(builder, h7Var.w().C(str, z4.f110796t0).split("\\|"), bundle2, setA);
        z(builder, "dma", true != j7Var.Z() ? com.facebook.appevents.p.f99189d0 : "1", setA);
        if (!j7Var.b0().isEmpty()) {
            z(builder, "dma_cps", j7Var.b0(), setA);
        }
        if (j7Var.h0()) {
            com.google.android.gms.internal.measurement.g6 g6VarI0 = j7Var.i0();
            if (!g6VarI0.P().isEmpty()) {
                z(builder, "dl_gclid", g6VarI0.P(), setA);
            }
            if (!g6VarI0.R().isEmpty()) {
                z(builder, "dl_gbraid", g6VarI0.R(), setA);
            }
            if (!g6VarI0.T().isEmpty()) {
                z(builder, "dl_gs", g6VarI0.T(), setA);
            }
            if (g6VarI0.V() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(g6VarI0.V()), setA);
            }
            if (!g6VarI0.X().isEmpty()) {
                z(builder, "mr_gclid", g6VarI0.X(), setA);
            }
            if (!g6VarI0.Z().isEmpty()) {
                z(builder, "mr_gbraid", g6VarI0.Z(), setA);
            }
            if (!g6VarI0.b0().isEmpty()) {
                z(builder, "mr_gs", g6VarI0.b0(), setA);
            }
            if (g6VarI0.d0() > 0) {
                z(builder, "mr_click_ts", String.valueOf(g6VarI0.d0()), setA);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    final com.google.android.gms.internal.measurement.y6 J(a0 a0Var) {
        com.google.android.gms.internal.measurement.x6 x6VarO = com.google.android.gms.internal.measurement.y6.O();
        x6VarO.L(a0Var.f109734e);
        zzbe zzbeVar = a0Var.f109735f;
        c0 c0Var = new c0(zzbeVar);
        while (c0Var.hasNext()) {
            String next = c0Var.next();
            com.google.android.gms.internal.measurement.b7 b7VarQ = com.google.android.gms.internal.measurement.c7.Q();
            b7VarQ.v(next);
            Object objO1 = zzbeVar.O1(next);
            com.google.android.gms.common.internal.w.r(objO1);
            H(b7VarQ, objO1);
            x6VarO.B(b7VarQ);
        }
        String str = a0Var.f109732c;
        if (!TextUtils.isEmpty(str) && zzbeVar.O1("_o") == null) {
            com.google.android.gms.internal.measurement.b7 b7VarQ2 = com.google.android.gms.internal.measurement.c7.Q();
            b7VarQ2.v("_o");
            b7VarQ2.x(str);
            x6VarO.A((com.google.android.gms.internal.measurement.c7) b7VarQ2.r());
        }
        return (com.google.android.gms.internal.measurement.y6) x6VarO.r();
    }

    final String K(com.google.android.gms.internal.measurement.i7 i7Var) {
        String str;
        String str2;
        String str3;
        com.google.android.gms.internal.measurement.k6 k6VarY0;
        if (i7Var == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (i7Var.J()) {
            E(sb2, 0, "upload_subdomain", i7Var.K());
        }
        if (i7Var.H()) {
            E(sb2, 0, "sgtm_join_id", i7Var.I());
        }
        for (com.google.android.gms.internal.measurement.k7 k7Var : i7Var.E()) {
            if (k7Var != null) {
                y(sb2, 1);
                sb2.append("bundle {\n");
                if (k7Var.e0()) {
                    E(sb2, 1, "protocol_version", Integer.valueOf(k7Var.f1()));
                }
                sg.a();
                h7 h7Var = this.f110184a;
                if (h7Var.w().H(k7Var.E(), z4.N0) && k7Var.L0()) {
                    E(sb2, 1, "session_stitching_token", k7Var.M0());
                }
                E(sb2, 1, "platform", k7Var.z2());
                if (k7Var.G()) {
                    E(sb2, 1, "gmp_version", Long.valueOf(k7Var.H()));
                }
                if (k7Var.I()) {
                    E(sb2, 1, "uploading_gmp_version", Long.valueOf(k7Var.J()));
                }
                if (k7Var.H0()) {
                    E(sb2, 1, "dynamite_version", Long.valueOf(k7Var.I0()));
                }
                if (k7Var.a0()) {
                    E(sb2, 1, "config_version", Long.valueOf(k7Var.b0()));
                }
                E(sb2, 1, "gmp_app_id", k7Var.T());
                E(sb2, 1, "app_id", k7Var.E());
                E(sb2, 1, io.sentry.protocol.a.b.f306114f, k7Var.F());
                if (k7Var.Y()) {
                    E(sb2, 1, "app_version_major", Integer.valueOf(k7Var.Z()));
                }
                E(sb2, 1, "firebase_instance_id", k7Var.X());
                if (k7Var.O()) {
                    E(sb2, 1, "dev_cert_hash", Long.valueOf(k7Var.P()));
                }
                E(sb2, 1, "app_store", k7Var.F2());
                if (k7Var.p2()) {
                    E(sb2, 1, "upload_timestamp_millis", Long.valueOf(k7Var.q2()));
                }
                if (k7Var.r2()) {
                    E(sb2, 1, "start_timestamp_millis", Long.valueOf(k7Var.s2()));
                }
                if (k7Var.t2()) {
                    E(sb2, 1, "end_timestamp_millis", Long.valueOf(k7Var.u2()));
                }
                if (k7Var.v2()) {
                    E(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(k7Var.w2()));
                }
                if (k7Var.x2()) {
                    E(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(k7Var.y2()));
                }
                E(sb2, 1, "app_instance_id", k7Var.N());
                E(sb2, 1, "resettable_device_id", k7Var.K());
                E(sb2, 1, "ds_id", k7Var.d0());
                if (k7Var.L()) {
                    E(sb2, 1, "limited_ad_tracking", Boolean.valueOf(k7Var.M()));
                }
                E(sb2, 1, "os_version", k7Var.A2());
                E(sb2, 1, io.sentry.k4.c.f305748d, k7Var.B2());
                E(sb2, 1, "user_default_language", k7Var.C2());
                if (k7Var.D2()) {
                    E(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(k7Var.E2()));
                }
                if (k7Var.Q()) {
                    E(sb2, 1, "bundle_sequential_index", Integer.valueOf(k7Var.R()));
                }
                if (k7Var.Z0()) {
                    E(sb2, 1, "delivery_index", Integer.valueOf(k7Var.a1()));
                }
                if (k7Var.U()) {
                    E(sb2, 1, "service_upload", Boolean.valueOf(k7Var.V()));
                }
                E(sb2, 1, "health_monitor", k7Var.S());
                if (k7Var.F0()) {
                    E(sb2, 1, "retry_counter", Integer.valueOf(k7Var.G0()));
                }
                if (k7Var.J0()) {
                    E(sb2, 1, "consent_signals", k7Var.K0());
                }
                if (k7Var.S0()) {
                    E(sb2, 1, "is_dma_region", Boolean.valueOf(k7Var.T0()));
                }
                if (k7Var.U0()) {
                    E(sb2, 1, "core_platform_services", k7Var.V0());
                }
                if (k7Var.Q0()) {
                    E(sb2, 1, "consent_diagnostics", k7Var.R0());
                }
                if (k7Var.N0()) {
                    E(sb2, 1, "target_os_version", Long.valueOf(k7Var.O0()));
                }
                fg.a();
                if (h7Var.w().H(k7Var.E(), z4.Q0)) {
                    E(sb2, 1, "ad_services_version", Integer.valueOf(k7Var.W0()));
                    if (k7Var.X0() && (k6VarY0 = k7Var.Y0()) != null) {
                        y(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        E(sb2, 2, "eligible", Boolean.valueOf(k6VarY0.E()));
                        E(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(k6VarY0.F()));
                        E(sb2, 2, "pre_r", Boolean.valueOf(k6VarY0.G()));
                        E(sb2, 2, "r_extensions_too_old", Boolean.valueOf(k6VarY0.H()));
                        E(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(k6VarY0.I()));
                        E(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(k6VarY0.J()));
                        E(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(k6VarY0.K()));
                        y(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (k7Var.b1()) {
                    com.google.android.gms.internal.measurement.g6 g6VarC1 = k7Var.c1();
                    y(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (g6VarC1.O()) {
                        E(sb2, 2, "deep_link_gclid", g6VarC1.P());
                    }
                    if (g6VarC1.Q()) {
                        E(sb2, 2, "deep_link_gbraid", g6VarC1.R());
                    }
                    if (g6VarC1.S()) {
                        E(sb2, 2, "deep_link_gad_source", g6VarC1.T());
                    }
                    if (g6VarC1.U()) {
                        E(sb2, 2, "deep_link_session_millis", Long.valueOf(g6VarC1.V()));
                    }
                    if (g6VarC1.W()) {
                        E(sb2, 2, "market_referrer_gclid", g6VarC1.X());
                    }
                    if (g6VarC1.Y()) {
                        E(sb2, 2, "market_referrer_gbraid", g6VarC1.Z());
                    }
                    if (g6VarC1.a0()) {
                        E(sb2, 2, "market_referrer_gad_source", g6VarC1.b0());
                    }
                    if (g6VarC1.c0()) {
                        E(sb2, 2, "market_referrer_click_millis", Long.valueOf(g6VarC1.d0()));
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (k7Var.f0()) {
                    E(sb2, 1, "batching_timestamp_millis", Long.valueOf(k7Var.g0()));
                }
                if (k7Var.d1()) {
                    com.google.android.gms.internal.measurement.z7 z7VarE1 = k7Var.e1();
                    y(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int iJ = z7VarE1.J();
                    if (iJ == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iJ == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iJ != 3) {
                        str2 = iJ != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    E(sb2, 2, "upload_type", str2);
                    E(sb2, 2, "client_upload_eligibility", z7VarE1.E().name());
                    int iK = z7VarE1.K();
                    if (iK == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iK == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iK == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iK != 4) {
                        str3 = iK != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    E(sb2, 2, "service_upload_eligibility", str3);
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (k7Var.h0()) {
                    com.google.android.gms.internal.measurement.u6 u6VarI0 = k7Var.i0();
                    y(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.r6 r6Var : u6VarI0.E()) {
                        y(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int iG = r6Var.G();
                        if (iG == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iG == 2) {
                            str = "AD_STORAGE";
                        } else if (iG != 3) {
                            str = iG != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        E(sb2, 3, "type", str);
                        int iH = r6Var.H();
                        E(sb2, 3, "mode", iH != 1 ? iH != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb2, 3);
                        sb2.append("}\n");
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.b8> listM2 = k7Var.m2();
                if (listM2 != null) {
                    for (com.google.android.gms.internal.measurement.b8 b8Var : listM2) {
                        if (b8Var != null) {
                            y(sb2, 2);
                            sb2.append("user_property {\n");
                            E(sb2, 2, "set_timestamp_millis", b8Var.E() ? Long.valueOf(b8Var.F()) : null);
                            E(sb2, 2, "name", h7Var.D().c(b8Var.G()));
                            E(sb2, 2, "string_value", b8Var.I());
                            E(sb2, 2, "int_value", b8Var.J() ? Long.valueOf(b8Var.K()) : null);
                            E(sb2, 2, "double_value", b8Var.N() ? Double.valueOf(b8Var.O()) : null);
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.m6> listW = k7Var.W();
                if (listW != null) {
                    for (com.google.android.gms.internal.measurement.m6 m6Var : listW) {
                        if (m6Var != null) {
                            y(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (m6Var.E()) {
                                E(sb2, 2, "audience_id", Integer.valueOf(m6Var.F()));
                            }
                            if (m6Var.J()) {
                                E(sb2, 2, "new_audience", Boolean.valueOf(m6Var.K()));
                            }
                            D(sb2, 2, "current_data", m6Var.G());
                            if (m6Var.H()) {
                                D(sb2, 2, "previous_data", m6Var.I());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.y6> listG2 = k7Var.g2();
                if (listG2 != null) {
                    for (com.google.android.gms.internal.measurement.y6 y6Var : listG2) {
                        if (y6Var != null) {
                            y(sb2, 2);
                            sb2.append("event {\n");
                            E(sb2, 2, "name", h7Var.D().a(y6Var.H()));
                            if (y6Var.I()) {
                                E(sb2, 2, "timestamp_millis", Long.valueOf(y6Var.J()));
                            }
                            if (y6Var.K()) {
                                E(sb2, 2, "previous_timestamp_millis", Long.valueOf(y6Var.L()));
                            }
                            if (y6Var.M()) {
                                E(sb2, 2, "count", Integer.valueOf(y6Var.N()));
                            }
                            if (y6Var.F() != 0) {
                                w(sb2, 2, y6Var.E());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                y(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    final String L(com.google.android.gms.internal.measurement.j4 j4Var) {
        if (j4Var == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (j4Var.E()) {
            E(sb2, 0, "filter_id", Integer.valueOf(j4Var.F()));
        }
        E(sb2, 0, "event_name", this.f110184a.D().a(j4Var.G()));
        String strA = A(j4Var.M(), j4Var.N(), j4Var.P());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        if (j4Var.K()) {
            F(sb2, 1, "event_count_filter", j4Var.L());
        }
        if (j4Var.I() > 0) {
            sb2.append("  filters {\n");
            Iterator it = j4Var.H().iterator();
            while (it.hasNext()) {
                x(sb2, 2, (com.google.android.gms.internal.measurement.l4) it.next());
            }
        }
        y(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    final String M(com.google.android.gms.internal.measurement.r4 r4Var) {
        if (r4Var == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (r4Var.E()) {
            E(sb2, 0, "filter_id", Integer.valueOf(r4Var.F()));
        }
        E(sb2, 0, "property_name", this.f110184a.D().c(r4Var.G()));
        String strA = A(r4Var.I(), r4Var.J(), r4Var.L());
        if (!strA.isEmpty()) {
            E(sb2, 0, "filter_type", strA);
        }
        x(sb2, 1, r4Var.H());
        sb2.append("}\n");
        return sb2.toString();
    }

    final Parcelable N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (i6.a.C1923a unused) {
            this.f110184a.a().o().a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    final List R(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f110184a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f110184a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    final boolean S(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f110184a.e().currentTimeMillis() - j10) > j11;
    }

    @androidx.annotation.m1
    final long T(byte[] bArr) {
        com.google.android.gms.common.internal.w.r(bArr);
        h7 h7Var = this.f110184a;
        h7Var.C().h();
        MessageDigest messageDigestC = ze.C();
        if (messageDigestC != null) {
            return ze.D(messageDigestC.digest(bArr));
        }
        h7Var.a().o().a("Failed to get MD5");
        return 0L;
    }

    final long U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return T(str.getBytes(Charset.forName("UTF-8")));
    }

    final byte[] V(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f110184a.a().o().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    final Map Z(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(Z((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(Z((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(Z((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.measurement.internal.be
    protected final boolean l() {
        return false;
    }

    final zzbg m(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleN = n(bVar.f(), true);
        String string = (!bundleN.containsKey("_o") || (obj = bundleN.get("_o")) == null) ? "app" : obj.toString();
        String strB = s8.b(bVar.b());
        if (strB == null) {
            strB = bVar.b();
        }
        return new zzbg(strB, new zzbe(bundleN), string, bVar.a());
    }

    final Bundle n(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(n((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }
}

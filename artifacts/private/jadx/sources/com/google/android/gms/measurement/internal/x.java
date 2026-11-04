package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f110652f = new x((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f110653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f110654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f110655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f110656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumMap f110657e;

    x(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(q8.class);
        this.f110657e = enumMap;
        enumMap.put(q8.AD_USER_DATA, r8.h(bool));
        this.f110653a = i10;
        this.f110654b = l();
        this.f110655c = bool2;
        this.f110656d = str;
    }

    static x a(o8 o8Var, int i10) {
        EnumMap enumMap = new EnumMap(q8.class);
        enumMap.put(q8.AD_USER_DATA, o8Var);
        return new x(enumMap, -10, (Boolean) null, (String) null);
    }

    public static x g(String str) {
        if (str == null || str.length() <= 0) {
            return f110652f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(q8.class);
        q8[] q8VarArrK = p8.DMA.k();
        int length = q8VarArrK.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(q8VarArrK[i12], r8.j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new x(enumMap, i10, (Boolean) null, (String) null);
    }

    public static x h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new x((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(q8.class);
        for (q8 q8Var : p8.DMA.k()) {
            enumMap.put(q8Var, r8.g(bundle.getString(q8Var.f110389a)));
        }
        return new x(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        o8 o8VarG;
        if (bundle != null && (o8VarG = r8.g(bundle.getString("ad_personalization"))) != null) {
            int iOrdinal = o8VarG.ordinal();
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal == 3) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    private final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f110653a);
        for (q8 q8Var : p8.DMA.k()) {
            sb2.append(":");
            sb2.append(r8.m((o8) this.f110657e.get(q8Var)));
        }
        return sb2.toString();
    }

    public final int b() {
        return this.f110653a;
    }

    public final o8 c() {
        o8 o8Var = (o8) this.f110657e.get(q8.AD_USER_DATA);
        if (o8Var == null) {
            o8Var = o8.UNINITIALIZED;
        }
        return o8Var;
    }

    public final boolean d() {
        Iterator it = this.f110657e.values().iterator();
        while (it.hasNext()) {
            if (((o8) it.next()) != o8.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.f110654b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f110654b.equalsIgnoreCase(xVar.f110654b) && Objects.equals(this.f110655c, xVar.f110655c)) {
                return Objects.equals(this.f110656d, xVar.f110656d);
            }
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f110657e.entrySet()) {
            String strI = r8.i((o8) entry.getValue());
            if (strI != null) {
                bundle.putString(((q8) entry.getKey()).f110389a, strI);
            }
        }
        Boolean bool = this.f110655c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f110656d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f110655c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f110656d;
        return this.f110654b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * androidx.media2.widget.f.i.f59767c0);
    }

    public final Boolean j() {
        return this.f110655c;
    }

    public final String k() {
        return this.f110656d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(r8.d(this.f110653a));
        for (q8 q8Var : p8.DMA.k()) {
            sb2.append(",");
            sb2.append(q8Var.f110389a);
            sb2.append("=");
            o8 o8Var = (o8) this.f110657e.get(q8Var);
            if (o8Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = o8Var.ordinal();
                if (iOrdinal != 0) {
                    int i10 = 1 << 1;
                    if (iOrdinal == 1) {
                        sb2.append("eu_consent_policy");
                    } else if (iOrdinal == 2) {
                        sb2.append("denied");
                    } else if (iOrdinal == 3) {
                        sb2.append("granted");
                    }
                } else {
                    sb2.append("uninitialized");
                }
            }
        }
        Boolean bool = this.f110655c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f110656d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    private x(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(q8.class);
        this.f110657e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f110653a = i10;
        this.f110654b = l();
        this.f110655c = bool;
        this.f110656d = str;
    }
}

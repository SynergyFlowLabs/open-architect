package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r8 f110439c = new r8(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f110440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f110441b;

    public r8(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(q8.class);
        this.f110440a = enumMap;
        enumMap.put(q8.AD_STORAGE, h(null));
        enumMap.put(q8.ANALYTICS_STORAGE, h(null));
        this.f110441b = i10;
    }

    public static r8 a(o8 o8Var, o8 o8Var2, int i10) {
        EnumMap enumMap = new EnumMap(q8.class);
        enumMap.put(q8.AD_STORAGE, o8Var);
        enumMap.put(q8.ANALYTICS_STORAGE, o8Var2);
        return new r8(enumMap, -10);
    }

    static String d(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 != 90) {
            return i10 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static r8 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new r8(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(q8.class);
        for (q8 q8Var : p8.STORAGE.l()) {
            enumMap.put(q8Var, g(bundle.getString(q8Var.f110389a)));
        }
        return new r8(enumMap, i10);
    }

    public static r8 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(q8.class);
        q8[] q8VarArrK = p8.STORAGE.k();
        for (int i11 = 0; i11 < q8VarArrK.length; i11++) {
            String str2 = str == null ? "" : str;
            q8 q8Var = q8VarArrK[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(q8Var, j(str2.charAt(i12)));
            } else {
                enumMap.put(q8Var, o8.UNINITIALIZED);
            }
        }
        return new r8(enumMap, i10);
    }

    static o8 g(String str) {
        if (str == null) {
            return o8.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return o8.GRANTED;
        }
        return str.equals("denied") ? o8.DENIED : o8.UNINITIALIZED;
    }

    static o8 h(Boolean bool) {
        if (bool == null) {
            return o8.UNINITIALIZED;
        }
        return bool.booleanValue() ? o8.GRANTED : o8.DENIED;
    }

    static String i(o8 o8Var) {
        int iOrdinal = o8Var.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    static o8 j(char c10) {
        if (c10 == '+') {
            return o8.POLICY;
        }
        if (c10 != '0') {
            return c10 != '1' ? o8.UNINITIALIZED : o8.GRANTED;
        }
        return o8.DENIED;
    }

    static char m(o8 o8Var) {
        if (o8Var == null) {
            return org.apache.commons.codec.language.l.f335457d;
        }
        int iOrdinal = o8Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? org.apache.commons.codec.language.l.f335457d : org.locationtech.jts.geom.l.f338161k;
        }
        return org.locationtech.jts.geom.l.f338160j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0012  */
    /* JADX WARN: Code duplicated, block: B:9:0x000f A[DONT_INVERT] */
    public static boolean u(int i10, int i11) {
        int i12 = -30;
        if (i10 != -20) {
            if (i10 == -30) {
                i12 = i10;
            } else if (i11 != -20) {
            }
            if (i12 != i11 && i10 >= i11) {
                return false;
            }
        } else if (i11 != -30) {
            i10 = -20;
            if (i10 == -30) {
                i12 = i10;
            } else if (i11 != -20) {
            }
            if (i12 != i11) {
                return false;
            }
        }
        return true;
    }

    public final int b() {
        return this.f110441b;
    }

    public final boolean c() {
        Iterator it = this.f110440a.values().iterator();
        while (it.hasNext()) {
            if (((o8) it.next()) != o8.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        for (q8 q8Var : p8.STORAGE.l()) {
            if (this.f110440a.get(q8Var) != r8Var.f110440a.get(q8Var)) {
                return false;
            }
        }
        return this.f110441b == r8Var.f110441b;
    }

    public final int hashCode() {
        Iterator it = this.f110440a.values().iterator();
        int iHashCode = this.f110441b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((o8) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public final String k() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (q8 q8Var : p8.STORAGE.k()) {
            o8 o8Var = (o8) this.f110440a.get(q8Var);
            char c10 = org.apache.commons.codec.language.l.f335457d;
            if (o8Var != null && (iOrdinal = o8Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c10 = org.locationtech.jts.geom.l.f338161k;
                } else if (iOrdinal == 2) {
                    c10 = org.locationtech.jts.geom.l.f338160j;
                } else if (iOrdinal == 3) {
                    c10 = org.locationtech.jts.geom.l.f338161k;
                }
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (q8 q8Var : p8.STORAGE.k()) {
            sb2.append(m((o8) this.f110440a.get(q8Var)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f110440a.entrySet()) {
            String strI = i((o8) entry.getValue());
            if (strI != null) {
                bundle.putString(((q8) entry.getKey()).f110389a, strI);
            }
        }
        return bundle;
    }

    public final boolean o(q8 q8Var) {
        return ((o8) this.f110440a.get(q8Var)) != o8.DENIED;
    }

    public final o8 p() {
        o8 o8Var = (o8) this.f110440a.get(q8.AD_STORAGE);
        return o8Var == null ? o8.UNINITIALIZED : o8Var;
    }

    public final o8 q() {
        o8 o8Var = (o8) this.f110440a.get(q8.ANALYTICS_STORAGE);
        return o8Var == null ? o8.UNINITIALIZED : o8Var;
    }

    public final boolean r(r8 r8Var) {
        EnumMap enumMap = this.f110440a;
        for (q8 q8Var : (q8[]) enumMap.keySet().toArray(new q8[0])) {
            o8 o8Var = (o8) enumMap.get(q8Var);
            o8 o8Var2 = (o8) r8Var.f110440a.get(q8Var);
            o8 o8Var3 = o8.DENIED;
            if (o8Var == o8Var3 && o8Var2 != o8Var3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055 A[SYNTHETIC] */
    public final r8 s(r8 r8Var) {
        EnumMap enumMap = new EnumMap(q8.class);
        for (q8 q8Var : p8.STORAGE.l()) {
            o8 o8Var = (o8) this.f110440a.get(q8Var);
            o8 o8Var2 = (o8) r8Var.f110440a.get(q8Var);
            if (o8Var != null) {
                if (o8Var2 != null) {
                    o8 o8Var3 = o8.UNINITIALIZED;
                    if (o8Var != o8Var3) {
                        if (o8Var2 != o8Var3) {
                            o8 o8Var4 = o8.POLICY;
                            if (o8Var != o8Var4) {
                                if (o8Var2 != o8Var4) {
                                    o8 o8Var5 = o8.DENIED;
                                    o8Var = (o8Var == o8Var5 || o8Var2 == o8Var5) ? o8Var5 : o8.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (o8Var != null) {
                    enumMap.put(q8Var, o8Var);
                }
            }
            o8Var = o8Var2;
            if (o8Var != null) {
                enumMap.put(q8Var, o8Var);
            }
        }
        return new r8(enumMap, 100);
    }

    public final r8 t(r8 r8Var) {
        EnumMap enumMap = new EnumMap(q8.class);
        for (q8 q8Var : p8.STORAGE.l()) {
            o8 o8Var = (o8) this.f110440a.get(q8Var);
            if (o8Var == o8.UNINITIALIZED) {
                o8Var = (o8) r8Var.f110440a.get(q8Var);
            }
            if (o8Var != null) {
                enumMap.put(q8Var, o8Var);
            }
        }
        return new r8(enumMap, this.f110441b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.f110441b));
        for (q8 q8Var : p8.STORAGE.l()) {
            sb2.append(",");
            sb2.append(q8Var.f110389a);
            sb2.append("=");
            o8 o8Var = (o8) this.f110440a.get(q8Var);
            if (o8Var == null) {
                o8Var = o8.UNINITIALIZED;
            }
            sb2.append(o8Var);
        }
        return sb2.toString();
    }

    private r8(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(q8.class);
        this.f110440a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f110441b = i10;
    }
}

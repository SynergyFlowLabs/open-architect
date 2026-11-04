package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.common.collect.z6 f108284d = com.google.common.collect.z6.L("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f108285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f108286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f108287c;

    public b(String str, long j10, Map map) {
        this.f108285a = str;
        this.f108286b = j10;
        HashMap map2 = new HashMap();
        this.f108287c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f108284d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.f108286b;
    }

    public final String b() {
        return this.f108285a;
    }

    public final void c(String str) {
        this.f108285a = str;
    }

    public final void d(String str, Object obj) {
        Map map = this.f108287c;
        if (obj == null) {
            map.remove(str);
        } else {
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f108287c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f108286b == bVar.f108286b && this.f108285a.equals(bVar.f108285a)) {
            return this.f108287c.equals(bVar.f108287c);
        }
        return false;
    }

    public final Map f() {
        return this.f108287c;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f108285a, this.f108286b, new HashMap(this.f108287c));
    }

    public final int hashCode() {
        int iHashCode = this.f108285a.hashCode() * 31;
        long j10 = this.f108286b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f108287c.hashCode();
    }

    public final String toString() {
        String str = this.f108285a;
        String string = this.f108287c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f108286b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + string.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}

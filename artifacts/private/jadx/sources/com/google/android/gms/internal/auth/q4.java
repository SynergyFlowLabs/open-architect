package com.google.android.gms.internal.auth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q4 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q4 f107767b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f107768a;

    static {
        q4 q4Var = new q4();
        f107767b = q4Var;
        q4Var.f107768a = false;
    }

    private q4() {
        this.f107768a = true;
    }

    public static q4 a() {
        return f107767b;
    }

    private static int f(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof v3) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = z3.f107905d;
        int length = bArr.length;
        int iB = z3.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void g() {
        if (!this.f107768a) {
            throw new UnsupportedOperationException();
        }
    }

    public final q4 b() {
        return isEmpty() ? new q4() : new q4(this);
    }

    public final void c() {
        this.f107768a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final void d(q4 q4Var) {
        g();
        if (q4Var.isEmpty()) {
            return;
        }
        putAll(q4Var);
    }

    public final boolean e() {
        return this.f107768a;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() == map.size()) {
                Iterator it = entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (map.containsKey(entry.getKey())) {
                        Object value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iF = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f(entry.getValue()) ^ f(entry.getKey());
        }
        return iF;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        byte[] bArr = z3.f107905d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            byte[] bArr = z3.f107905d;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        return super.remove(obj);
    }

    private q4(Map map) {
        super(map);
        this.f107768a = true;
    }
}

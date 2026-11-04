package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class sc extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sc f108803b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f108804a;

    static {
        sc scVar = new sc();
        f108803b = scVar;
        scVar.f108804a = false;
    }

    private sc() {
        this.f108804a = true;
    }

    public static sc a() {
        return f108803b;
    }

    private static int f(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof ub) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = ac.f108281b;
        int length = bArr.length;
        int iC = ac.c(length, bArr, 0, length);
        if (iC == 0) {
            iC = 1;
        }
        return iC;
    }

    private final void g() {
        if (!this.f108804a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(sc scVar) {
        g();
        if (!scVar.isEmpty()) {
            putAll(scVar);
        }
    }

    public final sc c() {
        return isEmpty() ? new sc() : new sc(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final void d() {
        this.f108804a = false;
    }

    public final boolean e() {
        return this.f108804a;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() != map.size()) {
                return false;
            }
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                    return false;
                }
            }
        }
        return true;
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
        byte[] bArr = ac.f108281b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            byte[] bArr = ac.f108281b;
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

    private sc(Map map) {
        super(map);
        this.f108804a = true;
    }
}

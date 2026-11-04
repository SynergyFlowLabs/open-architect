package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b8 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b8 f109057b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f109058a;

    static {
        b8 b8Var = new b8();
        f109057b = b8Var;
        b8Var.f109058a = false;
    }

    private b8() {
        this.f109058a = true;
    }

    public static b8 a() {
        return f109057b;
    }

    private static int f(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof ka) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = j7.f109152b;
        int length = bArr.length;
        int iB = j7.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void g() {
        if (!this.f109058a) {
            throw new UnsupportedOperationException();
        }
    }

    public final b8 b() {
        return isEmpty() ? new b8() : new b8(this);
    }

    public final void c() {
        this.f109058a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final void d(b8 b8Var) {
        g();
        if (b8Var.isEmpty()) {
            return;
        }
        putAll(b8Var);
    }

    public final boolean e() {
        return this.f109058a;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
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
                }
            }
            return true;
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
        byte[] bArr = j7.f109152b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            byte[] bArr = j7.f109152b;
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

    private b8(Map map) {
        super(map);
        this.f109058a = true;
    }
}

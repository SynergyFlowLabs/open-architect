package com.google.vr.sdk.deps;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class p4 {
    p4() {
    }

    private static <K, V> int e(int i10, Object obj, Object obj2) {
        o4 o4Var = (o4) obj;
        if (o4Var.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<K, V>> it = o4Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry<K, V> next = it.next();
        next.getKey();
        next.getValue();
        throw new NoSuchMethodError();
    }

    private static <K, V> o4<K, V> f(Object obj, Object obj2) {
        o4<K, V> o4VarD = (o4) obj;
        o4<K, V> o4Var = (o4) obj2;
        if (!o4Var.isEmpty()) {
            if (!o4VarD.f()) {
                o4VarD = o4VarD.d();
            }
            o4VarD.c(o4Var);
        }
        return o4VarD;
    }

    public int a(int i10, Object obj, Object obj2) {
        return e(i10, obj, obj2);
    }

    public Object b() {
        return o4.b().d();
    }

    public Object c(Object obj, Object obj2) {
        return f(obj, obj2);
    }

    public Map<?, ?> d(Object obj) {
        return (o4) obj;
    }

    public Map<?, ?> g(Object obj) {
        return (o4) obj;
    }

    public boolean h(Object obj) {
        return !((o4) obj).f();
    }

    public Object i(Object obj) {
        ((o4) obj).e();
        return obj;
    }

    public n4<?, ?> j(Object obj) {
        throw new NoSuchMethodError();
    }
}

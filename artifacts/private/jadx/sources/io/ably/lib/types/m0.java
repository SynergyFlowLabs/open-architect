package io.ably.lib.types;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f288113b = "io.ably.lib.types.m0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, com.google.gson.o> f288114a;

    public static class a implements com.google.gson.t<m0>, com.google.gson.k<m0> {
        @Override // com.google.gson.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public m0 a(com.google.gson.l lVar, Type type, com.google.gson.j jVar) throws com.google.gson.p {
            return m0.h(lVar);
        }

        @Override // com.google.gson.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l b(m0 m0Var, Type type, com.google.gson.s sVar) {
            com.google.gson.o oVar = new com.google.gson.o();
            for (Map.Entry entry : m0Var.f288114a.entrySet()) {
                oVar.L((String) entry.getKey(), (com.google.gson.l) entry.getValue());
            }
            return oVar;
        }
    }

    public m0(Map<String, com.google.gson.o> map) {
        this.f288114a = map;
    }

    public static Map<String, o0> b(com.google.gson.o oVar) {
        HashMap map = new HashMap();
        for (Map.Entry<String, com.google.gson.l> entry : oVar.entrySet()) {
            map.put(entry.getKey(), c(entry.getValue().v()));
        }
        return map;
    }

    public static o0 c(com.google.gson.o oVar) {
        return new o0(oVar.S("total").s(), (List) io.ably.lib.util.p.f288250c.j(oVar.S("clientIds"), List.class));
    }

    public static Map<String, n0> d(com.google.gson.o oVar) {
        HashMap map = new HashMap();
        for (Map.Entry<String, com.google.gson.l> entry : oVar.entrySet()) {
            String key = entry.getKey();
            com.google.gson.o oVarV = entry.getValue().v();
            int iS = oVarV.S("total").s();
            HashMap map2 = new HashMap();
            for (Map.Entry<String, com.google.gson.l> entry2 : oVarV.S("clientIds").v().entrySet()) {
                map2.put(entry2.getKey(), Integer.valueOf(entry2.getValue().s()));
            }
            map.put(key, new n0(iS, map2));
        }
        return map;
    }

    public static p0 e(com.google.gson.o oVar) {
        return new p0(oVar.S("total").s());
    }

    public static Map<String, o0> f(com.google.gson.o oVar) {
        return b(oVar);
    }

    static m0 h(com.google.gson.l lVar) {
        if (!lVar.J()) {
            throw new com.google.gson.p("Expected an object but got \"" + lVar.getClass() + "\".");
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, com.google.gson.l> entry : lVar.v().entrySet()) {
            if (!entry.getValue().J()) {
                throw new com.google.gson.p("Expected an object but got \"" + lVar.getClass() + "\".");
            }
            map.put(entry.getKey(), entry.getValue().v());
        }
        return new m0(map);
    }

    static m0 i(org.msgpack.core.o oVar) {
        try {
            return h(io.ably.lib.util.p.i(oVar.j1()));
        } catch (Exception e10) {
            io.ably.lib.util.k.e(f288113b, "Failed to read summary from MessagePack", e10);
            return null;
        }
    }

    public com.google.gson.o g(String str) {
        return this.f288114a.get(str);
    }

    com.google.gson.l j() {
        return io.ably.lib.util.p.f288250c.K(this);
    }

    void k(org.msgpack.core.j jVar) {
        io.ably.lib.util.p.b(j(), jVar);
    }
}

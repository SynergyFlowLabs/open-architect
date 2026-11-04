package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@y
class j2 implements i2 {
    j2() {
    }

    private static <K, V> int i(int fieldNumber, Object mapField, Object defaultEntry) {
        h2 h2Var = (h2) mapField;
        g2 g2Var = (g2) defaultEntry;
        int iA = 0;
        if (h2Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : h2Var.entrySet()) {
            iA += g2Var.a(fieldNumber, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> h2<K, V> j(Object destMapField, Object srcMapField) {
        h2<K, V> h2VarN = (h2) destMapField;
        h2<K, V> h2Var = (h2) srcMapField;
        if (!h2Var.isEmpty()) {
            if (!h2VarN.j()) {
                h2VarN = h2VarN.n();
            }
            h2VarN.l(h2Var);
        }
        return h2VarN;
    }

    @Override // com.google.protobuf.i2
    public Object a(Object destMapField, Object srcMapField) {
        return j(destMapField, srcMapField);
    }

    @Override // com.google.protobuf.i2
    public g2.b<?, ?> b(Object mapDefaultEntry) {
        return ((g2) mapDefaultEntry).d();
    }

    @Override // com.google.protobuf.i2
    public Object c(Object mapField) {
        ((h2) mapField).k();
        return mapField;
    }

    @Override // com.google.protobuf.i2
    public int d(int fieldNumber, Object mapField, Object mapDefaultEntry) {
        return i(fieldNumber, mapField, mapDefaultEntry);
    }

    @Override // com.google.protobuf.i2
    public Map<?, ?> e(Object mapField) {
        return (h2) mapField;
    }

    @Override // com.google.protobuf.i2
    public Object f(Object unused) {
        return h2.f().n();
    }

    @Override // com.google.protobuf.i2
    public Map<?, ?> g(Object mapField) {
        return (h2) mapField;
    }

    @Override // com.google.protobuf.i2
    public boolean h(Object mapField) {
        return !((h2) mapField).j();
    }
}

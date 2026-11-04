package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@y
final class m2 implements l2 {
    m2() {
    }

    private static <K, V> int i(int fieldNumber, Object mapField, Object defaultEntry) {
        k2 k2Var = (k2) mapField;
        j2 j2Var = (j2) defaultEntry;
        int iA = 0;
        if (k2Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : k2Var.entrySet()) {
            iA += j2Var.a(fieldNumber, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> k2<K, V> j(Object destMapField, Object srcMapField) {
        k2<K, V> k2VarN = (k2) destMapField;
        k2<K, V> k2Var = (k2) srcMapField;
        if (!k2Var.isEmpty()) {
            if (!k2VarN.j()) {
                k2VarN = k2VarN.n();
            }
            k2VarN.l(k2Var);
        }
        return k2VarN;
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public Object a(Object destMapField, Object srcMapField) {
        return j(destMapField, srcMapField);
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public j2.b<?, ?> b(Object mapDefaultEntry) {
        return ((j2) mapDefaultEntry).d();
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public Object c(Object mapField) {
        ((k2) mapField).k();
        return mapField;
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public int d(int fieldNumber, Object mapField, Object mapDefaultEntry) {
        return i(fieldNumber, mapField, mapDefaultEntry);
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public Map<?, ?> e(Object mapField) {
        return (k2) mapField;
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public Object f(Object unused) {
        return k2.f().n();
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public Map<?, ?> g(Object mapField) {
        return (k2) mapField;
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public boolean h(Object mapField) {
        return !((k2) mapField).j();
    }
}

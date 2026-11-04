package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class d2 implements c2 {
    d2() {
    }

    static <E> s1.l<E> d(Object message, long offset) {
        return (s1.l) w4.Q(message, offset);
    }

    @Override // androidx.datastore.preferences.protobuf.c2
    public <E> void a(Object msg, Object otherMsg, long offset) {
        s1.l lVarD = d(msg, offset);
        s1.l lVarD2 = d(otherMsg, offset);
        int size = lVarD.size();
        int size2 = lVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!lVarD.s1()) {
                lVarD = lVarD.b2(size2 + size);
            }
            lVarD.addAll(lVarD2);
        }
        if (size > 0) {
            lVarD2 = lVarD;
        }
        w4.t0(msg, offset, lVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.c2
    public void b(Object message, long offset) {
        d(message, offset).e1();
    }

    @Override // androidx.datastore.preferences.protobuf.c2
    public <L> List<L> c(Object message, long offset) {
        s1.l lVarD = d(message, offset);
        if (lVarD.s1()) {
            return lVarD;
        }
        int size = lVarD.size();
        s1.l lVarB2 = lVarD.b2(size == 0 ? 10 : size * 2);
        w4.t0(message, offset, lVarB2);
        return lVarB2;
    }
}

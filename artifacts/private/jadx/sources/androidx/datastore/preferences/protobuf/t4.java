package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@y
class t4 extends r4<s4, s4> {
    t4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public s4 f(Object message) {
        s4 s4VarG = g(message);
        if (s4VarG != s4.c()) {
            return s4VarG;
        }
        s4 s4VarO = s4.o();
        q(message, s4VarO);
        return s4VarO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public s4 g(Object message) {
        return ((l1) message).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int h(s4 unknowns) {
        return unknowns.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int i(s4 unknowns) {
        return unknowns.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public s4 k(s4 target, s4 source) {
        if (s4.c().equals(source)) {
            return target;
        }
        return s4.c().equals(target) ? s4.n(target, source) : target.k(source);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public s4 n() {
        return s4.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void o(Object message, s4 fields) {
        q(message, fields);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void q(Object message, s4 fields) {
        ((l1) message).unknownFields = fields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public s4 s(s4 fields) {
        fields.h();
        return fields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(s4 fields, c5 writer) throws IOException {
        fields.u(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void u(s4 fields, c5 writer) throws IOException {
        fields.x(writer);
    }

    @Override // androidx.datastore.preferences.protobuf.r4
    void j(Object message) {
        g(message).h();
    }

    @Override // androidx.datastore.preferences.protobuf.r4
    boolean r(o3 reader) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void a(s4 fields, int number, int value) {
        fields.r(a5.c(number, 5), Integer.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void b(s4 fields, int number, long value) {
        fields.r(a5.c(number, 1), Long.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void c(s4 fields, int number, s4 subFieldSet) {
        fields.r(a5.c(number, 3), subFieldSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void d(s4 fields, int number, u value) {
        fields.r(a5.c(number, 2), value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.r4
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void e(s4 fields, int number, long value) {
        fields.r(a5.c(number, 0), Long.valueOf(value));
    }
}

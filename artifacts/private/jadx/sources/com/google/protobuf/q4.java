package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@y
class q4 extends o4<p4, p4> {
    q4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public p4 f(Object message) {
        p4 p4VarG = g(message);
        if (p4VarG != p4.c()) {
            return p4VarG;
        }
        p4 p4VarO = p4.o();
        q(message, p4VarO);
        return p4VarO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public p4 g(Object message) {
        return ((l1) message).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int h(p4 unknowns) {
        return unknowns.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int i(p4 unknowns) {
        return unknowns.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public p4 k(p4 target, p4 source) {
        if (p4.c().equals(source)) {
            return target;
        }
        return p4.c().equals(target) ? p4.n(target, source) : target.k(source);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public p4 n() {
        return p4.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void o(Object message, p4 fields) {
        q(message, fields);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void q(Object message, p4 fields) {
        ((l1) message).unknownFields = fields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public p4 s(p4 fields) {
        fields.h();
        return fields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(p4 fields, z4 writer) throws IOException {
        fields.u(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void u(p4 fields, z4 writer) throws IOException {
        fields.x(writer);
    }

    @Override // com.google.protobuf.o4
    void j(Object message) {
        g(message).h();
    }

    @Override // com.google.protobuf.o4
    boolean r(m3 reader) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void a(p4 fields, int number, int value) {
        fields.r(x4.c(number, 5), Integer.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void b(p4 fields, int number, long value) {
        fields.r(x4.c(number, 1), Long.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void c(p4 fields, int number, p4 subFieldSet) {
        fields.r(x4.c(number, 3), subFieldSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void d(p4 fields, int number, u value) {
        fields.r(x4.c(number, 2), value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.o4
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void e(p4 fields, int number, long value) {
        fields.r(x4.c(number, 0), Long.valueOf(value));
    }
}

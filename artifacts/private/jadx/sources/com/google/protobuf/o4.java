package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@y
abstract class o4<T, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f126232a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f126233b = 100;

    o4() {
    }

    private final void l(B unknownFields, m3 reader, int currentDepth) throws IOException {
        while (reader.m() != Integer.MAX_VALUE && m(unknownFields, reader, currentDepth)) {
        }
    }

    abstract void a(B fields, int number, int value);

    abstract void b(B fields, int number, long value);

    abstract void c(B fields, int number, T subFieldSet);

    abstract void d(B fields, int number, u value);

    abstract void e(B fields, int number, long value);

    abstract B f(Object message);

    abstract T g(Object message);

    abstract int h(T unknowns);

    abstract int i(T message);

    abstract void j(Object message);

    abstract T k(T destination, T source);

    final boolean m(B unknownFields, m3 reader, int currentDepth) throws IOException {
        int iE = reader.E();
        int iA = x4.a(iE);
        int iB = x4.b(iE);
        if (iB == 0) {
            e(unknownFields, iA, reader.t());
            return true;
        }
        if (iB == 1) {
            b(unknownFields, iA, reader.u());
            return true;
        }
        if (iB == 2) {
            d(unknownFields, iA, reader.g());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw t1.f();
            }
            a(unknownFields, iA, reader.F());
            return true;
        }
        B bN = n();
        int iC = x4.c(iA, 4);
        int i10 = currentDepth + 1;
        if (i10 >= f126233b) {
            throw t1.j();
        }
        l(bN, reader, i10);
        if (iC != reader.E()) {
            throw t1.c();
        }
        c(unknownFields, iA, s(bN));
        return true;
    }

    abstract B n();

    abstract void o(Object message, B builder);

    public void p(int limit) {
        f126233b = limit;
    }

    abstract void q(Object message, T fields);

    abstract boolean r(m3 reader);

    abstract T s(B fields);

    abstract void t(T unknownFields, z4 writer) throws IOException;

    abstract void u(T unknownFields, z4 writer) throws IOException;
}

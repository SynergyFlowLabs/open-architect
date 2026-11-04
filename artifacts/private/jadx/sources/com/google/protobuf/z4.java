package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@y
interface z4 {

    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void B(int fieldNumber, double value) throws IOException;

    void C(int fieldNumber, List<Long> value, boolean packed) throws IOException;

    a D();

    void E(int fieldNumber, Object value) throws IOException;

    void F(int fieldNumber, long value) throws IOException;

    void G(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void H(int fieldNumber, List<Boolean> value, boolean packed) throws IOException;

    @Deprecated
    void I(int fieldNumber, Object value) throws IOException;

    void J(int fieldNumber, float value) throws IOException;

    void K(int fieldNumber, int value) throws IOException;

    void L(int fieldNumber, List<Long> value, boolean packed) throws IOException;

    void M(int fieldNumber, int value) throws IOException;

    void N(int fieldNumber, u value) throws IOException;

    <K, V> void O(int fieldNumber, g2.b<K, V> metadata, Map<K, V> map) throws IOException;

    void P(int fieldNumber, List<?> value, o3 schema) throws IOException;

    @Deprecated
    void Q(int fieldNumber, Object value, o3 schema) throws IOException;

    @Deprecated
    void R(int fieldNumber, List<?> value, o3 schema) throws IOException;

    void S(int fieldNumber, Object value, o3 schema) throws IOException;

    void a(int fieldNumber, List<Float> value, boolean packed) throws IOException;

    void b(int fieldNumber, Object value) throws IOException;

    void c(int fieldNumber, int value) throws IOException;

    @Deprecated
    void d(int fieldNumber, List<?> value) throws IOException;

    void e(int fieldNumber, String value) throws IOException;

    void f(int fieldNumber, long value) throws IOException;

    void g(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void h(int fieldNumber, int value) throws IOException;

    void i(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void j(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void k(int fieldNumber, long value) throws IOException;

    void l(int fieldNumber, int value) throws IOException;

    void m(int fieldNumber, List<Long> value, boolean packed) throws IOException;

    void n(int fieldNumber, long value) throws IOException;

    void o(int fieldNumber, List<?> value) throws IOException;

    void p(int fieldNumber, boolean value) throws IOException;

    void q(int fieldNumber, int value) throws IOException;

    @Deprecated
    void r(int fieldNumber) throws IOException;

    void s(int fieldNumber, List<Long> value, boolean packed) throws IOException;

    @Deprecated
    void t(int fieldNumber) throws IOException;

    void u(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void v(int fieldNumber, List<Double> value, boolean packed) throws IOException;

    void w(int fieldNumber, List<u> value) throws IOException;

    void x(int fieldNumber, List<String> value) throws IOException;

    void y(int fieldNumber, long value) throws IOException;

    void z(int fieldNumber, List<Long> value, boolean packed) throws IOException;
}

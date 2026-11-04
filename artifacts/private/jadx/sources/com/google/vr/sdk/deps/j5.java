package com.google.vr.sdk.deps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
interface j5 {
    void A(List<Integer> list) throws IOException;

    void B(List<Integer> list) throws IOException;

    void C(List<k2> list) throws IOException;

    void D(List<String> list) throws IOException;

    <T> T E(k5<T> k5Var, x2 x2Var) throws IOException;

    void F(List<Double> list) throws IOException;

    @Deprecated
    <T> T G(k5<T> k5Var, x2 x2Var) throws IOException;

    void H(List<Integer> list) throws IOException;

    void I(List<Long> list) throws IOException;

    long J() throws IOException;

    void K(List<Long> list) throws IOException;

    int L() throws IOException;

    <T> T M(Class<T> cls, x2 x2Var) throws IOException;

    void N(List<Float> list) throws IOException;

    int a() throws IOException;

    int b();

    @Deprecated
    <T> void b(List<T> list, k5<T> k5Var, x2 x2Var) throws IOException;

    <T> void c(List<T> list, k5<T> k5Var, x2 x2Var) throws IOException;

    boolean c() throws IOException;

    double d() throws IOException;

    float e() throws IOException;

    long f() throws IOException;

    int g() throws IOException;

    int h() throws IOException;

    long i() throws IOException;

    int j() throws IOException;

    boolean k() throws IOException;

    String l() throws IOException;

    String m() throws IOException;

    k2 n() throws IOException;

    long o() throws IOException;

    void p(List<Long> list) throws IOException;

    long q() throws IOException;

    void r(List<Integer> list) throws IOException;

    int s() throws IOException;

    void s(List<Long> list) throws IOException;

    void t(List<String> list) throws IOException;

    <K, V> void u(Map<K, V> map, n4<K, V> n4Var, x2 x2Var) throws IOException;

    void v(List<Boolean> list) throws IOException;

    void w(List<Integer> list) throws IOException;

    void x(List<Long> list) throws IOException;

    int y() throws IOException;

    void z(List<Integer> list) throws IOException;
}

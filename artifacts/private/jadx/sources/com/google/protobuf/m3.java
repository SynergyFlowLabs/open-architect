package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@y
interface m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f126082a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f126083b = 0;

    void A(List<String> target) throws IOException;

    int B() throws IOException;

    void C(List<Long> target) throws IOException;

    void D(List<Integer> target) throws IOException;

    int E();

    int F() throws IOException;

    long G() throws IOException;

    String H() throws IOException;

    int I() throws IOException;

    String J() throws IOException;

    <K, V> void K(Map<K, V> target, g2.b<K, V> mapDefaultEntry, v0 extensionRegistry) throws IOException;

    <T> void L(T target, o3<T> schema, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> T M(o3<T> schema, v0 extensionRegistry) throws IOException;

    <T> void N(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException;

    <T> void O(T target, o3<T> schema, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> void P(List<T> target, o3<T> targetType, v0 extensionRegistry) throws IOException;

    <T> void Q(List<T> target, o3<T> schema, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> T R(Class<T> clazz, v0 extensionRegistry) throws IOException;

    <T> T S(Class<T> clazz, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> void T(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException;

    <T> T U(o3<T> schema, v0 extensionRegistry) throws IOException;

    void a(List<Long> target) throws IOException;

    long b() throws IOException;

    int c() throws IOException;

    int d() throws IOException;

    int e() throws IOException;

    void f(List<Boolean> target) throws IOException;

    u g() throws IOException;

    void h(List<Integer> target) throws IOException;

    long i() throws IOException;

    void j(List<Long> target) throws IOException;

    void k(List<Integer> target) throws IOException;

    void l(List<Integer> target) throws IOException;

    int m() throws IOException;

    void n(List<String> target) throws IOException;

    void o(List<Float> target) throws IOException;

    boolean p();

    boolean q() throws IOException;

    void r(List<u> target) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    void s(List<Double> target) throws IOException;

    long t() throws IOException;

    long u() throws IOException;

    void v(List<Integer> target) throws IOException;

    boolean w() throws IOException;

    void x(List<Long> target) throws IOException;

    void y(List<Long> target) throws IOException;

    void z(List<Integer> target) throws IOException;
}

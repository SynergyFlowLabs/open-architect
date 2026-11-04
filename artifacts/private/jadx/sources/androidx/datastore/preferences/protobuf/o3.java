package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@y
interface o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f50503a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f50504b = 0;

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

    @Deprecated
    <T> T K(r3<T> schema, v0 extensionRegistry) throws IOException;

    <T> T L(Class<T> clazz, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> void M(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException;

    <T> T N(r3<T> schema, v0 extensionRegistry) throws IOException;

    <T> void O(T target, r3<T> schema, v0 extensionRegistry) throws IOException;

    <T> void P(List<T> target, r3<T> schema, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> T Q(Class<T> clazz, v0 extensionRegistry) throws IOException;

    <T> void R(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException;

    <K, V> void S(Map<K, V> target, j2.b<K, V> mapDefaultEntry, v0 extensionRegistry) throws IOException;

    <T> void T(T target, r3<T> schema, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> void U(List<T> target, r3<T> targetType, v0 extensionRegistry) throws IOException;

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

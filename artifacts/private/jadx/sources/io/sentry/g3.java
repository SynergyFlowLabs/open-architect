package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g3 implements g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g3 f305450b = new g3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.s<n8> f305451a = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.f3
        @Override // io.sentry.util.s.a
        public final Object a() {
            return n8.empty();
        }
    });

    private g3() {
    }

    public static g3 w() {
        return f305450b;
    }

    @Override // io.sentry.g1
    public void A(@Nullable io.sentry.protocol.v vVar) {
    }

    @Override // io.sentry.g1
    public void B(@Nullable String str, @Nullable Collection<?> collection) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public Queue<f> C() {
        return new ArrayDeque();
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public k9 D(t4.b bVar) {
        return null;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public Map<String, String> E() {
        return new HashMap();
    }

    @Override // io.sentry.g1
    public void F(@Nullable r1 r1Var) {
    }

    @Override // io.sentry.g1
    @Nullable
    public io.sentry.protocol.g0 G() {
        return null;
    }

    @Override // io.sentry.g1
    public void H(@Nullable String str, @Nullable Boolean bool) {
    }

    @Override // io.sentry.g1
    public void I() {
    }

    @Override // io.sentry.g1
    public void J() {
    }

    @Override // io.sentry.g1
    public void K(@Nullable String str, @Nullable Character ch2) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public k9 L() {
        return null;
    }

    @Override // io.sentry.g1
    public void M(@Nullable String str, @Nullable Object[] objArr) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void N(@Nullable String str) {
    }

    @Override // io.sentry.g1
    @NotNull
    public k1 O() {
        return l3.s();
    }

    @Override // io.sentry.g1
    public void P(@NotNull i0 i0Var) {
    }

    @Override // io.sentry.g1
    public void Q(@NotNull o7 o7Var) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public List<i0> R() {
        return new ArrayList();
    }

    @Override // io.sentry.g1
    public void S(@Nullable String str, @Nullable Number number) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void T(@NotNull m4 m4Var) {
    }

    @Override // io.sentry.g1
    public void U(@NotNull n8 n8Var) {
    }

    @Override // io.sentry.g1
    public void V(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public List<io.sentry.internal.eventprocessor.a> W() {
        return new ArrayList();
    }

    @Override // io.sentry.g1
    public void X(@Nullable String str, @Nullable Object obj) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public String Y() {
        return null;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public List<String> Z() {
        return new ArrayList();
    }

    @Override // io.sentry.g1
    public void a(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.g1
    @Nullable
    public String a0() {
        return null;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public n8 b() {
        return this.f305451a.a();
    }

    @Override // io.sentry.g1
    public void b0(@Nullable String str) {
    }

    @Override // io.sentry.g1
    public void c(@Nullable String str) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public m4 c0() {
        return new m4();
    }

    @Override // io.sentry.g1
    public void clear() {
    }

    @Override // io.sentry.g1
    public void d(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.g1
    public void d0(@NotNull b bVar) {
    }

    @Override // io.sentry.g1
    @Nullable
    public p1 e() {
        return null;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public List<b> e0() {
        return new ArrayList();
    }

    @Override // io.sentry.g1
    public void f(@Nullable String str) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void f0() {
    }

    @Override // io.sentry.g1
    @Nullable
    public y7 g() {
        return null;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public m4 g0(t4.a aVar) {
        return new m4();
    }

    @Override // io.sentry.g1
    @lm.a.c
    @NotNull
    public Map<String, Object> getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.g1
    @Nullable
    public io.sentry.protocol.m getRequest() {
        return null;
    }

    @Override // io.sentry.g1
    public void h(@Nullable y7 y7Var) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    public void h0(t4.c cVar) {
    }

    @Override // io.sentry.g1
    public void i0(@NotNull io.sentry.protocol.v vVar) {
    }

    @Override // io.sentry.g1
    public void j(@Nullable io.sentry.protocol.g0 g0Var) {
    }

    @Override // io.sentry.g1
    public void k(@NotNull f fVar) {
    }

    @Override // io.sentry.g1
    public void l(@NotNull String str) {
    }

    @Override // io.sentry.g1
    public void m(@NotNull f fVar, @Nullable n0 n0Var) {
    }

    @Override // io.sentry.g1
    public void n(@NotNull Throwable th2, @NotNull p1 p1Var, @NotNull String str) {
    }

    @Override // io.sentry.g1
    public void o() {
    }

    @Override // io.sentry.g1
    @Nullable
    public r1 p() {
        return null;
    }

    @Override // io.sentry.g1
    @NotNull
    public io.sentry.protocol.c q() {
        return new io.sentry.protocol.c();
    }

    @Override // io.sentry.g1
    public void r(@Nullable io.sentry.protocol.m mVar) {
    }

    @Override // io.sentry.g1
    public void s(@NotNull k1 k1Var) {
    }

    @Override // io.sentry.g1
    @NotNull
    public io.sentry.protocol.v t() {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public t4.d u() {
        return null;
    }

    @Override // io.sentry.g1
    public void v(@NotNull List<String> list) {
    }

    @Override // io.sentry.g1
    public void x(@Nullable p1 p1Var) {
    }

    @Override // io.sentry.g1
    @lm.a.c
    @Nullable
    public k9 y() {
        return null;
    }

    @Override // io.sentry.g1
    @NotNull
    public io.sentry.protocol.v z() {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.g1
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public g1 m777clone() {
        return w();
    }
}

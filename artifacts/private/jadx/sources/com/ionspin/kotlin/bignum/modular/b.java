package com.ionspin.kotlin.bignum.modular;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    @NotNull
    public static final a a(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) u(b10, other.l()).B0(other);
    }

    @NotNull
    public static final a b(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) v(i10, other.l()).B0(other);
    }

    @NotNull
    public static final a c(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) w(j10, other.l()).B0(other);
    }

    @NotNull
    public static final a d(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) y(s10, other.l()).B0(other);
    }

    @NotNull
    public static final a e(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) u(b10, other.l()).v(other);
    }

    @NotNull
    public static final a f(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) v(i10, other.l()).v(other);
    }

    @NotNull
    public static final a g(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) w(j10, other.l()).v(other);
    }

    @NotNull
    public static final a h(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) y(s10, other.l()).v(other);
    }

    @NotNull
    public static final a i(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) u(b10, other.l()).V(other);
    }

    @NotNull
    public static final a j(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) v(i10, other.l()).V(other);
    }

    @NotNull
    public static final a k(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) w(j10, other.l()).V(other);
    }

    @NotNull
    public static final a l(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) y(s10, other.l()).V(other);
    }

    @NotNull
    public static final a m(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return u(b10, other.l()).d0(other);
    }

    @NotNull
    public static final a n(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return v(i10, other.l()).d0(other);
    }

    @NotNull
    public static final a o(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return w(j10, other.l()).d0(other);
    }

    @NotNull
    public static final a p(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return y(s10, other.l()).d0(other);
    }

    @NotNull
    public static final a q(byte b10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) u(b10, other.l()).p0(other);
    }

    @NotNull
    public static final a r(int i10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) v(i10, other.l()).p0(other);
    }

    @NotNull
    public static final a s(long j10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) w(j10, other.l()).p0(other);
    }

    @NotNull
    public static final a t(short s10, @NotNull a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (a) y(s10, other.l()).p0(other);
    }

    @NotNull
    public static final a u(byte b10, @NotNull ca.a.InterfaceC0803a<a> creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        return creator.m(b10);
    }

    @NotNull
    public static final a v(int i10, @NotNull ca.a.InterfaceC0803a<a> creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        return creator.b(i10);
    }

    @NotNull
    public static final a w(long j10, @NotNull ca.a.InterfaceC0803a<a> creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        return creator.n(j10);
    }

    @NotNull
    public static final a x(@NotNull String str, @NotNull ca.a.InterfaceC0803a<a> creator, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(creator, "creator");
        return creator.q(str, i10);
    }

    @NotNull
    public static final a y(short s10, @NotNull ca.a.InterfaceC0803a<a> creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        return creator.o(s10);
    }

    public static /* synthetic */ a z(String str, ca.a.InterfaceC0803a interfaceC0803a, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 10;
        }
        return x(str, interfaceC0803a, i10);
    }
}

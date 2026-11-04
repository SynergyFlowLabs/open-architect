package com.ionspin.kotlin.bignum.integer;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class k<A, B, C, D, E, F> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f131120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f131121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f131122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f131123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f131124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F f131125f;

    public k(A a10, B b10, C c10, D d10, E e10, F f10) {
        this.f131120a = a10;
        this.f131121b = b10;
        this.f131122c = c10;
        this.f131123d = d10;
        this.f131124e = e10;
        this.f131125f = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k h(k kVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, Object obj7) {
        if ((i10 & 1) != 0) {
            obj = kVar.f131120a;
        }
        if ((i10 & 2) != 0) {
            obj2 = kVar.f131121b;
        }
        if ((i10 & 4) != 0) {
            obj3 = kVar.f131122c;
        }
        if ((i10 & 8) != 0) {
            obj4 = kVar.f131123d;
        }
        if ((i10 & 16) != 0) {
            obj5 = kVar.f131124e;
        }
        if ((i10 & 32) != 0) {
            obj6 = kVar.f131125f;
        }
        Object obj8 = obj5;
        Object obj9 = obj6;
        return kVar.g(obj, obj2, obj3, obj4, obj8, obj9);
    }

    public final A a() {
        return this.f131120a;
    }

    public final B b() {
        return this.f131121b;
    }

    public final C c() {
        return this.f131122c;
    }

    public final D d() {
        return this.f131123d;
    }

    public final E e() {
        return this.f131124e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f131120a, kVar.f131120a) && Intrinsics.areEqual(this.f131121b, kVar.f131121b) && Intrinsics.areEqual(this.f131122c, kVar.f131122c) && Intrinsics.areEqual(this.f131123d, kVar.f131123d) && Intrinsics.areEqual(this.f131124e, kVar.f131124e) && Intrinsics.areEqual(this.f131125f, kVar.f131125f);
    }

    public final F f() {
        return this.f131125f;
    }

    @NotNull
    public final k<A, B, C, D, E, F> g(A a10, B b10, C c10, D d10, E e10, F f10) {
        return new k<>(a10, b10, c10, d10, e10, f10);
    }

    public int hashCode() {
        A a10 = this.f131120a;
        int iHashCode = 0;
        int iHashCode2 = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f131121b;
        int iHashCode3 = (iHashCode2 + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f131122c;
        int iHashCode4 = (iHashCode3 + (c10 == null ? 0 : c10.hashCode())) * 31;
        D d10 = this.f131123d;
        int iHashCode5 = (iHashCode4 + (d10 == null ? 0 : d10.hashCode())) * 31;
        E e10 = this.f131124e;
        int iHashCode6 = (iHashCode5 + (e10 == null ? 0 : e10.hashCode())) * 31;
        F f10 = this.f131125f;
        if (f10 != null) {
            iHashCode = f10.hashCode();
        }
        return iHashCode6 + iHashCode;
    }

    public final A i() {
        return this.f131120a;
    }

    public final B j() {
        return this.f131121b;
    }

    public final C k() {
        return this.f131122c;
    }

    public final D l() {
        return this.f131123d;
    }

    public final E m() {
        return this.f131124e;
    }

    public final F n() {
        return this.f131125f;
    }

    @NotNull
    public String toString() {
        return "Sextuple(a=" + this.f131120a + ", b=" + this.f131121b + ", c=" + this.f131122c + ", d=" + this.f131123d + ", e=" + this.f131124e + ", f=" + this.f131125f + ')';
    }
}

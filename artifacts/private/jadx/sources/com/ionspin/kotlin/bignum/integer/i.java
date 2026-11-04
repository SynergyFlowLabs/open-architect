package com.ionspin.kotlin.bignum.integer;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class i<A, B, C, D, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f131114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f131115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f131116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f131117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f131118e;

    public i(A a10, B b10, C c10, D d10, E e10) {
        this.f131114a = a10;
        this.f131115b = b10;
        this.f131116c = c10;
        this.f131117d = d10;
        this.f131118e = e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i g(i iVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, Object obj6) {
        if ((i10 & 1) != 0) {
            obj = iVar.f131114a;
        }
        if ((i10 & 2) != 0) {
            obj2 = iVar.f131115b;
        }
        if ((i10 & 4) != 0) {
            obj3 = iVar.f131116c;
        }
        if ((i10 & 8) != 0) {
            obj4 = iVar.f131117d;
        }
        if ((i10 & 16) != 0) {
            obj5 = iVar.f131118e;
        }
        Object obj7 = obj5;
        Object obj8 = obj3;
        return iVar.f(obj, obj2, obj8, obj4, obj7);
    }

    public final A a() {
        return this.f131114a;
    }

    public final B b() {
        return this.f131115b;
    }

    public final C c() {
        return this.f131116c;
    }

    public final D d() {
        return this.f131117d;
    }

    public final E e() {
        return this.f131118e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f131114a, iVar.f131114a) && Intrinsics.areEqual(this.f131115b, iVar.f131115b) && Intrinsics.areEqual(this.f131116c, iVar.f131116c) && Intrinsics.areEqual(this.f131117d, iVar.f131117d) && Intrinsics.areEqual(this.f131118e, iVar.f131118e);
    }

    @NotNull
    public final i<A, B, C, D, E> f(A a10, B b10, C c10, D d10, E e10) {
        return new i<>(a10, b10, c10, d10, e10);
    }

    public final A h() {
        return this.f131114a;
    }

    public int hashCode() {
        A a10 = this.f131114a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f131115b;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f131116c;
        int iHashCode3 = (iHashCode2 + (c10 == null ? 0 : c10.hashCode())) * 31;
        D d10 = this.f131117d;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        E e10 = this.f131118e;
        return iHashCode4 + (e10 != null ? e10.hashCode() : 0);
    }

    public final B i() {
        return this.f131115b;
    }

    public final C j() {
        return this.f131116c;
    }

    public final D k() {
        return this.f131117d;
    }

    public final E l() {
        return this.f131118e;
    }

    @NotNull
    public String toString() {
        return "Quintuple(a=" + this.f131114a + ", b=" + this.f131115b + ", c=" + this.f131116c + ", d=" + this.f131117d + ", e=" + this.f131118e + ')';
    }
}

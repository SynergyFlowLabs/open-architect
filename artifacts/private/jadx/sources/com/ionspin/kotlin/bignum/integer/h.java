package com.ionspin.kotlin.bignum.integer;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class h<A, B, C, D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f131110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f131111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f131112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f131113d;

    public h(A a10, B b10, C c10, D d10) {
        this.f131110a = a10;
        this.f131111b = b10;
        this.f131112c = c10;
        this.f131113d = d10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h f(h hVar, Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5) {
        if ((i10 & 1) != 0) {
            obj = hVar.f131110a;
        }
        if ((i10 & 2) != 0) {
            obj2 = hVar.f131111b;
        }
        if ((i10 & 4) != 0) {
            obj3 = hVar.f131112c;
        }
        if ((i10 & 8) != 0) {
            obj4 = hVar.f131113d;
        }
        return hVar.e(obj, obj2, obj3, obj4);
    }

    public final A a() {
        return this.f131110a;
    }

    public final B b() {
        return this.f131111b;
    }

    public final C c() {
        return this.f131112c;
    }

    public final D d() {
        return this.f131113d;
    }

    @NotNull
    public final h<A, B, C, D> e(A a10, B b10, C c10, D d10) {
        return new h<>(a10, b10, c10, d10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f131110a, hVar.f131110a) && Intrinsics.areEqual(this.f131111b, hVar.f131111b) && Intrinsics.areEqual(this.f131112c, hVar.f131112c) && Intrinsics.areEqual(this.f131113d, hVar.f131113d);
    }

    public final A g() {
        return this.f131110a;
    }

    public final B h() {
        return this.f131111b;
    }

    public int hashCode() {
        A a10 = this.f131110a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f131111b;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f131112c;
        int iHashCode3 = (iHashCode2 + (c10 == null ? 0 : c10.hashCode())) * 31;
        D d10 = this.f131113d;
        return iHashCode3 + (d10 != null ? d10.hashCode() : 0);
    }

    public final C i() {
        return this.f131112c;
    }

    public final D j() {
        return this.f131113d;
    }

    @NotNull
    public String toString() {
        return "Quadruple(a=" + this.f131110a + ", b=" + this.f131111b + ", c=" + this.f131112c + ", d=" + this.f131113d + ')';
    }
}

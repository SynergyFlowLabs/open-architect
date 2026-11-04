package ca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.integer.a f82536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.integer.a f82537b;

    public i(@NotNull com.ionspin.kotlin.bignum.integer.a quotient, @NotNull com.ionspin.kotlin.bignum.integer.a remainder) {
        Intrinsics.checkNotNullParameter(quotient, "quotient");
        Intrinsics.checkNotNullParameter(remainder, "remainder");
        this.f82536a = quotient;
        this.f82537b = remainder;
    }

    public static /* synthetic */ i d(i iVar, com.ionspin.kotlin.bignum.integer.a aVar, com.ionspin.kotlin.bignum.integer.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = iVar.f82536a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = iVar.f82537b;
        }
        return iVar.c(aVar, aVar2);
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a a() {
        return this.f82536a;
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a b() {
        return this.f82537b;
    }

    @NotNull
    public final i c(@NotNull com.ionspin.kotlin.bignum.integer.a quotient, @NotNull com.ionspin.kotlin.bignum.integer.a remainder) {
        Intrinsics.checkNotNullParameter(quotient, "quotient");
        Intrinsics.checkNotNullParameter(remainder, "remainder");
        return new i(quotient, remainder);
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a e() {
        return this.f82536a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f82536a, iVar.f82536a) && Intrinsics.areEqual(this.f82537b, iVar.f82537b);
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.integer.a f() {
        return this.f82537b;
    }

    public int hashCode() {
        return (this.f82536a.hashCode() * 31) + this.f82537b.hashCode();
    }

    @NotNull
    public String toString() {
        return "QuotientAndRemainder(quotient=" + this.f82536a + ", remainder=" + this.f82537b + ')';
    }
}

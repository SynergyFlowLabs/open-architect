package ca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.modular.a f82534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ionspin.kotlin.bignum.modular.a f82535b;

    public g(@NotNull com.ionspin.kotlin.bignum.modular.a quotient, @NotNull com.ionspin.kotlin.bignum.modular.a remainder) {
        Intrinsics.checkNotNullParameter(quotient, "quotient");
        Intrinsics.checkNotNullParameter(remainder, "remainder");
        this.f82534a = quotient;
        this.f82535b = remainder;
    }

    public static /* synthetic */ g d(g gVar, com.ionspin.kotlin.bignum.modular.a aVar, com.ionspin.kotlin.bignum.modular.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = gVar.f82534a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = gVar.f82535b;
        }
        return gVar.c(aVar, aVar2);
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.modular.a a() {
        return this.f82534a;
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.modular.a b() {
        return this.f82535b;
    }

    @NotNull
    public final g c(@NotNull com.ionspin.kotlin.bignum.modular.a quotient, @NotNull com.ionspin.kotlin.bignum.modular.a remainder) {
        Intrinsics.checkNotNullParameter(quotient, "quotient");
        Intrinsics.checkNotNullParameter(remainder, "remainder");
        return new g(quotient, remainder);
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.modular.a e() {
        return this.f82534a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f82534a, gVar.f82534a) && Intrinsics.areEqual(this.f82535b, gVar.f82535b);
    }

    @NotNull
    public final com.ionspin.kotlin.bignum.modular.a f() {
        return this.f82535b;
    }

    public int hashCode() {
        return (this.f82534a.hashCode() * 31) + this.f82535b.hashCode();
    }

    @NotNull
    public String toString() {
        return "ModularQuotientAndRemainder(quotient=" + this.f82534a + ", remainder=" + this.f82535b + ')';
    }
}

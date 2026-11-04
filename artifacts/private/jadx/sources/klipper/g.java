package klipper;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f312311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f312312b;

    public g() {
        this(0.0d, 0.0d, 3, null);
    }

    public static /* synthetic */ g d(g gVar, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = gVar.f312311a;
        }
        if ((i10 & 2) != 0) {
            d11 = gVar.f312312b;
        }
        return gVar.c(d10, d11);
    }

    public final double a() {
        return this.f312311a;
    }

    public final double b() {
        return this.f312312b;
    }

    @NotNull
    public final g c(double d10, double d11) {
        return new g(d10, d11);
    }

    public final double e() {
        return this.f312311a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.f312311a), (Object) Double.valueOf(gVar.f312311a)) && Intrinsics.areEqual((Object) Double.valueOf(this.f312312b), (Object) Double.valueOf(gVar.f312312b));
    }

    public final double f() {
        return this.f312312b;
    }

    public final void g(@NotNull g other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f312311a = other.f312311a;
        this.f312312b = other.f312312b;
    }

    public final void h(double d10) {
        this.f312311a = d10;
    }

    public int hashCode() {
        return (Double.hashCode(this.f312311a) * 31) + Double.hashCode(this.f312312b);
    }

    public final void i(double d10) {
        this.f312312b = d10;
    }

    @NotNull
    public String toString() {
        return "DoublePoint(x=" + this.f312311a + ", y=" + this.f312312b + ')';
    }

    public g(double d10, double d11) {
        this.f312311a = d10;
        this.f312312b = d11;
    }

    public /* synthetic */ g(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
    }
}

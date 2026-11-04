package klipper;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f312325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f312326b;

    public k() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ k d(k kVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = kVar.f312325a;
        }
        if ((i10 & 2) != 0) {
            j11 = kVar.f312326b;
        }
        return kVar.c(j10, j11);
    }

    public final long a() {
        return this.f312325a;
    }

    public final long b() {
        return this.f312326b;
    }

    @NotNull
    public final k c(long j10, long j11) {
        return new k(j10, j11);
    }

    public final long e() {
        return this.f312325a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f312325a == kVar.f312325a && this.f312326b == kVar.f312326b;
    }

    public final long f() {
        return this.f312326b;
    }

    public final boolean g(@NotNull k linePt1, @NotNull k linePt2, boolean z10) {
        Intrinsics.checkNotNullParameter(linePt1, "linePt1");
        Intrinsics.checkNotNullParameter(linePt2, "linePt2");
        if (!z10) {
            if (!Intrinsics.areEqual(this, linePt1) && !Intrinsics.areEqual(this, linePt2)) {
                long j10 = this.f312325a;
                long j11 = linePt1.f312325a;
                boolean z11 = j10 > j11;
                long j12 = linePt2.f312325a;
                if (z11 == (j10 < j12)) {
                    long j13 = this.f312326b;
                    long j14 = linePt1.f312326b;
                    boolean z12 = j13 > j14;
                    long j15 = linePt2.f312326b;
                    if (z12 != (j13 < j15) || (j10 - j11) * (j15 - j14) != (j12 - j11) * (j13 - j14)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (!Intrinsics.areEqual(this, linePt1) && !Intrinsics.areEqual(this, linePt2)) {
            long j16 = this.f312325a;
            long j17 = linePt1.f312325a;
            if ((j16 > j17) == (j16 < linePt2.f312325a)) {
                long j18 = this.f312326b;
                long j19 = linePt1.f312326b;
                boolean z13 = j18 > j19;
                long j20 = linePt2.f312326b;
                if (z13 == (j18 < j20)) {
                    q.E(j16 - j17, j20 - j19);
                    Unit unit = Unit.f312394a;
                    q.E(linePt2.f312325a - linePt1.f312325a, this.f312326b - linePt1.f312326b);
                    if (Intrinsics.areEqual(unit, unit)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean h(@NotNull u pp, boolean z10) {
        Intrinsics.checkNotNullParameter(pp, "pp");
        u uVarF = pp;
        while (!g(uVarF.h(), uVarF.f().h(), z10)) {
            uVarF = uVarF.f();
            if (Intrinsics.areEqual(uVarF, pp)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(this.f312325a) * 31) + Long.hashCode(this.f312326b);
    }

    public final void i(long j10, long j11) {
        this.f312325a = j10;
        this.f312326b = j11;
    }

    public final void j(@NotNull k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f312325a = other.f312325a;
        this.f312326b = other.f312326b;
    }

    public final void k(long j10) {
        this.f312325a = j10;
    }

    public final void l(long j10) {
        this.f312326b = j10;
    }

    @NotNull
    public String toString() {
        return "IntPoint(x=" + this.f312325a + ", y=" + this.f312326b + ')';
    }

    public k(long j10, long j11) {
        this.f312325a = j10;
        this.f312326b = j11;
    }

    public /* synthetic */ k(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11);
    }
}

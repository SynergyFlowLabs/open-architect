package com.ionspin.kotlin.bignum.decimal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f131038f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final c f131039g = new c(0, null, 0, 7, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final c f131040h = new c(30, e.ROUND_HALF_AWAY_FROM_ZERO, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f131041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f131042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f131043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f131044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f131045e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a() {
            return c.f131039g;
        }

        @NotNull
        public final c b() {
            return c.f131040h;
        }

        private a() {
        }
    }

    public c() {
        this(0L, null, 0L, 7, null);
    }

    public static /* synthetic */ c g(c cVar, long j10, e eVar, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = cVar.f131041a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            eVar = cVar.f131042b;
        }
        e eVar2 = eVar;
        if ((i10 & 4) != 0) {
            j11 = cVar.f131043c;
        }
        return cVar.f(j12, eVar2, j11);
    }

    public final long c() {
        return this.f131041a;
    }

    @NotNull
    public final e d() {
        return this.f131042b;
    }

    public final long e() {
        return this.f131043c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f131041a == cVar.f131041a && this.f131042b == cVar.f131042b && this.f131043c == cVar.f131043c;
    }

    @NotNull
    public final c f(long j10, @NotNull e roundingMode, long j11) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        return new c(j10, roundingMode, j11);
    }

    public final long h() {
        return this.f131041a;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f131041a) * 31) + this.f131042b.hashCode()) * 31) + Long.hashCode(this.f131043c);
    }

    @NotNull
    public final e i() {
        return this.f131042b;
    }

    public final long j() {
        return this.f131043c;
    }

    public final boolean k() {
        return this.f131045e;
    }

    public final boolean l() {
        return this.f131044d;
    }

    @NotNull
    public String toString() {
        return "DecimalMode(decimalPrecision=" + this.f131041a + ", roundingMode=" + this.f131042b + ", scale=" + this.f131043c + ')';
    }

    public c(long j10, @NotNull e roundingMode, long j11) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        this.f131041a = j10;
        this.f131042b = roundingMode;
        this.f131043c = j11;
        if (j10 < 0) {
            throw new ArithmeticException("Negative decimal precision is not allowed.");
        }
        this.f131044d = j10 == 0;
        boolean z10 = j11 >= 0;
        this.f131045e = z10;
        if (!z10 && j10 == 0 && roundingMode != e.NONE) {
            throw new ArithmeticException("Rounding mode with 0 digits precision.");
        }
        if (j11 < -1) {
            throw new ArithmeticException("Negative Scale is unsupported.");
        }
        if (z10 && roundingMode == e.NONE) {
            throw new ArithmeticException("Scale of " + j11 + " digits to the right of the decimal requires a RoundingMode that is not NONE.");
        }
    }

    public /* synthetic */ c(long j10, e eVar, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? e.NONE : eVar, (i10 & 4) != 0 ? -1L : j11);
    }
}

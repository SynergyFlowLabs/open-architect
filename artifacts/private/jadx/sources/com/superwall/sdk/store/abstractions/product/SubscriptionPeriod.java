package com.superwall.sdk.store.abstractions.product;

import com.canhub.cropper.core.CropImageOptions;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.threeten.bp.n;

/* JADX INFO: loaded from: classes13.dex */
public final class SubscriptionPeriod {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int calculationScale;
    private final int outputScale;

    @NotNull
    private final RoundingMode roundingMode;

    @NotNull
    private final Unit unit;
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SubscriptionPeriod from(@NotNull String subscriptionPeriodString) {
            SubscriptionPeriod subscriptionPeriod;
            SubscriptionPeriod subscriptionPeriod2;
            Intrinsics.checkNotNullParameter(subscriptionPeriodString, "subscriptionPeriodString");
            try {
                n nVarE = n.E(subscriptionPeriodString);
                int iK = (((int) nVarE.K()) * 30) + nVarE.p();
                int i10 = iK / 7;
                if (iK % 7 > 0) {
                    subscriptionPeriod = new SubscriptionPeriod(iK, Unit.day);
                } else if (i10 > 0) {
                    subscriptionPeriod = new SubscriptionPeriod(i10, Unit.week);
                } else {
                    if (nVarE.K() > 0) {
                        subscriptionPeriod2 = new SubscriptionPeriod((int) nVarE.K(), Unit.month);
                    } else if (nVarE.r() > 0) {
                        subscriptionPeriod2 = new SubscriptionPeriod(nVarE.r(), Unit.year);
                    } else {
                        subscriptionPeriod = null;
                    }
                    subscriptionPeriod = subscriptionPeriod2;
                }
                if (subscriptionPeriod != null) {
                    return subscriptionPeriod.normalized();
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public enum Unit {
        day,
        week,
        month,
        year;

        private static final /* synthetic */ a $ENTRIES = c.c(values());

        @NotNull
        public static a<Unit> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Unit.values().length];
            try {
                iArr[Unit.day.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Unit.week.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Unit.month.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Unit.year.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SubscriptionPeriod(int i10, @NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.value = i10;
        this.unit = unit;
        this.roundingMode = RoundingMode.DOWN;
        this.calculationScale = 7;
        this.outputScale = 2;
    }

    public static /* synthetic */ SubscriptionPeriod copy$default(SubscriptionPeriod subscriptionPeriod, int i10, Unit unit, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = subscriptionPeriod.value;
        }
        if ((i11 & 2) != 0) {
            unit = subscriptionPeriod.unit;
        }
        return subscriptionPeriod.copy(i10, unit);
    }

    public final int component1() {
        return this.value;
    }

    @NotNull
    public final Unit component2() {
        return this.unit;
    }

    @NotNull
    public final SubscriptionPeriod copy(int i10, @NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new SubscriptionPeriod(i10, unit);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionPeriod)) {
            return false;
        }
        SubscriptionPeriod subscriptionPeriod = (SubscriptionPeriod) obj;
        return this.value == subscriptionPeriod.value && this.unit == subscriptionPeriod.unit;
    }

    public final double getDaysPerUnit() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return 1.0d;
        }
        if (i10 == 2) {
            return 7.0d;
        }
        if (i10 == 3) {
            return 30.0d;
        }
        if (i10 == 4) {
            return 365.0d;
        }
        throw new k0();
    }

    public final long getToMillis() {
        long j10 = 60;
        return ((long) (((double) this.value) * getDaysPerUnit())) * ((long) 24) * j10 * j10 * ((long) 1000);
    }

    @NotNull
    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Integer.hashCode(this.value) * 31) + this.unit.hashCode();
    }

    @NotNull
    public final SubscriptionPeriod normalized() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 != 1) {
            if (i10 != 3) {
                return this;
            }
            int i11 = this.value;
            return i11 % 12 == 0 ? copy(i11 / 12, Unit.year) : this;
        }
        int i12 = this.value;
        if (i12 % 30 == 0) {
            return copy(i12 / 30, Unit.month).normalized();
        }
        if (i12 % 7 == 0) {
            return copy(i12 / 7, Unit.week).normalized();
        }
        return i12 % CropImageOptions.S3 == 0 ? copy(i12 / CropImageOptions.S3, Unit.year) : this;
    }

    @NotNull
    public final BigDecimal pricePerDay(@NotNull BigDecimal price) {
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter(price, "price");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 != 1) {
            int i11 = 5 >> 2;
            if (i10 == 2) {
                bigDecimal = new BigDecimal(7);
            } else if (i10 == 3) {
                bigDecimal = new BigDecimal(30);
            } else {
                if (i10 != 4) {
                    throw new k0();
                }
                bigDecimal = new BigDecimal(365);
            }
        } else {
            bigDecimal = BigDecimal.ONE;
        }
        Intrinsics.checkNotNull(bigDecimal);
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(this.value));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalDivide = price.divide(bigDecimalMultiply, this.outputScale, this.roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    @NotNull
    public final BigDecimal pricePerMonth(@NotNull BigDecimal price) {
        BigDecimal bigDecimalDivide;
        Intrinsics.checkNotNullParameter(price, "price");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            bigDecimalDivide = BigDecimal.ONE.divide(new BigDecimal(30), this.calculationScale, this.roundingMode);
        } else if (i10 == 2) {
            bigDecimalDivide = BigDecimal.ONE.divide(new BigDecimal(4.285714285714286d), this.calculationScale, this.roundingMode);
        } else if (i10 == 3) {
            bigDecimalDivide = BigDecimal.ONE;
        } else {
            if (i10 != 4) {
                throw new k0();
            }
            bigDecimalDivide = new BigDecimal(12);
        }
        Intrinsics.checkNotNull(bigDecimalDivide);
        BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(this.value));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalDivide2 = price.divide(bigDecimalMultiply, this.outputScale, this.roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
        return bigDecimalDivide2;
    }

    @NotNull
    public final BigDecimal pricePerWeek(@NotNull BigDecimal price) {
        BigDecimal bigDecimalDivide;
        Intrinsics.checkNotNullParameter(price, "price");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            bigDecimalDivide = BigDecimal.ONE.divide(new BigDecimal(7), this.calculationScale, this.roundingMode);
        } else if (i10 == 2) {
            bigDecimalDivide = BigDecimal.ONE;
        } else if (i10 == 3) {
            bigDecimalDivide = new BigDecimal(4);
        } else {
            if (i10 != 4) {
                throw new k0();
            }
            bigDecimalDivide = new BigDecimal(52);
        }
        Intrinsics.checkNotNull(bigDecimalDivide);
        BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(this.value));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalDivide2 = price.divide(bigDecimalMultiply, this.outputScale, this.roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
        return bigDecimalDivide2;
    }

    @NotNull
    public final BigDecimal pricePerYear(@NotNull BigDecimal price) {
        BigDecimal bigDecimalDivide;
        Intrinsics.checkNotNullParameter(price, "price");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            bigDecimalDivide = BigDecimal.ONE.divide(new BigDecimal(365), this.calculationScale, this.roundingMode);
        } else if (i10 == 2) {
            bigDecimalDivide = BigDecimal.ONE.divide(new BigDecimal(52), this.calculationScale, this.roundingMode);
        } else if (i10 == 3) {
            bigDecimalDivide = BigDecimal.ONE.divide(new BigDecimal(12), this.calculationScale, this.roundingMode);
        } else {
            if (i10 != 4) {
                throw new k0();
            }
            bigDecimalDivide = BigDecimal.ONE;
        }
        BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(this.value));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalDivide2 = price.divide(bigDecimalMultiply, this.outputScale, this.roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
        return bigDecimalDivide2;
    }

    public final long toMillis() {
        int i10;
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i11 == 1) {
            i10 = this.value;
        } else if (i11 == 2) {
            i10 = this.value * 7;
        } else if (i11 == 3) {
            i10 = this.value * 30;
        } else {
            if (i11 != 4) {
                throw new k0();
            }
            i10 = this.value * 365;
        }
        long j10 = 60;
        return ((long) i10) * 24 * j10 * j10 * ((long) 1000);
    }

    @NotNull
    public final n toPeriod() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            n nVarA = n.A(this.value);
            Intrinsics.checkNotNullExpressionValue(nVarA, "ofDays(...)");
            return nVarA;
        }
        if (i10 == 2) {
            n nVarC = n.C(this.value);
            Intrinsics.checkNotNullExpressionValue(nVarC, "ofWeeks(...)");
            return nVarC;
        }
        int i11 = 0 << 3;
        if (i10 == 3) {
            n nVarB = n.B(this.value);
            Intrinsics.checkNotNullExpressionValue(nVarB, "ofMonths(...)");
            return nVarB;
        }
        if (i10 != 4) {
            throw new k0();
        }
        n nVarD = n.D(this.value);
        Intrinsics.checkNotNullExpressionValue(nVarD, "ofYears(...)");
        return nVarD;
    }

    @NotNull
    public String toString() {
        return "SubscriptionPeriod(value=" + this.value + ", unit=" + this.unit + ")";
    }
}

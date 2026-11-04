package com.devtodev.analytics.internal.storage.sqlite;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SqlValue {

    public static final class Boolean extends SqlValue {
        private final boolean aBoolean;

        public Boolean(boolean z10) {
            super(null);
            this.aBoolean = z10;
        }

        public static /* synthetic */ Boolean copy$default(Boolean r10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = r10.aBoolean;
            }
            return r10.copy(z10);
        }

        public final boolean component1() {
            return this.aBoolean;
        }

        @NotNull
        public final Boolean copy(boolean z10) {
            return new Boolean(z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Boolean) && this.aBoolean == ((Boolean) obj).aBoolean;
        }

        public final boolean getABoolean() {
            return this.aBoolean;
        }

        public int hashCode() {
            boolean z10 = this.aBoolean;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        @NotNull
        public java.lang.String toString() {
            return "Boolean(aBoolean=" + this.aBoolean + ")";
        }
    }

    public static final class Double extends SqlValue {
        private final double aDouble;

        public Double(double d10) {
            super(null);
            this.aDouble = d10;
        }

        public static /* synthetic */ Double copy$default(Double r10, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = r10.aDouble;
            }
            return r10.copy(d10);
        }

        public final double component1() {
            return this.aDouble;
        }

        @NotNull
        public final Double copy(double d10) {
            return new Double(d10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Double) && java.lang.Double.compare(this.aDouble, ((Double) obj).aDouble) == 0;
        }

        public final double getADouble() {
            return this.aDouble;
        }

        public int hashCode() {
            return java.lang.Double.hashCode(this.aDouble);
        }

        @NotNull
        public java.lang.String toString() {
            return "Double(aDouble=" + this.aDouble + ")";
        }
    }

    public static final class DoubleOrNull extends SqlValue {

        @Nullable
        private final java.lang.Double aDouble;

        public DoubleOrNull(@Nullable java.lang.Double d10) {
            super(null);
            this.aDouble = d10;
        }

        public static /* synthetic */ DoubleOrNull copy$default(DoubleOrNull doubleOrNull, java.lang.Double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = doubleOrNull.aDouble;
            }
            return doubleOrNull.copy(d10);
        }

        @Nullable
        public final java.lang.Double component1() {
            return this.aDouble;
        }

        @NotNull
        public final DoubleOrNull copy(@Nullable java.lang.Double d10) {
            return new DoubleOrNull(d10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoubleOrNull) && Intrinsics.areEqual((Object) this.aDouble, (Object) ((DoubleOrNull) obj).aDouble);
        }

        @Nullable
        public final java.lang.Double getADouble() {
            return this.aDouble;
        }

        public int hashCode() {
            java.lang.Double d10 = this.aDouble;
            if (d10 == null) {
                return 0;
            }
            return d10.hashCode();
        }

        @NotNull
        public java.lang.String toString() {
            return "DoubleOrNull(aDouble=" + this.aDouble + ")";
        }
    }

    public static final class Int extends SqlValue {
        private final int anInt;

        public Int(int i10) {
            super(null);
            this.anInt = i10;
        }

        public static /* synthetic */ Int copy$default(Int r10, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = r10.anInt;
            }
            return r10.copy(i10);
        }

        public final int component1() {
            return this.anInt;
        }

        @NotNull
        public final Int copy(int i10) {
            return new Int(i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Int) && this.anInt == ((Int) obj).anInt;
        }

        public final int getAnInt() {
            return this.anInt;
        }

        public int hashCode() {
            return Integer.hashCode(this.anInt);
        }

        @NotNull
        public java.lang.String toString() {
            return "Int(anInt=" + this.anInt + ")";
        }
    }

    public static final class IntOrNull extends SqlValue {

        @Nullable
        private final Integer anInt;

        public IntOrNull(@Nullable Integer num) {
            super(null);
            this.anInt = num;
        }

        public static /* synthetic */ IntOrNull copy$default(IntOrNull intOrNull, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = intOrNull.anInt;
            }
            return intOrNull.copy(num);
        }

        @Nullable
        public final Integer component1() {
            return this.anInt;
        }

        @NotNull
        public final IntOrNull copy(@Nullable Integer num) {
            return new IntOrNull(num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntOrNull) && Intrinsics.areEqual(this.anInt, ((IntOrNull) obj).anInt);
        }

        @Nullable
        public final Integer getAnInt() {
            return this.anInt;
        }

        public int hashCode() {
            Integer num = this.anInt;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @NotNull
        public java.lang.String toString() {
            return "IntOrNull(anInt=" + this.anInt + ")";
        }
    }

    public static final class Long extends SqlValue {
        private final long aLong;

        public Long(long j10) {
            super(null);
            this.aLong = j10;
        }

        public static /* synthetic */ Long copy$default(Long r10, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = r10.aLong;
            }
            return r10.copy(j10);
        }

        public final long component1() {
            return this.aLong;
        }

        @NotNull
        public final Long copy(long j10) {
            return new Long(j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Long) && this.aLong == ((Long) obj).aLong;
        }

        public final long getALong() {
            return this.aLong;
        }

        public int hashCode() {
            return java.lang.Long.hashCode(this.aLong);
        }

        @NotNull
        public java.lang.String toString() {
            return "Long(aLong=" + this.aLong + ")";
        }
    }

    public static final class LongOrNull extends SqlValue {

        @Nullable
        private final java.lang.Long aLong;

        public LongOrNull(@Nullable java.lang.Long l10) {
            super(null);
            this.aLong = l10;
        }

        public static /* synthetic */ LongOrNull copy$default(LongOrNull longOrNull, java.lang.Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = longOrNull.aLong;
            }
            return longOrNull.copy(l10);
        }

        @Nullable
        public final java.lang.Long component1() {
            return this.aLong;
        }

        @NotNull
        public final LongOrNull copy(@Nullable java.lang.Long l10) {
            return new LongOrNull(l10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LongOrNull) && Intrinsics.areEqual(this.aLong, ((LongOrNull) obj).aLong);
        }

        @Nullable
        public final java.lang.Long getALong() {
            return this.aLong;
        }

        public int hashCode() {
            java.lang.Long l10 = this.aLong;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        @NotNull
        public java.lang.String toString() {
            return "LongOrNull(aLong=" + this.aLong + ")";
        }
    }

    public static final class String extends SqlValue {

        @NotNull
        private final java.lang.String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public String(@NotNull java.lang.String string) {
            super(null);
            Intrinsics.checkNotNullParameter(string, "string");
            this.string = string;
        }

        public static /* synthetic */ String copy$default(String string, java.lang.String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = string.string;
            }
            return string.copy(str);
        }

        @NotNull
        public final java.lang.String component1() {
            return this.string;
        }

        @NotNull
        public final String copy(@NotNull java.lang.String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return new String(string);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof String) && Intrinsics.areEqual(this.string, ((String) obj).string)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final java.lang.String getString() {
            return this.string;
        }

        public int hashCode() {
            return this.string.hashCode();
        }

        @NotNull
        public java.lang.String toString() {
            return "String(string=" + this.string + ")";
        }
    }

    public static final class StringOrNull extends SqlValue {

        @Nullable
        private final java.lang.String string;

        public StringOrNull(@Nullable java.lang.String str) {
            super(null);
            this.string = str;
        }

        public static /* synthetic */ StringOrNull copy$default(StringOrNull stringOrNull, java.lang.String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = stringOrNull.string;
            }
            return stringOrNull.copy(str);
        }

        @Nullable
        public final java.lang.String component1() {
            return this.string;
        }

        @NotNull
        public final StringOrNull copy(@Nullable java.lang.String str) {
            return new StringOrNull(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringOrNull) && Intrinsics.areEqual(this.string, ((StringOrNull) obj).string);
        }

        @Nullable
        public final java.lang.String getString() {
            return this.string;
        }

        public int hashCode() {
            java.lang.String str = this.string;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public java.lang.String toString() {
            return "StringOrNull(string=" + this.string + ")";
        }
    }

    public /* synthetic */ SqlValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SqlValue() {
    }
}

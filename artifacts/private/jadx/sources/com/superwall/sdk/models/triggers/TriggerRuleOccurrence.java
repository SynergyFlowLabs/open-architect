package com.superwall.sdk.models.triggers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.s0;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class TriggerRuleOccurrence {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Interval interval;

    @NotNull
    private final String key;
    private int maxCount;

    @NotNull
    private final RawInterval rawInterval;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TriggerRuleOccurrence> serializer() {
            return TriggerRuleOccurrence$$serializer.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final TriggerRuleOccurrence stub() {
            return new TriggerRuleOccurrence("abc", 10, new RawInterval(RawInterval.IntervalType.INFINITY, (Integer) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
        }

        private Companion() {
        }
    }

    public static abstract class Interval {

        public static final class Infinity extends Interval {

            @NotNull
            public static final Infinity INSTANCE = new Infinity();

            private Infinity() {
                super(null);
            }
        }

        public static final class Minutes extends Interval {
            private final int minutes;

            public Minutes(int i10) {
                super(null);
                this.minutes = i10;
            }

            public static /* synthetic */ Minutes copy$default(Minutes minutes, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = minutes.minutes;
                }
                return minutes.copy(i10);
            }

            public final int component1() {
                return this.minutes;
            }

            @NotNull
            public final Minutes copy(int i10) {
                return new Minutes(i10);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Minutes) && this.minutes == ((Minutes) obj).minutes;
            }

            public final int getMinutes() {
                return this.minutes;
            }

            public int hashCode() {
                return Integer.hashCode(this.minutes);
            }

            @NotNull
            public String toString() {
                return "Minutes(minutes=" + this.minutes + ")";
            }
        }

        public /* synthetic */ Interval(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Interval() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RawInterval.IntervalType.values().length];
            try {
                iArr[RawInterval.IntervalType.MINUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RawInterval.IntervalType.INFINITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TriggerRuleOccurrence(int i10, String str, int i11, RawInterval rawInterval, v2 v2Var) {
        Interval minutes;
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, TriggerRuleOccurrence$$serializer.INSTANCE.getDescriptor());
        }
        this.key = str;
        this.maxCount = i11;
        this.rawInterval = rawInterval;
        int i12 = WhenMappings.$EnumSwitchMapping$0[rawInterval.getType().ordinal()];
        if (i12 == 1) {
            Integer minutes2 = rawInterval.getMinutes();
            minutes = new Interval.Minutes(minutes2 != null ? minutes2.intValue() : 0);
        } else {
            if (i12 != 2) {
                throw new k0();
            }
            minutes = Interval.Infinity.INSTANCE;
        }
        this.interval = minutes;
    }

    public static /* synthetic */ TriggerRuleOccurrence copy$default(TriggerRuleOccurrence triggerRuleOccurrence, String str, int i10, RawInterval rawInterval, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = triggerRuleOccurrence.key;
        }
        if ((i11 & 2) != 0) {
            i10 = triggerRuleOccurrence.maxCount;
        }
        if ((i11 & 4) != 0) {
            rawInterval = triggerRuleOccurrence.rawInterval;
        }
        return triggerRuleOccurrence.copy(str, i10, rawInterval);
    }

    @s0
    public static /* synthetic */ void getInterval$annotations() {
    }

    @a0("key")
    public static /* synthetic */ void getKey$annotations() {
    }

    @a0("max_count")
    public static /* synthetic */ void getMaxCount$annotations() {
    }

    @a0("interval")
    public static /* synthetic */ void getRawInterval$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(TriggerRuleOccurrence triggerRuleOccurrence, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, triggerRuleOccurrence.key);
        eVar.encodeIntElement(serialDescriptor, 1, triggerRuleOccurrence.maxCount);
        eVar.encodeSerializableElement(serialDescriptor, 2, RawInterval$$serializer.INSTANCE, triggerRuleOccurrence.rawInterval);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    public final int component2() {
        return this.maxCount;
    }

    @NotNull
    public final RawInterval component3() {
        return this.rawInterval;
    }

    @NotNull
    public final TriggerRuleOccurrence copy(@NotNull String key, int i10, @NotNull RawInterval rawInterval) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(rawInterval, "rawInterval");
        return new TriggerRuleOccurrence(key, i10, rawInterval);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggerRuleOccurrence)) {
            return false;
        }
        TriggerRuleOccurrence triggerRuleOccurrence = (TriggerRuleOccurrence) obj;
        return Intrinsics.areEqual(this.key, triggerRuleOccurrence.key) && this.maxCount == triggerRuleOccurrence.maxCount && Intrinsics.areEqual(this.rawInterval, triggerRuleOccurrence.rawInterval);
    }

    @NotNull
    public final Interval getInterval() {
        return this.interval;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    @NotNull
    public final RawInterval getRawInterval() {
        return this.rawInterval;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + Integer.hashCode(this.maxCount)) * 31) + this.rawInterval.hashCode();
    }

    public final void setMaxCount(int i10) {
        this.maxCount = i10;
    }

    @NotNull
    public String toString() {
        return "TriggerRuleOccurrence(key=" + this.key + ", maxCount=" + this.maxCount + ", rawInterval=" + this.rawInterval + ")";
    }

    public TriggerRuleOccurrence(@NotNull String key, int i10, @NotNull RawInterval rawInterval) {
        Interval minutes;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(rawInterval, "rawInterval");
        this.key = key;
        this.maxCount = i10;
        this.rawInterval = rawInterval;
        int i11 = WhenMappings.$EnumSwitchMapping$0[rawInterval.getType().ordinal()];
        if (i11 == 1) {
            Integer minutes2 = rawInterval.getMinutes();
            minutes = new Interval.Minutes(minutes2 != null ? minutes2.intValue() : 0);
        } else if (i11 == 2) {
            minutes = Interval.Infinity.INSTANCE;
        } else {
            throw new k0();
        }
        this.interval = minutes;
    }
}

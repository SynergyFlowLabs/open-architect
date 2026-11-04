package com.superwall.sdk.paywall.presentation.rule_logic.cel;

import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SuperscriptExposedFunction {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SuperscriptExposedFunction from(@NotNull String name, @NotNull List<? extends PassableValue> args) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(args, "args");
            if (Intrinsics.areEqual(name, Names.MINUTES_SINCE.getRawName())) {
                Object objFirst = CollectionsKt.first((List<? extends Object>) args);
                Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue.StringValue");
                return new MinutesSince(((PassableValue.StringValue) objFirst).getValue());
            }
            if (Intrinsics.areEqual(name, Names.HOURS_SINCE.getRawName())) {
                Object objFirst2 = CollectionsKt.first((List<? extends Object>) args);
                Intrinsics.checkNotNull(objFirst2, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue.StringValue");
                return new HoursSince(((PassableValue.StringValue) objFirst2).getValue());
            }
            if (Intrinsics.areEqual(name, Names.DAYS_SINCE.getRawName())) {
                Object objFirst3 = CollectionsKt.first((List<? extends Object>) args);
                Intrinsics.checkNotNull(objFirst3, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue.StringValue");
                return new DaysSince(((PassableValue.StringValue) objFirst3).getValue());
            }
            if (Intrinsics.areEqual(name, Names.MONTHS_SINCE.getRawName())) {
                Object objFirst4 = CollectionsKt.first((List<? extends Object>) args);
                Intrinsics.checkNotNull(objFirst4, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue.StringValue");
                return new MonthsSince(((PassableValue.StringValue) objFirst4).getValue());
            }
            if (Intrinsics.areEqual(name, Names.PLACEMENTS_IN_HOUR.getRawName())) {
                Object objFirst5 = CollectionsKt.first((List<? extends Object>) args);
                Intrinsics.checkNotNull(objFirst5, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue.StringValue");
                return new PlacementCount(((PassableValue.StringValue) objFirst5).getValue(), InPeriod.Period.HOUR);
            }
            if (Intrinsics.areEqual(name, Names.PLACEMENTS_IN_DAY.getRawName())) {
                Object objFirst6 = CollectionsKt.first((List<? extends Object>) args);
                Intrinsics.checkNotNull(objFirst6, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue.StringValue");
                return new PlacementCount(((PassableValue.StringValue) objFirst6).getValue(), InPeriod.Period.DAY);
            }
            if (Intrinsics.areEqual(name, Names.PLACEMENTS_IN_WEEK.getRawName())) {
                Object objFirst7 = CollectionsKt.first((List<? extends Object>) args);
                Intrinsics.checkNotNull(objFirst7, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue.StringValue");
                return new PlacementCount(((PassableValue.StringValue) objFirst7).getValue(), InPeriod.Period.WEEK);
            }
            if (Intrinsics.areEqual(name, Names.PLACEMENTS_IN_MONTH.getRawName())) {
                Object objFirst8 = CollectionsKt.first((List<? extends Object>) args);
                Intrinsics.checkNotNull(objFirst8, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue.StringValue");
                return new PlacementCount(((PassableValue.StringValue) objFirst8).getValue(), InPeriod.Period.MONTH);
            }
            if (!Intrinsics.areEqual(name, Names.PLACEMENTS_SINCE_INSTALL.getRawName())) {
                return null;
            }
            Object objFirst9 = CollectionsKt.first((List<? extends Object>) args);
            Intrinsics.checkNotNull(objFirst9, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue.StringValue");
            return new PlacementCount(((PassableValue.StringValue) objFirst9).getValue(), InPeriod.Period.INSTALL);
        }

        private Companion() {
        }
    }

    public static final class DaysSince extends SuperscriptExposedFunction implements TimeSince {

        @NotNull
        private final String event;

        @NotNull
        private final ComputedPropertyRequest.ComputedPropertyRequestType propertyRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DaysSince(@NotNull String event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
            this.propertyRequest = ComputedPropertyRequest.ComputedPropertyRequestType.DAYS_SINCE;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @NotNull
        public String getEvent() {
            return this.event;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @NotNull
        public ComputedPropertyRequest.ComputedPropertyRequestType getPropertyRequest() {
            return this.propertyRequest;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @Nullable
        public Object invoke(@NotNull CoreDataManager coreDataManager, @NotNull d<? super Integer> dVar) {
            return TimeSince.DefaultImpls.invoke(this, coreDataManager, dVar);
        }
    }

    public static final class HoursSince extends SuperscriptExposedFunction implements TimeSince {

        @NotNull
        private final String event;

        @NotNull
        private final ComputedPropertyRequest.ComputedPropertyRequestType propertyRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HoursSince(@NotNull String event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
            this.propertyRequest = ComputedPropertyRequest.ComputedPropertyRequestType.HOURS_SINCE;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @NotNull
        public String getEvent() {
            return this.event;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @NotNull
        public ComputedPropertyRequest.ComputedPropertyRequestType getPropertyRequest() {
            return this.propertyRequest;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @Nullable
        public Object invoke(@NotNull CoreDataManager coreDataManager, @NotNull d<? super Integer> dVar) {
            return TimeSince.DefaultImpls.invoke(this, coreDataManager, dVar);
        }
    }

    public static final class MinutesSince extends SuperscriptExposedFunction implements TimeSince {

        @NotNull
        private final String event;

        @NotNull
        private final ComputedPropertyRequest.ComputedPropertyRequestType propertyRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MinutesSince(@NotNull String event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
            this.propertyRequest = ComputedPropertyRequest.ComputedPropertyRequestType.MINUTES_SINCE;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @NotNull
        public String getEvent() {
            return this.event;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @NotNull
        public ComputedPropertyRequest.ComputedPropertyRequestType getPropertyRequest() {
            return this.propertyRequest;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @Nullable
        public Object invoke(@NotNull CoreDataManager coreDataManager, @NotNull d<? super Integer> dVar) {
            return TimeSince.DefaultImpls.invoke(this, coreDataManager, dVar);
        }
    }

    public static final class MonthsSince extends SuperscriptExposedFunction implements TimeSince {

        @NotNull
        private final String event;

        @NotNull
        private final ComputedPropertyRequest.ComputedPropertyRequestType propertyRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MonthsSince(@NotNull String event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
            this.propertyRequest = ComputedPropertyRequest.ComputedPropertyRequestType.MONTHS_SINCE;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @NotNull
        public String getEvent() {
            return this.event;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @NotNull
        public ComputedPropertyRequest.ComputedPropertyRequestType getPropertyRequest() {
            return this.propertyRequest;
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince
        @Nullable
        public Object invoke(@NotNull CoreDataManager coreDataManager, @NotNull d<? super Integer> dVar) {
            return TimeSince.DefaultImpls.invoke(this, coreDataManager, dVar);
        }
    }

    public enum Names {
        MINUTES_SINCE("minutesSince"),
        HOURS_SINCE("hoursSince"),
        DAYS_SINCE("daysSince"),
        MONTHS_SINCE("monthsSince"),
        PLACEMENTS_IN_HOUR("placementsInHour"),
        PLACEMENTS_IN_DAY("placementsInDay"),
        PLACEMENTS_IN_WEEK("placementsInWeek"),
        PLACEMENTS_IN_MONTH("placementsInMonth"),
        PLACEMENTS_SINCE_INSTALL("placementsSinceInstall");

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = c.c(values());

        @NotNull
        private final String rawName;

        static {
            int i10 = 7 >> 2;
        }

        Names(String str) {
            this.rawName = str;
        }

        @NotNull
        public static kotlin.enums.a<Names> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getRawName() {
            return this.rawName;
        }
    }

    public static final class PlacementCount extends SuperscriptExposedFunction {

        @NotNull
        private final String event;

        @NotNull
        private final InPeriod.Period period;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InPeriod.Period.values().length];
                try {
                    iArr[InPeriod.Period.HOUR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InPeriod.Period.DAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InPeriod.Period.WEEK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InPeriod.Period.MONTH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InPeriod.Period.INSTALL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlacementCount(@NotNull String event, @NotNull InPeriod.Period period) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(period, "period");
            this.event = event;
            this.period = period;
        }

        @NotNull
        public final String getEvent() {
            return this.event;
        }

        @NotNull
        public final InPeriod.Period getPeriod() {
            return this.period;
        }

        @Nullable
        public final Object invoke(@NotNull CoreDataManager coreDataManager, @NotNull d<? super Integer> dVar) {
            Date time;
            Date date = new Date();
            InPeriod.Period period = this.period;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[period.ordinal()] == 5) {
                time = new Date(0L);
            } else {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int i10 = iArr[this.period.ordinal()];
                if (i10 == 1) {
                    calendar.add(10, -1);
                } else if (i10 == 2) {
                    calendar.add(6, -1);
                } else if (i10 == 3) {
                    calendar.add(3, -1);
                } else {
                    if (i10 != 4) {
                        return null;
                    }
                    calendar.add(2, -1);
                }
                time = calendar.getTime();
            }
            String str = this.event;
            Intrinsics.checkNotNull(time);
            return coreDataManager.countEventsByNameInPeriod(str, time, date, dVar);
        }
    }

    public /* synthetic */ SuperscriptExposedFunction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SuperscriptExposedFunction() {
    }
}

package com.devtodev.analytics.internal.domain.events.abTests;

import com.google.android.gms.common.internal.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public enum ConditionsType {
    BACKEND("backend"),
    LOCAL(s.f106625b);


    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String value;

    @SourceDebugExtension({"SMAP\nCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Condition.kt\ncom/devtodev/analytics/internal/domain/events/abTests/ConditionsType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,53:1\n1282#2,2:54\n*S KotlinDebug\n*F\n+ 1 Condition.kt\ncom/devtodev/analytics/internal/domain/events/abTests/ConditionsType$Companion\n*L\n12#1:54,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ConditionsType getConditionType(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            for (ConditionsType conditionsType : ConditionsType.values()) {
                if (StringsKt.N1(conditionsType.getValue(), key, true)) {
                    return conditionsType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    ConditionsType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

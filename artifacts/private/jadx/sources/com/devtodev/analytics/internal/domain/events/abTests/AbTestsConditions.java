package com.devtodev.analytics.internal.domain.events.abTests;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public enum AbTestsConditions {
    IN("IN"),
    NOT_IN("NOT IN"),
    LESS("<"),
    MORE(">"),
    EQUALS("=="),
    NOT_EQUALS("!="),
    MORE_OR_EQUAL(">="),
    LESS_OR_EQUAL("<="),
    BOOLEAN("boolean");


    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String value;

    @SourceDebugExtension({"SMAP\nAbTestsConditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbTestsConditions.kt\ncom/devtodev/analytics/internal/domain/events/abTests/AbTestsConditions$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,18:1\n1282#2,2:19\n*S KotlinDebug\n*F\n+ 1 AbTestsConditions.kt\ncom/devtodev/analytics/internal/domain/events/abTests/AbTestsConditions$Companion\n*L\n16#1:19,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AbTestsConditions contains(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            for (AbTestsConditions abTestsConditions : AbTestsConditions.values()) {
                if (StringsKt.N1(abTestsConditions.getValue(), key, false)) {
                    return abTestsConditions;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    AbTestsConditions(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

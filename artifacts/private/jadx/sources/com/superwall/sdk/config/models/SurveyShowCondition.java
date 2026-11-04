package com.superwall.sdk.config.models;

import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = SurveyShowConditionSerializer.class)
public enum SurveyShowCondition {
    ON_MANUAL_CLOSE("ON_MANUAL_CLOSE"),
    ON_PURCHASE("ON_PURCHASE");


    @NotNull
    private final String rawValue;
    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SurveyShowCondition> serializer() {
            return SurveyShowConditionSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    SurveyShowCondition(String str) {
        this.rawValue = str;
    }

    @NotNull
    public static a<SurveyShowCondition> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}

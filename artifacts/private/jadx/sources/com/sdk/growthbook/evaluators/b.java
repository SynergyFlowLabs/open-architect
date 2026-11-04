package com.sdk.growthbook.evaluators;

import androidx.constraintlayout.core.motion.utils.v;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum b {
    GbString { // from class: com.sdk.growthbook.evaluators.b.f
        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return v.b.f43988e;
        }
    },
    GbNumber { // from class: com.sdk.growthbook.evaluators.b.d
        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return AttributeType.NUMBER;
        }
    },
    GbBoolean { // from class: com.sdk.growthbook.evaluators.b.b
        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return "boolean";
        }
    },
    GbArray { // from class: com.sdk.growthbook.evaluators.b.a
        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return "array";
        }
    },
    GbObject { // from class: com.sdk.growthbook.evaluators.b.e
        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return "object";
        }
    },
    GbNull { // from class: com.sdk.growthbook.evaluators.b.c
        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return AbstractJsonLexerKt.NULL;
        }
    },
    GbUnknown { // from class: com.sdk.growthbook.evaluators.b.g
        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return "unknown";
        }
    };


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f266220i = kotlin.enums.c.c(k());

    /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static kotlin.enums.a<b> l() {
        return f266220i;
    }
}

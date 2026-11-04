package com.superwall.sdk.analytics;

import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public enum Tier {
    ULTRA_LOW("ultra_low"),
    LOW("low"),
    MID("mid"),
    HIGH("high"),
    ULTRA_HIGH("ultra_high"),
    UNKNOWN("unknown");


    @NotNull
    private final String raw;
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: com.superwall.sdk.analytics.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Tier._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Tier.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Tier> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = 0 << 1;
    }

    Tier(String str) {
        this.raw = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i10 = 5 >> 0;
        return l0.a("com.superwall.sdk.analytics.Tier", values(), new String[]{"ULTRA_LOW", "LOW", "MID", "HIGH", "ULTRA_HIGH", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null}, null);
    }

    @NotNull
    public static kotlin.enums.a<Tier> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getRaw() {
        return this.raw;
    }
}

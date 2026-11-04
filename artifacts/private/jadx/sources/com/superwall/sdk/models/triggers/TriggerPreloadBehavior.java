package com.superwall.sdk.models.triggers;

import com.superwall.sdk.models.triggers.TriggerPreloadBehavior;
import java.lang.annotation.Annotation;
import kotlin.enums.a;
import kotlin.enums.c;
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
public enum TriggerPreloadBehavior {
    IF_TRUE("IF_TRUE"),
    ALWAYS("ALWAYS"),
    NEVER("NEVER");


    @NotNull
    private final String rawValue;
    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: bg.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TriggerPreloadBehavior._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TriggerPreloadBehavior.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<TriggerPreloadBehavior> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    TriggerPreloadBehavior(String str) {
        this.rawValue = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return l0.a("com.superwall.sdk.models.triggers.TriggerPreloadBehavior", values(), new String[]{"IF_TRUE", "ALWAYS", "NEVER"}, new Annotation[][]{null, null, null}, null);
    }

    @NotNull
    public static a<TriggerPreloadBehavior> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}

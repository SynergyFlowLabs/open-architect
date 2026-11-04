package com.superwall.sdk.models.paywall;

import com.superwall.sdk.models.paywall.PaywallPresentationStyle;
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
public enum PaywallPresentationStyle {
    MODAL("MODAL"),
    FULLSCREEN("FULLSCREEN"),
    FULLSCREEN_NO_ANIMATION("NO_ANIMATION"),
    PUSH("PUSH"),
    DRAWER("DRAWER"),
    NONE("NONE");


    @NotNull
    private final String rawValue;
    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: zf.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaywallPresentationStyle._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) PaywallPresentationStyle.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<PaywallPresentationStyle> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    PaywallPresentationStyle(String str) {
        this.rawValue = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return l0.a("com.superwall.sdk.models.paywall.PaywallPresentationStyle", values(), new String[]{"MODAL", "FULLSCREEN", "NO_ANIMATION", "PUSH", "DRAWER", "NONE"}, new Annotation[][]{null, null, null, null, null, null}, null);
    }

    @NotNull
    public static a<PaywallPresentationStyle> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}

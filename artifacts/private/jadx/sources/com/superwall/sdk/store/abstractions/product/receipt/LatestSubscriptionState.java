package com.superwall.sdk.store.abstractions.product.receipt;

import java.lang.annotation.Annotation;
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
public enum LatestSubscriptionState {
    GRACE_PERIOD,
    EXPIRED,
    SUBSCRIBED,
    UNKNOWN;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: com.superwall.sdk.store.abstractions.product.receipt.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LatestSubscriptionState._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) LatestSubscriptionState.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<LatestSubscriptionState> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i10 = 2 ^ 0;
        return l0.a("com.superwall.sdk.store.abstractions.product.receipt.LatestSubscriptionState", values(), new String[]{"GRACE_PERIOD", "EXPIRED", "SUBSCRIBED", "UNKNOWN"}, new Annotation[][]{null, null, null, null}, null);
    }

    @NotNull
    public static kotlin.enums.a<LatestSubscriptionState> getEntries() {
        return $ENTRIES;
    }
}

package com.superwall.sdk.paywall.presentation;

import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public abstract class PaywallCloseReason {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: com.superwall.sdk.paywall.presentation.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaywallCloseReason._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) PaywallCloseReason.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<PaywallCloseReason> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class ForNextPaywall extends PaywallCloseReason {

        @NotNull
        public static final ForNextPaywall INSTANCE = new ForNextPaywall();

        private ForNextPaywall() {
            super(null);
        }
    }

    public static final class ManualClose extends PaywallCloseReason {

        @NotNull
        public static final ManualClose INSTANCE = new ManualClose();

        private ManualClose() {
            super(null);
        }
    }

    public static final class None extends PaywallCloseReason {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public static final class SystemLogic extends PaywallCloseReason {

        @NotNull
        public static final SystemLogic INSTANCE = new SystemLogic();

        private SystemLogic() {
            super(null);
        }
    }

    public static final class WebViewFailedToLoad extends PaywallCloseReason {

        @NotNull
        public static final WebViewFailedToLoad INSTANCE = new WebViewFailedToLoad();

        private WebViewFailedToLoad() {
            super(null);
        }
    }

    public /* synthetic */ PaywallCloseReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("com.superwall.sdk.paywall.presentation.PaywallCloseReason", j1.d(PaywallCloseReason.class), new kotlin.reflect.d[0], new KSerializer[0], new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(PaywallCloseReason paywallCloseReason, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
    }

    public final boolean getStateShouldComplete() {
        return ((this instanceof ForNextPaywall) || Intrinsics.areEqual(this, None.INSTANCE)) ? false : true;
    }

    private PaywallCloseReason() {
    }

    public /* synthetic */ PaywallCloseReason(int i10, v2 v2Var) {
    }
}

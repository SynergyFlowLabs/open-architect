package com.superwall.sdk.paywall.presentation.internal;

import io.sentry.k4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PaywallPresentationRequestStatus {

    @NotNull
    private final String status;

    public static final class NoPresentation extends PaywallPresentationRequestStatus {

        @NotNull
        public static final NoPresentation INSTANCE = new NoPresentation();

        private NoPresentation() {
            super("no_presentation", null);
        }
    }

    public static final class Presentation extends PaywallPresentationRequestStatus {

        @NotNull
        public static final Presentation INSTANCE = new Presentation();

        private Presentation() {
            super("presentation", null);
        }
    }

    public static final class Timeout extends PaywallPresentationRequestStatus {

        @NotNull
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
            super(k4.f305718l3, null);
        }
    }

    public /* synthetic */ PaywallPresentationRequestStatus(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    private PaywallPresentationRequestStatus(String str) {
        this.status = str;
    }
}

package com.superwall.sdk.paywall.view.delegate;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PaywallLoadingState {

    public static final class LoadingPurchase extends PaywallLoadingState {
        public LoadingPurchase() {
            super(null);
        }
    }

    public static final class LoadingURL extends PaywallLoadingState {
        public LoadingURL() {
            super(null);
        }
    }

    public static final class ManualLoading extends PaywallLoadingState {
        public ManualLoading() {
            super(null);
        }
    }

    public static final class Ready extends PaywallLoadingState {
        public Ready() {
            super(null);
        }
    }

    public static final class Unknown extends PaywallLoadingState {
        public Unknown() {
            super(null);
        }
    }

    public /* synthetic */ PaywallLoadingState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaywallLoadingState() {
    }
}

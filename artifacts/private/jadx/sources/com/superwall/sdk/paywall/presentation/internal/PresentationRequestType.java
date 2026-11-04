package com.superwall.sdk.paywall.presentation.internal;

import com.facebook.internal.a;
import com.superwall.sdk.paywall.view.delegate.PaywallViewDelegateAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PresentationRequestType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean areEqual(@NotNull PresentationRequestType lhs, @NotNull PresentationRequestType rhs) {
            Intrinsics.checkNotNullParameter(lhs, "lhs");
            Intrinsics.checkNotNullParameter(rhs, "rhs");
            return ((lhs instanceof GetPaywall) && (rhs instanceof GetPaywall)) ? Intrinsics.areEqual(((GetPaywall) lhs).getAdapter(), ((GetPaywall) rhs).getAdapter()) : Intrinsics.areEqual(lhs, rhs);
        }

        private Companion() {
        }
    }

    public static final class ConfirmAllAssignments extends PresentationRequestType {

        @NotNull
        public static final ConfirmAllAssignments INSTANCE = new ConfirmAllAssignments();

        private ConfirmAllAssignments() {
            super(null);
        }
    }

    public static final class GetImplicitPresentationResult extends PresentationRequestType {

        @NotNull
        public static final GetImplicitPresentationResult INSTANCE = new GetImplicitPresentationResult();

        private GetImplicitPresentationResult() {
            super(null);
        }
    }

    public static final class GetPaywall extends PresentationRequestType {

        @NotNull
        private final PaywallViewDelegateAdapter adapter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPaywall(@NotNull PaywallViewDelegateAdapter adapter) {
            super(null);
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.adapter = adapter;
        }

        public static /* synthetic */ GetPaywall copy$default(GetPaywall getPaywall, PaywallViewDelegateAdapter paywallViewDelegateAdapter, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallViewDelegateAdapter = getPaywall.adapter;
            }
            return getPaywall.copy(paywallViewDelegateAdapter);
        }

        @NotNull
        public final PaywallViewDelegateAdapter component1() {
            return this.adapter;
        }

        @NotNull
        public final GetPaywall copy(@NotNull PaywallViewDelegateAdapter adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            return new GetPaywall(adapter);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetPaywall) && Intrinsics.areEqual(this.adapter, ((GetPaywall) obj).adapter);
        }

        @NotNull
        public final PaywallViewDelegateAdapter getAdapter() {
            return this.adapter;
        }

        public int hashCode() {
            return this.adapter.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetPaywall(adapter=" + this.adapter + ")";
        }
    }

    public static final class GetPresentationResult extends PresentationRequestType {

        @NotNull
        public static final GetPresentationResult INSTANCE = new GetPresentationResult();

        private GetPresentationResult() {
            super(null);
        }
    }

    public static final class Presentation extends PresentationRequestType {

        @NotNull
        public static final Presentation INSTANCE = new Presentation();

        private Presentation() {
            super(null);
        }
    }

    public /* synthetic */ PresentationRequestType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final String getDescription() {
        if (this instanceof Presentation) {
            return "presentation";
        }
        if (this instanceof GetPaywall) {
            return "getPaywallViewController";
        }
        if (this instanceof GetPresentationResult) {
            return "getPresentationResult";
        }
        if (this instanceof GetImplicitPresentationResult) {
            return "getImplicitPresentationResult";
        }
        return this instanceof ConfirmAllAssignments ? "confirmAllAssignments" : a.f99697t;
    }

    @Nullable
    public final PaywallViewDelegateAdapter getPaywallViewDelegateAdapter() {
        if (this instanceof GetPaywall) {
            return ((GetPaywall) this).getAdapter();
        }
        return null;
    }

    private PresentationRequestType() {
    }
}

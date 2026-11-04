package com.superwall.sdk.paywall.presentation.internal;

import android.app.Activity;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.paywall.presentation.internal.request.PaywallOverrides;
import com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.coroutines.flow.z0;
import net.openid.appauth.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PresentationRequest {

    @NotNull
    private Flags flags;

    @Nullable
    private PaywallOverrides paywallOverrides;

    @NotNull
    private final PresentationInfo presentationInfo;

    @Nullable
    private WeakReference<Activity> presenter;

    public static final class Flags {

        @NotNull
        private z0<? extends SubscriptionStatus> entitlements;
        private boolean isDebuggerLaunched;
        private boolean isPaywallPresented;

        @NotNull
        private PresentationRequestType type;

        public Flags(boolean z10, @NotNull z0<? extends SubscriptionStatus> entitlements, boolean z11, @NotNull PresentationRequestType type) {
            Intrinsics.checkNotNullParameter(entitlements, "entitlements");
            Intrinsics.checkNotNullParameter(type, "type");
            this.isDebuggerLaunched = z10;
            this.entitlements = entitlements;
            this.isPaywallPresented = z11;
            this.type = type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flags copy$default(Flags flags, boolean z10, z0 z0Var, boolean z11, PresentationRequestType presentationRequestType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = flags.isDebuggerLaunched;
            }
            if ((i10 & 2) != 0) {
                z0Var = flags.entitlements;
            }
            if ((i10 & 4) != 0) {
                z11 = flags.isPaywallPresented;
            }
            if ((i10 & 8) != 0) {
                presentationRequestType = flags.type;
            }
            return flags.copy(z10, z0Var, z11, presentationRequestType);
        }

        public final boolean component1() {
            return this.isDebuggerLaunched;
        }

        @NotNull
        public final z0<SubscriptionStatus> component2() {
            return this.entitlements;
        }

        public final boolean component3() {
            return this.isPaywallPresented;
        }

        @NotNull
        public final PresentationRequestType component4() {
            return this.type;
        }

        @NotNull
        public final Flags copy(boolean z10, @NotNull z0<? extends SubscriptionStatus> entitlements, boolean z11, @NotNull PresentationRequestType type) {
            Intrinsics.checkNotNullParameter(entitlements, "entitlements");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Flags(z10, entitlements, z11, type);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Flags)) {
                return false;
            }
            Flags flags = (Flags) obj;
            if (this.isDebuggerLaunched == flags.isDebuggerLaunched && Intrinsics.areEqual(this.entitlements, flags.entitlements) && this.isPaywallPresented == flags.isPaywallPresented && Intrinsics.areEqual(this.type, flags.type)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final z0<SubscriptionStatus> getEntitlements() {
            return this.entitlements;
        }

        @NotNull
        public final PresentationRequestType getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isDebuggerLaunched) * 31) + this.entitlements.hashCode()) * 31) + Boolean.hashCode(this.isPaywallPresented)) * 31) + this.type.hashCode();
        }

        public final boolean isDebuggerLaunched() {
            return this.isDebuggerLaunched;
        }

        public final boolean isPaywallPresented() {
            return this.isPaywallPresented;
        }

        public final void setDebuggerLaunched(boolean z10) {
            this.isDebuggerLaunched = z10;
        }

        public final void setEntitlements(@NotNull z0<? extends SubscriptionStatus> z0Var) {
            Intrinsics.checkNotNullParameter(z0Var, "<set-?>");
            this.entitlements = z0Var;
        }

        public final void setPaywallPresented(boolean z10) {
            this.isPaywallPresented = z10;
        }

        public final void setType(@NotNull PresentationRequestType presentationRequestType) {
            Intrinsics.checkNotNullParameter(presentationRequestType, "<set-?>");
            this.type = presentationRequestType;
        }

        @NotNull
        public String toString() {
            return "Flags(isDebuggerLaunched=" + this.isDebuggerLaunched + ", entitlements=" + this.entitlements + ", isPaywallPresented=" + this.isPaywallPresented + ", type=" + this.type + ")";
        }
    }

    public PresentationRequest(@NotNull PresentationInfo presentationInfo, @Nullable WeakReference<Activity> weakReference, @Nullable PaywallOverrides paywallOverrides, @NotNull Flags flags) {
        Intrinsics.checkNotNullParameter(presentationInfo, "presentationInfo");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.presentationInfo = presentationInfo;
        this.presenter = weakReference;
        this.paywallOverrides = paywallOverrides;
        this.flags = flags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PresentationRequest copy$default(PresentationRequest presentationRequest, PresentationInfo presentationInfo, WeakReference weakReference, PaywallOverrides paywallOverrides, Flags flags, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            presentationInfo = presentationRequest.presentationInfo;
        }
        if ((i10 & 2) != 0) {
            weakReference = presentationRequest.presenter;
        }
        if ((i10 & 4) != 0) {
            paywallOverrides = presentationRequest.paywallOverrides;
        }
        if ((i10 & 8) != 0) {
            flags = presentationRequest.flags;
        }
        return presentationRequest.copy(presentationInfo, weakReference, paywallOverrides, flags);
    }

    @NotNull
    public final PresentationInfo component1() {
        return this.presentationInfo;
    }

    @Nullable
    public final WeakReference<Activity> component2() {
        return this.presenter;
    }

    @Nullable
    public final PaywallOverrides component3() {
        return this.paywallOverrides;
    }

    @NotNull
    public final Flags component4() {
        return this.flags;
    }

    @NotNull
    public final PresentationRequest copy(@NotNull PresentationInfo presentationInfo, @Nullable WeakReference<Activity> weakReference, @Nullable PaywallOverrides paywallOverrides, @NotNull Flags flags) {
        Intrinsics.checkNotNullParameter(presentationInfo, "presentationInfo");
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new PresentationRequest(presentationInfo, weakReference, paywallOverrides, flags);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentationRequest)) {
            return false;
        }
        PresentationRequest presentationRequest = (PresentationRequest) obj;
        return Intrinsics.areEqual(this.presentationInfo, presentationRequest.presentationInfo) && Intrinsics.areEqual(this.presenter, presentationRequest.presenter) && Intrinsics.areEqual(this.paywallOverrides, presentationRequest.paywallOverrides) && Intrinsics.areEqual(this.flags, presentationRequest.flags);
    }

    @NotNull
    public final Flags getFlags() {
        return this.flags;
    }

    @Nullable
    public final PaywallOverrides getPaywallOverrides() {
        return this.paywallOverrides;
    }

    @NotNull
    public final PresentationInfo getPresentationInfo() {
        return this.presentationInfo;
    }

    @Nullable
    public final String getPresentationSourceType() {
        PresentationInfo presentationInfo = this.presentationInfo;
        if (presentationInfo instanceof PresentationInfo.ImplicitTrigger) {
            return q.f333117b;
        }
        if (!(presentationInfo instanceof PresentationInfo.ExplicitTrigger) && !(presentationInfo instanceof PresentationInfo.FromIdentifier)) {
            throw new k0();
        }
        PresentationRequestType type = this.flags.getType();
        if (type instanceof PresentationRequestType.GetPaywall) {
            return "getPaywall";
        }
        if (type instanceof PresentationRequestType.Presentation) {
            return "register";
        }
        return null;
    }

    @Nullable
    public final WeakReference<Activity> getPresenter() {
        return this.presenter;
    }

    public int hashCode() {
        int iHashCode = this.presentationInfo.hashCode() * 31;
        WeakReference<Activity> weakReference = this.presenter;
        int iHashCode2 = (iHashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        PaywallOverrides paywallOverrides = this.paywallOverrides;
        return ((iHashCode2 + (paywallOverrides != null ? paywallOverrides.hashCode() : 0)) * 31) + this.flags.hashCode();
    }

    public final void setFlags(@NotNull Flags flags) {
        Intrinsics.checkNotNullParameter(flags, "<set-?>");
        this.flags = flags;
    }

    public final void setPaywallOverrides(@Nullable PaywallOverrides paywallOverrides) {
        this.paywallOverrides = paywallOverrides;
    }

    public final void setPresenter(@Nullable WeakReference<Activity> weakReference) {
        this.presenter = weakReference;
    }

    @NotNull
    public String toString() {
        return "PresentationRequest(presentationInfo=" + this.presentationInfo + ", presenter=" + this.presenter + ", paywallOverrides=" + this.paywallOverrides + ", flags=" + this.flags + ")";
    }

    public /* synthetic */ PresentationRequest(PresentationInfo presentationInfo, WeakReference weakReference, PaywallOverrides paywallOverrides, Flags flags, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(presentationInfo, (i10 & 2) != 0 ? null : weakReference, (i10 & 4) != 0 ? null : paywallOverrides, flags);
    }
}

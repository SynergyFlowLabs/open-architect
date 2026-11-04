package com.superwall.sdk.models.internal;

import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.entitlements.Entitlement$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class RedemptionInfo {

    @NotNull
    private final List<Entitlement> entitlements;

    @NotNull
    private final RedemptionOwnership ownership;

    @Nullable
    private final RedemptionResult.PaywallInfo paywallInfo;

    @NotNull
    private final PurchaserInfo purchaserInfo;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {RedemptionOwnership.Companion.serializer(), null, null, new kotlinx.serialization.internal.f(Entitlement$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RedemptionInfo> serializer() {
            return RedemptionInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RedemptionInfo(int i10, RedemptionOwnership redemptionOwnership, PurchaserInfo purchaserInfo, RedemptionResult.PaywallInfo paywallInfo, List list, v2 v2Var) {
        if (11 != (i10 & 11)) {
            g2.b(i10, 11, RedemptionInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.ownership = redemptionOwnership;
        this.purchaserInfo = purchaserInfo;
        if ((i10 & 4) == 0) {
            this.paywallInfo = null;
        } else {
            this.paywallInfo = paywallInfo;
        }
        this.entitlements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RedemptionInfo copy$default(RedemptionInfo redemptionInfo, RedemptionOwnership redemptionOwnership, PurchaserInfo purchaserInfo, RedemptionResult.PaywallInfo paywallInfo, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            redemptionOwnership = redemptionInfo.ownership;
        }
        if ((i10 & 2) != 0) {
            purchaserInfo = redemptionInfo.purchaserInfo;
        }
        if ((i10 & 4) != 0) {
            paywallInfo = redemptionInfo.paywallInfo;
        }
        if ((i10 & 8) != 0) {
            list = redemptionInfo.entitlements;
        }
        return redemptionInfo.copy(redemptionOwnership, purchaserInfo, paywallInfo, list);
    }

    @a0("entitlements")
    public static /* synthetic */ void getEntitlements$annotations() {
    }

    @a0("ownership")
    public static /* synthetic */ void getOwnership$annotations() {
    }

    @a0("paywallInfo")
    public static /* synthetic */ void getPaywallInfo$annotations() {
    }

    @a0("purchaserInfo")
    public static /* synthetic */ void getPurchaserInfo$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(RedemptionInfo redemptionInfo, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], redemptionInfo.ownership);
        eVar.encodeSerializableElement(serialDescriptor, 1, PurchaserInfo$$serializer.INSTANCE, redemptionInfo.purchaserInfo);
        int i10 = 7 >> 2;
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || redemptionInfo.paywallInfo != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 2, RedemptionResult$PaywallInfo$$serializer.INSTANCE, redemptionInfo.paywallInfo);
        }
        eVar.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], redemptionInfo.entitlements);
    }

    @NotNull
    public final RedemptionOwnership component1() {
        return this.ownership;
    }

    @NotNull
    public final PurchaserInfo component2() {
        return this.purchaserInfo;
    }

    @Nullable
    public final RedemptionResult.PaywallInfo component3() {
        return this.paywallInfo;
    }

    @NotNull
    public final List<Entitlement> component4() {
        return this.entitlements;
    }

    @NotNull
    public final RedemptionInfo copy(@NotNull RedemptionOwnership ownership, @NotNull PurchaserInfo purchaserInfo, @Nullable RedemptionResult.PaywallInfo paywallInfo, @NotNull List<Entitlement> entitlements) {
        Intrinsics.checkNotNullParameter(ownership, "ownership");
        Intrinsics.checkNotNullParameter(purchaserInfo, "purchaserInfo");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        return new RedemptionInfo(ownership, purchaserInfo, paywallInfo, entitlements);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedemptionInfo)) {
            return false;
        }
        RedemptionInfo redemptionInfo = (RedemptionInfo) obj;
        return Intrinsics.areEqual(this.ownership, redemptionInfo.ownership) && Intrinsics.areEqual(this.purchaserInfo, redemptionInfo.purchaserInfo) && Intrinsics.areEqual(this.paywallInfo, redemptionInfo.paywallInfo) && Intrinsics.areEqual(this.entitlements, redemptionInfo.entitlements);
    }

    @NotNull
    public final List<Entitlement> getEntitlements() {
        return this.entitlements;
    }

    @NotNull
    public final RedemptionOwnership getOwnership() {
        return this.ownership;
    }

    @Nullable
    public final RedemptionResult.PaywallInfo getPaywallInfo() {
        return this.paywallInfo;
    }

    @NotNull
    public final PurchaserInfo getPurchaserInfo() {
        return this.purchaserInfo;
    }

    public int hashCode() {
        int iHashCode = ((this.ownership.hashCode() * 31) + this.purchaserInfo.hashCode()) * 31;
        RedemptionResult.PaywallInfo paywallInfo = this.paywallInfo;
        return ((iHashCode + (paywallInfo == null ? 0 : paywallInfo.hashCode())) * 31) + this.entitlements.hashCode();
    }

    @NotNull
    public String toString() {
        return "RedemptionInfo(ownership=" + this.ownership + ", purchaserInfo=" + this.purchaserInfo + ", paywallInfo=" + this.paywallInfo + ", entitlements=" + this.entitlements + ")";
    }

    public RedemptionInfo(@NotNull RedemptionOwnership ownership, @NotNull PurchaserInfo purchaserInfo, @Nullable RedemptionResult.PaywallInfo paywallInfo, @NotNull List<Entitlement> entitlements) {
        Intrinsics.checkNotNullParameter(ownership, "ownership");
        Intrinsics.checkNotNullParameter(purchaserInfo, "purchaserInfo");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        this.ownership = ownership;
        this.purchaserInfo = purchaserInfo;
        this.paywallInfo = paywallInfo;
        this.entitlements = entitlements;
    }

    public /* synthetic */ RedemptionInfo(RedemptionOwnership redemptionOwnership, PurchaserInfo purchaserInfo, RedemptionResult.PaywallInfo paywallInfo, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(redemptionOwnership, purchaserInfo, (i10 & 4) != 0 ? null : paywallInfo, list);
    }
}

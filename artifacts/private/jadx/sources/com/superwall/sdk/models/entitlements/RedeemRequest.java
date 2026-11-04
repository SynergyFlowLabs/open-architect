package com.superwall.sdk.models.entitlements;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class RedeemRequest {

    @Nullable
    private final String aliasId;

    @NotNull
    private final List<Redeemable> codes;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String externalAccountId;

    @NotNull
    private final List<TransactionReceipt> receipts;

    @Nullable
    private final String userId;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new kotlinx.serialization.internal.f(Redeemable$$serializer.INSTANCE), new kotlinx.serialization.internal.f(TransactionReceipt$$serializer.INSTANCE), null};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RedeemRequest> serializer() {
            return RedeemRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RedeemRequest(int i10, String str, String str2, String str3, List list, List list2, String str4, v2 v2Var) {
        if (59 != (i10 & 59)) {
            g2.b(i10, 59, RedeemRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.deviceId = str;
        this.userId = str2;
        if ((i10 & 4) == 0) {
            this.aliasId = null;
        } else {
            this.aliasId = str3;
        }
        this.codes = list;
        this.receipts = list2;
        this.externalAccountId = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RedeemRequest copy$default(RedeemRequest redeemRequest, String str, String str2, String str3, List list, List list2, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = redeemRequest.deviceId;
        }
        if ((i10 & 2) != 0) {
            str2 = redeemRequest.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = redeemRequest.aliasId;
        }
        if ((i10 & 8) != 0) {
            list = redeemRequest.codes;
        }
        if ((i10 & 16) != 0) {
            list2 = redeemRequest.receipts;
        }
        if ((i10 & 32) != 0) {
            str4 = redeemRequest.externalAccountId;
        }
        List list3 = list2;
        String str5 = str4;
        return redeemRequest.copy(str, str2, str3, list, list3, str5);
    }

    @a0("aliasId")
    public static /* synthetic */ void getAliasId$annotations() {
    }

    @a0("codes")
    public static /* synthetic */ void getCodes$annotations() {
    }

    @a0("deviceId")
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @a0("externalAccountId")
    public static /* synthetic */ void getExternalAccountId$annotations() {
    }

    @a0("receipts")
    public static /* synthetic */ void getReceipts$annotations() {
    }

    @a0("appUserId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(RedeemRequest redeemRequest, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, redeemRequest.deviceId);
        b3 b3Var = b3.f315897a;
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, b3Var, redeemRequest.userId);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || redeemRequest.aliasId != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 2, b3Var, redeemRequest.aliasId);
        }
        eVar.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], redeemRequest.codes);
        eVar.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], redeemRequest.receipts);
        eVar.encodeStringElement(serialDescriptor, 5, redeemRequest.externalAccountId);
    }

    @NotNull
    public final String component1() {
        return this.deviceId;
    }

    @Nullable
    public final String component2() {
        return this.userId;
    }

    @Nullable
    public final String component3() {
        return this.aliasId;
    }

    @NotNull
    public final List<Redeemable> component4() {
        return this.codes;
    }

    @NotNull
    public final List<TransactionReceipt> component5() {
        return this.receipts;
    }

    @NotNull
    public final String component6() {
        return this.externalAccountId;
    }

    @NotNull
    public final RedeemRequest copy(@NotNull String deviceId, @Nullable String str, @Nullable String str2, @NotNull List<Redeemable> codes, @NotNull List<TransactionReceipt> receipts, @NotNull String externalAccountId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(codes, "codes");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        Intrinsics.checkNotNullParameter(externalAccountId, "externalAccountId");
        return new RedeemRequest(deviceId, str, str2, codes, receipts, externalAccountId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedeemRequest)) {
            return false;
        }
        RedeemRequest redeemRequest = (RedeemRequest) obj;
        if (Intrinsics.areEqual(this.deviceId, redeemRequest.deviceId) && Intrinsics.areEqual(this.userId, redeemRequest.userId) && Intrinsics.areEqual(this.aliasId, redeemRequest.aliasId) && Intrinsics.areEqual(this.codes, redeemRequest.codes) && Intrinsics.areEqual(this.receipts, redeemRequest.receipts) && Intrinsics.areEqual(this.externalAccountId, redeemRequest.externalAccountId)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getAliasId() {
        return this.aliasId;
    }

    @NotNull
    public final List<Redeemable> getCodes() {
        return this.codes;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    @NotNull
    public final List<TransactionReceipt> getReceipts() {
        return this.receipts;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.deviceId.hashCode() * 31;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.aliasId;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.codes.hashCode()) * 31) + this.receipts.hashCode()) * 31) + this.externalAccountId.hashCode();
    }

    @NotNull
    public String toString() {
        return "RedeemRequest(deviceId=" + this.deviceId + ", userId=" + this.userId + ", aliasId=" + this.aliasId + ", codes=" + this.codes + ", receipts=" + this.receipts + ", externalAccountId=" + this.externalAccountId + ")";
    }

    public RedeemRequest(@NotNull String deviceId, @Nullable String str, @Nullable String str2, @NotNull List<Redeemable> codes, @NotNull List<TransactionReceipt> receipts, @NotNull String externalAccountId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(codes, "codes");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        Intrinsics.checkNotNullParameter(externalAccountId, "externalAccountId");
        this.deviceId = deviceId;
        this.userId = str;
        this.aliasId = str2;
        this.codes = codes;
        this.receipts = receipts;
        this.externalAccountId = externalAccountId;
    }

    public /* synthetic */ RedeemRequest(String str, String str2, String str3, List list, List list2, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, list, list2, str4);
    }
}

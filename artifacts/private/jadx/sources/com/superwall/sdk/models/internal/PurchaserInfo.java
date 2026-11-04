package com.superwall.sdk.models.internal;

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
public final class PurchaserInfo {

    @NotNull
    private final String appUserId;

    @Nullable
    private final String email;

    @NotNull
    private final StoreIdentifiers storeIdentifiers;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, StoreIdentifiers.Companion.serializer()};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PurchaserInfo> serializer() {
            return PurchaserInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PurchaserInfo(int i10, String str, String str2, StoreIdentifiers storeIdentifiers, v2 v2Var) {
        if (5 != (i10 & 5)) {
            g2.b(i10, 5, PurchaserInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.appUserId = str;
        if ((i10 & 2) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        this.storeIdentifiers = storeIdentifiers;
    }

    public static /* synthetic */ PurchaserInfo copy$default(PurchaserInfo purchaserInfo, String str, String str2, StoreIdentifiers storeIdentifiers, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = purchaserInfo.appUserId;
        }
        if ((i10 & 2) != 0) {
            str2 = purchaserInfo.email;
        }
        if ((i10 & 4) != 0) {
            storeIdentifiers = purchaserInfo.storeIdentifiers;
        }
        return purchaserInfo.copy(str, str2, storeIdentifiers);
    }

    @a0("appUserId")
    public static /* synthetic */ void getAppUserId$annotations() {
    }

    @a0("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @a0("storeIdentifiers")
    public static /* synthetic */ void getStoreIdentifiers$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(PurchaserInfo purchaserInfo, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, purchaserInfo.appUserId);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || purchaserInfo.email != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, purchaserInfo.email);
        }
        eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], purchaserInfo.storeIdentifiers);
    }

    @NotNull
    public final String component1() {
        return this.appUserId;
    }

    @Nullable
    public final String component2() {
        return this.email;
    }

    @NotNull
    public final StoreIdentifiers component3() {
        return this.storeIdentifiers;
    }

    @NotNull
    public final PurchaserInfo copy(@NotNull String appUserId, @Nullable String str, @NotNull StoreIdentifiers storeIdentifiers) {
        Intrinsics.checkNotNullParameter(appUserId, "appUserId");
        Intrinsics.checkNotNullParameter(storeIdentifiers, "storeIdentifiers");
        return new PurchaserInfo(appUserId, str, storeIdentifiers);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaserInfo)) {
            return false;
        }
        PurchaserInfo purchaserInfo = (PurchaserInfo) obj;
        return Intrinsics.areEqual(this.appUserId, purchaserInfo.appUserId) && Intrinsics.areEqual(this.email, purchaserInfo.email) && Intrinsics.areEqual(this.storeIdentifiers, purchaserInfo.storeIdentifiers);
    }

    @NotNull
    public final String getAppUserId() {
        return this.appUserId;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final StoreIdentifiers getStoreIdentifiers() {
        return this.storeIdentifiers;
    }

    public int hashCode() {
        int iHashCode = this.appUserId.hashCode() * 31;
        String str = this.email;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.storeIdentifiers.hashCode();
    }

    @NotNull
    public String toString() {
        return "PurchaserInfo(appUserId=" + this.appUserId + ", email=" + this.email + ", storeIdentifiers=" + this.storeIdentifiers + ")";
    }

    public PurchaserInfo(@NotNull String appUserId, @Nullable String str, @NotNull StoreIdentifiers storeIdentifiers) {
        Intrinsics.checkNotNullParameter(appUserId, "appUserId");
        Intrinsics.checkNotNullParameter(storeIdentifiers, "storeIdentifiers");
        this.appUserId = appUserId;
        this.email = str;
        this.storeIdentifiers = storeIdentifiers;
    }

    public /* synthetic */ PurchaserInfo(String str, String str2, StoreIdentifiers storeIdentifiers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, storeIdentifiers);
    }
}

package com.devtodev.analytics.internal.modues.anticheat;

import com.devtodev.analytics.internal.logger.Logger;
import h4.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Receipt {

    @NotNull
    private final String platform;

    @NotNull
    private final String publicKey;

    @NotNull
    private final String receipt;

    @NotNull
    private final String signature;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Receipt() {
        this(null, null, null, null, 15, null);
        int i10 = 2 >> 0;
    }

    public static /* synthetic */ Receipt copy$default(Receipt receipt, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = receipt.receipt;
        }
        if ((i10 & 2) != 0) {
            str2 = receipt.signature;
        }
        if ((i10 & 4) != 0) {
            str3 = receipt.publicKey;
        }
        if ((i10 & 8) != 0) {
            str4 = receipt.platform;
        }
        return receipt.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.receipt;
    }

    @NotNull
    public final String component2() {
        return this.signature;
    }

    @NotNull
    public final String component3() {
        return this.publicKey;
    }

    @NotNull
    public final String component4() {
        return this.platform;
    }

    @NotNull
    public final Receipt copy(@NotNull String receipt, @NotNull String signature, @NotNull String publicKey, @NotNull String platform) {
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new Receipt(receipt, signature, publicKey, platform);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Receipt)) {
            return false;
        }
        Receipt receipt = (Receipt) obj;
        return Intrinsics.areEqual(this.receipt, receipt.receipt) && Intrinsics.areEqual(this.signature, receipt.signature) && Intrinsics.areEqual(this.publicKey, receipt.publicKey) && Intrinsics.areEqual(this.platform, receipt.platform);
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final String getReceipt() {
        return this.receipt;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.platform.hashCode() + b.a(this.publicKey, b.a(this.signature, this.receipt.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("receipt", this.receipt);
            jSONObject.put("sig", this.signature);
            jSONObject.put("key", this.publicKey);
            jSONObject.put("platform", this.platform);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
            return string;
        } catch (JSONException e10) {
            Logger.INSTANCE.error("", e10);
            return "";
        }
    }

    @NotNull
    public String toString() {
        return "Receipt(receipt=" + this.receipt + ", signature=" + this.signature + ", publicKey=" + this.publicKey + ", platform=" + this.platform + ")";
    }

    public Receipt(@NotNull String receipt, @NotNull String signature, @NotNull String publicKey, @NotNull String platform) {
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.receipt = receipt;
        this.signature = signature;
        this.publicKey = publicKey;
        this.platform = platform;
    }

    public /* synthetic */ Receipt(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "android" : str4);
    }
}

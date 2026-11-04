package com.superwall.sdk.models.entitlements;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class TransactionReceipt {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String purchaseToken;

    @NotNull
    private final String type;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<TransactionReceipt> serializer() {
            return TransactionReceipt$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TransactionReceipt(int i10, String str, String str2, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, TransactionReceipt$$serializer.INSTANCE.getDescriptor());
        }
        this.purchaseToken = str;
        if ((i10 & 2) == 0) {
            this.type = "Android";
        } else {
            this.type = str2;
        }
    }

    public static /* synthetic */ TransactionReceipt copy$default(TransactionReceipt transactionReceipt, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transactionReceipt.purchaseToken;
        }
        return transactionReceipt.copy(str);
    }

    @a0("jwsRepresentation")
    public static /* synthetic */ void getPurchaseToken$annotations() {
    }

    @a0("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(TransactionReceipt transactionReceipt, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, transactionReceipt.purchaseToken);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.areEqual(transactionReceipt.type, "Android")) {
            eVar.encodeStringElement(serialDescriptor, 1, transactionReceipt.type);
        }
    }

    @NotNull
    public final String component1() {
        return this.purchaseToken;
    }

    @NotNull
    public final TransactionReceipt copy(@NotNull String purchaseToken) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new TransactionReceipt(purchaseToken);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransactionReceipt) && Intrinsics.areEqual(this.purchaseToken, ((TransactionReceipt) obj).purchaseToken);
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.purchaseToken.hashCode();
    }

    @NotNull
    public String toString() {
        return "TransactionReceipt(purchaseToken=" + this.purchaseToken + ")";
    }

    public TransactionReceipt(@NotNull String purchaseToken) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.purchaseToken = purchaseToken;
        this.type = "Android";
    }
}

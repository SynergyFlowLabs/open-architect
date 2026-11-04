package com.devtodev.analytics.external.anticheat;

import com.devtodev.analytics.internal.core.Core;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDAntiCheat {

    @NotNull
    public static final DTDAntiCheat INSTANCE = new DTDAntiCheat();

    public final void verifyPayment(@NotNull String receipt, @NotNull String signature, @NotNull String publicKey, @NotNull Function1<? super DTDVerifyResponse, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        Core.INSTANCE.getAntiCheatProxy().verifyPaymentWithCompletion(receipt, signature, publicKey, completionHandler);
    }
}

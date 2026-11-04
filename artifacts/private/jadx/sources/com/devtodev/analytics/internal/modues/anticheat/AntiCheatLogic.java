package com.devtodev.analytics.internal.modues.anticheat;

import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import com.devtodev.analytics.internal.core.IServicesFactory;
import com.devtodev.analytics.internal.services.IAntiCheatService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AntiCheatLogic implements IAntiCheatLogic {

    @NotNull
    private IAntiCheatService antiCheatService;

    public AntiCheatLogic(@NotNull IServicesFactory serviceFactory) {
        Intrinsics.checkNotNullParameter(serviceFactory, "serviceFactory");
        this.antiCheatService = serviceFactory.getAntiCheatService();
    }

    @Override // com.devtodev.analytics.internal.modues.anticheat.IAntiCheatLogic
    public void verifyPaymentWithCompletion(@NotNull Receipt receipt, @NotNull Function1<? super DTDVerifyResponse, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        completionHandler.invoke(this.antiCheatService.receiveReceiptStatus(receipt));
    }
}

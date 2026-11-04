package com.devtodev.analytics.internal.modues.anticheat;

import com.devtodev.analytics.external.anticheat.DTDReceiptStatus;
import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.queue.QueueManager;
import com.devtodev.analytics.internal.validator.Validator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AntiCheatProxy implements IAntiCheatProxy {

    @Nullable
    private IAntiCheatLogic antiCheatLogic;

    @NotNull
    private final String method = "AntiCheat";

    @NotNull
    private final String receiptArg = "The receipt name argument value";

    @NotNull
    private final String signatureArg = "The signature name argument value";

    @NotNull
    private final String publicKeyArg = "The publicKey name argument value";

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.anticheat.AntiCheatProxy$verifyPaymentWithCompletion$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<DTDVerifyResponse, Unit> $completionHandler;
        final /* synthetic */ String $publicKey;
        final /* synthetic */ String $receipt;
        final /* synthetic */ String $signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super DTDVerifyResponse, Unit> function1, String str, String str2, String str3) {
            super(0);
            this.$completionHandler = function1;
            this.$receipt = str;
            this.$signature = str2;
            this.$publicKey = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (AntiCheatProxy.this.antiCheatLogic == null) {
                int i10 = 7 & 2;
                Logger.error$default(Logger.INSTANCE, "In the verifyPayment method an error has occurred: The SDK is not initialized yet!", null, 2, null);
                this.$completionHandler.invoke(new DTDVerifyResponse(DTDReceiptStatus.ReceiptInternalError, null));
                return;
            }
            Validator validator = Validator.INSTANCE;
            boolean z10 = validator.notNullOrEmpty(AntiCheatProxy.this.method, AntiCheatProxy.this.signatureArg, this.$signature) && validator.notNullOrEmpty(AntiCheatProxy.this.method, AntiCheatProxy.this.receiptArg, this.$receipt);
            if (!validator.notNullOrEmpty(AntiCheatProxy.this.method, AntiCheatProxy.this.publicKeyArg, this.$publicKey) || !z10) {
                new DTDVerifyResponse(DTDReceiptStatus.ReceiptNotValid, null);
                return;
            }
            Receipt receipt = new Receipt(this.$receipt, this.$signature, this.$publicKey, null, 8, null);
            IAntiCheatLogic iAntiCheatLogic = AntiCheatProxy.this.antiCheatLogic;
            if (iAntiCheatLogic != null) {
                iAntiCheatLogic.verifyPaymentWithCompletion(receipt, this.$completionHandler);
            }
        }
    }

    @Override // com.devtodev.analytics.internal.modues.anticheat.IAntiCheatProxy
    public void initialize(@NotNull IAntiCheatLogic antiCheatLogic) {
        Intrinsics.checkNotNullParameter(antiCheatLogic, "antiCheatLogic");
        this.antiCheatLogic = antiCheatLogic;
    }

    @Override // com.devtodev.analytics.internal.modues.anticheat.IAntiCheatProxy
    public void verifyPaymentWithCompletion(@NotNull String receipt, @NotNull String signature, @NotNull String publicKey, @NotNull Function1<? super DTDVerifyResponse, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        QueueManager.Companion.runAntiCheatQueue(new AnonymousClass1(completionHandler, receipt, signature, publicKey));
    }
}

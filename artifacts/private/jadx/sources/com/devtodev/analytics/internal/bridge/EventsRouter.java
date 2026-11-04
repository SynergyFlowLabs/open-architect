package com.devtodev.analytics.internal.bridge;

import com.devtodev.analytics.external.DTDLogLevel;
import com.devtodev.analytics.internal.core.Core;
import com.devtodev.analytics.internal.logger.Logger;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class EventsRouter {

    @NotNull
    public static final EventsRouter INSTANCE = new EventsRouter();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DTDLogLevel.values().length];
            try {
                iArr[DTDLogLevel.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DTDLogLevel.Info.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DTDLogLevel.Warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DTDLogLevel.Debug.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private EventsRouter() {
    }

    public final void autoPayment(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String purchaseToken, @NotNull String currencyCode, int i10) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Core.INSTANCE.getPurchasesProxy().autoPayment(orderId, d10, productId, purchaseToken, currencyCode, i10);
    }

    public final void doNotRestoreUser() {
        Core.INSTANCE.getPurchasesProxy().autoPurchaseIsInitialized();
    }

    public final boolean isInit() {
        return Core.INSTANCE.isInitialized();
    }

    public final void isNeedRestoreHistory(@NotNull Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Core.INSTANCE.getPurchasesProxy().isNeedRestoreHistory(callBack);
    }

    public final void sendLog(@NotNull DTDLogLevel logLevel, @NotNull String text, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(text, "text");
        int i10 = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i10 == 1) {
            Logger.INSTANCE.error(text, th2);
            return;
        }
        if (i10 == 2) {
            Logger.INSTANCE.info(text, th2);
        } else if (i10 == 3) {
            Logger.INSTANCE.warning(text, th2);
        } else {
            if (i10 != 4) {
                return;
            }
            Logger.INSTANCE.debug(text, th2);
        }
    }

    public final void sendPushOpened(long j10, int i10, @Nullable String str) {
        Core.INSTANCE.getMessagingProxy().pushOpened(j10, i10, str);
    }

    public final void sendPushReceived(long j10, int i10) {
        Core.INSTANCE.getMessagingProxy().pushReceive(j10, i10);
    }

    public final void sendPushToken(@NotNull String token, boolean z10) {
        Intrinsics.checkNotNullParameter(token, "token");
        Core.INSTANCE.getMessagingProxy().pushToken(token, z10);
    }

    public final void subscriptionHistory(@NotNull List<String> purchaseList) {
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        Core.INSTANCE.getPurchasesProxy().subscriptionHistory(purchaseList);
    }
}

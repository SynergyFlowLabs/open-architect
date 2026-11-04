package com.devtodev.analytics.internal.platform.gateway;

import com.devtodev.analytics.internal.platform.GoogleAdvertisingIdResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformGateway$googleAdvertisingIdResult$2 extends l0 implements Function0<GoogleAdvertisingIdResult> {
    final /* synthetic */ PlatformGateway this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformGateway$googleAdvertisingIdResult$2(PlatformGateway platformGateway) {
        super(0);
        this.this$0 = platformGateway;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final GoogleAdvertisingIdResult invoke() {
        return this.this$0.repositoryDI.getGoogleApiRepository$DTDAnalytics_androidRelease().getAdvertisingId();
    }
}

package com.devtodev.analytics.internal.platform.gateway;

import com.devtodev.analytics.internal.platform.DeviceResolution;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformGateway$deviceResolution$2 extends l0 implements Function0<DeviceResolution> {
    final /* synthetic */ PlatformGateway this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformGateway$deviceResolution$2(PlatformGateway platformGateway) {
        super(0);
        this.this$0 = platformGateway;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DeviceResolution invoke() {
        return new DeviceResolution(this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getScreenDPI(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getScreenInches(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getScreenResolution());
    }
}

package com.devtodev.analytics.internal.platform.gateway;

import com.devtodev.analytics.internal.platform.DeviceConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformGateway$deviceConstants$2 extends l0 implements Function0<DeviceConstants> {
    final /* synthetic */ PlatformGateway this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformGateway$deviceConstants$2(PlatformGateway platformGateway) {
        super(0);
        this.this$0 = platformGateway;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DeviceConstants invoke() {
        return new DeviceConstants(this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getAndroidId(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getDeviceVersionKey(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getDevtodevUDID(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().isRooted(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getLanguage(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getMacAddress(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getManufacturer(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getModel(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getODIN(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getOsKey(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getTimezoneOffset(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getUserAgent(), this.this$0.repositoryDI.getDeviceRepository$DTDAnalytics_androidRelease().getDeviceType());
    }
}

package com.devtodev.analytics.internal.platform.gateway;

import com.devtodev.analytics.internal.platform.ApplicationData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformGateway$applicationData$2 extends l0 implements Function0<ApplicationData> {
    final /* synthetic */ PlatformGateway this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformGateway$applicationData$2(PlatformGateway platformGateway) {
        super(0);
        this.this$0 = platformGateway;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ApplicationData invoke() {
        return new ApplicationData(this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_androidRelease().getVersionName(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_androidRelease().getPackageName(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_androidRelease().getVersionCode(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_androidRelease().getInstallSourceLocation(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_androidRelease().getSdkVersionName(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_androidRelease().getSdkVersionCode(), this.this$0.repositoryDI.getApplicationRepository$DTDAnalytics_androidRelease().getPlatformEngine());
    }
}

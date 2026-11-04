package com.devtodev.analytics.internal.platform;

import com.devtodev.analytics.internal.platform.gateway.PlatformGateway;
import com.devtodev.analytics.internal.platform.repository.RepositoryDI;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Platform$platformGateway$2 extends l0 implements Function0<PlatformGateway> {
    final /* synthetic */ Platform this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Platform$platformGateway$2(Platform platform) {
        super(0);
        this.this$0 = platform;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final PlatformGateway invoke() {
        return new PlatformGateway(new RepositoryDI(this.this$0.getContext()));
    }
}

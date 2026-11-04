package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.platform.Platform;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CoreFactory$platform$2 extends l0 implements Function0<Platform> {
    final /* synthetic */ CoreFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFactory$platform$2(CoreFactory coreFactory) {
        super(0);
        this.this$0 = coreFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Platform invoke() {
        return new Platform(this.this$0.context);
    }
}

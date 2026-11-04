package com.devtodev.analytics.internal.core;

import android.app.Application;
import android.content.Context;
import com.devtodev.analytics.internal.lifecycle.LifecycleRepository;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CoreFactory$lifeCycle$2 extends l0 implements Function0<LifecycleRepository> {
    final /* synthetic */ CoreFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFactory$lifeCycle$2(CoreFactory coreFactory) {
        super(0);
        this.this$0 = coreFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LifecycleRepository invoke() {
        Context applicationContext = this.this$0.context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return new LifecycleRepository((Application) applicationContext);
    }
}

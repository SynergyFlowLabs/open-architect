package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.services.abtests.TaskService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ServicesFactory$taskService$2 extends l0 implements Function0<TaskService> {
    final /* synthetic */ ServicesFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicesFactory$taskService$2(ServicesFactory servicesFactory) {
        super(0);
        this.this$0 = servicesFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final TaskService invoke() {
        return new TaskService(this.this$0.getInitialData().getAbConfigWaiting(), this.this$0.getInitialData().getAbGroupWaiting());
    }
}

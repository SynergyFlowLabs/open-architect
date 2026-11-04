package com.devtodev.analytics.internal.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LifecycleRepository implements ILifecycleRepository {

    @NotNull
    private final AndroidLifecycle androidLifecycle;

    public LifecycleRepository(@NotNull Application applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.androidLifecycle = new AndroidLifecycle(applicationContext);
    }

    @Override // com.devtodev.analytics.internal.lifecycle.ILifecycleRepository
    public void addLifeCycleListener(@NotNull ILifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.androidLifecycle.setLifecycleListener(lifecycle);
    }
}

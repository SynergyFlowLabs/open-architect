package com.devtodev.analytics.internal.utils;

import android.content.Context;
import android.content.Intent;
import com.devtodev.analytics.internal.lifecycle.service.SessionService;
import com.devtodev.analytics.internal.logger.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Service implements IService {

    @NotNull
    private final Context context;
    private boolean isStarted;

    public Service(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.devtodev.analytics.internal.utils.IService
    public void startSessionService() {
        if (this.isStarted) {
            return;
        }
        this.isStarted = true;
        try {
            this.context.startService(new Intent(this.context, (Class<?>) SessionService.class));
        } catch (IllegalStateException unused) {
            Logger.error$default(Logger.INSTANCE, "Not allowed to start SessionService, app is in background", null, 2, null);
        } catch (Exception e10) {
            Logger.INSTANCE.error("SessionService can't be created", e10);
        }
    }

    @Override // com.devtodev.analytics.internal.utils.IService
    public void stopSessionService() {
        try {
            this.context.stopService(new Intent(this.context, (Class<?>) SessionService.class));
            this.isStarted = false;
            Logger.debug$default(Logger.INSTANCE, "Session service is removed", null, 2, null);
        } catch (Exception e10) {
            Logger.INSTANCE.error("SessionService can't be finished", e10);
        }
    }
}

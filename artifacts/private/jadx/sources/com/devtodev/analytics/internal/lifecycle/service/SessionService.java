package com.devtodev.analytics.internal.lifecycle.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.devtodev.analytics.internal.logger.Logger;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionService extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Logger.debug$default(Logger.INSTANCE, "Session service is created", null, 2, null);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        return 2;
    }
}

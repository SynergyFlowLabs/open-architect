package com.planner5d.library.services.backgroundexecutor.database;

import android.app.Application;
import androidx.annotation.m1;
import androidx.room.a2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    @m1
    @NotNull
    public final BackgroundExecutorDatabase a(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return (BackgroundExecutorDatabase) a2.a(application, BackgroundExecutorDatabase.class, "Planner5D.BackgroundExecutor").f();
    }
}

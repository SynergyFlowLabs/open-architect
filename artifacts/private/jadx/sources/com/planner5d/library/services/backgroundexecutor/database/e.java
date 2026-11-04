package com.planner5d.library.services.backgroundexecutor.database;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    @NotNull
    public final b a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Thread threadCurrentThread = Thread.currentThread();
        long id2 = threadCurrentThread.getId();
        String name = threadCurrentThread.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new b(jCurrentTimeMillis, id2, name, new com.planner5d.library.model.exception.c(throwable), 0L, 16, null);
    }
}

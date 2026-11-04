package com.planner5d.library.services.utility;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class y2 {
    public static final void a(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (Exception e10) {
            timber.log.b.f381052a.y(e10);
        }
    }
}

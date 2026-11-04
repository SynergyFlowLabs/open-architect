package com.planner5d.library.services.bitmaploader.target;

import com.planner5d.library.model.manager.u1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f224194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u1 f224195b;

    public i(@NotNull String bitmapType, @NotNull u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(bitmapType, "bitmapType");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f224194a = bitmapType;
        this.f224195b = logRecordManager;
    }

    @Override // com.planner5d.library.services.bitmaploader.target.c
    public void a(@Nullable Throwable th2) {
        if (th2 instanceof OutOfMemoryError) {
            this.f224195b.b("failed_to_load_bitmap", this.f224194a, th2);
        }
    }
}

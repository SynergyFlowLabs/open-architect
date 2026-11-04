package com.planner5d.library.model.manager.config.sql;

import androidx.room.u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@androidx.room.u(tableName = "shared_preferences_records")
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @u0
    @NotNull
    private final String f190873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final byte[] f190874b;

    public n(@NotNull String name, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f190873a = name;
        this.f190874b = value;
    }

    @NotNull
    public final String a() {
        return this.f190873a;
    }

    @NotNull
    public final byte[] b() {
        return this.f190874b;
    }
}

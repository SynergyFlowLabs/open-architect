package com.planner5d.library.api.support;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f142436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final File f142437b;

    public r(@NotNull String mimeType, @NotNull File file) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f142436a = mimeType;
        this.f142437b = file;
    }

    @NotNull
    public final File a() {
        return this.f142437b;
    }

    @NotNull
    public final String b() {
        return this.f142436a;
    }
}

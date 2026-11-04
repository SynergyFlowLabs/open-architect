package com.planner5d.library.services.utility;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class i3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f225279b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i3 f225278a = new i3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f225280c = new Object();

    private i3() {
    }

    @NotNull
    public final File a(@NotNull String suffix, @NotNull String prefix, @NotNull File directory) throws IOException, SecurityException {
        File file;
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(directory, "directory");
        synchronized (f225280c) {
            while (true) {
                try {
                    file = new File(directory, suffix + f225279b + prefix);
                    if (!file.createNewFile()) {
                        f225279b++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return file;
    }
}

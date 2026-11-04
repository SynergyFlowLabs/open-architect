package io.ktor.utils.io;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f296876a = "io.ktor.development";

    public static final boolean a() {
        String property = System.getProperty(f296876a);
        return property != null && Boolean.parseBoolean(property);
    }
}

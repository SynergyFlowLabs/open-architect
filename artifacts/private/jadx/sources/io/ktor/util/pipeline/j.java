package io.ktor.util.pipeline;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296782a;

    public j(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f296782a = name;
    }

    @NotNull
    public final String a() {
        return this.f296782a;
    }

    @NotNull
    public String toString() {
        return "Phase('" + this.f296782a + "')";
    }
}

package io.ktor.http;

import java.io.File;
import java.nio.file.Path;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 {
    @NotNull
    public static final m a(@NotNull m.c cVar, @NotNull File file) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        return q0.p(q0.j(m.f295981f, kotlin.io.l.b0(file)));
    }

    @NotNull
    public static final m b(@NotNull m.c cVar, @NotNull Path path) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return q0.p(q0.j(m.f295981f, kotlin.io.path.p.M0(path)));
    }
}

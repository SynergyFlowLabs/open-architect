package kotlinx.io.files;

import java.io.File;
import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public static final char f315768a = File.separatorChar;

    @NotNull
    public static final i a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new i(new File(path));
    }

    @a1
    @oj.i(name = "sink")
    @NotNull
    public static final x b(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return kotlinx.io.g.a(c.f(e.f315762b, iVar, false, 2, null));
    }

    @a1
    @oj.i(name = "source")
    @NotNull
    public static final c0 c(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return kotlinx.io.g.b(e.f315762b.h(iVar));
    }
}

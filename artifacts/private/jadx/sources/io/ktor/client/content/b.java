package io.ktor.client.content;

import io.ktor.http.m;
import io.ktor.http.q0;
import io.ktor.util.e1;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    @NotNull
    public static final a a(@NotNull File baseDir, @NotNull String relativePath, @NotNull m contentType) {
        Intrinsics.checkNotNullParameter(baseDir, "baseDir");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new a(e1.b(baseDir, relativePath), contentType);
    }

    public static /* synthetic */ a b(File file, String str, m mVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            mVar = q0.f(m.f295981f, str);
        }
        return a(file, str, mVar);
    }
}

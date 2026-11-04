package io.ktor.http.content;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 {
    @NotNull
    public static final q a(@NotNull Date lastModified) {
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        return new q(ni.a.b(Long.valueOf(lastModified.getTime())));
    }
}

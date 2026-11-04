package io.ktor.util.cio;

import io.ktor.utils.io.p;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {
    @NotNull
    public static final BufferedWriter a(@NotNull p pVar, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(io.ktor.utils.io.jvm.javaio.a.c(pVar), charset), 8192);
    }

    public static /* synthetic */ BufferedWriter b(p pVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return a(pVar, charset);
    }

    @NotNull
    public static final Writer c(@NotNull p pVar, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(io.ktor.utils.io.jvm.javaio.a.c(pVar), charset);
    }

    public static /* synthetic */ Writer d(p pVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return c(pVar, charset);
    }
}

package io.ktor.utils.io;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    @NotNull
    public static final h a(@NotNull String text, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return e(ui.u.l(text, charset), 0, 0, 6, null);
    }

    @NotNull
    public static final h b(@NotNull kotlinx.io.c0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new c1(source);
    }

    @NotNull
    public static final h c(@NotNull byte[] content, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        kotlinx.io.b bVar = new kotlinx.io.b();
        bVar.write(content, i10, i11 + i10);
        return b(bVar);
    }

    public static /* synthetic */ h d(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return a(str, charset);
    }

    public static /* synthetic */ h e(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return c(bArr, i10, i11);
    }
}

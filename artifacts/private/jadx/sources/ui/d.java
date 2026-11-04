package ui;

import java.nio.ByteBuffer;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    @kotlin.l(message = "[writeByteBuffer] is deprecated. Consider using [transferFrom] instead", replaceWith = @b1(expression = "this.transferFrom(source)", imports = {}))
    public static final void a(@NotNull kotlinx.io.b bVar, @NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        kotlinx.io.d.h(bVar, source);
    }
}

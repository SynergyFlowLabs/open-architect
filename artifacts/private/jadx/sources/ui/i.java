package ui;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static final void a(@NotNull x xVar, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlinx.io.d.h(xVar.n(), buffer);
    }
}

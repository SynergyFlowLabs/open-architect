package ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    @NotNull
    public static final c0 a(@NotNull Function1<? super x, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.io.b bVar = new kotlinx.io.b();
        block.invoke(bVar);
        return bVar;
    }
}

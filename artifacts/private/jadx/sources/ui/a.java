package ui;

import io.ktor.utils.io.l0;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    @kotlin.l(level = kotlin.n.ERROR, message = l0.f297090a, replaceWith = @b1(expression = "write(other, min(other.size, maxSize.toLong())", imports = {}))
    public static final int a(@NotNull kotlinx.io.b bVar, @NotNull kotlinx.io.b other, int i10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        long jMin = Math.min(other.j(), i10);
        bVar.V5(other, jMin);
        return (int) jMin;
    }
}

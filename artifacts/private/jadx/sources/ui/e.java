package ui;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public static final boolean a(@NotNull kotlinx.io.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.j() == 0;
    }

    @NotNull
    public static final byte[] b(@NotNull kotlinx.io.b bVar, int i10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return g0.d(bVar, i10);
    }

    public static /* synthetic */ byte[] c(kotlinx.io.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = (int) bVar.j();
        }
        return b(bVar, i10);
    }
}

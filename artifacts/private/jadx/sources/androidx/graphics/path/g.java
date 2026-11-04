package androidx.graphics.path;

import android.graphics.Path;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@i(name = "PathUtilities")
public final class g {
    @NotNull
    public static final a a(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return new a(path, null, 0.0f, 6, null);
    }

    @NotNull
    public static final a b(@NotNull Path path, @NotNull a.EnumC0469a conicEvaluation, float f10) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        return new a(path, conicEvaluation, f10);
    }

    public static /* synthetic */ a c(Path path, a.EnumC0469a enumC0469a, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.25f;
        }
        return b(path, enumC0469a, f10);
    }
}

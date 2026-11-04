package androidx.compose.ui.text.font;

import androidx.compose.runtime.k7;
import java.util.List;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class z {
    @k7
    @NotNull
    public static final y a(@NotNull n1 n1Var) {
        return new a1(n1Var);
    }

    @k7
    @NotNull
    public static final y b(@NotNull List<? extends x> list) {
        return new k0(list);
    }

    @k7
    @NotNull
    public static final y c(@NotNull x... xVarArr) {
        return new k0(ArraysKt.asList(xVarArr));
    }
}

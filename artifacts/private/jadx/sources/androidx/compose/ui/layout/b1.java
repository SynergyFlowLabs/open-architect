package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface b1 {
    int getHeight();

    int getWidth();

    @Nullable
    default Function1<v2, Unit> j() {
        return null;
    }

    @NotNull
    Map<a, Integer> x();

    void y();
}

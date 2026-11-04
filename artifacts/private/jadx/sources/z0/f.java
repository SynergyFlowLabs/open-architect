package z0;

import android.text.style.TtsSpan;
import androidx.compose.ui.text.a4;
import androidx.compose.ui.text.c4;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    @NotNull
    public static final TtsSpan a(@NotNull a4 a4Var) {
        if (a4Var instanceof c4) {
            return b((c4) a4Var);
        }
        throw new k0();
    }

    @NotNull
    public static final TtsSpan b(@NotNull c4 c4Var) {
        return new TtsSpan.VerbatimBuilder(c4Var.a()).build();
    }
}

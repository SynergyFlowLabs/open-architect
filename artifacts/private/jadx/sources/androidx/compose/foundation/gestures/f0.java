package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    @NotNull
    public static final u3 a(@NotNull androidx.compose.ui.node.h hVar) {
        return new e0(ViewConfiguration.get(androidx.compose.ui.node.l.a(hVar).getContext()));
    }
}

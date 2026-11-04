package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface t4 {

    public static final class a {
        @Deprecated
        @Nullable
        public static androidx.compose.ui.platform.a a(@NotNull t4 t4Var) {
            return t4.super.getSubCompositionView();
        }

        @Deprecated
        @Nullable
        public static View b(@NotNull t4 t4Var) {
            return t4.super.getViewRoot();
        }
    }

    @Nullable
    default androidx.compose.ui.platform.a getSubCompositionView() {
        return null;
    }

    @Nullable
    default View getViewRoot() {
        return null;
    }
}

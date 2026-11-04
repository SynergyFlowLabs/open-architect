package androidx.compose.ui.platform;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 {
    @androidx.compose.ui.o
    @Nullable
    public static final Uri a(@NotNull k1 k1Var) {
        int itemCount = k1Var.a().getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            Uri uri = k1Var.a().getItemAt(i10).getUri();
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}

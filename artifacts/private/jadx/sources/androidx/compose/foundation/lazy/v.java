package androidx.compose.foundation.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface v {
    @Nullable
    default Object getContentType() {
        return null;
    }

    int getIndex();

    @NotNull
    Object getKey();

    int getOffset();

    int getSize();
}

package androidx.activity.contextaware;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    void addOnContextAvailableListener(@NotNull d dVar);

    @Nullable
    Context peekAvailableContext();

    void removeOnContextAvailableListener(@NotNull d dVar);
}

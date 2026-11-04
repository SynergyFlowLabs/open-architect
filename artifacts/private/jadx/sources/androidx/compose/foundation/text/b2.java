package androidx.compose.foundation.text;

import android.database.ContentObserver;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.l1
public interface b2 {
    boolean a();

    void b(@NotNull Uri uri, boolean z10, @NotNull ContentObserver contentObserver);

    void unregisterContentObserver(@NotNull ContentObserver contentObserver);
}

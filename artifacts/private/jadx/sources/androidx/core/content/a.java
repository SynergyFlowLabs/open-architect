package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private a() {
    }

    @NonNull
    public static Context a(@NonNull ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}

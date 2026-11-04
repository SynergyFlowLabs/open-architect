package io.noties.markwon.utils;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public abstract class c {
    private c() {
    }

    public static void a(@NonNull Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}

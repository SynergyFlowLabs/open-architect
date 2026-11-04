package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f {
    private f() {
    }

    public static void a(@NonNull Drawable drawable) {
        drawable.setBounds(c(drawable));
    }

    public static void b(@NonNull Drawable drawable) {
        if (drawable.getBounds().isEmpty()) {
            drawable.setBounds(c(drawable));
        }
    }

    @NonNull
    @androidx.annotation.j
    public static Rect c(@NonNull Drawable drawable) {
        return new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}

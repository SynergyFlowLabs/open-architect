package io.noties.markwon.utils;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.noties.markwon.core.spans.l;
import io.noties.markwon.core.spans.m;

/* JADX INFO: loaded from: classes8.dex */
public abstract class i {
    public static int a(@NonNull Canvas canvas, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout layoutC = l.c(spanned);
            if (layoutC != null) {
                return layoutC.getWidth();
            }
            TextView textViewC = m.c(spanned);
            if (textViewC != null) {
                return (textViewC.getWidth() - textViewC.getPaddingLeft()) - textViewC.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }
}

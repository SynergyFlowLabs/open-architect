package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.v0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    @w0(21)
    private static class a {
        private a() {
        }

        @p0
        static ColorStateList a(@NonNull CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @p0
        static PorterDuff.Mode b(@NonNull CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        static void c(@NonNull CheckedTextView checkedTextView, @p0 ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void d(@NonNull CheckedTextView checkedTextView, @p0 PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    private c() {
    }

    @v0(expression = "textView.getCheckMarkDrawable()")
    @p0
    @Deprecated
    public static Drawable a(@NonNull CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    @p0
    public static ColorStateList b(@NonNull CheckedTextView checkedTextView) {
        return a.a(checkedTextView);
    }

    @p0
    public static PorterDuff.Mode c(@NonNull CheckedTextView checkedTextView) {
        return a.b(checkedTextView);
    }

    public static void d(@NonNull CheckedTextView checkedTextView, @p0 ColorStateList colorStateList) {
        a.c(checkedTextView, colorStateList);
    }

    public static void e(@NonNull CheckedTextView checkedTextView, @p0 PorterDuff.Mode mode) {
        a.d(checkedTextView, mode);
    }
}

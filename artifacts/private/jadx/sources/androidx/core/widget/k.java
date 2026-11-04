package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    @w0(21)
    static class a {
        private a() {
        }

        static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private k() {
    }

    @p0
    public static ColorStateList a(@NonNull ImageView imageView) {
        return a.a(imageView);
    }

    @p0
    public static PorterDuff.Mode b(@NonNull ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(@NonNull ImageView imageView, @p0 ColorStateList colorStateList) {
        a.c(imageView, colorStateList);
    }

    public static void d(@NonNull ImageView imageView, @p0 PorterDuff.Mode mode) {
        a.d(imageView, mode);
    }
}

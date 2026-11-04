package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.u1;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class t {
    private t() {
    }

    static void a(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.c.r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                androidx.core.graphics.drawable.c.o(drawable, colorStateList);
            } else {
                androidx.core.graphics.drawable.c.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                androidx.core.graphics.drawable.c.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static ImageView.ScaleType b(int i10) {
        if (i10 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i10 != 5) {
            return i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    private static int[] c(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void d(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = androidx.core.graphics.drawable.c.r(drawable).mutate();
        androidx.core.graphics.drawable.c.o(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    static void e(@NonNull CheckableImageButton checkableImageButton) {
    }

    private static void f(@NonNull CheckableImageButton checkableImageButton, @p0 View.OnLongClickListener onLongClickListener) {
        boolean zN0 = u1.N0(checkableImageButton);
        int i10 = 1;
        boolean z10 = onLongClickListener != null;
        boolean z11 = zN0 || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zN0);
        checkableImageButton.setPressable(zN0);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i10 = 2;
        }
        u1.Y1(checkableImageButton, i10);
    }

    static void g(@NonNull CheckableImageButton checkableImageButton, @t0 int i10) {
        checkableImageButton.setMinimumWidth(i10);
        checkableImageButton.setMinimumHeight(i10);
    }

    static void h(@NonNull CheckableImageButton checkableImageButton, @p0 View.OnClickListener onClickListener, @p0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void i(@NonNull CheckableImageButton checkableImageButton, @p0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void j(@NonNull CheckableImageButton checkableImageButton, @NonNull ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}

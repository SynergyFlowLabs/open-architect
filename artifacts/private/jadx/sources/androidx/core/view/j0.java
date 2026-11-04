package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class j0 {
    private j0() {
    }

    @Deprecated
    public static int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection != 0 && layoutDirection != 1) {
            layoutDirection = 0;
        }
        return layoutDirection;
    }

    @androidx.annotation.v0(expression = "lp.getMarginEnd()")
    @Deprecated
    public static int b(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @androidx.annotation.v0(expression = "lp.getMarginStart()")
    @Deprecated
    public static int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @androidx.annotation.v0(expression = "lp.isMarginRelative()")
    @Deprecated
    public static boolean d(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @androidx.annotation.v0(expression = "lp.resolveLayoutDirection(layoutDirection)")
    @Deprecated
    public static void e(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.resolveLayoutDirection(i10);
    }

    @androidx.annotation.v0(expression = "lp.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void f(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setLayoutDirection(i10);
    }

    @androidx.annotation.v0(expression = "lp.setMarginEnd(marginEnd)")
    @Deprecated
    public static void g(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginEnd(i10);
    }

    @androidx.annotation.v0(expression = "lp.setMarginStart(marginStart)")
    @Deprecated
    public static void h(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginStart(i10);
    }
}

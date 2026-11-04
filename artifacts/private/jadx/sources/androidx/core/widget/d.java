package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f49120a = "CompoundButtonCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f49121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f49122c;

    @w0(21)
    static class a {
        private a() {
        }

        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @w0(23)
    static class b {
        private b() {
        }

        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    private d() {
    }

    @p0
    public static Drawable a(@NonNull CompoundButton compoundButton) {
        return b.a(compoundButton);
    }

    @p0
    public static ColorStateList b(@NonNull CompoundButton compoundButton) {
        return a.a(compoundButton);
    }

    @p0
    public static PorterDuff.Mode c(@NonNull CompoundButton compoundButton) {
        return a.b(compoundButton);
    }

    public static void d(@NonNull CompoundButton compoundButton, @p0 ColorStateList colorStateList) {
        a.c(compoundButton, colorStateList);
    }

    public static void e(@NonNull CompoundButton compoundButton, @p0 PorterDuff.Mode mode) {
        a.d(compoundButton, mode);
    }
}

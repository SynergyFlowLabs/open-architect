package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.v0;
import androidx.annotation.w0;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47764a = "DrawableCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f47765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f47766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f47767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f47768e;

    @w0(21)
    static class a {
        private a() {
        }

        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @w0(23)
    static class b {
        private b() {
        }

        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    private c() {
    }

    public static void a(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        a.a(drawable, theme);
    }

    public static boolean b(@NonNull Drawable drawable) {
        return a.b(drawable);
    }

    public static void c(@NonNull Drawable drawable) {
        drawable.clearColorFilter();
    }

    @v0(expression = "drawable.getAlpha()")
    @Deprecated
    public static int d(@NonNull Drawable drawable) {
        return drawable.getAlpha();
    }

    @p0
    public static ColorFilter e(@NonNull Drawable drawable) {
        return a.c(drawable);
    }

    public static int f(@NonNull Drawable drawable) {
        return b.a(drawable);
    }

    public static void g(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        a.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    @v0(expression = "drawable.isAutoMirrored()")
    @Deprecated
    public static boolean h(@NonNull Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @v0(expression = "drawable.jumpToCurrentState()")
    @Deprecated
    public static void i(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @v0(expression = "drawable.setAutoMirrored(mirrored)")
    @Deprecated
    public static void j(@NonNull Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void k(@NonNull Drawable drawable, float f10, float f11) {
        a.e(drawable, f10, f11);
    }

    public static void l(@NonNull Drawable drawable, int i10, int i11, int i12, int i13) {
        a.f(drawable, i10, i11, i12, i13);
    }

    public static boolean m(@NonNull Drawable drawable, int i10) {
        return b.b(drawable, i10);
    }

    public static void n(@NonNull Drawable drawable, @androidx.annotation.l int i10) {
        a.g(drawable, i10);
    }

    public static void o(@NonNull Drawable drawable, @p0 ColorStateList colorStateList) {
        a.h(drawable, colorStateList);
    }

    public static void p(@NonNull Drawable drawable, @p0 PorterDuff.Mode mode) {
        a.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@NonNull Drawable drawable) {
        return drawable instanceof j ? (T) ((j) drawable).b() : drawable;
    }

    @NonNull
    public static Drawable r(@NonNull Drawable drawable) {
        return drawable;
    }
}

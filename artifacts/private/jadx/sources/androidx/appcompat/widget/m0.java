package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f11396a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f11397b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f11398c = new Rect();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final boolean f11399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Method f11400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Field f11401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Field f11402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Field f11403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Field f11404f;

        /* JADX WARN: Code duplicated, block: B:26:0x0065  */
        /* JADX WARN: Code duplicated, block: B:27:0x0073  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z10;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField(VerticalAlignment.BOTTOM);
                                z10 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z10 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f11400b = method;
                            f11401c = field;
                            f11402d = field2;
                            f11403e = field3;
                            f11404f = field4;
                            f11399a = true;
                            return;
                        }
                        f11400b = null;
                        f11401c = null;
                        f11402d = null;
                        f11403e = null;
                        f11404f = null;
                        f11399a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f11400b = method;
                            f11401c = field;
                            f11402d = field2;
                            f11403e = field3;
                            f11404f = field4;
                            f11399a = true;
                            return;
                        }
                        f11400b = null;
                        f11401c = null;
                        f11402d = null;
                        f11403e = null;
                        f11404f = null;
                        f11399a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f11400b = method;
                            f11401c = field;
                            f11402d = field2;
                            f11403e = field3;
                            f11404f = field4;
                            f11399a = true;
                            return;
                        }
                        f11400b = null;
                        f11401c = null;
                        f11402d = null;
                        f11403e = null;
                        f11404f = null;
                        f11399a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f11400b = method;
                        f11401c = field;
                        f11402d = field2;
                        f11403e = field3;
                        f11404f = field4;
                        f11399a = true;
                        return;
                    }
                    f11400b = null;
                    f11401c = null;
                    f11402d = null;
                    f11403e = null;
                    f11404f = null;
                    f11399a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f11400b = method;
                        f11401c = field;
                        f11402d = field2;
                        f11403e = field3;
                        f11404f = field4;
                        f11399a = true;
                        return;
                    }
                    f11400b = null;
                    f11401c = null;
                    f11402d = null;
                    f11403e = null;
                    f11404f = null;
                    f11399a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f11400b = method;
                        f11401c = field;
                        f11402d = field2;
                        f11403e = field3;
                        f11404f = field4;
                        f11399a = true;
                        return;
                    }
                    f11400b = null;
                    f11401c = null;
                    f11402d = null;
                    f11403e = null;
                    f11404f = null;
                    f11399a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z10) {
                f11400b = method;
                f11401c = field;
                f11402d = field2;
                f11403e = field3;
                f11404f = field4;
                f11399a = true;
                return;
            }
            f11400b = null;
            f11401c = null;
            f11402d = null;
            f11403e = null;
            f11404f = null;
            f11399a = false;
        }

        private a() {
        }

        @NonNull
        static Rect a(@NonNull Drawable drawable) {
            return m0.f11398c;
        }
    }

    @androidx.annotation.w0(29)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    private m0() {
    }

    @Deprecated
    public static boolean a(@NonNull Drawable drawable) {
        return true;
    }

    static void b(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f11396a);
        } else {
            drawable.setState(f11397b);
        }
        drawable.setState(state);
    }

    @NonNull
    public static Rect d(@NonNull Drawable drawable) {
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

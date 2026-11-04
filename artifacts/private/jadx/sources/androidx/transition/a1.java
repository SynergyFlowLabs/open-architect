package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
class a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f75506b = "ViewUtilsApi19";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f75507c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f75508d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f75509e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Field f75510f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f75511g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f75512h = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f75513a;

    @androidx.annotation.w0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        @androidx.annotation.u
        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    a1() {
    }

    @e.a({"PrivateApi", "SoonBlockedPrivateApi"})
    private void b() {
        if (f75509e) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f75508d = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f75509e = true;
    }

    public void a(@NonNull View view) {
    }

    @e.a({"NewApi"})
    public float c(@NonNull View view) {
        if (f75507c) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f75507c = false;
            }
        }
        return view.getAlpha();
    }

    public void d(@NonNull View view) {
    }

    public void e(@NonNull View view, @androidx.annotation.p0 Matrix matrix) {
        if (matrix != null && !matrix.isIdentity()) {
            float[] fArr = this.f75513a;
            if (fArr == null) {
                fArr = new float[9];
                this.f75513a = fArr;
            }
            matrix.getValues(fArr);
            float f10 = fArr[3];
            float fSqrt = ((float) Math.sqrt(1.0f - (f10 * f10))) * (fArr[0] < 0.0f ? -1 : 1);
            float degrees = (float) Math.toDegrees(Math.atan2(f10, fSqrt));
            float f11 = fArr[0] / fSqrt;
            float f12 = fArr[4] / fSqrt;
            float f13 = fArr[2];
            float f14 = fArr[5];
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setTranslationX(f13);
            view.setTranslationY(f14);
            view.setRotation(degrees);
            view.setScaleX(f11);
            view.setScaleY(f12);
            return;
        }
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
    }

    @e.a({"BanUncheckedReflection"})
    public void f(@NonNull View view, int i10, int i11, int i12, int i13) {
        b();
        Method method = f75508d;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    @e.a({"NewApi"})
    public void g(@NonNull View view, float f10) {
        if (f75507c) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f75507c = false;
            }
        }
        view.setAlpha(f10);
    }

    @e.a({"SoonBlockedPrivateApi"})
    public void h(@NonNull View view, int i10) {
        if (!f75511g) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f75510f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f75511g = true;
        }
        Field field = f75510f;
        if (field != null) {
            try {
                f75510f.setInt(view, (field.getInt(view) & (-13)) | i10);
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void j(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            j(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}

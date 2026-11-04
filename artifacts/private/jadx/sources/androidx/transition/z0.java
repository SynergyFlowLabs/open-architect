package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f75809b = "ViewUtils";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a1 f75808a = new e1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property<View, Float> f75810c = new a(Float.class, "translationAlpha");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Property<View, Rect> f75811d = new b(Rect.class, "clipBounds");

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(z0.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            z0.f(view, f10.floatValue());
        }
    }

    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    private z0() {
    }

    static void a(@NonNull View view) {
        f75808a.a(view);
    }

    static float b(@NonNull View view) {
        return f75808a.c(view);
    }

    static void c(@NonNull View view) {
        f75808a.d(view);
    }

    static void d(@NonNull View view, @androidx.annotation.p0 Matrix matrix) {
        f75808a.e(view, matrix);
    }

    static void e(@NonNull View view, int i10, int i11, int i12, int i13) {
        f75808a.f(view, i10, i11, i12, i13);
    }

    static void f(@NonNull View view, float f10) {
        f75808a.g(view, f10);
    }

    static void g(@NonNull View view, int i10) {
        f75808a.h(view, i10);
    }

    static void h(@NonNull View view, @NonNull Matrix matrix) {
        f75808a.i(view, matrix);
    }

    static void i(@NonNull View view, @NonNull Matrix matrix) {
        f75808a.j(view, matrix);
    }
}

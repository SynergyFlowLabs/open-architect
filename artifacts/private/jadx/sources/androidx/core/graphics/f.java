package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final void a(@NotNull Canvas canvas, float f10, float f11, float f12, float f13, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public static final void b(@NotNull Canvas canvas, int i10, int i11, int i12, int i13, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(i10, i11, i12, i13);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public static final void c(@NotNull Canvas canvas, @NotNull Path path, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public static final void d(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(rect);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public static final void e(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(rectF);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static final void f(@NotNull Canvas canvas, @NotNull Matrix matrix, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static /* synthetic */ void g(Canvas canvas, Matrix matrix, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = new Matrix();
        }
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static final void h(@NotNull Canvas canvas, float f10, float f11, float f12, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public static /* synthetic */ void i(Canvas canvas, float f10, float f11, float f12, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            function1.invoke(canvas);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static final void j(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public static final void k(@NotNull Canvas canvas, float f10, float f11, float f12, float f13, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            function1.invoke(canvas);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static /* synthetic */ void l(Canvas canvas, float f10, float f11, float f12, float f13, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public static final void m(@NotNull Canvas canvas, float f10, float f11, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.skew(f10, f11);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    public static /* synthetic */ void n(Canvas canvas, float f10, float f11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.skew(f10, f11);
        boolean z10 = true & true;
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static final void o(@NotNull Canvas canvas, float f10, float f11, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static /* synthetic */ void p(Canvas canvas, float f10, float f11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        try {
            function1.invoke(canvas);
            kotlin.jvm.internal.h0.d(1);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            canvas.restoreToCount(iSave);
            kotlin.jvm.internal.h0.c(1);
        }
    }
}

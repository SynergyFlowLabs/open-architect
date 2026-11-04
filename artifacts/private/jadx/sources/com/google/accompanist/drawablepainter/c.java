package com.google.accompanist.drawablepainter;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.s0;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.n;
import n0.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainterKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,188:1\n1223#2,6:189\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainterKt\n*L\n165#1:189,6\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final f0 f103075a = g0.b(j0.NONE, new Function0() { // from class: com.google.accompanist.drawablepainter.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? n.f332724b.a() : o.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler f() {
        return (Handler) f103075a.getValue();
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.ui.graphics.painter.b g(@Nullable Drawable drawable, @Nullable c0 c0Var, int i10) {
        Object drawablePainter;
        c0Var.E(1756822313);
        if (m0.l0()) {
            m0.A0(1756822313, i10, -1, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:164)");
        }
        c0Var.E(289266787);
        boolean zD = c0Var.D(drawable);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            if (drawable == null) {
                objI0 = EmptyPainter.f103072g;
            } else {
                if (drawable instanceof ColorDrawable) {
                    drawablePainter = new ColorPainter(s0.b(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
                    drawablePainter = new DrawablePainter(drawableMutate);
                }
                objI0 = drawablePainter;
            }
            c0Var.Y(objI0);
        }
        androidx.compose.ui.graphics.painter.b bVar = (androidx.compose.ui.graphics.painter.b) objI0;
        c0Var.A();
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.A();
        return bVar;
    }
}

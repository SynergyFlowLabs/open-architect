package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.n3;
import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.unit.w;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.ranges.r;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,188:1\n81#2:189\n107#2,2:190\n81#2:192\n107#2,2:193\n256#3:195\n47#4,7:196\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n*L\n59#1:189\n59#1:190,2\n60#1:192\n60#1:193,2\n127#1:195\n131#1:196,7\n*E\n"})
public final class DrawablePainter extends androidx.compose.ui.graphics.painter.b implements m5 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f103065k = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Drawable f103066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n3 f103067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n3 f103068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final f0 f103069j;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103070a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103070a = iArr;
        }
    }

    public static final class b implements Drawable.Callback {
        b() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable d10) {
            Intrinsics.checkNotNullParameter(d10, "d");
            DrawablePainter.this.x(DrawablePainter.this.u() + 1);
            DrawablePainter drawablePainter = DrawablePainter.this;
            drawablePainter.y(c.e(drawablePainter.v()));
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable d10, Runnable what, long j10) {
            Intrinsics.checkNotNullParameter(d10, "d");
            Intrinsics.checkNotNullParameter(what, "what");
            c.f().postAtTime(what, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable d10, Runnable what) {
            Intrinsics.checkNotNullParameter(d10, "d");
            Intrinsics.checkNotNullParameter(what, "what");
            c.f().removeCallbacks(what);
        }
    }

    public DrawablePainter(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f103066g = drawable;
        this.f103067h = d7.g(0, null, 2, null);
        this.f103068i = d7.g(n.c(c.e(drawable)), null, 2, null);
        this.f103069j = g0.c(new Function0() { // from class: com.google.accompanist.drawablepainter.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DrawablePainter.s(this.f103074a);
            }
        });
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(DrawablePainter drawablePainter) {
        return drawablePainter.new b();
    }

    private final Drawable.Callback t() {
        return (Drawable.Callback) this.f103069j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int u() {
        return ((Number) this.f103067h.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long w() {
        return ((n) this.f103068i.getValue()).y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i10) {
        this.f103067h.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(long j10) {
        this.f103068i.setValue(n.c(j10));
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean a(float f10) {
        this.f103066g.setAlpha(r.I(kotlin.math.b.L0(f10 * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean b(@Nullable r0 r0Var) {
        this.f103066g.setColorFilter(r0Var != null ? androidx.compose.ui.graphics.d.e(r0Var) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean c(@NotNull w layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Drawable drawable = this.f103066g;
        int i10 = a.f103070a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new k0();
        }
        return drawable.setLayoutDirection(i11);
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
        this.f103066g.setCallback(t());
        this.f103066g.setVisible(true, true);
        Object obj = this.f103066g;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        k();
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        Object obj = this.f103066g;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.f103066g.setVisible(false, false);
        this.f103066g.setCallback(null);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        return w();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        androidx.compose.ui.graphics.k0 k0VarF = fVar.Z3().f();
        u();
        try {
            k0VarF.save();
            if (Build.VERSION.SDK_INT >= 31 || !(this.f103066g instanceof AnimatedImageDrawable)) {
                int i10 = 6 << 0;
                this.f103066g.setBounds(0, 0, kotlin.math.b.L0(n.t(fVar.d())), kotlin.math.b.L0(n.m(fVar.d())));
            } else {
                k0VarF.v(n.t(fVar.d()) / n.t(l()), n.m(fVar.d()) / n.m(l()));
            }
            this.f103066g.draw(androidx.compose.ui.graphics.c.d(k0VarF));
        } finally {
            k0VarF.B();
        }
    }

    @NotNull
    public final Drawable v() {
        return this.f103066g;
    }
}

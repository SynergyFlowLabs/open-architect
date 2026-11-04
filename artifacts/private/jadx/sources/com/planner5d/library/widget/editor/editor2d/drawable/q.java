package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.services.c0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDrawableUnknown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableUnknown.kt\ncom/planner5d/library/widget/editor/editor2d/drawable/DrawableUnknown\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,73:1\n1#2:74\n27#3,7:75\n*S KotlinDebug\n*F\n+ 1 DrawableUnknown.kt\ncom/planner5d/library/widget/editor/editor2d/drawable/DrawableUnknown\n*L\n55#1:75,7\n*E\n"})
public final class q implements c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f255068x = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Paint f255069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Paint f255070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final Matrix f255071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final RectF f255072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private c0 f255073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f255074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final c0 f255075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f255076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f255077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f255078w;

    public q() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(857516907);
        this.f255069n = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-14898325);
        this.f255070o = paint2;
        this.f255071p = new Matrix();
        this.f255072q = new RectF(-50.0f, -50.0f, 50.0f, 50.0f);
        this.f255074s = new com.planner5d.library.math.k();
        this.f255075t = new c0();
        this.f255076u = new com.planner5d.library.math.k();
        this.f255077v = new com.planner5d.library.math.k();
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(@NotNull d drawableEditorCanvas, boolean z10, @Nullable Item item) {
        Intrinsics.checkNotNullParameter(drawableEditorCanvas, "drawableEditorCanvas");
        if (drawableEditorCanvas.f254893c.f258070a) {
            Canvas canvas = drawableEditorCanvas.f254891a;
            this.f255073r = z10 ? com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c.o(this.f255075t, drawableEditorCanvas.f254894d, this.f255076u, this.f255077v, this.f255078w) : null;
            Intrinsics.checkNotNull(canvas);
            int iSave = canvas.save();
            try {
                Matrix matrix = canvas.getMatrix();
                Intrinsics.checkNotNullExpressionValue(matrix, "getMatrix(...)");
                synchronized (matrix) {
                    try {
                        canvas.concat(canvas.getMatrix());
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                canvas.drawRect(this.f255072q, this.f255069n);
                canvas.drawRect(this.f255072q, this.f255070o);
                canvas.restoreToCount(iSave);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave);
                throw th3;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(@NotNull ItemLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        synchronized (this.f255071p) {
            this.f255071p.reset();
            Matrix matrix = this.f255071p;
            float rotationY = layout.getRotationY();
            this.f255078w = rotationY;
            matrix.postRotate(rotationY);
            this.f255071p.postTranslate(layout.getPosition(this.f255076u).f180480a, this.f255076u.f180481b);
        }
        this.f255077v.U(this.f255072q.width(), this.f255072q.height()).T(this.f255074s);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    @NotNull
    public RectF d(@NotNull RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        bounds.set(this.f255072q);
        synchronized (this.f255071p) {
            try {
                this.f255071p.mapRect(bounds);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bounds;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(@NotNull PointF point) {
        boolean z10;
        Intrinsics.checkNotNullParameter(point, "point");
        synchronized (this.f255071p) {
            try {
                z10 = x.g(this.f255073r, point) || x.d(this.f255072q, this.f255071p, point);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return 0;
    }
}

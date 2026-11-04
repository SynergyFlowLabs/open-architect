package com.planner5d.library.widget.editor.editor2d.drawable.gizmo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.math.k;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.services.c0;
import com.planner5d.library.widget.editor.editor2d.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class d implements com.planner5d.library.widget.editor.editor2d.drawable.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f254914s = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final k f254915n = new k();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final RectF f254916o = new RectF();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final h f254917p = new h();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final Paint f254918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final Path f254919r;

    public d() {
        Paint paint = new Paint(1);
        this.f254918q = paint;
        this.f254919r = new Path();
        paint.setColor(857516907);
        paint.setStyle(Paint.Style.FILL);
    }

    private final void h(Canvas canvas) {
        canvas.drawPath(this.f254919r, this.f254918q);
    }

    private final void i() {
        this.f254919r.reset();
        Path path = this.f254919r;
        c0 c0Var = this.f254917p.f254961k;
        c0.b bVar = c0.b.Left;
        path.moveTo(c0Var.j(bVar, this.f254915n).f180480a, this.f254915n.f180481b);
        this.f254919r.lineTo(this.f254917p.f254961k.h(bVar, this.f254915n).f180480a, this.f254915n.f180481b);
        Path path2 = this.f254919r;
        c0 c0Var2 = this.f254917p.f254961k;
        c0.b bVar2 = c0.b.Right;
        path2.lineTo(c0Var2.h(bVar2, this.f254915n).f180480a, this.f254915n.f180481b);
        this.f254919r.lineTo(this.f254917p.f254961k.j(bVar2, this.f254915n).f180480a, this.f254915n.f180481b);
        this.f254919r.close();
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.f
    public void a(@NotNull com.planner5d.library.widget.editor.editor2d.painter.d data, @NotNull o scene, @Nullable Item item, boolean z10) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(scene, "scene");
        if (this.f254917p.d(data, item)) {
            i();
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(@NotNull com.planner5d.library.widget.editor.editor2d.drawable.d drawableEditorCanvas, boolean z10, @Nullable Item item) {
        Intrinsics.checkNotNullParameter(drawableEditorCanvas, "drawableEditorCanvas");
        h hVar = this.f254917p;
        if (hVar.f254951a == null || hVar.f254955e) {
            return;
        }
        com.planner5d.library.widget.editor.editor2d.painter.d.c cVar = hVar.f254968r;
        if (cVar == null || cVar != com.planner5d.library.widget.editor.editor2d.painter.d.c.Rotate) {
            Canvas canvas = drawableEditorCanvas.f254891a;
            Intrinsics.checkNotNullExpressionValue(canvas, "canvas");
            h(canvas);
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(@NotNull ItemLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    @NotNull
    public RectF d(@NotNull RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        bounds.set(this.f254916o);
        return bounds;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(@NotNull PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        return this.f254917p.f254951a != null && this.f254916o.contains(point.x, point.y);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return com.planner5d.library.widget.editor.editor2d.drawable.c.f254879b;
    }
}

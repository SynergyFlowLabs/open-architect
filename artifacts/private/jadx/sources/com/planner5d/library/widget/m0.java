package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nItemDecorationShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemDecorationShadow.kt\ncom/planner5d/library/widget/ItemDecorationShadow\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,115:1\n89#2:116\n42#2,3:117\n*S KotlinDebug\n*F\n+ 1 ItemDecorationShadow.kt\ncom/planner5d/library/widget/ItemDecorationShadow\n*L\n93#1:116\n101#1:117,3\n*E\n"})
public final class m0 extends RecyclerView.o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f258299w = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f258300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f258301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f258302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f258303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f258304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f258305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f258306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f258307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.drawable.g f258308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f258309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f258310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f258311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f258312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f258313n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Paint f258314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f258315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f258316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f258317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final NinePatch f258318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final RectF f258319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f258320u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private Integer f258321v;

    public /* synthetic */ m0(Context context, int i10, int i11, int i12, int i13, int i14, int i15, int i16, com.planner5d.library.widget.drawable.g gVar, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i17 & 2) != 0 ? c1.e.f250389cm : i10, (i17 & 4) != 0 ? c1.e.Nf : i11, (i17 & 8) != 0 ? c1.f.f251328wd : i12, (i17 & 16) != 0 ? c1.f.Sc : i13, (i17 & 32) != 0 ? c1.f.Sd : i14, (i17 & 64) != 0 ? c1.f.Sd : i15, (i17 & 128) != 0 ? c1.f.Kd : i16, (i17 & 256) != 0 ? new com.planner5d.library.widget.drawable.g() : gVar);
    }

    private final NinePatch f() {
        float f10 = 2;
        float f11 = this.f258313n * f10;
        float f12 = (this.f258315p * f10) + f11;
        float f13 = 1;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (f12 + f13), (int) (this.f258316q + this.f258317r + f11 + f13), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f14 = this.f258315p;
        float f15 = this.f258316q;
        float width = bitmapCreateBitmap.getWidth() - this.f258315p;
        float height = bitmapCreateBitmap.getHeight() - this.f258317r;
        float f16 = this.f258313n;
        canvas.drawRoundRect(f14, f15, width, height, f16, f16, this.f258314o);
        com.planner5d.library.widget.drawable.g gVar = this.f258308i;
        int i10 = (int) (this.f258315p + this.f258313n);
        float width2 = bitmapCreateBitmap.getWidth() - this.f258315p;
        float f17 = this.f258313n;
        return gVar.a(bitmapCreateBitmap, i10, (int) (width2 - f17), (int) (this.f258316q + f17), (int) ((bitmapCreateBitmap.getHeight() - this.f258317r) - this.f258313n));
    }

    public final int g() {
        return this.f258301b;
    }

    @NotNull
    public final Context getContext() {
        return this.f258300a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int i10 = this.f258310k;
        outRect.left = i10;
        outRect.right = i10;
        int i11 = this.f258311l;
        outRect.top = i11;
        outRect.bottom = i11;
    }

    public final int h() {
        return this.f258304e;
    }

    public final int i() {
        return this.f258307h;
    }

    public final int j() {
        return this.f258303d;
    }

    public final int k() {
        return this.f258305f;
    }

    public final int l() {
        return this.f258302c;
    }

    public final int m() {
        return this.f258306g;
    }

    public final void n(@Nullable Integer num) {
        this.f258321v = num;
    }

    public final void o(boolean z10) {
        this.f258320u = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.c0 state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f258320u) {
            int height = parent.getHeight();
            for (int i10 = 0; i10 < parent.getChildCount(); i10++) {
                Integer num = this.f258321v;
                if (num == null || (num != null && num.intValue() == i10)) {
                    View childAt = parent.getChildAt(i10);
                    RectF rectF = this.f258319t;
                    float left = childAt.getLeft() - this.f258315p;
                    float top = childAt.getTop();
                    float f10 = this.f258316q;
                    float fT = kotlin.ranges.r.t(top - f10, -(this.f258313n + f10));
                    float right = childAt.getRight() + this.f258315p;
                    float bottom = childAt.getBottom();
                    float f11 = this.f258317r;
                    rectF.set(left, fT, right, kotlin.ranges.r.A(bottom + f11, height + this.f258313n + f11));
                    this.f258318s.draw(canvas, this.f258319t);
                }
            }
        }
    }

    public m0(@NotNull Context context, @androidx.annotation.n int i10, @androidx.annotation.n int i11, @androidx.annotation.q int i12, @androidx.annotation.q int i13, @androidx.annotation.q int i14, @androidx.annotation.q int i15, @androidx.annotation.q int i16, @NotNull com.planner5d.library.widget.drawable.g ninePatchFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ninePatchFactory, "ninePatchFactory");
        this.f258300a = context;
        this.f258301b = i10;
        this.f258302c = i11;
        this.f258303d = i12;
        this.f258304e = i13;
        this.f258305f = i14;
        this.f258306g = i15;
        this.f258307h = i16;
        this.f258308i = ninePatchFactory;
        float dimension = context.getResources().getDimension(i12);
        this.f258309j = dimension;
        this.f258310k = (int) context.getResources().getDimension(i14);
        this.f258311l = (int) context.getResources().getDimension(i15);
        int dimension2 = (int) context.getResources().getDimension(i16);
        this.f258312m = dimension2;
        this.f258313n = context.getResources().getDimension(i13);
        Paint paint = new Paint(1);
        paint.setColor(androidx.core.content.d.g(context, i10));
        paint.setShadowLayer(dimension, 0.0f, dimension2, androidx.core.content.d.g(context, i11));
        this.f258314o = paint;
        float f10 = dimension * 2;
        this.f258315p = f10;
        this.f258316q = f10 - dimension2;
        this.f258317r = f10 + dimension2;
        this.f258318s = f();
        this.f258319t = new RectF();
        this.f258320u = true;
    }
}

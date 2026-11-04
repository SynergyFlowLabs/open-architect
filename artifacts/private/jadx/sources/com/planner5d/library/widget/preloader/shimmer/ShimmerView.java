package com.planner5d.library.widget.preloader.shimmer;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nShimmerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShimmerView.kt\ncom/planner5d/library/widget/preloader/shimmer/ShimmerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,90:1\n1#2:91\n1#2:93\n228#3:92\n255#4:94\n255#4:95\n*S KotlinDebug\n*F\n+ 1 ShimmerView.kt\ncom/planner5d/library/widget/preloader/shimmer/ShimmerView\n*L\n30#1:93\n30#1:92\n58#1:94\n73#1:95\n*E\n"})
public final class ShimmerView extends View implements g.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f258582e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private c f258583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private b f258584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f258585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Point f258586d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ShimmerView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final b a() {
        return new b(this.f258583a, new d(this.f258586d, this.f258583a));
    }

    @NotNull
    public final c getOptions() {
        return this.f258583a;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            this.f258585c.c(this);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f258585c.g(this);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f258583a.n()) {
            getLocationOnScreen(this.f258584b.c());
        }
        this.f258584b.b(canvas, this.f258585c.f());
    }

    @Override // com.planner5d.library.widget.preloader.shimmer.g.b
    public void onNewShimmerFrameAvailable() {
        invalidate();
    }

    public final void setOptions(@NotNull c options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (Intrinsics.areEqual(this.f258583a, options)) {
            return;
        }
        this.f258583a = options;
        this.f258584b = a();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 == getVisibility()) {
            return;
        }
        super.setVisibility(i10);
        if (getVisibility() == 0 && isAttachedToWindow()) {
            this.f258585c.c(this);
        } else {
            this.f258585c.g(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ShimmerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ShimmerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShimmerView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public ShimmerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258585c = g.f258608d.a();
        int[] iArrE = h3.E(context);
        this.f258586d = new Point(iArrE[0], iArrE[1]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.Wx, i10, i11);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        c cVar = new c(resources);
        c cVar2 = new c(typedArrayObtainStyledAttributes.getDimension(c1.s.cy, cVar.m()), typedArrayObtainStyledAttributes.getFloat(c1.s.ay, cVar.l()), typedArrayObtainStyledAttributes.getBoolean(c1.s.dy, cVar.n()), typedArrayObtainStyledAttributes.getColor(c1.s.Zx, cVar.k()), typedArrayObtainStyledAttributes.getColor(c1.s.Yx, cVar.j()), typedArrayObtainStyledAttributes.getInteger(c1.s.Xx, cVar.i()));
        typedArrayObtainStyledAttributes.recycle();
        this.f258583a = cVar2;
        this.f258584b = a();
    }
}

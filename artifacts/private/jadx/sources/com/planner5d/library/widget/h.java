package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.services.utility.r2;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Remove after redesign.")
public final class h extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258190b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f258191a;

    @SourceDebugExtension({"SMAP\nButtonWallResize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonWallResize.kt\ncom/planner5d/library/widget/ButtonWallResize$BackgroundDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,119:1\n1#2:120\n13409#3,2:121\n*S KotlinDebug\n*F\n+ 1 ButtonWallResize.kt\ncom/planner5d/library/widget/ButtonWallResize$BackgroundDrawable\n*L\n102#1:121,2\n*E\n"})
    private static final class a extends Drawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Paint f258192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Paint f258193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Paint f258194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Path[] f258195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Integer f258196e;

        public a(float f10, float f11, float f12, float f13, float f14, float f15, @androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.l int i12) {
            Paint paint = new Paint(1);
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f15);
            this.f258192a = paint;
            Paint paint2 = new Paint(paint);
            paint2.setColor(i11);
            this.f258193b = paint2;
            Paint paint3 = new Paint(paint);
            paint3.setColor(i12);
            paint3.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f258194c = paint3;
            float[] fArr = {f10, f11, f12};
            RectF rectF = new RectF(0.0f, 0.0f, ArraysKt.sum(fArr), f13);
            rectF.offset(paint.getStrokeWidth(), paint.getStrokeWidth());
            Float[] fArr2 = {Float.valueOf(ArraysKt.first(fArr)), Float.valueOf(rectF.width() - ArraysKt.last(fArr))};
            this.f258195d = new Path[]{a(rectF.left, rectF.top, fArr2[0].floatValue(), rectF.bottom, f14, 0.0f, 0.0f, f14), a(fArr2[0].floatValue(), rectF.top, fArr2[1].floatValue(), rectF.bottom, 0.0f, 0.0f, 0.0f, 0.0f), a(fArr2[1].floatValue(), rectF.top, rectF.width(), rectF.bottom, 0.0f, f14, f14, 0.0f)};
        }

        private final Path a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            Path path = new Path();
            int i10 = (0 ^ 4) & 6;
            path.addRoundRect(new RectF(f10, f11, f12, f13), new float[]{f14, f14, f15, f15, f16, f16, f17, f17}, Path.Direction.CCW);
            return path;
        }

        @Nullable
        public final Integer b() {
            return this.f258196e;
        }

        public final void c(@Nullable Integer num) {
            this.f258196e = num;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            for (Path path : this.f258195d) {
                canvas.drawPath(path, this.f258192a);
            }
            Integer num = this.f258196e;
            if (num != null) {
                Path path2 = this.f258195d[num.intValue()];
                if (path2 != null) {
                    canvas.drawPath(path2, this.f258194c);
                    canvas.drawPath(path2, this.f258193b);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void x(@androidx.annotation.d0 int i10, final int i11, @androidx.annotation.v int i12) {
        ImageButton imageButton = (ImageButton) findViewById(i10);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.y(this.f258186a, i11, view);
            }
        });
        imageButton.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.a(getContext(), i12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(h hVar, int i10, View view) {
        hVar.f258191a.c(Integer.valueOf(i10));
    }

    @Nullable
    public final Integer getActive() {
        return this.f258191a.b();
    }

    public final void setActive(@Nullable Integer num) {
        this.f258191a.c(num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, c1.l.I2, this);
        Resources resources = getResources();
        r2 r2Var = r2.f229727a;
        Intrinsics.checkNotNull(resources);
        a aVar = new a(r2Var.c(resources, 66), r2Var.c(resources, 84), r2Var.c(resources, 66), r2Var.c(resources, 32), r2Var.c(resources, 4), r2Var.c(resources, 1), -4539718, -16469915, 570732645);
        this.f258191a = aVar;
        x(c1.i.f252039x8, 0, c1.g.f251453ea);
        x(c1.i.f251791c5, 1, c1.g.f251423ca);
        x(c1.i.f251909m3, 2, c1.g.f251393aa);
        setBackground(aVar);
    }
}

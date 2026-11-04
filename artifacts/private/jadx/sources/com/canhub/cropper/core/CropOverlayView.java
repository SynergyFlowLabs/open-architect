package com.canhub.cropper.core;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCropOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropOverlayView.kt\ncom/canhub/cropper/core/CropOverlayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1227:1\n1#2:1228\n*E\n"})
public final class CropOverlayView extends View {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @NotNull
    public static final a f97639w3 = new a(null);
    private float H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f97640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f97641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private CropImageOptions f97642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private ScaleGestureDetector f97643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f97644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f97645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final g f97646g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private float f97647g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private b f97648h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private h f97649h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final RectF f97650i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f97651i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Paint f97652j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f97653j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Paint f97654k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f97655k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Paint f97656l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private float f97657l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Paint f97658m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private CropImageView.e f97659m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private Paint f97660n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @Nullable
    private CropImageView.d f97661n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Path f97662o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private CropImageView.b f97663o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f97664p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f97665p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private float f97666p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f97667p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private String f97668q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private float f97669r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final float[] f97670s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f97671s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final RectF f97672t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NotNull
    private final Rect f97673t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f97674u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f97675v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @Nullable
    private Integer f97676v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f97677w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Paint e(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            return paint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Paint f(float f10, int i10) {
            if (f10 <= 0.0f) {
                return null;
            }
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Paint g(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Paint h(CropImageOptions cropImageOptions) {
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setTextSize(cropImageOptions.O3);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(cropImageOptions.P3);
            return paint;
        }

        private a() {
        }
    }

    public interface b {
        void a(boolean z10);
    }

    private final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            RectF rectFI = CropOverlayView.this.f97646g.i();
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            int i10 = 0 & 2;
            float f10 = 2;
            float currentSpanY = detector.getCurrentSpanY() / f10;
            float currentSpanX = detector.getCurrentSpanX() / f10;
            float f11 = focusY - currentSpanY;
            float f12 = focusX - currentSpanX;
            float f13 = focusX + currentSpanX;
            float f14 = focusY + currentSpanY;
            if (f12 < f13 && f11 <= f14 && f12 >= 0.0f && f13 <= CropOverlayView.this.f97646g.d() && f11 >= 0.0f && f14 <= CropOverlayView.this.f97646g.c()) {
                rectFI.set(f12, f11, f13, f14);
                CropOverlayView.this.f97646g.w(rectFI);
                CropOverlayView.this.invalidate();
            }
            return true;
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f97680b;

        static {
            int[] iArr = new int[CropImageView.d.values().length];
            try {
                iArr[CropImageView.d.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.d.RECTANGLE_VERTICAL_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.d.RECTANGLE_HORIZONTAL_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.d.OVAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f97679a = iArr;
            int[] iArr2 = new int[CropImageView.b.values().length];
            try {
                iArr2[CropImageView.b.OVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CropImageView.b.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f97680b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public CropOverlayView(@Nullable Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(RectF rectF) {
        float f10;
        float f11;
        com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
        float fB = cVar.B(this.f97670s);
        float fD = cVar.D(this.f97670s);
        float fC = cVar.C(this.f97670s);
        float fW = cVar.w(this.f97670s);
        if (!q()) {
            this.f97672t.set(fB, fD, fC, fW);
            return false;
        }
        float[] fArr = this.f97670s;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        if (f17 < f13) {
            float f18 = fArr[3];
            if (f13 < f18) {
                f14 = fArr[2];
                f12 = f14;
                f13 = f15;
                f11 = f16;
                f15 = f18;
                f10 = f17;
            } else {
                f12 = fArr[2];
                f11 = f14;
                f14 = f12;
                f15 = f13;
                f13 = f18;
                f10 = f15;
            }
        } else {
            f10 = fArr[3];
            if (f13 > f10) {
                f11 = fArr[2];
                f14 = f16;
                f15 = f17;
            } else {
                f11 = f12;
                f10 = f13;
                f12 = f16;
                f13 = f17;
            }
        }
        float f19 = (f13 - f10) / (f12 - f11);
        float f20 = (-1.0f) / f19;
        float f21 = f10 - (f19 * f11);
        float f22 = f10 - (f11 * f20);
        float f23 = f15 - (f19 * f14);
        float f24 = f15 - (f14 * f20);
        float fCenterY = rectF.centerY() - rectF.top;
        float fCenterX = rectF.centerX();
        float f25 = rectF.left;
        float f26 = fCenterY / (fCenterX - f25);
        float f27 = -f26;
        float f28 = rectF.top;
        float f29 = f28 - (f25 * f26);
        float f30 = rectF.right;
        float f31 = f28 - (f27 * f30);
        float f32 = f19 - f26;
        float f33 = (f29 - f21) / f32;
        float fMax = Math.max(fB, f33 < f30 ? f33 : fB);
        float f34 = (f29 - f22) / (f20 - f26);
        if (f34 >= rectF.right) {
            f34 = fMax;
        }
        float fMax2 = Math.max(fMax, f34);
        float f35 = f20 - f27;
        float f36 = (f31 - f24) / f35;
        float fMax3 = Math.max(fMax2, f36 < rectF.right ? f36 : fMax2);
        float f37 = (f31 - f22) / f35;
        if (f37 <= rectF.left) {
            f37 = fC;
        }
        float fMin = Math.min(fC, f37);
        float f38 = (f31 - f23) / (f19 - f27);
        if (f38 <= rectF.left) {
            f38 = fMin;
        }
        float fMin2 = Math.min(fMin, f38);
        float f39 = (f29 - f23) / f32;
        if (f39 <= rectF.left) {
            f39 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f39);
        float fMax4 = Math.max(fD, Math.max((f19 * fMax3) + f21, (f20 * fMin3) + f22));
        float fMin4 = Math.min(fW, Math.min((f20 * fMax3) + f24, (f19 * fMin3) + f23));
        RectF rectF2 = this.f97672t;
        rectF2.left = fMax3;
        rectF2.top = fMax4;
        rectF2.right = fMin3;
        rectF2.bottom = fMin4;
        return true;
    }

    private final void c(boolean z10) {
        try {
            b bVar = this.f97648h;
            if (bVar != null) {
                bVar.a(z10);
            }
        } catch (Exception unused) {
        }
    }

    private final void d(Canvas canvas) {
        RectF rectFI = this.f97646g.i();
        com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
        float fMax = Math.max(cVar.B(this.f97670s), 0.0f);
        float fMax2 = Math.max(cVar.D(this.f97670s), 0.0f);
        float fMin = Math.min(cVar.C(this.f97670s), getWidth());
        float fMin2 = Math.min(cVar.w(this.f97670s), getHeight());
        CropImageView.d dVar = this.f97661n3;
        int i10 = dVar == null ? -1 : d.f97679a[dVar.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            this.f97662o.reset();
            this.f97650i.set(rectFI.left, rectFI.top, rectFI.right, rectFI.bottom);
            this.f97662o.addOval(this.f97650i, Path.Direction.CW);
            canvas.save();
            canvas.clipOutPath(this.f97662o);
            Paint paint = this.f97658m;
            Intrinsics.checkNotNull(paint);
            canvas.drawRect(fMax, fMax2, fMin, fMin2, paint);
            canvas.restore();
            return;
        }
        if (!q()) {
            float f10 = rectFI.top;
            Paint paint2 = this.f97658m;
            Intrinsics.checkNotNull(paint2);
            canvas.drawRect(fMax, fMax2, fMin, f10, paint2);
            float f11 = rectFI.bottom;
            Paint paint3 = this.f97658m;
            Intrinsics.checkNotNull(paint3);
            canvas.drawRect(fMax, f11, fMin, fMin2, paint3);
            float f12 = rectFI.top;
            float f13 = rectFI.left;
            float f14 = rectFI.bottom;
            Paint paint4 = this.f97658m;
            Intrinsics.checkNotNull(paint4);
            canvas.drawRect(fMax, f12, f13, f14, paint4);
            float f15 = rectFI.right;
            float f16 = rectFI.top;
            float f17 = rectFI.bottom;
            Paint paint5 = this.f97658m;
            Intrinsics.checkNotNull(paint5);
            canvas.drawRect(f15, f16, fMin, f17, paint5);
            return;
        }
        this.f97662o.reset();
        Path path = this.f97662o;
        float[] fArr = this.f97670s;
        path.moveTo(fArr[0], fArr[1]);
        Path path2 = this.f97662o;
        float[] fArr2 = this.f97670s;
        path2.lineTo(fArr2[2], fArr2[3]);
        Path path3 = this.f97662o;
        float[] fArr3 = this.f97670s;
        path3.lineTo(fArr3[4], fArr3[5]);
        Path path4 = this.f97662o;
        float[] fArr4 = this.f97670s;
        path4.lineTo(fArr4[6], fArr4[7]);
        this.f97662o.close();
        canvas.save();
        canvas.clipOutPath(this.f97662o);
        canvas.clipRect(rectFI, Region.Op.XOR);
        Paint paint6 = this.f97658m;
        Intrinsics.checkNotNull(paint6);
        canvas.drawRect(fMax, fMax2, fMin, fMin2, paint6);
        canvas.restore();
    }

    private final void e(Canvas canvas) {
        int i10;
        Paint paint = this.f97652j;
        if (paint != null) {
            Intrinsics.checkNotNull(paint);
            float strokeWidth = paint.getStrokeWidth();
            RectF rectFI = this.f97646g.i();
            float f10 = strokeWidth / 2;
            rectFI.inset(f10, f10);
            CropImageView.d dVar = this.f97661n3;
            if (dVar == null) {
                i10 = -1;
                int i11 = 6 | (-1);
            } else {
                i10 = d.f97679a[dVar.ordinal()];
            }
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                Paint paint2 = this.f97652j;
                Intrinsics.checkNotNull(paint2);
                canvas.drawRect(rectFI, paint2);
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                Paint paint3 = this.f97652j;
                Intrinsics.checkNotNull(paint3);
                canvas.drawOval(rectFI, paint3);
            }
        }
    }

    private final void f(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        float f13 = rectF.left - f11;
        float f14 = rectF.top - f11;
        Paint paint = this.f97654k;
        Intrinsics.checkNotNull(paint);
        canvas.drawCircle(f13, f14, f12, paint);
        float f15 = rectF.right + f11;
        float f16 = rectF.top - f11;
        Paint paint2 = this.f97654k;
        Intrinsics.checkNotNull(paint2);
        canvas.drawCircle(f15, f16, f12, paint2);
        float f17 = rectF.left - f11;
        float f18 = rectF.bottom + f11;
        Paint paint3 = this.f97654k;
        Intrinsics.checkNotNull(paint3);
        canvas.drawCircle(f17, f18, f12, paint3);
        float f19 = rectF.right + f11;
        float f20 = rectF.bottom + f11;
        Paint paint4 = this.f97654k;
        Intrinsics.checkNotNull(paint4);
        canvas.drawCircle(f19, f20, f12, paint4);
    }

    private final void g(Canvas canvas, RectF rectF, float f10, float f11) {
        CropImageView.d dVar = this.f97661n3;
        int i10 = dVar == null ? -1 : d.f97679a[dVar.ordinal()];
        if (i10 == 1) {
            h(canvas, rectF, f10, f11, this.f97640a);
            return;
        }
        if (i10 == 2) {
            float fCenterX = rectF.centerX() - this.f97665p1;
            float f12 = rectF.top - f10;
            float fCenterX2 = rectF.centerX() + this.f97665p1;
            float f13 = rectF.top - f10;
            Paint paint = this.f97654k;
            Intrinsics.checkNotNull(paint);
            canvas.drawLine(fCenterX, f12, fCenterX2, f13, paint);
            float fCenterX3 = rectF.centerX() - this.f97665p1;
            float f14 = rectF.bottom + f10;
            float fCenterX4 = rectF.centerX() + this.f97665p1;
            float f15 = rectF.bottom + f10;
            Paint paint2 = this.f97654k;
            Intrinsics.checkNotNull(paint2);
            canvas.drawLine(fCenterX3, f14, fCenterX4, f15, paint2);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            l(canvas, rectF, f10, f11);
            return;
        }
        float f16 = rectF.left - f10;
        float fCenterY = rectF.centerY() - this.f97665p1;
        float f17 = rectF.left - f10;
        float fCenterY2 = rectF.centerY() + this.f97665p1;
        Paint paint3 = this.f97654k;
        Intrinsics.checkNotNull(paint3);
        canvas.drawLine(f16, fCenterY, f17, fCenterY2, paint3);
        float f18 = rectF.right + f10;
        float fCenterY3 = rectF.centerY() - this.f97665p1;
        float f19 = rectF.right + f10;
        float fCenterY4 = rectF.centerY() + this.f97665p1;
        Paint paint4 = this.f97654k;
        Intrinsics.checkNotNull(paint4);
        canvas.drawLine(f18, fCenterY3, f19, fCenterY4, paint4);
    }

    private final void h(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        CropImageView.b bVar = this.f97663o3;
        int i10 = bVar == null ? -1 : d.f97680b[bVar.ordinal()];
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new k0();
                }
                l(canvas, rectF, f10, f11);
                return;
            }
            f(canvas, rectF, f10, f11, f12);
        }
    }

    private final void i(Canvas canvas) {
        float strokeWidth;
        Paint paintG;
        if (this.f97654k != null) {
            Paint paint = this.f97652j;
            if (paint != null) {
                Intrinsics.checkNotNull(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            Paint paint2 = this.f97654k;
            Intrinsics.checkNotNull(paint2);
            float strokeWidth2 = paint2.getStrokeWidth();
            float f10 = 2;
            float f11 = (strokeWidth2 - strokeWidth) / f10;
            float f12 = strokeWidth2 / f10;
            float f13 = f12 + f11;
            CropImageView.d dVar = this.f97661n3;
            int i10 = dVar == null ? -1 : d.f97679a[dVar.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                f12 += this.f97664p0;
            } else if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF rectFI = this.f97646g.i();
            rectFI.inset(f12, f12);
            g(canvas, rectFI, f11, f13);
            if (this.f97663o3 == CropImageView.b.OVAL) {
                Integer num = this.f97641b;
                if (num != null) {
                    paintG = f97639w3.g(num.intValue());
                } else {
                    paintG = null;
                }
                this.f97654k = paintG;
                g(canvas, rectFI, f11, f13);
            }
        }
    }

    private final void j(Canvas canvas) {
        if (this.f97667p3) {
            RectF rectFI = this.f97646g.i();
            float f10 = (rectFI.left + rectFI.right) / 2;
            float f11 = rectFI.top - 50;
            Paint paint = this.f97660n;
            if (paint != null) {
                paint.setTextSize(this.f97669r3);
                paint.setColor(this.f97671s3);
            }
            String str = this.f97668q3;
            Paint paint2 = this.f97660n;
            Intrinsics.checkNotNull(paint2);
            canvas.drawText(str, f10, f11, paint2);
            canvas.save();
        }
    }

    private final void k(Canvas canvas) {
        float strokeWidth;
        if (this.f97656l != null) {
            Paint paint = this.f97652j;
            if (paint != null) {
                Intrinsics.checkNotNull(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            RectF rectFI = this.f97646g.i();
            rectFI.inset(strokeWidth, strokeWidth);
            float f10 = 3;
            float fWidth = rectFI.width() / f10;
            float fHeight = rectFI.height() / f10;
            CropImageView.d dVar = this.f97661n3;
            int i10 = dVar == null ? -1 : d.f97679a[dVar.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                float f11 = rectFI.left + fWidth;
                float f12 = rectFI.right - fWidth;
                float f13 = rectFI.top;
                float f14 = rectFI.bottom;
                Paint paint2 = this.f97656l;
                Intrinsics.checkNotNull(paint2);
                canvas.drawLine(f11, f13, f11, f14, paint2);
                float f15 = rectFI.top;
                float f16 = rectFI.bottom;
                Paint paint3 = this.f97656l;
                Intrinsics.checkNotNull(paint3);
                canvas.drawLine(f12, f15, f12, f16, paint3);
                float f17 = rectFI.top + fHeight;
                float f18 = rectFI.bottom - fHeight;
                float f19 = rectFI.left;
                float f20 = rectFI.right;
                Paint paint4 = this.f97656l;
                Intrinsics.checkNotNull(paint4);
                canvas.drawLine(f19, f17, f20, f17, paint4);
                float f21 = rectFI.left;
                float f22 = rectFI.right;
                Paint paint5 = this.f97656l;
                Intrinsics.checkNotNull(paint5);
                canvas.drawLine(f21, f18, f22, f18, paint5);
                return;
            }
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            float f23 = 2;
            float fWidth2 = (rectFI.width() / f23) - strokeWidth;
            float fHeight2 = (rectFI.height() / f23) - strokeWidth;
            float f24 = rectFI.left + fWidth;
            float f25 = rectFI.right - fWidth;
            float fSin = (float) (((double) fHeight2) * Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)));
            float f26 = (rectFI.top + fHeight2) - fSin;
            float f27 = (rectFI.bottom - fHeight2) + fSin;
            Paint paint6 = this.f97656l;
            Intrinsics.checkNotNull(paint6);
            canvas.drawLine(f24, f26, f24, f27, paint6);
            float f28 = (rectFI.top + fHeight2) - fSin;
            float f29 = (rectFI.bottom - fHeight2) + fSin;
            Paint paint7 = this.f97656l;
            Intrinsics.checkNotNull(paint7);
            canvas.drawLine(f25, f28, f25, f29, paint7);
            float f30 = rectFI.top + fHeight;
            float f31 = rectFI.bottom - fHeight;
            float fCos = (float) (((double) fWidth2) * Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)));
            float f32 = (rectFI.left + fWidth2) - fCos;
            float f33 = (rectFI.right - fWidth2) + fCos;
            Paint paint8 = this.f97656l;
            Intrinsics.checkNotNull(paint8);
            canvas.drawLine(f32, f30, f33, f30, paint8);
            float f34 = (rectFI.left + fWidth2) - fCos;
            float f35 = (rectFI.right - fWidth2) + fCos;
            Paint paint9 = this.f97656l;
            Intrinsics.checkNotNull(paint9);
            canvas.drawLine(f34, f31, f35, f31, paint9);
        }
    }

    private final void l(Canvas canvas, RectF rectF, float f10, float f11) {
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = f13 + this.f97665p1;
        Paint paint = this.f97654k;
        Intrinsics.checkNotNull(paint);
        canvas.drawLine(f12 - f10, f13 - f11, f12 - f10, f14, paint);
        float f15 = rectF.left;
        float f16 = rectF.top;
        Paint paint2 = this.f97654k;
        Intrinsics.checkNotNull(paint2);
        canvas.drawLine(f15 - f11, f16 - f10, f15 + this.f97665p1, f16 - f10, paint2);
        float f17 = rectF.right;
        float f18 = rectF.top;
        float f19 = f18 + this.f97665p1;
        Paint paint3 = this.f97654k;
        Intrinsics.checkNotNull(paint3);
        canvas.drawLine(f17 + f10, f18 - f11, f17 + f10, f19, paint3);
        float f20 = rectF.right;
        float f21 = rectF.top;
        Paint paint4 = this.f97654k;
        Intrinsics.checkNotNull(paint4);
        canvas.drawLine(f20 + f11, f21 - f10, f20 - this.f97665p1, f21 - f10, paint4);
        float f22 = rectF.left;
        float f23 = rectF.bottom;
        float f24 = f23 - this.f97665p1;
        Paint paint5 = this.f97654k;
        Intrinsics.checkNotNull(paint5);
        canvas.drawLine(f22 - f10, f23 + f11, f22 - f10, f24, paint5);
        float f25 = rectF.left;
        float f26 = rectF.bottom;
        Paint paint6 = this.f97654k;
        Intrinsics.checkNotNull(paint6);
        canvas.drawLine(f25 - f11, f26 + f10, f25 + this.f97665p1, f26 + f10, paint6);
        float f27 = rectF.right;
        float f28 = rectF.bottom;
        float f29 = f28 - this.f97665p1;
        Paint paint7 = this.f97654k;
        Intrinsics.checkNotNull(paint7);
        canvas.drawLine(f27 + f10, f28 + f11, f27 + f10, f29, paint7);
        float f30 = rectF.right;
        float f31 = rectF.bottom;
        Paint paint8 = this.f97654k;
        Intrinsics.checkNotNull(paint8);
        canvas.drawLine(f30 + f11, f31 + f10, f30 - this.f97665p1, f31 + f10, paint8);
    }

    private final void m(RectF rectF) {
        if (rectF.width() < this.f97646g.f()) {
            float f10 = (this.f97646g.f() - rectF.width()) / 2;
            rectF.left -= f10;
            rectF.right += f10;
        }
        if (rectF.height() < this.f97646g.e()) {
            float fE = (this.f97646g.e() - rectF.height()) / 2;
            rectF.top -= fE;
            rectF.bottom += fE;
        }
        if (rectF.width() > this.f97646g.d()) {
            float fWidth = (rectF.width() - this.f97646g.d()) / 2;
            rectF.left += fWidth;
            rectF.right -= fWidth;
        }
        if (rectF.height() > this.f97646g.c()) {
            float fHeight = (rectF.height() - this.f97646g.c()) / 2;
            rectF.top += fHeight;
            rectF.bottom -= fHeight;
        }
        b(rectF);
        if (this.f97672t.width() > 0.0f && this.f97672t.height() > 0.0f) {
            float fMax = Math.max(this.f97672t.left, 0.0f);
            float fMax2 = Math.max(this.f97672t.top, 0.0f);
            float fMin = Math.min(this.f97672t.right, getWidth());
            float fMin2 = Math.min(this.f97672t.bottom, getHeight());
            if (rectF.left < fMax) {
                rectF.left = fMax;
            }
            if (rectF.top < fMax2) {
                rectF.top = fMax2;
            }
            if (rectF.right > fMin) {
                rectF.right = fMin;
            }
            if (rectF.bottom > fMin2) {
                rectF.bottom = fMin2;
            }
        }
        if (this.f97651i3 && Math.abs(rectF.width() - (rectF.height() * this.f97657l3)) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f97657l3) {
                float fAbs = Math.abs((rectF.height() * this.f97657l3) - rectF.width()) / 2;
                rectF.left += fAbs;
                rectF.right -= fAbs;
            } else {
                float fAbs2 = Math.abs((rectF.width() / this.f97657l3) - rectF.height()) / 2;
                rectF.top += fAbs2;
                rectF.bottom -= fAbs2;
            }
        }
    }

    private final void o() {
        com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
        float fMax = Math.max(cVar.B(this.f97670s), 0.0f);
        float fMax2 = Math.max(cVar.D(this.f97670s), 0.0f);
        float fMin = Math.min(cVar.C(this.f97670s), getWidth());
        float fMin2 = Math.min(cVar.w(this.f97670s), getHeight());
        if (fMin > fMax && fMin2 > fMax2) {
            RectF rectF = new RectF();
            this.f97674u3 = true;
            float f10 = this.H1;
            float f11 = fMin - fMax;
            float f12 = f10 * f11;
            float f13 = fMin2 - fMax2;
            float f14 = f10 * f13;
            if (this.f97673t3.width() > 0 && this.f97673t3.height() > 0) {
                rectF.left = (this.f97673t3.left / this.f97646g.n()) + fMax;
                rectF.top = (this.f97673t3.top / this.f97646g.m()) + fMax2;
                rectF.right = rectF.left + (this.f97673t3.width() / this.f97646g.n());
                rectF.bottom = rectF.top + (this.f97673t3.height() / this.f97646g.m());
                rectF.left = Math.max(fMax, rectF.left);
                rectF.top = Math.max(fMax2, rectF.top);
                rectF.right = Math.min(fMin, rectF.right);
                rectF.bottom = Math.min(fMin2, rectF.bottom);
            } else if (!this.f97651i3 || fMin <= fMax || fMin2 <= fMax2) {
                rectF.left = fMax + f12;
                rectF.top = fMax2 + f14;
                rectF.right = fMin - f12;
                rectF.bottom = fMin2 - f14;
            } else if (f11 / f13 > this.f97657l3) {
                rectF.top = fMax2 + f14;
                rectF.bottom = fMin2 - f14;
                float width = getWidth() / 2.0f;
                this.f97657l3 = this.f97653j3 / this.f97655k3;
                float fMax3 = Math.max(this.f97646g.f(), rectF.height() * this.f97657l3) / 2.0f;
                rectF.left = width - fMax3;
                rectF.right = width + fMax3;
            } else {
                rectF.left = fMax + f12;
                rectF.right = fMin - f12;
                float height = getHeight() / 2.0f;
                float fMax4 = Math.max(this.f97646g.e(), rectF.width() / this.f97657l3) / 2.0f;
                rectF.top = height - fMax4;
                rectF.bottom = height + fMax4;
            }
            m(rectF);
            this.f97646g.w(rectF);
        }
    }

    private final boolean q() {
        float[] fArr = this.f97670s;
        if (fArr[0] != fArr[6]) {
            int i10 = 1 & 7;
            if (fArr[1] != fArr[7]) {
                return true;
            }
        }
        return false;
    }

    private final void r(float f10, float f11) {
        g gVar = this.f97646g;
        float f12 = this.f97666p2;
        CropImageView.d dVar = this.f97661n3;
        Intrinsics.checkNotNull(dVar);
        h hVarG = gVar.g(f10, f11, f12, dVar, this.f97645f);
        this.f97649h3 = hVarG;
        if (hVarG != null) {
            invalidate();
        }
    }

    private final void s(float f10, float f11) {
        if (this.f97649h3 != null) {
            float f12 = this.f97647g3;
            RectF rectFI = this.f97646g.i();
            if (b(rectFI)) {
                f12 = 0.0f;
            }
            h hVar = this.f97649h3;
            Intrinsics.checkNotNull(hVar);
            hVar.l(rectFI, f10, f11, this.f97672t, this.f97675v, this.f97677w, f12, this.f97651i3, this.f97657l3);
            this.f97646g.w(rectFI);
            c(true);
            invalidate();
        }
    }

    private final void t() {
        if (this.f97649h3 != null) {
            this.f97649h3 = null;
            c(false);
            invalidate();
        }
    }

    public final void A(int i10, int i11) {
        this.f97646g.v(i10, i11);
    }

    public final boolean B(boolean z10) {
        if (this.f97644e == z10) {
            return false;
        }
        this.f97644e = z10;
        if (!z10 || this.f97643d != null) {
            return true;
        }
        this.f97643d = new ScaleGestureDetector(getContext(), new c());
        return true;
    }

    public final int getAspectRatioX() {
        return this.f97653j3;
    }

    public final int getAspectRatioY() {
        return this.f97655k3;
    }

    @Nullable
    public final CropImageView.b getCornerShape() {
        return this.f97663o3;
    }

    @Nullable
    public final CropImageView.d getCropShape() {
        return this.f97661n3;
    }

    @NotNull
    public final RectF getCropWindowRect() {
        return this.f97646g.i();
    }

    @Nullable
    public final CropImageView.e getGuidelines() {
        return this.f97659m3;
    }

    @Nullable
    public final Rect getInitialCropWindowRect() {
        return this.f97673t3;
    }

    public final void n() {
        RectF cropWindowRect = getCropWindowRect();
        m(cropWindowRect);
        this.f97646g.w(cropWindowRect);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        d(canvas);
        if (this.f97646g.x()) {
            CropImageView.e eVar = this.f97659m3;
            if (eVar == CropImageView.e.ON) {
                k(canvas);
            } else if (eVar == CropImageView.e.ON_TOUCH && this.f97649h3 != null) {
                k(canvas);
            }
        }
        a aVar = f97639w3;
        CropImageOptions cropImageOptions = this.f97642c;
        this.f97654k = aVar.f(cropImageOptions != null ? cropImageOptions.f97542p1 : 0.0f, cropImageOptions != null ? cropImageOptions.f97524g3 : -1);
        j(canvas);
        e(canvas);
        i(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        ScaleGestureDetector scaleGestureDetector;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        if (this.f97644e && (scaleGestureDetector = this.f97643d) != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            r(event.getX(), event.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                s(event.getX(), event.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        t();
        return true;
    }

    public final boolean p() {
        return this.f97651i3;
    }

    public final void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f97653j3 != i10) {
            this.f97653j3 = i10;
            this.f97657l3 = i10 / this.f97655k3;
            if (this.f97674u3) {
                o();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f97655k3 != i10) {
            this.f97655k3 = i10;
            this.f97657l3 = this.f97653j3 / i10;
            if (this.f97674u3) {
                o();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float f10) {
        this.f97640a = f10;
    }

    public final void setCropCornerShape(@NotNull CropImageView.b cropCornerShape) {
        Intrinsics.checkNotNullParameter(cropCornerShape, "cropCornerShape");
        if (this.f97663o3 != cropCornerShape) {
            this.f97663o3 = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(@Nullable String str) {
        if (str != null) {
            this.f97668q3 = str;
        }
    }

    public final void setCropLabelTextColor(int i10) {
        this.f97671s3 = i10;
        invalidate();
    }

    public final void setCropLabelTextSize(float f10) {
        this.f97669r3 = f10;
        invalidate();
    }

    public final void setCropShape(@NotNull CropImageView.d cropShape) {
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        if (this.f97661n3 != cropShape) {
            this.f97661n3 = cropShape;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(@Nullable b bVar) {
        this.f97648h = bVar;
    }

    public final void setCropWindowRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f97646g.w(rect);
    }

    public final void setCropperTextLabelVisibility(boolean z10) {
        this.f97667p3 = z10;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean z10) {
        if (this.f97651i3 != z10) {
            this.f97651i3 = z10;
            if (this.f97674u3) {
                o();
                invalidate();
            }
        }
    }

    public final void setGuidelines(@NotNull CropImageView.e guidelines) {
        Intrinsics.checkNotNullParameter(guidelines, "guidelines");
        if (this.f97659m3 != guidelines) {
            this.f97659m3 = guidelines;
            if (this.f97674u3) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(@NotNull CropImageOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f97642c = options;
        this.f97646g.t(options);
        setCropLabelTextColor(options.P3);
        setCropLabelTextSize(options.O3);
        setCropLabelText(options.Q3);
        setCropperTextLabelVisibility(options.f97531k);
        setCropCornerRadius(options.f97521e);
        setCropCornerShape(options.f97520d);
        setCropShape(options.f97519c);
        setSnapRadius(options.f97522f);
        setGuidelines(options.f97525h);
        setFixedAspectRatio(options.f97554w);
        setAspectRatioX(options.X);
        setAspectRatioY(options.Y);
        B(options.f97539o);
        x(options.f97547s);
        this.f97666p2 = options.f97523g;
        this.H1 = options.f97552v;
        a aVar = f97639w3;
        this.f97652j = aVar.f(options.Z, options.f97541p0);
        this.f97664p0 = options.H1;
        this.f97665p1 = options.f97543p2;
        this.f97641b = Integer.valueOf(options.f97526h3);
        this.f97654k = aVar.f(options.f97542p1, options.f97524g3);
        this.f97656l = aVar.f(options.f97528i3, options.f97530j3);
        this.f97658m = aVar.e(options.f97532k3);
        this.f97660n = aVar.h(options);
    }

    public final void setInitialCropWindowRect(@Nullable Rect rect) {
        Rect rect2 = this.f97673t3;
        if (rect == null) {
            rect = com.canhub.cropper.core.c.f97737a.p();
        }
        rect2.set(rect);
        if (this.f97674u3) {
            o();
            invalidate();
            c(false);
        }
    }

    public final void setSnapRadius(float f10) {
        this.f97647g3 = f10;
    }

    public final void u() {
        if (this.f97674u3) {
            setCropWindowRect(com.canhub.cropper.core.c.f97737a.q());
            o();
            invalidate();
        }
    }

    public final void v() {
        if (this.f97674u3) {
            o();
            invalidate();
            c(false);
        }
    }

    public final void w(@Nullable float[] fArr, int i10, int i11) {
        if (fArr == null || !Arrays.equals(this.f97670s, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f97670s, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f97670s, 0, fArr.length);
            }
            this.f97675v = i10;
            this.f97677w = i11;
            RectF rectFI = this.f97646g.i();
            if (rectFI.width() == 0.0f || rectFI.height() == 0.0f) {
                o();
            }
        }
    }

    public final boolean x(boolean z10) {
        if (this.f97645f == z10) {
            return false;
        }
        this.f97645f = z10;
        return true;
    }

    public final void y(float f10, float f11, float f12, float f13) {
        this.f97646g.s(f10, f11, f12, f13);
    }

    public final void z(int i10, int i11) {
        this.f97646g.u(i10, i11);
    }

    @j
    public CropOverlayView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f97645f = true;
        this.f97646g = new g();
        this.f97650i = new RectF();
        this.f97662o = new Path();
        this.f97670s = new float[8];
        this.f97672t = new RectF();
        this.f97657l3 = this.f97653j3 / this.f97655k3;
        this.f97668q3 = "";
        this.f97669r3 = 20.0f;
        this.f97671s3 = -1;
        this.f97673t3 = new Rect();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CropOverlayView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            attributeSet = null;
            int i11 = 2 & 0;
        }
        this(context, attributeSet);
    }
}

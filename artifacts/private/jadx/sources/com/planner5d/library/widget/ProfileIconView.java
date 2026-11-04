package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class ProfileIconView extends View implements com.planner5d.library.services.bitmaploader.target.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f249491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f249492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f249493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f249494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bitmap f249495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f249496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f249497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f249498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f249499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ColorStateList f249500j;

    public ProfileIconView(Context context) {
        this(context, null);
    }

    public final void a(@androidx.annotation.v int i10, float f10) {
        b(BitmapFactory.decodeResource(getResources(), i10), f10);
    }

    public final void b(Bitmap bitmap, float f10) {
        Bitmap bitmapCreateScaledBitmap;
        if (bitmap == null) {
            bitmapCreateScaledBitmap = null;
        } else {
            int i10 = (int) f10;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i10, true);
        }
        this.f249495e = bitmapCreateScaledBitmap;
        this.f249496f = f10 / 2.0f;
        if (bitmap != null) {
            this.f249497g.set(0, 0, bitmapCreateScaledBitmap.getWidth(), this.f249495e.getHeight());
            this.f249498h.set(0.0f, 0.0f, f10, f10);
        }
        invalidate();
    }

    public float getImageSize() {
        return this.f249499i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        if (this.f249495e != null || this.f249493c != null || this.f249494d != null) {
            float f10 = this.f249496f;
            Paint paint = this.f249493c;
            canvas.drawCircle(f10, f10, f10 - (paint == null ? 0.0f : paint.getStrokeWidth() - 1.0f), this.f249492b);
        }
        Paint paint2 = this.f249494d;
        if (paint2 != null) {
            float f11 = this.f249496f;
            canvas.drawCircle(f11, f11, f11, paint2);
        }
        Bitmap bitmap = this.f249495e;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f249497g, this.f249498h, this.f249491a);
        }
        Paint paint3 = this.f249493c;
        if (paint3 != null) {
            paint3.setColor(this.f249500j.getColorForState(getDrawableState(), -16777216));
            float f12 = this.f249496f;
            canvas.drawCircle(f12, f12, f12 - (this.f249493c.getStrokeWidth() / 2.0f), this.f249493c);
        }
    }

    public final void setImageBitmap(@androidx.annotation.v int i10) {
        a(i10, this.f249499i);
    }

    public ProfileIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.planner5d.library.services.bitmaploader.target.m
    public void setImageBitmap(@androidx.annotation.p0 Bitmap bitmap) {
        b(bitmap, this.f249499i);
    }

    public ProfileIconView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint(3);
        this.f249491a = paint;
        Paint paint2 = new Paint(1);
        this.f249492b = paint2;
        this.f249495e = null;
        this.f249496f = 0.0f;
        this.f249497g = new Rect();
        this.f249498h = new RectF();
        setLayerType(1, null);
        paint2.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.Qv);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c1.s.Vv, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(c1.s.Tv, 0.0f);
        this.f249499i = typedArrayObtainStyledAttributes.getDimension(c1.s.Uv, 0.0f);
        if (dimension > 0.0f) {
            Paint paint3 = new Paint(3);
            this.f249493c = paint3;
            paint3.setStrokeWidth(dimension);
            this.f249500j = typedArrayObtainStyledAttributes.getColorStateList(c1.s.Sv);
            paint3.setStyle(Paint.Style.STROKE);
        } else {
            this.f249500j = null;
            this.f249493c = null;
        }
        if (typedArrayObtainStyledAttributes.hasValue(c1.s.Rv)) {
            Paint paint4 = new Paint(paint);
            this.f249494d = paint4;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setColor(typedArrayObtainStyledAttributes.getColor(c1.s.Rv, -16777216));
        } else {
            this.f249494d = null;
        }
        setImageBitmap(resourceId);
        typedArrayObtainStyledAttributes.recycle();
    }
}

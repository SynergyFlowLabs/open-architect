package com.planner5d.library.widget.editor.popup.properties.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class f extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f257998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f257999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f258000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f258001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f258002h;

    public f(Context context) {
        super(context);
        Paint paint = new Paint(3);
        this.f257998d = paint;
        Paint paint2 = new Paint(1);
        this.f257999e = paint2;
        this.f258000f = new Rect();
        this.f258001g = null;
        this.f258002h = null;
        paint2.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private void b(Bitmap bitmap, int i10) {
        this.f258001g = bitmap;
        this.f258002h = null;
        if (bitmap != null) {
            this.f258000f.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            this.f257997c.setColor(i10);
        }
        invalidateSelf();
    }

    private void c(Drawable drawable, int i10) {
        this.f258001g = null;
        this.f258002h = drawable;
        this.f257997c.setColor(i10);
        if (drawable != null) {
            int iWidth = drawable.getBounds().width();
            if (iWidth == 0) {
                iWidth = drawable.getIntrinsicWidth();
            }
            Rect rect = new Rect(0, 0, iWidth, iWidth);
            rect.offset(((int) this.f257996b.centerX()) - (rect.width() / 2), ((int) this.f257996b.centerY()) - (rect.height() / 2));
            drawable.setBounds(rect);
        }
        invalidateSelf();
    }

    @Override // com.planner5d.library.widget.editor.popup.properties.view.e
    public void a(Object[] objArr, int i10) {
        if (objArr == null || objArr.length <= 0) {
            c(null, i10);
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof Drawable) {
            c((Drawable) obj, i10);
        } else {
            b((Bitmap) obj, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.f257996b;
        float f10 = this.f257995a;
        canvas.drawRoundRect(rectF, f10, f10, this.f258001g == null ? this.f257997c : this.f257999e);
        Bitmap bitmap = this.f258001g;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f258000f, this.f257996b, this.f257998d);
            return;
        }
        Drawable drawable = this.f258002h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }
}

package com.planner5d.library.widget.editor.popup.properties.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f[] f258003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f258004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f258005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f258006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f258007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f258008i;

    public g(Context context) {
        super(context);
        this.f258004e = new Rect();
        this.f258005f = new Rect();
        Paint paint = new Paint(1);
        this.f258006g = paint;
        this.f258008i = new boolean[]{true, true, true, true};
        Resources resources = context.getResources();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-855310);
        this.f257997c.setStyle(Paint.Style.STROKE);
        this.f257997c.setStrokeWidth(resources.getDimensionPixelSize(com.planner5d.library.f.g.Mg));
        this.f257997c.setColor(androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.f166379g2));
        Paint paint2 = new Paint(this.f257997c);
        this.f258007h = paint2;
        paint2.setPathEffect(new DashPathEffect(new float[]{resources.getDimensionPixelSize(com.planner5d.library.f.g.f166896bi), resources.getDimensionPixelSize(com.planner5d.library.f.g.f166918ci)}, 0.0f));
        this.f258003d = new f[]{new f(context), new f(context), new f(context), new f(context)};
    }

    @Override // com.planner5d.library.widget.editor.popup.properties.view.e
    public void a(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < objArr.length; i11++) {
            boolean[] zArr = this.f258008i;
            Object obj = objArr[i11];
            zArr[i11] = obj instanceof Drawable;
            this.f258003d[i11].a(new Object[]{obj}, 0);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i10 = 0;
        while (true) {
            f[] fVarArr = this.f258003d;
            if (i10 >= fVarArr.length) {
                return;
            }
            f fVar = fVarArr[i10];
            RectF rectF = fVar.f257996b;
            float f10 = this.f257995a;
            canvas.drawRoundRect(rectF, f10, f10, this.f258006g);
            fVar.draw(canvas);
            RectF rectF2 = fVar.f257996b;
            float f11 = this.f257995a;
            canvas.drawRoundRect(rectF2, f11, f11, this.f258008i[i10] ? this.f258007h : this.f257997c);
            i10++;
        }
    }

    @Override // com.planner5d.library.widget.editor.popup.properties.view.e, android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f258005f.set(getBounds());
        int iRound = Math.round(this.f258005f.width() * 0.058f);
        this.f258005f.inset(iRound, iRound);
        int iWidth = (this.f258005f.width() - iRound) / 2;
        int iHeight = (this.f258005f.height() - iRound) / 2;
        int i14 = 0;
        int i15 = 0;
        while (i14 < 2) {
            int i16 = 0;
            while (i16 < 2) {
                Rect rect = this.f258005f;
                int i17 = i16 == 0 ? rect.left : rect.right - iWidth;
                Rect rect2 = this.f258005f;
                int i18 = i14 == 0 ? rect2.left : rect2.right - iHeight;
                this.f258004e.set(i17, i18, i17 + iWidth, i18 + iHeight);
                this.f258003d[i15].setBounds(this.f258004e);
                i15++;
                i16++;
            }
            i14++;
        }
    }
}

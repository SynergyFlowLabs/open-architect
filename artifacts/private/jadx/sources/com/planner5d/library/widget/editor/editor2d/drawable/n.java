package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.manager.f2;
import com.planner5d.library.widget.editor.helper.x2;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes12.dex */
public class n extends i {
    private static final int A = 30;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Paint f255025x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Paint f255026y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private a f255027z;

    public n(ItemRoom itemRoom) {
        super(itemRoom);
        Paint paint = new Paint();
        this.f255025x = paint;
        Paint paint2 = new Paint();
        this.f255026y = paint2;
        this.f255027z = new a(com.planner5d.library.model.payments.a.f222474i, new PointF());
        boolean z10 = false | true;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setSubpixelText(true);
        paint.setHinting(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setTextSize(12.0f);
        paint2.setColor(855638016);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.i, com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(d dVar, boolean z10, @p0 Item item) {
        this.f255025x.setTypeface(dVar.a());
        super.b(dVar, z10, item);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.i, com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return -4;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.i
    protected void n(Canvas canvas, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        if (bVar.f258071b) {
            a aVarE = this.f255027z.e(this.f255025x, this.f254981p);
            canvas.drawRect(aVarE.f255031d, this.f255026y);
            canvas.drawText(aVarE.f255032e, aVarE.f255030c.centerX(), aVarE.f255030c.bottom, this.f255025x);
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.i
    public void r() {
        super.r();
        a aVar = this.f255027z;
        if (aVar != null) {
            this.f255027z = new a(aVar);
        }
    }

    public void w(String str, PointF pointF) {
        this.f255027z = new a(str, pointF);
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f255028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final PointF f255029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final RectF f255030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final RectF f255031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f255032e;

        /* JADX INFO: Access modifiers changed from: private */
        @m1
        public a e(Paint paint, ItemGround itemGround) {
            if (this.f255032e == null) {
                String str = z.a(this.f255028a, 30) + "(" + f2.n().l().c(x2.a(itemGround.getWallsInfo())) + ")";
                this.f255032e = str;
                float fMeasureText = paint.measureText(str) / 2.0f;
                float textSize = paint.getTextSize() / 2.0f;
                RectF rectF = this.f255030c;
                PointF pointF = this.f255029b;
                float f10 = pointF.x;
                float f11 = pointF.y;
                rectF.set(f10 - fMeasureText, f11 - textSize, f10 + fMeasureText, f11 + textSize);
                RectF rectF2 = this.f255031d;
                RectF rectF3 = this.f255030c;
                rectF2.set(rectF3.left - 5.0f, rectF3.top - 5.0f, rectF3.right + 5.0f, rectF3.bottom + 5.0f);
            }
            return this;
        }

        private a(a aVar) {
            this(aVar.f255028a, aVar.f255029b);
        }

        private a(String str, PointF pointF) {
            this.f255030c = new RectF();
            this.f255031d = new RectF();
            this.f255032e = null;
            this.f255028a = str;
            this.f255029b = pointF;
        }
    }
}

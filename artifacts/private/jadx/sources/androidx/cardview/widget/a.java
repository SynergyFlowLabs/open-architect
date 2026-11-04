package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
@w0(17)
class a extends c {

    /* JADX INFO: renamed from: androidx.cardview.widget.a$a, reason: collision with other inner class name */
    class C0045a implements g.a {
        C0045a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    a() {
    }

    @Override // androidx.cardview.widget.c, androidx.cardview.widget.e
    public void n() {
        g.f12093s = new C0045a();
    }
}

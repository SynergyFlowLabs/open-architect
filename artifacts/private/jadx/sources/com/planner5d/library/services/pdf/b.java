package com.planner5d.library.services.pdf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.content.res.i;
import com.planner5d.library.application.d;
import com.planner5d.library.f;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.model.n;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.services.utility.p0;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CyclicBarrier;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f224493s = "margin";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f224494t = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f224495a = 14;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f224496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap f224497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Point f224498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f224499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f224500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f224501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k1 f224502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n[] f224503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p0 f224504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1677b f224505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f224506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float[] f224507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String[] f224508n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f224509o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f224510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f224511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h f224512r;

    class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CyclicBarrier f224513h;

        a(CyclicBarrier cyclicBarrier) {
            this.f224513h = cyclicBarrier;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void g(Throwable th2) {
            h(null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void h(Bitmap bitmap) {
            try {
                this.f224513h.await();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.services.pdf.b$b, reason: collision with other inner class name */
    private static class C1677b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f224515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, Paint> f224516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f224517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final PointF f224518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final RectF f224519e;

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX INFO: renamed from: com.planner5d.library.services.pdf.b$b$a */
        static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f224520b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f224521c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final a f224522d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final a f224523e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f224524f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final a f224525g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final a f224526h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final a f224527i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final a f224528j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final a f224529k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final a f224530l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final a f224531m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final /* synthetic */ a[] f224532n;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f224533a;

            static {
                a aVar = new a("Left", 0, 1);
                f224520b = aVar;
                a aVar2 = new a("Center", 1, 2);
                f224521c = aVar2;
                a aVar3 = new a("Right", 2, 4);
                f224522d = aVar3;
                a aVar4 = new a("Top", 3, 8);
                f224523e = aVar4;
                a aVar5 = new a("Middle", 4, 16);
                f224524f = aVar5;
                a aVar6 = new a("Bottom", 5, 32);
                f224525g = aVar6;
                f224526h = new a("LeftTop", 6, aVar4.f224533a | aVar.f224533a);
                f224527i = new a("LeftBottom", 7, aVar.f224533a | aVar6.f224533a);
                f224528j = new a("RightBottom", 8, aVar3.f224533a | aVar6.f224533a);
                f224529k = new a("RightMiddle", 9, aVar3.f224533a | aVar5.f224533a);
                f224530l = new a("CenterMiddle", 10, aVar2.f224533a | aVar5.f224533a);
                f224531m = new a("CenterBottom", 11, aVar2.f224533a | aVar6.f224533a);
                f224532n = k();
            }

            private a(String str, int i10, int i11) {
                super(str, i10);
                this.f224533a = i11;
            }

            private static /* synthetic */ a[] k() {
                return new a[]{f224520b, f224521c, f224522d, f224523e, f224524f, f224525g, f224526h, f224527i, f224528j, f224529k, f224530l, f224531m};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f224532n.clone();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1677b e(String str, int i10, float f10) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTypeface(i.j(this.f224515a, i10));
            textPaint.setTextSize(f10);
            textPaint.setColor(-16777216);
            return d(str, textPaint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Canvas canvas, String str, float f10, float f11, float f12, float f13, String str2) {
            Paint paintI = i(str);
            if (paintI instanceof TextPaint) {
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str2, 0, str2.length(), (TextPaint) paintI, (int) (f12 - f10)).setMaxLines(3).setEllipsize(TextUtils.TruncateAt.END).build();
                canvas.save();
                canvas.translate(f10, (f11 + ((f13 - f11) / 2.0f)) - (staticLayoutBuild.getHeight() / 2.0f));
                staticLayoutBuild.draw(canvas);
                canvas.restore();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1677b g(Canvas canvas, String str, float f10, float f11, float f12, float f13, a aVar, String str2) {
            this.f224519e.set(f10, f11, f12, f13);
            return h(canvas, str, this.f224519e, aVar, str2);
        }

        private C1677b h(Canvas canvas, String str, RectF rectF, a aVar, String str2) {
            Paint paintI = i(str);
            if (paintI instanceof TextPaint) {
                str2 = TextUtils.ellipsize(str2, (TextPaint) paintI, rectF.width(), TextUtils.TruncateAt.END).toString();
            }
            paintI.getTextBounds(str2, 0, str2.length(), this.f224517c);
            paintI.setTextAlign(Paint.Align.LEFT);
            int i10 = aVar.f224533a;
            a aVar2 = a.f224521c;
            if ((i10 & aVar2.f224533a) == aVar2.f224533a) {
                this.f224518d.x = rectF.centerX() - this.f224517c.centerX();
            } else {
                int i11 = aVar.f224533a;
                a aVar3 = a.f224522d;
                if ((i11 & aVar3.f224533a) == aVar3.f224533a) {
                    this.f224518d.x = rectF.right - this.f224517c.width();
                } else {
                    this.f224518d.x = rectF.left;
                }
            }
            int i12 = aVar.f224533a;
            a aVar4 = a.f224525g;
            if ((i12 & aVar4.f224533a) == aVar4.f224533a) {
                this.f224518d.y = rectF.bottom;
            } else {
                int i13 = aVar.f224533a;
                a aVar5 = a.f224524f;
                if ((i13 & aVar5.f224533a) == aVar5.f224533a) {
                    this.f224518d.y = rectF.centerY() + (this.f224517c.height() / 2);
                } else {
                    this.f224518d.y = rectF.top + this.f224517c.height();
                }
            }
            PointF pointF = this.f224518d;
            canvas.drawText(str2, pointF.x, pointF.y, paintI);
            return this;
        }

        public C1677b d(String str, Paint paint) {
            if (!this.f224516b.containsKey(str)) {
                this.f224516b.put(str, paint);
                return this;
            }
            throw new RuntimeException("Paint already exists: " + str);
        }

        public Paint i(String str) {
            return this.f224516b.get(str);
        }

        private C1677b(Context context) {
            this.f224516b = new HashMap();
            this.f224517c = new Rect();
            this.f224518d = new PointF();
            this.f224519e = new RectF();
            this.f224515a = context;
        }
    }

    public b(Context context, d dVar, Drawable drawable, k1 k1Var, p0 p0Var, n[] nVarArr) {
        Point point = new Point(595, 841);
        this.f224498d = point;
        this.f224500f = new Rect();
        this.f224501g = new Rect();
        this.f224506l = 12;
        this.f224512r = new h();
        this.f224508n = new String[]{context.getString(f.s.Ot), context.getString(f.s.Pt), context.getString(f.s.Qt), context.getString(f.s.Rt), context.getString(f.s.St)};
        this.f224510p = context.getString(f.s.Mt);
        this.f224509o = context.getString(f.s.Tt);
        this.f224511q = context.getString(f.s.Kt);
        Rect rect = new Rect(40, 40, point.x - 12, point.y);
        this.f224499e = rect;
        rect.inset(16, 16);
        boolean z10 = false;
        for (n nVar : nVarArr) {
            if (!nVar.d(p0Var).isEmpty()) {
                z10 = true;
            }
        }
        int i10 = 5 & 4;
        float[] fArr = {this.f224499e.width() - 132, 30.0f, 102.0f, 0.0f, 0.0f};
        this.f224507m = fArr;
        if (z10) {
            fArr[0] = fArr[0] - 160.0f;
            fArr[4] = 80.0f;
            fArr[3] = 80.0f;
        }
        this.f224502h = k1Var;
        this.f224504j = p0Var;
        this.f224503i = nVarArr;
        td.a aVar = td.a.f380845a;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapB = aVar.b(758, 256, config);
        this.f224497c = bitmapB;
        k(bitmapB, androidx.core.content.d.l(context, f.h.Qd));
        if (drawable == null || !dVar.j()) {
            this.f224496b = null;
        } else {
            Bitmap bitmapB2 = aVar.b(28, 28, config);
            this.f224496b = bitmapB2;
            k(bitmapB2, drawable);
        }
        Paint paint = new Paint();
        paint.setColor(androidx.core.content.d.g(context, f.C1549f.Mh));
        this.f224505k = new C1677b(context).e("text_header", f.i.f167925d, 10.0f).e("text_footer", f.i.f167926e, 9.0f).e("text_table_header", f.i.f167923b, z10 ? 10.0f : 12.0f).e("text_table_footer", f.i.f167926e, 10.0f).e("text", f.i.f167926e, z10 ? 9.0f : 11.0f).d(f224493s, paint);
    }

    private int c(PdfDocument pdfDocument, int i10) {
        int i11 = 1;
        boolean z10 = this.f224503i[0].d(this.f224504j) != null;
        int i12 = z10 ? 50 : 62;
        String strJ = this.f224504j.j(new Date());
        Rect rect = this.f224499e;
        int i13 = rect.bottom;
        int i14 = rect.top;
        int i15 = i14 + 45;
        int i16 = 0;
        int i17 = 1;
        PdfDocument.Page pageD = null;
        Canvas canvas = null;
        int i18 = 0;
        while (true) {
            int i19 = i10;
            if (i18 >= this.f224503i.length) {
                m(pdfDocument, pageD);
                return i19;
            }
            if (i18 == 0 || i16 + i12 + 36 > i13) {
                if (pdfDocument == null) {
                    i19++;
                } else {
                    m(pdfDocument, pageD);
                    pageD = d(pdfDocument, i17);
                    canvas = pageD.getCanvas();
                    f(canvas);
                    e(canvas, strJ, 33);
                    h(canvas, z10, i15, 24);
                    i17++;
                }
                i16 = i14 + 69;
            }
            int i20 = i17;
            Canvas canvas2 = canvas;
            if (pdfDocument != null) {
                i(canvas2, i16, i12, this.f224503i[i18]);
                l(canvas2, i16 + i12);
            }
            i16 += i12;
            if (pdfDocument != null && z10 && i18 == this.f224503i.length - i11) {
                g(canvas2, i16, i12);
                i16 += i12;
            }
            if (pdfDocument != null && (i18 == this.f224503i.length - i11 || i16 + i12 + 36 > i13)) {
                C1677b c1677b = this.f224505k;
                Rect rect2 = this.f224499e;
                float f10 = rect2.left + 12;
                int i21 = rect2.bottom;
                c1677b.g(canvas2, "text_footer", f10, i21 - 14, rect2.right, i21 - 12, C1677b.a.f224527i, this.f224510p);
                C1677b c1677b2 = this.f224505k;
                Rect rect3 = this.f224499e;
                float f11 = rect3.left;
                int i22 = rect3.bottom;
                i10 = i19;
                c1677b2.g(canvas2, "text_footer", f11, i22 - 14, rect3.right - 12, i22 - 12, C1677b.a.f224528j, String.format(Locale.getDefault(), this.f224511q, Integer.valueOf(pageD.getInfo().getPageNumber()), Integer.valueOf(i10)));
            } else {
                i10 = i19;
            }
            i18++;
            canvas = canvas2;
            i17 = i20;
            z10 = z10;
            i12 = i12;
            i11 = 1;
        }
    }

    private PdfDocument.Page d(PdfDocument pdfDocument, int i10) {
        Point point = this.f224498d;
        return pdfDocument.startPage(new PdfDocument.PageInfo.Builder(point.x, point.y, i10).create());
    }

    private void e(Canvas canvas, String str, int i10) {
        this.f224501g.set(0, 0, this.f224497c.getWidth(), this.f224497c.getHeight());
        Rect rect = this.f224500f;
        Rect rect2 = this.f224499e;
        int i11 = rect2.left;
        int i12 = rect2.top;
        rect.set(i11, i12, i11 + 96, i12 + i10);
        canvas.drawBitmap(this.f224497c, this.f224501g, this.f224500f, (Paint) null);
        C1677b c1677b = this.f224505k;
        Rect rect3 = this.f224499e;
        float f10 = rect3.left;
        int i13 = rect3.top;
        c1677b.g(canvas, "text_header", f10, i13 + 18, rect3.right, i13 + i10, C1677b.a.f224528j, str);
    }

    private void f(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(-1);
        Point point = this.f224498d;
        canvas.drawRect(0.0f, 0.0f, point.x, point.y, this.f224505k.i(f224493s));
        Point point2 = this.f224498d;
        canvas.drawRect(40.0f, 40.0f, point2.x, point2.y, paint);
    }

    private void g(Canvas canvas, int i10, int i11) {
        n[] nVarArr = this.f224503i;
        if (nVarArr.length > 0) {
            float fE = 0.0f;
            for (n nVar : nVarArr) {
                fE += nVar.e();
            }
            C1677b c1677b = this.f224505k;
            Rect rect = this.f224499e;
            float f10 = rect.left;
            float f11 = i10;
            float f12 = rect.right - this.f224507m[4];
            float f13 = i10 + i11;
            C1677b.a aVar = C1677b.a.f224529k;
            c1677b.g(canvas, "text_table_footer", f10, f11, f12, f13, aVar, this.f224509o);
            C1677b c1677b2 = this.f224505k;
            Rect rect2 = this.f224499e;
            c1677b2.g(canvas, "text_table_footer", rect2.left, f11, rect2.right, f13, aVar, this.f224504j.B(fE, this.f224503i[0].b()));
        }
    }

    private void h(Canvas canvas, boolean z10, int i10, int i11) {
        Canvas canvas2;
        float f10 = i10 + i11;
        C1677b c1677b = this.f224505k;
        int i12 = this.f224499e.left;
        float f11 = i10;
        float f12 = i12 + this.f224507m[0];
        float f13 = f10 - 4.0f;
        C1677b.a aVar = C1677b.a.f224531m;
        c1677b.g(canvas, "text_table_header", i12, f11, f12, f13, aVar, this.f224508n[0]);
        C1677b c1677b2 = this.f224505k;
        int i13 = this.f224499e.left;
        float[] fArr = this.f224507m;
        float f14 = fArr[0];
        c1677b2.g(canvas, "text_table_header", i13 + f14, f11, i13 + f14 + fArr[1], f13, aVar, this.f224508n[1]);
        C1677b c1677b3 = this.f224505k;
        int i14 = this.f224499e.left;
        float[] fArr2 = this.f224507m;
        float f15 = fArr2[0];
        float f16 = fArr2[1];
        float f17 = i14 + f15 + f16 + fArr2[2];
        C1677b.a aVar2 = C1677b.a.f224528j;
        c1677b3.g(canvas, "text_table_header", i14 + f15 + f16, f11, f17, f13, aVar2, this.f224508n[2]);
        if (z10) {
            C1677b c1677b4 = this.f224505k;
            int i15 = this.f224499e.left;
            float[] fArr3 = this.f224507m;
            float f18 = fArr3[0];
            float f19 = fArr3[1];
            float f20 = fArr3[2];
            c1677b4.g(canvas, "text_table_header", i15 + f18 + f19 + f20, f11, i15 + f18 + f19 + f20 + fArr3[3], f13, aVar2, this.f224508n[3]);
            C1677b c1677b5 = this.f224505k;
            int i16 = this.f224499e.left;
            float[] fArr4 = this.f224507m;
            float f21 = fArr4[0];
            float f22 = fArr4[1];
            float f23 = fArr4[2];
            float f24 = fArr4[3];
            canvas2 = canvas;
            c1677b5.g(canvas2, "text_table_header", i16 + f21 + f22 + f23 + f24, f11, i16 + f21 + f22 + f23 + f24 + fArr4[4], f13, aVar2, this.f224508n[4]);
        } else {
            canvas2 = canvas;
        }
        l(canvas2, f10);
    }

    private void i(Canvas canvas, int i10, int i11, n nVar) {
        char c10;
        char c11;
        b bVar;
        boolean z10 = nVar.d(this.f224504j) != null;
        String strH = nVar.h();
        String strValueOf = String.valueOf(nVar.a());
        String strG = nVar.g();
        Rect rect = this.f224499e;
        Rect rect2 = new Rect(rect.left, i10, rect.right, i10 + i11);
        int iHeight = rect2.height() - (z10 ? 16 : 32);
        com.planner5d.library.services.bitmaploader.target.a aVarO = o(nVar, iHeight * 2);
        j(canvas, aVarO.c(), this.f224499e.left + 8, rect2.centerY() - (iHeight / 2), iHeight);
        this.f224512r.c(aVarO);
        float f10 = this.f224499e.left + iHeight + 30;
        String strJ = nVar.j();
        if (this.f224496b == null || strJ == null) {
            c10 = 0;
            c11 = 1;
            bVar = this;
            this.f224505k.f(canvas, "text", f10, rect2.top, this.f224507m[0] + this.f224499e.left, rect2.bottom, strH);
        } else {
            float f11 = 14.0f + f10 + 4.0f;
            Paint paintI = this.f224505k.i("text");
            TextPaint textPaint = (TextPaint) paintI;
            float f12 = this.f224507m[0] - f11;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String string = TextUtils.ellipsize(strJ, textPaint, f12, truncateAt).toString();
            c11 = 1;
            String string2 = TextUtils.ellipsize(strH, textPaint, this.f224507m[0] - f10, truncateAt).toString();
            paintI.getTextBounds(strJ, 0, strJ.length(), this.f224500f);
            int iCenterY = rect2.centerY() + 4 + this.f224500f.height();
            c10 = 0;
            j(canvas, this.f224496b, (int) f10, (this.f224500f.bottom + iCenterY) - 14, 14);
            canvas.drawText(string2, f10, rect2.centerY() - 4, paintI);
            canvas.drawText(string, f11, iCenterY, paintI);
            bVar = this;
        }
        C1677b c1677b = bVar.f224505k;
        int i12 = bVar.f224499e.left;
        float[] fArr = bVar.f224507m;
        float f13 = fArr[c10];
        c1677b.g(canvas, "text", i12 + f13, rect2.top, i12 + f13 + fArr[c11], rect2.bottom, C1677b.a.f224530l, strValueOf);
        C1677b c1677b2 = bVar.f224505k;
        int i13 = bVar.f224499e.left;
        float[] fArr2 = bVar.f224507m;
        float f14 = fArr2[c10];
        float f15 = fArr2[c11];
        float f16 = i13 + f14 + f15 + 8.0f;
        float f17 = rect2.top;
        float f18 = i13 + f14 + f15 + fArr2[2];
        float f19 = rect2.bottom;
        C1677b.a aVar = C1677b.a.f224529k;
        c1677b2.g(canvas, "text", f16, f17, f18, f19, aVar, strG);
        if (z10) {
            C1677b c1677b3 = bVar.f224505k;
            int i14 = bVar.f224499e.left;
            float[] fArr3 = bVar.f224507m;
            float f20 = fArr3[c10];
            float f21 = fArr3[c11];
            float f22 = fArr3[2];
            c1677b3.g(canvas, "text", i14 + f20 + f21 + f22, rect2.top, i14 + f20 + f21 + f22 + fArr3[3], rect2.bottom, aVar, nVar.d(bVar.f224504j));
            C1677b c1677b4 = bVar.f224505k;
            float f23 = bVar.f224499e.left;
            float[] fArr4 = bVar.f224507m;
            c1677b4.g(canvas, "text", f23 + fArr4[c10] + fArr4[c11] + fArr4[2] + fArr4[3], rect2.top, rect2.right, rect2.bottom, aVar, nVar.f(bVar.f224504j));
        }
    }

    private void j(Canvas canvas, Bitmap bitmap, int i10, int i11, int i12) {
        if (bitmap != null) {
            this.f224500f.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.f224501g.set(i10, i11, i10 + i12, i12 + i11);
            canvas.drawBitmap(bitmap, this.f224500f, this.f224501g, (Paint) null);
        }
    }

    private void k(Bitmap bitmap, Drawable drawable) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        drawable.draw(new Canvas(bitmap));
        drawable.setBounds(bounds);
    }

    private void l(Canvas canvas, float f10) {
        Paint paint = new Paint();
        paint.setStrokeWidth(0.4f);
        paint.setColor(-7829368);
        Rect rect = this.f224499e;
        canvas.drawLine(rect.left, f10, rect.right, f10, paint);
    }

    private void m(PdfDocument pdfDocument, PdfDocument.Page page) {
        if (pdfDocument == null || page == null) {
            return;
        }
        pdfDocument.finishPage(page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(Subscriber subscriber) {
        try {
            PdfDocument pdfDocument = new PdfDocument();
            c(pdfDocument, c(null, 0));
            subscriber.onNext(pdfDocument);
            subscriber.onCompleted();
            this.f224512r.a();
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
    }

    private com.planner5d.library.services.bitmaploader.target.a o(n nVar, int i10) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        a aVar = new a(cyclicBarrier);
        this.f224502h.c(nVar.c(), aVar, i10);
        try {
            cyclicBarrier.await();
        } catch (Exception unused) {
        }
        return aVar;
    }

    public Observable<PdfDocument> b() {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.services.pdf.a
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f224492a.n((Subscriber) obj);
            }
        });
    }
}

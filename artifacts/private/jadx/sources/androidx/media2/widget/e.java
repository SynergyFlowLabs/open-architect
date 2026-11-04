package androidx.media2.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.MediaFormat;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.d0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class e extends q.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f59664c = "Cea608CaptionRenderer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f59665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f59666b;

    class a extends h implements d.InterfaceC0558d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f59667i = "1234567890123456789012345678901234";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Rect f59668g;

        /* JADX INFO: renamed from: androidx.media2.widget.e$a$a, reason: collision with other inner class name */
        private class C0559a extends LinearLayout implements h.b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final int f59670c = 15;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final float f59671d = 0.9f;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b[] f59672a;

            C0559a(Context context) {
                super(context);
                this.f59672a = new b[15];
                setGravity(d0.f48643b);
                setOrientation(1);
                for (int i10 = 0; i10 < 15; i10++) {
                    this.f59672a[i10] = a.this.new b(getContext());
                    addView(this.f59672a[i10], -2, -2);
                }
            }

            @Override // androidx.media2.widget.h.b
            public void a(androidx.media2.widget.b bVar) {
                for (int i10 = 0; i10 < 15; i10++) {
                    this.f59672a[i10].l(bVar);
                }
            }

            @Override // androidx.media2.widget.h.b
            public void b(float f10) {
            }

            void c(SpannableStringBuilder[] spannableStringBuilderArr) {
                for (int i10 = 0; i10 < 15; i10++) {
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    if (spannableStringBuilder != null) {
                        this.f59672a[i10].setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                        this.f59672a[i10].setVisibility(0);
                    } else {
                        this.f59672a[i10].setVisibility(4);
                    }
                }
            }

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                int i14;
                int i15;
                int i16 = i12 - i10;
                int i17 = i13 - i11;
                int i18 = i16 * 3;
                int i19 = i17 * 4;
                if (i18 >= i19) {
                    i15 = i19 / 3;
                    i14 = i17;
                } else {
                    i14 = i18 / 4;
                    i15 = i16;
                }
                int i20 = (int) (i15 * f59671d);
                int i21 = (int) (i14 * f59671d);
                int i22 = (i16 - i20) / 2;
                int i23 = (i17 - i21) / 2;
                int i24 = 0;
                while (i24 < 15) {
                    i24++;
                    this.f59672a[i24].layout(i22, ((i21 * i24) / 15) + i23, i22 + i20, ((i21 * i24) / 15) + i23);
                }
            }

            @Override // android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i10, int i11) {
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int i12 = measuredWidth * 3;
                int i13 = measuredHeight * 4;
                if (i12 >= i13) {
                    measuredWidth = i13 / 3;
                } else {
                    measuredHeight = i12 / 4;
                }
                int i14 = (int) (measuredWidth * f59671d);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((int) (measuredHeight * f59671d)) / 15, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                for (int i15 = 0; i15 < 15; i15++) {
                    this.f59672a[i15].measure(iMakeMeasureSpec2, iMakeMeasureSpec);
                }
            }
        }

        private class b extends AppCompatTextView {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final float f59674i = 0.75f;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final float f59675j = 0.1f;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final float f59676k = 0.05f;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private float f59677a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f59678b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f59679c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f59680d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f59681e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f59682f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f59683g;

            b(Context context) {
                super(context);
                this.f59680d = -1;
                this.f59681e = -16777216;
                this.f59682f = 0;
                this.f59683g = 0;
                setGravity(17);
                setBackgroundColor(0);
                setTextColor(-1);
                setTypeface(Typeface.MONOSPACE);
                setVisibility(4);
                Resources resources = getContext().getResources();
                this.f59677a = resources.getDimensionPixelSize(n.d.f60055y);
                this.f59678b = resources.getDimensionPixelSize(n.d.A);
                this.f59679c = resources.getDimensionPixelSize(n.d.f60056z);
            }

            private void i(Canvas canvas) {
                TextPaint paint = getPaint();
                Paint.Style style = paint.getStyle();
                Paint.Join strokeJoin = paint.getStrokeJoin();
                float strokeWidth = paint.getStrokeWidth();
                setTextColor(this.f59683g);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setStrokeWidth(this.f59677a);
                super.onDraw(canvas);
                setTextColor(this.f59680d);
                paint.setStyle(style);
                paint.setStrokeJoin(strokeJoin);
                paint.setStrokeWidth(strokeWidth);
                k(0);
                super.onDraw(canvas);
                k(this.f59681e);
            }

            private void j(Canvas canvas) {
                TextPaint paint = getPaint();
                Paint.Style style = paint.getStyle();
                paint.setStyle(Paint.Style.FILL);
                boolean z10 = this.f59682f == 3;
                int i10 = z10 ? -1 : this.f59683g;
                int i11 = z10 ? this.f59683g : -1;
                float f10 = this.f59678b;
                float f11 = f10 / 2.0f;
                float f12 = -f11;
                setShadowLayer(f10, f12, f12, i10);
                super.onDraw(canvas);
                k(0);
                setShadowLayer(this.f59678b, f11, f11, i11);
                super.onDraw(canvas);
                paint.setStyle(style);
                k(this.f59681e);
            }

            private void k(int i10) {
                CharSequence text = getText();
                if (text instanceof Spannable) {
                    Spannable spannable = (Spannable) text;
                    for (d.e eVar : (d.e[]) spannable.getSpans(0, spannable.length(), d.e.class)) {
                        eVar.b(i10);
                    }
                }
            }

            void l(androidx.media2.widget.b bVar) {
                int i10 = bVar.f59597a;
                this.f59680d = i10;
                this.f59681e = bVar.f59598b;
                this.f59682f = bVar.f59599c;
                this.f59683g = bVar.f59600d;
                setTextColor(i10);
                if (this.f59682f == 2) {
                    float f10 = this.f59678b;
                    float f11 = this.f59679c;
                    setShadowLayer(f10, f11, f11, this.f59683g);
                } else {
                    setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                invalidate();
            }

            @Override // android.widget.TextView, android.view.View
            protected void onDraw(Canvas canvas) {
                int i10 = this.f59682f;
                if (i10 == -1 || i10 == 0 || i10 == 2) {
                    super.onDraw(canvas);
                } else if (i10 == 1) {
                    i(canvas);
                } else {
                    j(canvas);
                }
            }

            @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
            protected void onMeasure(int i10, int i11) {
                float size = View.MeasureSpec.getSize(i11) * 0.75f;
                setTextSize(0, size);
                this.f59677a = (0.1f * size) + 1.0f;
                float f10 = (size * f59676k) + 1.0f;
                this.f59678b = f10;
                this.f59679c = f10;
                setScaleX(1.0f);
                getPaint().getTextBounds(a.f59667i, 0, 34, a.this.f59668g);
                float fWidth = a.this.f59668g.width();
                float size2 = View.MeasureSpec.getSize(i10);
                if (fWidth != 0.0f) {
                    setScaleX(size2 / fWidth);
                }
                super.onMeasure(i10, i11);
            }
        }

        a(e eVar, Context context) {
            this(eVar, context, null);
        }

        @Override // androidx.media2.widget.d.InterfaceC0558d
        public androidx.media2.widget.b a() {
            return this.f59877c;
        }

        @Override // androidx.media2.widget.d.InterfaceC0558d
        public void e(SpannableStringBuilder[] spannableStringBuilderArr) {
            ((C0559a) this.f59879e).c(spannableStringBuilderArr);
            r.d.a aVar = this.f59878d;
            if (aVar != null) {
                aVar.a(this);
            }
        }

        @Override // androidx.media2.widget.h
        public h.b f(Context context) {
            return new C0559a(context);
        }

        a(e eVar, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        a(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f59668g = new Rect();
        }
    }

    static class b extends r {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final d f59685o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final a f59686p;

        b(a aVar, MediaFormat mediaFormat) {
            super(mediaFormat);
            this.f59686p = aVar;
            this.f59685o = new d(aVar);
        }

        @Override // androidx.media2.widget.r
        public r.d h() {
            return this.f59686p;
        }

        @Override // androidx.media2.widget.r
        public void l(byte[] bArr, boolean z10, long j10) {
            this.f59685o.g(bArr);
        }

        @Override // androidx.media2.widget.r
        public void t(ArrayList<r.b> arrayList) {
        }
    }

    e(@NonNull Context context) {
        this.f59665a = context;
    }

    @Override // androidx.media2.widget.q.f
    @NonNull
    public r a(@NonNull MediaFormat mediaFormat) {
        if ("text/cea-608".equals(mediaFormat.getString("mime"))) {
            if (this.f59666b == null) {
                this.f59666b = new a(this, this.f59665a);
            }
            return new b(this.f59666b, mediaFormat);
        }
        throw new RuntimeException("No matching format: " + mediaFormat.toString());
    }

    @Override // androidx.media2.widget.q.f
    public boolean b(@NonNull MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("mime")) {
            return "text/cea-608".equals(mediaFormat.getString("mime"));
        }
        return false;
    }
}

package io.noties.markwon.core;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.t0;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class c {
    protected static final int A = 75;
    private static final float[] B = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};
    protected static final int C = 25;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected static final int f297504x = 25;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final int f297505y = 25;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final float f297506z = 0.87f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f297507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f297508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f297509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f297510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f297511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f297512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final int f297513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final int f297514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final int f297515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final int f297516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final int f297517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final int f297518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final int f297519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Typeface f297520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Typeface f297521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final int f297522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final int f297523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final int f297524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final int f297525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final Typeface f297526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final float[] f297527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final int f297528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final int f297529w;

    protected c(@NonNull a aVar) {
        this.f297507a = aVar.f297530a;
        this.f297508b = aVar.f297531b;
        this.f297509c = aVar.f297532c;
        this.f297510d = aVar.f297533d;
        this.f297511e = aVar.f297534e;
        this.f297512f = aVar.f297535f;
        this.f297513g = aVar.f297536g;
        this.f297514h = aVar.f297537h;
        this.f297515i = aVar.f297538i;
        this.f297516j = aVar.f297539j;
        this.f297517k = aVar.f297540k;
        this.f297518l = aVar.f297541l;
        this.f297519m = aVar.f297542m;
        this.f297520n = aVar.f297543n;
        this.f297521o = aVar.f297544o;
        this.f297522p = aVar.f297545p;
        this.f297523q = aVar.f297546q;
        this.f297524r = aVar.f297547r;
        this.f297525s = aVar.f297548s;
        this.f297526t = aVar.f297549t;
        this.f297527u = aVar.f297550u;
        this.f297528v = aVar.f297551v;
        this.f297529w = aVar.f297552w;
    }

    @NonNull
    public static a j(@NonNull c cVar) {
        return new a(cVar);
    }

    @NonNull
    public static a k(@NonNull Context context) {
        io.noties.markwon.utils.b bVarB = io.noties.markwon.utils.b.b(context);
        return new a().F(bVarB.c(8)).x(bVarB.c(24)).z(bVarB.c(4)).B(bVarB.c(1)).N(bVarB.c(1)).U(bVarB.c(4));
    }

    @NonNull
    public static c l(@NonNull Context context) {
        return k(context).A();
    }

    @NonNull
    public static a m() {
        return new a();
    }

    public void a(@NonNull Paint paint) {
        int iA = this.f297511e;
        if (iA == 0) {
            iA = io.noties.markwon.utils.a.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
    }

    public void b(@NonNull Paint paint) {
        int i10 = this.f297516j;
        if (i10 == 0) {
            i10 = this.f297515i;
        }
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f297521o;
        if (typeface == null) {
            typeface = this.f297520n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f297523q;
            if (i11 <= 0) {
                i11 = this.f297522p;
            }
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f297523q;
        if (i12 <= 0) {
            i12 = this.f297522p;
        }
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(@NonNull Paint paint) {
        int i10 = this.f297515i;
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f297520n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f297522p;
            if (i11 > 0) {
                paint.setTextSize(i11);
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f297522p;
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(@NonNull Paint paint) {
        int iA = this.f297525s;
        if (iA == 0) {
            iA = io.noties.markwon.utils.a.a(paint.getColor(), 75);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f297524r;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public void e(@NonNull Paint paint, @g0(from = 1, to = 6) int i10) {
        Typeface typeface = this.f297526t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f297527u;
        if (fArr == null) {
            fArr = B;
        }
        if (fArr == null || fArr.length < i10) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i10), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i10 - 1]);
    }

    public void f(@NonNull Paint paint) {
        paint.setUnderlineText(this.f297508b);
        int i10 = this.f297507a;
        if (i10 != 0) {
            paint.setColor(i10);
        } else if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    public void g(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.f297508b);
        int i10 = this.f297507a;
        if (i10 != 0) {
            textPaint.setColor(i10);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void h(@NonNull Paint paint) {
        int color = this.f297512f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i10 = this.f297513g;
        if (i10 != 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public void i(@NonNull Paint paint) {
        int iA = this.f297528v;
        if (iA == 0) {
            iA = io.noties.markwon.utils.a.a(paint.getColor(), 25);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f297529w;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public int n() {
        return this.f297509c;
    }

    public int o() {
        int i10 = this.f297510d;
        return i10 == 0 ? (int) ((this.f297509c * 0.25f) + 0.5f) : i10;
    }

    public int p(int i10) {
        int iMin = Math.min(this.f297509c, i10) / 2;
        int i11 = this.f297514h;
        return (i11 == 0 || i11 > iMin) ? iMin : i11;
    }

    public int q(@NonNull Paint paint) {
        int i10 = this.f297517k;
        return i10 != 0 ? i10 : io.noties.markwon.utils.a.a(paint.getColor(), 25);
    }

    public int r(@NonNull Paint paint) {
        int i10 = this.f297518l;
        if (i10 == 0) {
            i10 = this.f297517k;
        }
        return i10 != 0 ? i10 : io.noties.markwon.utils.a.a(paint.getColor(), 25);
    }

    public int s() {
        return this.f297519m;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f297530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f297531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f297532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f297533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f297534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f297535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f297536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f297537h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f297538i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f297539j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f297540k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f297541l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f297542m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Typeface f297543n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Typeface f297544o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f297545p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f297546q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f297547r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f297548s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Typeface f297549t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private float[] f297550u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f297551v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f297552w;

        a() {
            this.f297531b = true;
            this.f297547r = -1;
            this.f297552w = -1;
        }

        @NonNull
        public c A() {
            return new c(this);
        }

        @NonNull
        public a B(@t0 int i10) {
            this.f297536g = i10;
            return this;
        }

        @NonNull
        public a C(@t0 int i10) {
            this.f297537h = i10;
            return this;
        }

        @NonNull
        public a D(@l int i10) {
            this.f297540k = i10;
            return this;
        }

        @NonNull
        public a E(@l int i10) {
            this.f297541l = i10;
            return this;
        }

        @NonNull
        public a F(@t0 int i10) {
            this.f297542m = i10;
            return this;
        }

        @NonNull
        public a G(@l int i10) {
            this.f297539j = i10;
            return this;
        }

        @NonNull
        public a H(@t0 int i10) {
            this.f297546q = i10;
            return this;
        }

        @NonNull
        public a I(@NonNull Typeface typeface) {
            this.f297544o = typeface;
            return this;
        }

        @NonNull
        public a J(@l int i10) {
            this.f297538i = i10;
            return this;
        }

        @NonNull
        public a K(@t0 int i10) {
            this.f297545p = i10;
            return this;
        }

        @NonNull
        public a L(@NonNull Typeface typeface) {
            this.f297543n = typeface;
            return this;
        }

        @NonNull
        public a M(@l int i10) {
            this.f297548s = i10;
            return this;
        }

        @NonNull
        public a N(@t0 int i10) {
            this.f297547r = i10;
            return this;
        }

        @NonNull
        public a O(@NonNull @d1(6) float[] fArr) {
            this.f297550u = fArr;
            return this;
        }

        @NonNull
        public a P(@NonNull Typeface typeface) {
            this.f297549t = typeface;
            return this;
        }

        @NonNull
        public a Q(boolean z10) {
            this.f297531b = z10;
            return this;
        }

        @NonNull
        public a R(@l int i10) {
            this.f297530a = i10;
            return this;
        }

        @NonNull
        public a S(@l int i10) {
            this.f297535f = i10;
            return this;
        }

        @NonNull
        public a T(@l int i10) {
            this.f297551v = i10;
            return this;
        }

        @NonNull
        public a U(@t0 int i10) {
            this.f297552w = i10;
            return this;
        }

        @NonNull
        public a x(@t0 int i10) {
            this.f297532c = i10;
            return this;
        }

        @NonNull
        public a y(@l int i10) {
            this.f297534e = i10;
            return this;
        }

        @NonNull
        public a z(@t0 int i10) {
            this.f297533d = i10;
            return this;
        }

        a(@NonNull c cVar) {
            this.f297531b = true;
            this.f297547r = -1;
            this.f297552w = -1;
            this.f297530a = cVar.f297507a;
            this.f297531b = cVar.f297508b;
            this.f297532c = cVar.f297509c;
            this.f297533d = cVar.f297510d;
            this.f297534e = cVar.f297511e;
            this.f297535f = cVar.f297512f;
            this.f297536g = cVar.f297513g;
            this.f297537h = cVar.f297514h;
            this.f297538i = cVar.f297515i;
            this.f297539j = cVar.f297516j;
            this.f297540k = cVar.f297517k;
            this.f297541l = cVar.f297518l;
            this.f297542m = cVar.f297519m;
            this.f297543n = cVar.f297520n;
            this.f297545p = cVar.f297522p;
            this.f297547r = cVar.f297524r;
            this.f297548s = cVar.f297525s;
            this.f297549t = cVar.f297526t;
            this.f297550u = cVar.f297527u;
            this.f297551v = cVar.f297528v;
            this.f297552w = cVar.f297529w;
        }
    }
}

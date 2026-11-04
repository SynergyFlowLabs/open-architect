package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class z0 {
    private static final String K = "SubtitlePainter";
    private static final float L = 0.125f;
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f70535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f70536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f70537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f70538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f70539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f70540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f70541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f70542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private CharSequence f70543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private Layout.Alignment f70544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private Bitmap f70545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f70546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f70547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f70548n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f70549o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f70550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f70551q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f70552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f70553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f70554t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f70555u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f70556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f70557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f70558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f70559y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f70560z;

    public z0(Context context) {
        int i10 = 5 & 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f70539e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f70538d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f70535a = fRound;
        this.f70536b = fRound;
        this.f70537c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f70540f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f70541g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f70542h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(@androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    @il.m({"cueBitmap", "bitmapRect"})
    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f70545k, (Rect) null, this.J, this.f70542h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        androidx.media3.common.util.a.g(this.J);
        androidx.media3.common.util.a.g(this.f70545k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f70555u) > 0) {
            this.f70541g.setColor(this.f70555u);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f70541g);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f70557w;
        if (i10 == 1) {
            this.f70540f.setStrokeJoin(Paint.Join.ROUND);
            this.f70540f.setStrokeWidth(this.f70535a);
            this.f70540f.setColor(this.f70556v);
            this.f70540f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f70540f;
            float f10 = this.f70536b;
            float f11 = this.f70537c;
            textPaint.setShadowLayer(f10, f11, f11, this.f70556v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f70556v;
            int i12 = z10 ? this.f70556v : -1;
            float f12 = this.f70536b / 2.0f;
            this.f70540f.setColor(this.f70553s);
            this.f70540f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f70540f.setShadowLayer(this.f70536b, f13, f13, i11);
            staticLayout2.draw(canvas2);
            this.f70540f.setShadowLayer(this.f70536b, f12, f12, i12);
        }
        this.f70540f.setColor(this.f70553s);
        this.f70540f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        int i13 = 0 << 0;
        this.f70540f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    @il.m({"cueBitmap"})
    private void f() {
        float f10;
        int i10;
        float f11;
        Bitmap bitmap = this.f70545k;
        int i11 = this.C;
        int i12 = this.A;
        int i13 = this.D;
        int i14 = this.B;
        float f12 = i11 - i12;
        float f13 = i12 + (this.f70549o * f12);
        float f14 = i13 - i14;
        float f15 = i14 + (this.f70546l * f14);
        int iRound = Math.round(f12 * this.f70551q);
        float f16 = this.f70552r;
        int iRound2 = f16 != -3.4028235E38f ? Math.round(f14 * f16) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i15 = this.f70550p;
        if (i15 != 2) {
            if (i15 == 1) {
                f10 = iRound / 2;
            }
            int iRound3 = Math.round(f13);
            i10 = this.f70548n;
            if (i10 == 2) {
                if (i10 == 1) {
                    f11 = iRound2 / 2;
                }
                int iRound4 = Math.round(f15);
                this.J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f11 = iRound2;
            f15 -= f11;
            int iRound5 = Math.round(f15);
            this.J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f10 = iRound;
        f13 -= f10;
        int iRound6 = Math.round(f13);
        i10 = this.f70548n;
        if (i10 == 2) {
            if (i10 == 1) {
                f11 = iRound2 / 2;
            }
            int iRound7 = Math.round(f15);
            this.J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f11 = iRound2;
        f15 -= f11;
        int iRound8 = Math.round(f15);
        this.J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    @il.m({"cueText"})
    private void g() {
        int iMax;
        int iMin;
        int iRound;
        CharSequence charSequence = this.f70543i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f70543i);
        int i10 = this.C - this.A;
        int i11 = this.D - this.B;
        this.f70540f.setTextSize(this.f70558x);
        int i12 = (int) ((this.f70558x * L) + 0.5f);
        int i13 = i12 * 2;
        int i14 = i10 - i13;
        float f10 = this.f70551q;
        float f11 = -3.4028235E38f;
        if (f10 != -3.4028235E38f) {
            i14 = (int) (i14 * f10);
        }
        int i15 = i14;
        String str = K;
        if (i15 <= 0) {
            androidx.media3.common.util.z.n(K, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f70559y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f70559y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f70557w == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i16 = 0;
            while (i16 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i16]);
                i16++;
                f11 = f11;
            }
        }
        float f12 = f11;
        if (Color.alpha(this.f70554t) > 0) {
            int i17 = this.f70557w;
            if (i17 == 0 || i17 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f70554t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f70554t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f70544j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f70540f, i15, alignment2, this.f70538d, this.f70539e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int iMax2 = 0;
        int i18 = 0;
        while (i18 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.E.getLineWidth(i18)), iMax2);
            i18++;
            str = str;
        }
        String str2 = str;
        if (this.f70551q == f12 || iMax2 >= i15) {
            i15 = iMax2;
        }
        int i19 = i15 + i13;
        float f13 = this.f70549o;
        if (f13 != f12) {
            int iRound2 = Math.round(i10 * f13);
            int i20 = this.A;
            int i21 = iRound2 + i20;
            int i22 = this.f70550p;
            if (i22 == 1) {
                i21 = ((i21 * 2) - i19) / 2;
            } else if (i22 == 2) {
                i21 -= i19;
            }
            iMax = Math.max(i21, i20);
            iMin = Math.min(i19 + iMax, this.C);
        } else {
            iMax = ((i10 - i19) / 2) + this.A;
            iMin = iMax + i19;
        }
        int i23 = iMin - iMax;
        if (i23 <= 0) {
            androidx.media3.common.util.z.n(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f14 = this.f70546l;
        if (f14 != f12) {
            if (this.f70547m == 0) {
                iRound = Math.round(i11 * f14) + this.B;
                int i24 = this.f70548n;
                if (i24 == 2) {
                    iRound -= height;
                } else if (i24 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f15 = this.f70546l;
                if (f15 >= 0.0f) {
                    iRound = Math.round(f15 * lineBottom) + this.B;
                } else {
                    iRound = Math.round((f15 + 1.0f) * lineBottom) + this.D;
                    iRound -= height;
                }
            }
            int i25 = iRound + height;
            int i26 = this.D;
            if (i25 > i26) {
                iRound = i26 - height;
            } else {
                int i27 = this.B;
                if (iRound < i27) {
                    iRound = i27;
                }
            }
        } else {
            iRound = (this.D - height) - ((int) (i11 * this.f70560z));
        }
        this.E = new StaticLayout(spannableStringBuilder, this.f70540f, i23, alignment2, this.f70538d, this.f70539e, true);
        this.F = new StaticLayout(spannableStringBuilder2, this.f70540f, i23, alignment2, this.f70538d, this.f70539e, true);
        this.G = iMax;
        this.H = iRound;
        this.I = i12;
    }

    public void b(androidx.media3.common.text.a aVar, b bVar, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = aVar.f61378d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(aVar.f61375a)) {
            return;
        } else {
            i14 = aVar.f61386l ? aVar.f61387m : bVar.f69776c;
        }
        if (a(this.f70543i, aVar.f61375a) && Objects.equals(this.f70544j, aVar.f61376b) && this.f70545k == aVar.f61378d && this.f70546l == aVar.f61379e && this.f70547m == aVar.f61380f && Integer.valueOf(this.f70548n).equals(Integer.valueOf(aVar.f61381g)) && this.f70549o == aVar.f61382h && Integer.valueOf(this.f70550p).equals(Integer.valueOf(aVar.f61383i)) && this.f70551q == aVar.f61384j && this.f70552r == aVar.f61385k && this.f70553s == bVar.f69774a && this.f70554t == bVar.f69775b && this.f70555u == i14 && this.f70557w == bVar.f69777d && this.f70556v == bVar.f69778e && Objects.equals(this.f70540f.getTypeface(), bVar.f69779f) && this.f70558x == f10 && this.f70559y == f11 && this.f70560z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            d(canvas, z10);
            return;
        }
        this.f70543i = aVar.f61375a;
        this.f70544j = aVar.f61376b;
        this.f70545k = aVar.f61378d;
        this.f70546l = aVar.f61379e;
        this.f70547m = aVar.f61380f;
        this.f70548n = aVar.f61381g;
        this.f70549o = aVar.f61382h;
        this.f70550p = aVar.f61383i;
        this.f70551q = aVar.f61384j;
        this.f70552r = aVar.f61385k;
        this.f70553s = bVar.f69774a;
        this.f70554t = bVar.f69775b;
        this.f70555u = i14;
        this.f70557w = bVar.f69777d;
        this.f70556v = bVar.f69778e;
        this.f70540f.setTypeface(bVar.f69779f);
        this.f70558x = f10;
        this.f70559y = f11;
        this.f70560z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            androidx.media3.common.util.a.g(this.f70543i);
            g();
        } else {
            androidx.media3.common.util.a.g(this.f70545k);
            f();
        }
        d(canvas, z10);
    }
}

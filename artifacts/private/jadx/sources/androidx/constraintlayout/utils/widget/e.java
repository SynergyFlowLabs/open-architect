package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.constraintlayout.widget.j;
import androidx.core.view.d0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class e extends View implements androidx.constraintlayout.motion.widget.e {
    static final String E3 = "MotionLabel";
    private static final int F3 = 1;
    private static final int G3 = 2;
    private static final int H3 = 3;
    float A3;
    float B3;
    float C3;
    float D3;
    private String H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TextPaint f45608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Path f45609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f45612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f45613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f45614g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f45615g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ViewOutlineProvider f45616h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f45617h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    RectF f45618i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f45619i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f45620j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private float f45621j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f45622k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private float f45623k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f45624l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private float f45625l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f45626m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private Drawable f45627m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f45628n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    Matrix f45629n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f45630o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private Bitmap f45631o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f45632p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f45633p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private Layout f45634p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private BitmapShader f45635p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private Matrix f45636q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private float f45637r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f45638s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private float f45639s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Rect f45640t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private float f45641t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private float f45642u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f45643v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    Paint f45644v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f45645w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private int f45646w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    Rect f45647x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    Paint f45648y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    float f45649z3;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = e.this.getWidth();
            int height = e.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * e.this.f45613f) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, e.this.getWidth(), e.this.getHeight(), e.this.f45614g);
        }
    }

    public e(Context context) {
        super(context);
        this.f45608a = new TextPaint();
        this.f45609b = new Path();
        this.f45610c = 65535;
        this.f45611d = 65535;
        this.f45612e = false;
        this.f45613f = 0.0f;
        this.f45614g = Float.NaN;
        this.f45620j = 48.0f;
        this.f45622k = Float.NaN;
        this.f45628n = 0.0f;
        this.f45630o = "Hello World";
        this.f45638s = true;
        this.f45640t = new Rect();
        this.f45643v = 1;
        this.f45645w = 1;
        this.f45632p0 = 1;
        this.f45633p1 = 1;
        this.f45615g3 = 8388659;
        this.f45617h3 = 0;
        this.f45619i3 = false;
        this.f45637r3 = Float.NaN;
        this.f45639s3 = Float.NaN;
        this.f45641t3 = 0.0f;
        this.f45642u3 = 0.0f;
        this.f45644v3 = new Paint();
        this.f45646w3 = 0;
        this.A3 = Float.NaN;
        this.B3 = Float.NaN;
        this.C3 = Float.NaN;
        this.D3 = Float.NaN;
        g(context, null);
    }

    private void d(float f10, float f11, float f12, float f13) {
        if (this.f45636q3 == null) {
            return;
        }
        this.f45623k3 = f12 - f10;
        this.f45625l3 = f13 - f11;
        k();
    }

    private void g(Context context, AttributeSet attributeSet) {
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.f46463gd);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46564md) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == j.c.f46598od) {
                    this.H1 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == j.c.f46666sd) {
                    this.f45622k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f45622k);
                } else if (index == j.c.f46480hd) {
                    this.f45620j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f45620j);
                } else if (index == j.c.f46513jd) {
                    this.f45624l = typedArrayObtainStyledAttributes.getInt(index, this.f45624l);
                } else if (index == j.c.f46497id) {
                    this.f45626m = typedArrayObtainStyledAttributes.getInt(index, this.f45626m);
                } else if (index == j.c.f46530kd) {
                    this.f45610c = typedArrayObtainStyledAttributes.getColor(index, this.f45610c);
                } else if (index == j.c.f46632qd) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f45614g);
                    this.f45614g = dimension;
                    setRound(dimension);
                } else if (index == j.c.f46649rd) {
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f45613f);
                    this.f45613f = f10;
                    setRoundPercent(f10);
                } else if (index == j.c.f46547ld) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == j.c.f46615pd) {
                    this.f45617h3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == j.c.f46768yd) {
                    this.f45611d = typedArrayObtainStyledAttributes.getInt(index, this.f45611d);
                    this.f45612e = true;
                } else if (index == j.c.f46785zd) {
                    this.f45628n = typedArrayObtainStyledAttributes.getDimension(index, this.f45628n);
                    this.f45612e = true;
                } else if (index == j.c.f46683td) {
                    this.f45627m3 = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f45612e = true;
                } else if (index == j.c.f46700ud) {
                    this.A3 = typedArrayObtainStyledAttributes.getFloat(index, this.A3);
                } else if (index == j.c.f46717vd) {
                    this.B3 = typedArrayObtainStyledAttributes.getFloat(index, this.B3);
                } else if (index == j.c.Ad) {
                    this.f45641t3 = typedArrayObtainStyledAttributes.getFloat(index, this.f45641t3);
                } else if (index == j.c.Bd) {
                    this.f45642u3 = typedArrayObtainStyledAttributes.getFloat(index, this.f45642u3);
                } else if (index == j.c.f46734wd) {
                    this.D3 = typedArrayObtainStyledAttributes.getFloat(index, this.D3);
                } else if (index == j.c.f46751xd) {
                    this.C3 = typedArrayObtainStyledAttributes.getFloat(index, this.C3);
                } else if (index == j.c.Ed) {
                    this.f45637r3 = typedArrayObtainStyledAttributes.getDimension(index, this.f45637r3);
                } else if (index == j.c.Fd) {
                    this.f45639s3 = typedArrayObtainStyledAttributes.getDimension(index, this.f45639s3);
                } else if (index == j.c.Dd) {
                    this.f45646w3 = typedArrayObtainStyledAttributes.getInt(index, this.f45646w3);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        j();
        i();
    }

    private float getHorizontalOffset() {
        float f10 = Float.isNaN(this.f45622k) ? 1.0f : this.f45620j / this.f45622k;
        TextPaint textPaint = this.f45608a;
        String str = this.f45630o;
        return (((((Float.isNaN(this.f45623k3) ? getMeasuredWidth() : this.f45623k3) - getPaddingLeft()) - getPaddingRight()) - (f10 * textPaint.measureText(str, 0, str.length()))) * (this.f45641t3 + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f10 = Float.isNaN(this.f45622k) ? 1.0f : this.f45620j / this.f45622k;
        Paint.FontMetrics fontMetrics = this.f45608a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f45625l3) ? getMeasuredHeight() : this.f45625l3) - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((measuredHeight - ((f11 - f12) * f10)) * (1.0f - this.f45642u3)) / 2.0f) - (f10 * f12);
    }

    private void h(String str, int i10, int i11) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i11);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i10 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i10 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i10 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i11 <= 0) {
            this.f45608a.setFakeBoldText(false);
            this.f45608a.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typefaceCreate, i11);
            setTypeface(typefaceDefaultFromStyle);
            int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
            this.f45608a.setFakeBoldText((i12 & 1) != 0);
            this.f45608a.setTextSkewX((i12 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    private void j() {
        if (this.f45627m3 != null) {
            this.f45636q3 = new Matrix();
            int intrinsicWidth = this.f45627m3.getIntrinsicWidth();
            int intrinsicHeight = this.f45627m3.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f45639s3) ? 128 : (int) this.f45639s3;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f45637r3) ? 128 : (int) this.f45637r3;
            }
            if (this.f45646w3 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f45631o3 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f45631o3);
            this.f45627m3.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f45627m3.setFilterBitmap(true);
            this.f45627m3.draw(canvas);
            if (this.f45646w3 != 0) {
                this.f45631o3 = e(this.f45631o3, 4);
            }
            Bitmap bitmap = this.f45631o3;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f45635p3 = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void k() {
        float f10 = 0.0f;
        float f11 = Float.isNaN(this.A3) ? 0.0f : this.A3;
        float f12 = Float.isNaN(this.B3) ? 0.0f : this.B3;
        float f13 = Float.isNaN(this.C3) ? 1.0f : this.C3;
        if (!Float.isNaN(this.D3)) {
            f10 = this.D3;
        }
        this.f45636q3.reset();
        float width = this.f45631o3.getWidth();
        float height = this.f45631o3.getHeight();
        float f14 = Float.isNaN(this.f45639s3) ? this.f45623k3 : this.f45639s3;
        float f15 = Float.isNaN(this.f45637r3) ? this.f45625l3 : this.f45637r3;
        float f16 = f13 * (width * f15 < height * f14 ? f14 / width : f15 / height);
        this.f45636q3.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f14 - f17;
        float f19 = f16 * height;
        float f20 = f15 - f19;
        if (!Float.isNaN(this.f45637r3)) {
            f20 = this.f45637r3 / 2.0f;
        }
        if (!Float.isNaN(this.f45639s3)) {
            f18 = this.f45639s3 / 2.0f;
        }
        this.f45636q3.postTranslate((((f11 * f18) + f14) - f17) * 0.5f, (((f12 * f20) + f15) - f19) * 0.5f);
        this.f45636q3.postRotate(f10, f14 / 2.0f, f15 / 2.0f);
        this.f45635p3.setLocalMatrix(this.f45636q3);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.b.J0, typedValue, true);
        TextPaint textPaint = this.f45608a;
        int i10 = typedValue.data;
        this.f45610c = i10;
        textPaint.setColor(i10);
    }

    @Override // androidx.constraintlayout.motion.widget.e
    public void a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 + 0.5f);
        this.f45621j3 = f10 - i10;
        int i11 = (int) (f12 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f13 + 0.5f);
        int i14 = (int) (0.5f + f11);
        int i15 = i13 - i14;
        float f14 = f12 - f10;
        this.f45623k3 = f14;
        float f15 = f13 - f11;
        this.f45625l3 = f15;
        d(f10, f11, f12, f13);
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.f45619i3) {
            if (this.f45647x3 == null) {
                this.f45648y3 = new Paint();
                this.f45647x3 = new Rect();
                this.f45648y3.set(this.f45608a);
                this.f45649z3 = this.f45648y3.getTextSize();
            }
            this.f45623k3 = f14;
            this.f45625l3 = f15;
            Paint paint = this.f45648y3;
            String str = this.f45630o;
            paint.getTextBounds(str, 0, str.length(), this.f45647x3);
            int iWidth = this.f45647x3.width();
            float fHeight = this.f45647x3.height() * 1.3f;
            float f16 = (f14 - this.f45645w) - this.f45643v;
            float f17 = (f15 - this.f45633p1) - this.f45632p0;
            float f18 = iWidth;
            if (f18 * f17 > fHeight * f16) {
                this.f45608a.setTextSize((this.f45649z3 * f16) / f18);
            } else {
                this.f45608a.setTextSize((this.f45649z3 * f17) / fHeight);
            }
            if (this.f45612e || !Float.isNaN(this.f45622k)) {
                f(Float.isNaN(this.f45622k) ? 1.0f : this.f45620j / this.f45622k);
            }
        }
    }

    Bitmap e(Bitmap bitmap, int i10) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i11 = 0; i11 < i10 && width >= 32 && height >= 32; i11++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    void f(float f10) {
        if (this.f45612e || f10 != 1.0f) {
            this.f45609b.reset();
            String str = this.f45630o;
            int length = str.length();
            boolean z10 = false;
            this.f45608a.getTextBounds(str, 0, length, this.f45640t);
            this.f45608a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f45609b);
            if (f10 != 1.0f) {
                androidx.constraintlayout.motion.widget.c.f();
                Matrix matrix = new Matrix();
                matrix.postScale(f10, f10);
                this.f45609b.transform(matrix);
            }
            Rect rect = this.f45640t;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f45638s = false;
        }
    }

    public float getRound() {
        return this.f45614g;
    }

    public float getRoundPercent() {
        return this.f45613f;
    }

    public float getScaleFromTextSize() {
        return this.f45622k;
    }

    public float getTextBackgroundPanX() {
        return this.A3;
    }

    public float getTextBackgroundPanY() {
        return this.B3;
    }

    public float getTextBackgroundRotate() {
        return this.D3;
    }

    public float getTextBackgroundZoom() {
        return this.C3;
    }

    public int getTextOutlineColor() {
        return this.f45611d;
    }

    public float getTextPanX() {
        return this.f45641t3;
    }

    public float getTextPanY() {
        return this.f45642u3;
    }

    public float getTextureHeight() {
        return this.f45637r3;
    }

    public float getTextureWidth() {
        return this.f45639s3;
    }

    public Typeface getTypeface() {
        return this.f45608a.getTypeface();
    }

    void i() {
        this.f45643v = getPaddingLeft();
        this.f45645w = getPaddingRight();
        this.f45632p0 = getPaddingTop();
        this.f45633p1 = getPaddingBottom();
        h(this.H1, this.f45626m, this.f45624l);
        this.f45608a.setColor(this.f45610c);
        this.f45608a.setStrokeWidth(this.f45628n);
        this.f45608a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f45608a.setFlags(128);
        setTextSize(this.f45620j);
        this.f45608a.setAntiAlias(true);
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        boolean zIsNaN = Float.isNaN(this.f45622k);
        float f10 = zIsNaN ? 1.0f : this.f45620j / this.f45622k;
        this.f45623k3 = i12 - i10;
        this.f45625l3 = i13 - i11;
        if (this.f45619i3) {
            if (this.f45647x3 == null) {
                this.f45648y3 = new Paint();
                this.f45647x3 = new Rect();
                this.f45648y3.set(this.f45608a);
                this.f45649z3 = this.f45648y3.getTextSize();
            }
            Paint paint = this.f45648y3;
            String str = this.f45630o;
            paint.getTextBounds(str, 0, str.length(), this.f45647x3);
            int iWidth = this.f45647x3.width();
            int iHeight = (int) (this.f45647x3.height() * 1.3f);
            float f11 = (this.f45623k3 - this.f45645w) - this.f45643v;
            float f12 = (this.f45625l3 - this.f45633p1) - this.f45632p0;
            if (zIsNaN) {
                float f13 = iWidth;
                float f14 = iHeight;
                if (f13 * f12 > f14 * f11) {
                    this.f45608a.setTextSize((this.f45649z3 * f11) / f13);
                } else {
                    this.f45608a.setTextSize((this.f45649z3 * f12) / f14);
                }
            } else {
                float f15 = iWidth;
                float f16 = iHeight;
                f10 = f15 * f12 > f16 * f11 ? f11 / f15 : f12 / f16;
            }
        }
        if (!this.f45612e && zIsNaN) {
            return;
        }
        d(i10, i11, i12, i13);
        f(f10);
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        float f10 = Float.isNaN(this.f45622k) ? 1.0f : this.f45620j / this.f45622k;
        super.onDraw(canvas);
        if (!this.f45612e && f10 == 1.0f) {
            canvas.drawText(this.f45630o, this.f45621j3 + this.f45643v + getHorizontalOffset(), this.f45632p0 + getVerticalOffset(), this.f45608a);
            return;
        }
        if (this.f45638s) {
            f(f10);
        }
        if (this.f45629n3 == null) {
            this.f45629n3 = new Matrix();
        }
        if (!this.f45612e) {
            float horizontalOffset = this.f45643v + getHorizontalOffset();
            float verticalOffset = this.f45632p0 + getVerticalOffset();
            this.f45629n3.reset();
            this.f45629n3.preTranslate(horizontalOffset, verticalOffset);
            this.f45609b.transform(this.f45629n3);
            this.f45608a.setColor(this.f45610c);
            this.f45608a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f45608a.setStrokeWidth(this.f45628n);
            canvas.drawPath(this.f45609b, this.f45608a);
            this.f45629n3.reset();
            this.f45629n3.preTranslate(-horizontalOffset, -verticalOffset);
            this.f45609b.transform(this.f45629n3);
            return;
        }
        this.f45644v3.set(this.f45608a);
        this.f45629n3.reset();
        float horizontalOffset2 = this.f45643v + getHorizontalOffset();
        float verticalOffset2 = this.f45632p0 + getVerticalOffset();
        this.f45629n3.postTranslate(horizontalOffset2, verticalOffset2);
        this.f45629n3.preScale(f10, f10);
        this.f45609b.transform(this.f45629n3);
        if (this.f45635p3 != null) {
            this.f45608a.setFilterBitmap(true);
            this.f45608a.setShader(this.f45635p3);
        } else {
            this.f45608a.setColor(this.f45610c);
        }
        this.f45608a.setStyle(Paint.Style.FILL);
        this.f45608a.setStrokeWidth(this.f45628n);
        canvas.drawPath(this.f45609b, this.f45608a);
        if (this.f45635p3 != null) {
            this.f45608a.setShader(null);
        }
        this.f45608a.setColor(this.f45611d);
        this.f45608a.setStyle(Paint.Style.STROKE);
        this.f45608a.setStrokeWidth(this.f45628n);
        canvas.drawPath(this.f45609b, this.f45608a);
        this.f45629n3.reset();
        this.f45629n3.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f45609b.transform(this.f45629n3);
        this.f45608a.set(this.f45644v3);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f45619i3 = false;
        this.f45643v = getPaddingLeft();
        this.f45645w = getPaddingRight();
        this.f45632p0 = getPaddingTop();
        this.f45633p1 = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f45608a;
            String str = this.f45630o;
            textPaint.getTextBounds(str, 0, str.length(), this.f45640t);
            if (mode != 1073741824) {
                size = (int) (this.f45640t.width() + 0.99999f);
            }
            size += this.f45643v + this.f45645w;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f45608a.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f45632p0 + this.f45633p1 + fontMetricsInt;
            }
        } else if (this.f45617h3 != 0) {
            this.f45619i3 = true;
        }
        setMeasuredDimension(size, size2);
    }

    @e.a({"RtlHardcoded"})
    public void setGravity(int i10) {
        if ((i10 & d0.f48645d) == 0) {
            i10 |= d0.f48643b;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i10 |= 48;
        }
        if (i10 != this.f45615g3) {
            invalidate();
        }
        this.f45615g3 = i10;
        int i11 = i10 & com.planner5d.library.engine.input.f.b.B;
        if (i11 == 48) {
            this.f45642u3 = -1.0f;
        } else if (i11 != 80) {
            this.f45642u3 = 0.0f;
        } else {
            this.f45642u3 = 1.0f;
        }
        int i12 = i10 & d0.f48645d;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.f45641t3 = 0.0f;
                        return;
                    }
                }
            }
            this.f45641t3 = 1.0f;
            return;
        }
        this.f45641t3 = -1.0f;
    }

    @w0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f45614g = f10;
            float f11 = this.f45613f;
            this.f45613f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        int i10 = 6 << 1;
        boolean z10 = this.f45614g != f10;
        this.f45614g = f10;
        if (f10 != 0.0f) {
            if (this.f45609b == null) {
                this.f45609b = new Path();
            }
            if (this.f45618i == null) {
                this.f45618i = new RectF();
            }
            if (this.f45616h == null) {
                b bVar = new b();
                this.f45616h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f45618i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f45609b.reset();
            Path path = this.f45609b;
            RectF rectF = this.f45618i;
            float f12 = this.f45614g;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @w0(21)
    public void setRoundPercent(float f10) {
        boolean z10 = this.f45613f != f10;
        this.f45613f = f10;
        if (f10 != 0.0f) {
            if (this.f45609b == null) {
                this.f45609b = new Path();
            }
            if (this.f45618i == null) {
                this.f45618i = new RectF();
            }
            if (this.f45616h == null) {
                a aVar = new a();
                this.f45616h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f45613f) / 2.0f;
            this.f45618i.set(0.0f, 0.0f, width, height);
            this.f45609b.reset();
            this.f45609b.addRoundRect(this.f45618i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f10) {
        this.f45622k = f10;
    }

    public void setText(CharSequence charSequence) {
        this.f45630o = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f10) {
        this.A3 = f10;
        k();
        invalidate();
    }

    public void setTextBackgroundPanY(float f10) {
        this.B3 = f10;
        k();
        invalidate();
    }

    public void setTextBackgroundRotate(float f10) {
        this.D3 = f10;
        k();
        invalidate();
    }

    public void setTextBackgroundZoom(float f10) {
        this.C3 = f10;
        k();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.f45610c = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f45611d = i10;
        this.f45612e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f10) {
        this.f45628n = f10;
        this.f45612e = true;
        if (Float.isNaN(f10)) {
            this.f45628n = 1.0f;
            int i10 = 6 >> 0;
            this.f45612e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f10) {
        this.f45641t3 = f10;
        invalidate();
    }

    public void setTextPanY(float f10) {
        this.f45642u3 = f10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f45620j = f10;
        TextPaint textPaint = this.f45608a;
        if (!Float.isNaN(this.f45622k)) {
            f10 = this.f45622k;
        }
        textPaint.setTextSize(f10);
        f(Float.isNaN(this.f45622k) ? 1.0f : this.f45620j / this.f45622k);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f10) {
        this.f45637r3 = f10;
        k();
        invalidate();
    }

    public void setTextureWidth(float f10) {
        this.f45639s3 = f10;
        k();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (!Objects.equals(this.f45608a.getTypeface(), typeface)) {
            this.f45608a.setTypeface(typeface);
            if (this.f45634p2 != null) {
                this.f45634p2 = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public e(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45608a = new TextPaint();
        this.f45609b = new Path();
        this.f45610c = 65535;
        this.f45611d = 65535;
        this.f45612e = false;
        this.f45613f = 0.0f;
        this.f45614g = Float.NaN;
        this.f45620j = 48.0f;
        this.f45622k = Float.NaN;
        this.f45628n = 0.0f;
        this.f45630o = "Hello World";
        this.f45638s = true;
        this.f45640t = new Rect();
        this.f45643v = 1;
        this.f45645w = 1;
        this.f45632p0 = 1;
        this.f45633p1 = 1;
        this.f45615g3 = 8388659;
        this.f45617h3 = 0;
        this.f45619i3 = false;
        this.f45637r3 = Float.NaN;
        this.f45639s3 = Float.NaN;
        this.f45641t3 = 0.0f;
        this.f45642u3 = 0.0f;
        this.f45644v3 = new Paint();
        this.f45646w3 = 0;
        this.A3 = Float.NaN;
        this.B3 = Float.NaN;
        this.C3 = Float.NaN;
        this.D3 = Float.NaN;
        g(context, attributeSet);
    }

    public e(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45608a = new TextPaint();
        this.f45609b = new Path();
        this.f45610c = 65535;
        this.f45611d = 65535;
        this.f45612e = false;
        this.f45613f = 0.0f;
        this.f45614g = Float.NaN;
        this.f45620j = 48.0f;
        this.f45622k = Float.NaN;
        this.f45628n = 0.0f;
        this.f45630o = "Hello World";
        this.f45638s = true;
        this.f45640t = new Rect();
        this.f45643v = 1;
        this.f45645w = 1;
        this.f45632p0 = 1;
        this.f45633p1 = 1;
        this.f45615g3 = 8388659;
        this.f45617h3 = 0;
        this.f45619i3 = false;
        this.f45637r3 = Float.NaN;
        this.f45639s3 = Float.NaN;
        this.f45641t3 = 0.0f;
        this.f45642u3 = 0.0f;
        this.f45644v3 = new Paint();
        this.f45646w3 = 0;
        this.A3 = Float.NaN;
        this.B3 = Float.NaN;
        this.C3 = Float.NaN;
        this.D3 = Float.NaN;
        g(context, attributeSet);
    }
}

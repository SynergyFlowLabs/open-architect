package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.content.d;

/* JADX INFO: loaded from: classes3.dex */
public class b extends c {

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final String f76093r3 = "PagerTabStrip";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f76094s3 = 3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f76095t3 = 6;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f76096u3 = 16;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int f76097v3 = 32;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f76098w3 = 64;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final int f76099x3 = 1;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final int f76100y3 = 32;
    private int H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f76101g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final Paint f76102h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final Rect f76103i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f76104j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f76105k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f76106l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private int f76107m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean f76108n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private float f76109o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f76110p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f76111p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f76112p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private float f76113p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private int f76114q3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f76115w;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = b.this.f76122a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$b, reason: collision with other inner class name */
    class ViewOnClickListenerC0766b implements View.OnClickListener {
        ViewOnClickListenerC0766b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = b.this.f76122a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public b(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.c
    void d(int i10, float f10, boolean z10) {
        Rect rect = this.f76103i3;
        int height = getHeight();
        int left = this.f76124c.getLeft() - this.f76101g3;
        int right = this.f76124c.getRight() + this.f76101g3;
        int i11 = height - this.f76110p0;
        rect.set(left, i11, right, height);
        super.d(i10, f10, z10);
        this.f76104j3 = (int) (Math.abs(f10 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f76124c.getLeft() - this.f76101g3, i11, this.f76124c.getRight() + this.f76101g3, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f76105k3;
    }

    @Override // androidx.viewpager.widget.c
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f76112p2);
    }

    @l
    public int getTabIndicatorColor() {
        return this.f76115w;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f76124c.getLeft() - this.f76101g3;
        int right = this.f76124c.getRight() + this.f76101g3;
        int i10 = height - this.f76110p0;
        this.f76102h3.setColor((this.f76104j3 << 24) | (this.f76115w & 16777215));
        float f10 = height;
        canvas.drawRect(left, i10, right, f10, this.f76102h3);
        if (this.f76105k3) {
            this.f76102h3.setColor((this.f76115w & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f76107m3, getWidth() - getPaddingRight(), f10, this.f76102h3);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f76108n3) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            this.f76109o3 = x10;
            this.f76113p3 = y10;
            this.f76108n3 = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x10 - this.f76109o3) > this.f76114q3 || Math.abs(y10 - this.f76113p3) > this.f76114q3)) {
                this.f76108n3 = true;
            }
        } else if (x10 < this.f76124c.getLeft() - this.f76101g3) {
            ViewPager viewPager = this.f76122a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x10 > this.f76124c.getRight() + this.f76101g3) {
            ViewPager viewPager2 = this.f76122a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i10) {
        super.setBackgroundColor(i10);
        if (!this.f76106l3) {
            this.f76105k3 = (i10 & (-16777216)) == 0;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f76106l3) {
            return;
        }
        this.f76105k3 = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@v int i10) {
        super.setBackgroundResource(i10);
        if (this.f76106l3) {
            return;
        }
        this.f76105k3 = i10 == 0;
    }

    public void setDrawFullUnderline(boolean z10) {
        this.f76105k3 = z10;
        this.f76106l3 = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.f76111p1;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(@l int i10) {
        this.f76115w = i10;
        this.f76102h3.setColor(i10);
        invalidate();
    }

    public void setTabIndicatorColorResource(@n int i10) {
        setTabIndicatorColor(d.g(getContext(), i10));
    }

    @Override // androidx.viewpager.widget.c
    public void setTextSpacing(int i10) {
        int i11 = this.H1;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setTextSpacing(i10);
    }

    public b(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f76102h3 = paint;
        this.f76103i3 = new Rect();
        this.f76104j3 = 255;
        this.f76105k3 = false;
        this.f76106l3 = false;
        int i10 = this.f76135n;
        this.f76115w = i10;
        paint.setColor(i10);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f76110p0 = (int) ((3.0f * f10) + 0.5f);
        this.f76111p1 = (int) ((6.0f * f10) + 0.5f);
        this.H1 = (int) (64.0f * f10);
        this.f76101g3 = (int) ((16.0f * f10) + 0.5f);
        this.f76107m3 = (int) ((1.0f * f10) + 0.5f);
        this.f76112p2 = (int) ((f10 * 32.0f) + 0.5f);
        this.f76114q3 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f76123b.setFocusable(true);
        this.f76123b.setOnClickListener(new a());
        this.f76125d.setFocusable(true);
        this.f76125d.setOnClickListener(new ViewOnClickListenerC0766b());
        if (getBackground() == null) {
            this.f76105k3 = true;
        }
    }
}

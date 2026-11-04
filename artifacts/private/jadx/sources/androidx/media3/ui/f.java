package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class f extends View implements d1 {
    public static final int A3 = 4;
    public static final int B3 = 12;
    public static final int C3 = 0;
    public static final int D3 = 16;
    public static final int E3 = -1;
    public static final int F3 = 872415231;
    public static final int G3 = -855638017;
    public static final int H3 = -1;
    public static final int I3 = -1291845888;
    public static final int J3 = 872414976;
    public static final int K3 = 0;
    public static final int L3 = 1;
    private static final int M3 = -50;
    private static final int N3 = 3;
    private static final long O3 = 1000;
    private static final int P3 = 20;
    private static final float Q3 = 1.0f;
    private static final float R3 = 0.0f;
    private static final String S3 = "android.widget.SeekBar";

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final int f69787y3 = 4;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f69788z3 = 26;
    private final Formatter H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f69789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f69790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f69791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f69792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f69793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f69794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f69795g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final CopyOnWriteArraySet<d1.a> f69796g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f69797h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final Point f69798h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f69799i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final float f69800i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f69801j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f69802j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final Drawable f69803k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private long f69804k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f69805l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private int f69806l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f69807m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private Rect f69808m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f69809n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private ValueAnimator f69810n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f69811o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private float f69812o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final int f69813p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final StringBuilder f69814p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final Runnable f69815p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f69816p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f69817q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private long f69818r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f69819s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private long f69820s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f69821t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private long f69822t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private long f69823u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f69824v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private int f69825v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f69826w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @androidx.annotation.p0
    private long[] f69827w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @androidx.annotation.p0
    private boolean[] f69828x3;

    public f(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void d(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f69812o3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.invalidate(fVar.f69789a);
    }

    private static int f(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private void g(Canvas canvas) {
        int i10;
        if (this.f69820s3 <= 0) {
            return;
        }
        Rect rect = this.f69792d;
        int iW = androidx.media3.common.util.k1.w(rect.right, rect.left, this.f69790b.right);
        int iCenterY = this.f69792d.centerY();
        Drawable drawable = this.f69803k;
        if (drawable == null) {
            if (this.f69817q3 || isFocused()) {
                i10 = this.f69824v;
            } else {
                i10 = isEnabled() ? this.f69819s : this.f69821t;
            }
            canvas.drawCircle(iW, iCenterY, (int) ((i10 * this.f69812o3) / 2.0f), this.f69801j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f69812o3)) / 2;
        int intrinsicHeight = ((int) (this.f69803k.getIntrinsicHeight() * this.f69812o3)) / 2;
        this.f69803k.setBounds(iW - intrinsicWidth, iCenterY - intrinsicHeight, iW + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f69803k.draw(canvas);
    }

    private long getPositionIncrement() {
        long j10 = this.f69804k3;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.f69820s3;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / ((long) this.f69802j3);
    }

    private String getProgressText() {
        return androidx.media3.common.util.k1.J0(this.f69814p1, this.H1, this.f69822t3);
    }

    private long getScrubberPosition() {
        if (this.f69790b.width() <= 0 || this.f69820s3 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f69792d.width()) * this.f69820s3) / ((long) this.f69790b.width());
    }

    private void h(Canvas canvas) {
        int iHeight = this.f69790b.height();
        int iCenterY = this.f69790b.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.f69820s3 <= 0) {
            Rect rect = this.f69790b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f69795g);
            return;
        }
        Rect rect2 = this.f69791c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f69790b.left, i12), this.f69792d.right);
        int i13 = this.f69790b.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f69795g);
        }
        int iMax2 = Math.max(i11, this.f69792d.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f69794f);
        }
        if (this.f69792d.width() > 0) {
            Rect rect3 = this.f69792d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f69793e);
        }
        if (this.f69825v3 == 0) {
            return;
        }
        long[] jArr = (long[]) androidx.media3.common.util.a.g(this.f69827w3);
        boolean[] zArr = (boolean[]) androidx.media3.common.util.a.g(this.f69828x3);
        int i14 = this.f69811o / 2;
        for (int i15 = 0; i15 < this.f69825v3; i15++) {
            int iWidth = ((int) ((((long) this.f69790b.width()) * androidx.media3.common.util.k1.x(jArr[i15], 0L, this.f69820s3)) / this.f69820s3)) - i14;
            Rect rect4 = this.f69790b;
            int iMin = rect4.left + Math.min(rect4.width() - this.f69811o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f69811o, i10, zArr[i15] ? this.f69799i : this.f69797h);
        }
    }

    private boolean k(float f10, float f11) {
        return this.f69789a.contains((int) f10, (int) f11);
    }

    private void l(float f10) {
        Rect rect = this.f69792d;
        Rect rect2 = this.f69790b;
        rect.right = androidx.media3.common.util.k1.w((int) f10, rect2.left, rect2.right);
    }

    private static int m(float f10, int i10) {
        return (int) (i10 / f10);
    }

    private Point n(MotionEvent motionEvent) {
        this.f69798h3.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f69798h3;
    }

    private boolean o(long j10) {
        long j11 = this.f69820s3;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f69817q3 ? this.f69818r3 : this.f69822t3;
        long jX = androidx.media3.common.util.k1.x(j12 + j10, 0L, j11);
        if (jX == j12) {
            return false;
        }
        if (this.f69817q3) {
            y(jX);
        } else {
            u(jX);
        }
        w();
        return true;
    }

    private boolean p(Drawable drawable) {
        return androidx.media3.common.util.k1.f61540a >= 23 && q(drawable, getLayoutDirection());
    }

    private static boolean q(Drawable drawable, int i10) {
        return androidx.media3.common.util.k1.f61540a >= 23 && drawable.setLayoutDirection(i10);
    }

    @androidx.annotation.w0(29)
    private void r(int i10, int i11) {
        Rect rect = this.f69808m3;
        if (rect != null && rect.width() == i10 && this.f69808m3.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.f69808m3 = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void u(long j10) {
        this.f69818r3 = j10;
        this.f69817q3 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<d1.a> it = this.f69796g3.iterator();
        while (it.hasNext()) {
            it.next().l(this, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z10) {
        removeCallbacks(this.f69815p2);
        this.f69817q3 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<d1.a> it = this.f69796g3.iterator();
        while (it.hasNext()) {
            it.next().P(this, this.f69818r3, z10);
        }
    }

    private void w() {
        this.f69791c.set(this.f69790b);
        this.f69792d.set(this.f69790b);
        long j10 = this.f69817q3 ? this.f69818r3 : this.f69822t3;
        if (this.f69820s3 > 0) {
            int iWidth = (int) ((((long) this.f69790b.width()) * this.f69823u3) / this.f69820s3);
            Rect rect = this.f69791c;
            Rect rect2 = this.f69790b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f69790b.width()) * j10) / this.f69820s3);
            Rect rect3 = this.f69792d;
            Rect rect4 = this.f69790b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f69791c;
            int i10 = this.f69790b.left;
            rect5.right = i10;
            this.f69792d.right = i10;
        }
        invalidate(this.f69789a);
    }

    private void x() {
        Drawable drawable = this.f69803k;
        if (drawable != null && drawable.isStateful() && this.f69803k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void y(long j10) {
        if (this.f69818r3 != j10) {
            this.f69818r3 = j10;
            Iterator<d1.a> it = this.f69796g3.iterator();
            while (it.hasNext()) {
                it.next().L(this, j10);
            }
        }
    }

    @Override // androidx.media3.ui.d1
    public void a(d1.a aVar) {
        this.f69796g3.remove(aVar);
    }

    @Override // androidx.media3.ui.d1
    public void b(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr, int i10) {
        androidx.media3.common.util.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.f69825v3 = i10;
        this.f69827w3 = jArr;
        this.f69828x3 = zArr;
        w();
    }

    @Override // androidx.media3.ui.d1
    public void c(d1.a aVar) {
        androidx.media3.common.util.a.g(aVar);
        this.f69796g3.add(aVar);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        x();
    }

    @Override // androidx.media3.ui.d1
    public long getPreferredUpdateDelay() {
        int iM = m(this.f69800i3, this.f69790b.width());
        if (iM == 0) {
            return Long.MAX_VALUE;
        }
        long j10 = this.f69820s3;
        if (j10 == 0 || j10 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j10 / ((long) iM);
    }

    public void i(long j10) {
        if (this.f69810n3.isStarted()) {
            this.f69810n3.cancel();
        }
        this.f69810n3.setFloatValues(this.f69812o3, 0.0f);
        this.f69810n3.setDuration(j10);
        this.f69810n3.start();
    }

    public void j(boolean z10) {
        if (this.f69810n3.isStarted()) {
            this.f69810n3.cancel();
        }
        this.f69816p3 = z10;
        this.f69812o3 = 0.0f;
        invalidate(this.f69789a);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f69803k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        h(canvas);
        g(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, @androidx.annotation.p0 Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.f69817q3 || z10) {
            return;
        }
        v(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(S3);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(S3);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f69820s3 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (o(positionIncrement)) {
                            removeCallbacks(this.f69815p2);
                            postDelayed(this.f69815p2, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (o(positionIncrement)) {
                            removeCallbacks(this.f69815p2);
                            postDelayed(this.f69815p2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f69817q3) {
                            v(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f69817q3) {
                v(false);
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.f69816p3 ? 0 : this.f69826w;
        if (this.f69809n == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f69807m;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f69805l;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f69807m) / 2;
            iMax = (i15 - this.f69805l) / 2;
        }
        this.f69789a.set(paddingLeft, paddingBottom, paddingRight, this.f69807m + paddingBottom);
        Rect rect = this.f69790b;
        Rect rect2 = this.f69789a;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f69805l + iMax);
        if (androidx.media3.common.util.k1.f61540a >= 29) {
            r(i14, i15);
        }
        w();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f69807m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f69807m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        x();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f69803k;
        if (drawable != null && q(drawable, i10)) {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f69820s3 > 0) {
            Point pointN = n(motionEvent);
            int i10 = pointN.x;
            int i11 = pointN.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f10 = i10;
                if (k(f10, i11)) {
                    l(f10);
                    u(getScrubberPosition());
                    w();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f69817q3) {
                    v(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f69817q3) {
                        v(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f69817q3) {
                if (i11 < this.f69813p0) {
                    int i12 = this.f69806l3;
                    l(i12 + ((i10 - i12) / 3));
                } else {
                    this.f69806l3 = i10;
                    l(i10);
                }
                y(getScrubberPosition());
                w();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, @androidx.annotation.p0 Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f69820s3 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (o(-getPositionIncrement())) {
                v(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (o(getPositionIncrement())) {
                v(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void s() {
        if (this.f69810n3.isStarted()) {
            this.f69810n3.cancel();
        }
        this.f69816p3 = false;
        this.f69812o3 = 1.0f;
        invalidate(this.f69789a);
    }

    public void setAdMarkerColor(@androidx.annotation.l int i10) {
        this.f69797h.setColor(i10);
        invalidate(this.f69789a);
    }

    public void setBufferedColor(@androidx.annotation.l int i10) {
        this.f69794f.setColor(i10);
        invalidate(this.f69789a);
    }

    @Override // androidx.media3.ui.d1
    public void setBufferedPosition(long j10) {
        if (this.f69823u3 == j10) {
            return;
        }
        this.f69823u3 = j10;
        w();
    }

    @Override // androidx.media3.ui.d1
    public void setDuration(long j10) {
        if (this.f69820s3 == j10) {
            return;
        }
        this.f69820s3 = j10;
        if (this.f69817q3 && j10 == -9223372036854775807L) {
            v(true);
        }
        w();
    }

    @Override // android.view.View, androidx.media3.ui.d1
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.f69817q3 && !z10) {
            v(true);
        }
    }

    @Override // androidx.media3.ui.d1
    public void setKeyCountIncrement(int i10) {
        androidx.media3.common.util.a.a(i10 > 0);
        this.f69802j3 = i10;
        this.f69804k3 = -9223372036854775807L;
    }

    @Override // androidx.media3.ui.d1
    public void setKeyTimeIncrement(long j10) {
        androidx.media3.common.util.a.a(j10 > 0);
        this.f69802j3 = -1;
        this.f69804k3 = j10;
    }

    public void setPlayedAdMarkerColor(@androidx.annotation.l int i10) {
        this.f69799i.setColor(i10);
        invalidate(this.f69789a);
    }

    public void setPlayedColor(@androidx.annotation.l int i10) {
        this.f69793e.setColor(i10);
        invalidate(this.f69789a);
    }

    @Override // androidx.media3.ui.d1
    public void setPosition(long j10) {
        if (this.f69822t3 == j10) {
            return;
        }
        this.f69822t3 = j10;
        setContentDescription(getProgressText());
        w();
    }

    public void setScrubberColor(@androidx.annotation.l int i10) {
        this.f69801j.setColor(i10);
        invalidate(this.f69789a);
    }

    public void setUnplayedColor(@androidx.annotation.l int i10) {
        this.f69795g.setColor(i10);
        invalidate(this.f69789a);
    }

    public void t(long j10) {
        if (this.f69810n3.isStarted()) {
            this.f69810n3.cancel();
        }
        this.f69816p3 = false;
        this.f69810n3.setFloatValues(this.f69812o3, 1.0f);
        this.f69810n3.setDuration(j10);
        this.f69810n3.start();
    }

    public f(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public f(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, @androidx.annotation.p0 AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public f(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, @androidx.annotation.p0 AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f69789a = new Rect();
        this.f69790b = new Rect();
        this.f69791c = new Rect();
        this.f69792d = new Rect();
        Paint paint = new Paint();
        this.f69793e = paint;
        Paint paint2 = new Paint();
        this.f69794f = paint2;
        Paint paint3 = new Paint();
        this.f69795g = paint3;
        Paint paint4 = new Paint();
        this.f69797h = paint4;
        Paint paint5 = new Paint();
        this.f69799i = paint5;
        Paint paint6 = new Paint();
        this.f69801j = paint6;
        paint6.setAntiAlias(true);
        this.f69796g3 = new CopyOnWriteArraySet<>();
        this.f69798h3 = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f69800i3 = f10;
        this.f69813p0 = f(f10, -50);
        int iF = f(f10, 4);
        int iF2 = f(f10, 26);
        int iF3 = f(f10, 4);
        int iF4 = f(f10, 12);
        int iF5 = f(f10, 0);
        int iF6 = f(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, v0.m.f70460l, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(v0.m.f70504w);
                this.f69803k = drawable;
                if (drawable != null) {
                    p(drawable);
                    iF2 = Math.max(drawable.getMinimumHeight(), iF2);
                }
                this.f69805l = typedArrayObtainStyledAttributes.getDimensionPixelSize(v0.m.f70476p, iF);
                this.f69807m = typedArrayObtainStyledAttributes.getDimensionPixelSize(v0.m.f70512y, iF2);
                this.f69809n = typedArrayObtainStyledAttributes.getInt(v0.m.f70472o, 0);
                this.f69811o = typedArrayObtainStyledAttributes.getDimensionPixelSize(v0.m.f70468n, iF3);
                this.f69819s = typedArrayObtainStyledAttributes.getDimensionPixelSize(v0.m.f70508x, iF4);
                this.f69821t = typedArrayObtainStyledAttributes.getDimensionPixelSize(v0.m.f70496u, iF5);
                this.f69824v = typedArrayObtainStyledAttributes.getDimensionPixelSize(v0.m.f70500v, iF6);
                int i12 = typedArrayObtainStyledAttributes.getInt(v0.m.f70488s, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(v0.m.f70492t, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(v0.m.f70480q, G3);
                int i15 = typedArrayObtainStyledAttributes.getInt(v0.m.f70516z, F3);
                int i16 = typedArrayObtainStyledAttributes.getInt(v0.m.f70464m, I3);
                int i17 = typedArrayObtainStyledAttributes.getInt(v0.m.f70484r, J3);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f69805l = iF;
            this.f69807m = iF2;
            this.f69809n = 0;
            this.f69811o = iF3;
            this.f69819s = iF4;
            this.f69821t = iF5;
            this.f69824v = iF6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(G3);
            paint3.setColor(F3);
            paint4.setColor(I3);
            paint5.setColor(J3);
            this.f69803k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f69814p1 = sb2;
        this.H1 = new Formatter(sb2, Locale.getDefault());
        this.f69815p2 = new Runnable() { // from class: androidx.media3.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f69783a.v(false);
            }
        };
        Drawable drawable2 = this.f69803k;
        if (drawable2 != null) {
            this.f69826w = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f69826w = (Math.max(this.f69821t, Math.max(this.f69819s, this.f69824v)) + 1) / 2;
        }
        this.f69812o3 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f69810n3 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                f.d(this.f69785a, valueAnimator2);
            }
        });
        this.f69820s3 = -9223372036854775807L;
        this.f69804k3 = -9223372036854775807L;
        this.f69802j3 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}

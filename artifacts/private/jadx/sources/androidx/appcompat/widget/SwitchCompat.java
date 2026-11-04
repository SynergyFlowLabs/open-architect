package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements o0 {
    private static final int B3 = 250;
    private static final int C3 = 0;
    private static final int D3 = 1;
    private static final int E3 = 2;
    private static final String F3 = "android.widget.Switch";
    private static final int G3 = 1;
    private static final int H3 = 2;
    private static final int I3 = 3;
    private static final Property<SwitchCompat, Float> J3 = new a(Float.class, "thumbPos");
    private static final int[] K3 = {R.attr.state_checked};
    private final Rect A3;
    private float H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f11071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f11072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f11073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f11076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f11077g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private VelocityTracker f11078g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f11079h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f11080h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11081i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    float f11082i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11083j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f11084j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11085k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f11086k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11087l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private int f11088l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11089m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private int f11090m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f11091n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private int f11092n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f11093o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private int f11094o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f11095p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f11096p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private float f11097p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f11098p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f11099q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private final TextPaint f11100r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f11101s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private ColorStateList f11102s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f11103t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private Layout f11104t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private Layout f11105u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence f11106v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @androidx.annotation.p0
    private TransformationMethod f11107v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11108w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    ObjectAnimator f11109w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private final g0 f11110x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NonNull
    private q f11111y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @androidx.annotation.p0
    private b f11112z3;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f11082i3);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    static class b extends androidx.emoji2.text.f.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<SwitchCompat> f11113a;

        b(SwitchCompat switchCompat) {
            this.f11113a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.f.g
        public void a(@androidx.annotation.p0 Throwable th2) {
            SwitchCompat switchCompat = this.f11113a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.f.g
        public void b() {
            SwitchCompat switchCompat = this.f11113a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    private void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, J3, z10 ? 1.0f : 0.0f);
        this.f11109w3 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f11109w3.setAutoCancel(true);
        this.f11109w3.start();
    }

    private void b() {
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            if (this.f11074d || this.f11075e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.c.r(drawable).mutate();
                this.f11071a = drawableMutate;
                if (this.f11074d) {
                    androidx.core.graphics.drawable.c.o(drawableMutate, this.f11072b);
                }
                if (this.f11075e) {
                    androidx.core.graphics.drawable.c.p(this.f11071a, this.f11073c);
                }
                if (this.f11071a.isStateful()) {
                    this.f11071a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f11076f;
        if (drawable != null) {
            if (this.f11081i || this.f11083j) {
                Drawable drawableMutate = androidx.core.graphics.drawable.c.r(drawable).mutate();
                this.f11076f = drawableMutate;
                if (this.f11081i) {
                    androidx.core.graphics.drawable.c.o(drawableMutate, this.f11077g);
                }
                if (this.f11083j) {
                    androidx.core.graphics.drawable.c.p(this.f11076f, this.f11079h);
                }
                if (this.f11076f.isStateful()) {
                    this.f11076f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f11109w3;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    @androidx.annotation.p0
    private CharSequence g(@androidx.annotation.p0 CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f11107v3);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @NonNull
    private q getEmojiTextViewHelper() {
        if (this.f11111y3 == null) {
            this.f11111y3 = new q(this);
        }
        return this.f11111y3;
    }

    private boolean getTargetCheckedState() {
        return this.f11082i3 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((v1.b(this) ? 1.0f - this.f11082i3 : this.f11082i3) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f11076f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.A3;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f11071a;
        Rect rectD = drawable2 != null ? m0.d(drawable2) : m0.f11398c;
        return ((((this.f11084j3 - this.f11088l3) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f11071a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f11071a.getPadding(this.A3);
        int i10 = this.f11092n3;
        int i11 = this.f11096p1;
        int i12 = i10 - i11;
        int i13 = (this.f11090m3 + thumbOffset) - i11;
        int i14 = this.f11088l3 + i13;
        Rect rect = this.A3;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f11098p3 + i11));
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.f11100r3;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f11103t;
            if (string == null) {
                string = getResources().getString(i.a.k.f286275g);
            }
            androidx.core.view.u1.z2(this, string);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f11093o;
            if (string == null) {
                string = getResources().getString(i.a.k.f286276h);
            }
            androidx.core.view.u1.z2(this, string);
        }
    }

    private void o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        n(typeface, i11);
    }

    private void p() {
        androidx.emoji2.text.f fVarC;
        int i10;
        if (this.f11112z3 == null && this.f11111y3.b() && androidx.emoji2.text.f.q() && ((i10 = (fVarC = androidx.emoji2.text.f.c()).i()) == 3 || i10 == 0)) {
            b bVar = new b(this);
            this.f11112z3 = bVar;
            fVarC.B(bVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    private void q(MotionEvent motionEvent) {
        this.f11095p0 = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f11078g3.computeCurrentVelocity(1000);
            float xVelocity = this.f11078g3.getXVelocity();
            if (Math.abs(xVelocity) <= this.f11080h3) {
                targetCheckedState = getTargetCheckedState();
            } else if (v1.b(this)) {
                if (xVelocity >= 0.0f) {
                    targetCheckedState = false;
                }
            } else if (xVelocity <= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f11103t = charSequence;
        this.f11106v = g(charSequence);
        int i10 = 7 << 0;
        this.f11105u3 = null;
        if (this.f11108w) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f11093o = charSequence;
        this.f11101s = g(charSequence);
        this.f11104t3 = null;
        if (this.f11108w) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.A3;
        int i12 = this.f11090m3;
        int i13 = this.f11092n3;
        int i14 = this.f11094o3;
        int i15 = this.f11098p3;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f11071a;
        Rect rectD = drawable != null ? m0.d(drawable) : m0.f11398c;
        Drawable drawable2 = this.f11076f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f11076f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f11076f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f11071a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f11088l3 + rect.right;
            this.f11071a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.c.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f11076f;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.c.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f11071a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f11076f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!v1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f11084j3;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f11089m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (v1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f11084j3;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f11089m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @androidx.annotation.p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.r.F(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f11108w;
    }

    public boolean getSplitTrack() {
        return this.f11091n;
    }

    public int getSwitchMinWidth() {
        return this.f11087l;
    }

    public int getSwitchPadding() {
        return this.f11089m;
    }

    public CharSequence getTextOff() {
        return this.f11103t;
    }

    public CharSequence getTextOn() {
        return this.f11093o;
    }

    public Drawable getThumbDrawable() {
        return this.f11071a;
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    protected final float getThumbPosition() {
        return this.f11082i3;
    }

    public int getThumbTextPadding() {
        return this.f11085k;
    }

    @androidx.annotation.p0
    public ColorStateList getThumbTintList() {
        return this.f11072b;
    }

    @androidx.annotation.p0
    public PorterDuff.Mode getThumbTintMode() {
        return this.f11073c;
    }

    public Drawable getTrackDrawable() {
        return this.f11076f;
    }

    @androidx.annotation.p0
    public ColorStateList getTrackTintList() {
        return this.f11077g;
    }

    @androidx.annotation.p0
    public PorterDuff.Mode getTrackTintMode() {
        return this.f11079h;
    }

    @Override // androidx.appcompat.widget.o0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    void j() {
        setTextOnInternal(this.f11093o);
        setTextOffInternal(this.f11103t);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11071a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f11076f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f11109w3;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f11109w3.end();
            this.f11109w3 = null;
        }
    }

    public void m(Context context, int i10) {
        j1 j1VarE = j1.E(context, i10, i.a.m.f286484a6);
        ColorStateList colorStateListD = j1VarE.d(i.a.m.f286520e6);
        if (colorStateListD != null) {
            this.f11102s3 = colorStateListD;
        } else {
            this.f11102s3 = getTextColors();
        }
        int iG = j1VarE.g(i.a.m.f286493b6, 0);
        if (iG != 0) {
            float f10 = iG;
            if (f10 != this.f11100r3.getTextSize()) {
                this.f11100r3.setTextSize(f10);
                requestLayout();
            }
        }
        o(j1VarE.o(i.a.m.f286502c6, -1), j1VarE.o(i.a.m.f286511d6, -1));
        if (j1VarE.a(i.a.m.f286616p6, false)) {
            this.f11107v3 = new l.a(getContext());
        } else {
            this.f11107v3 = null;
        }
        setTextOnInternal(this.f11093o);
        setTextOffInternal(this.f11103t);
        j1VarE.I();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.f11100r3.setFakeBoldText(false);
            this.f11100r3.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.f11100r3.setFakeBoldText((i11 & 1) != 0);
            this.f11100r3.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K3);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.A3;
        Drawable drawable = this.f11076f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f11092n3;
        int i11 = this.f11098p3;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f11071a;
        if (drawable != null) {
            if (!this.f11091n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = m0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f11104t3 : this.f11105u3;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f11102s3;
            if (colorStateList != null) {
                this.f11100r3.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f11100r3.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(F3);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(F3);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f11093o : this.f11103t;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f11071a != null) {
            Rect rect = this.A3;
            Drawable drawable = this.f11076f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = m0.d(this.f11071a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (v1.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f11084j3 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f11084j3) + iMax + iMax2;
        }
        int gravity = getGravity() & com.planner5d.library.engine.input.f.b.B;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.f11086k3;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f11086k3;
            }
            this.f11090m3 = paddingLeft;
            this.f11092n3 = paddingTop;
            this.f11098p3 = height;
            this.f11094o3 = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i14 = this.f11086k3;
        paddingTop = paddingTop2 - (i14 / 2);
        height = i14 + paddingTop;
        this.f11090m3 = paddingLeft;
        this.f11092n3 = paddingTop;
        this.f11098p3 = height;
        this.f11094o3 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f11108w) {
            if (this.f11104t3 == null) {
                this.f11104t3 = i(this.f11101s);
            }
            if (this.f11105u3 == null) {
                this.f11105u3 = i(this.f11106v);
            }
        }
        Rect rect = this.A3;
        Drawable drawable = this.f11071a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f11071a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f11071a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f11088l3 = Math.max(this.f11108w ? Math.max(this.f11104t3.getWidth(), this.f11105u3.getWidth()) + (this.f11085k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f11076f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f11076f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f11071a;
        if (drawable3 != null) {
            Rect rectD = m0.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.f11099q3 ? Math.max(this.f11087l, (this.f11088l3 * 2) + iMax + iMax2) : this.f11087l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f11084j3 = iMax3;
        this.f11086k3 = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f11093o : this.f11103t;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        this.f11078g3.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && h(x10, y10)) {
                this.f11095p0 = 1;
                this.H1 = x10;
                this.f11097p2 = y10;
            }
        } else if (actionMasked == 1) {
            if (this.f11095p0 == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f11095p0 = 0;
            this.f11078g3.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f11095p0;
            if (i10 == 1) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x11 - this.H1) > this.f11096p1 || Math.abs(y11 - this.f11097p2) > this.f11096p1) {
                    this.f11095p0 = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.H1 = x11;
                    this.f11097p2 = y11;
                    return true;
                }
            } else if (i10 == 2) {
                float x12 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x12 - this.H1;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > 0.0f ? 1.0f : -1.0f;
                }
                if (v1.b(this)) {
                    f10 = -f10;
                }
                float f12 = f(this.f11082i3 + f10, 0.0f, 1.0f);
                if (f12 != this.f11082i3) {
                    this.H1 = x12;
                    setThumbPosition(f12);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f11095p0 == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f11095p0 = 0;
            this.f11078g3.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.r.G(this, callback));
    }

    @Override // androidx.appcompat.widget.o0
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f11093o);
        setTextOffInternal(this.f11103t);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.f11099q3 = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f11108w != z10) {
            this.f11108w = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f11091n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f11087l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f11089m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f11100r3.getTypeface() == null || this.f11100r3.getTypeface().equals(typeface)) && (this.f11100r3.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f11100r3.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f11071a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f11071a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f11082i3 = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(j.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f11085k = i10;
        requestLayout();
    }

    public void setThumbTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f11072b = colorStateList;
        this.f11074d = true;
        b();
    }

    public void setThumbTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f11073c = mode;
        this.f11075e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f11076f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f11076f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(j.a.b(getContext(), i10));
    }

    public void setTrackTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f11077g = colorStateList;
        this.f11081i = true;
        c();
    }

    public void setTrackTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f11079h = mode;
        this.f11083j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11071a || drawable == this.f11076f;
    }

    public SwitchCompat(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.f285949l3);
    }

    public SwitchCompat(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11072b = null;
        this.f11073c = null;
        this.f11074d = false;
        this.f11075e = false;
        this.f11077g = null;
        this.f11079h = null;
        this.f11081i = false;
        this.f11083j = false;
        this.f11078g3 = VelocityTracker.obtain();
        this.f11099q3 = true;
        this.A3 = new Rect();
        e1.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f11100r3 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        j1 j1VarG = j1.G(context, attributeSet, i.a.m.L5, i10, 0);
        androidx.core.view.u1.E1(this, context, i.a.m.L5, attributeSet, j1VarG.B(), i10, 0);
        Drawable drawableH = j1VarG.h(i.a.m.O5);
        this.f11071a = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(this);
        }
        Drawable drawableH2 = j1VarG.h(i.a.m.X5);
        this.f11076f = drawableH2;
        if (drawableH2 != null) {
            drawableH2.setCallback(this);
        }
        setTextOnInternal(j1VarG.x(i.a.m.M5));
        setTextOffInternal(j1VarG.x(i.a.m.N5));
        this.f11108w = j1VarG.a(i.a.m.P5, true);
        this.f11085k = j1VarG.g(i.a.m.U5, 0);
        this.f11087l = j1VarG.g(i.a.m.R5, 0);
        this.f11089m = j1VarG.g(i.a.m.S5, 0);
        this.f11091n = j1VarG.a(i.a.m.Q5, false);
        ColorStateList colorStateListD = j1VarG.d(i.a.m.V5);
        if (colorStateListD != null) {
            this.f11072b = colorStateListD;
            this.f11074d = true;
        }
        PorterDuff.Mode modeE = m0.e(j1VarG.o(i.a.m.W5, -1), null);
        if (this.f11073c != modeE) {
            this.f11073c = modeE;
            this.f11075e = true;
        }
        if (this.f11074d || this.f11075e) {
            b();
        }
        ColorStateList colorStateListD2 = j1VarG.d(i.a.m.Y5);
        if (colorStateListD2 != null) {
            this.f11077g = colorStateListD2;
            this.f11081i = true;
        }
        PorterDuff.Mode modeE2 = m0.e(j1VarG.o(i.a.m.Z5, -1), null);
        if (this.f11079h != modeE2) {
            this.f11079h = modeE2;
            this.f11083j = true;
        }
        if (this.f11081i || this.f11083j) {
            c();
        }
        int iU = j1VarG.u(i.a.m.T5, 0);
        if (iU != 0) {
            m(context, iU);
        }
        g0 g0Var = new g0(this);
        this.f11110x3 = g0Var;
        g0Var.m(attributeSet, i10);
        j1VarG.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11096p1 = viewConfiguration.getScaledTouchSlop();
        this.f11080h3 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}

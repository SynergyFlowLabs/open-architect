package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.g0;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.m0;
import androidx.core.view.j0;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final int f114055j4 = 167;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final int f114056k4 = 87;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final int f114057l4 = 67;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f114058m4 = -1;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final int f114059n4 = -1;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final String f114061p4 = "TextInputLayout";

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final int f114062q4 = 0;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final int f114063r4 = 1;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final int f114064s4 = 2;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final int f114065t4 = -1;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final int f114066u4 = 0;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final int f114067v4 = 1;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final int f114068w4 = 2;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final int f114069x4 = 3;
    private int A3;
    private int B3;

    @androidx.annotation.l
    private int C3;

    @androidx.annotation.l
    private int D3;
    private final Rect E3;
    private final Rect F3;
    private final RectF G3;
    private int H1;
    private Typeface H3;

    @p0
    private Drawable I3;
    private int J3;
    private final LinkedHashSet<h> K3;

    @p0
    private Drawable L3;
    private int M3;
    private Drawable N3;
    private ColorStateList O3;
    private ColorStateList P3;

    @androidx.annotation.l
    private int Q3;

    @androidx.annotation.l
    private int R3;

    @androidx.annotation.l
    private int S3;
    private ColorStateList T3;

    @androidx.annotation.l
    private int U3;

    @androidx.annotation.l
    private int V3;

    @androidx.annotation.l
    private int W3;

    @androidx.annotation.l
    private int X3;

    @androidx.annotation.l
    private int Y3;
    int Z3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f114070a;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private boolean f114071a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final z f114072b;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    final com.google.android.material.internal.b f114073b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final r f114074c;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private boolean f114075c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    EditText f114076d;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private boolean f114077d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f114078e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private ValueAnimator f114079e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f114080f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private boolean f114081f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f114082g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @p0
    private androidx.transition.k f114083g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private boolean f114084g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f114085h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @p0
    private ColorStateList f114086h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private boolean f114087h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f114088i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @p0
    private ColorStateList f114089i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f114090j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @p0
    private ColorStateList f114091j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f114092k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @p0
    private ColorStateList f114093k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f114094l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f114095l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f114096m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private CharSequence f114097m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private g f114098n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean f114099n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private TextView f114100o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.k f114101o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private TextView f114102p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private ColorStateList f114103p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @p0
    private androidx.transition.k f114104p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private com.google.android.material.shape.k f114105p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private StateListDrawable f114106q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f114107r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f114108s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.k f114109s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f114110t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.k f114111t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @NonNull
    private com.google.android.material.shape.p f114112u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence f114113v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f114114v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f114115w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private final int f114116w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private int f114117x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private int f114118y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private int f114119z3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final int f114054i4 = r6.a.n.Ve;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final int[][] f114060o4 = {new int[]{R.attr.state_pressed}, new int[0]};

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        CharSequence f114120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f114121d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f114120c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f114120c, parcel, i10);
            parcel.writeInt(this.f114121d ? 1 : 0);
        }

        SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f114120c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f114121d = parcel.readInt() == 1;
        }
    }

    class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f114122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f114123b;

        a(EditText editText) {
            this.f114123b = editText;
            this.f114122a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.M0(!textInputLayout.f114084g4);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f114092k) {
                textInputLayout2.C0(editable);
            }
            if (TextInputLayout.this.f114115w) {
                TextInputLayout.this.Q0(editable);
            }
            int lineCount = this.f114123b.getLineCount();
            int i10 = this.f114122a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iH0 = u1.h0(this.f114123b);
                    int i11 = TextInputLayout.this.Z3;
                    if (iH0 != i11) {
                        this.f114123b.setMinimumHeight(i11);
                    }
                }
                this.f114122a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f114074c.i();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f114073b4.A0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextInputLayout f114127a;

        public d(@NonNull TextInputLayout textInputLayout) {
            this.f114127a = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            EditText editText = this.f114127a.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f114127a.getHint();
            CharSequence error = this.f114127a.getError();
            CharSequence placeholderText = this.f114127a.getPlaceholderText();
            int counterMaxLength = this.f114127a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f114127a.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean Z = this.f114127a.Z();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f114127a.f114072b.B(jVar);
            if (!zIsEmpty) {
                jVar.d2(text);
            } else if (!TextUtils.isEmpty(string)) {
                jVar.d2(string);
                if (!Z && placeholderText != null) {
                    jVar.d2(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                jVar.d2(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                jVar.A1(string);
                jVar.Z1(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            jVar.J1(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                jVar.v1(error);
            }
            View viewU = this.f114127a.f114090j.u();
            if (viewU != null) {
                jVar.D1(viewU);
            }
            this.f114127a.f114074c.o().o(view, jVar);
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f114127a.f114074c.o().p(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface f {
    }

    public interface g {
        int a(@p0 Editable editable);
    }

    public interface h {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    public interface i {
        void a(@NonNull TextInputLayout textInputLayout, int i10);
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    private void A0(@NonNull Rect rect) {
        com.google.android.material.shape.k kVar = this.f114109s3;
        if (kVar != null) {
            int i10 = rect.bottom;
            kVar.setBounds(rect.left, i10 - this.A3, rect.right, i10);
        }
        com.google.android.material.shape.k kVar2 = this.f114111t3;
        if (kVar2 != null) {
            int i11 = rect.bottom;
            kVar2.setBounds(rect.left, i11 - this.B3, rect.right, i11);
        }
    }

    private void B() {
        if (E()) {
            ((com.google.android.material.textfield.h) this.f114101o3).U0();
        }
    }

    private void B0() {
        if (this.f114100o != null) {
            EditText editText = this.f114076d;
            C0(editText == null ? null : editText.getText());
        }
    }

    private void C(boolean z10) {
        ValueAnimator valueAnimator = this.f114079e4;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f114079e4.cancel();
        }
        if (z10 && this.f114077d4) {
            m(1.0f);
        } else {
            this.f114073b4.A0(1.0f);
        }
        this.f114071a4 = false;
        if (E()) {
            h0();
        }
        P0();
        this.f114072b.m(false);
        this.f114074c.L(false);
    }

    private androidx.transition.k D() {
        androidx.transition.k kVar = new androidx.transition.k();
        kVar.E0(com.google.android.material.motion.j.f(getContext(), r6.a.c.Nd, 87));
        kVar.G0(com.google.android.material.motion.j.g(getContext(), r6.a.c.Xd, com.google.android.material.animation.b.f111043a));
        return kVar;
    }

    private static void D0(@NonNull Context context, @NonNull TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? r6.a.m.Q : r6.a.m.P, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private boolean E() {
        return this.f114095l3 && !TextUtils.isEmpty(this.f114097m3) && (this.f114101o3 instanceof com.google.android.material.textfield.h);
    }

    private void E0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f114100o;
        if (textView != null) {
            u0(textView, this.f114096m ? this.f114108s : this.f114110t);
            if (!this.f114096m && (colorStateList2 = this.f114086h3) != null) {
                this.f114100o.setTextColor(colorStateList2);
            }
            if (!this.f114096m || (colorStateList = this.f114089i3) == null) {
                return;
            }
            this.f114100o.setTextColor(colorStateList);
        }
    }

    @w0(29)
    private void F0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListL = this.f114091j3;
        if (colorStateListL == null) {
            colorStateListL = com.google.android.material.color.u.l(getContext(), r6.a.c.f359465p3);
        }
        EditText editText = this.f114076d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.c.r(this.f114076d.getTextCursorDrawable()).mutate();
        if (a0() && (colorStateList = this.f114093k3) != null) {
            colorStateListL = colorStateList;
        }
        androidx.core.graphics.drawable.c.o(drawableMutate, colorStateListL);
    }

    private void G() {
        Iterator<h> it = this.K3.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void H(Canvas canvas) {
        com.google.android.material.shape.k kVar;
        if (this.f114111t3 == null || (kVar = this.f114109s3) == null) {
            return;
        }
        kVar.draw(canvas);
        if (this.f114076d.isFocused()) {
            Rect bounds = this.f114111t3.getBounds();
            Rect bounds2 = this.f114109s3.getBounds();
            float fG = this.f114073b4.G();
            int iCenterX = bounds2.centerX();
            bounds.left = com.google.android.material.animation.b.c(iCenterX, bounds2.left, fG);
            bounds.right = com.google.android.material.animation.b.c(iCenterX, bounds2.right, fG);
            this.f114111t3.draw(canvas);
        }
    }

    private void I(@NonNull Canvas canvas) {
        if (this.f114095l3) {
            this.f114073b4.l(canvas);
        }
    }

    private void I0() {
        u1.O1(this.f114076d, getEditTextBoxBackground());
    }

    private void J(boolean z10) {
        ValueAnimator valueAnimator = this.f114079e4;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f114079e4.cancel();
        }
        if (z10 && this.f114077d4) {
            m(0.0f);
        } else {
            this.f114073b4.A0(0.0f);
        }
        if (E() && ((com.google.android.material.textfield.h) this.f114101o3).T0()) {
            B();
        }
        this.f114071a4 = true;
        P();
        this.f114072b.m(true);
        this.f114074c.L(true);
    }

    private com.google.android.material.shape.k K(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(r6.a.f.f360304md);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f114076d;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(r6.a.f.f360440v5);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(r6.a.f.f360127bc);
        com.google.android.material.shape.p pVarM = com.google.android.material.shape.p.a().K(f10).P(f10).x(dimensionPixelOffset).C(dimensionPixelOffset).m();
        EditText editText2 = this.f114076d;
        com.google.android.material.shape.k kVarO = com.google.android.material.shape.k.o(getContext(), popupElevation, editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null);
        kVarO.setShapeAppearanceModel(pVarM);
        kVarO.r0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return kVarO;
    }

    private boolean K0() {
        int iMax;
        if (this.f114076d == null || this.f114076d.getMeasuredHeight() >= (iMax = Math.max(this.f114074c.getMeasuredHeight(), this.f114072b.getMeasuredHeight()))) {
            return false;
        }
        this.f114076d.setMinimumHeight(iMax);
        return true;
    }

    private static Drawable L(com.google.android.material.shape.k kVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{com.google.android.material.color.u.t(i11, i10, 0.1f), i10}), kVar, kVar);
    }

    private void L0() {
        if (this.f114117x3 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f114070a.getLayoutParams();
            int iW = w();
            if (iW != layoutParams.topMargin) {
                layoutParams.topMargin = iW;
                this.f114070a.requestLayout();
            }
        }
    }

    private int M(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.f114076d.getCompoundPaddingLeft() : this.f114074c.A();
        } else {
            compoundPaddingLeft = this.f114072b.c();
        }
        return i10 + compoundPaddingLeft;
    }

    private int N(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.f114076d.getCompoundPaddingRight() : this.f114072b.c();
        } else {
            compoundPaddingRight = this.f114074c.A();
        }
        return i10 - compoundPaddingRight;
    }

    private void N0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f114076d;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f114076d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.O3;
        if (colorStateList2 != null) {
            this.f114073b4.f0(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.O3;
            this.f114073b4.f0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.Y3) : this.Y3));
        } else if (v0()) {
            this.f114073b4.f0(this.f114090j.s());
        } else if (this.f114096m && (textView = this.f114100o) != null) {
            this.f114073b4.f0(textView.getTextColors());
        } else if (z12 && (colorStateList = this.P3) != null) {
            this.f114073b4.k0(colorStateList);
        }
        if (z13 || !this.f114075c4 || (isEnabled() && z12)) {
            if (!z11) {
                if (this.f114071a4) {
                }
            }
            C(z10);
        } else if (z11 || !this.f114071a4) {
            J(z10);
        }
    }

    private static Drawable O(Context context, com.google.android.material.shape.k kVar, int i10, int[][] iArr) {
        int iC = com.google.android.material.color.u.c(context, r6.a.c.f359214e4, f114061p4);
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(kVar.getShapeAppearanceModel());
        int iT = com.google.android.material.color.u.t(i10, iC, 0.1f);
        kVar2.p0(new ColorStateList(iArr, new int[]{iT, 0}));
        kVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iT, iC});
        com.google.android.material.shape.k kVar3 = new com.google.android.material.shape.k(kVar.getShapeAppearanceModel());
        kVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, kVar2, kVar3), kVar});
    }

    private void O0() {
        EditText editText;
        if (this.f114102p0 == null || (editText = this.f114076d) == null) {
            return;
        }
        this.f114102p0.setGravity(editText.getGravity());
        this.f114102p0.setPadding(this.f114076d.getCompoundPaddingLeft(), this.f114076d.getCompoundPaddingTop(), this.f114076d.getCompoundPaddingRight(), this.f114076d.getCompoundPaddingBottom());
    }

    private void P() {
        TextView textView = this.f114102p0;
        if (textView != null && this.f114115w) {
            textView.setText((CharSequence) null);
            androidx.transition.p0.b(this.f114070a, this.f114083g3);
            this.f114102p0.setVisibility(4);
        }
    }

    private void P0() {
        EditText editText = this.f114076d;
        Q0(editText == null ? null : editText.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(@p0 Editable editable) {
        if (this.f114098n.a(editable) != 0 || this.f114071a4) {
            P();
        } else {
            y0();
        }
    }

    private void R0(boolean z10, boolean z11) {
        int defaultColor = this.T3.getDefaultColor();
        int colorForState = this.T3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.T3.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.C3 = colorForState2;
        } else if (z11) {
            this.C3 = colorForState;
        } else {
            this.C3 = defaultColor;
        }
    }

    private boolean a0() {
        if (v0()) {
            return true;
        }
        return this.f114100o != null && this.f114096m;
    }

    public static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean d0() {
        return this.f114117x3 == 1 && this.f114076d.getMinLines() <= 1;
    }

    private void g0() {
        q();
        J0();
        S0();
        z0();
        l();
        if (this.f114117x3 != 0) {
            L0();
        }
        t0();
    }

    @p0
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f114076d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.f114101o3;
        }
        int iD = com.google.android.material.color.u.d(this.f114076d, r6.a.c.f359488q3);
        int i10 = this.f114117x3;
        if (i10 == 2) {
            return O(getContext(), this.f114101o3, iD, f114060o4);
        }
        if (i10 == 1) {
            return L(this.f114101o3, this.D3, iD, f114060o4);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f114106q3 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f114106q3 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f114106q3.addState(new int[0], K(false));
        }
        return this.f114106q3;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f114105p3 == null) {
            this.f114105p3 = K(true);
        }
        return this.f114105p3;
    }

    private void h0() {
        if (E()) {
            RectF rectF = this.G3;
            this.f114073b4.o(rectF, this.f114076d.getWidth(), this.f114076d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f114119z3);
            ((com.google.android.material.textfield.h) this.f114101o3).W0(rectF);
        }
    }

    private void j0() {
        if (!E() || this.f114071a4) {
            return;
        }
        B();
        h0();
    }

    private void k() {
        TextView textView = this.f114102p0;
        if (textView != null) {
            this.f114070a.addView(textView);
            this.f114102p0.setVisibility(0);
        }
    }

    private static void k0(@NonNull ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k0((ViewGroup) childAt, z10);
            }
        }
    }

    private void l() {
        if (this.f114076d == null || this.f114117x3 != 1) {
            return;
        }
        if (com.google.android.material.resources.c.k(getContext())) {
            EditText editText = this.f114076d;
            u1.m2(editText, u1.n0(editText), getResources().getDimensionPixelSize(r6.a.f.Y9), u1.m0(this.f114076d), getResources().getDimensionPixelSize(r6.a.f.X9));
        } else if (com.google.android.material.resources.c.j(getContext())) {
            EditText editText2 = this.f114076d;
            u1.m2(editText2, u1.n0(editText2), getResources().getDimensionPixelSize(r6.a.f.W9), u1.m0(this.f114076d), getResources().getDimensionPixelSize(r6.a.f.V9));
        }
    }

    private void n() {
        com.google.android.material.shape.k kVar = this.f114101o3;
        if (kVar == null) {
            return;
        }
        com.google.android.material.shape.p shapeAppearanceModel = kVar.getShapeAppearanceModel();
        com.google.android.material.shape.p pVar = this.f114112u3;
        if (shapeAppearanceModel != pVar) {
            this.f114101o3.setShapeAppearanceModel(pVar);
        }
        if (x()) {
            this.f114101o3.E0(this.f114119z3, this.C3);
        }
        int iR = r();
        this.D3 = iR;
        this.f114101o3.p0(ColorStateList.valueOf(iR));
        o();
        J0();
    }

    private void o() {
        if (this.f114109s3 == null || this.f114111t3 == null) {
            return;
        }
        if (y()) {
            this.f114109s3.p0(this.f114076d.isFocused() ? ColorStateList.valueOf(this.Q3) : ColorStateList.valueOf(this.C3));
            this.f114111t3.p0(ColorStateList.valueOf(this.C3));
        }
        invalidate();
    }

    private void p(@NonNull RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f114116w3;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void q() {
        int i10 = this.f114117x3;
        if (i10 == 0) {
            this.f114101o3 = null;
            this.f114109s3 = null;
            this.f114111t3 = null;
            return;
        }
        if (i10 == 1) {
            this.f114101o3 = new com.google.android.material.shape.k(this.f114112u3);
            this.f114109s3 = new com.google.android.material.shape.k();
            this.f114111t3 = new com.google.android.material.shape.k();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f114117x3 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f114095l3 || (this.f114101o3 instanceof com.google.android.material.textfield.h)) {
                this.f114101o3 = new com.google.android.material.shape.k(this.f114112u3);
            } else {
                this.f114101o3 = com.google.android.material.textfield.h.R0(this.f114112u3);
            }
            this.f114109s3 = null;
            this.f114111t3 = null;
        }
    }

    private void q0() {
        TextView textView = this.f114102p0;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private int r() {
        return this.f114117x3 == 1 ? com.google.android.material.color.u.s(com.google.android.material.color.u.e(this, r6.a.c.f359214e4, 0), this.D3) : this.D3;
    }

    @NonNull
    private Rect s(@NonNull Rect rect) {
        if (this.f114076d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.F3;
        boolean zS = com.google.android.material.internal.p0.s(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f114117x3;
        if (i10 == 1) {
            rect2.left = M(rect.left, zS);
            rect2.top = rect.top + this.f114118y3;
            rect2.right = N(rect.right, zS);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = M(rect.left, zS);
            rect2.top = getPaddingTop();
            rect2.right = N(rect.right, zS);
            return rect2;
        }
        rect2.left = rect.left + this.f114076d.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.f114076d.getPaddingRight();
        return rect2;
    }

    private void setEditText(EditText editText) {
        if (this.f114076d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.f114076d = editText;
        int i10 = this.f114080f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f114085h);
        }
        int i11 = this.f114082g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f114088i);
        }
        this.f114107r3 = false;
        g0();
        setTextInputAccessibilityDelegate(new d(this));
        this.f114073b4.P0(this.f114076d.getTypeface());
        this.f114073b4.x0(this.f114076d.getTextSize());
        this.f114073b4.s0(this.f114076d.getLetterSpacing());
        int gravity = this.f114076d.getGravity();
        this.f114073b4.l0((gravity & (-113)) | 48);
        this.f114073b4.w0(gravity);
        this.Z3 = u1.h0(editText);
        this.f114076d.addTextChangedListener(new a(editText));
        if (this.O3 == null) {
            this.O3 = this.f114076d.getHintTextColors();
        }
        if (this.f114095l3) {
            if (TextUtils.isEmpty(this.f114097m3)) {
                CharSequence hint = this.f114076d.getHint();
                this.f114078e = hint;
                setHint(hint);
                int i12 = 5 & 0;
                this.f114076d.setHint((CharSequence) null);
            }
            this.f114099n3 = true;
        }
        F0();
        if (this.f114100o != null) {
            C0(this.f114076d.getText());
        }
        H0();
        this.f114090j.f();
        this.f114072b.bringToFront();
        this.f114074c.bringToFront();
        G();
        this.f114074c.D0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        N0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f114097m3)) {
            return;
        }
        this.f114097m3 = charSequence;
        this.f114073b4.M0(charSequence);
        if (this.f114071a4) {
            return;
        }
        h0();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f114115w == z10) {
            return;
        }
        if (z10) {
            k();
        } else {
            q0();
            this.f114102p0 = null;
        }
        this.f114115w = z10;
    }

    private int t(@NonNull Rect rect, @NonNull Rect rect2, float f10) {
        return d0() ? (int) (rect2.top + f10) : rect.bottom - this.f114076d.getCompoundPaddingBottom();
    }

    private void t0() {
        EditText editText = this.f114076d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f114117x3;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private int u(@NonNull Rect rect, float f10) {
        return d0() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f114076d.getCompoundPaddingTop();
    }

    @NonNull
    private Rect v(@NonNull Rect rect) {
        if (this.f114076d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.F3;
        float fD = this.f114073b4.D();
        rect2.left = rect.left + this.f114076d.getCompoundPaddingLeft();
        rect2.top = u(rect, fD);
        rect2.right = rect.right - this.f114076d.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, fD);
        return rect2;
    }

    private int w() {
        float fR;
        if (!this.f114095l3) {
            return 0;
        }
        int i10 = this.f114117x3;
        if (i10 == 0) {
            fR = this.f114073b4.r();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fR = this.f114073b4.r() / 2.0f;
        }
        return (int) fR;
    }

    private boolean w0() {
        return (this.f114074c.J() || ((this.f114074c.C() && S()) || this.f114074c.y() != null)) && this.f114074c.getMeasuredWidth() > 0;
    }

    private boolean x() {
        return this.f114117x3 == 2 && y();
    }

    private boolean x0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f114072b.getMeasuredWidth() > 0;
    }

    private boolean y() {
        return this.f114119z3 > -1 && this.C3 != 0;
    }

    private void y0() {
        if (this.f114102p0 == null || !this.f114115w || TextUtils.isEmpty(this.f114113v)) {
            return;
        }
        this.f114102p0.setText(this.f114113v);
        androidx.transition.p0.b(this.f114070a, this.f114104p2);
        this.f114102p0.setVisibility(0);
        this.f114102p0.bringToFront();
        announceForAccessibility(this.f114113v);
    }

    private void z0() {
        if (this.f114117x3 == 1) {
            if (com.google.android.material.resources.c.k(getContext())) {
                this.f114118y3 = getResources().getDimensionPixelSize(r6.a.f.f360109aa);
            } else if (com.google.android.material.resources.c.j(getContext())) {
                this.f114118y3 = getResources().getDimensionPixelSize(r6.a.f.Z9);
            }
        }
    }

    public void A() {
        this.f114074c.j();
    }

    void C0(@p0 Editable editable) {
        int iA = this.f114098n.a(editable);
        boolean z10 = this.f114096m;
        int i10 = this.f114094l;
        if (i10 == -1) {
            this.f114100o.setText(String.valueOf(iA));
            int i11 = 6 >> 0;
            this.f114100o.setContentDescription(null);
            this.f114096m = false;
        } else {
            this.f114096m = iA > i10;
            D0(getContext(), this.f114100o, iA, this.f114094l, this.f114096m);
            if (z10 != this.f114096m) {
                E0();
            }
            this.f114100o.setText(androidx.core.text.a.c().q(getContext().getString(r6.a.m.R, Integer.valueOf(iA), Integer.valueOf(this.f114094l))));
        }
        if (this.f114076d != null && z10 != this.f114096m) {
            M0(false);
            S0();
            H0();
        }
    }

    @l1
    boolean F() {
        return E() && ((com.google.android.material.textfield.h) this.f114101o3).T0();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    boolean G0() {
        boolean z10;
        if (this.f114076d == null) {
            return false;
        }
        boolean z11 = true;
        if (x0()) {
            int measuredWidth = this.f114072b.getMeasuredWidth() - this.f114076d.getPaddingLeft();
            if (this.I3 == null || this.J3 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.I3 = colorDrawable;
                this.J3 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrH = androidx.core.widget.r.h(this.f114076d);
            Drawable drawable = drawableArrH[0];
            Drawable drawable2 = this.I3;
            if (drawable != drawable2) {
                androidx.core.widget.r.u(this.f114076d, drawable2, drawableArrH[1], drawableArrH[2], drawableArrH[3]);
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.I3 != null) {
            Drawable[] drawableArrH2 = androidx.core.widget.r.h(this.f114076d);
            androidx.core.widget.r.u(this.f114076d, null, drawableArrH2[1], drawableArrH2[2], drawableArrH2[3]);
            this.I3 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        if (w0()) {
            int measuredWidth2 = this.f114074c.B().getMeasuredWidth() - this.f114076d.getPaddingRight();
            CheckableImageButton checkableImageButtonM = this.f114074c.m();
            if (checkableImageButtonM != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonM.getMeasuredWidth() + j0.c((ViewGroup.MarginLayoutParams) checkableImageButtonM.getLayoutParams());
            }
            Drawable[] drawableArrH3 = androidx.core.widget.r.h(this.f114076d);
            Drawable drawable3 = this.L3;
            if (drawable3 != null && this.M3 != measuredWidth2) {
                this.M3 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.r.u(this.f114076d, drawableArrH3[0], drawableArrH3[1], this.L3, drawableArrH3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.L3 = colorDrawable2;
                this.M3 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrH3[2];
            Drawable drawable5 = this.L3;
            if (drawable4 != drawable5) {
                this.N3 = drawable4;
                androidx.core.widget.r.u(this.f114076d, drawableArrH3[0], drawableArrH3[1], drawable5, drawableArrH3[3]);
                return true;
            }
        } else if (this.L3 != null) {
            Drawable[] drawableArrH4 = androidx.core.widget.r.h(this.f114076d);
            if (drawableArrH4[2] == this.L3) {
                androidx.core.widget.r.u(this.f114076d, drawableArrH4[0], drawableArrH4[1], this.N3, drawableArrH4[3]);
            } else {
                z11 = z10;
            }
            this.L3 = null;
            return z11;
        }
        return z10;
    }

    void H0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f114076d;
        if (editText != null && this.f114117x3 == 0 && (background = editText.getBackground()) != null) {
            if (m0.a(background)) {
                background = background.mutate();
            }
            if (v0()) {
                background.setColorFilter(androidx.appcompat.widget.n.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.f114096m && (textView = this.f114100o) != null) {
                background.setColorFilter(androidx.appcompat.widget.n.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                androidx.core.graphics.drawable.c.c(background);
                this.f114076d.refreshDrawableState();
            }
        }
    }

    void J0() {
        EditText editText = this.f114076d;
        if (editText == null || this.f114101o3 == null) {
            return;
        }
        if ((this.f114107r3 || editText.getBackground() == null) && this.f114117x3 != 0) {
            I0();
            this.f114107r3 = true;
        }
    }

    void M0(boolean z10) {
        N0(z10, false);
    }

    public boolean Q() {
        return this.f114092k;
    }

    public boolean R() {
        return this.f114074c.G();
    }

    public boolean S() {
        return this.f114074c.I();
    }

    void S0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f114101o3 != null && this.f114117x3 != 0) {
            boolean z10 = false;
            boolean z11 = isFocused() || ((editText2 = this.f114076d) != null && editText2.hasFocus());
            if (isHovered() || ((editText = this.f114076d) != null && editText.isHovered())) {
                z10 = true;
            }
            if (!isEnabled()) {
                this.C3 = this.Y3;
            } else if (v0()) {
                if (this.T3 != null) {
                    R0(z11, z10);
                } else {
                    this.C3 = getErrorCurrentTextColors();
                }
            } else if (!this.f114096m || (textView = this.f114100o) == null) {
                if (z11) {
                    this.C3 = this.S3;
                } else if (z10) {
                    this.C3 = this.R3;
                } else {
                    this.C3 = this.Q3;
                }
            } else if (this.T3 != null) {
                R0(z11, z10);
            } else {
                this.C3 = textView.getCurrentTextColor();
            }
            F0();
            this.f114074c.M();
            n0();
            if (this.f114117x3 == 2) {
                int i10 = this.f114119z3;
                if (z11 && isEnabled()) {
                    this.f114119z3 = this.B3;
                } else {
                    this.f114119z3 = this.A3;
                }
                if (this.f114119z3 != i10) {
                    j0();
                }
            }
            if (this.f114117x3 == 1) {
                if (!isEnabled()) {
                    this.D3 = this.V3;
                } else if (z10 && !z11) {
                    this.D3 = this.X3;
                } else if (z11) {
                    this.D3 = this.W3;
                } else {
                    this.D3 = this.U3;
                }
            }
            n();
        }
    }

    public boolean T() {
        return this.f114090j.F();
    }

    public boolean U() {
        return this.f114075c4;
    }

    @l1
    final boolean V() {
        return this.f114090j.y();
    }

    public boolean W() {
        return this.f114090j.G();
    }

    public boolean X() {
        return this.f114077d4;
    }

    public boolean Y() {
        return this.f114095l3;
    }

    final boolean Z() {
        return this.f114071a4;
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f114070a.addView(view, layoutParams2);
        this.f114070a.setLayoutParams(layoutParams);
        L0();
        setEditText((EditText) view);
    }

    @Deprecated
    public boolean b0() {
        return this.f114074c.K();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean c0() {
        return this.f114099n3;
    }

    @Override // android.view.ViewGroup, android.view.View
    @e.b(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i10) {
        EditText editText = this.f114076d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f114078e != null) {
            boolean z10 = this.f114099n3;
            this.f114099n3 = false;
            CharSequence hint = editText.getHint();
            this.f114076d.setHint(this.f114078e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                this.f114076d.setHint(hint);
                return;
            } finally {
                this.f114076d.setHint(hint);
                this.f114099n3 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f114070a.getChildCount());
        for (int i11 = 0; i11 < this.f114070a.getChildCount(); i11++) {
            View childAt = this.f114070a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f114076d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f114084g4 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f114084g4 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        I(canvas);
        H(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f114081f4) {
            return;
        }
        boolean z10 = true;
        this.f114081f4 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f114073b4;
        boolean zK0 = bVar != null ? bVar.K0(drawableState) : false;
        if (this.f114076d != null) {
            if (!u1.Y0(this) || !isEnabled()) {
                z10 = false;
            }
            M0(z10);
        }
        H0();
        S0();
        if (zK0) {
            invalidate();
        }
        this.f114081f4 = false;
    }

    public boolean e0() {
        return this.f114072b.k();
    }

    public boolean f0() {
        return this.f114072b.l();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f114076d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    @NonNull
    com.google.android.material.shape.k getBoxBackground() {
        int i10 = this.f114117x3;
        if (i10 == 1 || i10 == 2) {
            return this.f114101o3;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.D3;
    }

    public int getBoxBackgroundMode() {
        return this.f114117x3;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f114118y3;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.p0.s(this) ? this.f114112u3.j().a(this.G3) : this.f114112u3.l().a(this.G3);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.p0.s(this) ? this.f114112u3.l().a(this.G3) : this.f114112u3.j().a(this.G3);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.p0.s(this) ? this.f114112u3.r().a(this.G3) : this.f114112u3.t().a(this.G3);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.p0.s(this) ? this.f114112u3.t().a(this.G3) : this.f114112u3.r().a(this.G3);
    }

    public int getBoxStrokeColor() {
        return this.S3;
    }

    @p0
    public ColorStateList getBoxStrokeErrorColor() {
        return this.T3;
    }

    public int getBoxStrokeWidth() {
        return this.A3;
    }

    public int getBoxStrokeWidthFocused() {
        return this.B3;
    }

    public int getCounterMaxLength() {
        return this.f114094l;
    }

    @p0
    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f114092k && this.f114096m && (textView = this.f114100o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @p0
    public ColorStateList getCounterOverflowTextColor() {
        return this.f114089i3;
    }

    @p0
    public ColorStateList getCounterTextColor() {
        return this.f114086h3;
    }

    @w0(29)
    @p0
    public ColorStateList getCursorColor() {
        return this.f114091j3;
    }

    @w0(29)
    @p0
    public ColorStateList getCursorErrorColor() {
        return this.f114093k3;
    }

    @p0
    public ColorStateList getDefaultHintTextColor() {
        return this.O3;
    }

    @p0
    public EditText getEditText() {
        return this.f114076d;
    }

    @p0
    public CharSequence getEndIconContentDescription() {
        return this.f114074c.n();
    }

    @p0
    public Drawable getEndIconDrawable() {
        return this.f114074c.p();
    }

    public int getEndIconMinSize() {
        return this.f114074c.q();
    }

    public int getEndIconMode() {
        return this.f114074c.r();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f114074c.s();
    }

    @NonNull
    CheckableImageButton getEndIconView() {
        return this.f114074c.t();
    }

    @p0
    public CharSequence getError() {
        if (this.f114090j.F()) {
            return this.f114090j.q();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f114090j.o();
    }

    @p0
    public CharSequence getErrorContentDescription() {
        return this.f114090j.p();
    }

    @androidx.annotation.l
    public int getErrorCurrentTextColors() {
        return this.f114090j.r();
    }

    @p0
    public Drawable getErrorIconDrawable() {
        return this.f114074c.u();
    }

    @p0
    public CharSequence getHelperText() {
        if (this.f114090j.G()) {
            return this.f114090j.t();
        }
        return null;
    }

    @androidx.annotation.l
    public int getHelperTextCurrentTextColor() {
        return this.f114090j.w();
    }

    @p0
    public CharSequence getHint() {
        if (this.f114095l3) {
            return this.f114097m3;
        }
        return null;
    }

    @l1
    final float getHintCollapsedTextHeight() {
        return this.f114073b4.r();
    }

    @l1
    final int getHintCurrentCollapsedTextColor() {
        return this.f114073b4.w();
    }

    @p0
    public ColorStateList getHintTextColor() {
        return this.P3;
    }

    @NonNull
    public g getLengthCounter() {
        return this.f114098n;
    }

    public int getMaxEms() {
        return this.f114082g;
    }

    @t0
    public int getMaxWidth() {
        return this.f114088i;
    }

    public int getMinEms() {
        return this.f114080f;
    }

    @t0
    public int getMinWidth() {
        return this.f114085h;
    }

    @p0
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f114074c.w();
    }

    @p0
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f114074c.x();
    }

    @p0
    public CharSequence getPlaceholderText() {
        if (this.f114115w) {
            return this.f114113v;
        }
        return null;
    }

    @g1
    public int getPlaceholderTextAppearance() {
        return this.H1;
    }

    @p0
    public ColorStateList getPlaceholderTextColor() {
        return this.f114103p1;
    }

    @p0
    public CharSequence getPrefixText() {
        return this.f114072b.a();
    }

    @p0
    public ColorStateList getPrefixTextColor() {
        return this.f114072b.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f114072b.d();
    }

    @NonNull
    public com.google.android.material.shape.p getShapeAppearanceModel() {
        return this.f114112u3;
    }

    @p0
    public CharSequence getStartIconContentDescription() {
        return this.f114072b.e();
    }

    @p0
    public Drawable getStartIconDrawable() {
        return this.f114072b.f();
    }

    public int getStartIconMinSize() {
        return this.f114072b.g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f114072b.h();
    }

    @p0
    public CharSequence getSuffixText() {
        return this.f114074c.y();
    }

    @p0
    public ColorStateList getSuffixTextColor() {
        return this.f114074c.z();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f114074c.B();
    }

    @p0
    public Typeface getTypeface() {
        return this.H3;
    }

    public void i(@NonNull h hVar) {
        this.K3.add(hVar);
        if (this.f114076d != null) {
            hVar.a(this);
        }
    }

    @Deprecated
    public void i0(boolean z10) {
        this.f114074c.A0(z10);
    }

    public void j(@NonNull i iVar) {
        this.f114074c.g(iVar);
    }

    public void l0() {
        this.f114074c.N();
    }

    @l1
    void m(float f10) {
        if (this.f114073b4.G() == f10) {
            return;
        }
        if (this.f114079e4 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f114079e4 = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.motion.j.g(getContext(), r6.a.c.Vd, com.google.android.material.animation.b.f111044b));
            this.f114079e4.setDuration(com.google.android.material.motion.j.f(getContext(), r6.a.c.Ld, f114055j4));
            this.f114079e4.addUpdateListener(new c());
        }
        this.f114079e4.setFloatValues(this.f114073b4.G(), f10);
        this.f114079e4.start();
    }

    public void m0() {
        this.f114074c.O();
    }

    public void n0() {
        this.f114072b.n();
    }

    public void o0(@NonNull h hVar) {
        this.K3.remove(hVar);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f114073b4.a0(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f114074c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f114087h4 = false;
        boolean zK0 = K0();
        boolean zG0 = G0();
        if (zK0 || zG0) {
            this.f114076d.post(new Runnable() { // from class: com.google.android.material.textfield.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114129a.f114076d.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f114076d;
        if (editText != null) {
            Rect rect = this.E3;
            com.google.android.material.internal.d.a(this, editText, rect);
            A0(rect);
            if (this.f114095l3) {
                this.f114073b4.x0(this.f114076d.getTextSize());
                int gravity = this.f114076d.getGravity();
                this.f114073b4.l0((gravity & (-113)) | 48);
                this.f114073b4.w0(gravity);
                this.f114073b4.h0(s(rect));
                this.f114073b4.r0(v(rect));
                this.f114073b4.c0();
                if (!E() || this.f114071a4) {
                    return;
                }
                h0();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f114087h4) {
            this.f114074c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f114087h4 = true;
        }
        O0();
        this.f114074c.D0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f114120c);
        if (savedState.f114121d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f114114v3) {
            float fA = this.f114112u3.r().a(this.G3);
            float fA2 = this.f114112u3.t().a(this.G3);
            com.google.android.material.shape.p pVarM = com.google.android.material.shape.p.a().J(this.f114112u3.s()).O(this.f114112u3.q()).w(this.f114112u3.k()).B(this.f114112u3.i()).K(fA2).P(fA).x(this.f114112u3.l().a(this.G3)).C(this.f114112u3.j().a(this.G3)).m();
            this.f114114v3 = z10;
            setShapeAppearanceModel(pVarM);
        }
    }

    @Override // android.view.View
    @p0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (v0()) {
            savedState.f114120c = getError();
        }
        savedState.f114121d = this.f114074c.H();
        return savedState;
    }

    public void p0(@NonNull i iVar) {
        this.f114074c.Q(iVar);
    }

    public void r0(float f10, float f11, float f12, float f13) {
        boolean zS = com.google.android.material.internal.p0.s(this);
        this.f114114v3 = zS;
        float f14 = zS ? f11 : f10;
        if (!zS) {
            f10 = f11;
        }
        float f15 = zS ? f13 : f12;
        if (!zS) {
            f12 = f13;
        }
        com.google.android.material.shape.k kVar = this.f114101o3;
        if (kVar != null && kVar.T() == f14 && this.f114101o3.U() == f10 && this.f114101o3.u() == f15 && this.f114101o3.v() == f12) {
            return;
        }
        this.f114112u3 = this.f114112u3.v().K(f14).P(f10).x(f15).C(f12).m();
        n();
    }

    public void s0(@androidx.annotation.q int i10, @androidx.annotation.q int i11, @androidx.annotation.q int i12, @androidx.annotation.q int i13) {
        r0(getContext().getResources().getDimension(i10), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i13), getContext().getResources().getDimension(i12));
    }

    public void setBoxBackgroundColor(@androidx.annotation.l int i10) {
        if (this.D3 != i10) {
            this.D3 = i10;
            this.U3 = i10;
            this.W3 = i10;
            this.X3 = i10;
            n();
        }
    }

    public void setBoxBackgroundColorResource(@androidx.annotation.n int i10) {
        setBoxBackgroundColor(androidx.core.content.d.g(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.U3 = defaultColor;
        this.D3 = defaultColor;
        this.V3 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.W3 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.X3 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f114117x3) {
            return;
        }
        this.f114117x3 = i10;
        if (this.f114076d != null) {
            g0();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f114118y3 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f114112u3 = this.f114112u3.v().I(i10, this.f114112u3.r()).N(i10, this.f114112u3.t()).v(i10, this.f114112u3.j()).A(i10, this.f114112u3.l()).m();
        n();
    }

    public void setBoxStrokeColor(@androidx.annotation.l int i10) {
        if (this.S3 != i10) {
            this.S3 = i10;
            S0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.Q3 = colorStateList.getDefaultColor();
            this.Y3 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.R3 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.S3 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.S3 != colorStateList.getDefaultColor()) {
            this.S3 = colorStateList.getDefaultColor();
        }
        S0();
    }

    public void setBoxStrokeErrorColor(@p0 ColorStateList colorStateList) {
        if (this.T3 != colorStateList) {
            this.T3 = colorStateList;
            S0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.A3 = i10;
        S0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.B3 = i10;
        S0();
    }

    public void setBoxStrokeWidthFocusedResource(@androidx.annotation.q int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(@androidx.annotation.q int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f114092k != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f114100o = appCompatTextView;
                appCompatTextView.setId(r6.a.h.Z5);
                Typeface typeface = this.H3;
                if (typeface != null) {
                    this.f114100o.setTypeface(typeface);
                }
                this.f114100o.setMaxLines(1);
                this.f114090j.e(this.f114100o, 2);
                j0.h((ViewGroup.MarginLayoutParams) this.f114100o.getLayoutParams(), getResources().getDimensionPixelOffset(r6.a.f.Pd));
                E0();
                B0();
            } else {
                this.f114090j.H(this.f114100o, 2);
                this.f114100o = null;
            }
            this.f114092k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f114094l != i10) {
            if (i10 > 0) {
                this.f114094l = i10;
            } else {
                this.f114094l = -1;
            }
            if (this.f114092k) {
                B0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f114108s != i10) {
            this.f114108s = i10;
            E0();
        }
    }

    public void setCounterOverflowTextColor(@p0 ColorStateList colorStateList) {
        if (this.f114089i3 != colorStateList) {
            this.f114089i3 = colorStateList;
            E0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f114110t != i10) {
            this.f114110t = i10;
            E0();
        }
    }

    public void setCounterTextColor(@p0 ColorStateList colorStateList) {
        if (this.f114086h3 != colorStateList) {
            this.f114086h3 = colorStateList;
            E0();
        }
    }

    @w0(29)
    public void setCursorColor(@p0 ColorStateList colorStateList) {
        if (this.f114091j3 != colorStateList) {
            this.f114091j3 = colorStateList;
            F0();
        }
    }

    @w0(29)
    public void setCursorErrorColor(@p0 ColorStateList colorStateList) {
        if (this.f114093k3 != colorStateList) {
            this.f114093k3 = colorStateList;
            if (a0()) {
                F0();
            }
        }
    }

    public void setDefaultHintTextColor(@p0 ColorStateList colorStateList) {
        this.O3 = colorStateList;
        this.P3 = colorStateList;
        if (this.f114076d != null) {
            M0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k0(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f114074c.S(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f114074c.T(z10);
    }

    public void setEndIconContentDescription(@f1 int i10) {
        this.f114074c.U(i10);
    }

    public void setEndIconDrawable(@androidx.annotation.v int i10) {
        this.f114074c.W(i10);
    }

    public void setEndIconMinSize(@g0(from = 0) int i10) {
        this.f114074c.Y(i10);
    }

    public void setEndIconMode(int i10) {
        this.f114074c.Z(i10);
    }

    public void setEndIconOnClickListener(@p0 View.OnClickListener onClickListener) {
        this.f114074c.a0(onClickListener);
    }

    public void setEndIconOnLongClickListener(@p0 View.OnLongClickListener onLongClickListener) {
        this.f114074c.b0(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f114074c.c0(scaleType);
    }

    public void setEndIconTintList(@p0 ColorStateList colorStateList) {
        this.f114074c.d0(colorStateList);
    }

    public void setEndIconTintMode(@p0 PorterDuff.Mode mode) {
        this.f114074c.e0(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f114074c.f0(z10);
    }

    public void setError(@p0 CharSequence charSequence) {
        if (!this.f114090j.F()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f114090j.A();
        } else {
            this.f114090j.V(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f114090j.J(i10);
    }

    public void setErrorContentDescription(@p0 CharSequence charSequence) {
        this.f114090j.K(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f114090j.L(z10);
    }

    public void setErrorIconDrawable(@androidx.annotation.v int i10) {
        this.f114074c.g0(i10);
    }

    public void setErrorIconOnClickListener(@p0 View.OnClickListener onClickListener) {
        this.f114074c.i0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@p0 View.OnLongClickListener onLongClickListener) {
        this.f114074c.j0(onLongClickListener);
    }

    public void setErrorIconTintList(@p0 ColorStateList colorStateList) {
        this.f114074c.k0(colorStateList);
    }

    public void setErrorIconTintMode(@p0 PorterDuff.Mode mode) {
        this.f114074c.l0(mode);
    }

    public void setErrorTextAppearance(@g1 int i10) {
        this.f114090j.M(i10);
    }

    public void setErrorTextColor(@p0 ColorStateList colorStateList) {
        this.f114090j.N(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f114075c4 != z10) {
            this.f114075c4 = z10;
            M0(false);
        }
    }

    public void setHelperText(@p0 CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (W()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!W()) {
                setHelperTextEnabled(true);
            }
            this.f114090j.W(charSequence);
        }
    }

    public void setHelperTextColor(@p0 ColorStateList colorStateList) {
        this.f114090j.Q(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f114090j.P(z10);
    }

    public void setHelperTextTextAppearance(@g1 int i10) {
        this.f114090j.O(i10);
    }

    public void setHint(@p0 CharSequence charSequence) {
        if (this.f114095l3) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f114077d4 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f114095l3) {
            this.f114095l3 = z10;
            if (z10) {
                CharSequence hint = this.f114076d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f114097m3)) {
                        setHint(hint);
                    }
                    this.f114076d.setHint((CharSequence) null);
                }
                this.f114099n3 = true;
            } else {
                this.f114099n3 = false;
                if (!TextUtils.isEmpty(this.f114097m3) && TextUtils.isEmpty(this.f114076d.getHint())) {
                    this.f114076d.setHint(this.f114097m3);
                }
                setHintInternal(null);
            }
            if (this.f114076d != null) {
                L0();
            }
        }
    }

    public void setHintTextAppearance(@g1 int i10) {
        this.f114073b4.i0(i10);
        this.P3 = this.f114073b4.p();
        if (this.f114076d != null) {
            M0(false);
            L0();
        }
    }

    public void setHintTextColor(@p0 ColorStateList colorStateList) {
        if (this.P3 != colorStateList) {
            if (this.O3 == null) {
                this.f114073b4.k0(colorStateList);
            }
            this.P3 = colorStateList;
            if (this.f114076d != null) {
                M0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull g gVar) {
        this.f114098n = gVar;
    }

    public void setMaxEms(int i10) {
        this.f114082g = i10;
        EditText editText = this.f114076d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(@t0 int i10) {
        this.f114088i = i10;
        EditText editText = this.f114076d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(@androidx.annotation.q int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f114080f = i10;
        EditText editText = this.f114076d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(@t0 int i10) {
        this.f114085h = i10;
        EditText editText = this.f114076d;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(@androidx.annotation.q int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@f1 int i10) {
        this.f114074c.n0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@androidx.annotation.v int i10) {
        this.f114074c.p0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f114074c.r0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@p0 ColorStateList colorStateList) {
        this.f114074c.s0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@p0 PorterDuff.Mode mode) {
        this.f114074c.t0(mode);
    }

    public void setPlaceholderText(@p0 CharSequence charSequence) {
        if (this.f114102p0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f114102p0 = appCompatTextView;
            appCompatTextView.setId(r6.a.h.f360638c6);
            u1.Y1(this.f114102p0, 2);
            androidx.transition.k kVarD = D();
            this.f114104p2 = kVarD;
            kVarD.K0(67L);
            this.f114083g3 = D();
            setPlaceholderTextAppearance(this.H1);
            setPlaceholderTextColor(this.f114103p1);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f114115w) {
                setPlaceholderTextEnabled(true);
            }
            this.f114113v = charSequence;
        }
        P0();
    }

    public void setPlaceholderTextAppearance(@g1 int i10) {
        this.H1 = i10;
        TextView textView = this.f114102p0;
        if (textView != null) {
            androidx.core.widget.r.D(textView, i10);
        }
    }

    public void setPlaceholderTextColor(@p0 ColorStateList colorStateList) {
        if (this.f114103p1 != colorStateList) {
            this.f114103p1 = colorStateList;
            TextView textView = this.f114102p0;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@p0 CharSequence charSequence) {
        this.f114072b.o(charSequence);
    }

    public void setPrefixTextAppearance(@g1 int i10) {
        this.f114072b.p(i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f114072b.q(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.p pVar) {
        com.google.android.material.shape.k kVar = this.f114101o3;
        if (kVar == null || kVar.getShapeAppearanceModel() == pVar) {
            return;
        }
        this.f114112u3 = pVar;
        n();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f114072b.r(z10);
    }

    public void setStartIconContentDescription(@f1 int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(@androidx.annotation.v int i10) {
        setStartIconDrawable(i10 != 0 ? j.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(@g0(from = 0) int i10) {
        this.f114072b.u(i10);
    }

    public void setStartIconOnClickListener(@p0 View.OnClickListener onClickListener) {
        this.f114072b.v(onClickListener);
    }

    public void setStartIconOnLongClickListener(@p0 View.OnLongClickListener onLongClickListener) {
        this.f114072b.w(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f114072b.x(scaleType);
    }

    public void setStartIconTintList(@p0 ColorStateList colorStateList) {
        this.f114072b.y(colorStateList);
    }

    public void setStartIconTintMode(@p0 PorterDuff.Mode mode) {
        this.f114072b.z(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f114072b.A(z10);
    }

    public void setSuffixText(@p0 CharSequence charSequence) {
        this.f114074c.u0(charSequence);
    }

    public void setSuffixTextAppearance(@g1 int i10) {
        this.f114074c.v0(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f114074c.w0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@p0 d dVar) {
        EditText editText = this.f114076d;
        if (editText != null) {
            u1.G1(editText, dVar);
        }
    }

    public void setTypeface(@p0 Typeface typeface) {
        if (typeface != this.H3) {
            this.H3 = typeface;
            this.f114073b4.P0(typeface);
            this.f114090j.S(typeface);
            TextView textView = this.f114100o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void u0(@NonNull TextView textView, @g1 int i10) {
        try {
            androidx.core.widget.r.D(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.r.D(textView, r6.a.n.R6);
        textView.setTextColor(androidx.core.content.d.g(getContext(), r6.a.e.f360054x0));
    }

    boolean v0() {
        return this.f114090j.m();
    }

    public void z() {
        this.K3.clear();
    }

    public TextInputLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359366kj);
    }

    public void setEndIconContentDescription(@p0 CharSequence charSequence) {
        this.f114074c.V(charSequence);
    }

    public void setEndIconDrawable(@p0 Drawable drawable) {
        this.f114074c.X(drawable);
    }

    public void setErrorIconDrawable(@p0 Drawable drawable) {
        this.f114074c.h0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@p0 CharSequence charSequence) {
        this.f114074c.o0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@p0 Drawable drawable) {
        this.f114074c.q0(drawable);
    }

    public void setStartIconContentDescription(@p0 CharSequence charSequence) {
        this.f114072b.s(charSequence);
    }

    public void setStartIconDrawable(@p0 Drawable drawable) {
        this.f114072b.t(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f114054i4;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f114080f = -1;
        this.f114082g = -1;
        this.f114085h = -1;
        this.f114088i = -1;
        this.f114090j = new u(this);
        this.f114098n = new g() { // from class: com.google.android.material.textfield.b0
            @Override // com.google.android.material.textfield.TextInputLayout.g
            public final int a(Editable editable) {
                return TextInputLayout.b(editable);
            }
        };
        this.E3 = new Rect();
        this.F3 = new Rect();
        this.G3 = new RectF();
        this.K3 = new LinkedHashSet<>();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f114073b4 = bVar;
        this.f114087h4 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f114070a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = com.google.android.material.animation.b.f111043a;
        bVar.N0(timeInterpolator);
        bVar.I0(timeInterpolator);
        bVar.l0(8388659);
        j1 j1VarL = com.google.android.material.internal.g0.l(context2, attributeSet, r6.a.o.vw, i10, i11, r6.a.o.Sw, r6.a.o.Qw, r6.a.o.kx, r6.a.o.px, r6.a.o.tx);
        z zVar = new z(this, j1VarL);
        this.f114072b = zVar;
        this.f114095l3 = j1VarL.a(r6.a.o.sx, true);
        setHint(j1VarL.x(r6.a.o.Aw));
        this.f114077d4 = j1VarL.a(r6.a.o.f362032rx, true);
        this.f114075c4 = j1VarL.a(r6.a.o.mx, true);
        if (j1VarL.C(r6.a.o.Cw)) {
            setMinEms(j1VarL.o(r6.a.o.Cw, -1));
        } else if (j1VarL.C(r6.a.o.zw)) {
            setMinWidth(j1VarL.g(r6.a.o.zw, -1));
        }
        if (j1VarL.C(r6.a.o.Bw)) {
            setMaxEms(j1VarL.o(r6.a.o.Bw, -1));
        } else if (j1VarL.C(r6.a.o.yw)) {
            setMaxWidth(j1VarL.g(r6.a.o.yw, -1));
        }
        this.f114112u3 = com.google.android.material.shape.p.e(context2, attributeSet, i10, i11).m();
        this.f114116w3 = context2.getResources().getDimensionPixelOffset(r6.a.f.Md);
        this.f114118y3 = j1VarL.f(r6.a.o.Fw, 0);
        this.A3 = j1VarL.g(r6.a.o.Mw, context2.getResources().getDimensionPixelSize(r6.a.f.Nd));
        this.B3 = j1VarL.g(r6.a.o.Nw, context2.getResources().getDimensionPixelSize(r6.a.f.Od));
        this.f114119z3 = this.A3;
        float fE = j1VarL.e(r6.a.o.Jw, -1.0f);
        float fE2 = j1VarL.e(r6.a.o.Iw, -1.0f);
        float fE3 = j1VarL.e(r6.a.o.Gw, -1.0f);
        float fE4 = j1VarL.e(r6.a.o.Hw, -1.0f);
        com.google.android.material.shape.p.b bVarV = this.f114112u3.v();
        if (fE >= 0.0f) {
            bVarV.K(fE);
        }
        if (fE2 >= 0.0f) {
            bVarV.P(fE2);
        }
        if (fE3 >= 0.0f) {
            bVarV.C(fE3);
        }
        if (fE4 >= 0.0f) {
            bVarV.x(fE4);
        }
        this.f114112u3 = bVarV.m();
        ColorStateList colorStateListB = com.google.android.material.resources.c.b(context2, j1VarL, r6.a.o.Dw);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.U3 = defaultColor;
            this.D3 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.V3 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.W3 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.X3 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.W3 = this.U3;
                ColorStateList colorStateListA = j.a.a(context2, r6.a.e.Pc);
                this.V3 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.X3 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.D3 = 0;
            this.U3 = 0;
            this.V3 = 0;
            this.W3 = 0;
            this.X3 = 0;
        }
        if (j1VarL.C(r6.a.o.xw)) {
            ColorStateList colorStateListD = j1VarL.d(r6.a.o.xw);
            this.P3 = colorStateListD;
            this.O3 = colorStateListD;
        }
        ColorStateList colorStateListB2 = com.google.android.material.resources.c.b(context2, j1VarL, r6.a.o.Kw);
        this.S3 = j1VarL.c(r6.a.o.Kw, 0);
        this.Q3 = androidx.core.content.d.g(context2, r6.a.e.f359962qd);
        this.Y3 = androidx.core.content.d.g(context2, r6.a.e.f359977rd);
        this.R3 = androidx.core.content.d.g(context2, r6.a.e.f360022ud);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (j1VarL.C(r6.a.o.Lw)) {
            setBoxStrokeErrorColor(com.google.android.material.resources.c.b(context2, j1VarL, r6.a.o.Lw));
        }
        if (j1VarL.u(r6.a.o.tx, -1) != -1) {
            setHintTextAppearance(j1VarL.u(r6.a.o.tx, 0));
        }
        this.f114091j3 = j1VarL.d(r6.a.o.Uw);
        this.f114093k3 = j1VarL.d(r6.a.o.Vw);
        int iU = j1VarL.u(r6.a.o.kx, 0);
        CharSequence charSequenceX = j1VarL.x(r6.a.o.fx);
        int iO = j1VarL.o(r6.a.o.ex, 1);
        boolean zA = j1VarL.a(r6.a.o.gx, false);
        int iU2 = j1VarL.u(r6.a.o.px, 0);
        boolean zA2 = j1VarL.a(r6.a.o.ox, false);
        CharSequence charSequenceX2 = j1VarL.x(r6.a.o.nx);
        int iU3 = j1VarL.u(r6.a.o.Bx, 0);
        CharSequence charSequenceX3 = j1VarL.x(r6.a.o.Ax);
        boolean zA3 = j1VarL.a(r6.a.o.Ow, false);
        setCounterMaxLength(j1VarL.o(r6.a.o.Pw, -1));
        this.f114110t = j1VarL.u(r6.a.o.Sw, 0);
        this.f114108s = j1VarL.u(r6.a.o.Qw, 0);
        setBoxBackgroundMode(j1VarL.o(r6.a.o.Ew, 0));
        setErrorContentDescription(charSequenceX);
        setErrorAccessibilityLiveRegion(iO);
        setCounterOverflowTextAppearance(this.f114108s);
        setHelperTextTextAppearance(iU2);
        setErrorTextAppearance(iU);
        setCounterTextAppearance(this.f114110t);
        setPlaceholderText(charSequenceX3);
        setPlaceholderTextAppearance(iU3);
        if (j1VarL.C(r6.a.o.lx)) {
            setErrorTextColor(j1VarL.d(r6.a.o.lx));
        }
        if (j1VarL.C(r6.a.o.qx)) {
            setHelperTextColor(j1VarL.d(r6.a.o.qx));
        }
        if (j1VarL.C(r6.a.o.ux)) {
            setHintTextColor(j1VarL.d(r6.a.o.ux));
        }
        if (j1VarL.C(r6.a.o.Tw)) {
            setCounterTextColor(j1VarL.d(r6.a.o.Tw));
        }
        if (j1VarL.C(r6.a.o.Rw)) {
            setCounterOverflowTextColor(j1VarL.d(r6.a.o.Rw));
        }
        if (j1VarL.C(r6.a.o.Cx)) {
            setPlaceholderTextColor(j1VarL.d(r6.a.o.Cx));
        }
        r rVar = new r(this, j1VarL);
        this.f114074c = rVar;
        boolean zA4 = j1VarL.a(r6.a.o.ww, true);
        j1VarL.I();
        u1.Y1(this, 2);
        u1.a2(this, 1);
        frameLayout.addView(zVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceX2);
    }

    public void setHint(@f1 int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}

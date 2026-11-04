package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements androidx.core.view.p1, androidx.core.widget.w, androidx.core.widget.b, o0 {
    private final f mBackgroundTintHelper;

    @NonNull
    private q mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @androidx.annotation.p0
    private Future<androidx.core.text.g> mPrecomputedTextFuture;

    @androidx.annotation.p0
    private a mSuperCaller;
    private final f0 mTextClassifierHelper;
    private final g0 mTextHelper;

    private interface a {
        TextClassifier a();

        void b(@androidx.annotation.t0 int i10);

        void c(@androidx.annotation.t0 int i10);

        void d(int i10, @androidx.annotation.x(from = 0.0d) float f10);

        void e(@androidx.annotation.p0 TextClassifier textClassifier);

        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10);

        void setAutoSizeTextTypeWithDefaults(int i10);
    }

    @androidx.annotation.w0(api = 26)
    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier a() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void d(int i10, float f10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void e(@androidx.annotation.p0 TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMaxTextSize() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] getAutoSizeTextAvailableSizes() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeTextType() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeWithDefaults(int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    @androidx.annotation.w0(api = 28)
    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void b(@androidx.annotation.t0 int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void c(@androidx.annotation.t0 int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }
    }

    @androidx.annotation.w0(api = 34)
    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void d(int i10, float f10) {
            AppCompatTextView.super.setLineHeight(i10, f10);
        }
    }

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        Future<androidx.core.text.g> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.r.C(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @NonNull
    private q getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new q(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.b();
        }
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (v1.f11632d) {
            return getSuperCaller().getAutoSizeMaxTextSize();
        }
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            return g0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (v1.f11632d) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            return g0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (v1.f11632d) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            return g0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (v1.f11632d) {
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        g0 g0Var = this.mTextHelper;
        return g0Var != null ? g0Var.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @e.a({"WrongConstant"})
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (v1.f11632d) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
        }
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            return g0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    @androidx.annotation.p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.r.F(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.r.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.r.j(this);
    }

    @androidx.annotation.k1
    @androidx.annotation.w0(api = 26)
    a getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.mSuperCaller = new d();
            } else {
                this.mSuperCaller = new c();
            }
        }
        return this.mSuperCaller;
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        a();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @androidx.annotation.w0(api = 26)
    public TextClassifier getTextClassifier() {
        return getSuperCaller().a();
    }

    @NonNull
    public androidx.core.text.g.b getTextMetricsParamsCompat() {
        return androidx.core.widget.r.o(this);
    }

    @Override // androidx.appcompat.widget.o0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return r.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        g0 g0Var = this.mTextHelper;
        if (g0Var != null && !v1.f11632d && g0Var.l()) {
            this.mTextHelper.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (v1.f11632d) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        if (v1.f11632d) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (v1.f11632d) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.r.G(this, callback));
    }

    @Override // androidx.appcompat.widget.o0
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@androidx.annotation.g0(from = 0) @androidx.annotation.t0 int i10) {
        getSuperCaller().b(i10);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@androidx.annotation.g0(from = 0) @androidx.annotation.t0 int i10) {
        getSuperCaller().c(i10);
    }

    @Override // android.widget.TextView
    public void setLineHeight(@androidx.annotation.g0(from = 0) @androidx.annotation.t0 int i10) {
        androidx.core.widget.r.A(this, i10);
    }

    public void setPrecomputedText(@NonNull androidx.core.text.g gVar) {
        androidx.core.widget.r.C(this, gVar);
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(api = 26)
    public void setTextClassifier(@androidx.annotation.p0 TextClassifier textClassifier) {
        getSuperCaller().e(textClassifier);
    }

    public void setTextFuture(@androidx.annotation.p0 Future<androidx.core.text.g> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull androidx.core.text.g.b bVar) {
        androidx.core.widget.r.E(this, bVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (v1.f11632d) {
            super.setTextSize(i10, f10);
            return;
        }
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(@androidx.annotation.p0 Typeface typeface, int i10) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceB = (typeface == null || i10 <= 0) ? null : androidx.core.graphics.a0.b(getContext(), typeface, i10);
        this.mIsSetTypefaceProcessing = true;
        if (typefaceB != null) {
            typeface = typefaceB;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, @androidx.annotation.x(from = 0.0d) float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().d(i10, f10);
        } else {
            androidx.core.widget.r.B(this, i10, f10);
        }
    }

    public AppCompatTextView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(g1.b(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        e1.a(this, getContext());
        f fVar = new f(this);
        this.mBackgroundTintHelper = fVar;
        fVar.e(attributeSet, i10);
        g0 g0Var = new g0(this);
        this.mTextHelper = g0Var;
        g0Var.m(attributeSet, i10);
        g0Var.b();
        this.mTextClassifierHelper = new f0(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? j.a.b(context, i10) : null, i11 != 0 ? j.a.b(context, i11) : null, i12 != 0 ? j.a.b(context, i12) : null, i13 != 0 ? j.a.b(context, i13) : null);
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? j.a.b(context, i10) : null, i11 != 0 ? j.a.b(context, i11) : null, i12 != 0 ? j.a.b(context, i12) : null, i13 != 0 ? j.a.b(context, i13) : null);
        g0 g0Var = this.mTextHelper;
        if (g0Var != null) {
            g0Var.p();
        }
    }
}

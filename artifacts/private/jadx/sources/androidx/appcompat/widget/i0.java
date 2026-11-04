package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class i0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f11343l = "ACTVAutoSizeHelper";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f11345n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f11346o = 112;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f11347p = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final float f11349r = -1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f11350s = 1048576;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f11358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final TextView f11359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f11360j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final RectF f11344m = new RectF();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @e.a({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f11348q = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11351a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11352b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f11353c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f11354d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f11355e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f11356f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11357g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f11361k = new c();

    @androidx.annotation.w0(23)
    private static final class a {
        private a() {
        }

        @NonNull
        @androidx.annotation.u
        static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
            }
            return builderObtain.build();
        }
    }

    @androidx.annotation.w0(23)
    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.i0.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) i0.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @androidx.annotation.w0(29)
    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.i0.b, androidx.appcompat.widget.i0.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.i0.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class d {
        d() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) i0.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    i0(@NonNull TextView textView) {
        this.f11359i = textView;
        this.f11360j = textView.getContext();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f11351a = 0;
        this.f11354d = -1.0f;
        this.f11355e = -1.0f;
        this.f11353c = -1.0f;
        this.f11356f = new int[0];
        this.f11352b = false;
    }

    private int e(RectF rectF) {
        int length = this.f11356f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f11356f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f11356f[i12];
    }

    @androidx.annotation.p0
    private static Method k(@NonNull String str) {
        try {
            Method declaredMethod = f11348q.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                int i10 = 2 | 1;
                declaredMethod.setAccessible(true);
                f11348q.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    @e.a({"BanUncheckedReflection"})
    static <T> T m(@NonNull Object obj, @NonNull String str, @NonNull T t10) {
        try {
            return (T) k(str).invoke(obj, null);
        } catch (Exception unused) {
            return t10;
        }
    }

    @e.a({"BanUncheckedReflection"})
    private void s(float f10) {
        if (f10 != this.f11359i.getPaint().getTextSize()) {
            this.f11359i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f11359i.isInLayout();
            if (this.f11359i.getLayout() != null) {
                this.f11352b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f11359i, null);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    this.f11359i.forceLayout();
                } else {
                    this.f11359i.requestLayout();
                }
                this.f11359i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f11351a == 1) {
            if (!this.f11357g || this.f11356f.length == 0) {
                int iFloor = ((int) Math.floor((this.f11355e - this.f11354d) / this.f11353c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f11354d + (i10 * this.f11353c));
                }
                this.f11356f = b(iArr);
            }
            this.f11352b = true;
        } else {
            this.f11352b = false;
        }
        return this.f11352b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f11356f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f11356f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f11357g = z10;
        if (z10) {
            this.f11351a = 1;
            this.f11354d = iArr[0];
            this.f11355e = iArr[length - 1];
            this.f11353c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f11359i.getText();
        TransformationMethod transformationMethod = this.f11359i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f11359i)) != null) {
            text = transformation;
        }
        int maxLines = this.f11359i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f11359i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        if (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) {
            return ((float) staticLayoutD.getHeight()) <= rectF.bottom;
        }
        return false;
    }

    private boolean y() {
        return !(this.f11359i instanceof AppCompatEditText);
    }

    private void z(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f11351a = 1;
        this.f11354d = f10;
        this.f11355e = f11;
        this.f11353c = f12;
        this.f11357g = false;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void a() {
        if (n()) {
            if (this.f11352b) {
                if (this.f11359i.getMeasuredHeight() > 0 && this.f11359i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f11361k.b(this.f11359i) ? 1048576 : (this.f11359i.getMeasuredWidth() - this.f11359i.getTotalPaddingLeft()) - this.f11359i.getTotalPaddingRight();
                    int height = (this.f11359i.getHeight() - this.f11359i.getCompoundPaddingBottom()) - this.f11359i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f11344m;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float fE = e(rectF);
                                if (fE != this.f11359i.getTextSize()) {
                                    t(0, fE);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            this.f11352b = true;
        }
    }

    @NonNull
    @androidx.annotation.l1
    StaticLayout d(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f11359i, this.f11358h, this.f11361k);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    int f() {
        return Math.round(this.f11355e);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    int g() {
        return Math.round(this.f11354d);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    int h() {
        return Math.round(this.f11353c);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    int[] i() {
        return this.f11356f;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    int j() {
        return this.f11351a;
    }

    @androidx.annotation.l1
    void l(int i10) {
        TextPaint textPaint = this.f11358h;
        if (textPaint == null) {
            this.f11358h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f11358h.set(this.f11359i.getPaint());
        this.f11358h.setTextSize(i10);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    boolean n() {
        if (!y() || this.f11351a == 0) {
            return false;
        }
        int i10 = 6 >> 1;
        return true;
    }

    void o(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f11360j.obtainStyledAttributes(attributeSet, i.a.m.f286658v0, i10, 0);
        TextView textView = this.f11359i;
        androidx.core.view.u1.E1(textView, textView.getContext(), i.a.m.f286658v0, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        if (typedArrayObtainStyledAttributes.hasValue(i.a.m.B0)) {
            this.f11351a = typedArrayObtainStyledAttributes.getInt(i.a.m.B0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(i.a.m.A0) ? typedArrayObtainStyledAttributes.getDimension(i.a.m.A0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i.a.m.f286682y0) ? typedArrayObtainStyledAttributes.getDimension(i.a.m.f286682y0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i.a.m.f286674x0) ? typedArrayObtainStyledAttributes.getDimension(i.a.m.f286674x0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(i.a.m.f286690z0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i.a.m.f286690z0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f11351a = 0;
            return;
        }
        if (this.f11351a == 1) {
            if (!this.f11357g) {
                DisplayMetrics displayMetrics = this.f11360j.getResources().getDisplayMetrics();
                int i11 = 0 | 2;
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void p(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (y()) {
            DisplayMetrics displayMetrics = this.f11360j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void q(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f11360j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f11356f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f11357g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f11360j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void t(int i10, float f10) {
        Context context = this.f11360j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}

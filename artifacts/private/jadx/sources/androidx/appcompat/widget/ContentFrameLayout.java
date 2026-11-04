package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TypedValue f10982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TypedValue f10983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f10984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TypedValue f10985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f10986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypedValue f10987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f10988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f10989h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void b(int i10, int i11, int i12, int i13) {
        this.f10988g.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f10986e == null) {
            this.f10986e = new TypedValue();
        }
        return this.f10986e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f10987f == null) {
            this.f10987f = new TypedValue();
        }
        return this.f10987f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f10984c == null) {
            this.f10984c = new TypedValue();
        }
        return this.f10984c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f10985d == null) {
            this.f10985d = new TypedValue();
        }
        return this.f10985d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f10982a == null) {
            this.f10982a = new TypedValue();
        }
        return this.f10982a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f10983b == null) {
            this.f10983b = new TypedValue();
        }
        return this.f10983b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f10989h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f10989h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f10985d : this.f10984c;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                z10 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        Rect rect = this.f10988g;
                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    Rect rect2 = this.f10988g;
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z12 ? this.f10986e : this.f10987f;
            if (typedValue2 != null && (i14 = typedValue2.type) != 0) {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        Rect rect3 = this.f10988g;
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    Rect rect4 = this.f10988g;
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                }
            }
        }
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f10983b : this.f10982a;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        Rect rect5 = this.f10988g;
                        i13 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    Rect rect6 = this.f10988g;
                    i13 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec, i11);
        }
    }

    public void setAttachListener(a aVar) {
        this.f10989h = aVar;
    }

    public ContentFrameLayout(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10988g = new Rect();
    }
}

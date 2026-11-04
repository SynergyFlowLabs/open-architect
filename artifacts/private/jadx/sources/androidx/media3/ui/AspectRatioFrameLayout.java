package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f69668e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f69669f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f69670g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f69671h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f69672i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f69673j = 0.01f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f69674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private b f69675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69677d;

    public interface b {
        void a(float f10, float f11, boolean z10);
    }

    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f69678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f69679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f69680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f69681d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f69678a = f10;
            this.f69679b = f11;
            this.f69680c = z10;
            if (this.f69681d) {
                return;
            }
            this.f69681d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f69681d = false;
            if (AspectRatioFrameLayout.this.f69675b == null) {
                return;
            }
            AspectRatioFrameLayout.this.f69675b.a(this.f69678a, this.f69679b, this.f69680c);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f69677d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f69676c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f69676c / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f69674a.a(this.f69676c, f14, false);
            return;
        }
        int i12 = this.f69677d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f69676c;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f69676c;
                    } else {
                        f11 = this.f69676c;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f69676c;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f69676c;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f69676c;
            measuredWidth = (int) (f13 * f10);
        }
        this.f69674a.a(this.f69676c, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f69676c != f10) {
            this.f69676c = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@androidx.annotation.p0 b bVar) {
        this.f69675b = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.f69677d != i10) {
            this.f69677d = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69677d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, v0.m.f70416a, 0, 0);
            try {
                this.f69677d = typedArrayObtainStyledAttributes.getInt(v0.m.f70420b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f69674a = new c();
    }
}

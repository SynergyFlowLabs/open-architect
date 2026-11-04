package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f69729k = 0.0533f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f69730l = 0.08f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f69731m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f69732n = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<androidx.media3.common.text.a> f69733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.media3.ui.b f69734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f69737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f69739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f69741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f69742j;

    interface a {
        void a(List<androidx.media3.common.text.a> list, androidx.media3.ui.b bVar, float f10, int i10, float f11);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private androidx.media3.common.text.a a(androidx.media3.common.text.a aVar) {
        androidx.media3.common.text.a.c cVarA = aVar.a();
        if (!this.f69738f) {
            c1.c(cVarA);
        } else if (!this.f69739g) {
            c1.d(cVarA);
        }
        return cVarA.a();
    }

    private void d(int i10, float f10) {
        this.f69735c = i10;
        this.f69736d = f10;
        g();
    }

    private void g() {
        this.f69741i.a(getCuesWithStylingPreferencesApplied(), this.f69734b, this.f69736d, this.f69735c, this.f69737e);
    }

    private List<androidx.media3.common.text.a> getCuesWithStylingPreferencesApplied() {
        if (this.f69738f && this.f69739g) {
            return this.f69733a;
        }
        ArrayList arrayList = new ArrayList(this.f69733a.size());
        for (int i10 = 0; i10 < this.f69733a.size(); i10++) {
            arrayList.add(a(this.f69733a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private androidx.media3.ui.b getUserCaptionStyle() {
        if (isInEditMode()) {
            return androidx.media3.ui.b.f69773m;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? androidx.media3.ui.b.f69773m : androidx.media3.ui.b.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f69742j);
        View view = this.f69742j;
        if (view instanceof k1) {
            ((k1) view).g();
        }
        this.f69742j = t10;
        this.f69741i = t10;
        addView(t10);
    }

    public void b(@androidx.annotation.r int i10, float f10) {
        Context context = getContext();
        d(2, TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void c(float f10, boolean z10) {
        d(z10 ? 1 : 0, f10);
    }

    public void e() {
        setStyle(getUserCaptionStyle());
    }

    public void f() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f69739g = z10;
        g();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f69738f = z10;
        g();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f69737e = f10;
        g();
    }

    public void setCues(@androidx.annotation.p0 List<androidx.media3.common.text.a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f69733a = list;
        g();
    }

    public void setFractionalTextSize(float f10) {
        c(f10, false);
    }

    public void setStyle(androidx.media3.ui.b bVar) {
        this.f69734b = bVar;
        g();
    }

    public void setViewType(int i10) {
        if (this.f69740h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new androidx.media3.ui.a(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new k1(getContext()));
        }
        this.f69740h = i10;
    }

    public SubtitleView(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69733a = Collections.EMPTY_LIST;
        this.f69734b = androidx.media3.ui.b.f69773m;
        this.f69735c = 0;
        this.f69736d = 0.0533f;
        this.f69737e = 0.08f;
        this.f69738f = true;
        this.f69739g = true;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context);
        this.f69741i = aVar;
        this.f69742j = aVar;
        addView(aVar);
        this.f69740h = 1;
    }
}

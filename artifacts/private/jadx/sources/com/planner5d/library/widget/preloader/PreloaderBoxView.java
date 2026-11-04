package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.planner5d.library.application.e6;
import com.planner5d.library.services.utility.o3;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.q1;

/* JADX INFO: loaded from: classes8.dex */
public class PreloaderBoxView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected p0 f258472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected q1 f258473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f258474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f258475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f258476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f258477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f258478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f258479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f258480i;

    public PreloaderBoxView(Context context) {
        super(context);
        this.f258474c = Boolean.FALSE;
        this.f258475d = 0;
        this.f258476e = null;
        this.f258477f = true;
        this.f258479h = null;
        this.f258480i = null;
        e6.a(this).h(this);
        View.inflate(getContext(), c1.l.f252198q2, this);
        ProgressBar progressBar = (ProgressBar) findViewById(c1.i.J6);
        this.f258478g = findViewById(c1.i.I6);
        int iG = androidx.core.content.d.g(getContext(), c1.e.Wl);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        indeterminateDrawable.setColorFilter(iG, mode);
        progressBar.getProgressDrawable().setColorFilter(iG, mode);
        setClickable(true);
        d();
    }

    public static String b(p0 p0Var, @androidx.annotation.p0 String str, Integer num) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (num != null) {
            str2 = " " + p0Var.A(num.intValue() / 100.0f);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int iIntValue;
        int i10;
        if (!o3.b()) {
            post(new Runnable() { // from class: com.planner5d.library.widget.preloader.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f258568a.d();
                }
            });
            return;
        }
        int i11 = 8;
        if (this.f258477f) {
            View view = this.f258478g;
            com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
            Drawable drawableL = androidx.core.content.d.l(getContext(), c1.g.E2);
            Integer numA = this.f258479h;
            if (numA == null) {
                numA = this.f258473b.a();
            }
            view.setBackground(cVar.i(drawableL, numA));
            View viewFindViewById = findViewById(c1.i.K6);
            TextView textView = (TextView) findViewById(c1.i.Y6);
            ProgressBar progressBar = (ProgressBar) findViewById(c1.i.J6);
            String str = this.f258476e;
            if (str == null || str.isEmpty()) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(this.f258476e);
            }
            Integer num = this.f258480i;
            if (num == null) {
                Boolean bool = this.f258474c;
                iIntValue = (bool == null || bool.booleanValue()) ? h0.f258546c : -1;
            } else {
                iIntValue = num.intValue();
            }
            setBackgroundColor(iIntValue);
            Boolean bool2 = this.f258474c;
            if (bool2 == null) {
                i10 = 8;
            } else if (bool2.booleanValue()) {
                progressBar.setProgress(this.f258475d);
                i10 = 8;
                i11 = 0;
            } else {
                i10 = 0;
            }
            if (progressBar.getVisibility() != i11) {
                progressBar.setVisibility(i11);
            }
            if (viewFindViewById.getVisibility() != i10) {
                viewFindViewById.setVisibility(i10);
            }
            i11 = 0;
        }
        if (getVisibility() != i11) {
            setVisibility(i11);
        }
    }

    PreloaderBoxView c() {
        this.f258477f = false;
        d();
        return this;
    }

    PreloaderBoxView e(String str, int i10, boolean z10, boolean z11) {
        this.f258474c = z11 ? Boolean.TRUE : null;
        this.f258477f = true;
        int iE = n1.a.e(i10, 0, 100);
        this.f258475d = iE;
        this.f258476e = b(this.f258472a, str, z10 ? Integer.valueOf(iE) : null);
        d();
        return this;
    }

    PreloaderBoxView f(String str, boolean z10) {
        this.f258474c = z10 ? Boolean.FALSE : null;
        this.f258477f = true;
        this.f258476e = str;
        d();
        return this;
    }

    Integer getMainBackgroundColor() {
        return this.f258479h;
    }

    Integer getScrimColor() {
        return this.f258480i;
    }

    void setMainBackgroundColor(Integer num) {
        this.f258479h = num;
        d();
    }

    void setScrimColor(Integer num) {
        this.f258480i = num;
    }

    public PreloaderBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258474c = Boolean.FALSE;
        this.f258475d = 0;
        this.f258476e = null;
        this.f258477f = true;
        this.f258479h = null;
        this.f258480i = null;
        e6.a(this).h(this);
        View.inflate(getContext(), c1.l.f252198q2, this);
        ProgressBar progressBar = (ProgressBar) findViewById(c1.i.J6);
        this.f258478g = findViewById(c1.i.I6);
        int iG = androidx.core.content.d.g(getContext(), c1.e.Wl);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        indeterminateDrawable.setColorFilter(iG, mode);
        progressBar.getProgressDrawable().setColorFilter(iG, mode);
        setClickable(true);
        d();
    }

    public PreloaderBoxView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f258474c = Boolean.FALSE;
        this.f258475d = 0;
        this.f258476e = null;
        this.f258477f = true;
        this.f258479h = null;
        this.f258480i = null;
        e6.a(this).h(this);
        View.inflate(getContext(), c1.l.f252198q2, this);
        ProgressBar progressBar = (ProgressBar) findViewById(c1.i.J6);
        this.f258478g = findViewById(c1.i.I6);
        int iG = androidx.core.content.d.g(getContext(), c1.e.Wl);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        indeterminateDrawable.setColorFilter(iG, mode);
        progressBar.getProgressDrawable().setColorFilter(iG, mode);
        setClickable(true);
        d();
    }
}

package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f113532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f113533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScrollView f113534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f113535d = new int[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f113536e = new int[2];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f113537f = new a();

    class a implements ViewTreeObserver.OnScrollChangedListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            i.this.e();
        }
    }

    public i(View view, k kVar, ScrollView scrollView) {
        this.f113532a = view;
        this.f113533b = kVar;
        this.f113534c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.f113534c = scrollView;
    }

    public void b(k kVar) {
        this.f113533b = kVar;
    }

    public void c(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f113537f);
    }

    public void d(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f113537f);
    }

    public void e() {
        ScrollView scrollView = this.f113534c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        this.f113534c.getLocationInWindow(this.f113535d);
        this.f113534c.getChildAt(0).getLocationInWindow(this.f113536e);
        int top = (this.f113532a.getTop() - this.f113535d[1]) + this.f113536e[1];
        int height = this.f113532a.getHeight();
        int height2 = this.f113534c.getHeight();
        if (top < 0) {
            this.f113533b.q0(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
            this.f113532a.invalidate();
            return;
        }
        int i10 = top + height;
        if (i10 > height2) {
            this.f113533b.q0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i10 - height2) / height))));
            this.f113532a.invalidate();
        } else if (this.f113533b.A() != 1.0f) {
            this.f113533b.q0(1.0f);
            this.f113532a.invalidate();
        }
    }
}

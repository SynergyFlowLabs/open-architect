package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class r4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f159592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159596g;

    private r4(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f159590a = frameLayout;
        this.f159591b = constraintLayout;
        this.f159592c = imageView;
        this.f159593d = textView;
        this.f159594e = buttonTextView;
        this.f159595f = textView2;
        this.f159596g = textView3;
    }

    @NonNull
    public static r4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Dk;
        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
        if (constraintLayout != null) {
            i10 = com.planner5d.library.f.j.Ek;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.Fk;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.Gk;
                    ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                    if (buttonTextView != null) {
                        i10 = com.planner5d.library.f.j.Hk;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            i10 = com.planner5d.library.f.j.Ik;
                            TextView textView3 = (TextView) b4.c.a(view, i10);
                            if (textView3 != null) {
                                return new r4((FrameLayout) view, constraintLayout, imageView, textView, buttonTextView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r4 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static r4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168843t7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159590a;
    }
}

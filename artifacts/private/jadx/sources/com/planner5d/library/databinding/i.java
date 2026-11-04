package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f159094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f159096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159098f;

    private i(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ButtonTextView buttonTextView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f159093a = constraintLayout;
        this.f159094b = imageView;
        this.f159095c = buttonTextView;
        this.f159096d = imageView2;
        this.f159097e = textView;
        this.f159098f = textView2;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Lh;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.f.j.Nh;
            ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
            if (buttonTextView != null) {
                i10 = com.planner5d.library.f.j.Oh;
                ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                if (imageView2 != null) {
                    i10 = com.planner5d.library.f.j.Ph;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = com.planner5d.library.f.j.Qh;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            return new i((ConstraintLayout) view, imageView, buttonTextView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.M0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159093a;
    }
}

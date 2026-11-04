package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.RoundedCornersLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class n5 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageButton f159400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f159401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159405h;

    private n5(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageButton imageButton, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f159398a = constraintLayout;
        this.f159399b = textView;
        this.f159400c = imageButton;
        this.f159401d = roundedCornersLayout;
        this.f159402e = imageView;
        this.f159403f = constraintLayout2;
        this.f159404g = textView2;
        this.f159405h = textView3;
    }

    @NonNull
    public static n5 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.V4;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.W4;
            ImageButton imageButton = (ImageButton) b4.c.a(view, i10);
            if (imageButton != null) {
                i10 = com.planner5d.library.f.j.Rd;
                RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
                if (roundedCornersLayout != null) {
                    i10 = com.planner5d.library.f.j.Zm;
                    ImageView imageView = (ImageView) b4.c.a(view, i10);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i10 = com.planner5d.library.f.j.Jt;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            i10 = com.planner5d.library.f.j.tv;
                            TextView textView3 = (TextView) b4.c.a(view, i10);
                            if (textView3 != null) {
                                return new n5(constraintLayout, textView, imageButton, roundedCornersLayout, imageView, constraintLayout, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n5 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n5 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.T7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159398a;
    }
}

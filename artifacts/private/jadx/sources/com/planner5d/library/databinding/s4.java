package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.ProfileIconView;
import com.planner5d.library.widget.RoundedCornersLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class s4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f159639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f159640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f159642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f159645i;

    private s4(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ProfileIconView profileIconView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f159637a = constraintLayout;
        this.f159638b = textView;
        this.f159639c = profileIconView;
        this.f159640d = imageView;
        this.f159641e = imageView2;
        this.f159642f = roundedCornersLayout;
        this.f159643g = textView2;
        this.f159644h = textView3;
        this.f159645i = textView4;
    }

    @NonNull
    public static s4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.F3;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.L3;
            ProfileIconView profileIconView = (ProfileIconView) b4.c.a(view, i10);
            if (profileIconView != null) {
                i10 = com.planner5d.library.f.j.f168377sc;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    i10 = com.planner5d.library.f.j.Jd;
                    ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                    if (imageView2 != null) {
                        i10 = com.planner5d.library.f.j.Zd;
                        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
                        if (roundedCornersLayout != null) {
                            i10 = com.planner5d.library.f.j.f168212lg;
                            TextView textView2 = (TextView) b4.c.a(view, i10);
                            if (textView2 != null) {
                                i10 = com.planner5d.library.f.j.tv;
                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                if (textView3 != null) {
                                    i10 = com.planner5d.library.f.j.Qx;
                                    TextView textView4 = (TextView) b4.c.a(view, i10);
                                    if (textView4 != null) {
                                        return new s4((ConstraintLayout) view, textView, profileIconView, imageView, imageView2, roundedCornersLayout, textView2, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static s4 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static s4 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168896y7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159637a;
    }
}

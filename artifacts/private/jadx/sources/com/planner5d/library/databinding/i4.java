package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.BackgroundImageView;
import com.planner5d.library.widget.ProfileIconView;

/* JADX INFO: loaded from: classes4.dex */
public final class i4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f159132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final BackgroundImageView f159133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159137h;

    private i4(@NonNull View view, @NonNull TextView textView, @NonNull ProfileIconView profileIconView, @NonNull BackgroundImageView backgroundImageView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f159130a = view;
        this.f159131b = textView;
        this.f159132c = profileIconView;
        this.f159133d = backgroundImageView;
        this.f159134e = textView2;
        this.f159135f = linearLayout;
        this.f159136g = textView3;
        this.f159137h = textView4;
    }

    @NonNull
    public static i4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.F3;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.L3;
            ProfileIconView profileIconView = (ProfileIconView) b4.c.a(view, i10);
            if (profileIconView != null) {
                i10 = com.planner5d.library.f.j.Jd;
                BackgroundImageView backgroundImageView = (BackgroundImageView) b4.c.a(view, i10);
                if (backgroundImageView != null) {
                    i10 = com.planner5d.library.f.j.f168212lg;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.rt;
                        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                        if (linearLayout != null) {
                            i10 = com.planner5d.library.f.j.tv;
                            TextView textView3 = (TextView) b4.c.a(view, i10);
                            if (textView3 != null) {
                                i10 = com.planner5d.library.f.j.Qx;
                                TextView textView4 = (TextView) b4.c.a(view, i10);
                                if (textView4 != null) {
                                    return new i4(view, textView, profileIconView, backgroundImageView, textView2, linearLayout, textView3, textView4);
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
    public static i4 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168700g7, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159130a;
    }
}

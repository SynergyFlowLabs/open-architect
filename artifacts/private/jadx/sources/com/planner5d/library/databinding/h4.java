package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.ImageButtonWithStates;
import com.planner5d.library.widget.textview.TextViewWithStates;

/* JADX INFO: loaded from: classes4.dex */
public final class h4 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageButtonWithStates f159079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextViewWithStates f159080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageButtonWithStates f159081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f159082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159083f;

    private h4(@NonNull View view, @NonNull ImageButtonWithStates imageButtonWithStates, @NonNull TextViewWithStates textViewWithStates, @NonNull ImageButtonWithStates imageButtonWithStates2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout) {
        this.f159078a = view;
        this.f159079b = imageButtonWithStates;
        this.f159080c = textViewWithStates;
        this.f159081d = imageButtonWithStates2;
        this.f159082e = imageView;
        this.f159083f = linearLayout;
    }

    @NonNull
    public static h4 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168345r5;
        ImageButtonWithStates imageButtonWithStates = (ImageButtonWithStates) b4.c.a(view, i10);
        if (imageButtonWithStates != null) {
            i10 = com.planner5d.library.f.j.Kc;
            TextViewWithStates textViewWithStates = (TextViewWithStates) b4.c.a(view, i10);
            if (textViewWithStates != null) {
                i10 = com.planner5d.library.f.j.f168017dd;
                ImageButtonWithStates imageButtonWithStates2 = (ImageButtonWithStates) b4.c.a(view, i10);
                if (imageButtonWithStates2 != null) {
                    i10 = com.planner5d.library.f.j.Cr;
                    ImageView imageView = (ImageView) b4.c.a(view, i10);
                    if (imageView != null) {
                        i10 = com.planner5d.library.f.j.Bv;
                        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                        if (linearLayout != null) {
                            return new h4(view, imageButtonWithStates, textViewWithStates, imageButtonWithStates2, imageView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static h4 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168689f7, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159078a;
    }
}

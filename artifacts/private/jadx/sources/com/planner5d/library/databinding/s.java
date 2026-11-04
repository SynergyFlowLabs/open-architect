package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f159611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159618j;

    private s(@NonNull FrameLayout frameLayout, @NonNull TextInputLayout textInputLayout, @NonNull LinearLayout linearLayout, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputEditTextCompat textInputEditTextCompat2, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputEditTextCompat textInputEditTextCompat3, @NonNull TextInputLayout textInputLayout3, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout2) {
        this.f159609a = frameLayout;
        this.f159610b = textInputLayout;
        this.f159611c = linearLayout;
        this.f159612d = textInputEditTextCompat;
        this.f159613e = textInputEditTextCompat2;
        this.f159614f = textInputLayout2;
        this.f159615g = textInputEditTextCompat3;
        this.f159616h = textInputLayout3;
        this.f159617i = recyclerView;
        this.f159618j = frameLayout2;
    }

    @NonNull
    public static s a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Z9;
        TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
        if (textInputLayout != null) {
            i10 = com.planner5d.library.f.j.f168138ie;
            LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
            if (linearLayout != null) {
                i10 = com.planner5d.library.f.j.f168162je;
                TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
                if (textInputEditTextCompat != null) {
                    i10 = com.planner5d.library.f.j.f168210le;
                    TextInputEditTextCompat textInputEditTextCompat2 = (TextInputEditTextCompat) b4.c.a(view, i10);
                    if (textInputEditTextCompat2 != null) {
                        i10 = com.planner5d.library.f.j.f168234me;
                        TextInputLayout textInputLayout2 = (TextInputLayout) b4.c.a(view, i10);
                        if (textInputLayout2 != null) {
                            i10 = com.planner5d.library.f.j.wr;
                            TextInputEditTextCompat textInputEditTextCompat3 = (TextInputEditTextCompat) b4.c.a(view, i10);
                            if (textInputEditTextCompat3 != null) {
                                i10 = com.planner5d.library.f.j.xr;
                                TextInputLayout textInputLayout3 = (TextInputLayout) b4.c.a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = com.planner5d.library.f.j.hu;
                                    RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                                    if (recyclerView != null) {
                                        i10 = com.planner5d.library.f.j.iu;
                                        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                                        if (frameLayout != null) {
                                            return new s((FrameLayout) view, textInputLayout, linearLayout, textInputEditTextCompat, textInputEditTextCompat2, textInputLayout2, textInputEditTextCompat3, textInputLayout3, recyclerView, frameLayout);
                                        }
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
    public static s c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static s d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.Y0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159609a;
    }
}

package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class t7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f159719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Button f159722i;

    private t7(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button) {
        this.f159714a = view;
        this.f159715b = materialButton;
        this.f159716c = materialButton2;
        this.f159717d = textInputEditTextCompat;
        this.f159718e = textInputLayout;
        this.f159719f = imageView;
        this.f159720g = textView;
        this.f159721h = textView2;
        this.f159722i = button;
    }

    @NonNull
    public static t7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168297p5;
        MaterialButton materialButton = (MaterialButton) b4.c.a(view, i10);
        if (materialButton != null) {
            i10 = com.planner5d.library.f.j.f168321q5;
            MaterialButton materialButton2 = (MaterialButton) b4.c.a(view, i10);
            if (materialButton2 != null) {
                i10 = com.planner5d.library.f.j.f168306pe;
                TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
                if (textInputEditTextCompat != null) {
                    i10 = com.planner5d.library.f.j.f168354re;
                    TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                    if (textInputLayout != null) {
                        i10 = com.planner5d.library.f.j.Rg;
                        ImageView imageView = (ImageView) b4.c.a(view, i10);
                        if (imageView != null) {
                            i10 = com.planner5d.library.f.j.Sg;
                            TextView textView = (TextView) b4.c.a(view, i10);
                            if (textView != null) {
                                i10 = com.planner5d.library.f.j.jq;
                                TextView textView2 = (TextView) b4.c.a(view, i10);
                                if (textView2 != null) {
                                    i10 = com.planner5d.library.f.j.kq;
                                    Button button = (Button) b4.c.a(view, i10);
                                    if (button != null) {
                                        return new t7(view, materialButton, materialButton2, textInputEditTextCompat, textInputLayout, imageView, textView, textView2, button);
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
    public static t7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.X8, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159714a;
    }
}

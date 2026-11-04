package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class m7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159366e;

    private m7(@NonNull View view, @NonNull MaterialButton materialButton, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView) {
        this.f159362a = view;
        this.f159363b = materialButton;
        this.f159364c = textInputEditTextCompat;
        this.f159365d = textInputLayout;
        this.f159366e = textView;
    }

    @NonNull
    public static m7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.F5;
        MaterialButton materialButton = (MaterialButton) b4.c.a(view, i10);
        if (materialButton != null) {
            i10 = com.planner5d.library.f.j.f168379se;
            TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
            if (textInputEditTextCompat != null) {
                i10 = com.planner5d.library.f.j.f168403te;
                TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                if (textInputLayout != null) {
                    i10 = com.planner5d.library.f.j.tv;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        return new m7(view, materialButton, textInputEditTextCompat, textInputLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.Q8, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159362a;
    }
}

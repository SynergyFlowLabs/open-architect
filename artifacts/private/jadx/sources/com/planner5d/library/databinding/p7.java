package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.NumberInputView;
import com.planner5d.library.widget.SliderViewV2;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class p7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final NumberInputView f159518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final NumberInputView f159519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f159520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f159521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f159524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f159525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final NumberInputView f159526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final SliderViewV2 f159527k;

    private p7(@NonNull View view, @NonNull NumberInputView numberInputView, @NonNull NumberInputView numberInputView2, @NonNull RecyclerView recyclerView, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull TextView textView2, @NonNull NumberInputView numberInputView3, @NonNull SliderViewV2 sliderViewV2) {
        this.f159517a = view;
        this.f159518b = numberInputView;
        this.f159519c = numberInputView2;
        this.f159520d = recyclerView;
        this.f159521e = textInputEditTextCompat;
        this.f159522f = textInputLayout;
        this.f159523g = textView;
        this.f159524h = textInputLayout2;
        this.f159525i = textView2;
        this.f159526j = numberInputView3;
        this.f159527k = sliderViewV2;
    }

    @NonNull
    public static p7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Bq;
        NumberInputView numberInputView = (NumberInputView) b4.c.a(view, i10);
        if (numberInputView != null) {
            i10 = com.planner5d.library.f.j.Cq;
            NumberInputView numberInputView2 = (NumberInputView) b4.c.a(view, i10);
            if (numberInputView2 != null) {
                i10 = com.planner5d.library.f.j.Dq;
                RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                if (recyclerView != null) {
                    i10 = com.planner5d.library.f.j.Eq;
                    TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
                    if (textInputEditTextCompat != null) {
                        i10 = com.planner5d.library.f.j.Fq;
                        TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                        if (textInputLayout != null) {
                            i10 = com.planner5d.library.f.j.Gq;
                            TextView textView = (TextView) b4.c.a(view, i10);
                            if (textView != null) {
                                i10 = com.planner5d.library.f.j.Hq;
                                TextInputLayout textInputLayout2 = (TextInputLayout) b4.c.a(view, i10);
                                if (textInputLayout2 != null) {
                                    i10 = com.planner5d.library.f.j.Iq;
                                    TextView textView2 = (TextView) b4.c.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = com.planner5d.library.f.j.Jq;
                                        NumberInputView numberInputView3 = (NumberInputView) b4.c.a(view, i10);
                                        if (numberInputView3 != null) {
                                            i10 = com.planner5d.library.f.j.Kq;
                                            SliderViewV2 sliderViewV2 = (SliderViewV2) b4.c.a(view, i10);
                                            if (sliderViewV2 != null) {
                                                return new p7(view, numberInputView, numberInputView2, recyclerView, textInputEditTextCompat, textInputLayout, textView, textInputLayout2, textView2, numberInputView3, sliderViewV2);
                                            }
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
    public static p7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.T8, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159517a;
    }
}

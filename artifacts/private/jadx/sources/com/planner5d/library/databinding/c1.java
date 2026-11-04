package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.NumberInputView;
import com.planner5d.library.widget.SliderViewV2;
import com.planner5d.library.widget.colorpicker.ColorPickerCompact;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f158788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final x2 f158789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ColorPickerCompact f158790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final NumberInputView f158791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f158792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f158793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final SliderViewV2 f158794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final NumberInputView f158795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final NumberInputView f158796i;

    private c1(@NonNull View view, @NonNull x2 x2Var, @NonNull ColorPickerCompact colorPickerCompact, @NonNull NumberInputView numberInputView, @NonNull PreloaderCoverView preloaderCoverView, @NonNull LinearLayout linearLayout, @NonNull SliderViewV2 sliderViewV2, @NonNull NumberInputView numberInputView2, @NonNull NumberInputView numberInputView3) {
        this.f158788a = view;
        this.f158789b = x2Var;
        this.f158790c = colorPickerCompact;
        this.f158791d = numberInputView;
        this.f158792e = preloaderCoverView;
        this.f158793f = linearLayout;
        this.f158794g = sliderViewV2;
        this.f158795h = numberInputView2;
        this.f158796i = numberInputView3;
    }

    @NonNull
    public static c1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Mf;
        View viewA = b4.c.a(view, i10);
        if (viewA != null) {
            x2 x2VarA = x2.a(viewA);
            i10 = com.planner5d.library.f.j.Pu;
            ColorPickerCompact colorPickerCompact = (ColorPickerCompact) b4.c.a(view, i10);
            if (colorPickerCompact != null) {
                i10 = com.planner5d.library.f.j.Qu;
                NumberInputView numberInputView = (NumberInputView) b4.c.a(view, i10);
                if (numberInputView != null) {
                    i10 = com.planner5d.library.f.j.Su;
                    PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                    if (preloaderCoverView != null) {
                        i10 = com.planner5d.library.f.j.Zu;
                        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                        if (linearLayout != null) {
                            i10 = com.planner5d.library.f.j.av;
                            SliderViewV2 sliderViewV2 = (SliderViewV2) b4.c.a(view, i10);
                            if (sliderViewV2 != null) {
                                i10 = com.planner5d.library.f.j.bv;
                                NumberInputView numberInputView2 = (NumberInputView) b4.c.a(view, i10);
                                if (numberInputView2 != null) {
                                    i10 = com.planner5d.library.f.j.dv;
                                    NumberInputView numberInputView3 = (NumberInputView) b4.c.a(view, i10);
                                    if (numberInputView3 != null) {
                                        return new c1(view, x2VarA, colorPickerCompact, numberInputView, preloaderCoverView, linearLayout, sliderViewV2, numberInputView2, numberInputView3);
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
    public static c1 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.T1, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f158788a;
    }
}

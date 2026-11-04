package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.slider.Slider;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Slider f159232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatEditText f159233c;

    private k3(@NonNull View view, @NonNull Slider slider, @NonNull AppCompatEditText appCompatEditText) {
        this.f159231a = view;
        this.f159232b = slider;
        this.f159233c = appCompatEditText;
    }

    @NonNull
    public static k3 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.ws;
        Slider slider = (Slider) b4.c.a(view, i10);
        if (slider != null) {
            i10 = com.planner5d.library.f.j.Bs;
            AppCompatEditText appCompatEditText = (AppCompatEditText) b4.c.a(view, i10);
            if (appCompatEditText != null) {
                return new k3(view, slider, appCompatEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k3 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.D6, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159231a;
    }
}

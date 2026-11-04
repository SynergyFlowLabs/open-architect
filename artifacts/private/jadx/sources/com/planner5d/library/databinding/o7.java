package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.colorpicker.ColorPickerInternalView;

/* JADX INFO: loaded from: classes4.dex */
public final class o7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ColorPickerInternalView f159467b;

    private o7(@NonNull View view, @NonNull ColorPickerInternalView colorPickerInternalView) {
        this.f159466a = view;
        this.f159467b = colorPickerInternalView;
    }

    @NonNull
    public static o7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f167986c7;
        ColorPickerInternalView colorPickerInternalView = (ColorPickerInternalView) b4.c.a(view, i10);
        if (colorPickerInternalView != null) {
            return new o7(view, colorPickerInternalView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static o7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.S8, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159466a;
    }
}

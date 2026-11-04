package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f159367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f159368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RadioGroup f159369c;

    private n(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RadioGroup radioGroup) {
        this.f159367a = linearLayout;
        this.f159368b = textView;
        this.f159369c = radioGroup;
    }

    @NonNull
    public static n a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Y9;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Ip;
            RadioGroup radioGroup = (RadioGroup) b4.c.a(view, i10);
            if (radioGroup != null) {
                return new n((LinearLayout) view, textView, radioGroup);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.T0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f159367a;
    }
}

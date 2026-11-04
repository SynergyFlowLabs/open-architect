package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.editor.propertiesbar.PropertiesButtonView;

/* JADX INFO: loaded from: classes4.dex */
public final class n7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f159411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final PropertiesButtonView f159412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PropertiesButtonView f159413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final PropertiesButtonView f159414d;

    private n7(@NonNull FrameLayout frameLayout, @NonNull PropertiesButtonView propertiesButtonView, @NonNull PropertiesButtonView propertiesButtonView2, @NonNull PropertiesButtonView propertiesButtonView3) {
        this.f159411a = frameLayout;
        this.f159412b = propertiesButtonView;
        this.f159413c = propertiesButtonView2;
        this.f159414d = propertiesButtonView3;
    }

    @NonNull
    public static n7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168394t5;
        PropertiesButtonView propertiesButtonView = (PropertiesButtonView) b4.c.a(view, i10);
        if (propertiesButtonView != null) {
            i10 = com.planner5d.library.f.j.A5;
            PropertiesButtonView propertiesButtonView2 = (PropertiesButtonView) b4.c.a(view, i10);
            if (propertiesButtonView2 != null) {
                i10 = com.planner5d.library.f.j.B5;
                PropertiesButtonView propertiesButtonView3 = (PropertiesButtonView) b4.c.a(view, i10);
                if (propertiesButtonView3 != null) {
                    return new n7((FrameLayout) view, propertiesButtonView, propertiesButtonView2, propertiesButtonView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n7 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n7 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.R8, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f159411a;
    }
}

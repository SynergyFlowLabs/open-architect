package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes4.dex */
public final class v7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f159826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialButton f159827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f159831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159832h;

    private v7(@NonNull View view, @NonNull ProgressBar progressBar, @NonNull MaterialButton materialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f159825a = view;
        this.f159826b = progressBar;
        this.f159827c = materialButton;
        this.f159828d = textView;
        this.f159829e = textView2;
        this.f159830f = textView3;
        this.f159831g = textView4;
        this.f159832h = textView5;
    }

    @NonNull
    public static v7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f167933a4;
        ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
        if (progressBar != null) {
            i10 = com.planner5d.library.f.j.M4;
            MaterialButton materialButton = (MaterialButton) b4.c.a(view, i10);
            if (materialButton != null) {
                i10 = com.planner5d.library.f.j.Ka;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.f168064fc;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.Tg;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = com.planner5d.library.f.j.st;
                            TextView textView4 = (TextView) b4.c.a(view, i10);
                            if (textView4 != null) {
                                i10 = com.planner5d.library.f.j.Wx;
                                TextView textView5 = (TextView) b4.c.a(view, i10);
                                if (textView5 != null) {
                                    return new v7(view, progressBar, materialButton, textView, textView2, textView3, textView4, textView5);
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
    public static v7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168636a9, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159825a;
    }
}

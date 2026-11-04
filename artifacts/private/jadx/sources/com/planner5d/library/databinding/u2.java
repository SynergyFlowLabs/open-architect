package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.EditTextWithValidator;

/* JADX INFO: loaded from: classes4.dex */
public final class u2 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditTextWithValidator f159752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f159754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f159755e;

    private u2(@NonNull View view, @NonNull EditTextWithValidator editTextWithValidator, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f159751a = view;
        this.f159752b = editTextWithValidator;
        this.f159753c = textView;
        this.f159754d = textView2;
        this.f159755e = textView3;
    }

    @NonNull
    public static u2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168186ke;
        EditTextWithValidator editTextWithValidator = (EditTextWithValidator) b4.c.a(view, i10);
        if (editTextWithValidator != null) {
            i10 = com.planner5d.library.f.j.f168330qe;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.hq;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.f.j.iq;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        return new u2(view, editTextWithValidator, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static u2 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.U2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159751a;
    }
}

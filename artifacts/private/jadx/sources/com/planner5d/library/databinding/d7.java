package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes4.dex */
public final class d7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f158860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f158861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatEditText f158862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f158863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f158864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f158865f;

    private d7(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f158860a = view;
        this.f158861b = linearLayout;
        this.f158862c = appCompatEditText;
        this.f158863d = textView;
        this.f158864e = imageView;
        this.f158865f = imageView2;
    }

    @NonNull
    public static d7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f168480wj;
        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
        if (linearLayout != null) {
            i10 = com.planner5d.library.f.j.f168504xj;
            AppCompatEditText appCompatEditText = (AppCompatEditText) b4.c.a(view, i10);
            if (appCompatEditText != null) {
                i10 = com.planner5d.library.f.j.f168528yj;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.f.j.f168552zj;
                    ImageView imageView = (ImageView) b4.c.a(view, i10);
                    if (imageView != null) {
                        i10 = com.planner5d.library.f.j.Aj;
                        ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                        if (imageView2 != null) {
                            return new d7(view, linearLayout, appCompatEditText, textView, imageView, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static d7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168866v8, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f158860a;
    }
}

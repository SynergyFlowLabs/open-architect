package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.editor.popup.properties.view.MaterialImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class a7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f158722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialImageView f158723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f158724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f158725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f158726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f158727f;

    private a7(@NonNull View view, @NonNull MaterialImageView materialImageView, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f158722a = view;
        this.f158723b = materialImageView;
        this.f158724c = imageView;
        this.f158725d = frameLayout;
        this.f158726e = textView;
        this.f158727f = textView2;
    }

    @NonNull
    public static a7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Jd;
        MaterialImageView materialImageView = (MaterialImageView) b4.c.a(view, i10);
        if (materialImageView != null) {
            i10 = com.planner5d.library.f.j.Sd;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.f.j.Td;
                FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                if (frameLayout != null) {
                    i10 = com.planner5d.library.f.j.Av;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = com.planner5d.library.f.j.Cv;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            return new a7(view, materialImageView, imageView, frameLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168833s8, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f158722a;
    }
}

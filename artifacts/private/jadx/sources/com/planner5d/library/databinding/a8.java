package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.BackgroundImageView;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class a8 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f158728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final BackgroundImageView f158729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f158730c;

    private a8(@NonNull View view, @NonNull BackgroundImageView backgroundImageView, @NonNull PreloaderBoxV2View preloaderBoxV2View) {
        this.f158728a = view;
        this.f158729b = backgroundImageView;
        this.f158730c = preloaderBoxV2View;
    }

    @NonNull
    public static a8 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Jd;
        BackgroundImageView backgroundImageView = (BackgroundImageView) b4.c.a(view, i10);
        if (backgroundImageView != null) {
            i10 = com.planner5d.library.f.j.El;
            PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
            if (preloaderBoxV2View != null) {
                return new a8(view, backgroundImageView, preloaderBoxV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a8 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168724i9, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f158728a;
    }
}

package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes4.dex */
public final class z7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f160028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f160029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f160030c;

    private z7(@NonNull View view, @NonNull TextView textView, @NonNull PreloaderCoverView preloaderCoverView) {
        this.f160028a = view;
        this.f160029b = textView;
        this.f160030c = preloaderCoverView;
    }

    @NonNull
    public static z7 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Vr;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.f.j.Wr;
            PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
            if (preloaderCoverView != null) {
                return new z7(view, textView, preloaderCoverView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static z7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168680e9, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f160028a;
    }
}

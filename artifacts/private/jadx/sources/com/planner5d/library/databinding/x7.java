package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.activity.fragment.settings.ViewDataRemoval;
import com.planner5d.library.activity.fragment.settings.ViewManagedFiles;
import com.planner5d.library.activity.fragment.settings.ViewPromoCode;

/* JADX INFO: loaded from: classes4.dex */
public final class x7 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewDataRemoval f159908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ViewManagedFiles f159909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ViewPromoCode f159910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f159911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f159912f;

    private x7(@NonNull View view, @NonNull ViewDataRemoval viewDataRemoval, @NonNull ViewManagedFiles viewManagedFiles, @NonNull ViewPromoCode viewPromoCode, @NonNull View view2, @NonNull View view3) {
        this.f159907a = view;
        this.f159908b = viewDataRemoval;
        this.f159909c = viewManagedFiles;
        this.f159910d = viewPromoCode;
        this.f159911e = view2;
        this.f159912f = view3;
    }

    @NonNull
    public static x7 a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = com.planner5d.library.f.j.O9;
        ViewDataRemoval viewDataRemoval = (ViewDataRemoval) b4.c.a(view, i10);
        if (viewDataRemoval != null) {
            i10 = com.planner5d.library.f.j.Ug;
            ViewManagedFiles viewManagedFiles = (ViewManagedFiles) b4.c.a(view, i10);
            if (viewManagedFiles != null) {
                i10 = com.planner5d.library.f.j.oo;
                ViewPromoCode viewPromoCode = (ViewPromoCode) b4.c.a(view, i10);
                if (viewPromoCode != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.f.j.Sr))) != null && (viewA2 = b4.c.a(view, (i10 = com.planner5d.library.f.j.Tr))) != null) {
                    return new x7(view, viewDataRemoval, viewManagedFiles, viewPromoCode, viewA, viewA2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static x7 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168658c9, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159907a;
    }
}

package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.editor.catalog.CatalogSearchRecentsView;
import com.planner5d.library.widget.editor.catalog.CatalogSearchSuggestionsView;

/* JADX INFO: loaded from: classes4.dex */
public final class i3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CatalogSearchRecentsView f159128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CatalogSearchSuggestionsView f159129c;

    private i3(@NonNull View view, @NonNull CatalogSearchRecentsView catalogSearchRecentsView, @NonNull CatalogSearchSuggestionsView catalogSearchSuggestionsView) {
        this.f159127a = view;
        this.f159128b = catalogSearchRecentsView;
        this.f159129c = catalogSearchSuggestionsView;
    }

    @NonNull
    public static i3 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.Pp;
        CatalogSearchRecentsView catalogSearchRecentsView = (CatalogSearchRecentsView) b4.c.a(view, i10);
        if (catalogSearchRecentsView != null) {
            i10 = com.planner5d.library.f.j.It;
            CatalogSearchSuggestionsView catalogSearchSuggestionsView = (CatalogSearchSuggestionsView) b4.c.a(view, i10);
            if (catalogSearchSuggestionsView != null) {
                return new i3(view, catalogSearchRecentsView, catalogSearchSuggestionsView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i3 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.f168743k6, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159127a;
    }
}

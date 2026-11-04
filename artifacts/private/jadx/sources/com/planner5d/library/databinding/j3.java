package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.editor.catalog.RecyclerViewCatalog;

/* JADX INFO: loaded from: classes4.dex */
public final class j3 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RecyclerViewCatalog f159188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerViewCatalog f159189b;

    private j3(@NonNull RecyclerViewCatalog recyclerViewCatalog, @NonNull RecyclerViewCatalog recyclerViewCatalog2) {
        this.f159188a = recyclerViewCatalog;
        this.f159189b = recyclerViewCatalog2;
    }

    @NonNull
    public static j3 a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerViewCatalog recyclerViewCatalog = (RecyclerViewCatalog) view;
        return new j3(recyclerViewCatalog, recyclerViewCatalog);
    }

    @NonNull
    public static j3 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static j3 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168754l6, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerViewCatalog getRoot() {
        return this.f159188a;
    }
}

package com.planner5d.library.dgenerator.fragment.gallery;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final mb.i f160168a;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(@NotNull mb.i binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        TextView root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root, null);
        this.f160168a = binding;
    }

    @Override // com.planner5d.library.dgenerator.fragment.gallery.m
    public void g(@NotNull p data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f160168a.getRoot().setText(data.d());
    }
}

package com.superwall.sdk.paywall.view;

import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ViewModelFactory implements j2.c {
    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <T extends f2> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(ViewStorageViewModel.class)) {
            return new ViewStorageViewModel();
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}

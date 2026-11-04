package com.superwall.sdk.paywall.view;

import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class SuperwallStoreOwner implements m2 {

    @NotNull
    private final l2 viewModelStore = new l2();

    @Override // androidx.lifecycle.m2
    @NotNull
    public l2 getViewModelStore() {
        return this.viewModelStore;
    }
}

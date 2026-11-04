package com.superwall.sdk.paywall.view;

import android.view.View;
import androidx.lifecycle.f2;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ViewStorageViewModel extends f2 implements ViewStorage {

    @NotNull
    private final ConcurrentHashMap<String, View> views = new ConcurrentHashMap<>();

    @Override // com.superwall.sdk.paywall.view.ViewStorage
    @NotNull
    public List<View> all() {
        return ViewStorage.DefaultImpls.all(this);
    }

    @Override // com.superwall.sdk.paywall.view.ViewStorage
    @NotNull
    public ConcurrentHashMap<String, View> getViews() {
        return this.views;
    }

    @Override // com.superwall.sdk.paywall.view.ViewStorage
    @NotNull
    public Set<String> keys() {
        return ViewStorage.DefaultImpls.keys(this);
    }

    @Override // com.superwall.sdk.paywall.view.ViewStorage
    public void removeView(@NotNull String str) {
        ViewStorage.DefaultImpls.removeView(this, str);
    }

    @Override // com.superwall.sdk.paywall.view.ViewStorage
    @Nullable
    public View retrieveView(@NotNull String str) {
        return ViewStorage.DefaultImpls.retrieveView(this, str);
    }

    @Override // com.superwall.sdk.paywall.view.ViewStorage
    public void storeView(@NotNull String str, @NotNull View view) {
        ViewStorage.DefaultImpls.storeView(this, str, view);
    }
}

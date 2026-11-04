package com.superwall.sdk.dependencies;

import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.MainScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface SuperwallScopeFactory {
    @NotNull
    IOScope ioScope();

    @NotNull
    MainScope mainScope();
}

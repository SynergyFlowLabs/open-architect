package com.superwall.supercel;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface HostContext {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void computedProperty(@NotNull String str, @NotNull String str2, @NotNull ResultCallback resultCallback);

    void deviceProperty(@NotNull String str, @NotNull String str2, @NotNull ResultCallback resultCallback);
}

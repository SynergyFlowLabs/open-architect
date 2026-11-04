package com.superwall.supercel;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface ResultCallbackInterface {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void onResult(@NotNull String str);
}

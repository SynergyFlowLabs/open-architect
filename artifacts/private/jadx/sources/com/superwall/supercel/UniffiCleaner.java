package com.superwall.supercel;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCleaner {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public interface Cleanable {
        void clean();
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    Cleanable register(@NotNull Object obj, @NotNull Runnable runnable);
}

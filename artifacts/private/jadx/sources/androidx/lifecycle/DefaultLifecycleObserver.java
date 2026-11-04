package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface DefaultLifecycleObserver extends n0 {
    default void onCreate(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onDestroy(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onPause(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onResume(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStart(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStop(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }
}

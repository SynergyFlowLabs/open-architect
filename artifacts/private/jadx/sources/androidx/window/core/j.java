package androidx.window.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}

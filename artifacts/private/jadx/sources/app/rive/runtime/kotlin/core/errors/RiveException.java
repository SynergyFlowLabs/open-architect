package app.rive.runtime.kotlin.core.errors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class RiveException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}

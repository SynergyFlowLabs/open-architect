package app.rive.runtime.kotlin.core.errors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TextValueRunException extends RiveException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextValueRunException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}

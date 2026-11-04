package klipper;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String description) {
        super(description);
        Intrinsics.checkNotNullParameter(description, "description");
    }
}

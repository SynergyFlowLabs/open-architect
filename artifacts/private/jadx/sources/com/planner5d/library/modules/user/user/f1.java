package com.planner5d.library.modules.user.user;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class f1 extends IOException {
    public f1() {
    }

    public f1(@Nullable String str) {
        super(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(@NotNull Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}

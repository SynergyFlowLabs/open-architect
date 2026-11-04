package io.ktor.utils.io;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 extends c0 {
    /* JADX WARN: Multi-variable type inference failed */
    public e0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public e0(@Nullable Throwable th2) {
        super(th2);
    }

    public /* synthetic */ e0(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2);
    }
}

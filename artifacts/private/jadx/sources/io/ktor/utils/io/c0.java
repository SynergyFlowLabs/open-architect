package io.ktor.utils.io;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class c0 extends IOException {
    /* JADX WARN: Multi-variable type inference failed */
    public c0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public c0(@Nullable Throwable th2) {
        super(th2 != null ? th2.getMessage() : null, th2);
    }

    public /* synthetic */ c0(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2);
    }
}

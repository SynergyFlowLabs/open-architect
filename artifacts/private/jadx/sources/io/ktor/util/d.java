package io.ktor.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    @NotNull
    public static final b a(boolean z10) {
        return z10 ? new y() : new v0();
    }

    public static /* synthetic */ b b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}

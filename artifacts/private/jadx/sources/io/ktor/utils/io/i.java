package io.ktor.utils.io;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static final void a(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        hVar.c(new IOException("Channel was cancelled"));
    }
}

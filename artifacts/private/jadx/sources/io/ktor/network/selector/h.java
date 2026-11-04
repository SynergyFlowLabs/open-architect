package io.ktor.network.selector;

import java.io.Closeable;
import java.nio.channels.SelectableChannel;
import kotlinx.coroutines.o1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface h extends Closeable, o1 {
    void W3(@NotNull g gVar, boolean z10);

    boolean isClosed();

    @NotNull
    c j9();

    @NotNull
    SelectableChannel s();

    int ya();
}

package io.ktor.network.sockets;

import java.io.Closeable;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface d extends Closeable, o1 {

    public static final class a {
        public static void a(@NotNull d dVar) {
            try {
                dVar.close();
            } catch (Throwable unused) {
            }
        }
    }

    @NotNull
    p2 b8();

    @Override // kotlinx.coroutines.o1
    void dispose();
}

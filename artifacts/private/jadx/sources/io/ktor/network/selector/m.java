package io.ktor.network.selector;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() throws IOException {
        throw new IOException("Selectable is already closed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void d(int i10, int i11) {
        throw new IllegalStateException(("Selectable is invalid state: " + i10 + ", " + i11).toString());
    }
}

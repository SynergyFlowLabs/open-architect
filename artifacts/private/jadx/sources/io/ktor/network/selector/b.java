package io.ktor.network.selector;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends CancellationException {
    public b() {
        super("Closed channel.");
    }
}

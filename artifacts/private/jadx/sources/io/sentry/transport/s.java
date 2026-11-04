package io.sentry.transport;

import io.sentry.g6;
import io.sentry.n0;
import java.util.Collections;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements io.sentry.cache.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s f306894a = new s();

    public static s c() {
        return f306894a;
    }

    @Override // io.sentry.cache.g
    public void D3(@NotNull g6 g6Var, @NotNull n0 n0Var) {
    }

    @Override // io.sentry.cache.g
    public boolean M3(@NotNull g6 g6Var, @NotNull n0 n0Var) {
        return false;
    }

    @Override // io.sentry.cache.g
    public void e3(@NotNull g6 g6Var) {
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<g6> iterator() {
        return Collections.emptyIterator();
    }
}

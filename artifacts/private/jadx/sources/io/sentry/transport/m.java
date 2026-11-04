package io.sentry.transport;

import java.net.Authenticator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f306887a = new m();

    private m() {
    }

    public static m a() {
        return f306887a;
    }

    public void b(@NotNull Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}

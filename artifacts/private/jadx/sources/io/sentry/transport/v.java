package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class v extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f306897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f306898b;

    v(@NotNull String str, @NotNull String str2) {
        this.f306897a = (String) io.sentry.util.y.c(str, "user is required");
        this.f306898b = (String) io.sentry.util.y.c(str2, "password is required");
    }

    @NotNull
    String a() {
        return this.f306898b;
    }

    @NotNull
    String b() {
        return this.f306897a;
    }

    @Override // java.net.Authenticator
    @Nullable
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f306897a, this.f306898b.toCharArray());
        }
        return null;
    }
}

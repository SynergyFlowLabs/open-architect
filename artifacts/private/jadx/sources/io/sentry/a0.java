package io.sentry;

import com.superwall.sdk.network.Api;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f303885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f303886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f303887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f303888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final URI f303889e;

    a0(@Nullable String str) throws IllegalArgumentException {
        try {
            io.sentry.util.y.c(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !Api.scheme.equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(":", -1);
            String str2 = strArrSplit[0];
            this.f303888d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f303887c = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            if (!strSubstring.endsWith("/")) {
                strSubstring = strSubstring + "/";
            }
            this.f303886b = strSubstring;
            String strSubstring2 = path.substring(iLastIndexOf);
            this.f303885a = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            String str3 = strSubstring;
            this.f303889e = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), str3 + "api/" + strSubstring2, null, null);
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    @Nullable
    public String a() {
        return this.f303886b;
    }

    @NotNull
    public String b() {
        return this.f303885a;
    }

    @NotNull
    public String c() {
        return this.f303888d;
    }

    @Nullable
    public String d() {
        return this.f303887c;
    }

    @NotNull
    URI e() {
        return this.f303889e;
    }
}

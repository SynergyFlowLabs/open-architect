package io.sentry;

import java.net.URI;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.b
public final class r4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f306616c = "User-Agent";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f306617d = "X-Sentry-Auth";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a0 f306618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f306619b;

    public r4(@NotNull String str, @Nullable String str2) {
        io.sentry.util.y.c(str, "dsn is required");
        this.f306618a = new a0(str);
        this.f306619b = str2;
    }

    @NotNull
    public q4 a() {
        String str;
        URI uriE = this.f306618a.e();
        String string = uriE.resolve(uriE.getPath() + "/envelope/").toString();
        String strC = this.f306618a.c();
        String strD = this.f306618a.d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.f306619b);
        sb2.append(",sentry_key=");
        sb2.append(strC);
        if (strD == null || strD.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + strD;
        }
        sb2.append(str);
        String string2 = sb2.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", this.f306619b);
        map.put(f306617d, string2);
        return new q4(string, map);
    }

    @lm.a.c
    public r4(@NotNull n8 n8Var) {
        io.sentry.util.y.c(n8Var, "options is required");
        this.f306618a = n8Var.retrieveParsedDsn();
        this.f306619b = n8Var.getSentryClientName();
    }
}

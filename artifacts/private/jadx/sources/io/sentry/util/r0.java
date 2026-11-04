package io.sentry.util;

import io.sentry.p1;
import io.sentry.q9;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f306983a = "[Filtered]";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f306984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f306985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f306986c;

        public a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f306984a = str;
            this.f306985b = str2;
            this.f306986c = str3;
        }

        public void a(@Nullable io.sentry.protocol.m mVar) {
            if (mVar == null) {
                return;
            }
            mVar.G(this.f306984a);
            mVar.F(this.f306985b);
            mVar.B(this.f306986c);
        }

        public void b(@Nullable p1 p1Var) {
            if (p1Var == null) {
                return;
            }
            String str = this.f306985b;
            if (str != null) {
                p1Var.B(q9.f306590c, str);
            }
            String str2 = this.f306986c;
            if (str2 != null) {
                p1Var.B(q9.f306591d, str2);
            }
        }

        @Nullable
        public String c() {
            return this.f306986c;
        }

        @Nullable
        public String d() {
            return this.f306985b;
        }

        @Nullable
        public String e() {
            return this.f306984a;
        }

        @NotNull
        public String f() {
            String str = this.f306984a;
            if (str == null) {
                str = "unknown";
            }
            return str;
        }
    }

    @NotNull
    private static String a(@NotNull String str) {
        if (!str.contains("@")) {
            return str;
        }
        boolean zStartsWith = str.startsWith("@");
        String str2 = f306983a;
        if (zStartsWith) {
            return f306983a + str;
        }
        if (str.substring(0, str.indexOf(64)).contains(":")) {
            str2 = "[Filtered]:[Filtered]";
        }
        return str2 + str.substring(str.indexOf(64));
    }

    private static boolean b(@NotNull URI uri) {
        try {
            uri.toURL();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public static a c(@NotNull String str) {
        String str2;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute() && !b(uri)) {
                return new a(null, null, null);
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            return new a(str2 + a(rawAuthority) + rawPath, uri.getRawQuery(), uri.getRawFragment());
        } catch (Exception unused) {
            return new a(null, null, null);
        }
    }

    @Nullable
    public static a d(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return c(str);
    }
}

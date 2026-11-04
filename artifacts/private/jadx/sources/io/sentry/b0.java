package io.sentry;

import java.net.URI;
import java.util.Locale;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class b0 {
    public static boolean a(@Nullable n8 n8Var, @Nullable String str) {
        URI uriE;
        String host;
        if (n8Var == null || str == null || n8Var.getDsn() == null || (host = (uriE = n8Var.retrieveParsedDsn().e()).getHost()) == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = host.toLowerCase(locale);
        int port = uriE.getPort();
        if (port <= 0) {
            return str.toLowerCase(locale).contains(lowerCase);
        }
        return str.toLowerCase(locale).contains(lowerCase + ":" + port);
    }
}

package io.sentry.util;

import java.net.URI;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class b0 {
    public static boolean a(@NotNull List<String> list, @NotNull String str) {
        if (list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
            try {
                if (str.matches(str2)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean b(@NotNull List<String> list, URI uri) {
        return a(list, uri.toString());
    }
}

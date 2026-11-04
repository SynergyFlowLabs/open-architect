package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    @w0(24)
    static class a {
        private a() {
        }

        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(@NonNull Configuration configuration, @NonNull p pVar) {
            configuration.setLocales((LocaleList) pVar.n());
        }
    }

    private g() {
    }

    @NonNull
    public static p a(@NonNull Configuration configuration) {
        return p.o(a.a(configuration));
    }

    public static void b(@NonNull Configuration configuration, @NonNull p pVar) {
        a.b(configuration, pVar);
    }
}

package androidx.media2.player;

import android.os.PersistableBundle;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
final class o {

    @w0(21)
    static final class a {
        private a() {
        }

        @androidx.annotation.u
        static PersistableBundle a() {
            return new PersistableBundle();
        }

        @androidx.annotation.u
        static void b(PersistableBundle persistableBundle, String str, Long l10) {
            persistableBundle.putLong(str, l10.longValue());
        }

        @androidx.annotation.u
        static void c(PersistableBundle persistableBundle, String str, String str2) {
            persistableBundle.putString(str, str2);
        }
    }

    private o() {
    }
}

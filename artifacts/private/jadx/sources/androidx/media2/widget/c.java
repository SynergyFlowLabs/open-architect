package androidx.media2.widget;

import android.view.accessibility.CaptioningManager;
import androidx.annotation.w0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class c {

    @w0(19)
    static final class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(CaptioningManager captioningManager, CaptioningManager.CaptioningChangeListener captioningChangeListener) {
            captioningManager.addCaptioningChangeListener(captioningChangeListener);
        }

        @androidx.annotation.u
        static float b(CaptioningManager captioningManager) {
            return captioningManager.getFontScale();
        }

        @androidx.annotation.u
        static Locale c(CaptioningManager captioningManager) {
            return captioningManager.getLocale();
        }

        @androidx.annotation.u
        static CaptioningManager.CaptionStyle d(CaptioningManager captioningManager) {
            return captioningManager.getUserStyle();
        }

        @androidx.annotation.u
        static boolean e(CaptioningManager captioningManager) {
            return captioningManager.isEnabled();
        }

        @androidx.annotation.u
        static void f(CaptioningManager captioningManager, CaptioningManager.CaptioningChangeListener captioningChangeListener) {
            captioningManager.removeCaptioningChangeListener(captioningChangeListener);
        }
    }

    private c() {
    }
}

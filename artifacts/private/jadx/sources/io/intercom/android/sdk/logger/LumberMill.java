package io.intercom.android.sdk.logger;

import com.intercom.twig.Twig;
import e.a;
import io.intercom.android.sdk.Intercom;

/* JADX INFO: loaded from: classes13.dex */
public class LumberMill {
    private static final Twig MESSENGER_TWIG = new Twig(5, "Intercom", false);
    private static final Twig NEXUS_TWIG = new Twig(5, "Intercom realtime", false);
    private static final Twig ABLY_TWIG = new Twig(5, "Intercom Ably", false);
    private static final Twig BLOCK_TWIG = new Twig(5, "Intercom", false);

    static {
        int i10 = 3 ^ 0;
    }

    public static Twig getAblyTwig() {
        return ABLY_TWIG;
    }

    public static Twig getBlocksTwig() {
        return BLOCK_TWIG;
    }

    public static Twig getLogger() {
        return MESSENGER_TWIG;
    }

    public static Twig getNexusTwig() {
        return NEXUS_TWIG;
    }

    @a({"WrongConstant"})
    public static void setLogLevel(@Intercom.LogLevel int i10) {
        MESSENGER_TWIG.setLogLevel(i10);
        NEXUS_TWIG.setLogLevel(i10);
        ABLY_TWIG.setLogLevel(i10);
        BLOCK_TWIG.setLogLevel(i10);
    }
}

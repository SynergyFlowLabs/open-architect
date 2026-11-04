package io.customer.messaginginapp.gist.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class NetworkUtilities {

    @NotNull
    public static final String CIO_CLIENT_PLATFORM = "X-CIO-Client-Platform";

    @NotNull
    public static final String CIO_CLIENT_VERSION = "X-CIO-Client-Version";

    @NotNull
    public static final String CIO_DATACENTER_HEADER = "X-CIO-Datacenter";

    @NotNull
    public static final String CIO_SITE_ID_HEADER = "X-CIO-Site-Id";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String USER_TOKEN_HEADER = "X-Gist-Encoded-User-Token";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

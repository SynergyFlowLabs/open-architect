package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import okhttp3.f0;
import okhttp3.w;

/* JADX INFO: loaded from: classes13.dex */
class UserIdentityInterceptor implements w {
    private static final String NO_USER_IDENTITY = "A network request was made with no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).";
    private static final String USER_IDENTITY_CHANGED = "registered user changed while this request was in flight";
    private final Twig twig = LumberMill.getLogger();
    private final UserIdentity userIdentity;

    public UserIdentityInterceptor(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }

    @Override // okhttp3.w
    public f0 intercept(w.a aVar) throws IOException {
        if (!this.userIdentity.identityExists()) {
            if (!this.userIdentity.isSoftReset() || !aVar.request().q().toString().contains("device_tokens") || !aVar.request().m().equals("PUT")) {
                throw new IOException(NO_USER_IDENTITY);
            }
            this.twig.internal("interceptor", "removing device token - proceeding");
            return aVar.c(aVar.request());
        }
        String fingerprint = this.userIdentity.getFingerprint();
        f0 f0VarC = aVar.c(aVar.request());
        if (fingerprint.equals(this.userIdentity.getFingerprint())) {
            this.twig.internal("interceptor", "proceeding");
            return f0VarC;
        }
        this.twig.internal("interceptor", "halting: user identity changed");
        if (f0VarC != null) {
            f0VarC.r().close();
        }
        throw new IOException(USER_IDENTITY_CHANGED);
    }
}

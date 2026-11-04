package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
abstract class SoftUserIdentity {
    static final SoftUserIdentity NONE = create("", "", "", "", "", "", "", "");

    SoftUserIdentity() {
    }

    static SoftUserIdentity create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new AutoValue_SoftUserIdentity(str, str2, str3, str4, str5, str6, str7, str8);
    }

    abstract String anonymousId();

    abstract String email();

    abstract String encryptedUserId();

    abstract String fingerprint();

    abstract String hmac();

    abstract String intercomId();

    boolean isPresent() {
        return !equals(NONE);
    }

    boolean isSameUser(Registration registration) {
        String userId = registration.getUserId();
        String email = registration.getEmail();
        boolean z10 = (TextUtils.isEmpty(userId) && TextUtils.isEmpty(email)) ? false : true;
        if (!TextUtils.isEmpty(userId)) {
            z10 = z10 && userId.equals(userId());
        }
        if (TextUtils.isEmpty(email)) {
            return z10;
        }
        return z10 && email.equals(email());
    }

    abstract String jwt();

    abstract String userId();
}

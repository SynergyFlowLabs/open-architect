package io.intercom.android.sdk.utilities;

import java.util.UUID;

/* JADX INFO: loaded from: classes13.dex */
public interface UuidStringProvider {
    public static final UuidStringProvider SYSTEM = new UuidStringProvider() { // from class: io.intercom.android.sdk.utilities.UuidStringProvider.1
        @Override // io.intercom.android.sdk.utilities.UuidStringProvider
        public String newUuidString() {
            return UUID.randomUUID().toString();
        }
    };

    String newUuidString();
}

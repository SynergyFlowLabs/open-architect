package io.intercom.android.sdk.utilities.commons;

/* JADX INFO: loaded from: classes13.dex */
public interface TimeProvider {
    public static final TimeProvider SYSTEM = new TimeProvider() { // from class: di.a
        @Override // io.intercom.android.sdk.utilities.commons.TimeProvider
        public final long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    };

    long currentTimeMillis();
}

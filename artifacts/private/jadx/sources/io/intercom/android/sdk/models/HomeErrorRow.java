package io.intercom.android.sdk.models;

import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class HomeErrorRow {

    public static final class Builder {
        public HomeErrorRow build() {
            return HomeErrorRow.create();
        }
    }

    public static HomeErrorRow create() {
        return new AutoValue_HomeErrorRow();
    }
}

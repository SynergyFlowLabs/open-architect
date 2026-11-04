package com.superwall.sdk.analytics.session;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class AppSessionLogic {

    @NotNull
    public static final AppSessionLogic INSTANCE = new AppSessionLogic();

    private AppSessionLogic() {
    }

    public static /* synthetic */ boolean didStartNewSession$default(AppSessionLogic appSessionLogic, Date date, Long l10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l10 = 3600000L;
        }
        return appSessionLogic.didStartNewSession(date, l10);
    }

    public final boolean didStartNewSession(@Nullable Date date, @Nullable Long l10) {
        if (date == null) {
            return true;
        }
        return System.currentTimeMillis() - date.getTime() > (l10 != null ? l10.longValue() : 3600000L);
    }
}

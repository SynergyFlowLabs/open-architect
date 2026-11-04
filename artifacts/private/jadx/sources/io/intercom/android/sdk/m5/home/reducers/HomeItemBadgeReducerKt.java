package io.intercom.android.sdk.m5.home.reducers;

import io.intercom.android.sdk.m5.home.data.Badge;
import io.intercom.android.sdk.m5.home.data.BadgeType;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class HomeItemBadgeReducerKt {
    @NotNull
    public static final HomeItemBadge reduceHomeItemBadge(@Nullable Badge badge) {
        if (badge == null) {
            return HomeItemBadge.None.INSTANCE;
        }
        if (badge.getBadgeType() == BadgeType.PASSIVE) {
            return HomeItemBadge.IconWithIndicator.INSTANCE;
        }
        return (badge.getBadgeType() != BadgeType.UNREAD || badge.getLabel() == null) ? HomeItemBadge.None.INSTANCE : new HomeItemBadge.IndicatorWithCount(Integer.parseInt(badge.getLabel()));
    }
}

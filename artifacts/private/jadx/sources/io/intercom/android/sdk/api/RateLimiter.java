package io.intercom.android.sdk.api;

import androidx.annotation.l1;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* JADX INFO: loaded from: classes13.dex */
class RateLimiter {
    private final AppConfig appConfig;
    private int limitedRequestCount;
    private long periodStartTimestamp;
    private final TimeProvider timeProvider;
    private final Twig twig;

    RateLimiter(AppConfig appConfig) {
        this(appConfig, TimeProvider.SYSTEM);
    }

    private boolean hasReachedMaxCount() {
        return this.limitedRequestCount >= this.appConfig.getRateLimitCount();
    }

    private boolean isInsideCurrentTimePeriod() {
        return this.timeProvider.currentTimeMillis() - this.periodStartTimestamp < this.appConfig.getRateLimitPeriodMs();
    }

    boolean isLimited() {
        return isInsideCurrentTimePeriod() && hasReachedMaxCount();
    }

    void logError() {
        this.twig.e("Your app is being rate limited because you're performing too many requests per minute", new Object[0]);
    }

    void recordRequest() {
        if (!isInsideCurrentTimePeriod()) {
            this.periodStartTimestamp = this.timeProvider.currentTimeMillis();
            this.limitedRequestCount = 0;
        }
        this.limitedRequestCount++;
    }

    @l1
    RateLimiter(AppConfig appConfig, TimeProvider timeProvider) {
        this.twig = LumberMill.getLogger();
        this.appConfig = appConfig;
        this.timeProvider = timeProvider;
    }
}

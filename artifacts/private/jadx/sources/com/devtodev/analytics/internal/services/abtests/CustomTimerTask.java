package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.queue.QueueManager;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomTimerTask implements ICustomTimerTask {
    private final double holdUp;

    @Nullable
    private Long timeStamp;

    @Nullable
    private TimerTask timer;

    public CustomTimerTask(double d10) {
        this.holdUp = d10;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ICustomTimerTask
    public double getHoldUpTime() {
        return this.holdUp;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ICustomTimerTask
    public boolean isTimeoutValid() {
        Long l10 = this.timeStamp;
        if (l10 != null) {
            if (System.currentTimeMillis() - l10.longValue() < ((long) (this.holdUp * ((double) 1000)))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ICustomTimerTask
    public void launchTask(@NotNull final Function0<Unit> stopTimer) {
        Intrinsics.checkNotNullParameter(stopTimer, "stopTimer");
        TimerTask timerTask = this.timer;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.timer = null;
        Timer timer = new Timer();
        long j10 = (long) (this.holdUp * ((double) 1000));
        TimerTask timerTask2 = new TimerTask() { // from class: com.devtodev.analytics.internal.services.abtests.CustomTimerTask$launchTask$$inlined$schedule$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                QueueManager.Companion.runIncoming(new CustomTimerTask$launchTask$1$1(stopTimer));
            }
        };
        timer.schedule(timerTask2, j10);
        this.timer = timerTask2;
        this.timeStamp = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.devtodev.analytics.internal.services.abtests.ICustomTimerTask
    public void stopTask() {
        TimerTask timerTask = this.timer;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.timer = null;
        this.timeStamp = null;
    }
}

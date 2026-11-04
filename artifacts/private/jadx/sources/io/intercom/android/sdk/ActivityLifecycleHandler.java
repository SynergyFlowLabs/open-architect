package io.intercom.android.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.l1;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;

/* JADX INFO: loaded from: classes13.dex */
class ActivityLifecycleHandler extends Handler {
    private static final int ESTIMATED_ACTIVITY_TRANSITION_DURATION_MS = 500;
    static final int PAUSED_CODE = 2;
    static final int READY_FOR_VIEW_CODE = 1;
    static final int RESUMED_CODE = 0;
    static final int STOPPED_CODE = 3;
    private final IntercomDataLayer dataLayer;
    private final long readyForViewDelayMs;
    private final Twig twig;

    ActivityLifecycleHandler(Looper looper, float f10, IntercomDataLayer intercomDataLayer) {
        super(looper);
        this.twig = LumberMill.getLogger();
        this.readyForViewDelayMs = (long) (f10 * 500.0f);
        this.dataLayer = intercomDataLayer;
    }

    static Message getMessage(int i10, Activity activity) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = activity;
        return messageObtain;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Activity activity = (Activity) message.obj;
        int i10 = message.what;
        if (i10 == 0) {
            sendMessageAfterDelay(getMessage(1, activity), this.readyForViewDelayMs);
            return;
        }
        if (i10 == 1) {
            this.twig.i("Ready to show in-app messages in " + activity, new Object[0]);
            this.dataLayer.emitEvent(new IntercomEvent.ActivityReadyForViewAttachment(activity));
            this.dataLayer.activityReadyForViewAttachment(activity);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.dataLayer.emitEvent(new IntercomEvent.ActivityStopped(activity));
            this.dataLayer.activityStopped(activity);
            return;
        }
        this.twig.i(activity + " was paused", new Object[0]);
        this.dataLayer.emitEvent(new IntercomEvent.ActivityPaused(activity));
        this.dataLayer.activityPaused(activity);
    }

    @l1
    void sendMessageAfterDelay(Message message, long j10) {
        sendMessageDelayed(message, j10);
    }
}

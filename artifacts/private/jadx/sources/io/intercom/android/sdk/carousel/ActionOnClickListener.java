package io.intercom.android.sdk.carousel;

import android.view.View;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ScreenAction;

/* JADX INFO: loaded from: classes13.dex */
class ActionOnClickListener implements View.OnClickListener {
    private final CarouselListener listener;
    private final ScreenAction screenAction;

    ActionOnClickListener(ScreenAction screenAction, CarouselListener carouselListener) {
        this.screenAction = screenAction;
        this.listener = carouselListener;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        byte b10;
        if (this.screenAction.isPermissionAction()) {
            this.listener.requestPermissions(this.screenAction);
            return;
        }
        int i10 = 2 ^ 1;
        switch (this.screenAction.getType()) {
            case "start_chat":
                b10 = 2;
                break;
            case "continue":
                b10 = 4;
                break;
            case "link":
                b10 = 1;
                break;
            case "skip":
                b10 = 3;
                break;
            case "dismiss":
                b10 = 0;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            this.listener.trackActionButtonTappedStats();
            this.listener.dismissCarousel(MetricTracker.Context.FROM_CTA);
            return;
        }
        if (b10 == 1) {
            this.listener.trackActionButtonTappedStats();
            this.listener.openLink(this.screenAction.getUri());
        } else if (b10 == 2) {
            this.listener.trackActionButtonTappedStats();
            this.listener.startChat();
        } else if (b10 != 3) {
            this.listener.selectNextScreen(MetricTracker.Context.FROM_CTA);
        } else {
            this.listener.skipPermissionScreen();
        }
    }
}

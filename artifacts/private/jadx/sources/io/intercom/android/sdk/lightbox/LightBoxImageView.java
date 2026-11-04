package io.intercom.android.sdk.lightbox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes13.dex */
public class LightBoxImageView extends AppCompatImageView {
    GestureDetector gestureDetector;
    LightBoxListener lightBoxListener;

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            LightBoxListener lightBoxListener = LightBoxImageView.this.lightBoxListener;
            if (lightBoxListener != null) {
                lightBoxListener.closeLightBox();
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public LightBoxImageView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.gestureDetector = new GestureDetector(getContext(), new GestureListener());
        setOnTouchListener(new View.OnTouchListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxImageView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return LightBoxImageView.this.gestureDetector.onTouchEvent(motionEvent);
            }
        });
    }

    void setLightBoxListener(LightBoxListener lightBoxListener) {
        this.lightBoxListener = lightBoxListener;
    }

    public LightBoxImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}

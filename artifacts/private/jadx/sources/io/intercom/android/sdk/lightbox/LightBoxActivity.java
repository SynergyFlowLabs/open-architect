package io.intercom.android.sdk.lightbox;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Transition;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.p0;
import androidx.appcompat.app.d;
import coil.request.i;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.utilities.IntercomCoilKt;

/* JADX INFO: loaded from: classes13.dex */
public class LightBoxActivity extends d implements LightBoxListener {
    private static final int ANIMATION_TIME_MS = 300;
    private static final String EXTRA_ACTIVITY_FULLSCREEN = "extra_activity_fullscreen";
    private static final String EXTRA_IMAGE_URL = "extra_image_url";
    public static final String TRANSITION_KEY = "lightbox_image";
    private String imageUrl = "";
    ViewGroup rootView;

    private void fadeIn() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(androidx.core.content.d.g(this, R.color.intercom_full_transparent_full_black)), Integer.valueOf(androidx.core.content.d.g(this, R.color.intercom_transparent_black_lightbox)));
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LightBoxActivity.this.rootView.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimatorOfObject.start();
    }

    private void fadeOut() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(androidx.core.content.d.g(this, R.color.intercom_transparent_black_lightbox)), Integer.valueOf(androidx.core.content.d.g(this, R.color.intercom_full_transparent_full_black)));
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LightBoxActivity.this.rootView.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimatorOfObject.start();
    }

    public static Intent imageIntent(Context context, String str, boolean z10) {
        return new Intent(context, (Class<?>) LightBoxActivity.class).putExtra(EXTRA_IMAGE_URL, str).putExtra(EXTRA_ACTIVITY_FULLSCREEN, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadImage(ImageView imageView) {
        IntercomCoilKt.loadIntercomImage(imageView.getContext(), new i.a(imageView.getContext()).j(this.imageUrl).i(true).r(R.drawable.intercom_image_load_failed).l0(imageView).f());
    }

    private void reloadAfterTransition(final LightBoxImageView lightBoxImageView) {
        getWindow().getSharedElementEnterTransition().addListener(new Transition.TransitionListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                new Handler().postDelayed(new Runnable() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        LightBoxActivity.this.loadImage(lightBoxImageView);
                    }
                }, 10L);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }
        });
    }

    @Override // io.intercom.android.sdk.lightbox.LightBoxListener
    public void closeLightBox() {
        fadeOut();
        supportFinishAfterTransition();
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        closeLightBox();
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@p0 Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.imageUrl = extras.getString(EXTRA_IMAGE_URL, "");
            if (extras.getBoolean(EXTRA_ACTIVITY_FULLSCREEN, false)) {
                requestWindowFeature(1);
                getWindow().setFlags(1024, 1024);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.intercom_activity_lightbox);
        this.rootView = (ViewGroup) findViewById(R.id.root_view);
        LightBoxImageView lightBoxImageView = (LightBoxImageView) findViewById(R.id.full_image);
        lightBoxImageView.setTransitionName(TRANSITION_KEY);
        loadImage(lightBoxImageView);
        reloadAfterTransition(lightBoxImageView);
        lightBoxImageView.setLightBoxListener(this);
        fadeIn();
    }
}

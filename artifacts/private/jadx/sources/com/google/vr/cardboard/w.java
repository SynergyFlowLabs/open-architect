package com.google.vr.cardboard;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class w extends FrameLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f126920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OrientationEventListener f126921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f126922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f126923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageButton f126924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f126925f;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y.b(w.this.getContext());
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.this.i(false);
        }
    }

    class c extends OrientationEventListener {
        c(Context context) {
            super(context);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            w.this.f126920a = i10;
            if (!w.this.f126922c) {
                w.this.n();
            } else if (w.k(i10)) {
                w.this.i(false);
            } else {
                w.l(i10);
            }
        }
    }

    class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            w.this.setVisibility(8);
            ((ViewGroup) w.this.getParent()).removeView(w.this);
            if (w.this.f126923d != null) {
                w.this.f126923d.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.this.f126925f.run();
        }
    }

    public w(Context context) {
        super(context);
        this.f126920a = -1;
        setOnTouchListener(this);
        setBackground(new ColorDrawable(-12232092));
        j(s.e.f126883c);
        super.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        p();
        Animation animation = getAnimation();
        if (animation != null) {
            if (!z10 && animation.getStartOffset() != 0) {
                animation.setAnimationListener(null);
                clearAnimation();
            }
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setDuration(500L);
        if (z10) {
            alphaAnimation.setStartOffset(2000L);
        }
        alphaAnimation.setAnimationListener(new d());
        startAnimation(alphaAnimation);
    }

    private void j(int i10) {
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this, true);
        findViewById(s.d.f126873g).setOnClickListener(new a());
        ((ImageView) findViewById(s.d.f126871e)).setOnClickListener(new b());
        q();
        if (getResources().getConfiguration().orientation == 2) {
            findViewById(s.d.f126869c).setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(int i10) {
        return Math.abs(i10 + (-270)) < 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return Math.abs(i10 + (-90)) < 5;
    }

    private static boolean m(int i10) {
        if (Math.abs(i10 - 180) <= 135) {
            return false;
        }
        int i11 = 2 ^ 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (getWidth() > 0 && getHeight() > 0 && this.f126920a != -1 && this.f126921b != null && !this.f126922c) {
            boolean z10 = getWidth() < getHeight();
            boolean zM = m(this.f126920a);
            if (z10 != zM) {
                View viewFindViewById = findViewById(s.d.f126870d);
                int width = viewFindViewById.getWidth();
                int height = viewFindViewById.getHeight();
                if (getLayoutDirection() == 1) {
                    viewFindViewById.setPivotX(height - viewFindViewById.getPivotX());
                    viewFindViewById.setPivotY(width - viewFindViewById.getPivotY());
                }
                if (z10) {
                    viewFindViewById.setRotation(90.0f);
                } else {
                    viewFindViewById.setRotation(-90.0f);
                }
                viewFindViewById.setTranslationX((width - height) / 2);
                viewFindViewById.setTranslationY((height - width) / 2);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                layoutParams.height = width;
                layoutParams.width = height;
                viewFindViewById.requestLayout();
            }
            if (zM) {
                findViewById(s.d.f126869c).setVisibility(0);
            } else {
                findViewById(s.d.f126869c).setVisibility(8);
            }
            this.f126922c = true;
            if (k(this.f126920a)) {
                i(true);
            }
        }
    }

    private void o() {
        if (this.f126921b != null) {
            return;
        }
        c cVar = new c(getContext());
        this.f126921b = cVar;
        cVar.enable();
    }

    private void p() {
        OrientationEventListener orientationEventListener = this.f126921b;
        if (orientationEventListener == null) {
            return;
        }
        this.f126920a = -1;
        orientationEventListener.disable();
        this.f126921b = null;
    }

    private void q() {
        ImageButton imageButton = (ImageButton) ((ViewGroup) findViewById(s.d.f126870d)).findViewById(s.d.f126867a);
        this.f126924e = imageButton;
        Runnable runnable = this.f126925f;
        if (runnable == null) {
            imageButton.setVisibility(8);
            this.f126924e.setTag(null);
            this.f126924e.setOnClickListener(null);
        } else {
            imageButton.setTag(runnable);
            this.f126924e.setVisibility(0);
            this.f126924e.setOnClickListener(new e());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        OrientationEventListener orientationEventListener = this.f126921b;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        OrientationEventListener orientationEventListener = this.f126921b;
        if (orientationEventListener != null) {
            this.f126920a = -1;
            orientationEventListener.disable();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    public void setBackButtonListener(Runnable runnable) {
        this.f126925f = runnable;
        q();
    }

    public void setTransitionListener(Runnable runnable) {
        this.f126923d = runnable;
    }

    public void setViewerName(String str) {
        TextView textView = (TextView) findViewById(s.d.f126874h);
        if (str != null) {
            textView.setText(getContext().getString(s.f.f126904s, str));
        } else {
            textView.setText(getContext().getString(s.f.f126903r));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        int visibility = getVisibility();
        super.setVisibility(i10);
        if (visibility != i10) {
            if (i10 == 0) {
                o();
            } else {
                p();
            }
        }
    }
}

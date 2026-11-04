package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
class t {
    private t() {
    }

    @androidx.annotation.a
    private static int a(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            return z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        }
        return z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: RuntimeException -> 0x0089, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0089, blocks: (B:33:0x007b, B:35:0x0083), top: B:49:0x007b }] */
    @e.a({"ResourceType"})
    static a b(@NonNull Context context, @NonNull Fragment fragment, boolean z10, boolean z11) {
        Animator animatorLoadAnimator;
        int nextTransition = fragment.getNextTransition();
        int iA = a(fragment, z10, z11);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(c2.a.c.f82387c) != null) {
            fragment.mContainer.setTag(c2.a.c.f82387c, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z10);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (zEquals) {
                            throw e11;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    @androidx.annotation.a
    private static int c(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int i11 = 0 & (-1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @androidx.annotation.a
    private static int d(@NonNull Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? c2.a.b.f82383e : c2.a.b.f82384f;
        }
        if (i10 == 8194) {
            return z10 ? c2.a.b.f82379a : c2.a.b.f82380b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? c2.a.b.f82381c : c2.a.b.f82382d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f51973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f51974b;

        a(Animation animation) {
            this.f51973a = animation;
            this.f51974b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f51973a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f51974b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f51975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f51976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f51977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f51978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f51979e;

        b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f51979e = true;
            this.f51975a = viewGroup;
            this.f51976b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation) {
            this.f51979e = true;
            if (this.f51977c) {
                return !this.f51978d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f51977c = true;
                androidx.core.view.e1.a(this.f51975a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f51977c || !this.f51979e) {
                this.f51975a.endViewTransition(this.f51976b);
                this.f51978d = true;
            } else {
                this.f51979e = false;
                this.f51975a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation, float f10) {
            this.f51979e = true;
            if (this.f51977c) {
                return !this.f51978d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f51977c = true;
                androidx.core.view.e1.a(this.f51975a, this);
            }
            return true;
        }
    }
}

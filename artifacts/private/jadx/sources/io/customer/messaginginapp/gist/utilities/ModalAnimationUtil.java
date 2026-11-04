package io.customer.messaginginapp.gist.utilities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import androidx.annotation.l;
import eh.d;
import ih.e;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ModalAnimationUtil {
    private static final long ALPHA_ANIMATION_DURATION = 150;
    private static final long COLOR_ANIMATION_DURATION = 100;

    @NotNull
    public static final String FALLBACK_COLOR_STRING = "#33000000";
    private static final long TRANSLATION_ANIMATION_DURATION = 150;

    @NotNull
    public static final ModalAnimationUtil INSTANCE = new ModalAnimationUtil();

    @NotNull
    private static final e logger = d.f274883c.w();

    private ModalAnimationUtil() {
    }

    private final AnimatorSet createEnterAnimation(View view, String str, float f10) {
        boolean z10 = false | false;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f10, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        view.setAlpha(0.0f);
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(view, "backgroundColor", 0, parseColorSafely(str));
        objectAnimatorOfArgb.setDuration(COLOR_ANIMATION_DURATION);
        objectAnimatorOfArgb.setStartDelay(0L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(objectAnimatorOfArgb);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        return animatorSet3;
    }

    private final AnimatorSet createExitAnimation(View view, float f10) {
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(view, "backgroundColor", parseColorSafely(extractBackgroundColor(view)), 0);
        objectAnimatorOfArgb.setDuration(COLOR_ANIMATION_DURATION);
        objectAnimatorOfArgb.setStartDelay(0L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfArgb);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f10);
        objectAnimatorOfFloat.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        return animatorSet3;
    }

    private final String extractBackgroundColor(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof ColorDrawable)) {
            return FALLBACK_COLOR_STRING;
        }
        q1 q1Var = q1.f312784a;
        String str = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(((ColorDrawable) background).getColor())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @l
    private final int parseColorSafely(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e10) {
            e eVar = logger;
            String message = e10.getMessage();
            if (message == null) {
                message = "Error parsing in-app overlay color";
            }
            e.a.b(eVar, message, null, null, 6, null);
            return Color.parseColor(FALLBACK_COLOR_STRING);
        }
    }

    @NotNull
    public final AnimatorSet createAnimationSetInFromBottom(@NotNull View target, @NotNull String overlayEndColor) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(overlayEndColor, "overlayEndColor");
        return createEnterAnimation(target, overlayEndColor, 100.0f);
    }

    @NotNull
    public final AnimatorSet createAnimationSetInFromTop(@NotNull View target, @NotNull String overlayEndColor) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(overlayEndColor, "overlayEndColor");
        return createEnterAnimation(target, overlayEndColor, -100.0f);
    }

    @NotNull
    public final AnimatorSet createAnimationSetOutToBottom(@NotNull View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return createExitAnimation(target, 100.0f);
    }

    @NotNull
    public final AnimatorSet createAnimationSetOutToTop(@NotNull View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return createExitAnimation(target, -100.0f);
    }
}

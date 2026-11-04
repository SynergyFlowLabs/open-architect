package androidx.media2.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class a {
    private a() {
    }

    static ObjectAnimator a(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    static AnimatorSet b(float f10, float f11, View[] viewArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (viewArr.length != 0) {
            AnimatorSet.Builder builderPlay = animatorSet.play(a(f10, f11, viewArr[0]));
            for (int i10 = 1; i10 < viewArr.length; i10++) {
                builderPlay.with(a(f10, f11, viewArr[i10]));
            }
        }
        return animatorSet;
    }
}

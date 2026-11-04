package io.customer.messaginginapp.ui.extensions;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.f;
import androidx.annotation.k1;
import androidx.annotation.l;
import eh.d;
import ih.e;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nInAppMessageViewExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageViewExtensions.kt\nio/customer/messaginginapp/ui/extensions/InAppMessageViewExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,123:1\n1#2:124\n310#3:125\n326#3,4:126\n311#3:130\n310#3:131\n326#3,4:132\n311#3:136\n*S KotlinDebug\n*F\n+ 1 InAppMessageViewExtensions.kt\nio/customer/messaginginapp/ui/extensions/InAppMessageViewExtensionsKt\n*L\n36#1:125\n36#1:126,4\n36#1:130\n46#1:131\n46#1:132,4\n46#1:136\n*E\n"})
public final class InAppMessageViewExtensionsKt {
    @k1
    public static final void animateViewSize(@NotNull final View view, @Nullable final Integer num, @Nullable final Integer num2, long j10, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            Integer num3 = num.intValue() != view.getWidth() ? num : null;
            if (num3 != null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getWidth(), num3.intValue());
                valueAnimatorOfInt.setDuration(j10);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.customer.messaginginapp.ui.extensions.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        InAppMessageViewExtensionsKt.animateViewSize$lambda$4$lambda$3$lambda$2(view, valueAnimator);
                    }
                });
                Intrinsics.checkNotNull(valueAnimatorOfInt);
                arrayList.add(valueAnimatorOfInt);
            }
        }
        if (num2 != null) {
            Integer num4 = num2.intValue() != view.getHeight() ? num2 : null;
            if (num4 != null) {
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(view.getHeight(), num4.intValue());
                valueAnimatorOfInt2.setDuration(j10);
                valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.customer.messaginginapp.ui.extensions.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        InAppMessageViewExtensionsKt.animateViewSize$lambda$9$lambda$8$lambda$7(view, valueAnimator);
                    }
                });
                Intrinsics.checkNotNull(valueAnimatorOfInt2);
                arrayList.add(valueAnimatorOfInt2);
            }
        }
        if (arrayList.isEmpty()) {
            if (function0 != null) {
                function0.invoke();
            }
            if (function1 != null) {
                function1.invoke();
            }
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j10);
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: io.customer.messaginginapp.ui.extensions.InAppMessageViewExtensionsKt$animateViewSize$5$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                View view2 = view;
                Integer num5 = num;
                Integer num6 = num2;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                if (num5 != null) {
                    layoutParams.width = num5.intValue();
                }
                if (num6 != null) {
                    layoutParams.height = num6.intValue();
                }
                view2.setLayoutParams(layoutParams);
                Function0<Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                Function0<Unit> function2 = function0;
                if (function2 != null) {
                    function2.invoke();
                }
            }
        });
        animatorSet.start();
    }

    public static /* synthetic */ void animateViewSize$default(View view, Integer num, Integer num2, long j10, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            j10 = view.getResources().getInteger(R.integer.config_shortAnimTime);
        }
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = null;
        }
        animateViewSize(view, num, num2, j10, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateViewSize$lambda$4$lambda$3$lambda$2(View view, ValueAnimator update) {
        Intrinsics.checkNotNullParameter(update, "update");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = update.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateViewSize$lambda$9$lambda$8$lambda$7(View view, ValueAnimator update) {
        Intrinsics.checkNotNullParameter(update, "update");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = update.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }

    @Nullable
    public static final Activity findActivity(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context baseContext = context;
        int i11 = i10;
        while (!(baseContext instanceof Activity)) {
            if (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
                i11--;
                if (i11 <= 0) {
                    e.a.a(d.f274883c.w(), "Max depth (" + i10 + ") exceeded while searching for Activity from Context " + context, null, 2, null);
                }
            }
            return null;
        }
        return (Activity) baseContext;
    }

    public static /* synthetic */ Activity findActivity$default(Context context, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 5;
        }
        return findActivity(context, i10);
    }

    public static final int resolveThemeColor(@NotNull View view, @f int i10, @l int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            TypedValue typedValue = new TypedValue();
            if (view.getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
                return typedValue.data;
            }
        } catch (Throwable unused) {
        }
        return i11;
    }
}

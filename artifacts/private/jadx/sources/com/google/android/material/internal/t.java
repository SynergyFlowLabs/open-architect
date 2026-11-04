package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class t implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f112905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View[] f112906b;

    interface a {
        void a(@NonNull ValueAnimator valueAnimator, @NonNull View view);
    }

    @e.a({"LambdaLast"})
    public t(@NonNull a aVar, @NonNull View... viewArr) {
        this.f112905a = aVar;
        this.f112906b = viewArr;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static /* synthetic */ void a(ValueAnimator valueAnimator, View view) {
        j(valueAnimator, view);
    }

    @NonNull
    public static t e(@NonNull Collection<View> collection) {
        return new t(new s(), collection);
    }

    @NonNull
    public static t f(@NonNull View... viewArr) {
        return new t(new s(), viewArr);
    }

    @NonNull
    public static t g(@NonNull Collection<View> collection) {
        return new t(new q(), collection);
    }

    @NonNull
    public static t h(@NonNull View... viewArr) {
        return new t(new q(), viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    private static void j(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f10.floatValue());
        view.setScaleY(f10.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @NonNull
    public static t m(@NonNull Collection<View> collection) {
        return new t(new p(), collection);
    }

    @NonNull
    public static t n(@NonNull View... viewArr) {
        return new t(new p(), viewArr);
    }

    @NonNull
    public static t o(@NonNull Collection<View> collection) {
        return new t(new r(), collection);
    }

    @NonNull
    public static t p(@NonNull View... viewArr) {
        return new t(new r(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        for (View view : this.f112906b) {
            this.f112905a.a(valueAnimator, view);
        }
    }

    @e.a({"LambdaLast"})
    public t(@NonNull a aVar, @NonNull Collection<View> collection) {
        this.f112905a = aVar;
        this.f112906b = (View[]) collection.toArray(new View[0]);
    }
}

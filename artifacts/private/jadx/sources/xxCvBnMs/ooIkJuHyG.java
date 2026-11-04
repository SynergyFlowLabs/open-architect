package xxCvBnMs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes14.dex */
public final class ooIkJuHyG extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final /* synthetic */ int f390656vvBnMaSd;

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final /* synthetic */ Activity f390657xxCvBnMs;

    public ooIkJuHyG(Activity activity, int i10) {
        this.f390657xxCvBnMs = activity;
        this.f390656vvBnMaSd = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View viewFindViewById = this.f390657xxCvBnMs.findViewById(this.f390656vvBnMaSd);
        if (viewFindViewById != null) {
            if (viewFindViewById.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewById.getParent()).removeView(viewFindViewById);
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
    }
}

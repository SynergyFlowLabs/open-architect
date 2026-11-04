package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentContainerView;
import com.planner5d.library.widget.onboarding.OnboardingListenerView;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final OnboardingListenerView f274772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final OnboardingListenerView f274773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f274774c;

    private a(@NonNull OnboardingListenerView rootView, @NonNull OnboardingListenerView listenerView, @NonNull FragmentContainerView navFragment) {
        this.f274772a = rootView;
        this.f274773b = listenerView;
        this.f274774c = navFragment;
    }

    @NonNull
    public static a a(@NonNull View rootView) {
        OnboardingListenerView onboardingListenerView = (OnboardingListenerView) rootView;
        int i10 = de.b.i.I6;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) b4.c.a(rootView, i10);
        if (fragmentContainerView != null) {
            return new a(onboardingListenerView, onboardingListenerView, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272557k0, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OnboardingListenerView getRoot() {
        return this.f274772a;
    }
}

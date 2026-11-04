package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f274823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RadioButton f274824b;

    private i(@NonNull FrameLayout rootView, @NonNull RadioButton radioButton) {
        this.f274823a = rootView;
        this.f274824b = radioButton;
    }

    @NonNull
    public static i a(@NonNull View rootView) {
        int i10 = de.b.i.f272291o8;
        RadioButton radioButton = (RadioButton) b4.c.a(rootView, i10);
        if (radioButton != null) {
            return new i((FrameLayout) rootView, radioButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater inflater) {
        int i10 = 7 | 0;
        return d(inflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272555j2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f274823a;
    }
}

package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.canhub.cropper.core.CropImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f322859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f322860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FloatingActionButton f322861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f322862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f322863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CropImageView f322864f;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView, @NonNull CropImageView cropImageView) {
        this.f322859a = constraintLayout;
        this.f322860b = frameLayout;
        this.f322861c = floatingActionButton;
        this.f322862d = buttonTextView;
        this.f322863e = textView;
        this.f322864f = cropImageView;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = lb.b.j.f320150t4;
        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
        if (frameLayout != null) {
            i10 = lb.b.j.f320151t5;
            FloatingActionButton floatingActionButton = (FloatingActionButton) b4.c.a(view, i10);
            if (floatingActionButton != null) {
                i10 = lb.b.j.D5;
                ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                if (buttonTextView != null) {
                    i10 = lb.b.j.K5;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = lb.b.j.R9;
                        CropImageView cropImageView = (CropImageView) b4.c.a(view, i10);
                        if (cropImageView != null) {
                            return new c((ConstraintLayout) view, frameLayout, floatingActionButton, buttonTextView, textView, cropImageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(lb.b.m.f320660z1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f322859a;
    }
}

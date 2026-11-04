package ie;

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

/* JADX INFO: loaded from: classes11.dex */
public final class i implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f287156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FloatingActionButton f287157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f287158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f287159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CropImageView f287160f;

    private i(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView, @NonNull CropImageView cropImageView) {
        this.f287155a = constraintLayout;
        this.f287156b = frameLayout;
        this.f287157c = floatingActionButton;
        this.f287158d = buttonTextView;
        this.f287159e = textView;
        this.f287160f = cropImageView;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = he.b.j.f283191o4;
        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
        if (frameLayout != null) {
            i10 = he.b.j.V4;
            FloatingActionButton floatingActionButton = (FloatingActionButton) b4.c.a(view, i10);
            if (floatingActionButton != null) {
                i10 = he.b.j.f282952e5;
                ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                if (buttonTextView != null) {
                    i10 = he.b.j.f283144m5;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = he.b.j.W9;
                        CropImageView cropImageView = (CropImageView) b4.c.a(view, i10);
                        if (cropImageView != null) {
                            return new i((ConstraintLayout) view, frameLayout, floatingActionButton, buttonTextView, textView, cropImageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.Y2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287155a;
    }
}

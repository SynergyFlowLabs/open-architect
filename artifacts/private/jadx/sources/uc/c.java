package uc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.VideoView;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f381229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f381230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f381231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f381232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final VideoView f381233e;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull VideoView videoView) {
        this.f381229a = constraintLayout;
        this.f381230b = textView;
        this.f381231c = roundedCornersLayout;
        this.f381232d = appCompatTextView;
        this.f381233e = videoView;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = tc.b.i.T0;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = tc.b.i.V1;
            RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
            if (roundedCornersLayout != null) {
                i10 = tc.b.i.X1;
                AppCompatTextView appCompatTextView = (AppCompatTextView) b4.c.a(view, i10);
                if (appCompatTextView != null) {
                    i10 = tc.b.i.f378458db;
                    VideoView videoView = (VideoView) b4.c.a(view, i10);
                    if (videoView != null) {
                        return new c((ConstraintLayout) view, textView, roundedCornersLayout, appCompatTextView, videoView);
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
        View viewInflate = layoutInflater.inflate(tc.b.l.f378839g2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f381229a;
    }
}

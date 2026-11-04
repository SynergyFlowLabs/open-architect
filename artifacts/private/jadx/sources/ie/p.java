package ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.VideoView;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final VideoView f287204b;

    private p(@NonNull ConstraintLayout constraintLayout, @NonNull VideoView videoView) {
        this.f287203a = constraintLayout;
        this.f287204b = videoView;
    }

    @NonNull
    public static p a(@NonNull View view) {
        int i10 = he.b.j.Ny;
        VideoView videoView = (VideoView) b4.c.a(view, i10);
        if (videoView != null) {
            return new p((ConstraintLayout) view, videoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static p c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static p d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.f283797w9, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287203a;
    }
}

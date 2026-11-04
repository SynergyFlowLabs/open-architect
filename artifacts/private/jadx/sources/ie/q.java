package ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.material.card.MaterialCardView;
import com.planner5d.library.widget.CompareImagesView;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final MaterialCardView f287205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f287206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CompareImagesView f287207c;

    private q(@NonNull MaterialCardView materialCardView, @NonNull MaterialCardView materialCardView2, @NonNull CompareImagesView compareImagesView) {
        this.f287205a = materialCardView;
        this.f287206b = materialCardView2;
        this.f287207c = compareImagesView;
    }

    @NonNull
    public static q a(@NonNull View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i10 = he.b.j.f282961ee;
        CompareImagesView compareImagesView = (CompareImagesView) b4.c.a(view, i10);
        if (compareImagesView != null) {
            return new q(materialCardView, materialCardView, compareImagesView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static q c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.N9, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f287205a;
    }
}

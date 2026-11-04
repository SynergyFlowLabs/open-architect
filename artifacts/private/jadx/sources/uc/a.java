package uc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.legal.view.AgreementsVideoView;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final AgreementsVideoView f381219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AgreementsVideoView f381220b;

    private a(@NonNull AgreementsVideoView agreementsVideoView, @NonNull AgreementsVideoView agreementsVideoView2) {
        this.f381219a = agreementsVideoView;
        this.f381220b = agreementsVideoView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AgreementsVideoView agreementsVideoView = (AgreementsVideoView) view;
        return new a(agreementsVideoView, agreementsVideoView);
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(tc.b.l.W, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AgreementsVideoView getRoot() {
        return this.f381219a;
    }
}

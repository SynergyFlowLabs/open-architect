package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.ContestPlaceBadgeView;
import com.planner5d.library.widget.ProfileIconView;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f269886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f269887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ContestPlaceBadgeView f269888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f269890e;

    private s(@NonNull View view, @NonNull ProfileIconView profileIconView, @NonNull ContestPlaceBadgeView contestPlaceBadgeView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f269886a = view;
        this.f269887b = profileIconView;
        this.f269888c = contestPlaceBadgeView;
        this.f269889d = textView;
        this.f269890e = textView2;
    }

    @NonNull
    public static s a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f150940m1;
        ProfileIconView profileIconView = (ProfileIconView) b4.c.a(view, i10);
        if (profileIconView != null) {
            i10 = com.planner5d.library.contest.e.i.f150888i9;
            ContestPlaceBadgeView contestPlaceBadgeView = (ContestPlaceBadgeView) b4.c.a(view, i10);
            if (contestPlaceBadgeView != null) {
                i10 = com.planner5d.library.contest.e.i.f150877hd;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.contest.e.i.f151042sd;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        return new s(view, profileIconView, contestPlaceBadgeView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static s b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.contest.e.l.G2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f269886a;
    }
}

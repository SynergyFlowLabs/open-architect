package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f380940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f380941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TabLayout f380942d;

    private j(@NonNull View view, @NonNull ViewPager2 viewPager2, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull TabLayout tabLayout) {
        this.f380939a = view;
        this.f380940b = viewPager2;
        this.f380941c = roundedCornersLayout;
        this.f380942d = tabLayout;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i10 = c1.i.I1;
        ViewPager2 viewPager2 = (ViewPager2) b4.c.a(view, i10);
        if (viewPager2 != null) {
            i10 = c1.i.J1;
            RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
            if (roundedCornersLayout != null) {
                i10 = c1.i.K1;
                TabLayout tabLayout = (TabLayout) b4.c.a(view, i10);
                if (tabLayout != null) {
                    return new j(view, viewPager2, roundedCornersLayout, tabLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static j b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.Z1, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380939a;
    }
}

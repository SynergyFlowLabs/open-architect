package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.devtodev.core.data.consts.RequestParams;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class r0 extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f51956h = "FragmentStatePagerAdapt";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f51957i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f51958j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f51959k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FragmentManager f51960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t0 f51962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<Fragment.SavedState> f51963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f51964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Fragment f51965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f51966g;

    @Deprecated
    public r0(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f51962c == null) {
            this.f51962c = this.f51960a.w();
        }
        while (this.f51963d.size() <= i10) {
            this.f51963d.add(null);
        }
        this.f51963d.set(i10, fragment.isAdded() ? this.f51960a.V1(fragment) : null);
        this.f51964e.set(i10, null);
        this.f51962c.x(fragment);
        if (fragment.equals(this.f51965f)) {
            this.f51965f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        t0 t0Var = this.f51962c;
        if (t0Var != null) {
            if (!this.f51966g) {
                try {
                    this.f51966g = true;
                    t0Var.p();
                    this.f51966g = false;
                } catch (Throwable th2) {
                    this.f51966g = false;
                    throw th2;
                }
            }
            this.f51962c = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int i10);

    @Override // androidx.viewpager.widget.a
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f51964e.size() > i10 && (fragment = this.f51964e.get(i10)) != null) {
            return fragment;
        }
        if (this.f51962c == null) {
            this.f51962c = this.f51960a.w();
        }
        Fragment item = getItem(i10);
        if (this.f51963d.size() > i10 && (savedState = this.f51963d.get(i10)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.f51964e.size() <= i10) {
            this.f51964e.add(null);
        }
        item.setMenuVisibility(false);
        if (this.f51961b == 0) {
            item.setUserVisibleHint(false);
        }
        this.f51964e.set(i10, item);
        this.f51962c.b(viewGroup.getId(), item);
        if (this.f51961b == 1) {
            this.f51962c.L(item, androidx.lifecycle.c0.b.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f51963d.clear();
            this.f51964e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f51963d.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(RequestParams.F)) {
                    int i10 = Integer.parseInt(str.substring(1));
                    Fragment fragmentJ0 = this.f51960a.J0(bundle, str);
                    if (fragmentJ0 != null) {
                        while (this.f51964e.size() <= i10) {
                            this.f51964e.add(null);
                        }
                        fragmentJ0.setMenuVisibility(false);
                        this.f51964e.set(i10, fragmentJ0);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.p0
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f51963d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f51963d.size()];
            this.f51963d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f51964e.size(); i10++) {
            Fragment fragment = this.f51964e.get(i10);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f51960a.C1(bundle, RequestParams.F + i10, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f51965f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f51961b == 1) {
                    if (this.f51962c == null) {
                        this.f51962c = this.f51960a.w();
                    }
                    this.f51962c.L(this.f51965f, androidx.lifecycle.c0.b.STARTED);
                } else {
                    this.f51965f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f51961b == 1) {
                if (this.f51962c == null) {
                    this.f51962c = this.f51960a.w();
                }
                this.f51962c.L(fragment, androidx.lifecycle.c0.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f51965f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public r0(@NonNull FragmentManager fragmentManager, int i10) {
        this.f51962c = null;
        this.f51963d = new ArrayList<>();
        this.f51964e = new ArrayList<>();
        this.f51965f = null;
        this.f51960a = fragmentManager;
        this.f51961b = i10;
    }
}

package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class n0 extends androidx.viewpager.widget.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private t0 mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;

    @Deprecated
    public n0(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String a(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.w();
        }
        this.mCurTransaction.r(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        t0 t0Var = this.mCurTransaction;
        if (t0Var != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    t0Var.p();
                    this.mExecutingFinishUpdate = false;
                } catch (Throwable th2) {
                    this.mExecutingFinishUpdate = false;
                    throw th2;
                }
            }
            this.mCurTransaction = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int i10);

    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.viewpager.widget.a
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.w();
        }
        long itemId = getItemId(i10);
        Fragment fragmentW0 = this.mFragmentManager.w0(a(viewGroup.getId(), itemId));
        if (fragmentW0 != null) {
            this.mCurTransaction.l(fragmentW0);
        } else {
            fragmentW0 = getItem(i10);
            this.mCurTransaction.c(viewGroup.getId(), fragmentW0, a(viewGroup.getId(), itemId));
        }
        if (fragmentW0 != this.mCurrentPrimaryItem) {
            fragmentW0.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.L(fragmentW0, androidx.lifecycle.c0.b.STARTED);
                return fragmentW0;
            }
            fragmentW0.setUserVisibleHint(false);
        }
        return fragmentW0;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.p0
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.w();
                    }
                    this.mCurTransaction.L(this.mCurrentPrimaryItem, androidx.lifecycle.c0.b.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.w();
                }
                this.mCurTransaction.L(fragment, androidx.lifecycle.c0.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public n0(@NonNull FragmentManager fragmentManager, int i10) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i10;
    }
}

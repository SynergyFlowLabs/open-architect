package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f51744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f51745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f51746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FragmentManager f51747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TabHost.OnTabChangeListener f51749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f51750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f51751h;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f51752a;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f51752a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f51752a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f51752a = parcel.readString();
        }
    }

    static class a implements TabHost.TabContentFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f51753a;

        public a(Context context) {
            this.f51753a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f51753a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final String f51754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        final Class<?> f51755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        final Bundle f51756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Fragment f51757d;

        b(@NonNull String str, @NonNull Class<?> cls, @androidx.annotation.p0 Bundle bundle) {
            this.f51754a = str;
            this.f51755b = cls;
            this.f51756c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context) {
        super(context, null);
        this.f51744a = new ArrayList<>();
        f(context, null);
    }

    @androidx.annotation.p0
    private t0 b(@androidx.annotation.p0 String str, @androidx.annotation.p0 t0 t0Var) {
        Fragment fragment;
        b bVarE = e(str);
        if (this.f51750g != bVarE) {
            if (t0Var == null) {
                t0Var = this.f51747d.w();
            }
            b bVar = this.f51750g;
            if (bVar != null && (fragment = bVar.f51757d) != null) {
                t0Var.r(fragment);
            }
            if (bVarE != null) {
                Fragment fragment2 = bVarE.f51757d;
                if (fragment2 == null) {
                    Fragment fragmentA = this.f51747d.L0().a(this.f51746c.getClassLoader(), bVarE.f51755b.getName());
                    bVarE.f51757d = fragmentA;
                    fragmentA.setArguments(bVarE.f51756c);
                    t0Var.c(this.f51748e, bVarE.f51757d, bVarE.f51754a);
                } else {
                    t0Var.l(fragment2);
                }
            }
            this.f51750g = bVarE;
        }
        return t0Var;
    }

    private void c() {
        if (this.f51745b == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f51748e);
            this.f51745b = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f51748e);
        }
    }

    private void d(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f51745b = frameLayout2;
            frameLayout2.setId(this.f51748e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @androidx.annotation.p0
    private b e(String str) {
        int size = this.f51744a.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f51744a.get(i10);
            if (bVar.f51754a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    private void f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f51748e = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void a(@NonNull TabHost.TabSpec tabSpec, @NonNull Class<?> cls, @androidx.annotation.p0 Bundle bundle) {
        tabSpec.setContent(new a(this.f51746c));
        String tag = tabSpec.getTag();
        b bVar = new b(tag, cls, bundle);
        if (this.f51751h) {
            Fragment fragmentW0 = this.f51747d.w0(tag);
            bVar.f51757d = fragmentW0;
            if (fragmentW0 != null && !fragmentW0.isDetached()) {
                t0 t0VarW = this.f51747d.w();
                t0VarW.r(bVar.f51757d);
                t0VarW.m();
            }
        }
        this.f51744a.add(bVar);
        addTab(tabSpec);
    }

    @Deprecated
    public void g(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.f51746c = context;
        this.f51747d = fragmentManager;
        c();
    }

    @Deprecated
    public void h(@NonNull Context context, @NonNull FragmentManager fragmentManager, int i10) {
        d(context);
        super.setup();
        this.f51746c = context;
        this.f51747d = fragmentManager;
        this.f51748e = i10;
        c();
        this.f51745b.setId(i10);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f51744a.size();
        t0 t0VarW = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f51744a.get(i10);
            Fragment fragmentW0 = this.f51747d.w0(bVar.f51754a);
            bVar.f51757d = fragmentW0;
            if (fragmentW0 != null && !fragmentW0.isDetached()) {
                if (bVar.f51754a.equals(currentTabTag)) {
                    this.f51750g = bVar;
                } else {
                    if (t0VarW == null) {
                        t0VarW = this.f51747d.w();
                    }
                    t0VarW.r(bVar.f51757d);
                }
            }
        }
        this.f51751h = true;
        t0 t0VarB = b(currentTabTag, t0VarW);
        if (t0VarB != null) {
            t0VarB.m();
            this.f51747d.r0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51751h = false;
    }

    @Override // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(@e.a({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f51752a);
    }

    @Override // android.view.View
    @NonNull
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f51752a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@androidx.annotation.p0 String str) {
        t0 t0VarB;
        if (this.f51751h && (t0VarB = b(str, null)) != null) {
            t0VarB.m();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f51749f;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@androidx.annotation.p0 TabHost.OnTabChangeListener onTabChangeListener) {
        this.f51749f = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51744a = new ArrayList<>();
        f(context, attributeSet);
    }
}

package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.n1;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends Fragment implements s.c, s.a, s.b, DialogPreference.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f73079j = "PreferenceFragment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f73080k = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f73081l = "android:preferences";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f73082m = "androidx.preference.PreferenceFragment.DIALOG";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f73083n = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f73085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RecyclerView f73086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f73087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f73088e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f73090g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f73084a = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f73089f = v.h.f73231k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Handler f73091h = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f73092i = new b();

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            m.this.u();
        }
    }

    class b implements Runnable {
        b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = m.this.f73086c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Preference f73095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f73096b;

        c(Preference preference, String str) {
            this.f73095a = preference;
            this.f73096b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.h adapter = m.this.f73086c.getAdapter();
            if (!(adapter instanceof PreferenceGroup.c)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f73095a;
            int iC = preference != null ? ((PreferenceGroup.c) adapter).c(preference) : ((PreferenceGroup.c) adapter).e(this.f73096b);
            if (iC != -1) {
                m.this.f73086c.M1(iC);
            } else {
                adapter.registerAdapterDataObserver(new h(adapter, m.this.f73086c, this.f73095a, this.f73096b));
            }
        }
    }

    private class d extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f73098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f73099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f73100c = true;

        d() {
        }

        private boolean i(View view, RecyclerView recyclerView) {
            RecyclerView.g0 g0VarW0 = recyclerView.w0(view);
            if (!(g0VarW0 instanceof u) || !((u) g0VarW0).j()) {
                return false;
            }
            boolean z10 = this.f73100c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z10;
            }
            RecyclerView.g0 g0VarW1 = recyclerView.w0(recyclerView.getChildAt(iIndexOfChild + 1));
            return (g0VarW1 instanceof u) && ((u) g0VarW1).i();
        }

        public void f(boolean z10) {
            this.f73100c = z10;
        }

        public void g(Drawable drawable) {
            if (drawable != null) {
                this.f73099b = drawable.getIntrinsicHeight();
            } else {
                this.f73099b = 0;
            }
            this.f73098a = drawable;
            m.this.f73086c.O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            if (i(view, recyclerView)) {
                rect.bottom = this.f73099b;
            }
        }

        public void h(int i10) {
            this.f73099b = i10;
            m.this.f73086c.O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            if (this.f73098a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = recyclerView.getChildAt(i10);
                    if (i(childAt, recyclerView)) {
                        int y10 = ((int) childAt.getY()) + childAt.getHeight();
                        this.f73098a.setBounds(0, y10, width, this.f73099b + y10);
                        this.f73098a.draw(canvas);
                    }
                }
            }
        }
    }

    public interface e {
        boolean a(@NonNull m mVar, @NonNull Preference preference);
    }

    public interface f {
        boolean g(@NonNull m mVar, @NonNull Preference preference);
    }

    public interface g {
        boolean a(@NonNull m mVar, @NonNull PreferenceScreen preferenceScreen);
    }

    private static class h extends RecyclerView.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RecyclerView.h<?> f73102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RecyclerView f73103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Preference f73104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f73105d;

        h(RecyclerView.h<?> hVar, RecyclerView recyclerView, Preference preference, String str) {
            this.f73102a = hVar;
            this.f73103b = recyclerView;
            this.f73104c = preference;
            this.f73105d = str;
        }

        private void h() {
            this.f73102a.unregisterAdapterDataObserver(this);
            Preference preference = this.f73104c;
            int iC = preference != null ? ((PreferenceGroup.c) this.f73102a).c(preference) : ((PreferenceGroup.c) this.f73102a).e(this.f73105d);
            if (iC != -1) {
                this.f73103b.M1(iC);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            h();
        }
    }

    private void F() {
        if (this.f73091h.hasMessages(1)) {
            return;
        }
        this.f73091h.obtainMessage(1).sendToTarget();
    }

    private void G() {
        if (this.f73085b == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void J(@p0 Preference preference, @p0 String str) {
        c cVar = new c(preference, str);
        if (this.f73086c == null) {
            this.f73090g = cVar;
        } else {
            cVar.run();
        }
    }

    private void O() {
        w().setAdapter(null);
        PreferenceScreen preferenceScreenY = y();
        if (preferenceScreenY != null) {
            preferenceScreenY.x0();
        }
        E();
    }

    @NonNull
    protected RecyclerView.h A(@NonNull PreferenceScreen preferenceScreen) {
        return new n(preferenceScreen);
    }

    @NonNull
    public RecyclerView.p B() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void C(@p0 Bundle bundle, @p0 String str);

    @NonNull
    public RecyclerView D(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, @p0 Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(v.f.f73214e)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(v.h.f73233m, viewGroup, false);
        recyclerView2.setLayoutManager(B());
        recyclerView2.setAccessibilityDelegateCompat(new t(recyclerView2));
        return recyclerView2;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    protected void E() {
    }

    public void H(@NonNull Preference preference) {
        J(preference, null);
    }

    public void I(@NonNull String str) {
        J(null, str);
    }

    public void K(@p0 Drawable drawable) {
        this.f73084a.g(drawable);
    }

    public void L(int i10) {
        this.f73084a.h(i10);
    }

    public void M(PreferenceScreen preferenceScreen) {
        if (!this.f73085b.C(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        E();
        this.f73087d = true;
        if (this.f73088e) {
            F();
        }
    }

    public void N(@n1 int i10, @p0 String str) {
        Preference preferenceF1;
        G();
        PreferenceScreen preferenceScreenR = this.f73085b.r(requireContext(), i10, null);
        Preference preference = preferenceScreenR;
        if (str != null) {
            preferenceF1 = preferenceScreenR.F1(str);
            if (!(preferenceF1 instanceof PreferenceScreen)) {
                preference = preferenceF1;
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        preference = preferenceF1;
        M((PreferenceScreen) preference);
    }

    @Override // androidx.preference.DialogPreference.a
    @p0
    public <T extends Preference> T e(@NonNull CharSequence charSequence) {
        s sVar = this.f73085b;
        if (sVar == null) {
            return null;
        }
        return (T) sVar.b(charSequence);
    }

    @Override // androidx.preference.s.a
    public void h(@NonNull Preference preference) {
        androidx.fragment.app.m mVarJ;
        boolean zA = v() instanceof e ? ((e) v()).a(this, preference) : false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof e) {
                zA = ((e) parentFragment).a(this, preference);
            }
        }
        if (!zA && (getContext() instanceof e)) {
            zA = ((e) getContext()).a(this, preference);
        }
        if (!zA && (getActivity() instanceof e)) {
            zA = ((e) getActivity()).a(this, preference);
        }
        if (!zA && getParentFragmentManager().w0(f73082m) == null) {
            if (preference instanceof EditTextPreference) {
                mVarJ = androidx.preference.c.K(preference.E());
            } else if (preference instanceof ListPreference) {
                mVarJ = androidx.preference.f.J(preference.E());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                mVarJ = androidx.preference.h.J(preference.E());
            }
            mVarJ.setTargetFragment(this, 0);
            mVarJ.show(getParentFragmentManager(), f73082m);
        }
    }

    @Override // androidx.preference.s.c
    public boolean i(@NonNull Preference preference) {
        if (preference.w() == null) {
            return false;
        }
        boolean zG = v() instanceof f ? ((f) v()).g(this, preference) : false;
        for (Fragment parentFragment = this; !zG && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof f) {
                zG = ((f) parentFragment).g(this, preference);
            }
        }
        if (!zG && (getContext() instanceof f)) {
            zG = ((f) getContext()).g(this, preference);
        }
        if (!zG && (getActivity() instanceof f)) {
            zG = ((f) getActivity()).g(this, preference);
        }
        if (zG) {
            return true;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundleT = preference.t();
        Fragment fragmentA = parentFragmentManager.L0().a(requireActivity().getClassLoader(), preference.w());
        fragmentA.setArguments(bundleT);
        fragmentA.setTargetFragment(this, 0);
        parentFragmentManager.w().y(((View) requireView().getParent()).getId(), fragmentA).k(null).m();
        return true;
    }

    @Override // androidx.preference.s.b
    public void k(@NonNull PreferenceScreen preferenceScreen) {
        boolean zA = v() instanceof g ? ((g) v()).a(this, preferenceScreen) : false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof g) {
                zA = ((g) parentFragment).a(this, preferenceScreen);
            }
        }
        if (!zA && (getContext() instanceof g)) {
            zA = ((g) getContext()).a(this, preferenceScreen);
        }
        if (zA || !(getActivity() instanceof g)) {
            return;
        }
        ((g) getActivity()).a(this, preferenceScreen);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(v.a.R, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = v.j.f73254i;
        }
        requireContext().getTheme().applyStyle(i10, false);
        s sVar = new s(requireContext());
        this.f73085b = sVar;
        sVar.y(this);
        C(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, v.k.A0, v.a.L, 0);
        this.f73089f = typedArrayObtainStyledAttributes.getResourceId(v.k.B0, this.f73089f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(v.k.C0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(v.k.D0, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(v.k.E0, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f73089f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewD = D(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewD == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f73086c = recyclerViewD;
        recyclerViewD.n(this.f73084a);
        K(drawable);
        if (dimensionPixelSize != -1) {
            L(dimensionPixelSize);
        }
        this.f73084a.f(z10);
        if (this.f73086c.getParent() == null) {
            viewGroup2.addView(this.f73086c);
        }
        this.f73091h.post(this.f73092i);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f73091h.removeCallbacks(this.f73092i);
        this.f73091h.removeMessages(1);
        if (this.f73087d) {
            O();
        }
        this.f73086c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenY = y();
        if (preferenceScreenY != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenY.T0(bundle2);
            bundle.putBundle(f73081l, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f73085b.z(this);
        this.f73085b.x(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f73085b.z(null);
        this.f73085b.x(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @p0 Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenY;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(f73081l)) != null && (preferenceScreenY = y()) != null) {
            preferenceScreenY.S0(bundle2);
        }
        if (this.f73087d) {
            u();
            Runnable runnable = this.f73090g;
            if (runnable != null) {
                runnable.run();
                this.f73090g = null;
            }
        }
        this.f73088e = true;
    }

    public void t(@n1 int i10) {
        G();
        M(this.f73085b.r(requireContext(), i10, y()));
    }

    void u() {
        PreferenceScreen preferenceScreenY = y();
        if (preferenceScreenY != null) {
            w().setAdapter(A(preferenceScreenY));
            preferenceScreenY.r0();
        }
        z();
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public Fragment v() {
        return null;
    }

    public final RecyclerView w() {
        return this.f73086c;
    }

    public s x() {
        return this.f73085b;
    }

    public PreferenceScreen y() {
        return this.f73085b.n();
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    protected void z() {
    }
}

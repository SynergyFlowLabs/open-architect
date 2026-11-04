package androidx.preference;

import android.R;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.n1;
import androidx.annotation.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class l extends Fragment implements s.c, s.a, s.b, DialogPreference.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final String f73052k = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f73053l = "android:preferences";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f73054m = "androidx.preference.PreferenceFragment.DIALOG";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f73055n = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f73057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RecyclerView f73058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f73059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f73060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f73061f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Runnable f73063h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f73056a = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73062g = v.h.f73231k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Handler f73064i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f73065j = new b();

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what != 1) {
                return;
            }
            l.this.b();
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
            RecyclerView recyclerView = l.this.f73058c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Preference f73068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f73069b;

        c(Preference preference, String str) {
            this.f73068a = preference;
            this.f73069b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.h adapter = l.this.f73058c.getAdapter();
            if (!(adapter instanceof PreferenceGroup.c)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f73068a;
            int iC = preference != null ? ((PreferenceGroup.c) adapter).c(preference) : ((PreferenceGroup.c) adapter).e(this.f73069b);
            if (iC != -1) {
                l.this.f73058c.M1(iC);
            } else {
                adapter.registerAdapterDataObserver(new h(adapter, l.this.f73058c, this.f73068a, this.f73069b));
            }
        }
    }

    private class d extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f73071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f73072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f73073c = true;

        d() {
        }

        private boolean i(@NonNull View view, @NonNull RecyclerView recyclerView) {
            RecyclerView.g0 g0VarW0 = recyclerView.w0(view);
            if (!(g0VarW0 instanceof u) || !((u) g0VarW0).j()) {
                return false;
            }
            boolean z10 = this.f73073c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z10;
            }
            RecyclerView.g0 g0VarW1 = recyclerView.w0(recyclerView.getChildAt(iIndexOfChild + 1));
            return (g0VarW1 instanceof u) && ((u) g0VarW1).i();
        }

        public void f(boolean z10) {
            this.f73073c = z10;
        }

        public void g(@p0 Drawable drawable) {
            if (drawable != null) {
                this.f73072b = drawable.getIntrinsicHeight();
            } else {
                this.f73072b = 0;
            }
            this.f73071a = drawable;
            l.this.f73058c.O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            if (i(view, recyclerView)) {
                rect.bottom = this.f73072b;
            }
        }

        public void h(int i10) {
            this.f73072b = i10;
            l.this.f73058c.O0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            if (this.f73071a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = recyclerView.getChildAt(i10);
                    if (i(childAt, recyclerView)) {
                        int y10 = ((int) childAt.getY()) + childAt.getHeight();
                        this.f73071a.setBounds(0, y10, width, this.f73072b + y10);
                        this.f73071a.draw(canvas);
                    }
                }
            }
        }
    }

    public interface e {
        boolean a(@NonNull l lVar, @NonNull Preference preference);
    }

    public interface f {
        boolean a(@NonNull l lVar, @NonNull Preference preference);
    }

    public interface g {
        boolean a(@NonNull l lVar, @NonNull PreferenceScreen preferenceScreen);
    }

    private static class h extends RecyclerView.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RecyclerView.h<?> f73075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RecyclerView f73076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Preference f73077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f73078d;

        h(@NonNull RecyclerView.h<?> hVar, @NonNull RecyclerView recyclerView, Preference preference, String str) {
            this.f73075a = hVar;
            this.f73076b = recyclerView;
            this.f73077c = preference;
            this.f73078d = str;
        }

        private void h() {
            this.f73075a.unregisterAdapterDataObserver(this);
            Preference preference = this.f73077c;
            int iC = preference != null ? ((PreferenceGroup.c) this.f73075a).c(preference) : ((PreferenceGroup.c) this.f73075a).e(this.f73078d);
            if (iC != -1) {
                this.f73076b.M1(iC);
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

    private void q() {
        if (this.f73064i.hasMessages(1)) {
            return;
        }
        this.f73064i.obtainMessage(1).sendToTarget();
    }

    private void r() {
        if (this.f73057b == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void u(Preference preference, String str) {
        c cVar = new c(preference, str);
        if (this.f73058c == null) {
            this.f73063h = cVar;
        } else {
            cVar.run();
        }
    }

    private void z() {
        PreferenceScreen preferenceScreenG = g();
        if (preferenceScreenG != null) {
            preferenceScreenG.x0();
        }
        p();
    }

    @Deprecated
    public void a(@n1 int i10) {
        r();
        x(this.f73057b.r(this.f73061f, i10, g()));
    }

    void b() {
        PreferenceScreen preferenceScreenG = g();
        if (preferenceScreenG != null) {
            d().setAdapter(l(preferenceScreenG));
            preferenceScreenG.r0();
        }
        j();
    }

    @b1({b1.a.LIBRARY})
    public Fragment c() {
        return null;
    }

    @Deprecated
    public final RecyclerView d() {
        return this.f73058c;
    }

    @Override // androidx.preference.DialogPreference.a
    @Deprecated
    public <T extends Preference> T e(@NonNull CharSequence charSequence) {
        s sVar = this.f73057b;
        if (sVar == null) {
            return null;
        }
        return (T) sVar.b(charSequence);
    }

    @Deprecated
    public s f() {
        return this.f73057b;
    }

    @Deprecated
    public PreferenceScreen g() {
        return this.f73057b.n();
    }

    @Override // androidx.preference.s.a
    @Deprecated
    public void h(@NonNull Preference preference) {
        DialogFragment dialogFragmentI;
        boolean zA = c() instanceof e ? ((e) c()).a(this, preference) : false;
        if (!zA && (getActivity() instanceof e)) {
            zA = ((e) getActivity()).a(this, preference);
        }
        if (!zA && getFragmentManager().findFragmentByTag(f73054m) == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragmentI = androidx.preference.b.i(preference.E());
            } else if (preference instanceof ListPreference) {
                dialogFragmentI = androidx.preference.e.i(preference.E());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                }
                dialogFragmentI = androidx.preference.g.i(preference.E());
            }
            dialogFragmentI.setTargetFragment(this, 0);
            dialogFragmentI.show(getFragmentManager(), f73054m);
        }
    }

    @Override // androidx.preference.s.c
    @Deprecated
    public boolean i(@NonNull Preference preference) {
        boolean zA = false;
        if (preference.w() != null) {
            zA = c() instanceof f ? ((f) c()).a(this, preference) : false;
            if (!zA && (getActivity() instanceof f)) {
                return ((f) getActivity()).a(this, preference);
            }
        }
        return zA;
    }

    @b1({b1.a.LIBRARY})
    protected void j() {
    }

    @Override // androidx.preference.s.b
    @Deprecated
    public void k(@NonNull PreferenceScreen preferenceScreen) {
        if (!(c() instanceof g ? ((g) c()).a(this, preferenceScreen) : false) && (getActivity() instanceof g)) {
            ((g) getActivity()).a(this, preferenceScreen);
        }
    }

    @NonNull
    @Deprecated
    protected RecyclerView.h l(@NonNull PreferenceScreen preferenceScreen) {
        return new n(preferenceScreen);
    }

    @NonNull
    @Deprecated
    public RecyclerView.p m() {
        return new LinearLayoutManager(getActivity());
    }

    @Deprecated
    public abstract void n(@p0 Bundle bundle, String str);

    @NonNull
    @Deprecated
    public RecyclerView o(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, @p0 Bundle bundle) {
        RecyclerView recyclerView;
        if (this.f73061f.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(v.f.f73214e)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(v.h.f73233m, viewGroup, false);
        recyclerView2.setLayoutManager(m());
        recyclerView2.setAccessibilityDelegateCompat(new t(recyclerView2));
        return recyclerView2;
    }

    @Override // android.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(v.a.R, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = v.j.f73254i;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i10);
        this.f73061f = contextThemeWrapper;
        s sVar = new s(contextThemeWrapper);
        this.f73057b = sVar;
        sVar.y(this);
        n(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // android.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        Context context = this.f73061f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, v.k.f73336v0, androidx.core.content.res.n.a(context, v.a.N, R.attr.preferenceFragmentStyle), 0);
        this.f73062g = typedArrayObtainStyledAttributes.getResourceId(v.k.f73339w0, this.f73062g);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(v.k.f73342x0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(v.k.f73345y0, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(v.k.f73348z0, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f73061f);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f73062g, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewO = o(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewO == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f73058c = recyclerViewO;
        recyclerViewO.n(this.f73056a);
        v(drawable);
        if (dimensionPixelSize != -1) {
            w(dimensionPixelSize);
        }
        this.f73056a.f(z10);
        if (this.f73058c.getParent() == null) {
            viewGroup2.addView(this.f73058c);
        }
        this.f73064i.post(this.f73065j);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f73064i.removeCallbacks(this.f73065j);
        this.f73064i.removeMessages(1);
        if (this.f73059d) {
            z();
        }
        this.f73058c = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenG = g();
        if (preferenceScreenG != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenG.T0(bundle2);
            bundle.putBundle(f73053l, bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f73057b.z(this);
        this.f73057b.x(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f73057b.z(null);
        this.f73057b.x(null);
    }

    @Override // android.app.Fragment
    public void onViewCreated(@NonNull View view, @p0 Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenG;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(f73053l)) != null && (preferenceScreenG = g()) != null) {
            preferenceScreenG.S0(bundle2);
        }
        if (this.f73059d) {
            b();
            Runnable runnable = this.f73063h;
            if (runnable != null) {
                runnable.run();
                int i10 = 4 | 0;
                this.f73063h = null;
            }
        }
        this.f73060e = true;
    }

    @b1({b1.a.LIBRARY})
    protected void p() {
    }

    @Deprecated
    public void s(@NonNull Preference preference) {
        u(preference, null);
    }

    @Deprecated
    public void t(@NonNull String str) {
        u(null, str);
    }

    @Deprecated
    public void v(@p0 Drawable drawable) {
        this.f73056a.g(drawable);
    }

    @Deprecated
    public void w(int i10) {
        this.f73056a.h(i10);
    }

    @Deprecated
    public void x(PreferenceScreen preferenceScreen) {
        if (!this.f73057b.C(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        p();
        this.f73059d = true;
        if (this.f73060e) {
            q();
        }
    }

    @Deprecated
    public void y(@n1 int i10, @p0 String str) {
        Preference preferenceF1;
        r();
        PreferenceScreen preferenceScreenR = this.f73057b.r(this.f73061f, i10, null);
        Preference preference = preferenceScreenR;
        if (str != null) {
            preferenceF1 = preferenceScreenR.F1(str);
            if (!(preferenceF1 instanceof PreferenceScreen)) {
                preference = preferenceF1;
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        preference = preferenceF1;
        x((PreferenceScreen) preference);
    }
}

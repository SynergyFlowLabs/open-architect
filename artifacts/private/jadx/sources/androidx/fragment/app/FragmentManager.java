package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentManager implements p0 {
    private static final String U = "android:support:fragments";
    private static final String V = "state";
    private static final String W = "result_";
    private static final String X = "fragment_";
    private static boolean Y = false;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final String Z = "FragmentManager";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static boolean f51662a0 = true;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f51663b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f51664c0 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    @androidx.annotation.p0
    Fragment A;
    private androidx.activity.result.h<Intent> F;
    private androidx.activity.result.h<IntentSenderRequest> G;
    private androidx.activity.result.h<String[]> H;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private ArrayList<androidx.fragment.app.a> O;
    private ArrayList<Boolean> P;
    private ArrayList<Fragment> Q;
    private l0 R;
    private d2.d.c S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51666b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f51669e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.activity.j0 f51671g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private x<?> f51688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private androidx.fragment.app.u f51689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Fragment f51690z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<q> f51665a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0 f51667c = new s0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f51668d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a0 f51670f = new a0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.fragment.app.a f51672h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f51673i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.activity.i0 f51674j = new b(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f51675k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, BackStackState> f51676l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, Bundle> f51677m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, o> f51678n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList<p> f51679o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final b0 f51680p = new b0(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList<m0> f51681q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final androidx.core.util.e<Configuration> f51682r = new androidx.core.util.e() { // from class: androidx.fragment.app.c0
        @Override // androidx.core.util.e
        public final void accept(Object obj) {
            FragmentManager.j(this.f51789a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.core.util.e<Integer> f51683s = new androidx.core.util.e() { // from class: androidx.fragment.app.d0
        @Override // androidx.core.util.e
        public final void accept(Object obj) {
            FragmentManager.e(this.f51838a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.core.util.e<androidx.core.app.r> f51684t = new androidx.core.util.e() { // from class: androidx.fragment.app.e0
        @Override // androidx.core.util.e
        public final void accept(Object obj) {
            FragmentManager.i(this.f51844a, (androidx.core.app.r) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final androidx.core.util.e<androidx.core.app.k0> f51685u = new androidx.core.util.e() { // from class: androidx.fragment.app.f0
        @Override // androidx.core.util.e
        public final void accept(Object obj) {
            FragmentManager.h(this.f51850a, (androidx.core.app.k0) obj);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final androidx.core.view.r0 f51686v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f51687w = -1;
    private w B = null;
    private w C = new d();
    private g1 D = null;
    private g1 E = new e();
    ArrayDeque<LaunchedFragmentInfo> I = new ArrayDeque<>();
    private Runnable T = new f();

    class a implements androidx.activity.result.a<Map<String, Boolean>> {
        a() {
        }

        @Override // androidx.activity.result.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.I.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollFirst.f51691a;
            int i11 = launchedFragmentInfoPollFirst.f51692b;
            Fragment fragmentI = FragmentManager.this.f51667c.i(str);
            if (fragmentI == null) {
                return;
            }
            fragmentI.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    class b extends androidx.activity.i0 {
        b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.i0
        public void handleOnBackCancelled() {
            if (FragmentManager.b1(3)) {
                boolean z10 = FragmentManager.f51662a0;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.f51662a0) {
                FragmentManager.this.x();
            }
        }

        @Override // androidx.activity.i0
        public void handleOnBackPressed() {
            if (FragmentManager.b1(3)) {
                boolean z10 = FragmentManager.f51662a0;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager.this.X0();
        }

        @Override // androidx.activity.i0
        public void handleOnBackProgressed(@NonNull androidx.activity.d dVar) {
            if (FragmentManager.b1(2)) {
                boolean z10 = FragmentManager.f51662a0;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f51672h != null) {
                int i10 = 2 & 0;
                Iterator<f1> it = fragmentManager.F(new ArrayList<>(Collections.singletonList(FragmentManager.this.f51672h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().A(dVar);
                }
                Iterator<p> it2 = FragmentManager.this.f51679o.iterator();
                while (it2.hasNext()) {
                    it2.next().c(dVar);
                }
            }
        }

        @Override // androidx.activity.i0
        public void handleOnBackStarted(@NonNull androidx.activity.d dVar) {
            if (FragmentManager.b1(3)) {
                boolean z10 = FragmentManager.f51662a0;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.f51662a0) {
                FragmentManager.this.k0();
                FragmentManager.this.B1();
            }
        }
    }

    class c implements androidx.core.view.r0 {
        c() {
        }

        @Override // androidx.core.view.r0
        public void a(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.N(menu, menuInflater);
        }

        @Override // androidx.core.view.r0
        public void b(@NonNull Menu menu) {
            FragmentManager.this.V(menu);
        }

        @Override // androidx.core.view.r0
        public void c(@NonNull Menu menu) {
            FragmentManager.this.Z(menu);
        }

        @Override // androidx.core.view.r0
        public boolean d(@NonNull MenuItem menuItem) {
            return FragmentManager.this.U(menuItem);
        }
    }

    class d extends w {
        d() {
        }

        @Override // androidx.fragment.app.w
        @NonNull
        public Fragment a(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.O0().b(FragmentManager.this.O0().f(), str, null);
        }
    }

    class e implements g1 {
        e() {
        }

        @Override // androidx.fragment.app.g1
        @NonNull
        public f1 a(@NonNull ViewGroup viewGroup) {
            return new androidx.fragment.app.d(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.n0(true);
        }
    }

    class g implements androidx.lifecycle.j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f51699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f51700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.c0 f51701c;

        g(String str, o0 o0Var, androidx.lifecycle.c0 c0Var) {
            this.f51699a = str;
            this.f51700b = o0Var;
            this.f51701c = c0Var;
        }

        @Override // androidx.lifecycle.j0
        public void e(@NonNull androidx.lifecycle.o0 o0Var, @NonNull androidx.lifecycle.c0.a aVar) {
            Bundle bundle;
            if (aVar == androidx.lifecycle.c0.a.ON_START && (bundle = (Bundle) FragmentManager.this.f51677m.get(this.f51699a)) != null) {
                this.f51700b.a(this.f51699a, bundle);
                FragmentManager.this.d(this.f51699a);
            }
            if (aVar == androidx.lifecycle.c0.a.ON_DESTROY) {
                this.f51701c.g(this);
                FragmentManager.this.f51678n.remove(this.f51699a);
            }
        }
    }

    class h implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f51703a;

        h(Fragment fragment) {
            this.f51703a = fragment;
        }

        @Override // androidx.fragment.app.m0
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            this.f51703a.onAttachFragment(fragment);
        }
    }

    class i implements androidx.activity.result.a<ActivityResult> {
        i() {
        }

        @Override // androidx.activity.result.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollLast = FragmentManager.this.I.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollLast.f51691a;
            int i10 = launchedFragmentInfoPollLast.f51692b;
            Fragment fragmentI = FragmentManager.this.f51667c.i(str);
            if (fragmentI == null) {
                return;
            }
            fragmentI.onActivityResult(i10, activityResult.b(), activityResult.a());
        }
    }

    class j implements androidx.activity.result.a<ActivityResult> {
        j() {
        }

        @Override // androidx.activity.result.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.I.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollFirst.f51691a;
            int i10 = launchedFragmentInfoPollFirst.f51692b;
            Fragment fragmentI = FragmentManager.this.f51667c.i(str);
            if (fragmentI == null) {
                return;
            }
            fragmentI.onActivityResult(i10, activityResult.b(), activityResult.a());
        }
    }

    public interface k {
        @androidx.annotation.p0
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @androidx.annotation.f1
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @androidx.annotation.p0
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @androidx.annotation.f1
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @androidx.annotation.p0
        String getName();
    }

    private class l implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f51707a;

        l(String str) {
            this.f51707a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.C(arrayList, arrayList2, this.f51707a);
        }
    }

    static class m extends g.a<IntentSenderRequest, ActivityResult> {
        m() {
        }

        @Override // g.a
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(g.b.n.f275350b);
            Intent intentA = intentSenderRequest.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra(g.b.m.f275348b)) != null) {
                intent.putExtra(g.b.m.f275348b, bundleExtra);
                intentA.removeExtra(g.b.m.f275348b);
                if (intentA.getBooleanExtra(FragmentManager.f51664c0, false)) {
                    int i10 = 5 << 0;
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.e()).b(null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra(g.b.n.f275351c, intentSenderRequest);
            if (FragmentManager.b1(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // g.a
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i10, @androidx.annotation.p0 Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static abstract class n {
        @Deprecated
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @androidx.annotation.p0 Bundle bundle) {
        }

        public void b(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void c(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @androidx.annotation.p0 Bundle bundle) {
        }

        public void d(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void e(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void f(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void g(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void h(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @androidx.annotation.p0 Bundle bundle) {
        }

        public void i(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void j(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void k(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void l(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void m(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @androidx.annotation.p0 Bundle bundle) {
        }

        public void n(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    private static class o implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.c0 f51709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f51710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.lifecycle.j0 f51711c;

        o(@NonNull androidx.lifecycle.c0 c0Var, @NonNull o0 o0Var, @NonNull androidx.lifecycle.j0 j0Var) {
            this.f51709a = c0Var;
            this.f51710b = o0Var;
            this.f51711c = j0Var;
        }

        @Override // androidx.fragment.app.o0
        public void a(@NonNull String str, @NonNull Bundle bundle) {
            this.f51710b.a(str, bundle);
        }

        public boolean b(androidx.lifecycle.c0.b bVar) {
            return this.f51709a.d().n(bVar);
        }

        public void c() {
            this.f51709a.g(this.f51711c);
        }
    }

    public interface p {
        @androidx.annotation.l0
        default void a(@NonNull Fragment fragment, boolean z10) {
        }

        @androidx.annotation.l0
        default void b() {
        }

        @androidx.annotation.l0
        default void c(@NonNull androidx.activity.d dVar) {
        }

        @androidx.annotation.l0
        default void d(@NonNull Fragment fragment, boolean z10) {
        }

        @androidx.annotation.l0
        void onBackStackChanged();
    }

    interface q {
        boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    private class r implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f51712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f51713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f51714c;

        r(String str, int i10, int i11) {
            this.f51712a = str;
            this.f51713b = i10;
            this.f51714c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.A;
            if (fragment == null || this.f51713b >= 0 || this.f51712a != null || !fragment.getChildFragmentManager().v1()) {
                return FragmentManager.this.z1(arrayList, arrayList2, this.f51712a, this.f51713b, this.f51714c);
            }
            return false;
        }
    }

    class s implements q {
        s() {
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            boolean zA1 = FragmentManager.this.A1(arrayList, arrayList2);
            if (!FragmentManager.this.f51679o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<androidx.fragment.app.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.B0(it.next()));
                }
                for (p pVar : FragmentManager.this.f51679o) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        pVar.a((Fragment) it2.next(), zBooleanValue);
                    }
                }
            }
            return zA1;
        }
    }

    private class t implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f51717a;

        t(String str) {
            this.f51717a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.M1(arrayList, arrayList2, this.f51717a);
        }
    }

    private class u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f51719a;

        u(String str) {
            this.f51719a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.U1(arrayList, arrayList2, this.f51719a);
        }
    }

    private void A() {
        this.f51666b = false;
        this.P.clear();
        this.O.clear();
    }

    private void A0() {
        Iterator<f1> it = E().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    private boolean C0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.f51665a) {
            if (this.f51665a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f51665a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= this.f51665a.get(i10).a(arrayList, arrayList2);
                }
                this.f51665a.clear();
                this.f51688x.h().removeCallbacks(this.T);
                return zA;
            } catch (Throwable th2) {
                this.f51665a.clear();
                this.f51688x.h().removeCallbacks(this.T);
                throw th2;
            }
        }
    }

    private void D() {
        boolean zF0;
        x<?> xVar = this.f51688x;
        if (xVar instanceof m2) {
            zF0 = this.f51667c.q().f0();
        } else {
            zF0 = xVar.f() instanceof Activity ? !((Activity) this.f51688x.f()).isChangingConfigurations() : true;
        }
        if (zF0) {
            Iterator<BackStackState> it = this.f51676l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f51614a.iterator();
                while (it2.hasNext()) {
                    this.f51667c.q().W(it2.next(), false);
                }
            }
        }
    }

    private Set<f1> E() {
        HashSet hashSet = new HashSet();
        Iterator<q0> it = this.f51667c.l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(f1.v(viewGroup, T0()));
            }
        }
        return hashSet;
    }

    @NonNull
    private l0 H0(@NonNull Fragment fragment) {
        return this.R.Z(fragment);
    }

    private void H1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f52004r) {
                if (i11 != i10) {
                    q0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f52004r) {
                        i11++;
                    }
                }
                q0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            q0(arrayList, arrayList2, i11, size);
        }
    }

    private void J1() {
        for (int i10 = 0; i10 < this.f51679o.size(); i10++) {
            this.f51679o.get(i10).onBackStackChanged();
        }
    }

    private ViewGroup K0(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0) {
            return null;
        }
        if (this.f51689y.d()) {
            View viewC = this.f51689y.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    static int Q1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return t0.I;
        }
        if (i10 == 8197) {
            return t0.L;
        }
        if (i10 == 4099) {
            return t0.K;
        }
        if (i10 != 4100) {
            return 0;
        }
        return t0.M;
    }

    @androidx.annotation.p0
    static Fragment V0(@NonNull View view) {
        Object tag = view.getTag(c2.a.c.f82385a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void W(@androidx.annotation.p0 Fragment fragment) {
        if (fragment == null || !fragment.equals(s0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static boolean b1(int i10) {
        return Y || Log.isLoggable(Z, i10);
    }

    private boolean c1(@NonNull Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.y();
    }

    private void d0(int i10) {
        try {
            this.f51666b = true;
            this.f51667c.d(i10);
            m1(i10, false);
            Iterator<f1> it = E().iterator();
            while (it.hasNext()) {
                it.next().q();
            }
            this.f51666b = false;
            n0(true);
        } catch (Throwable th2) {
            this.f51666b = false;
            throw th2;
        }
    }

    private boolean d1() {
        Fragment fragment = this.f51690z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f51690z.getParentFragmentManager().d1();
    }

    private void d2(@NonNull Fragment fragment) {
        ViewGroup viewGroupK0 = K0(fragment);
        if (viewGroupK0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupK0.getTag(c2.a.c.f82387c) == null) {
            viewGroupK0.setTag(c2.a.c.f82387c, fragment);
        }
        ((Fragment) viewGroupK0.getTag(c2.a.c.f82387c)).setPopDirection(fragment.getPopDirection());
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.d1() && num.intValue() == 80) {
            fragmentManager.Q(false);
        }
    }

    private void f2() {
        Iterator<q0> it = this.f51667c.l().iterator();
        while (it.hasNext()) {
            q1(it.next());
        }
    }

    public static /* synthetic */ void g(FragmentManager fragmentManager) {
        Iterator<p> it = fragmentManager.f51679o.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void g0() {
        if (this.N) {
            this.N = false;
            f2();
        }
    }

    private void g2(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new b1(Z));
        x<?> xVar = this.f51688x;
        int i10 = 4 ^ 0;
        try {
            if (xVar != null) {
                xVar.i("  ", null, printWriter, new String[0]);
            } else {
                h0("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public static /* synthetic */ void h(FragmentManager fragmentManager, androidx.core.app.k0 k0Var) {
        if (fragmentManager.d1()) {
            fragmentManager.Y(k0Var.b(), false);
        }
    }

    public static /* synthetic */ void i(FragmentManager fragmentManager, androidx.core.app.r rVar) {
        if (fragmentManager.d1()) {
            fragmentManager.R(rVar.b(), false);
        }
    }

    @Deprecated
    public static void i0(boolean z10) {
        Y = z10;
    }

    private void i2() {
        synchronized (this.f51665a) {
            try {
                if (!this.f51665a.isEmpty()) {
                    this.f51674j.setEnabled(true);
                    if (b1(3)) {
                        toString();
                    }
                } else {
                    boolean z10 = G0() > 0 && g1(this.f51690z);
                    if (b1(3)) {
                        toString();
                    }
                    this.f51674j.setEnabled(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void j(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.d1()) {
            fragmentManager.K(configuration, false);
        }
    }

    @c1
    public static void j0(boolean z10) {
        f51662a0 = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0() {
        Iterator<f1> it = E().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    private void m0(boolean z10) {
        if (this.f51666b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f51688x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f51688x.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            z();
        }
        if (this.O == null) {
            this.O = new ArrayList<>();
            this.P = new ArrayList<>();
        }
    }

    private static void p0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                int i12 = 6 ^ (-1);
                aVar.R(-1);
                aVar.X();
            } else {
                aVar.R(1);
                aVar.W();
            }
            i10++;
        }
    }

    private void q0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f52004r;
        ArrayList<Fragment> arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.f51667c.p());
        Fragment fragmentS0 = S0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            fragmentS0 = !arrayList2.get(i12).booleanValue() ? aVar.Y(this.Q, fragmentS0) : aVar.a0(this.Q, fragmentS0);
            z11 = z11 || aVar.f51995i;
        }
        this.Q.clear();
        if (!z10 && this.f51687w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<t0.a> it = arrayList.get(i13).f51989c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f52007b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f51667c.s(G(fragment));
                    }
                }
            }
        }
        p0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && !this.f51679o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(B0(it2.next()));
            }
            if (this.f51672h == null) {
                for (p pVar : this.f51679o) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        pVar.a((Fragment) it3.next(), zBooleanValue);
                    }
                }
                for (p pVar2 : this.f51679o) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        pVar2.d((Fragment) it4.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = aVar2.f51989c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f51989c.get(size).f52007b;
                    if (fragment2 != null) {
                        G(fragment2).m();
                    }
                }
            } else {
                Iterator<t0.a> it5 = aVar2.f51989c.iterator();
                while (it5.hasNext()) {
                    Fragment fragment3 = it5.next().f52007b;
                    if (fragment3 != null) {
                        G(fragment3).m();
                    }
                }
            }
        }
        m1(this.f51687w, true);
        for (f1 f1Var : F(arrayList, i10, i11)) {
            f1Var.D(zBooleanValue);
            f1Var.z();
            f1Var.n();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar3.P >= 0) {
                aVar3.P = -1;
            }
            aVar3.Z();
            i10++;
        }
        if (z11) {
            J1();
        }
    }

    private int t0(@androidx.annotation.p0 String str, int i10, boolean z10) {
        int i11 = 7 ^ (-1);
        if (this.f51668d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f51668d.size() - 1;
        }
        int size = this.f51668d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            androidx.fragment.app.a aVar = this.f51668d.get(size);
            if ((str != null && str.equals(aVar.getName())) || (i10 >= 0 && i10 == aVar.P)) {
                break;
                break;
            }
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f51668d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f51668d.get(size - 1);
            if ((str == null || !str.equals(aVar2.getName())) && (i10 < 0 || i10 != aVar2.P)) {
                break;
            }
            size--;
        }
        return size;
    }

    @NonNull
    public static <F extends Fragment> F u0(@NonNull View view) {
        F f10 = (F) z0(view);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @NonNull
    public static FragmentManager y0(@NonNull View view) {
        androidx.fragment.app.s sVar;
        Fragment fragmentZ0 = z0(view);
        if (fragmentZ0 != null) {
            if (fragmentZ0.isAdded()) {
                return fragmentZ0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentZ0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                sVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.s) {
                sVar = (androidx.fragment.app.s) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (sVar != null) {
            return sVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private boolean y1(@androidx.annotation.p0 String str, int i10, int i11) {
        n0(false);
        m0(true);
        Fragment fragment = this.A;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().v1()) {
            return true;
        }
        boolean zZ1 = z1(this.O, this.P, str, i10, i11);
        if (zZ1) {
            this.f51666b = true;
            try {
                H1(this.O, this.P);
                A();
            } catch (Throwable th2) {
                A();
                throw th2;
            }
        }
        i2();
        g0();
        this.f51667c.b();
        return zZ1;
    }

    private void z() {
        if (i1()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    @androidx.annotation.p0
    static Fragment z0(@NonNull View view) {
        while (view != null) {
            Fragment fragmentV0 = V0(view);
            if (fragmentV0 != null) {
                return fragmentV0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    boolean A1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (b1(2)) {
            Objects.toString(this.f51665a);
        }
        if (this.f51668d.isEmpty()) {
            return false;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f51668d;
        androidx.fragment.app.a aVar = arrayList3.get(arrayList3.size() - 1);
        this.f51672h = aVar;
        Iterator<t0.a> it = aVar.f51989c.iterator();
        while (it.hasNext()) {
            Fragment fragment = it.next().f52007b;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return z1(arrayList, arrayList2, null, -1, 0);
    }

    public void B(@NonNull String str) {
        l0(new l(str), false);
    }

    Set<Fragment> B0(@NonNull androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f51989c.size(); i10++) {
            Fragment fragment = aVar.f51989c.get(i10).f52007b;
            if (fragment != null && aVar.f51995i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    void B1() {
        l0(new s(), false);
    }

    boolean C(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        if (M1(arrayList, arrayList2, str)) {
            return z1(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }

    public void C1(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            g2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    int D0() {
        return this.f51667c.k();
    }

    public void D1(@NonNull n nVar, boolean z10) {
        this.f51680p.o(nVar, z10);
    }

    @NonNull
    List<Fragment> E0() {
        return this.f51667c.m();
    }

    void E1(@NonNull Fragment fragment) {
        if (b1(2)) {
            Objects.toString(fragment);
            int i10 = fragment.mBackStackNesting;
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f51667c.v(fragment);
        if (c1(fragment)) {
            this.J = true;
        }
        fragment.mRemoving = true;
        d2(fragment);
    }

    Set<f1> F(@NonNull ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<t0.a> it = arrayList.get(i10).f51989c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f52007b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(f1.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    @NonNull
    public k F0(int i10) {
        if (i10 != this.f51668d.size()) {
            return this.f51668d.get(i10);
        }
        androidx.fragment.app.a aVar = this.f51672h;
        if (aVar != null) {
            return aVar;
        }
        throw new IndexOutOfBoundsException();
    }

    public void F1(@NonNull m0 m0Var) {
        this.f51681q.remove(m0Var);
    }

    @NonNull
    q0 G(@NonNull Fragment fragment) {
        q0 q0VarO = this.f51667c.o(fragment.mWho);
        if (q0VarO != null) {
            return q0VarO;
        }
        q0 q0Var = new q0(this.f51680p, this.f51667c, fragment);
        q0Var.o(this.f51688x.f().getClassLoader());
        q0Var.t(this.f51687w);
        return q0Var;
    }

    public int G0() {
        return this.f51668d.size() + (this.f51672h != null ? 1 : 0);
    }

    public void G1(@NonNull p pVar) {
        this.f51679o.remove(pVar);
    }

    void H(@NonNull Fragment fragment) {
        if (b1(2)) {
            Objects.toString(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (b1(2)) {
                    fragment.toString();
                }
                this.f51667c.v(fragment);
                if (c1(fragment)) {
                    this.J = true;
                }
                d2(fragment);
            }
        }
    }

    void I() {
        this.K = false;
        this.L = false;
        this.R.i0(false);
        d0(4);
    }

    @NonNull
    androidx.fragment.app.u I0() {
        return this.f51689y;
    }

    void I1(@NonNull Fragment fragment) {
        this.R.g0(fragment);
    }

    void J() {
        this.K = false;
        this.L = false;
        this.R.i0(false);
        d0(0);
    }

    @androidx.annotation.p0
    public Fragment J0(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentS0 = s0(string);
        if (fragmentS0 == null) {
            g2(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentS0;
    }

    void K(@NonNull Configuration configuration, boolean z10) {
        if (z10 && (this.f51688x instanceof androidx.core.content.e0)) {
            g2(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f51667c.p()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.K(configuration, true);
                }
            }
        }
    }

    void K1(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 k0 k0Var) {
        if (this.f51688x instanceof m2) {
            g2(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.R.h0(k0Var);
        O1(parcelable);
    }

    boolean L(@NonNull MenuItem menuItem) {
        if (this.f51687w < 1) {
            return false;
        }
        for (Fragment fragment : this.f51667c.p()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public w L0() {
        w wVar = this.B;
        if (wVar != null) {
            return wVar;
        }
        Fragment fragment = this.f51690z;
        return fragment != null ? fragment.mFragmentManager.L0() : this.C;
    }

    public void L1(@NonNull String str) {
        l0(new t(str), false);
    }

    void M() {
        this.K = false;
        this.L = false;
        this.R.i0(false);
        d0(1);
    }

    @NonNull
    s0 M0() {
        return this.f51667c;
    }

    boolean M1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        BackStackState backStackStateRemove = this.f51676l.remove(str);
        if (backStackStateRemove == null) {
            return false;
        }
        HashMap map = new HashMap();
        for (androidx.fragment.app.a aVar : arrayList) {
            if (aVar.Q) {
                Iterator<t0.a> it = aVar.f51989c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f52007b;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<androidx.fragment.app.a> it2 = backStackStateRemove.a(this, map).iterator();
        while (true) {
            boolean z10 = false;
            while (it2.hasNext()) {
                if (it2.next().a(arrayList, arrayList2) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    boolean N(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f51687w < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f51667c.p()) {
            if (fragment != null && f1(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f51669e != null) {
            for (int i10 = 0; i10 < this.f51669e.size(); i10++) {
                Fragment fragment2 = this.f51669e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f51669e = arrayList;
        return z10;
    }

    @NonNull
    public List<Fragment> N0() {
        return this.f51667c.p();
    }

    void N1(@androidx.annotation.p0 Parcelable parcelable) {
        if (this.f51688x instanceof androidx.savedstate.m) {
            g2(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        O1(parcelable);
    }

    void O() {
        this.M = true;
        n0(true);
        k0();
        D();
        d0(-1);
        Object obj = this.f51688x;
        if (obj instanceof androidx.core.content.f0) {
            ((androidx.core.content.f0) obj).removeOnTrimMemoryListener(this.f51683s);
        }
        Object obj2 = this.f51688x;
        if (obj2 instanceof androidx.core.content.e0) {
            ((androidx.core.content.e0) obj2).removeOnConfigurationChangedListener(this.f51682r);
        }
        Object obj3 = this.f51688x;
        if (obj3 instanceof androidx.core.app.d0) {
            ((androidx.core.app.d0) obj3).removeOnMultiWindowModeChangedListener(this.f51684t);
        }
        Object obj4 = this.f51688x;
        if (obj4 instanceof androidx.core.app.f0) {
            ((androidx.core.app.f0) obj4).removeOnPictureInPictureModeChangedListener(this.f51685u);
        }
        Object obj5 = this.f51688x;
        if ((obj5 instanceof androidx.core.view.l0) && this.f51690z == null) {
            ((androidx.core.view.l0) obj5).removeMenuProvider(this.f51686v);
        }
        this.f51688x = null;
        this.f51689y = null;
        this.f51690z = null;
        if (this.f51671g != null) {
            this.f51674j.remove();
            this.f51671g = null;
        }
        androidx.activity.result.h<Intent> hVar = this.F;
        if (hVar != null) {
            hVar.d();
            this.G.d();
            this.H.d();
        }
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public x<?> O0() {
        return this.f51688x;
    }

    void O1(@androidx.annotation.p0 Parcelable parcelable) {
        q0 q0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith(W) && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f51688x.f().getClassLoader());
                this.f51677m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith(X) && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f51688x.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f51667c.y(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f51667c.w();
        Iterator<String> it = fragmentManagerState.f51721a.iterator();
        while (it.hasNext()) {
            Bundle bundleC = this.f51667c.C(it.next(), null);
            if (bundleC != null) {
                Fragment fragmentY = this.R.Y(((FragmentState) bundleC.getParcelable("state")).f51730b);
                if (fragmentY != null) {
                    if (b1(2)) {
                        fragmentY.toString();
                    }
                    q0Var = new q0(this.f51680p, this.f51667c, fragmentY, bundleC);
                } else {
                    q0Var = new q0(this.f51680p, this.f51667c, this.f51688x.f().getClassLoader(), L0(), bundleC);
                }
                Fragment fragmentK = q0Var.k();
                fragmentK.mSavedFragmentState = bundleC;
                fragmentK.mFragmentManager = this;
                if (b1(2)) {
                    fragmentK.toString();
                }
                q0Var.o(this.f51688x.f().getClassLoader());
                this.f51667c.s(q0Var);
                q0Var.t(this.f51687w);
            }
        }
        for (Fragment fragment : this.R.b0()) {
            if (!this.f51667c.c(fragment.mWho)) {
                if (b1(2)) {
                    fragment.toString();
                    Objects.toString(fragmentManagerState.f51721a);
                }
                this.R.g0(fragment);
                fragment.mFragmentManager = this;
                q0 q0Var2 = new q0(this.f51680p, this.f51667c, fragment);
                q0Var2.t(1);
                q0Var2.m();
                fragment.mRemoving = true;
                q0Var2.m();
            }
        }
        this.f51667c.x(fragmentManagerState.f51722b);
        if (fragmentManagerState.f51723c != null) {
            this.f51668d = new ArrayList<>(fragmentManagerState.f51723c.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f51723c;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarB = backStackRecordStateArr[i10].b(this);
                if (b1(2)) {
                    int i11 = aVarB.P;
                    aVarB.toString();
                    PrintWriter printWriter = new PrintWriter(new b1(Z));
                    aVarB.V("  ", printWriter, false);
                    printWriter.close();
                }
                this.f51668d.add(aVarB);
                i10++;
            }
        } else {
            this.f51668d = new ArrayList<>();
        }
        this.f51675k.set(fragmentManagerState.f51724d);
        String str3 = fragmentManagerState.f51725e;
        if (str3 != null) {
            Fragment fragmentS0 = s0(str3);
            this.A = fragmentS0;
            W(fragmentS0);
        }
        ArrayList<String> arrayList = fragmentManagerState.f51726f;
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                this.f51676l.put(arrayList.get(i12), fragmentManagerState.f51727g.get(i12));
            }
        }
        this.I = new ArrayDeque<>(fragmentManagerState.f51728h);
    }

    void P() {
        d0(1);
    }

    @NonNull
    LayoutInflater.Factory2 P0() {
        return this.f51670f;
    }

    @Deprecated
    k0 P1() {
        if (this.f51688x instanceof m2) {
            g2(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.R.c0();
    }

    void Q(boolean z10) {
        if (z10 && (this.f51688x instanceof androidx.core.content.f0)) {
            g2(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f51667c.p()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    int i10 = 6 | 1;
                    fragment.mChildFragmentManager.Q(true);
                }
            }
        }
    }

    @NonNull
    b0 Q0() {
        return this.f51680p;
    }

    void R(boolean z10, boolean z11) {
        if (z11 && (this.f51688x instanceof androidx.core.app.d0)) {
            g2(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f51667c.p()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.R(z10, true);
                }
            }
        }
    }

    @androidx.annotation.p0
    Fragment R0() {
        return this.f51690z;
    }

    Parcelable R1() {
        if (this.f51688x instanceof androidx.savedstate.m) {
            g2(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle bundleS1 = S1();
        if (bundleS1.isEmpty()) {
            bundleS1 = null;
        }
        return bundleS1;
    }

    void S(@NonNull Fragment fragment) {
        Iterator<m0> it = this.f51681q.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    @androidx.annotation.p0
    public Fragment S0() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Bundle S1() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        A0();
        k0();
        n0(true);
        this.K = true;
        this.R.i0(true);
        ArrayList<String> arrayListZ = this.f51667c.z();
        HashMap<String, Bundle> mapN = this.f51667c.n();
        if (mapN.isEmpty()) {
            b1(2);
            return bundle;
        }
        ArrayList<String> arrayListA = this.f51667c.A();
        int size = this.f51668d.size();
        if (size > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i10 = 0; i10 < size; i10++) {
                backStackRecordStateArr[i10] = new BackStackRecordState(this.f51668d.get(i10));
                if (b1(2)) {
                    Objects.toString(this.f51668d.get(i10));
                }
            }
        } else {
            backStackRecordStateArr = null;
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f51721a = arrayListZ;
        fragmentManagerState.f51722b = arrayListA;
        fragmentManagerState.f51723c = backStackRecordStateArr;
        fragmentManagerState.f51724d = this.f51675k.get();
        Fragment fragment = this.A;
        if (fragment != null) {
            fragmentManagerState.f51725e = fragment.mWho;
        }
        fragmentManagerState.f51726f.addAll(this.f51676l.keySet());
        fragmentManagerState.f51727g.addAll(this.f51676l.values());
        fragmentManagerState.f51728h = new ArrayList<>(this.I);
        bundle.putParcelable("state", fragmentManagerState);
        for (String str : this.f51677m.keySet()) {
            bundle.putBundle(W + str, this.f51677m.get(str));
        }
        for (String str2 : mapN.keySet()) {
            bundle.putBundle(X + str2, mapN.get(str2));
        }
        return bundle;
    }

    void T() {
        for (Fragment fragment : this.f51667c.m()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.T();
            }
        }
    }

    @NonNull
    g1 T0() {
        g1 g1Var = this.D;
        if (g1Var != null) {
            return g1Var;
        }
        Fragment fragment = this.f51690z;
        return fragment != null ? fragment.mFragmentManager.T0() : this.E;
    }

    public void T1(@NonNull String str) {
        l0(new u(str), false);
    }

    boolean U(@NonNull MenuItem menuItem) {
        if (this.f51687w < 1) {
            return false;
        }
        for (Fragment fragment : this.f51667c.p()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.p0
    public d2.d.c U0() {
        return this.S;
    }

    boolean U1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        int i10;
        int iT0 = t0(str, -1, true);
        if (iT0 < 0) {
            return false;
        }
        for (int i11 = iT0; i11 < this.f51668d.size(); i11++) {
            androidx.fragment.app.a aVar = this.f51668d.get(i11);
            if (!aVar.f52004r) {
                g2(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i12 = iT0; i12 < this.f51668d.size(); i12++) {
            androidx.fragment.app.a aVar2 = this.f51668d.get(i12);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (t0.a aVar3 : aVar2.f51989c) {
                Fragment fragment = aVar3.f52007b;
                if (fragment != null) {
                    if (!aVar3.f52008c || (i10 = aVar3.f52006a) == 1 || i10 == 2 || i10 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i13 = aVar3.f52006a;
                    if (i13 == 1 || i13 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb2.append(" in ");
                sb2.append(aVar2);
                sb2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                g2(new IllegalArgumentException(sb2.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str);
                sb3.append("\") must not contain retained fragments. Found ");
                sb3.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb3.append("fragment ");
                sb3.append(fragment2);
                g2(new IllegalArgumentException(sb3.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.E0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Fragment) it.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f51668d.size() - iT0);
        for (int i14 = iT0; i14 < this.f51668d.size(); i14++) {
            arrayList4.add(null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f51668d.size() - 1; size >= iT0; size--) {
            androidx.fragment.app.a aVarRemove = this.f51668d.remove(size);
            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(aVarRemove);
            aVar4.S();
            arrayList4.set(size - iT0, new BackStackRecordState(aVar4));
            aVarRemove.Q = true;
            arrayList.add(aVarRemove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f51676l.put(str, backStackState);
        return true;
    }

    void V(@NonNull Menu menu) {
        if (this.f51687w < 1) {
            return;
        }
        for (Fragment fragment : this.f51667c.p()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    @androidx.annotation.p0
    public Fragment.SavedState V1(@NonNull Fragment fragment) {
        q0 q0VarO = this.f51667c.o(fragment.mWho);
        if (q0VarO == null || !q0VarO.k().equals(fragment)) {
            g2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return q0VarO.q();
    }

    @NonNull
    l2 W0(@NonNull Fragment fragment) {
        return this.R.d0(fragment);
    }

    void W1() {
        synchronized (this.f51665a) {
            try {
                if (this.f51665a.size() == 1) {
                    this.f51688x.h().removeCallbacks(this.T);
                    this.f51688x.h().post(this.T);
                    i2();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void X() {
        d0(5);
    }

    void X0() {
        this.f51673i = true;
        n0(true);
        this.f51673i = false;
        if (!f51662a0 || this.f51672h == null) {
            if (this.f51674j.isEnabled()) {
                b1(3);
                v1();
                return;
            } else {
                b1(3);
                this.f51671g.p();
                return;
            }
        }
        if (!this.f51679o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(B0(this.f51672h));
            for (p pVar : this.f51679o) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    pVar.d((Fragment) it.next(), true);
                }
            }
        }
        Iterator<t0.a> it2 = this.f51672h.f51989c.iterator();
        while (it2.hasNext()) {
            Fragment fragment = it2.next().f52007b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator<f1> it3 = F(new ArrayList<>(Collections.singletonList(this.f51672h)), 0, 1).iterator();
        while (it3.hasNext()) {
            it3.next().f();
        }
        Iterator<t0.a> it4 = this.f51672h.f51989c.iterator();
        while (it4.hasNext()) {
            Fragment fragment2 = it4.next().f52007b;
            if (fragment2 != null && fragment2.mContainer == null) {
                G(fragment2).m();
            }
        }
        this.f51672h = null;
        i2();
        if (b1(3)) {
            this.f51674j.isEnabled();
            toString();
        }
    }

    void X1(@NonNull Fragment fragment, boolean z10) {
        ViewGroup viewGroupK0 = K0(fragment);
        if (viewGroupK0 == null || !(viewGroupK0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupK0).setDrawDisappearingViewsLast(!z10);
    }

    void Y(boolean z10, boolean z11) {
        if (z11 && (this.f51688x instanceof androidx.core.app.f0)) {
            g2(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f51667c.p()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.Y(z10, true);
                }
            }
        }
    }

    void Y0(@NonNull Fragment fragment) {
        if (b1(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        d2(fragment);
    }

    public void Y1(@NonNull w wVar) {
        this.B = wVar;
    }

    boolean Z(@NonNull Menu menu) {
        boolean z10 = false;
        int i10 = 1 >> 1;
        if (this.f51687w < 1) {
            return false;
        }
        for (Fragment fragment : this.f51667c.p()) {
            if (fragment != null && f1(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    void Z0(@NonNull Fragment fragment) {
        if (fragment.mAdded && c1(fragment)) {
            this.J = true;
        }
    }

    void Z1(@NonNull Fragment fragment, @NonNull androidx.lifecycle.c0.b bVar) {
        if (fragment.equals(s0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @Override // androidx.fragment.app.p0
    public final void a(@NonNull String str, @NonNull Bundle bundle) {
        o oVar = this.f51678n.get(str);
        if (oVar == null || !oVar.b(androidx.lifecycle.c0.b.STARTED)) {
            this.f51677m.put(str, bundle);
        } else {
            oVar.a(str, bundle);
        }
        if (b1(2)) {
            Objects.toString(bundle);
        }
    }

    void a0() {
        i2();
        W(this.A);
    }

    public boolean a1() {
        return this.M;
    }

    void a2(@androidx.annotation.p0 Fragment fragment) {
        if (fragment != null && (!fragment.equals(s0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.A;
        this.A = fragment;
        W(fragment2);
        W(this.A);
    }

    @Override // androidx.fragment.app.p0
    public final void b(@NonNull String str) {
        o oVarRemove = this.f51678n.remove(str);
        if (oVarRemove != null) {
            oVarRemove.c();
        }
        b1(2);
    }

    void b0() {
        this.K = false;
        this.L = false;
        this.R.i0(false);
        d0(7);
    }

    void b2(@NonNull g1 g1Var) {
        this.D = g1Var;
    }

    @Override // androidx.fragment.app.p0
    public final void c(@NonNull String str, @NonNull androidx.lifecycle.o0 o0Var, @NonNull o0 o0Var2) {
        androidx.lifecycle.c0 lifecycle = o0Var.getLifecycle();
        if (lifecycle.d() == androidx.lifecycle.c0.b.DESTROYED) {
            return;
        }
        g gVar = new g(str, o0Var2, lifecycle);
        o oVarPut = this.f51678n.put(str, new o(lifecycle, o0Var2, gVar));
        if (oVarPut != null) {
            oVarPut.c();
        }
        if (b1(2)) {
            lifecycle.toString();
            Objects.toString(o0Var2);
        }
        lifecycle.c(gVar);
    }

    void c0() {
        this.K = false;
        this.L = false;
        this.R.i0(false);
        d0(5);
    }

    public void c2(@androidx.annotation.p0 d2.d.c cVar) {
        this.S = cVar;
    }

    @Override // androidx.fragment.app.p0
    public final void d(@NonNull String str) {
        this.f51677m.remove(str);
        b1(2);
    }

    void e0() {
        this.L = true;
        this.R.i0(true);
        d0(4);
    }

    boolean e1(@androidx.annotation.p0 Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void e2(@NonNull Fragment fragment) {
        if (b1(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            int i10 = 2 & 0;
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void f0() {
        d0(2);
    }

    boolean f1(@androidx.annotation.p0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    boolean g1(@androidx.annotation.p0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.S0()) && g1(fragmentManager.f51690z);
    }

    public void h0(@NonNull String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f51667c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f51669e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f51669e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.f51668d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                androidx.fragment.app.a aVar = this.f51668d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.U(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f51675k.get());
        synchronized (this.f51665a) {
            try {
                int size3 = this.f51665a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        q qVar = this.f51665a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(qVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f51688x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f51689y);
        if (this.f51690z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f51690z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f51687w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.M);
        if (this.J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.J);
        }
    }

    boolean h1(int i10) {
        return this.f51687w >= i10;
    }

    public void h2(@NonNull n nVar) {
        this.f51680p.p(nVar);
    }

    public boolean i1() {
        return this.K || this.L;
    }

    void j1(@NonNull Fragment fragment, @NonNull String[] strArr, int i10) {
        if (this.H == null) {
            this.f51688x.n(fragment, strArr, i10);
            return;
        }
        this.I.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        this.H.b(strArr);
    }

    void k1(@NonNull Fragment fragment, @NonNull Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        if (this.F == null) {
            this.f51688x.r(fragment, intent, i10, bundle);
            return;
        }
        this.I.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (bundle != null) {
            intent.putExtra(g.b.m.f275348b, bundle);
        }
        this.F.b(intent);
    }

    void l0(@NonNull q qVar, boolean z10) {
        if (!z10) {
            if (this.f51688x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            z();
        }
        synchronized (this.f51665a) {
            try {
                if (this.f51688x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f51665a.add(qVar);
                    W1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void l1(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.G == null) {
            this.f51688x.s(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra(f51664c0, true);
            }
            if (b1(2)) {
                bundle.toString();
                intent.toString();
                Objects.toString(fragment);
            }
            intent.putExtra(g.b.m.f275348b, bundle);
        }
        IntentSenderRequest intentSenderRequestA = new IntentSenderRequest.a(intentSender).b(intent).c(i12, i11).a();
        this.I.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (b1(2)) {
            fragment.toString();
        }
        this.G.b(intentSenderRequestA);
    }

    void m1(int i10, boolean z10) {
        x<?> xVar;
        if (this.f51688x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f51687w) {
            this.f51687w = i10;
            this.f51667c.u();
            f2();
            if (this.J && (xVar = this.f51688x) != null && this.f51687w == 7) {
                xVar.t();
                this.J = false;
            }
        }
    }

    boolean n0(boolean z10) {
        androidx.fragment.app.a aVar;
        m0(z10);
        boolean z11 = false;
        if (!this.f51673i && (aVar = this.f51672h) != null) {
            aVar.O = false;
            aVar.S();
            if (b1(3)) {
                Objects.toString(this.f51672h);
                Objects.toString(this.f51665a);
            }
            this.f51672h.T(false, false);
            this.f51665a.add(0, this.f51672h);
            Iterator<t0.a> it = this.f51672h.f51989c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f52007b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f51672h = null;
        }
        while (C0(this.O, this.P)) {
            z11 = true;
            this.f51666b = true;
            try {
                H1(this.O, this.P);
                A();
            } catch (Throwable th2) {
                A();
                throw th2;
            }
        }
        i2();
        g0();
        this.f51667c.b();
        return z11;
    }

    void n1() {
        if (this.f51688x != null) {
            this.K = false;
            this.L = false;
            this.R.i0(false);
            for (Fragment fragment : this.f51667c.p()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    void o(androidx.fragment.app.a aVar) {
        this.f51668d.add(aVar);
    }

    void o0(@NonNull q qVar, boolean z10) {
        if (z10 && (this.f51688x == null || this.M)) {
            return;
        }
        m0(z10);
        androidx.fragment.app.a aVar = this.f51672h;
        boolean z11 = false;
        if (aVar != null) {
            aVar.O = false;
            aVar.S();
            if (b1(3)) {
                Objects.toString(this.f51672h);
                Objects.toString(qVar);
            }
            this.f51672h.T(false, false);
            boolean zA = this.f51672h.a(this.O, this.P);
            Iterator<t0.a> it = this.f51672h.f51989c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f52007b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f51672h = null;
            z11 = zA;
        }
        boolean zA2 = qVar.a(this.O, this.P);
        if (z11 || zA2) {
            this.f51666b = true;
            try {
                H1(this.O, this.P);
                A();
            } catch (Throwable th2) {
                A();
                throw th2;
            }
        }
        i2();
        g0();
        this.f51667c.b();
    }

    public final void o1(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        for (q0 q0Var : this.f51667c.l()) {
            Fragment fragmentK = q0Var.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                q0Var.b();
                q0Var.m();
            }
        }
    }

    q0 p(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            d2.d.i(fragment, str);
        }
        if (b1(2)) {
            fragment.toString();
        }
        q0 q0VarG = G(fragment);
        fragment.mFragmentManager = this;
        this.f51667c.s(q0VarG);
        if (!fragment.mDetached) {
            this.f51667c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (c1(fragment)) {
                this.J = true;
            }
        }
        return q0VarG;
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public t0 p1() {
        return w();
    }

    public void q(@NonNull m0 m0Var) {
        this.f51681q.add(m0Var);
    }

    void q1(@NonNull q0 q0Var) {
        Fragment fragmentK = q0Var.k();
        if (fragmentK.mDeferStart) {
            if (this.f51666b) {
                this.N = true;
            } else {
                fragmentK.mDeferStart = false;
                q0Var.m();
            }
        }
    }

    public void r(@NonNull p pVar) {
        this.f51679o.add(pVar);
    }

    @androidx.annotation.l0
    public boolean r0() {
        boolean zN0 = n0(true);
        A0();
        return zN0;
    }

    public void r1() {
        l0(new r(null, -1, 0), false);
    }

    void s(@NonNull Fragment fragment) {
        this.R.U(fragment);
    }

    @androidx.annotation.p0
    Fragment s0(@NonNull String str) {
        return this.f51667c.f(str);
    }

    public void s1(int i10, int i11) {
        t1(i10, i11, false);
    }

    int t() {
        return this.f51675k.getAndIncrement();
    }

    void t1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            l0(new r(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f51690z;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f51690z)));
            sb2.append("}");
        } else {
            x<?> xVar = this.f51688x;
            if (xVar != null) {
                sb2.append(xVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f51688x)));
                sb2.append("}");
            } else {
                sb2.append(AbstractJsonLexerKt.NULL);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void u(@NonNull x<?> xVar, @NonNull androidx.fragment.app.u uVar, @androidx.annotation.p0 Fragment fragment) {
        String str;
        androidx.lifecycle.o0 o0Var;
        if (this.f51688x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f51688x = xVar;
        this.f51689y = uVar;
        this.f51690z = fragment;
        if (fragment != null) {
            q(new h(fragment));
        } else if (xVar instanceof m0) {
            q((m0) xVar);
        }
        if (this.f51690z != null) {
            i2();
        }
        if (xVar instanceof androidx.activity.m0) {
            androidx.activity.m0 m0Var = (androidx.activity.m0) xVar;
            androidx.activity.j0 onBackPressedDispatcher = m0Var.getOnBackPressedDispatcher();
            this.f51671g = onBackPressedDispatcher;
            if (fragment != null) {
                o0Var = m0Var;
                o0Var = fragment;
            }
            o0Var = m0Var;
            onBackPressedDispatcher.i(o0Var, this.f51674j);
        }
        if (fragment != null) {
            this.R = fragment.mFragmentManager.H0(fragment);
        } else if (xVar instanceof m2) {
            this.R = l0.a0(((m2) xVar).getViewModelStore());
        } else {
            this.R = new l0(false);
        }
        this.R.i0(i1());
        this.f51667c.B(this.R);
        Object obj = this.f51688x;
        if ((obj instanceof androidx.savedstate.m) && fragment == null) {
            androidx.savedstate.j savedStateRegistry = ((androidx.savedstate.m) obj).getSavedStateRegistry();
            savedStateRegistry.d(U, new androidx.savedstate.j.b() { // from class: androidx.fragment.app.g0
                @Override // androidx.savedstate.j.b
                public final Bundle a() {
                    return this.f51887a.S1();
                }
            });
            Bundle bundleA = savedStateRegistry.a(U);
            if (bundleA != null) {
                O1(bundleA);
            }
        }
        Object obj2 = this.f51688x;
        if (obj2 instanceof androidx.activity.result.l) {
            androidx.activity.result.k activityResultRegistry = ((androidx.activity.result.l) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.F = activityResultRegistry.m(str2 + "StartActivityForResult", new g.b.m(), new i());
            this.G = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new m(), new j());
            this.H = activityResultRegistry.m(str2 + "RequestPermissions", new g.b.k(), new a());
        }
        Object obj3 = this.f51688x;
        if (obj3 instanceof androidx.core.content.e0) {
            ((androidx.core.content.e0) obj3).addOnConfigurationChangedListener(this.f51682r);
        }
        Object obj4 = this.f51688x;
        if (obj4 instanceof androidx.core.content.f0) {
            ((androidx.core.content.f0) obj4).addOnTrimMemoryListener(this.f51683s);
        }
        Object obj5 = this.f51688x;
        if (obj5 instanceof androidx.core.app.d0) {
            ((androidx.core.app.d0) obj5).addOnMultiWindowModeChangedListener(this.f51684t);
        }
        Object obj6 = this.f51688x;
        if (obj6 instanceof androidx.core.app.f0) {
            ((androidx.core.app.f0) obj6).addOnPictureInPictureModeChangedListener(this.f51685u);
        }
        Object obj7 = this.f51688x;
        if ((obj7 instanceof androidx.core.view.l0) && fragment == null) {
            ((androidx.core.view.l0) obj7).addMenuProvider(this.f51686v);
        }
    }

    public void u1(@androidx.annotation.p0 String str, int i10) {
        l0(new r(str, -1, i10), false);
    }

    void v(@NonNull Fragment fragment) {
        if (b1(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f51667c.a(fragment);
            if (b1(2)) {
                fragment.toString();
            }
            if (c1(fragment)) {
                this.J = true;
            }
        }
    }

    @androidx.annotation.p0
    public Fragment v0(@androidx.annotation.d0 int i10) {
        return this.f51667c.g(i10);
    }

    @androidx.annotation.l0
    public boolean v1() {
        return y1(null, -1, 0);
    }

    @NonNull
    public t0 w() {
        return new androidx.fragment.app.a(this);
    }

    @androidx.annotation.p0
    public Fragment w0(@androidx.annotation.p0 String str) {
        return this.f51667c.h(str);
    }

    public boolean w1(int i10, int i11) {
        if (i10 >= 0) {
            return y1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    void x() {
        if (b1(3)) {
            Objects.toString(this.f51672h);
        }
        androidx.fragment.app.a aVar = this.f51672h;
        if (aVar != null) {
            aVar.O = false;
            aVar.S();
            this.f51672h.D(true, new Runnable() { // from class: androidx.fragment.app.h0
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.g(this.f51889a);
                }
            });
            this.f51672h.m();
            this.f51673i = true;
            r0();
            this.f51673i = false;
            this.f51672h = null;
        }
    }

    Fragment x0(@NonNull String str) {
        return this.f51667c.i(str);
    }

    @androidx.annotation.l0
    public boolean x1(@androidx.annotation.p0 String str, int i10) {
        return y1(str, -1, i10);
    }

    boolean y() {
        boolean zC1 = false;
        for (Fragment fragment : this.f51667c.m()) {
            if (fragment != null) {
                zC1 = c1(fragment);
            }
            if (zC1) {
                return true;
            }
        }
        return false;
    }

    boolean z1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @androidx.annotation.p0 String str, int i10, int i11) {
        int iT0 = t0(str, i10, (i11 & 1) != 0);
        if (iT0 < 0) {
            return false;
        }
        for (int size = this.f51668d.size() - 1; size >= iT0; size--) {
            arrayList.add(this.f51668d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    @e.a({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f51691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f51692b;

        class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        LaunchedFragmentInfo(@NonNull String str, int i10) {
            this.f51691a = str;
            this.f51692b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f51691a);
            parcel.writeInt(this.f51692b);
        }

        LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.f51691a = parcel.readString();
            this.f51692b = parcel.readInt();
        }
    }
}

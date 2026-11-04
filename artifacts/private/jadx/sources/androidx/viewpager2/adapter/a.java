package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.collection.b1;
import androidx.core.util.t;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import androidx.fragment.app.t0;
import androidx.lifecycle.c0;
import androidx.lifecycle.j0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.devtodev.core.data.consts.RequestParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends RecyclerView.h<androidx.viewpager2.adapter.b> implements androidx.viewpager2.adapter.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f76139j = "f#";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f76140k = "s#";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f76141l = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c0 f76142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final FragmentManager f76143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b1<Fragment> f76144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b1<Fragment.SavedState> f76145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b1<Integer> f76146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f76147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    g f76148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f76149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f76150i;

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC0767a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FrameLayout f76151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.viewpager2.adapter.b f76152b;

        ViewOnLayoutChangeListenerC0767a(FrameLayout frameLayout, androidx.viewpager2.adapter.b bVar) {
            this.f76151a = frameLayout;
            this.f76152b = bVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (this.f76151a.getParent() != null) {
                this.f76151a.removeOnLayoutChangeListener(this);
                a.this.w(this.f76152b);
            }
        }
    }

    class b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.viewpager2.adapter.b f76154a;

        b(androidx.viewpager2.adapter.b bVar) {
            this.f76154a = bVar;
        }

        @Override // androidx.lifecycle.j0
        public void e(@NonNull o0 o0Var, @NonNull c0.a aVar) {
            if (a.this.B()) {
                return;
            }
            o0Var.getLifecycle().g(this);
            if (u1.R0(this.f76154a.h())) {
                a.this.w(this.f76154a);
            }
        }
    }

    class c extends FragmentManager.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f76156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f76157b;

        c(Fragment fragment, FrameLayout frameLayout) {
            this.f76156a = fragment;
            this.f76157b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public void m(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @p0 Bundle bundle) {
            if (fragment == this.f76156a) {
                fragmentManager.h2(this);
                a.this.h(view, this.f76157b);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f76149h = false;
            aVar.m();
        }
    }

    class e implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f76160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f76161b;

        e(Handler handler, Runnable runnable) {
            this.f76160a = handler;
            this.f76161b = runnable;
        }

        @Override // androidx.lifecycle.j0
        public void e(@NonNull o0 o0Var, @NonNull c0.a aVar) {
            if (aVar == c0.a.ON_DESTROY) {
                this.f76160a.removeCallbacks(this.f76161b);
                o0Var.getLifecycle().g(this);
            }
        }
    }

    private static abstract class f extends RecyclerView.j {
        private f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11, @p0 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i10, int i11) {
            a();
        }

        /* synthetic */ f(ViewOnLayoutChangeListenerC0767a viewOnLayoutChangeListenerC0767a) {
            this();
        }
    }

    static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<i> f76163a = new CopyOnWriteArrayList();

        g() {
        }

        public List<i.b> a(Fragment fragment, c0.b bVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<i> it = this.f76163a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(fragment, bVar));
            }
            return arrayList;
        }

        public void b(List<i.b> list) {
            Iterator<i.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public List<i.b> c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<i> it = this.f76163a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b(fragment));
            }
            return arrayList;
        }

        public List<i.b> d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<i> it = this.f76163a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c(fragment));
            }
            return arrayList;
        }

        public void e(i iVar) {
            this.f76163a.add(iVar);
        }

        public void f(i iVar) {
            this.f76163a.remove(iVar);
        }
    }

    class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewPager2.j f76164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView.j f76165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private j0 f76166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewPager2 f76167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f76168e = -1;

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.a$h$a, reason: collision with other inner class name */
        class C0768a extends ViewPager2.j {
            C0768a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void a(int i10) {
                h.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void c(int i10) {
                h.this.d(false);
            }
        }

        class b extends f {
            b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.a.f, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                h.this.d(true);
            }
        }

        class c implements j0 {
            c() {
            }

            @Override // androidx.lifecycle.j0
            public void e(@NonNull o0 o0Var, @NonNull c0.a aVar) {
                h.this.d(false);
            }
        }

        h() {
        }

        @NonNull
        private ViewPager2 a(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(@NonNull RecyclerView recyclerView) {
            this.f76167d = a(recyclerView);
            C0768a c0768a = new C0768a();
            this.f76164a = c0768a;
            this.f76167d.o(c0768a);
            b bVar = new b();
            this.f76165b = bVar;
            a.this.registerAdapterDataObserver(bVar);
            c cVar = new c();
            this.f76166c = cVar;
            a.this.f76142a.c(cVar);
        }

        void c(@NonNull RecyclerView recyclerView) {
            a(recyclerView).y(this.f76164a);
            a.this.unregisterAdapterDataObserver(this.f76165b);
            a.this.f76142a.g(this.f76166c);
            this.f76167d = null;
        }

        void d(boolean z10) {
            int currentItem;
            Fragment fragmentG;
            if (!a.this.B() && this.f76167d.getScrollState() == 0 && !a.this.f76144c.k() && a.this.getItemCount() != 0 && (currentItem = this.f76167d.getCurrentItem()) < a.this.getItemCount()) {
                long itemId = a.this.getItemId(currentItem);
                if ((itemId != this.f76168e || z10) && (fragmentG = a.this.f76144c.g(itemId)) != null && fragmentG.isAdded()) {
                    this.f76168e = itemId;
                    t0 t0VarW = a.this.f76143b.w();
                    ArrayList arrayList = new ArrayList();
                    int i10 = 3 & 0;
                    Fragment fragment = null;
                    for (int i11 = 0; i11 < a.this.f76144c.size(); i11++) {
                        long jL = a.this.f76144c.l(i11);
                        Fragment fragmentW = a.this.f76144c.w(i11);
                        if (fragmentW.isAdded()) {
                            if (jL != this.f76168e) {
                                c0.b bVar = c0.b.STARTED;
                                t0VarW.L(fragmentW, bVar);
                                arrayList.add(a.this.f76148g.a(fragmentW, bVar));
                            } else {
                                fragment = fragmentW;
                            }
                            fragmentW.setMenuVisibility(jL == this.f76168e);
                        }
                    }
                    if (fragment != null) {
                        c0.b bVar2 = c0.b.RESUMED;
                        t0VarW.L(fragment, bVar2);
                        arrayList.add(a.this.f76148g.a(fragment, bVar2));
                    }
                    if (!t0VarW.w()) {
                        t0VarW.o();
                        Collections.reverse(arrayList);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a.this.f76148g.b((List) it.next());
                        }
                    }
                }
            }
        }
    }

    public static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private static final b f76173a = new C0769a();

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.a$i$a, reason: collision with other inner class name */
        class C0769a implements b {
            C0769a() {
            }

            @Override // androidx.viewpager2.adapter.a.i.b
            public void a() {
            }
        }

        public interface b {
            void a();
        }

        @NonNull
        public b a(@NonNull Fragment fragment, @NonNull c0.b bVar) {
            return f76173a;
        }

        @NonNull
        public b b(@NonNull Fragment fragment) {
            return f76173a;
        }

        @NonNull
        public b c(@NonNull Fragment fragment) {
            return f76173a;
        }
    }

    public a(@NonNull s sVar) {
        this(sVar.getSupportFragmentManager(), sVar.getLifecycle());
    }

    private void A(Fragment fragment, @NonNull FrameLayout frameLayout) {
        this.f76143b.D1(new c(fragment, frameLayout), false);
    }

    @NonNull
    private static String k(@NonNull String str, long j10) {
        return str + j10;
    }

    private void l(int i10) {
        long itemId = getItemId(i10);
        if (this.f76144c.d(itemId)) {
            return;
        }
        Fragment fragmentJ = j(i10);
        fragmentJ.setInitialSavedState(this.f76145d.g(itemId));
        this.f76144c.n(itemId, fragmentJ);
    }

    private boolean n(long j10) {
        View view;
        if (this.f76146e.d(j10)) {
            return true;
        }
        Fragment fragmentG = this.f76144c.g(j10);
        return (fragmentG == null || (view = fragmentG.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean o(@NonNull String str, @NonNull String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long p(int i10) {
        Long lValueOf = null;
        for (int i11 = 0; i11 < this.f76146e.size(); i11++) {
            if (this.f76146e.w(i11).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f76146e.l(i11));
            }
        }
        return lValueOf;
    }

    private static long v(@NonNull String str, @NonNull String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void y(long j10) {
        ViewParent parent;
        Fragment fragmentG = this.f76144c.g(j10);
        if (fragmentG == null) {
            return;
        }
        if (fragmentG.getView() != null && (parent = fragmentG.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!i(j10)) {
            this.f76145d.q(j10);
        }
        if (!fragmentG.isAdded()) {
            this.f76144c.q(j10);
            return;
        }
        if (B()) {
            this.f76150i = true;
            return;
        }
        if (fragmentG.isAdded() && i(j10)) {
            this.f76145d.n(j10, this.f76143b.V1(fragmentG));
        }
        List<i.b> listD = this.f76148g.d(fragmentG);
        try {
            this.f76143b.w().x(fragmentG).o();
            this.f76144c.q(j10);
            g gVar = this.f76148g;
        } finally {
            this.f76148g.b(listD);
        }
    }

    private void z() {
        Handler handler = new Handler(Looper.getMainLooper());
        d dVar = new d();
        this.f76142a.c(new e(handler, dVar));
        handler.postDelayed(dVar, 10000L);
    }

    boolean B() {
        return this.f76143b.i1();
    }

    public void C(@NonNull i iVar) {
        this.f76148g.f(iVar);
    }

    @Override // androidx.viewpager2.adapter.c
    @NonNull
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f76144c.size() + this.f76145d.size());
        for (int i10 = 0; i10 < this.f76144c.size(); i10++) {
            long jL = this.f76144c.l(i10);
            Fragment fragmentG = this.f76144c.g(jL);
            if (fragmentG != null && fragmentG.isAdded()) {
                this.f76143b.C1(bundle, k(f76139j, jL), fragmentG);
            }
        }
        for (int i11 = 0; i11 < this.f76145d.size(); i11++) {
            long jL2 = this.f76145d.l(i11);
            if (i(jL2)) {
                bundle.putParcelable(k(f76140k, jL2), this.f76145d.g(jL2));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.c
    public final void g(@NonNull Parcelable parcelable) {
        if (!this.f76145d.k() || !this.f76144c.k()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (o(str, f76139j)) {
                this.f76144c.n(v(str, f76139j), this.f76143b.J0(bundle, str));
            } else {
                if (!o(str, f76140k)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jV = v(str, f76140k);
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (i(jV)) {
                    this.f76145d.n(jV, savedState);
                }
            }
        }
        if (!this.f76144c.k()) {
            this.f76150i = true;
            this.f76149h = true;
            m();
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return i10;
    }

    void h(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean i(long j10) {
        return j10 >= 0 && j10 < ((long) getItemCount());
    }

    @NonNull
    public abstract Fragment j(int i10);

    void m() {
        if (this.f76150i && !B()) {
            androidx.collection.c cVar = new androidx.collection.c();
            for (int i10 = 0; i10 < this.f76144c.size(); i10++) {
                long jL = this.f76144c.l(i10);
                if (!i(jL)) {
                    cVar.add(Long.valueOf(jL));
                    this.f76146e.q(jL);
                }
            }
            if (!this.f76149h) {
                this.f76150i = false;
                for (int i11 = 0; i11 < this.f76144c.size(); i11++) {
                    long jL2 = this.f76144c.l(i11);
                    if (!n(jL2)) {
                        cVar.add(Long.valueOf(jL2));
                    }
                }
            }
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                y(((Long) it.next()).longValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @androidx.annotation.i
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        t.a(this.f76147f == null);
        h hVar = new h();
        this.f76147f = hVar;
        hVar.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @androidx.annotation.i
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f76147f.c(recyclerView);
        this.f76147f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@NonNull androidx.viewpager2.adapter.b bVar, int i10) {
        long itemId = bVar.getItemId();
        int id2 = bVar.h().getId();
        Long lP = p(id2);
        if (lP != null && lP.longValue() != itemId) {
            y(lP.longValue());
            this.f76146e.q(lP.longValue());
        }
        this.f76146e.n(itemId, Integer.valueOf(id2));
        l(i10);
        FrameLayout frameLayoutH = bVar.h();
        if (u1.R0(frameLayoutH)) {
            if (frameLayoutH.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutH.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0767a(frameLayoutH, bVar));
        }
        m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final androidx.viewpager2.adapter.b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return androidx.viewpager2.adapter.b.g(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(@NonNull androidx.viewpager2.adapter.b bVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(@NonNull androidx.viewpager2.adapter.b bVar) {
        w(bVar);
        m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(@NonNull androidx.viewpager2.adapter.b bVar) {
        Long lP = p(bVar.h().getId());
        if (lP != null) {
            y(lP.longValue());
            this.f76146e.q(lP.longValue());
        }
    }

    void w(@NonNull androidx.viewpager2.adapter.b bVar) {
        Fragment fragmentG = this.f76144c.g(bVar.getItemId());
        if (fragmentG == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutH = bVar.h();
        View view = fragmentG.getView();
        if (!fragmentG.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentG.isAdded() && view == null) {
            A(fragmentG, frameLayoutH);
            return;
        }
        if (!fragmentG.isAdded() || view.getParent() == null) {
            if (fragmentG.isAdded()) {
                h(view, frameLayoutH);
                return;
            }
            if (!B()) {
                A(fragmentG, frameLayoutH);
                List<i.b> listC = this.f76148g.c(fragmentG);
                try {
                    fragmentG.setMenuVisibility(false);
                    this.f76143b.w().g(fragmentG, RequestParams.F + bVar.getItemId()).L(fragmentG, c0.b.STARTED).o();
                    this.f76147f.d(false);
                    g gVar = this.f76148g;
                    return;
                } finally {
                    this.f76148g.b(listC);
                }
            }
            if (!this.f76143b.a1()) {
                this.f76142a.c(new b(bVar));
            }
        } else if (view.getParent() != frameLayoutH) {
            h(view, frameLayoutH);
        }
    }

    public void x(@NonNull i iVar) {
        this.f76148g.e(iVar);
    }

    public a(@NonNull Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public a(@NonNull FragmentManager fragmentManager, @NonNull c0 c0Var) {
        this.f76144c = new b1<>();
        this.f76145d = new b1<>();
        this.f76146e = new b1<>();
        this.f76148g = new g();
        this.f76149h = false;
        this.f76150i = false;
        this.f76143b = fragmentManager;
        this.f76142a = c0Var;
        super.setHasStableIds(true);
    }
}

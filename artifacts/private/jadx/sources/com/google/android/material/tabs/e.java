package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TabLayout f114036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final ViewPager2 f114037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f114038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f114039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f114040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private RecyclerView.h<?> f114041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f114042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private c f114043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private TabLayout.f f114044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private RecyclerView.j f114045j;

    private class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            e.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11) {
            e.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, @p0 Object obj) {
            e.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            e.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            e.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            e.this.d();
        }
    }

    public interface b {
        void a(@NonNull TabLayout.i iVar, int i10);
    }

    private static class c extends ViewPager2.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<TabLayout> f114047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f114048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f114049c;

        c(TabLayout tabLayout) {
            this.f114047a = new WeakReference<>(tabLayout);
            d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void a(int i10) {
            this.f114048b = this.f114049c;
            this.f114049c = i10;
            TabLayout tabLayout = this.f114047a.get();
            if (tabLayout != null) {
                tabLayout.d0(this.f114049c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void b(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f114047a.get();
            if (tabLayout != null) {
                int i12 = this.f114049c;
                boolean z10 = true;
                int i13 = 7 >> 1;
                if (i12 == 2 && this.f114048b != 1) {
                    z10 = false;
                }
                if (i12 == 2 && this.f114048b == 0) {
                    z10 = false;
                }
                tabLayout.W(i10, f10, z10, z10, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i10) {
            TabLayout tabLayout = this.f114047a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f114049c;
                tabLayout.S(tabLayout.D(i10), i11 == 0 || (i11 == 2 && this.f114048b == 0));
            }
        }

        void d() {
            this.f114049c = 0;
            this.f114048b = 0;
        }
    }

    private static class d implements TabLayout.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager2 f114050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f114051b;

        d(ViewPager2 viewPager2, boolean z10) {
            this.f114050a = viewPager2;
            this.f114051b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@NonNull TabLayout.i iVar) {
            this.f114050a.t(iVar.k(), this.f114051b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.i iVar) {
        }
    }

    public e(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public void a() {
        if (this.f114042g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.h<?> adapter = this.f114037b.getAdapter();
        this.f114041f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f114042g = true;
        c cVar = new c(this.f114036a);
        this.f114043h = cVar;
        this.f114037b.o(cVar);
        d dVar = new d(this.f114037b, this.f114039d);
        this.f114044i = dVar;
        this.f114036a.h(dVar);
        if (this.f114038c) {
            a aVar = new a();
            this.f114045j = aVar;
            this.f114041f.registerAdapterDataObserver(aVar);
        }
        d();
        this.f114036a.U(this.f114037b.getCurrentItem(), 0.0f, true);
    }

    public void b() {
        RecyclerView.h<?> hVar;
        if (this.f114038c && (hVar = this.f114041f) != null) {
            hVar.unregisterAdapterDataObserver(this.f114045j);
            this.f114045j = null;
        }
        this.f114036a.N(this.f114044i);
        this.f114037b.y(this.f114043h);
        this.f114044i = null;
        this.f114043h = null;
        this.f114041f = null;
        this.f114042g = false;
    }

    public boolean c() {
        return this.f114042g;
    }

    void d() {
        this.f114036a.L();
        RecyclerView.h<?> hVar = this.f114041f;
        if (hVar != null) {
            int itemCount = hVar.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.i iVarI = this.f114036a.I();
                this.f114040e.a(iVarI, i10);
                this.f114036a.l(iVarI, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f114037b.getCurrentItem(), this.f114036a.getTabCount() - 1);
                if (iMin != this.f114036a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f114036a;
                    tabLayout.R(tabLayout.D(iMin));
                }
            }
        }
    }

    public e(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z10, @NonNull b bVar) {
        this(tabLayout, viewPager2, z10, true, bVar);
    }

    public e(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z10, boolean z11, @NonNull b bVar) {
        this.f114036a = tabLayout;
        this.f114037b = viewPager2;
        this.f114038c = z10;
        this.f114039d = z11;
        this.f114040e = bVar;
    }
}

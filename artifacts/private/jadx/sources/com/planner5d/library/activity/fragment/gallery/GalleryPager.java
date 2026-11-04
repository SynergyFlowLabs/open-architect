package com.planner5d.library.activity.fragment.gallery;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.lifecycle.d1;
import androidx.viewpager.widget.ViewPager;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.u2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.n3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.previewtoolbar.PreviewToolbarItem;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
public class GalleryPager extends FragmentController implements com.planner5d.library.activity.helper.ui.a, com.planner5d.library.widget.c0 {
    private com.planner5d.library.services.bitmaploader.target.h Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.q0 f133710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    protected y0 f133711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    protected y1 f133712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.i f133713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.t f133714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ij.a
    protected le.o f133715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ij.a
    protected p0 f133716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ij.a
    protected b2 f133717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ij.a
    protected m f133718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.services.utility.w f133719n;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ViewPager f133723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f133724t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected j0 f133725v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n3<k0> f133720o = t3.e(this, k0.class);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f133726w = false;
    private boolean X = false;
    private final com.planner5d.library.widget.preloader.t Y = new com.planner5d.library.widget.preloader.t();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    private final n3<com.planner5d.library.services.network.b> f133721p0 = com.planner5d.library.services.network.f.a(this);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final com.planner5d.library.model.manager.statistics.b<b4.c> f133722p1 = new com.planner5d.library.model.manager.statistics.b<>(b4.c.gallery);

    class a implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.q0.c f133727a;

        a(com.planner5d.library.model.manager.q0.c cVar) {
            this.f133727a = cVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
            boolean z10 = i10 != 0;
            if (((k0) GalleryPager.this.f133720o.a()).Y(z10)) {
                GalleryPager.this.U(!z10);
            }
            if (!z10 && GalleryPager.this.f133723s.getCurrentItem() + 1 >= GalleryPager.this.f133725v.getCount()) {
                GalleryPager.this.d0(this.f133727a);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            GalleryPager galleryPager = GalleryPager.this;
            galleryPager.g0(Long.valueOf(galleryPager.f133725v.b(i10).f180750l));
        }
    }

    class b extends com.planner5d.library.services.utility.w.c<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.utility.j f133729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f133730b;

        b(com.planner5d.library.services.utility.j jVar, ArrayList arrayList) {
            this.f133729a = jVar;
            this.f133730b = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(ArrayList arrayList, Parcelable parcelable) {
            arrayList.add(GalleryPager.this.f133713h.a((Bundle) parcelable));
        }

        @Override // com.planner5d.library.services.utility.w.c
        public void a() {
            GalleryPager.this.f133726w = true;
            GalleryPager.this.X = true;
            GalleryPager.this.U(true);
            GalleryPager.this.Y.a().b();
            GalleryPager galleryPager = GalleryPager.this;
            galleryPager.g0(Long.valueOf(galleryPager.f133725v.b(0).f180750l));
        }

        @Override // com.planner5d.library.services.utility.w.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void c(Integer num) {
            if (num != null) {
                GalleryPager.this.f133723s.S(num.intValue(), false);
            }
        }

        @Override // com.planner5d.library.services.utility.w.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer d() throws Throwable {
            final com.planner5d.library.model.h hVarA = GalleryPager.this.f133713h.a(this.f133729a.h(com.planner5d.library.services.r.model, null));
            final ArrayList arrayList = new ArrayList();
            this.f133730b.forEach(new Consumer() { // from class: com.planner5d.library.activity.fragment.gallery.h0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f133763a.g(arrayList, (Parcelable) obj);
                }
            });
            GalleryPager.this.f133725v.a((com.planner5d.library.model.h[]) arrayList.toArray(new com.planner5d.library.model.h[0]));
            Optional optionalFindFirst = arrayList.stream().filter(new Predicate() { // from class: com.planner5d.library.activity.fragment.gallery.i0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Objects.equals(hVarA.f180740b, ((com.planner5d.library.model.h) obj).f180740b);
                }
            }).findFirst();
            if (optionalFindFirst.isPresent()) {
                return Integer.valueOf(arrayList.indexOf(optionalFindFirst.get()));
            }
            return null;
        }
    }

    class c extends com.planner5d.library.services.rx.e<com.planner5d.library.model.h[]> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.h f133732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.q0.c f133733e;

        c(com.planner5d.library.model.h hVar, com.planner5d.library.model.manager.q0.c cVar) {
            this.f133732d = hVar;
            this.f133733e = cVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            GalleryPager.this.f133724t.setVisibility(0);
            GalleryPager.this.Y.a().b();
            GalleryPager.this.f0(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.model.h[] hVarArr) {
            GalleryPager.this.f133725v.a(hVarArr);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            if (GalleryPager.this.getContext() == null) {
                return;
            }
            GalleryPager.this.f133726w = true;
            GalleryPager.this.f133725v.a(new com.planner5d.library.model.h[]{this.f133732d});
            GalleryPager.this.f133723s.S(GalleryPager.this.f133725v.getCount() - 1, false);
            GalleryPager galleryPager = GalleryPager.this;
            galleryPager.g0(Long.valueOf(galleryPager.f133725v.b(galleryPager.f133723s.getCurrentItem()).f180750l));
            GalleryPager.this.d0(this.f133733e);
        }
    }

    class d extends com.planner5d.library.services.rx.e<com.planner5d.library.model.h[]> {
        d() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            GalleryPager.this.f0(th2);
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.model.h[] hVarArr) {
            if (hVarArr.length == 0) {
                GalleryPager.this.X = true;
            }
            GalleryPager.this.f133725v.a(hVarArr);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            GalleryPager.this.U(true);
            GalleryPager.this.Y.a().b();
        }
    }

    class e extends com.planner5d.library.services.rx.e<com.planner5d.library.model.k[]> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.k f133736d;

        e(com.planner5d.library.model.k kVar) {
            this.f133736d = kVar;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.model.k[] kVarArr) {
            String str = this.f133736d.b().f180740b;
            if (str != null) {
                for (com.planner5d.library.model.k kVar : kVarArr) {
                    if (str.equals(kVar.b().f180740b)) {
                        if (kVar.b().f180748j != this.f133736d.b().f180748j) {
                            GalleryPager.this.f133725v.f(kVar.b());
                        }
                        GalleryPager.this.f133718m.c(kVar);
                        return;
                    }
                }
            }
        }
    }

    class f extends com.planner5d.library.services.rx.e<le.o.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.h f133738d;

        f(com.planner5d.library.model.h hVar) {
            this.f133738d = hVar;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(le.o.a aVar) {
            ((k0) GalleryPager.this.f133720o.a()).Z(false);
            if (GalleryPager.this.isVisible()) {
                if (aVar.b() != le.o.a.EnumC2327a.FAILED) {
                    le.o.a.EnumC2327a enumC2327aB = aVar.b();
                    le.o.a.EnumC2327a enumC2327a = le.o.a.EnumC2327a.LIKE_ADDED;
                    if (enumC2327aB == enumC2327a) {
                        u2.D1(b4.a.like, null, Long.valueOf(this.f133738d.f180750l), (b4.c) GalleryPager.this.f133722p1.a(), null);
                    }
                    GalleryPager.this.i0(new com.planner5d.library.model.k(aVar.a(), Boolean.valueOf(aVar.b() == enumC2327a)));
                }
                GalleryPager.this.U(true);
            }
        }
    }

    public GalleryPager() {
        com.planner5d.library.application.b.r().P(this);
    }

    public static /* synthetic */ com.planner5d.library.model.h[] B(int i10) {
        return new com.planner5d.library.model.h[i10];
    }

    private void Q(@NonNull View view) {
        View viewFindViewById = view.findViewById(com.planner5d.library.f.j.Ql);
        PreviewToolbarItem previewToolbarItem = (PreviewToolbarItem) view.findViewById(com.planner5d.library.f.j.Lf);
        view.findViewById(com.planner5d.library.f.j.If).setOnClickListener(this.f133716k);
        view.findViewById(com.planner5d.library.f.j.Nf).setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.gallery.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f133757a.V(view2);
            }
        });
        previewToolbarItem.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.gallery.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f133760a.W(view2);
            }
        });
        e0(viewFindViewById, previewToolbarItem);
    }

    @androidx.annotation.p0
    private com.planner5d.library.model.h R() {
        return this.f133726w ? this.f133725v.b(this.f133723s.getCurrentItem()) : S();
    }

    @m1
    private com.planner5d.library.model.h S() {
        return this.f133713h.a(new com.planner5d.library.services.utility.j(getArguments()).h(com.planner5d.library.services.r.model, null));
    }

    private com.planner5d.library.model.manager.q0.d T(com.planner5d.library.model.manager.q0.c cVar) {
        return new com.planner5d.library.model.manager.q0.d(new com.planner5d.library.services.utility.j(getArguments()).h(com.planner5d.library.services.r.filter, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void U(boolean z10) {
        com.planner5d.library.model.h hVarR = R();
        this.f133716k.c(hVarR, (b4.c) this.f133722p1.a());
        j0 j0Var = this.f133725v;
        ViewPager viewPager = this.f133723s;
        j0Var.e(viewPager, viewPager.getCurrentItem());
        if (z10) {
            this.f133720o.a().X(hVarR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(View view) {
        com.planner5d.library.model.h hVarR = R();
        if (hVarR == null) {
            return;
        }
        u2.D1(b4.a.share, null, Long.valueOf(hVarR.f180750l), (b4.c) this.f133722p1.a(), null);
        new com.planner5d.library.services.f0(requireContext(), hVarR, (b4.c) this.f133722p1.a()).a(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(View view) {
        h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(View view, PreviewToolbarItem previewToolbarItem, k0.a aVar) {
        view.setEnabled(!aVar.j());
        if (!this.f133714i.b()) {
            previewToolbarItem.setVisibility(8);
            return;
        }
        previewToolbarItem.setVisibility(0);
        boolean zI = aVar.i();
        previewToolbarItem.setImageResource(zI ? com.planner5d.library.f.h.f167646l8 : com.planner5d.library.f.h.f167665m8);
        previewToolbarItem.setDefaultTint(!zI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i11 - i13 != i15 - i17) {
            U(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit Z() {
        this.f133717l.f();
        return Unit.f312394a;
    }

    private void a0(com.planner5d.library.services.utility.j jVar) {
        ArrayList<Parcelable> arrayListR = jVar.r(com.planner5d.library.services.r.designsOfDay, null);
        if (arrayListR == null) {
            return;
        }
        this.f133719n.f(new b(jVar, arrayListR));
    }

    private void b0(m.a aVar, com.planner5d.library.model.manager.q0.c cVar) {
        com.planner5d.library.model.h[] hVarArr = (com.planner5d.library.model.h[]) aVar.f133805b.stream().map(new Function() { // from class: com.planner5d.library.activity.fragment.gallery.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((com.planner5d.library.model.k) obj).b();
            }
        }).toArray(new IntFunction() { // from class: com.planner5d.library.activity.fragment.gallery.c0
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return GalleryPager.B(i10);
            }
        });
        this.f133725v.a(hVarArr);
        com.planner5d.library.model.h hVarR = R();
        if (hVarR != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < hVarArr.length; i11++) {
                if (hVarArr[i11].f180740b.equals(hVarR.f180740b)) {
                    i10 = i11;
                }
            }
            this.f133723s.S(i10, false);
        }
        d0(cVar);
        this.f133726w = true;
    }

    private void c0(com.planner5d.library.model.manager.q0.c cVar) {
        m.a aVarA = this.f133718m.a(cVar);
        if (aVarA != null) {
            b0(aVarA, cVar);
            return;
        }
        com.planner5d.library.model.h hVarS = S();
        this.Y.a().p(getString(com.planner5d.library.f.s.on), false);
        this.f133724t.setVisibility(8);
        this.f133710e.r(T(cVar)).subscribe((Subscriber<? super com.planner5d.library.model.h[]>) new c(hVarS, cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(com.planner5d.library.model.manager.q0.c cVar) {
        if (this.X) {
            return;
        }
        this.Y.a().p(getString(com.planner5d.library.f.s.on), false);
        com.planner5d.library.model.manager.q0 q0Var = this.f133710e;
        j0 j0Var = this.f133725v;
        q0Var.q(new com.planner5d.library.model.manager.q0.d(j0Var.b(j0Var.getCount() - 1).f180740b, T(cVar))).subscribe((Subscriber<? super com.planner5d.library.model.h[]>) new d());
    }

    private void e0(final View view, final PreviewToolbarItem previewToolbarItem) {
        this.f133720o.a().W().k(getViewLifecycleOwner(), new d1() { // from class: com.planner5d.library.activity.fragment.gallery.e0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f133752a.X(view, previewToolbarItem, (k0.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(Throwable th2) {
        if (!ErrorMessageException.isWithCode(th2, com.planner5d.library.f.s.I9)) {
            this.f133717l.c(th2);
        } else {
            this.f133717l.h();
            this.f133721p0.a().f(new Function0() { // from class: com.planner5d.library.activity.fragment.gallery.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f133749a.Z();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(Long l10) {
        u2.D1(b4.a.open, p3.b.success, l10, (b4.c) this.f133722p1.a(), null);
    }

    private void h0() {
        com.planner5d.library.model.h hVarR = R();
        if (hVarR == null) {
            return;
        }
        int i10 = 2 ^ 1;
        this.f133720o.a().Z(true);
        U(false);
        le.o oVar = this.f133715j;
        Objects.requireNonNull(oVar);
        com.planner5d.library.services.utility.c0.z(hVarR, new o(oVar), androidx.lifecycle.m0.a(getViewLifecycleOwner().getLifecycle())).subscribe((Subscriber) new f(hVarR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(com.planner5d.library.model.k kVar) {
        if (kVar == null) {
            return;
        }
        this.f133725v.f(kVar.b());
        this.f133718m.c(kVar);
        com.planner5d.library.model.h hVarC = this.f133725v.c(kVar.b());
        this.f133710e.u(new com.planner5d.library.model.manager.q0.d(hVarC == null ? null : hVarC.f180740b, T(kVar.b().f180739a))).subscribe((Subscriber<? super com.planner5d.library.model.k[]>) new e(kVar));
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    public com.planner5d.library.activity.helper.ui.d getUiState(Context context) {
        return new com.planner5d.library.activity.helper.ui.d.b(context, this).x();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    public void onActivityCreatedExtended(Bundle bundle) {
        if (getArguments() == null) {
            this.f131538b.e(this.f133712g.d());
            return;
        }
        this.f133722p1.b(bundle, getArguments());
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        boolean z10 = true;
        boolean zF = jVar.f(com.planner5d.library.services.r.designOfDayNoCounters, false);
        com.planner5d.library.model.manager.q0.c cVar = new com.planner5d.library.model.manager.q0.d(jVar.h(com.planner5d.library.services.r.filter, null)).f197682c;
        ViewPager viewPager = this.f133723s;
        j0 j0Var = new j0(this.f133711f, this.Z, zF);
        this.f133725v = j0Var;
        viewPager.setAdapter(j0Var);
        this.f133723s.c(new a(cVar));
        this.f133723s.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.planner5d.library.activity.fragment.gallery.a0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.f133744a.Y(view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        this.Y.a().l(Integer.valueOf(com.planner5d.library.widget.preloader.h0.f258546c));
        if (zF) {
            a0(jVar);
        } else {
            c0(cVar);
        }
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        com.planner5d.library.model.h hVarR = R();
        u2.D1(b4.a.back, null, Long.valueOf(hVarR != null ? hVarR.f180750l : 0L), (b4.c) this.f133722p1.a(), null);
        return false;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    public View onCreateViewExtended(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.Z = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.P1, viewGroup, false);
        this.Y.b(viewInflate);
        this.f133723s = (ViewPager) viewInflate.findViewById(com.planner5d.library.f.j.f168288ok);
        this.f133724t = (TextView) viewInflate.findViewById(com.planner5d.library.f.j.f168064fc);
        Q(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        this.f133722p1.c(bundle);
        super.onSaveInstanceState(bundle);
    }
}

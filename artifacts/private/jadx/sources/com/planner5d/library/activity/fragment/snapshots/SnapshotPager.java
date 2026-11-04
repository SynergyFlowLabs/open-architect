package com.planner5d.library.activity.fragment.snapshots;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessage;
import com.planner5d.library.activity.helper.f1;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.d4;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.u2;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.n3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.menu.SimpleBottomSheetMenuFragment;
import com.planner5d.library.widget.previewtoolbar.PreviewToolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes6.dex */
public class SnapshotPager extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    private PopupWindow X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b4.c f135882e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.b4 f135884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    protected d4 f135885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.c0 f135886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ij.a
    protected y1 f135887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.activity.fragment.dialog.k f135888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ij.a
    protected y0 f135889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ij.a
    protected f1 f135890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @ij.a
    protected n0 f135891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.t f135892o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @ij.a
    protected b2 f135895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.application.b f135896t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ViewPager f135897v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private PreviewToolbar f135898w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.model.manager.statistics.c<b4.c> f135883f = new com.planner5d.library.model.manager.statistics.c<>();
    private boolean Y = false;
    private final com.planner5d.library.widget.preloader.t Z = new com.planner5d.library.widget.preloader.t();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final androidx.lifecycle.d1<List<Snapshot>> f135893p0 = new androidx.lifecycle.d1() { // from class: com.planner5d.library.activity.fragment.snapshots.f0
        @Override // androidx.lifecycle.d1
        public final void c(Object obj) {
            SnapshotPager.R((List) obj);
        }
    };

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final n3<k0> f135894p1 = t3.e(this, k0.class);

    class a implements ViewPager.j {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            SnapshotPager.this.H0();
        }
    }

    class b extends com.planner5d.library.services.rx.e<List<? extends gd.b>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f135900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f135901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f135902f;

        b(Long l10, String str, Integer num) {
            this.f135900d = l10;
            this.f135901e = str;
            this.f135902f = num;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            throw new RuntimeException(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(List<? extends gd.b> list) {
            SnapshotPager.this.Y = true;
            if (list.isEmpty()) {
                ((FragmentController) SnapshotPager.this).f131538b.e(SnapshotPager.this.f135887j.d());
                return;
            }
            SnapshotPager snapshotPager = SnapshotPager.this;
            snapshotPager.f135889l.e(list, snapshotPager.f135897v);
            if (this.f135900d != null) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    gd.b bVar = list.get(i10);
                    if (bVar.getId().longValue() == this.f135900d.longValue() && bVar.getClass().getName().equals(this.f135901e)) {
                        SnapshotPager.this.f135897v.S(i10, false);
                        break;
                    }
                }
            } else if (this.f135902f != null) {
                SnapshotPager.this.f135897v.S(this.f135902f.intValue(), false);
            }
            SnapshotPager.this.v0();
        }
    }

    class c extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ gd.b f135904d;

        c(gd.b bVar) {
            this.f135904d = bVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            u2.D1(b4.a.archive, p3.b.error, this.f135904d.d(), SnapshotPager.this.f135882e, this.f135904d);
            throw new RuntimeException(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            y0 y0Var = SnapshotPager.this.f135889l;
            if (y0Var != null) {
                y0Var.d(this.f135904d);
                if (SnapshotPager.this.f135889l.getCount() <= 0) {
                    ((FragmentController) SnapshotPager.this).f131538b.e(SnapshotPager.this.f135887j.d());
                    return;
                }
            }
            SnapshotPager.this.Z.b(SnapshotPager.this.getView()).b();
            SnapshotPager.this.f135891n.c0();
            u2.D1(b4.a.archive, p3.b.success, this.f135904d.d(), SnapshotPager.this.f135882e, this.f135904d);
        }
    }

    class d extends com.planner5d.library.services.rx.e<Snapshot> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b4.e f135906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ gd.b f135907e;

        d(b4.e eVar, gd.b bVar) {
            this.f135906d = eVar;
            this.f135907e = bVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            u2.H1(this.f135906d, b4.d.cloud, p3.b.error, this.f135907e.d());
            throw new RuntimeException(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Snapshot snapshot) {
            SnapshotPager.this.Z.b(SnapshotPager.this.getView()).b();
            SnapshotPager snapshotPager = SnapshotPager.this;
            snapshotPager.w0(null, null, Integer.valueOf(snapshotPager.i0()), false);
            SnapshotPager.this.f135891n.c0();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            u2.H1(this.f135906d, b4.d.cloud, p3.b.success, this.f135907e.d());
        }
    }

    public SnapshotPager() {
        com.planner5d.library.application.b.r().e0(this);
    }

    private void A0(@NonNull View view, boolean z10) {
        PopupWindow popupWindow;
        if (z10 && this.X == null) {
            te.l0 l0VarC = te.l0.c(getLayoutInflater());
            l0VarC.getRoot().setPadding(0, 0, 0, 0);
            l0VarC.f380956c.setText(com.planner5d.library.f.s.jt);
            this.X = y3.G(l0VarC.getRoot(), view, 49, 0, Math.round(l0VarC.f380955b.getPointerHeight()), true, true, false, requireActivity().getWindow(), new PopupWindow.OnDismissListener() { // from class: com.planner5d.library.activity.fragment.snapshots.p
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f136081a.q0();
                }
            });
            return;
        }
        if (z10 || (popupWindow = this.X) == null) {
            return;
        }
        popupWindow.dismiss();
        this.X = null;
    }

    private void B0(@NonNull View view, @androidx.annotation.d0 int i10, @NonNull final Consumer<gd.b> consumer) {
        final View viewFindViewById = view.findViewById(i10);
        final WeakReference weakReference = new WeakReference(viewFindViewById);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.snapshots.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f136089a.r0(viewFindViewById, weakReference, consumer, view2);
            }
        });
    }

    private void C0(View view) {
        new com.planner5d.library.widget.d().b(view, requireActivity().getOnBackPressedDispatcher());
    }

    private void D0(@androidx.annotation.p0 View view) {
        final View viewFindViewById = view == null ? null : view.findViewById(com.planner5d.library.f.j.Jf);
        final View viewFindViewById2 = view != null ? view.findViewById(com.planner5d.library.f.j.Kf) : null;
        if (viewFindViewById == null || viewFindViewById2 == null) {
            return;
        }
        this.f135894p1.a().W().k(getViewLifecycleOwner(), new androidx.lifecycle.d1() { // from class: com.planner5d.library.activity.fragment.snapshots.h0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                viewFindViewById.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
            }
        });
        this.f135894p1.a().Y().k(getViewLifecycleOwner(), new androidx.lifecycle.d1() { // from class: com.planner5d.library.activity.fragment.snapshots.i0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                viewFindViewById2.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
            }
        });
        this.f135894p1.a().a0().k(getViewLifecycleOwner(), new androidx.lifecycle.d1() { // from class: com.planner5d.library.activity.fragment.snapshots.j0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f136034a.s0(viewFindViewById2, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(gd.b bVar) {
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            u2.D1(b4.a.share, null, bVar.d(), this.f135882e, bVar);
            vd.b bVarJ = bVar.j();
            new com.planner5d.library.services.f0(activity, bVar).b(getActivity(), bVarJ != null ? bVarJ.f385735f : b4.e.snapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(@NonNull gd.b bVar) {
        this.f135894p1.a().d0(bVar);
        this.f131538b.f(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ImproveSnapshotWithAi.class, new com.planner5d.library.services.utility.i().g(com.planner5d.library.services.r.id, bVar.getId().longValue()).a()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(final gd.b bVar) {
        m mVar = new m(bVar);
        final ArrayList arrayList = new ArrayList();
        if (mVar.d()) {
            arrayList.add(new com.planner5d.library.widget.menu.y(com.planner5d.library.f.s.fp, new Function0() { // from class: com.planner5d.library.activity.fragment.snapshots.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f136098a.u0(bVar);
                }
            }));
        }
        if (mVar.e()) {
            arrayList.add(new com.planner5d.library.widget.menu.y(com.planner5d.library.f.s.gp, new Function0() { // from class: com.planner5d.library.activity.fragment.snapshots.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f136100a.t0(bVar);
                }
            }));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.c(com.planner5d.library.services.r.bottomSheetRequest.f224891a, this, new androidx.fragment.app.o0() { // from class: com.planner5d.library.activity.fragment.snapshots.z
            @Override // androidx.fragment.app.o0
            public final void a(String str, Bundle bundle) {
                arrayList.stream().filter(new Predicate() { // from class: com.planner5d.library.activity.fragment.snapshots.t
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return SnapshotPager.S(bundle, (com.planner5d.library.widget.menu.y) obj);
                    }
                }).findFirst().ifPresent(new Consumer() { // from class: com.planner5d.library.activity.fragment.snapshots.u
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((com.planner5d.library.widget.menu.y) obj).a().invoke();
                    }
                });
            }
        });
        new SimpleBottomSheetMenuFragment(getString(com.planner5d.library.f.s.Nd), null, arrayList).showMenu(parentFragmentManager, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() {
        this.f135894p1.a().f0(h0());
    }

    private void I0() {
        ConstraintLayout.b bVar = (ConstraintLayout.b) this.f135898w.getLayoutParams();
        if (h3.W(requireContext())) {
            bVar.G = 0.5f;
        } else {
            bVar.G = 1.0f;
        }
        this.f135898w.setLayoutParams(bVar);
    }

    public static /* synthetic */ void R(List list) {
    }

    public static /* synthetic */ boolean S(Bundle bundle, com.planner5d.library.widget.menu.y yVar) {
        return yVar.b() == bundle.getInt(com.planner5d.library.services.r.bottomSheetResultBundle.f224891a);
    }

    private com.planner5d.library.model.u e0() {
        return new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Error, new k3(com.planner5d.library.f.s.Ga, new Object[0]), new com.planner5d.library.model.u.a[0]);
    }

    private com.planner5d.library.model.u f0() {
        return new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Info, new k3(com.planner5d.library.f.s.MF, new Object[0]), new com.planner5d.library.model.u.a[0]);
    }

    private void g0(gd.b bVar, boolean z10) {
        this.Z.a().b();
        this.f135895s.e(z10 ? e0() : f0());
        u2.D1(b4.a.download, z10 ? p3.b.error : p3.b.success, bVar.d(), this.f135882e, bVar);
    }

    private gd.b h0() {
        y0 y0Var = this.f135889l;
        if (y0Var == null) {
            return null;
        }
        return y0Var.b(i0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i0() {
        ViewPager viewPager = this.f135897v;
        if (viewPager == null) {
            return 0;
        }
        return viewPager.getCurrentItem();
    }

    private b4.e j0(vd.b bVar) {
        if (bVar == vd.b.DRAFT) {
            return b4.e.draft;
        }
        if (bVar == vd.b.HD) {
            return b4.e.hd;
        }
        return bVar == vd.b.PRO4K ? b4.e.pro4k : b4.e.screenshot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(Integer num) {
        if (this.Y) {
            w0(null, null, Integer.valueOf(i0()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable m0(Folder folder) {
        id.a aVarA = this.f135892o.a();
        final d4 d4Var = this.f135885h;
        Objects.requireNonNull(d4Var);
        return com.planner5d.library.services.utility.c0.u(aVarA, folder, new com.planner5d.library.services.utility.p3() { // from class: com.planner5d.library.activity.fragment.snapshots.a0
            @Override // com.planner5d.library.services.utility.p3
            public final Object a(Object obj, Object obj2, Object obj3) {
                return d4Var.f((id.a) obj, (Folder) obj2, (kotlin.coroutines.d) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(gd.b bVar, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            u2.D1(b4.a.archive, p3.b.submit, bVar.d(), this.f135882e, bVar);
            this.Z.b(getView()).p(getString(com.planner5d.library.f.s.jz), false);
            this.f135884g.M(getActivity(), this.f135892o.a(), bVar).subscribe((Subscriber<? super Void>) new c(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(gd.b bVar, String str) {
        g0(bVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(gd.b bVar, Throwable th2) {
        g0(bVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0() {
        this.X = null;
        this.f135894p1.a().c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(View view, final WeakReference weakReference, Consumer consumer, View view2) {
        view.setEnabled(false);
        view.postDelayed(new Runnable() { // from class: com.planner5d.library.activity.fragment.snapshots.b0
            @Override // java.lang.Runnable
            public final void run() {
                SnapshotPager.y(weakReference);
            }
        }, TimeUnit.SECONDS.toMillis(1L));
        gd.b bVarH0 = h0();
        if (bVarH0 != null) {
            consumer.accept(bVarH0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(View view, Boolean bool) {
        A0(view, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit t0(gd.b bVar) {
        y0(bVar, vd.b.HD);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit u0(gd.b bVar) {
        y0(bVar, vd.b.DRAFT);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        this.Z.b(getView()).b();
        H0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(Long l10, String str, Integer num, boolean z10) {
        if (z10) {
            this.Z.b(getView()).p(getString(com.planner5d.library.f.s.xn), false);
        }
        if (this.f135897v.getAdapter() == null) {
            this.f135897v.setAdapter(this.f135889l);
        }
        this.f135886i.E(this.f135892o.a(), new com.planner5d.library.services.utility.j(getArguments()).h(com.planner5d.library.services.r.folder, null)).flatMap(new Func1() { // from class: com.planner5d.library.activity.fragment.snapshots.o
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f136077a.m0((Folder) obj);
            }
        }).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new b(l10, str, num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(final gd.b bVar) {
        u2.D1(b4.a.archive, null, bVar.d(), this.f135882e, bVar);
        ConfirmDeleteMessage.show(this.f135888k, getString(com.planner5d.library.f.s.LC), new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.snapshots.g0
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                this.f136006a.n0(bVar, (Boolean) obj);
            }
        });
    }

    public static /* synthetic */ void y(WeakReference weakReference) {
        View view = (View) weakReference.get();
        if (view != null) {
            view.setEnabled(true);
        }
    }

    private void y0(gd.b bVar, vd.b bVar2) {
        b4.e eVarJ0 = j0(bVar2);
        u2.H1(eVarJ0, b4.d.cloud, p3.b.submit, bVar.d());
        this.f135890m.d(getView(), getString(com.planner5d.library.f.s.f169364q5), (Snapshot) bVar, 0L, null, null, new gd.a(bVar2, false, false)).subscribe((Subscriber<? super Snapshot>) new d(eVarJ0, bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public void l0(View view, final gd.b bVar) {
        u2.D1(b4.a.download, null, bVar.d(), this.f135882e, bVar);
        this.Z.b(view).p(getString(com.planner5d.library.f.s.FA), true);
        this.f135884g.L0(getActivity(), bVar).subscribe(new Action1() { // from class: com.planner5d.library.activity.fragment.snapshots.q
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f136083a.o0(bVar, (String) obj);
            }
        }, new Action1() { // from class: com.planner5d.library.activity.fragment.snapshots.r
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f136086a.p0(bVar, (Throwable) obj);
            }
        });
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    public com.planner5d.library.activity.helper.ui.d getUiState(Context context) {
        return new com.planner5d.library.activity.helper.ui.d.b(context, this).J(2).N(false).F(false).A(R.color.transparent).x();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    public void onActivityCreatedExtended(Bundle bundle) {
        View view = getView();
        if (view == null) {
            return;
        }
        v1.f229769a.o(this, com.planner5d.library.services.m0.f224431d, new androidx.lifecycle.d1() { // from class: com.planner5d.library.activity.fragment.snapshots.v
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f136097a.k0((Integer) obj);
            }
        });
        this.Z.b(view).l(Integer.valueOf(com.planner5d.library.widget.preloader.h0.f258546c));
        this.f135897v = (ViewPager) view.findViewById(com.planner5d.library.f.j.f168288ok);
        this.f135898w = (PreviewToolbar) view.findViewById(com.planner5d.library.f.j.Rl);
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.position;
        if (jVar.a(rVar)) {
            w0(null, null, Integer.valueOf(jVar.c(rVar, 0)), true);
        } else {
            this.f135882e = (b4.c) this.f135883f.a(getArguments(), b4.c.gallery);
            com.planner5d.library.services.utility.j jVar2 = new com.planner5d.library.services.utility.j(getArguments());
            w0(Long.valueOf(jVar2.d(com.planner5d.library.services.r.id, 0L)), jVar2.t(com.planner5d.library.services.r.className, null), null, true);
        }
        this.f135897v.c(new a());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I0();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    public View onCreateViewExtended(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        final View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.J2, viewGroup, false);
        B0(viewInflate, com.planner5d.library.f.j.If, new Consumer() { // from class: com.planner5d.library.activity.fragment.snapshots.n
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f136066a.l0(viewInflate, (gd.b) obj);
            }
        });
        B0(viewInflate, com.planner5d.library.f.j.Kf, new Consumer() { // from class: com.planner5d.library.activity.fragment.snapshots.y
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f136103a.F0((gd.b) obj);
            }
        });
        B0(viewInflate, com.planner5d.library.f.j.Nf, new Consumer() { // from class: com.planner5d.library.activity.fragment.snapshots.c0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f135931a.E0((gd.b) obj);
            }
        });
        B0(viewInflate, com.planner5d.library.f.j.Jf, new Consumer() { // from class: com.planner5d.library.activity.fragment.snapshots.d0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f135984a.G0((gd.b) obj);
            }
        });
        B0(viewInflate, com.planner5d.library.f.j.Hf, new Consumer() { // from class: com.planner5d.library.activity.fragment.snapshots.e0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f135996a.x0((gd.b) obj);
            }
        });
        C0(viewInflate);
        D0(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f135889l.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f135891n.b0().p(this.f135893p0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f135897v != null) {
            bundle.putInt(com.planner5d.library.services.r.position.f224891a, i0());
        }
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void v(@androidx.annotation.p0 Bundle bundle) {
        this.f135891n.b0().k(this, this.f135893p0);
    }
}

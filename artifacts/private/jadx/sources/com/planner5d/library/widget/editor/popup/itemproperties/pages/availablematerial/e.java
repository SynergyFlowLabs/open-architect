package com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.b7;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.y;
import com.planner5d.library.model.z;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.GridLayoutManagerItemDecorationInvalidation;
import com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n;
import com.planner5d.library.widget.editor.popup.properties.adapter.q;
import com.planner5d.library.widget.j0;
import com.planner5d.library.widget.preloader.t;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.k0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAvailableMaterialsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvailableMaterialsView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/availablematerial/AvailableMaterialsView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,157:1\n257#2,2:158\n257#2,2:160\n*S KotlinDebug\n*F\n+ 1 AvailableMaterialsView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/availablematerial/AvailableMaterialsView\n*L\n139#1:158,2\n151#1:160,2\n*E\n"})
public final class e extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f257321i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f257322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f257323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CompositeSubscription f257324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b7 f257325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t f257326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f257327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final q f257328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final GridLayoutManagerItemDecorationInvalidation f257329h;

    public static final class a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<com.planner5d.library.widget.editor.popup.properties.adapter.b<y>> f257330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f257331f;

        a(List<com.planner5d.library.widget.editor.popup.properties.adapter.b<y>> list, e eVar) {
            this.f257330e = list;
            this.f257331f = eVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            if (this.f257330e.get(i10).b()) {
                return this.f257331f.f257327f - (i10 % this.f257331f.f257327f);
            }
            return 1;
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f257332a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f257332a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f257332a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f257332a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final class c extends com.planner5d.library.services.rx.e<y> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f257333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f257334e;

        c(q qVar, e eVar) {
            this.f257333d = qVar;
            this.f257334e = eVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            timber.log.b.f381052a.d("Failed to select texture", new Object[0]);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(y value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f257333d.B(value);
            this.f257334e.f257322a.r0(value);
        }
    }

    public static final class d extends com.planner5d.library.services.rx.e<Void> {
        d() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r10) throws Throwable {
            e.this.f257323b.k0();
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.e$e, reason: collision with other inner class name */
    public static final class C1741e extends com.planner5d.library.services.rx.e<y> {
        C1741e() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(y value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e.this.f257322a.s0(value);
        }
    }

    public static final class f extends q {
        f(Context context, com.planner5d.library.services.bitmaploader.target.h hVar, p0 p0Var) {
            super(context, p0Var, hVar);
        }

        @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
        protected Integer j() {
            return Integer.valueOf(com.planner5d.library.f.h.f167792t2);
        }

        @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
        protected Integer l() {
            return Integer.valueOf(com.planner5d.library.f.h.f167720p6);
        }

        @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
        protected boolean m() {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @NotNull k viewModel, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull o0 lifecycleOwner, @NotNull n textureAddPreviewViewModel, @NotNull CompositeSubscription subscriptions) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(textureAddPreviewViewModel, "textureAddPreviewViewModel");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.f257322a = viewModel;
        this.f257323b = textureAddPreviewViewModel;
        this.f257324c = subscriptions;
        b7 b7VarB = b7.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b7VarB, "inflate(...)");
        this.f257325d = b7VarB;
        this.f257326e = new t();
        this.f257327f = 3;
        this.f257328g = new f(context, bitmapTargetManager, viewModel.c0());
        RecyclerView materialsRecycler = b7VarB.f158765g;
        Intrinsics.checkNotNullExpressionValue(materialsRecycler, "materialsRecycler");
        GridLayoutManagerItemDecorationInvalidation gridLayoutManagerItemDecorationInvalidation = new GridLayoutManagerItemDecorationInvalidation(materialsRecycler, 3);
        b7VarB.f158765g.setLayoutManager(gridLayoutManagerItemDecorationInvalidation);
        this.f257329h = gridLayoutManagerItemDecorationInvalidation;
        setupRecycler(lifecycleOwner);
        setupPreloader(lifecycleOwner);
        j(lifecycleOwner);
        h(lifecycleOwner);
    }

    private final void h(o0 o0Var) {
        this.f257322a.Z().k(o0Var, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.i(this.f257317a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(e eVar, List list) {
        eVar.f257325d.f158765g.M1(0);
        eVar.n(list.isEmpty());
        eVar.f257328g.y(list, eVar.f257322a.f0(), null);
        q qVar = eVar.f257328g;
        ze.c cVarF = eVar.f257322a.i0().f();
        qVar.B(cVarF != null ? cVarF.g() : null);
        eVar.f257329h.R3(new a(list, eVar));
        return Unit.f312394a;
    }

    private final void j(o0 o0Var) {
        this.f257322a.b0().k(o0Var, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.k(this.f257319a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(e eVar, List list) {
        eVar.f257328g.P(list);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(e eVar, com.planner5d.library.widget.editor.popup.itemproperties.x xVar) {
        if (xVar instanceof com.planner5d.library.widget.editor.popup.itemproperties.x.c) {
            eVar.n(false);
            eVar.f257326e.a().p(eVar.getContext().getString(com.planner5d.library.f.s.qn), true);
        } else if (xVar instanceof com.planner5d.library.widget.editor.popup.itemproperties.x.b) {
            eVar.f257326e.a().b();
        } else {
            if (!(xVar instanceof com.planner5d.library.widget.editor.popup.itemproperties.x.a)) {
                throw new k0();
            }
            eVar.n(false);
            eVar.f257326e.a().b();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(e eVar, z zVar) {
        if (zVar != null) {
            eVar.f257322a.l0(zVar);
        }
        return Unit.f312394a;
    }

    private final void n(boolean z10) {
        LinearLayout materialsPlaceholder = this.f257325d.f158760b;
        Intrinsics.checkNotNullExpressionValue(materialsPlaceholder, "materialsPlaceholder");
        materialsPlaceholder.setVisibility(z10 ? 0 : 8);
        if (z10) {
            z zVarF = this.f257322a.j0().f();
            if (Intrinsics.areEqual(zVarF, k5.f191817u)) {
                this.f257325d.f158763e.setText(com.planner5d.library.f.s.W7);
                this.f257325d.f158762d.setText(com.planner5d.library.f.s.V7);
            } else if (Intrinsics.areEqual(zVarF, k5.f191818v)) {
                this.f257325d.f158763e.setText(com.planner5d.library.f.s.f169005b8);
                this.f257325d.f158762d.setText(com.planner5d.library.f.s.f168980a8);
            } else {
                LinearLayout materialsPlaceholder2 = this.f257325d.f158760b;
                Intrinsics.checkNotNullExpressionValue(materialsPlaceholder2, "materialsPlaceholder");
                materialsPlaceholder2.setVisibility(8);
            }
        }
    }

    private final void setupPreloader(o0 o0Var) {
        this.f257326e.b(this.f257325d.f158764f).g(Integer.valueOf(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.Xn))).h(Integer.valueOf(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166273bi)));
        this.f257322a.g0().k(o0Var, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.l(this.f257320a, (com.planner5d.library.widget.editor.popup.itemproperties.x) obj);
            }
        }));
    }

    private final void setupRecycler(o0 o0Var) {
        RecyclerView recyclerView = this.f257325d.f158765g;
        q qVar = this.f257328g;
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.z1(0);
        }
        recyclerView.n(new j0(recyclerView.getResources().getDimensionPixelSize(qVar.q())));
        ze.c cVarF = this.f257322a.i0().f();
        qVar.E(cVarF != null ? cVarF.g() : null);
        this.f257324c.add(qVar.u().subscribe((Subscriber) new c(qVar, this)));
        this.f257324c.add(qVar.k().subscribe((Subscriber<? super Void>) new d()));
        this.f257324c.add(qVar.K().subscribe((Subscriber<? super y>) new C1741e()));
        recyclerView.setAdapter(qVar);
        this.f257322a.j0().k(o0Var, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.m(this.f257318a, (z) obj);
            }
        }));
    }
}

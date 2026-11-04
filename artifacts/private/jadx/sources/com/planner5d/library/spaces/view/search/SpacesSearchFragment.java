package com.planner5d.library.spaces.view.search;

import android.R;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.navigation.c2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.g0;
import androidx.transition.n0;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.planner5d.library.services.utility.l1;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.TextInputEditTextCompat;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSpacesSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesSearchFragment.kt\ncom/planner5d/library/spaces/view/search/SpacesSearchFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,147:1\n16#2:148\n*S KotlinDebug\n*F\n+ 1 SpacesSearchFragment.kt\ncom/planner5d/library/spaces/view/search/SpacesSearchFragment\n*L\n34#1:148\n*E\n"})
public final class SpacesSearchFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f230436a = new i2(j1.d(y.class), new e(), new f(com.planner5d.library.spaces.application.e.f229982b.a()), null, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ee.e f230437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.activity.result.h<String[]> f230438c;

    static final class a<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearProgressIndicator f230439a;

        a(LinearProgressIndicator linearProgressIndicator) {
            this.f230439a = linearProgressIndicator;
        }

        public final Object a(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
            if (z10) {
                this.f230439a.q();
            } else {
                this.f230439a.j();
            }
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
            return a(((Boolean) obj).booleanValue(), dVar);
        }
    }

    public static final class b extends ef.c {
        b() {
        }

        @Override // ef.c
        public Integer a(g3 insets) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            return Integer.valueOf(insets.f(g3.m.d()).f47826d);
        }

        @Override // ef.c
        public Integer e(g3 insets) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            return Integer.valueOf(insets.f(g3.m.h()).f47824b);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.search.SpacesSearchFragment$onCreateView$1$3", f = "SpacesSearchFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<Editable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f230441b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = SpacesSearchFragment.this.new c(dVar);
            cVar.f230441b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f230440a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SpacesSearchFragment.this.y().A0(((Editable) this.f230441b).toString());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Editable editable, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(editable, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class d implements com.planner5d.library.spaces.view.search.e.a {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
            Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
            Intrinsics.checkNotNullParameter(it, "it");
            runIfDirectionsAvailable.m0(it);
            return Unit.f312394a;
        }

        @Override // com.planner5d.library.spaces.view.search.e.a
        public void a() {
            SpacesSearchFragment.this.y().w0();
            if (SpacesSearchFragment.this.y().l0()) {
                SpacesSearchFragment.this.y().y0();
            } else {
                SpacesSearchFragment.this.requestPermissions();
            }
        }

        @Override // com.planner5d.library.spaces.view.search.e.a
        public void b(i item) {
            Intrinsics.checkNotNullParameter(item, "item");
            SpacesSearchFragment.this.y().t0(item.a());
            com.planner5d.library.util.navigation.k.f240224a.d(androidx.navigation.fragment.f.a(SpacesSearchFragment.this), SpacesSearchFragment.this.y().j0(item.a()), new Function2() { // from class: com.planner5d.library.spaces.view.search.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SpacesSearchFragment.d.e((androidx.navigation.w0) obj, (c2) obj2);
                }
            });
        }

        @Override // com.planner5d.library.spaces.view.search.e.a
        public void c() {
            SpacesSearchFragment.this.y().k0();
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SpacesSearchFragment.kt\ncom/planner5d/library/spaces/view/search/SpacesSearchFragment\n*L\n1#1,16:1\n34#2:17\n*E\n"})
    public static final class e implements Function0<l2> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SpacesSearchFragment.this.getViewModelStore();
        }
    }

    public static final class f implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230445a;

        public f(com.planner5d.library.view.b bVar) {
            this.f230445a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230445a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(SpacesSearchFragment spacesSearchFragment, Map map) {
        Object obj = map.get("android.permission.ACCESS_FINE_LOCATION");
        Boolean bool = Boolean.TRUE;
        boolean zAreEqual = Intrinsics.areEqual(obj, bool);
        boolean zAreEqual2 = Intrinsics.areEqual(map.get("android.permission.ACCESS_COARSE_LOCATION"), bool);
        if (zAreEqual || zAreEqual2) {
            spacesSearchFragment.y().y0();
        } else {
            spacesSearchFragment.y().s0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SpacesSearchFragment spacesSearchFragment, View view) {
        spacesSearchFragment.y().v0();
        androidx.navigation.fragment.f.a(spacesSearchFragment).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SpacesSearchFragment spacesSearchFragment) {
        ee.e eVar = spacesSearchFragment.f230437b;
        ee.e eVar2 = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        eVar.f274794b.requestFocus();
        ee.e eVar3 = spacesSearchFragment.f230437b;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            eVar2 = eVar3;
        }
        com.planner5d.library.services.s.f(eVar2.f274794b, true);
    }

    @e.a({"MissingPermission"})
    private final void D(final RecyclerView recyclerView) {
        final com.planner5d.library.spaces.view.search.e eVar = new com.planner5d.library.spaces.view.search.e(new d());
        recyclerView.setAdapter(eVar);
        n1.a(this, y().h0(), new Function1() { // from class: com.planner5d.library.spaces.view.search.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpacesSearchFragment.E(eVar, recyclerView, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(com.planner5d.library.spaces.view.search.e eVar, final RecyclerView recyclerView, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        eVar.l(it, new Runnable() { // from class: com.planner5d.library.spaces.view.search.s
            @Override // java.lang.Runnable
            public final void run() {
                SpacesSearchFragment.F(recyclerView);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(RecyclerView recyclerView) {
        recyclerView.M1(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y y() {
        return (y) this.f230436a.getValue();
    }

    private final void z(LinearProgressIndicator linearProgressIndicator) {
        l1.c(l1.f225303a, this, y().i0(), null, new a(linearProgressIndicator), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    @e.a({"MissingPermission"})
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        g0 g0VarF = n0.d(requireContext()).f(R.transition.move);
        Intrinsics.checkNotNullExpressionValue(g0VarF, "inflateTransition(...)");
        setSharedElementEnterTransition(g0VarF);
        setSharedElementReturnTransition(g0VarF);
        this.f230438c = registerForActivityResult(new g.b.k(), new androidx.activity.result.a() { // from class: com.planner5d.library.spaces.view.search.t
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                SpacesSearchFragment.A(this.f230486a, (Map) obj);
            }
        });
        y().B0();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ee.e eVarD = ee.e.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(eVarD, "inflate(...)");
        u1.j2(eVarD.getRoot(), new b());
        eVarD.f274797e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.search.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpacesSearchFragment.B(this.f230483a, view);
            }
        });
        RecyclerView addressResultList = eVarD.f274796d;
        Intrinsics.checkNotNullExpressionValue(addressResultList, "addressResultList");
        D(addressResultList);
        y3 y3Var = y3.f229862a;
        TextInputEditTextCompat addressInput = eVarD.f274794b;
        Intrinsics.checkNotNullExpressionValue(addressInput, "addressInput");
        kotlinx.coroutines.flow.i iVarH1 = kotlinx.coroutines.flow.k.h1(y3.J(y3Var, addressInput, 0L, 1, null), new c(null));
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.flow.k.W0(iVarH1, p0.a(viewLifecycleOwner));
        LinearProgressIndicator progressIndicator = eVarD.f274799g;
        Intrinsics.checkNotNullExpressionValue(progressIndicator, "progressIndicator");
        z(progressIndicator);
        this.f230437b = eVarD;
        ConstraintLayout root = eVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ee.e eVar = this.f230437b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        eVar.f274794b.post(new Runnable() { // from class: com.planner5d.library.spaces.view.search.r
            @Override // java.lang.Runnable
            public final void run() {
                SpacesSearchFragment.C(this.f230484a);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        y().u0();
    }

    public final void requestPermissions() {
        androidx.activity.result.h<String[]> hVar = this.f230438c;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationPermissionRequest");
            hVar = null;
        }
        hVar.b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }
}

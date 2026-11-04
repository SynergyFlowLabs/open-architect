package com.planner5d.library.spaces.view.loading;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.navigation.c2;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSpacesLoadingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesLoadingFragment.kt\ncom/planner5d/library/spaces/view/loading/SpacesLoadingFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils\n*L\n1#1,113:1\n16#2:114\n190#3,12:115\n*S KotlinDebug\n*F\n+ 1 SpacesLoadingFragment.kt\ncom/planner5d/library/spaces/view/loading/SpacesLoadingFragment\n*L\n31#1:114\n69#1:115,12\n*E\n"})
public final class SpacesLoadingFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f230348a = new i2(j1.d(q.class), new d(), new e(com.planner5d.library.spaces.application.e.f229982b.a()), null, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ee.d f230349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f230350c;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f230351a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f230351a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f230351a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f230351a.invoke(obj);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.loading.SpacesLoadingFragment", f = "SpacesLoadingFragment.kt", i = {0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.f160733u1, 110}, m = "scrollIndefinitely", n = {"this", "row", "interval"}, s = {"L$0", "L$1", "J$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f230353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f230354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f230355d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230357f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230355d = obj;
            this.f230357f |= Integer.MIN_VALUE;
            return SpacesLoadingFragment.this.D(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.loading.SpacesLoadingFragment$setupTextSwitcher$2", f = "SpacesLoadingFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230358a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String[] f230360c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.loading.SpacesLoadingFragment$setupTextSwitcher$2$1", f = "SpacesLoadingFragment.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160715o1}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f230361a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SpacesLoadingFragment f230362b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String[] f230363c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SpacesLoadingFragment spacesLoadingFragment, String[] strArr, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f230362b = spacesLoadingFragment;
                this.f230363c = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f230362b, this.f230363c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f230361a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    SpacesLoadingFragment spacesLoadingFragment = this.f230362b;
                    String[] strArr = this.f230363c;
                    long integer = spacesLoadingFragment.getResources().getInteger(de.b.j.f272445d);
                    this.f230361a = 1;
                    if (spacesLoadingFragment.D(strArr, integer, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String[] strArr, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f230360c = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return SpacesLoadingFragment.this.new c(this.f230360c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230358a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0 viewLifecycleOwner = SpacesLoadingFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.c0.b bVar = androidx.lifecycle.c0.b.STARTED;
                a aVar = new a(SpacesLoadingFragment.this, this.f230360c, null);
                this.f230358a = 1;
                if (androidx.lifecycle.j1.b(viewLifecycleOwner, bVar, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SpacesLoadingFragment.kt\ncom/planner5d/library/spaces/view/loading/SpacesLoadingFragment\n*L\n1#1,16:1\n31#2:17\n*E\n"})
    public static final class d implements Function0<l2> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SpacesLoadingFragment.this.getViewModelStore();
        }
    }

    public static final class e implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230365a;

        public e(com.planner5d.library.view.b bVar) {
            this.f230365a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230365a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SpacesLoadingFragment spacesLoadingFragment, View view) {
        spacesLoadingFragment.y().b0();
        androidx.navigation.fragment.f.a(spacesLoadingFragment).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(SpacesLoadingFragment spacesLoadingFragment, ee.d dVar, q.a aVar) {
        if (aVar instanceof q.a.b) {
            spacesLoadingFragment.z(((q.a.b) aVar).a());
        } else {
            if (!Intrinsics.areEqual(aVar, q.a.C1702a.f230402b)) {
                throw new k0();
            }
            spacesLoadingFragment.x(dVar.getRoot());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r8.D(r9, r10, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(java.lang.String[] r9, long r10, kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.planner5d.library.spaces.view.loading.SpacesLoadingFragment.b
            if (r0 == 0) goto L14
            r0 = r12
            com.planner5d.library.spaces.view.loading.SpacesLoadingFragment$b r0 = (com.planner5d.library.spaces.view.loading.SpacesLoadingFragment.b) r0
            r7 = 1
            int r1 = r0.f230357f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f230357f = r1
            goto L19
        L14:
            com.planner5d.library.spaces.view.loading.SpacesLoadingFragment$b r0 = new com.planner5d.library.spaces.view.loading.SpacesLoadingFragment$b
            r0.<init>(r12)
        L19:
            java.lang.Object r12 = r0.f230355d
            r7 = 0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r7 = 6
            int r2 = r0.f230357f
            r7 = 0
            r3 = 2
            r7 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r12)
            goto La6
        L31:
            r7 = 2
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            long r10 = r0.f230354c
            java.lang.Object r8 = r0.f230353b
            r9 = r8
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.Object r8 = r0.f230352a
            com.planner5d.library.spaces.view.loading.SpacesLoadingFragment r8 = (com.planner5d.library.spaces.view.loading.SpacesLoadingFragment) r8
            kotlin.ResultKt.m(r12)
            goto L5e
        L49:
            kotlin.ResultKt.m(r12)
            r0.f230352a = r8
            r7 = 5
            r0.f230353b = r9
            r0.f230354c = r10
            r0.f230357f = r4
            r7 = 2
            java.lang.Object r12 = kotlinx.coroutines.d1.b(r10, r0)
            if (r12 != r1) goto L5e
            r7 = 3
            goto La5
        L5e:
            int r12 = r8.f230350c
            int r2 = r9.length
            r7 = 1
            int r2 = r2 - r4
            java.lang.String r5 = "ndimngi"
            java.lang.String r5 = "binding"
            r6 = 0
            if (r12 != r2) goto L83
            r12 = 0
            r8.f230350c = r12
            ee.d r12 = r8.f230349b
            if (r12 != 0) goto L75
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r12 = r6
        L75:
            r7 = 5
            android.widget.TextSwitcher r12 = r12.f274792d
            r7 = 0
            int r2 = r8.f230350c
            r7 = 5
            r2 = r9[r2]
            r7 = 7
            r12.setText(r2)
            goto L98
        L83:
            ee.d r12 = r8.f230349b
            if (r12 != 0) goto L8b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r12 = r6
        L8b:
            r7 = 1
            android.widget.TextSwitcher r12 = r12.f274792d
            int r2 = r8.f230350c
            int r2 = r2 + r4
            r8.f230350c = r2
            r2 = r9[r2]
            r12.setText(r2)
        L98:
            r7 = 2
            r0.f230352a = r6
            r0.f230353b = r6
            r0.f230357f = r3
            java.lang.Object r8 = r8.D(r9, r10, r0)
            if (r8 != r1) goto La6
        La5:
            return r1
        La6:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.view.loading.SpacesLoadingFragment.D(java.lang.String[], long, kotlin.coroutines.d):java.lang.Object");
    }

    private final void E() {
        final i1.h hVar = new i1.h();
        String[] strArr = {getString(de.b.r.Fs), getString(de.b.r.Hs), getString(de.b.r.Is), getString(de.b.r.Js), getString(de.b.r.Ks), getString(de.b.r.Ls), getString(de.b.r.Ms), getString(de.b.r.Ns), getString(de.b.r.Os), getString(de.b.r.Gs)};
        ee.d dVar = this.f230349b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        dVar.f274792d.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.planner5d.library.spaces.view.loading.l
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                return SpacesLoadingFragment.F(hVar, this);
            }
        });
        ee.d dVar2 = this.f230349b;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar2 = null;
        }
        dVar2.f274792d.setText(strArr[this.f230350c]);
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.k.f(p0.a(viewLifecycleOwner), null, null, new c(strArr, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.widget.TextView] */
    public static final View F(i1.h hVar, SpacesLoadingFragment spacesLoadingFragment) {
        ?? textView = new TextView(spacesLoadingFragment.requireContext());
        hVar.f312751a = textView;
        textView.setTextColor(androidx.core.content.d.g(spacesLoadingFragment.requireContext(), de.b.e.Ve));
        ((TextView) hVar.f312751a).setTextAppearance(de.b.s.f273303a8);
        ((TextView) hVar.f312751a).setTypeface(androidx.core.content.res.i.j(spacesLoadingFragment.requireContext(), de.b.h.f272083d));
        ((TextView) hVar.f312751a).setGravity(1);
        return (View) hVar.f312751a;
    }

    private final void x(ViewParent viewParent) {
        y3 y3Var = y3.f229862a;
        while (!(viewParent instanceof ff.a)) {
            viewParent = viewParent != null ? viewParent.getParent() : null;
            if (viewParent == null) {
                timber.log.b.f381052a.e(new RuntimeException("Expected parent not found"));
                viewParent = null;
                break;
            }
        }
        ff.a aVar = (ff.a) viewParent;
        if (aVar != null) {
            aVar.onOnboardingStepComplete();
        }
    }

    private final q y() {
        return (q) this.f230348a.getValue();
    }

    private final void z(SpacesProjectData spacesProjectData) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        o.a aVarA = o.a(spacesProjectData);
        Intrinsics.checkNotNullExpressionValue(aVarA, "toInfo(...)");
        kVar.d(w0VarA, aVarA, new Function2() { // from class: com.planner5d.library.spaces.view.loading.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SpacesLoadingFragment.A((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final ee.d dVarD = ee.d.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(dVarD, "inflate(...)");
        ee.d dVar = null;
        u1.j2(dVarD.f274791c, new ef.g(0, 1, null));
        dVarD.f274791c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.loading.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpacesLoadingFragment.B(this.f230387a, view);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            String strC = m.fromBundle(arguments).c();
            Intrinsics.checkNotNullExpressionValue(strC, "getAddress(...)");
            y().Y(strC);
        }
        y().Z().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.spaces.view.loading.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpacesLoadingFragment.C(this.f230388a, dVarD, (q.a) obj);
            }
        }));
        this.f230349b = dVarD;
        E();
        ee.d dVar2 = this.f230349b;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dVar = dVar2;
        }
        ConstraintLayout root = dVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        y().a0();
    }
}

package com.planner5d.library.spaces.view.loading;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.c0;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.navigation.c2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSpacesFakeLoadingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesFakeLoadingFragment.kt\ncom/planner5d/library/spaces/view/loading/SpacesFakeLoadingFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,81:1\n16#2:82\n*S KotlinDebug\n*F\n+ 1 SpacesFakeLoadingFragment.kt\ncom/planner5d/library/spaces/view/loading/SpacesFakeLoadingFragment\n*L\n27#1:82\n*E\n"})
public final class SpacesFakeLoadingFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f230338a = new i2(j1.d(g.class), new b(), new c(com.planner5d.library.spaces.application.e.f229982b.a()), null, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ee.b f230339b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment$setupTextSwitcher$2", f = "SpacesFakeLoadingFragment.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230340a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f230342c;

        /* JADX INFO: renamed from: com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment$setupTextSwitcher$2$1", f = "SpacesFakeLoadingFragment.kt", i = {}, l = {64, 66, com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
        static final class C1700a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f230343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f230344b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SpacesFakeLoadingFragment f230345c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1700a(long j10, SpacesFakeLoadingFragment spacesFakeLoadingFragment, kotlin.coroutines.d<? super C1700a> dVar) {
                super(2, dVar);
                this.f230344b = j10;
                this.f230345c = spacesFakeLoadingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1700a(this.f230344b, this.f230345c, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x006f  */
            /* JADX WARN: Code duplicated, block: B:25:0x0073  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
            
                if (kotlinx.coroutines.d1.b(r1, r10) == r0) goto L28;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r10.f230343a
                    r2 = 0
                    r9 = 6
                    java.lang.String r3 = "bnsdiin"
                    java.lang.String r3 = "binding"
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    if (r1 == 0) goto L2f
                    r9 = 1
                    if (r1 == r6) goto L2b
                    if (r1 == r5) goto L27
                    if (r1 != r4) goto L1c
                    kotlin.ResultKt.m(r11)
                    goto L8e
                L1c:
                    r9 = 1
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    r9 = 5
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r9 = 5
                    r10.<init>(r11)
                    throw r10
                L27:
                    kotlin.ResultKt.m(r11)
                    goto L66
                L2b:
                    kotlin.ResultKt.m(r11)
                    goto L3f
                L2f:
                    kotlin.ResultKt.m(r11)
                    long r7 = r10.f230344b
                    r9 = 3
                    r10.f230343a = r6
                    r9 = 3
                    java.lang.Object r11 = kotlinx.coroutines.d1.b(r7, r10)
                    if (r11 != r0) goto L3f
                    goto L8d
                L3f:
                    com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment r11 = r10.f230345c
                    ee.b r11 = com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment.access$getBinding$p(r11)
                    if (r11 != 0) goto L4d
                    r9 = 2
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                    r11 = r2
                    r11 = r2
                L4d:
                    android.widget.TextSwitcher r11 = r11.f274778d
                    com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment r1 = r10.f230345c
                    int r6 = de.b.r.Ws
                    java.lang.String r1 = r1.getString(r6)
                    r11.setText(r1)
                    long r6 = r10.f230344b
                    r10.f230343a = r5
                    r9 = 6
                    java.lang.Object r11 = kotlinx.coroutines.d1.b(r6, r10)
                    if (r11 != r0) goto L66
                    goto L8d
                L66:
                    com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment r11 = r10.f230345c
                    r9 = 1
                    ee.b r11 = com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment.access$getBinding$p(r11)
                    if (r11 != 0) goto L73
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                    goto L74
                L73:
                    r2 = r11
                L74:
                    r9 = 1
                    android.widget.TextSwitcher r11 = r2.f274778d
                    com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment r1 = r10.f230345c
                    int r2 = de.b.r.Xs
                    java.lang.String r1 = r1.getString(r2)
                    r11.setText(r1)
                    r9 = 3
                    long r1 = r10.f230344b
                    r10.f230343a = r4
                    java.lang.Object r11 = kotlinx.coroutines.d1.b(r1, r10)
                    if (r11 != r0) goto L8e
                L8d:
                    return r0
                L8e:
                    com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment r10 = r10.f230345c
                    com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment.access$navigateToSurvey(r10)
                    r9 = 7
                    kotlin.Unit r10 = kotlin.Unit.f312394a
                    r9 = 3
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.view.loading.SpacesFakeLoadingFragment.a.C1700a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1700a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f230342c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return SpacesFakeLoadingFragment.this.new a(this.f230342c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230340a;
            int i11 = 3 << 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0 viewLifecycleOwner = SpacesFakeLoadingFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                c0.b bVar = c0.b.STARTED;
                C1700a c1700a = new C1700a(this.f230342c, SpacesFakeLoadingFragment.this, null);
                this.f230340a = 1;
                if (androidx.lifecycle.j1.b(viewLifecycleOwner, bVar, c1700a, this) == objL) {
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SpacesFakeLoadingFragment.kt\ncom/planner5d/library/spaces/view/loading/SpacesFakeLoadingFragment\n*L\n1#1,16:1\n27#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SpacesFakeLoadingFragment.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230347a;

        public c(com.planner5d.library.view.b bVar) {
            this.f230347a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230347a;
        }
    }

    private final void A() {
        final i1.h hVar = new i1.h();
        ee.b bVar = this.f230339b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar = null;
        }
        bVar.f274778d.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.planner5d.library.spaces.view.loading.c
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                return SpacesFakeLoadingFragment.B(hVar, this);
            }
        });
        ee.b bVar2 = this.f230339b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar2 = null;
        }
        bVar2.f274778d.setText(getString(de.b.r.Fs));
        long integer = getResources().getInteger(de.b.j.f272445d);
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.k.f(p0.a(viewLifecycleOwner), null, null, new a(integer, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.widget.TextView] */
    public static final View B(i1.h hVar, SpacesFakeLoadingFragment spacesFakeLoadingFragment) {
        ?? textView = new TextView(spacesFakeLoadingFragment.requireContext());
        hVar.f312751a = textView;
        textView.setTextColor(androidx.core.content.d.g(spacesFakeLoadingFragment.requireContext(), de.b.e.Ve));
        ((TextView) hVar.f312751a).setTextAppearance(de.b.s.f273303a8);
        ((TextView) hVar.f312751a).setTypeface(androidx.core.content.res.i.j(spacesFakeLoadingFragment.requireContext(), de.b.h.f272083d));
        int i10 = 2 & 1;
        ((TextView) hVar.f312751a).setGravity(1);
        return (View) hVar.f312751a;
    }

    private final g w() {
        return (g) this.f230338a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        c2 c2VarA = f.a();
        Intrinsics.checkNotNullExpressionValue(c2VarA, "toSurvey(...)");
        kVar.d(w0VarA, c2VarA, new Function2() { // from class: com.planner5d.library.spaces.view.loading.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SpacesFakeLoadingFragment.y((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SpacesFakeLoadingFragment spacesFakeLoadingFragment, View view) {
        androidx.navigation.fragment.f.a(spacesFakeLoadingFragment).z0();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ee.b bVarD = ee.b.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(bVarD, "inflate(...)");
        ee.b bVar = null;
        u1.j2(bVarD.f274777c, new ef.g(0, 1, null));
        bVarD.f274777c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.loading.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpacesFakeLoadingFragment.z(this.f230376a, view);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            String strC = d.fromBundle(arguments).c();
            Intrinsics.checkNotNullExpressionValue(strC, "getAddress(...)");
            w().U(strC);
        }
        this.f230339b = bVarD;
        A();
        ee.b bVar2 = this.f230339b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bVar = bVar2;
        }
        ConstraintLayout root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        w().V();
    }
}

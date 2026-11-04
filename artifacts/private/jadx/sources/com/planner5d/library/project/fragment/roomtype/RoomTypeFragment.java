package com.planner5d.library.project.fragment.roomtype;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.navigation.w0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.g3;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.l1;
import com.planner5d.library.widget.GridLayoutManagerItemDecorationInvalidation;
import com.planner5d.library.widget.c0;
import com.planner5d.library.widget.preloader.t;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRoomTypeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTypeFragment.kt\ncom/planner5d/library/project/fragment/roomtype/RoomTypeFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n16#2:143\n1#3:144\n*S KotlinDebug\n*F\n+ 1 RoomTypeFragment.kt\ncom/planner5d/library/project/fragment/roomtype/RoomTypeFragment\n*L\n30#1:143\n*E\n"})
public final class RoomTypeFragment extends Fragment implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f223810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f223811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f223812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private GridLayoutManager f223813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f223814e;

    @ij.a
    public y0 imageManager;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223815a;

        static {
            int[] iArr = new int[m.b.values().length];
            try {
                iArr[m.b.Next.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.b.SmartWizard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.b.AiDesigner.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.b.Back.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f223815a = iArr;
        }
    }

    static final class b<T> implements kotlinx.coroutines.flow.j {
        b() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(m.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            RoomTypeFragment.this.w().k(dVar.d());
            return Unit.f312394a;
        }
    }

    static final class c<T> implements kotlinx.coroutines.flow.j {
        c() {
        }

        public final Object a(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
            RoomTypeFragment.this.f223812c.a().u(z10);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
            return a(((Boolean) obj).booleanValue(), dVar);
        }
    }

    static final class d implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f223818a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f223818a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f223818a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f223818a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 RoomTypeFragment.kt\ncom/planner5d/library/project/fragment/roomtype/RoomTypeFragment\n*L\n1#1,16:1\n30#2:17\n*E\n"})
    public static final class e implements Function0<l2> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return RoomTypeFragment.this.getViewModelStore();
        }
    }

    public static final class f implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f223820a;

        public f(com.planner5d.library.view.b bVar) {
            this.f223820a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f223820a;
        }
    }

    public RoomTypeFragment() {
        com.planner5d.library.project.application.c.a aVar = com.planner5d.library.project.application.c.f223658b;
        this.f223810a = new i2(j1.d(m.class), new e(), new f(aVar.a()), null, 8, null);
        this.f223811b = g0.c(new Function0() { // from class: com.planner5d.library.project.fragment.roomtype.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomTypeFragment.v(this.f223822a);
            }
        });
        this.f223812c = new t();
        com.planner5d.library.services.bitmaploader.target.h hVarA = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(...)");
        this.f223814e = hVarA;
        aVar.a().k(this);
    }

    private final void A(Pair<? extends m.b, Long> pair) {
        String string;
        int i10 = a.f223815a[pair.getFirst().ordinal()];
        if (i10 == 1) {
            androidx.navigation.fragment.f.a(this).c0(com.planner5d.library.project.fragment.roomtype.e.a().e(), new com.planner5d.library.services.utility.i().g(r.id, pair.getSecond().longValue()).a());
            return;
        }
        if (i10 == 2) {
            x().p0(pair.getSecond().longValue());
            w0 w0VarA = androidx.navigation.fragment.f.a(this);
            int iE = com.planner5d.library.project.fragment.roomtype.e.c().e();
            com.planner5d.library.services.utility.i iVarF = new com.planner5d.library.services.utility.i().f(r.smartWizardRoomType, (int) pair.getSecond().longValue());
            r rVar = r.smartWizardForEditor;
            Bundle arguments = getArguments();
            w0VarA.c0(iE, iVarF.m(rVar, arguments != null && arguments.getBoolean(rVar.f224891a)).a());
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new k0();
            }
            androidx.navigation.fragment.f.a(this).A0();
        } else {
            x().h0(StatisticsEventAiDesigner.a.next);
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString(r.smartWizardRoomDataReference.f224891a)) == null) {
                string = "";
            }
            y(string, Integer.valueOf((int) pair.getSecond().longValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(RoomTypeFragment roomTypeFragment, Pair pair) {
        if (pair != null) {
            roomTypeFragment.A(pair);
            roomTypeFragment.x().i0();
        }
        return Unit.f312394a;
    }

    private final void C(com.planner5d.library.services.utility.j jVar) {
        long jD = jVar.d(r.autoStyleId, 0L);
        if (jD != 0) {
            x().o0(jD);
        }
        if (jVar.f(r.smartWizardPipeline, false)) {
            x().t0(jVar.f(r.smartWizardForEditor, false));
            x().q0();
        }
        if (x().n0().q() == StatisticsEventAiDesigner.g.furnisher) {
            x().s0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g v(RoomTypeFragment roomTypeFragment) {
        return new g(roomTypeFragment.f223814e, roomTypeFragment.getImageManager$P5D_Library_Project_release(), roomTypeFragment.x().k0(), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g w() {
        return (g) this.f223811b.getValue();
    }

    private final m x() {
        return (m) this.f223810a.getValue();
    }

    private final void y(String str, Integer num) {
        int i10 = 4 ^ 0;
        x().u0(StatisticsEventAiDesigner.EventData.j(x().n0(), null, null, num, null, null, null, null, 123, null));
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        Bundle arguments = getArguments();
        if (arguments != null) {
            iVar.s(arguments);
        }
        iVar.j(r.smartWizardRoomDataReference, str);
        iVar.i(r.aiDesignerStatistics, x().n0());
        if (num != null) {
            iVar.f(r.smartWizardRoomType, num.intValue());
        }
        androidx.navigation.fragment.f.a(this).c0(com.planner5d.library.project.fragment.roomtype.e.b().e(), iVar.a());
    }

    static /* synthetic */ void z(RoomTypeFragment roomTypeFragment, String str, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        roomTypeFragment.y(str, num);
    }

    @NotNull
    public final y0 getImageManager$P5D_Library_Project_release() {
        y0 y0Var = this.imageManager;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        x().v0();
        return false;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        super.onConfigurationChanged(config);
        GridLayoutManager gridLayoutManager = this.f223813d;
        if (gridLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gridLayoutManager");
            gridLayoutManager = null;
        }
        gridLayoutManager.Q3(getResources().getInteger(md.b.k.B0));
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        x().u0(g3.f216952a.a(getArguments()));
        x().x0();
        nd.d dVarC = nd.d.c(inflater);
        this.f223812c.b(dVarC.f332766d);
        dVarC.f332765c.setAdapter(w());
        x().m0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.project.fragment.roomtype.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomTypeFragment.B(this.f223821a, (Pair) obj);
            }
        }));
        RecyclerView roomTypeList = dVarC.f332765c;
        Intrinsics.checkNotNullExpressionValue(roomTypeList, "roomTypeList");
        GridLayoutManagerItemDecorationInvalidation gridLayoutManagerItemDecorationInvalidation = new GridLayoutManagerItemDecorationInvalidation(roomTypeList, getResources().getInteger(md.b.k.B0));
        this.f223813d = gridLayoutManagerItemDecorationInvalidation;
        dVarC.f332765c.setLayoutManager(gridLayoutManagerItemDecorationInvalidation);
        dVarC.f332765c.n(new com.planner5d.library.widget.k0(getResources().getDimensionPixelSize(md.b.g.Pj)));
        Bundle arguments = getArguments();
        if (arguments != null) {
            C(new com.planner5d.library.services.utility.j(arguments));
        }
        NestedScrollView root = dVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        l1 l1Var = l1.f225303a;
        l1.c(l1Var, this, x().getUiState(), null, new b(), 2, null);
        l1.c(l1Var, this, x().l0(), null, new c(), 2, null);
    }

    public final void setImageManager$P5D_Library_Project_release(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }
}

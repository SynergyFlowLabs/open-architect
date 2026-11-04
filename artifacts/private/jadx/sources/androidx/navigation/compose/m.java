package androidx.navigation.compose;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.ui.platform.s2;
import androidx.media3.exoplayer.a5;
import androidx.navigation.y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n1225#2,6:138\n1225#2,6:145\n1225#2,6:152\n1225#2,6:160\n1225#2,3:168\n1228#2,3:174\n1863#3:144\n1864#3:151\n1863#3:159\n1864#3:166\n774#3:171\n865#3,2:172\n77#4:158\n77#4:167\n81#5:177\n81#5:178\n64#6,5:179\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n*L\n48#1:138,6\n53#1:145,6\n74#1:152,6\n92#1:160,6\n123#1:168,3\n123#1:174,3\n50#1:144\n50#1:151\n91#1:159\n91#1:166\n126#1:171\n126#1:172,2\n90#1:158\n122#1:167\n43#1:177\n47#1:178\n112#1:179,5\n*E\n"})
public final class m {

    @SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n1225#2,6:138\n64#3,5:144\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$1$2\n*L\n56#1:138,6\n58#1:144,5\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.n0 f70776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f70777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.saveable.m f70778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.navigation.n0> f70779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n.b f70780e;

        /* JADX INFO: renamed from: androidx.navigation.compose.m$a$a, reason: collision with other inner class name */
        static final class C0626a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n.b f70781a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.n0 f70782b;

            C0626a(n.b bVar, androidx.navigation.n0 n0Var) {
                this.f70781a = bVar;
                this.f70782b = n0Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if ((i10 & 3) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-497631156, i10, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                }
                this.f70781a.v0().invoke(this.f70782b, c0Var, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                c(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$1$2\n*L\n1#1,490:1\n59#2,3:491\n*E\n"})
        public static final class b implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f70783a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.n0 f70784b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList f70785c;

            public b(n nVar, androidx.navigation.n0 n0Var, SnapshotStateList snapshotStateList) {
                this.f70783a = nVar;
                this.f70784b = n0Var;
                this.f70785c = snapshotStateList;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f70783a.u(this.f70784b);
                this.f70785c.remove(this.f70784b);
            }
        }

        a(androidx.navigation.n0 n0Var, n nVar, androidx.compose.runtime.saveable.m mVar, SnapshotStateList<androidx.navigation.n0> snapshotStateList, n.b bVar) {
            this.f70776a = n0Var;
            this.f70777b = nVar;
            this.f70778c = mVar;
            this.f70779d = snapshotStateList;
            this.f70780e = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u1 f(SnapshotStateList snapshotStateList, androidx.navigation.n0 n0Var, n nVar, v1 v1Var) {
            snapshotStateList.add(n0Var);
            return new b(nVar, n0Var, snapshotStateList);
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                int i11 = 0 ^ (-1);
                androidx.compose.runtime.m0.A0(1129586364, i10, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
            }
            androidx.navigation.n0 n0Var = this.f70776a;
            boolean zK0 = c0Var.k0(n0Var) | c0Var.k0(this.f70777b);
            final SnapshotStateList<androidx.navigation.n0> snapshotStateList = this.f70779d;
            final androidx.navigation.n0 n0Var2 = this.f70776a;
            final n nVar = this.f70777b;
            Object objI0 = c0Var.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.navigation.compose.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m.a.f(snapshotStateList, n0Var2, nVar, (v1) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            b2.d(n0Var, (Function1) objI0, c0Var, 0);
            androidx.navigation.n0 n0Var3 = this.f70776a;
            s.d(n0Var3, this.f70778c, androidx.compose.runtime.internal.w.e(-497631156, true, new C0626a(this.f70780e, n0Var3), c0Var, 54), c0Var, a5.S0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1863#2,2:138\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n*L\n75#1:138,2\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f70786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n7<Set<androidx.navigation.n0>> f70787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f70788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.navigation.n0> f70789d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(n7<? extends Set<androidx.navigation.n0>> n7Var, n nVar, SnapshotStateList<androidx.navigation.n0> snapshotStateList, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f70787b = n7Var;
            this.f70788c = nVar;
            this.f70789d = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f70787b, this.f70788c, this.f70789d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f70786a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Set<androidx.navigation.n0> setH = m.h(this.f70787b);
            n nVar = this.f70788c;
            SnapshotStateList<androidx.navigation.n0> snapshotStateList = this.f70789d;
            for (androidx.navigation.n0 n0Var : setH) {
                if (!nVar.s().getValue().contains(n0Var) && !snapshotStateList.contains(n0Var)) {
                    nVar.u(n0Var);
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n*L\n1#1,490:1\n112#2:491\n*E\n"})
    public static final class c implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.n0 f70790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.j0 f70791b;

        public c(androidx.navigation.n0 n0Var, androidx.lifecycle.j0 j0Var) {
            this.f70790a = n0Var;
            this.f70791b = j0Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f70790a.getLifecycle().g(this.f70791b);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void f(@NotNull final n nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        final n nVar2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(294589392);
        int i11 = (i10 & 6) == 0 ? (c0VarR.k0(nVar) ? 4 : 2) | i10 : i10;
        if ((i11 & 3) == 2 && c0VarR.d()) {
            c0VarR.u();
            nVar2 = nVar;
        } else {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(294589392, i11, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            androidx.compose.runtime.saveable.m mVarB = androidx.compose.runtime.saveable.u.b(c0VarR, 0);
            n7 n7VarB = w6.b(nVar.s(), null, c0VarR, 0, 1);
            SnapshotStateList<androidx.navigation.n0> snapshotStateListP = p(g(n7VarB), c0VarR, 0);
            k(snapshotStateListP, g(n7VarB), c0VarR, 0);
            n7 n7VarB2 = w6.b(nVar.t(), null, c0VarR, 0, 1);
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = w6.g();
                c0VarR.Y(objI0);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objI0;
            c0VarR.E(-367418626);
            for (final androidx.navigation.n0 n0Var : snapshotStateListP) {
                y1 y1VarF = n0Var.f();
                Intrinsics.checkNotNull(y1VarF, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                n.b bVar = (n.b) y1VarF;
                boolean zK0 = c0VarR.k0(nVar) | c0VarR.k0(n0Var);
                Object objI1 = c0VarR.i0();
                if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function0() { // from class: androidx.navigation.compose.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return m.i(nVar, n0Var);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                n nVar3 = nVar;
                androidx.compose.ui.window.b.a((Function0) objI1, bVar.z0(), androidx.compose.runtime.internal.w.e(1129586364, true, new a(n0Var, nVar3, mVarB, snapshotStateList, bVar), c0VarR, 54), c0VarR, a5.S0, 0);
                nVar = nVar3;
            }
            nVar2 = nVar;
            c0VarR.A();
            Set<androidx.navigation.n0> setH = h(n7VarB2);
            boolean zD = c0VarR.D(n7VarB2) | c0VarR.k0(nVar2);
            Object objI2 = c0VarR.i0();
            if (zD || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new b(n7VarB2, nVar2, snapshotStateList, null);
                c0VarR.Y(objI2);
            }
            b2.h(setH, snapshotStateList, (Function2) objI2, c0VarR, 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.navigation.compose.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.j(nVar2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<androidx.navigation.n0> g(n7<? extends List<androidx.navigation.n0>> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<androidx.navigation.n0> h(n7<? extends Set<androidx.navigation.n0>> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(n nVar, androidx.navigation.n0 n0Var) {
        nVar.r(n0Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(n nVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        f(nVar, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    public static final void k(@NotNull final List<androidx.navigation.n0> list, @NotNull final Collection<androidx.navigation.n0> collection, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1537894851);
        int i11 = (i10 & 6) == 0 ? (c0VarR.k0(list) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(collection) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1537894851, i11, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            final boolean zBooleanValue = ((Boolean) c0VarR.W(s2.a())).booleanValue();
            for (final androidx.navigation.n0 n0Var : collection) {
                androidx.lifecycle.c0 lifecycle = n0Var.getLifecycle();
                boolean zG = c0VarR.G(zBooleanValue) | c0VarR.k0(list) | c0VarR.k0(n0Var);
                Object objI0 = c0VarR.i0();
                if (zG || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.navigation.compose.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return m.l(n0Var, zBooleanValue, list, (v1) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                b2.d(lifecycle, (Function1) objI0, c0VarR, 0);
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.navigation.compose.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.n(list, collection, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 l(final androidx.navigation.n0 n0Var, final boolean z10, final List list, v1 v1Var) {
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0() { // from class: androidx.navigation.compose.i
            @Override // androidx.lifecycle.j0
            public final void e(androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
                m.m(z10, list, n0Var, o0Var, aVar);
            }
        };
        n0Var.getLifecycle().c(j0Var);
        return new c(n0Var, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(boolean z10, List list, androidx.navigation.n0 n0Var, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
        if (z10 && !list.contains(n0Var)) {
            list.add(n0Var);
        }
        if (aVar == androidx.lifecycle.c0.a.ON_START && !list.contains(n0Var)) {
            list.add(n0Var);
        }
        if (aVar == androidx.lifecycle.c0.a.ON_STOP) {
            list.remove(n0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(List list, Collection collection, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        k(list, collection, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final SnapshotStateList<androidx.navigation.n0> p(@NotNull Collection<androidx.navigation.n0> collection, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        Object obj;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(467378629, i10, -1, "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)");
        }
        boolean zBooleanValue = ((Boolean) c0Var.W(s2.a())).booleanValue();
        boolean zD = c0Var.D(collection);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            obj = objI0;
            SnapshotStateList snapshotStateListG = w6.g();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collection) {
                if (zBooleanValue ? true : ((androidx.navigation.n0) obj2).getLifecycle().d().n(androidx.lifecycle.c0.b.STARTED)) {
                    arrayList.add(obj2);
                }
            }
            snapshotStateListG.addAll(arrayList);
            c0Var.Y(snapshotStateListG);
            obj = snapshotStateListG;
        }
        obj = objI0;
        SnapshotStateList<androidx.navigation.n0> snapshotStateList = (SnapshotStateList) obj;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return snapshotStateList;
    }
}

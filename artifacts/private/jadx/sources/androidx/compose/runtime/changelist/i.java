package androidx.compose.runtime.changelist;

import androidx.compose.runtime.m0;
import androidx.compose.runtime.z5;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1151:1\n4809#2:1152\n4788#2,4:1153\n4809#2:1157\n4788#2,4:1158\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n1078#1:1152\n1078#1:1153,4\n1094#1:1157\n1094#1:1158,4\n*E\n"})
public final class i {

    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f35528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z5 f35529b;

        a(g gVar, z5 z5Var) {
            this.f35528a = gVar;
            this.f35529b = z5Var;
        }

        @Override // androidx.compose.runtime.changelist.g
        public List<androidx.compose.runtime.tooling.c> b(Integer num) {
            List<androidx.compose.runtime.tooling.c> listB = this.f35528a.b(null);
            int iK0 = this.f35529b.k0();
            if (iK0 < 0) {
                return listB;
            }
            z5 z5Var = this.f35529b;
            return CollectionsKt.plus((Collection) androidx.compose.runtime.tooling.b.b(z5Var, num, iK0, Integer.valueOf(z5Var.V0(iK0))), (Iterable) listB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(Throwable th2, final g gVar, final z5 z5Var, final androidx.compose.runtime.g gVar2) {
        return gVar == null ? th2 : androidx.compose.runtime.tooling.d.b(th2, new Function0() { // from class: androidx.compose.runtime.changelist.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.g(gVar2, z5Var, gVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(androidx.compose.runtime.g gVar, z5 z5Var, g gVar2) {
        if (gVar != null) {
            z5Var.m1(gVar);
        }
        List listC = androidx.compose.runtime.tooling.b.c(z5Var, null, 0, null, 7, null);
        androidx.compose.runtime.tooling.c cVar = (androidx.compose.runtime.tooling.c) CollectionsKt.lastOrNull(listC);
        Integer numE = cVar != null ? cVar.e() : null;
        List<androidx.compose.runtime.tooling.c> listB = gVar2.b(numE);
        if (numE != null && !listB.isEmpty()) {
            listB = CollectionsKt.plus((Collection) CollectionsKt.listOf(androidx.compose.runtime.tooling.c.d((androidx.compose.runtime.tooling.c) CollectionsKt.first((List) listB), null, numE, 1, null)), (Iterable) CollectionsKt.drop(listB, 1));
        }
        return CollectionsKt.plus((Collection) listC, (Iterable) listB);
    }

    private static final int h(z5 z5Var) {
        int iH0 = z5Var.h0();
        int iK0 = z5Var.k0();
        while (iK0 >= 0 && !z5Var.F0(iK0)) {
            iK0 = z5Var.V0(iK0);
        }
        int iT0 = iK0 + 1;
        int iT1 = 0;
        while (iT0 < iH0) {
            if (z5Var.y0(iH0, iT0)) {
                if (z5Var.F0(iT0)) {
                    iT1 = 0;
                }
                iT0++;
            } else {
                iT1 += z5Var.F0(iT0) ? 1 : z5Var.T0(iT0);
                iT0 += z5Var.t0(iT0);
            }
        }
        return iT1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(z5 z5Var, androidx.compose.runtime.g gVar, androidx.compose.runtime.i<Object> iVar) {
        int iE = z5Var.E(gVar);
        if (!(z5Var.h0() < iE)) {
            m0.y("Check failed");
        }
        j(z5Var, iVar, iE);
        int iH = h(z5Var);
        while (z5Var.h0() < iE) {
            if (z5Var.x0(iE)) {
                if (z5Var.E0()) {
                    iVar.n(z5Var.R0(z5Var.h0()));
                    iH = 0;
                }
                z5Var.D1();
            } else {
                iH += z5Var.r1();
            }
        }
        if (!(z5Var.h0() == iE)) {
            m0.y("Check failed");
        }
        return iH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(z5 z5Var, androidx.compose.runtime.i<Object> iVar, int i10) {
        while (!z5Var.z0(i10)) {
            z5Var.s1();
            if (z5Var.F0(z5Var.k0())) {
                iVar.o();
            }
            z5Var.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g k(g gVar, z5 z5Var) {
        return new a(gVar, z5Var);
    }

    private static final void l(g gVar, z5 z5Var, androidx.compose.runtime.g gVar2, Function0<Unit> function0) throws Throwable {
        try {
            function0.invoke();
        } catch (Throwable th2) {
            throw f(th2, gVar, z5Var, gVar2);
        }
    }
}

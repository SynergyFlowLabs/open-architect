package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.g2;
import androidx.collection.t2;
import androidx.collection.u1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.focus.r0;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.z;
import java.util.List;
import kotlin.Unit;
import kotlin.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@androidx.annotation.w0(26)
@SourceDebugExtension({"SMAP\nAndroidAutofillManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,298:1\n91#2,5:299\n80#3:304\n80#3:305\n35#4,5:306\n*S KotlinDebug\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n*L\n67#1:299,5\n156#1:304\n157#1:305\n159#1:306,5\n*E\n"})
public final class b extends m implements androidx.compose.ui.semantics.r, androidx.compose.ui.focus.p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f36960k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private w f36961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.semantics.x f36962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final View f36963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.spatial.f f36964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f36965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Rect f36966g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private AutofillId f36967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private u1 f36968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36969j;

    static final class a extends l0 implements pj.o<Integer, Integer, Integer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36971b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(4);
            this.f36971b = i10;
        }

        public final void c(int i10, int i11, int i12, int i13) {
            b.this.g().b(b.this.f36963d, this.f36971b, new Rect(i10, i11, i12, i13));
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            c(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.autofill.b$b, reason: collision with other inner class name */
    static final class C0278b extends l0 implements pj.o<Integer, Integer, Integer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.p f36973b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0278b(androidx.compose.ui.semantics.p pVar) {
            super(4);
            this.f36973b = pVar;
        }

        public final void c(int i10, int i11, int i12, int i13) {
            b.this.f36966g.set(i10, i11, i12, i13);
            b.this.g().d(b.this.f36963d, this.f36973b.K(), b.this.f36966g);
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            c(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.f312394a;
        }
    }

    public b(@NotNull w wVar, @NotNull androidx.compose.ui.semantics.x xVar, @NotNull View view, @NotNull androidx.compose.ui.spatial.f fVar, @NotNull String str) {
        this.f36961b = wVar;
        this.f36962c = xVar;
        this.f36963d = view;
        this.f36964e = fVar;
        this.f36965f = str;
        view.setImportantForAutofill(1);
        androidx.compose.ui.platform.coreshims.a aVarA = androidx.compose.ui.platform.coreshims.c.a(view);
        AutofillId autofillIdA = aVarA != null ? aVarA.a() : null;
        if (autofillIdA == null) {
            s0.a.j("Required value was null.");
            throw new a0();
        }
        this.f36967h = autofillIdA;
        this.f36968i = new u1(0, 1, null);
    }

    @Override // androidx.compose.ui.focus.p
    public void a(@Nullable r0 r0Var, @Nullable r0 r0Var2) {
        androidx.compose.ui.semantics.p pVarW;
        SemanticsConfiguration semanticsConfigurationQ0;
        androidx.compose.ui.semantics.p pVarW2;
        SemanticsConfiguration semanticsConfigurationQ1;
        if (r0Var != null && (pVarW2 = androidx.compose.ui.node.k.w(r0Var)) != null && (semanticsConfigurationQ1 = pVarW2.q0()) != null && c.d(semanticsConfigurationQ1)) {
            this.f36961b.c(this.f36963d, pVarW2.K());
        }
        if (r0Var2 == null || (pVarW = androidx.compose.ui.node.k.w(r0Var2)) == null || (semanticsConfigurationQ0 = pVarW.q0()) == null || !c.d(semanticsConfigurationQ0)) {
            return;
        }
        int iK = pVarW.K();
        this.f36964e.f().B(iK, new a(iK));
    }

    @Override // androidx.compose.ui.semantics.r
    public void b(@NotNull androidx.compose.ui.semantics.p pVar, @Nullable SemanticsConfiguration semanticsConfiguration) {
        androidx.compose.ui.text.f fVar;
        androidx.compose.ui.text.f fVar2;
        SemanticsConfiguration semanticsConfigurationQ0 = pVar.q0();
        int iK = pVar.K();
        String strM = null;
        String strM2 = (semanticsConfiguration == null || (fVar2 = (androidx.compose.ui.text.f) androidx.compose.ui.semantics.o.a(semanticsConfiguration, z.f41190a.o())) == null) ? null : fVar2.m();
        if (semanticsConfigurationQ0 != null && (fVar = (androidx.compose.ui.text.f) androidx.compose.ui.semantics.o.a(semanticsConfigurationQ0, z.f41190a.o())) != null) {
            strM = fVar.m();
        }
        boolean z10 = false;
        if (strM2 != strM) {
            if (strM2 == null) {
                this.f36961b.e(this.f36963d, iK, true);
            } else if (strM == null) {
                this.f36961b.e(this.f36963d, iK, false);
            } else if (Intrinsics.areEqual((s) androidx.compose.ui.semantics.o.a(semanticsConfigurationQ0, z.f41190a.c()), s.f37034a.d())) {
                this.f36961b.a(this.f36963d, iK, i.f36978a.d(strM.toString()));
            }
        }
        boolean z11 = semanticsConfiguration != null && c.e(semanticsConfiguration);
        if (semanticsConfigurationQ0 != null && c.e(semanticsConfigurationQ0)) {
            z10 = true;
        }
        if (z11 != z10) {
            if (z10) {
                this.f36968i.G(iK);
            } else {
                this.f36968i.X(iK);
            }
        }
    }

    @Override // androidx.compose.ui.autofill.m
    public void c() {
        this.f36961b.cancel();
    }

    @Override // androidx.compose.ui.autofill.m
    public void d() {
        this.f36961b.commit();
    }

    @NotNull
    public final w g() {
        return this.f36961b;
    }

    public final void h(@NotNull androidx.compose.ui.semantics.p pVar) {
        if (this.f36968i.X(pVar.K())) {
            this.f36961b.e(this.f36963d, pVar.K(), false);
        }
    }

    public final void i() {
        if (this.f36968i.p() && this.f36969j) {
            this.f36961b.commit();
            this.f36969j = false;
        }
        if (this.f36968i.q()) {
            this.f36969j = true;
        }
    }

    public final void j(@NotNull androidx.compose.ui.semantics.p pVar) {
        if (this.f36968i.X(pVar.K())) {
            this.f36961b.e(this.f36963d, pVar.K(), false);
        }
    }

    public final void k(@NotNull androidx.compose.ui.semantics.p pVar) {
        SemanticsConfiguration semanticsConfigurationQ0 = pVar.q0();
        if (semanticsConfigurationQ0 == null || !c.e(semanticsConfigurationQ0)) {
            return;
        }
        this.f36968i.G(pVar.K());
        this.f36961b.e(this.f36963d, pVar.K(), true);
    }

    public final void l(@NotNull androidx.compose.ui.semantics.p pVar, int i10) {
        if (this.f36968i.X(i10)) {
            this.f36961b.e(this.f36963d, i10, false);
        }
        SemanticsConfiguration semanticsConfigurationQ0 = pVar.q0();
        if (semanticsConfigurationQ0 != null && c.e(semanticsConfigurationQ0)) {
            this.f36968i.G(pVar.K());
            this.f36961b.e(this.f36963d, pVar.K(), true);
        }
    }

    public final void m(@NotNull SparseArray<AutofillValue> sparseArray) {
        SemanticsConfiguration semanticsConfigurationQ0;
        androidx.compose.ui.semantics.a aVar;
        Function1 function1;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            i iVar = i.f36978a;
            if (iVar.g(autofillValue)) {
                androidx.compose.ui.semantics.p pVarA = this.f36962c.a(iKeyAt);
                if (pVarA != null && (semanticsConfigurationQ0 = pVarA.q0()) != null && (aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(semanticsConfigurationQ0, androidx.compose.ui.semantics.n.f41142a.k())) != null && (function1 = (Function1) aVar.a()) != null) {
                }
            } else if (!iVar.e(autofillValue) && !iVar.f(autofillValue)) {
                iVar.h(autofillValue);
            }
        }
    }

    public final void n(@NotNull ViewStructure viewStructure) {
        i iVar = i.f36978a;
        androidx.compose.ui.semantics.p pVarC = this.f36962c.c();
        y.a(viewStructure, pVarC, this.f36967h, this.f36965f, this.f36964e);
        g2 g2VarI = t2.i(pVarC, viewStructure);
        while (g2VarI.I()) {
            Object objJ0 = g2VarI.J0(g2VarI.f12450b - 1);
            Intrinsics.checkNotNull(objJ0, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure2 = (ViewStructure) objJ0;
            Object objJ1 = g2VarI.J0(g2VarI.f12450b - 1);
            Intrinsics.checkNotNull(objJ1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List<androidx.compose.ui.semantics.p> listR0 = ((androidx.compose.ui.semantics.p) objJ1).r0();
            int size = listR0.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.semantics.p pVar = listR0.get(i10);
                if (!pVar.M() && pVar.I() && pVar.J()) {
                    SemanticsConfiguration semanticsConfigurationQ0 = pVar.q0();
                    if (semanticsConfigurationQ0 == null || !c.f(semanticsConfigurationQ0)) {
                        g2VarI.a0(pVar);
                        g2VarI.a0(viewStructure2);
                    } else {
                        ViewStructure viewStructureJ = iVar.j(viewStructure2, iVar.a(viewStructure2, 1));
                        y.a(viewStructureJ, pVar, this.f36967h, this.f36965f, this.f36964e);
                        g2VarI.a0(pVar);
                        g2VarI.a0(viewStructureJ);
                    }
                }
            }
        }
    }

    public final void o(@NotNull androidx.compose.ui.semantics.p pVar) {
        this.f36964e.f().B(pVar.K(), new C0278b(pVar));
    }

    public final void p(@NotNull w wVar) {
        this.f36961b = wVar;
    }
}

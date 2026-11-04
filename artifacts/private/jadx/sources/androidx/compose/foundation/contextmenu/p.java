package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.q0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,443:1\n35#2,5:444\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n*L\n250#1:444,5\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14058b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SnapshotStateList<pj.n<h, c0, Integer, Unit>> f14059a = w6.g();

    @SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope$item$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,443:1\n51#2,4:444\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope$item$1\n*L\n292#1:444,4\n*E\n"})
    static final class a implements pj.n<h, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<c0, Integer, String> f14060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f14062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<q0, c0, Integer, Unit> f14063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f14064e;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super c0, ? super Integer, String> function2, boolean z10, a0 a0Var, pj.n<? super q0, ? super c0, ? super Integer, Unit> nVar, Function0<Unit> function0) {
            this.f14060a = function2;
            this.f14061b = z10;
            this.f14062c = a0Var;
            this.f14063d = nVar;
            this.f14064e = function0;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(h hVar, c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.D(hVar) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(424163756, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:290)");
            }
            String strInvoke = this.f14060a.invoke(c0Var, 0);
            if (StringsKt.w3(strInvoke)) {
                androidx.compose.foundation.internal.e.i("Label must not be blank");
            }
            z.k(strInvoke, this.f14061b, hVar, this.f14062c, this.f14063d, this.f14064e, c0Var, (i10 << 6) & 896, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(h hVar, c0 c0Var, Integer num) {
            c(hVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(p pVar, h hVar, int i10, c0 c0Var, int i11) {
        pVar.b(hVar, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(p pVar, Function2 function2, a0 a0Var, boolean z10, pj.n nVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            a0Var = a0.E;
        }
        a0 a0Var2 = a0Var;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            nVar = null;
        }
        pVar.e(function2, a0Var2, z11, nVar, function0);
    }

    @androidx.compose.runtime.o
    public final void b(@NotNull final h hVar, @Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1320309496);
        int i11 = (i10 & 6) == 0 ? (c0VarR.D(hVar) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(this) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(1320309496, i11, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:248)");
            }
            SnapshotStateList<pj.n<h, c0, Integer, Unit>> snapshotStateList = this.f14059a;
            int size = snapshotStateList.size();
            for (int i12 = 0; i12 < size; i12++) {
                snapshotStateList.get(i12).invoke(hVar, c0VarR, Integer.valueOf(i11 & 14));
            }
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.c(this.f14055a, hVar, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void d() {
        this.f14059a.clear();
    }

    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void e(@NotNull Function2<? super c0, ? super Integer, String> function2, @NotNull a0 a0Var, boolean z10, @Nullable pj.n<? super q0, ? super c0, ? super Integer, Unit> nVar, @NotNull Function0<Unit> function0) {
        this.f14059a.add(androidx.compose.runtime.internal.w.c(424163756, true, new a(function2, z10, a0Var, nVar, function0)));
    }

    public final void g() {
        this.f14059a.add(androidx.compose.foundation.contextmenu.a.f14016a.a());
    }
}

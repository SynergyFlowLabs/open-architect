package androidx.compose.ui.relocation;

import androidx.compose.ui.a0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.m;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.unit.v;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import n0.j;
import n0.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBringIntoViewModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewModifierNode.kt\nandroidx/compose/ui/relocation/BringIntoViewModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,75:1\n150#2:76\n278#3:77\n248#3,5:78\n91#3:83\n92#3,8:88\n450#3,5:96\n279#3:101\n455#3:102\n460#3,2:104\n462#3,8:109\n470#3,9:120\n479#3,8:132\n101#3,7:140\n281#3:147\n57#4,4:84\n247#5:103\n240#6,3:106\n243#6,3:129\n1107#7:117\n1085#7,2:118\n*S KotlinDebug\n*F\n+ 1 BringIntoViewModifierNode.kt\nandroidx/compose/ui/relocation/BringIntoViewModifierNodeKt\n*L\n64#1:76\n64#1:77\n64#1:78,5\n64#1:83\n64#1:88,8\n64#1:96,5\n64#1:101\n64#1:102\n64#1:104,2\n64#1:109,8\n64#1:120,9\n64#1:132,8\n64#1:140,7\n64#1:147\n64#1:84,4\n64#1:103\n64#1:106,3\n64#1:129,3\n64#1:117\n64#1:118,2\n*E\n"})
public final class b {

    @SourceDebugExtension({"SMAP\nBringIntoViewModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewModifierNode.kt\nandroidx/compose/ui/relocation/BringIntoViewModifierNodeKt$bringIntoView$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
    static final class a extends l0 implements Function0<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<j> f41000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f41001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<j> function0, g0 g0Var) {
            super(0);
            this.f41000a = function0;
            this.f41001b = g0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            j jVarInvoke;
            Function0<j> function0 = this.f41000a;
            if (function0 != null && (jVarInvoke = function0.invoke()) != null) {
                return jVarInvoke;
            }
            g0 g0Var = this.f41001b;
            if (!g0Var.I()) {
                g0Var = null;
            }
            if (g0Var != null) {
                return o.m(v.h(g0Var.a()));
            }
            return null;
        }
    }

    @Nullable
    public static final Object a(@NotNull androidx.compose.ui.node.j jVar, @Nullable Function0<j> function0, @NotNull d<? super Unit> dVar) {
        Object obj;
        g0 g0VarS;
        Object objM6;
        i1 i1VarA0;
        if (!jVar.w().a9()) {
            return Unit.f312394a;
        }
        int iB = m1.b(524288);
        if (!jVar.w().a9()) {
            s0.a.i("visitAncestors called on an unattached node");
        }
        a0.d dVarW8 = jVar.w().W8();
        androidx.compose.ui.node.l0 l0VarU = k.u(jVar);
        loop0: while (true) {
            obj = null;
            if (l0VarU == null) {
                break;
            }
            if ((l0VarU.A0().l().N8() & iB) != 0) {
                while (dVarW8 != null) {
                    if ((dVarW8.T8() & iB) != 0) {
                        a0.d dVarN = dVarW8;
                        androidx.compose.runtime.collection.d dVar2 = null;
                        while (dVarN != null) {
                            if (dVarN instanceof androidx.compose.ui.relocation.a) {
                                obj = dVarN;
                                break loop0;
                            }
                            if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                                int i10 = 0;
                                for (a0.d dVarY9 = ((m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                    if ((dVarY9.T8() & iB) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            dVarN = dVarY9;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new androidx.compose.runtime.collection.d(new a0.d[16], 0);
                                            }
                                            if (dVarN != null) {
                                                kotlin.coroutines.jvm.internal.b.a(dVar2.d(dVarN));
                                                dVarN = null;
                                            }
                                            kotlin.coroutines.jvm.internal.b.a(dVar2.d(dVarY9));
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            dVarN = k.n(dVar2);
                        }
                    }
                    dVarW8 = dVarW8.W8();
                }
            }
            l0VarU = l0VarU.J0();
            dVarW8 = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
        }
        androidx.compose.ui.relocation.a aVar = (androidx.compose.ui.relocation.a) obj;
        if (aVar != null && (objM6 = aVar.m6((g0VarS = k.s(jVar)), new a(function0, g0VarS), dVar)) == kotlin.coroutines.intrinsics.b.l()) {
            return objM6;
        }
        return Unit.f312394a;
    }

    public static /* synthetic */ Object b(androidx.compose.ui.node.j jVar, Function0 function0, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        return a(jVar, function0, dVar);
    }
}

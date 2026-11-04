package androidx.compose.ui.focus;

import androidx.collection.d3;
import androidx.collection.l2;
import androidx.compose.ui.node.i1;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.x1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,119:1\n231#2,3:120\n200#2,7:123\n211#2,3:131\n214#2,9:135\n234#2:144\n231#2,3:177\n200#2,7:180\n211#2,3:188\n214#2,9:192\n234#2:201\n1399#3:130\n1270#3:134\n1399#3:187\n1270#3:191\n118#4,9:145\n118#4:168\n54#5:154\n91#6:155\n92#6,8:160\n101#6,7:170\n57#7,4:156\n247#8:169\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n61#1:120,3\n61#1:123,7\n61#1:131,3\n61#1:135,9\n61#1:144\n98#1:177,3\n98#1:180,7\n98#1:188,3\n98#1:192,9\n98#1:201\n61#1:130\n61#1:134\n98#1:187\n98#1:191\n70#1:145,9\n76#1:168\n70#1:154\n69#1:155\n69#1:160,8\n69#1:170,7\n69#1:156,4\n76#1:169\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f37437f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f37438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x1 f37439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l2<FocusTargetNode> f37440c = d3.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final l2<j> f37441d = d3.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37442e;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        a(Object obj) {
            super(0, obj, o.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((o) this.receiver).c();
        }
    }

    public o(@NotNull w wVar, @NotNull x1 x1Var) {
        this.f37438a = wVar;
        this.f37439b = x1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:69:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0146 A[LOOP:4: B:60:0x0118->B:70:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0149 A[EDGE_INSN: B:91:0x0149->B:71:0x0149 BREAK  A[LOOP:4: B:60:0x0118->B:70:0x0146], SYNTHETIC] */
    public final void c() {
        i1 i1VarA0;
        long j10;
        FocusTargetNode focusTargetNodeJ = this.f37438a.j();
        long j11 = 255;
        if (focusTargetNodeJ == null) {
            l2<j> l2Var = this.f37441d;
            Object[] objArr = l2Var.f12171b;
            long[] jArr = l2Var.f12170a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j12 = jArr[i10];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j12 & j11) < 128) {
                                ((j) objArr[(i10 << 3) + i12]).Z(q0.Inactive);
                            }
                            j12 >>= 8;
                            i12++;
                            j11 = j11;
                        }
                        j10 = j11;
                        if (i11 != 8) {
                            break;
                        }
                    } else {
                        j10 = j11;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    j11 = j10;
                }
            }
        } else if (focusTargetNodeJ.a9()) {
            if (this.f37440c.e(focusTargetNodeJ)) {
                focusTargetNodeJ.H9();
            }
            q0 q0VarC5 = focusTargetNodeJ.c5();
            int iB = m1.b(1024) | m1.b(4096);
            if (!focusTargetNodeJ.w().a9()) {
                s0.a.i("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.a0.d dVarW = focusTargetNodeJ.w();
            androidx.compose.ui.node.l0 l0VarU = androidx.compose.ui.node.k.u(focusTargetNodeJ);
            int i13 = 0;
            while (l0VarU != null) {
                if ((l0VarU.A0().l().N8() & iB) != 0) {
                    while (dVarW != null) {
                        if ((dVarW.T8() & iB) != 0) {
                            if ((m1.b(1024) & dVarW.T8()) != 0) {
                                i13++;
                            }
                            if ((dVarW instanceof j) && this.f37441d.e(dVarW)) {
                                if (i13 <= 1) {
                                    ((j) dVarW).Z(q0VarC5);
                                } else {
                                    ((j) dVarW).Z(q0.ActiveParent);
                                }
                                this.f37441d.g0(dVarW);
                            }
                        }
                        dVarW = dVarW.W8();
                    }
                }
                l0VarU = l0VarU.J0();
                dVarW = (l0VarU == null || (i1VarA0 = l0VarU.A0()) == null) ? null : i1VarA0.q();
            }
            l2<j> l2Var2 = this.f37441d;
            Object[] objArr2 = l2Var2.f12171b;
            long[] jArr2 = l2Var2.f12170a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i14 = 0;
                while (true) {
                    long j13 = jArr2[i14];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i14 != length2) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j13 & 255) < 128) {
                                ((j) objArr2[(i14 << 3) + i16]).Z(q0.Inactive);
                            }
                            j13 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        } else if (i14 != length2) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
            }
        }
        d();
        this.f37440c.L();
        this.f37441d.L();
        this.f37442e = false;
    }

    private final void d() {
        if (this.f37438a.j() == null || this.f37438a.w() == q0.Inactive) {
            this.f37438a.c();
        }
    }

    public final boolean b() {
        return this.f37442e;
    }

    public final void e() {
        if (!this.f37442e) {
            this.f37439b.T(new a(this));
            this.f37442e = true;
        }
    }

    public final void f(@NotNull j jVar) {
        if (this.f37441d.C(jVar)) {
            e();
        }
    }

    public final void g(@NotNull FocusTargetNode focusTargetNode) {
        if (this.f37440c.C(focusTargetNode)) {
            e();
        }
    }
}

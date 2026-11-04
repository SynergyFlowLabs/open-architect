package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.a0;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.x1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,119:1\n1107#2:120\n1085#2,2:121\n1107#2:123\n1085#2,2:124\n1107#2:126\n1085#2,2:127\n1107#2:129\n1085#2,2:130\n1107#2:165\n1085#2,2:166\n436#3,5:132\n472#3:137\n441#3,3:138\n436#3,5:141\n472#3:146\n441#3,3:147\n519#3:171\n643#3,2:229\n643#3,2:231\n643#3,2:233\n643#3,2:235\n643#3,2:237\n643#3,2:239\n1863#4,2:150\n98#5:152\n299#6,6:153\n180#6:159\n181#6:164\n182#6,3:168\n185#6,6:172\n305#6:178\n450#6,6:179\n460#6,2:186\n462#6,17:191\n479#6,8:211\n306#6:219\n191#6,8:220\n307#6:228\n57#7,4:160\n247#8:185\n240#9,3:188\n243#9,3:208\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n41#1:120\n41#1:121,2\n42#1:123\n42#1:124,2\n43#1:126\n43#1:127,2\n44#1:129\n44#1:130,2\n90#1:165\n90#1:166,2\n61#1:132,5\n62#1:137\n61#1:138,3\n74#1:141,5\n75#1:146\n74#1:147,3\n90#1:171\n102#1:229,2\n103#1:231,2\n108#1:233,2\n109#1:235,2\n114#1:237,2\n115#1:239,2\n82#1:150,2\n90#1:152\n90#1:153,6\n90#1:159\n90#1:164\n90#1:168,3\n90#1:172,6\n90#1:178\n90#1:179,6\n90#1:186,2\n90#1:191,17\n90#1:211,8\n90#1:219\n90#1:220,8\n90#1:228\n90#1:160,4\n90#1:185\n90#1:188,3\n90#1:208,3\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f39622g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x1 f39623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<androidx.compose.ui.node.c> f39624b = new androidx.compose.runtime.collection.d<>(new androidx.compose.ui.node.c[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<c<?>> f39625c = new androidx.compose.runtime.collection.d<>(new c[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<l0> f39626d = new androidx.compose.runtime.collection.d<>(new l0[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<c<?>> f39627e = new androidx.compose.runtime.collection.d<>(new c[16], 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39628f;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            h.this.f();
        }
    }

    public h(@NotNull x1 x1Var) {
        this.f39623a = x1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8 */
    private final void d(a0.d dVar, c<?> cVar, Set<androidx.compose.ui.node.c> set) {
        int iB = m1.b(32);
        if (!dVar.w().a9()) {
            s0.a.i("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new a0.d[16], 0);
        a0.d dVarO8 = dVar.w().O8();
        if (dVarO8 == null) {
            androidx.compose.ui.node.k.c(dVar2, dVar.w(), false);
        } else {
            dVar2.d(dVarO8);
        }
        while (dVar2.R() != 0) {
            a0.d dVar3 = (a0.d) dVar2.r0(dVar2.R() - 1);
            if ((dVar3.N8() & iB) != 0) {
                a0.d dVarO9 = dVar3;
                while (true) {
                    if (dVarO9 != null) {
                        if ((dVarO9.T8() & iB) != 0) {
                            a0.d dVarN = dVarO9;
                            androidx.compose.runtime.collection.d dVar4 = null;
                            while (dVarN != 0) {
                                if (dVarN instanceof j) {
                                    j jVar = (j) dVarN;
                                    if (jVar instanceof androidx.compose.ui.node.c) {
                                        androidx.compose.ui.node.c cVar2 = (androidx.compose.ui.node.c) jVar;
                                        if ((cVar2.w9() instanceof d) && cVar2.x9().contains(cVar)) {
                                            set.add(jVar);
                                        }
                                    }
                                    if (jVar.x1().a(cVar)) {
                                        break;
                                    }
                                } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                    a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9();
                                    int i10 = 0;
                                    dVarN = dVarN;
                                    while (dVarY9 != null) {
                                        if ((dVarY9.T8() & iB) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                dVarN = dVarY9;
                                            } else {
                                                if (dVar4 == null) {
                                                    dVar4 = new androidx.compose.runtime.collection.d(new a0.d[16], 0);
                                                }
                                                if (dVarN != 0) {
                                                    dVar4.d(dVarN);
                                                    dVarN = 0;
                                                }
                                                dVar4.d(dVarY9);
                                            }
                                        }
                                        dVarY9 = dVarY9.O8();
                                        dVarN = dVarN;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                dVarN = androidx.compose.ui.node.k.n(dVar4);
                            }
                        }
                        dVarO9 = dVarO9.O8();
                    }
                }
            }
            androidx.compose.ui.node.k.c(dVar2, dVar3, false);
        }
    }

    @NotNull
    public final x1 a() {
        return this.f39623a;
    }

    public final void b(@NotNull androidx.compose.ui.node.c cVar, @NotNull c<?> cVar2) {
        this.f39624b.d(cVar);
        this.f39625c.d(cVar2);
        c();
    }

    public final void c() {
        if (!this.f39628f) {
            this.f39628f = true;
            this.f39623a.T(new a());
        }
    }

    public final void e(@NotNull androidx.compose.ui.node.c cVar, @NotNull c<?> cVar2) {
        this.f39626d.d(androidx.compose.ui.node.k.u(cVar));
        this.f39627e.d(cVar2);
        c();
    }

    public final void f() {
        this.f39628f = false;
        HashSet hashSet = new HashSet();
        androidx.compose.runtime.collection.d<l0> dVar = this.f39626d;
        l0[] l0VarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            c<?> cVar = this.f39627e.f35552a[i10];
            if (l0Var.A0().l().a9()) {
                d(l0Var.A0().l(), cVar, hashSet);
            }
        }
        this.f39626d.r();
        this.f39627e.r();
        androidx.compose.runtime.collection.d<androidx.compose.ui.node.c> dVar2 = this.f39624b;
        androidx.compose.ui.node.c[] cVarArr = dVar2.f35552a;
        int iR2 = dVar2.R();
        for (int i11 = 0; i11 < iR2; i11++) {
            androidx.compose.ui.node.c cVar2 = cVarArr[i11];
            c<?> cVar3 = this.f39625c.f35552a[i11];
            if (cVar2.a9()) {
                d(cVar2, cVar3, hashSet);
            }
        }
        this.f39624b.r();
        this.f39625c.r();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.node.c) it.next()).E9();
        }
    }

    public final void g(@NotNull androidx.compose.ui.node.c cVar, @NotNull c<?> cVar2) {
        this.f39624b.d(cVar);
        this.f39625c.d(cVar2);
        c();
    }
}

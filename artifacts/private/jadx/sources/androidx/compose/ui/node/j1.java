package androidx.compose.ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,778:1\n519#2:779\n1#3:780\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n755#1:779\n*E\n"})
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f39792a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f39793b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f39794c = 2;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.a0.c, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> f39795a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar) {
            super(1);
            this.f39795a = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.a0.c cVar) {
            this.f39795a.d(cVar);
            return Boolean.TRUE;
        }
    }

    public static final int c(@NotNull androidx.compose.ui.a0.c cVar, @NotNull androidx.compose.ui.a0.c cVar2) {
        if (Intrinsics.areEqual(cVar, cVar2)) {
            return 2;
        }
        return androidx.compose.ui.d.a(cVar, cVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> d(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar, androidx.compose.runtime.collection.d<androidx.compose.ui.a0> dVar2) {
        dVar2.d(a0Var);
        a aVar = null;
        while (dVar2.R() != 0) {
            androidx.compose.ui.a0 a0VarR0 = dVar2.r0(dVar2.R() - 1);
            if (a0VarR0 instanceof androidx.compose.ui.j) {
                androidx.compose.ui.j jVar = (androidx.compose.ui.j) a0VarR0;
                dVar2.d(jVar.a());
                dVar2.d(jVar.b());
            } else if (a0VarR0 instanceof androidx.compose.ui.a0.c) {
                dVar.d(a0VarR0);
            } else {
                if (aVar == null) {
                    aVar = new a(dVar);
                }
                a0VarR0.N(aVar);
                aVar = aVar;
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends androidx.compose.ui.a0.d> void e(e1<T> e1Var, androidx.compose.ui.a0.d dVar) {
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        e1Var.k(dVar);
    }
}

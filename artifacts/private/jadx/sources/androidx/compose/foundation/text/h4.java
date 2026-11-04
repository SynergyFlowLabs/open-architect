package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLinkStateInteractionSourceObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1#1,70:1\n1516#2:71\n*S KotlinDebug\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n*L\n36#1:71\n*E\n"})
public final class h4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19330f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.h f19331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19332b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19333c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19334d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f19335e = androidx.compose.runtime.e6.b(0);

    @SourceDebugExtension({"SMAP\nLinkStateInteractionSourceObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver$collectInteractionsForLinks$2\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,70:1\n287#2,6:71\n*S KotlinDebug\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver$collectInteractionsForLinks$2\n*L\n50#1:71,6\n*E\n"})
    static final class a<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.g2<androidx.compose.foundation.interaction.g> f19336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h4 f19337b;

        a(androidx.collection.g2<androidx.compose.foundation.interaction.g> g2Var, h4 h4Var) {
            this.f19336a = g2Var;
            this.f19337b = h4Var;
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
            int i10;
            if ((gVar instanceof androidx.compose.foundation.interaction.e.a) || (gVar instanceof androidx.compose.foundation.interaction.c.a) || (gVar instanceof androidx.compose.foundation.interaction.l.b)) {
                this.f19336a.a0(gVar);
            } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
                this.f19336a.C0(((androidx.compose.foundation.interaction.e.b) gVar).a());
            } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                this.f19336a.C0(((androidx.compose.foundation.interaction.c.b) gVar).a());
            } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                this.f19336a.C0(((androidx.compose.foundation.interaction.l.c) gVar).a());
            } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                this.f19336a.C0(((androidx.compose.foundation.interaction.l.a) gVar).a());
            }
            androidx.collection.g2<androidx.compose.foundation.interaction.g> g2Var = this.f19336a;
            h4 h4Var = this.f19337b;
            Object[] objArr = g2Var.f12449a;
            int i11 = g2Var.f12450b;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                androidx.compose.foundation.interaction.g gVar2 = (androidx.compose.foundation.interaction.g) objArr[i13];
                if (gVar2 instanceof androidx.compose.foundation.interaction.e.a) {
                    i10 = h4Var.f19333c;
                } else if (gVar2 instanceof androidx.compose.foundation.interaction.c.a) {
                    i10 = h4Var.f19332b;
                } else {
                    if (gVar2 instanceof androidx.compose.foundation.interaction.l.b) {
                        i10 = h4Var.f19334d;
                    }
                }
                i12 |= i10;
            }
            this.f19337b.f19335e.j(i12);
            return Unit.f312394a;
        }
    }

    public h4(@NotNull androidx.compose.foundation.interaction.h hVar) {
        this.f19331a = hVar;
    }

    @Nullable
    public final Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = this.f19331a.c().collect(new a(new androidx.collection.g2(0, 1, null), this), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    public final boolean f() {
        return (this.f19332b & this.f19335e.m1()) != 0;
    }

    public final boolean g() {
        return (this.f19333c & this.f19335e.m1()) != 0;
    }

    public final boolean h() {
        return (this.f19334d & this.f19335e.m1()) != 0;
    }
}

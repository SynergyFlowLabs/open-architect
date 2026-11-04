package androidx.compose.foundation.interaction;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nHoverInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoverInteraction.kt\nandroidx/compose/foundation/interaction/HoverInteractionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,78:1\n1282#2,6:79\n1282#2,6:85\n*S KotlinDebug\n*F\n+ 1 HoverInteraction.kt\nandroidx/compose/foundation/interaction/HoverInteractionKt\n*L\n65#1:79,6\n66#1:85,6\n*E\n"})
public final class f {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f15637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n3<Boolean> f15638c;

        /* JADX INFO: renamed from: androidx.compose.foundation.interaction.f$a$a, reason: collision with other inner class name */
        static final class C0090a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<e.a> f15639a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n3<Boolean> f15640b;

            C0090a(List<e.a> list, n3<Boolean> n3Var) {
                this.f15639a = list;
                this.f15640b = n3Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof e.a) {
                    this.f15639a.add(gVar);
                } else if (gVar instanceof e.b) {
                    this.f15639a.remove(((e.b) gVar).a());
                }
                this.f15640b.setValue(kotlin.coroutines.jvm.internal.b.a(!this.f15639a.isEmpty()));
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, n3<Boolean> n3Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15637b = hVar;
            this.f15638c = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f15637b, this.f15638c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15636a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ArrayList arrayList = new ArrayList();
                kotlinx.coroutines.flow.i<g> iVarC = this.f15637b.c();
                C0090a c0090a = new C0090a(arrayList, this.f15638c);
                this.f15636a = 1;
                if (iVarC.collect(c0090a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<Boolean> a(@NotNull h hVar, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(1206586544, i10, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:63)");
        }
        Object objI0 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(Boolean.FALSE, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        int i11 = i10 & 14;
        boolean z10 = ((i11 ^ 6) > 4 && c0Var.D(hVar)) || (i10 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z10 || objI1 == aVar.a()) {
            objI1 = new a(hVar, n3Var, null);
            c0Var.Y(objI1);
        }
        b2.i(hVar, (Function2) objI1, c0Var, i11);
        if (m0.l0()) {
            m0.z0();
        }
        return n3Var;
    }
}

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
@SourceDebugExtension({"SMAP\nDragInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,93:1\n1282#2,6:94\n1282#2,6:100\n*S KotlinDebug\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n*L\n79#1:94,6\n80#1:100,6\n*E\n"})
public final class b {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1", f = "DragInteraction.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f15621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n3<Boolean> f15622c;

        /* JADX INFO: renamed from: androidx.compose.foundation.interaction.b$a$a, reason: collision with other inner class name */
        static final class C0088a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.foundation.interaction.a.b> f15623a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n3<Boolean> f15624b;

            C0088a(List<androidx.compose.foundation.interaction.a.b> list, n3<Boolean> n3Var) {
                this.f15623a = list;
                this.f15624b = n3Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
                    this.f15623a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.c) {
                    this.f15623a.remove(((androidx.compose.foundation.interaction.a.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.C0087a) {
                    this.f15623a.remove(((androidx.compose.foundation.interaction.a.C0087a) gVar).a());
                }
                this.f15624b.setValue(kotlin.coroutines.jvm.internal.b.a(!this.f15623a.isEmpty()));
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, n3<Boolean> n3Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15621b = hVar;
            this.f15622c = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f15621b, this.f15622c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15620a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ArrayList arrayList = new ArrayList();
                kotlinx.coroutines.flow.i<g> iVarC = this.f15621b.c();
                C0088a c0088a = new C0088a(arrayList, this.f15622c);
                this.f15620a = 1;
                if (iVarC.collect(c0088a, this) == objL) {
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
            m0.A0(101276833, i10, -1, "androidx.compose.foundation.interaction.collectIsDraggedAsState (DragInteraction.kt:77)");
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

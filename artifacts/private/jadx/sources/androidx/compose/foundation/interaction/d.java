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
@SourceDebugExtension({"SMAP\nFocusInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInteraction.kt\nandroidx/compose/foundation/interaction/FocusInteractionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,78:1\n1282#2,6:79\n1282#2,6:85\n*S KotlinDebug\n*F\n+ 1 FocusInteraction.kt\nandroidx/compose/foundation/interaction/FocusInteractionKt\n*L\n65#1:79,6\n66#1:85,6\n*E\n"})
public final class d {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f15629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n3<Boolean> f15630c;

        /* JADX INFO: renamed from: androidx.compose.foundation.interaction.d$a$a, reason: collision with other inner class name */
        static final class C0089a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<c.a> f15631a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n3<Boolean> f15632b;

            C0089a(List<c.a> list, n3<Boolean> n3Var) {
                this.f15631a = list;
                this.f15632b = n3Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof c.a) {
                    this.f15631a.add(gVar);
                } else if (gVar instanceof c.b) {
                    this.f15631a.remove(((c.b) gVar).a());
                }
                this.f15632b.setValue(kotlin.coroutines.jvm.internal.b.a(!this.f15631a.isEmpty()));
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, n3<Boolean> n3Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15629b = hVar;
            this.f15630c = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f15629b, this.f15630c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15628a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ArrayList arrayList = new ArrayList();
                kotlinx.coroutines.flow.i<g> iVarC = this.f15629b.c();
                C0089a c0089a = new C0089a(arrayList, this.f15630c);
                this.f15628a = 1;
                if (iVarC.collect(c0089a, this) == objL) {
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
            m0.A0(-1805515472, i10, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:63)");
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

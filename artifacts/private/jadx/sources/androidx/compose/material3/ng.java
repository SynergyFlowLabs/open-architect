package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,815:1\n1282#2,6:816\n1282#2,6:822\n1282#2,6:828\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n*L\n631#1:816,6\n640#1:822,6\n649#1:828,6\n*E\n"})
public class ng {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f31024e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f31025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f31026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f31027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f31028d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", i = {}, l = {641}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ og f31030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ng f31031c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(og ogVar, ng ngVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f31030b = ogVar;
            this.f31031c = ngVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f31030b, this.f31031c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f31029a;
            if (i10 == 0) {
                ResultKt.m(obj);
                og ogVar = this.f31030b;
                float f10 = this.f31031c.f31025a;
                float f11 = this.f31031c.f31026b;
                float f12 = this.f31031c.f31028d;
                float f13 = this.f31031c.f31027c;
                this.f31029a = 1;
                if (ogVar.f(f10, f11, f12, f13, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", i = {}, l = {651}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f31033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f31034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ og f31035d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.foundation.interaction.g> f31036a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f31037b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ og f31038c;

            /* JADX INFO: renamed from: androidx.compose.material3.ng$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1", f = "FloatingActionButton.kt", i = {}, l = {676}, m = "invokeSuspend", n = {}, s = {})
            static final class C0247a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f31039a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ og f31040b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.g f31041c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0247a(og ogVar, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super C0247a> dVar) {
                    super(2, dVar);
                    this.f31040b = ogVar;
                    this.f31041c = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0247a(this.f31040b, this.f31041c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f31039a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        og ogVar = this.f31040b;
                        androidx.compose.foundation.interaction.g gVar = this.f31041c;
                        this.f31039a = 1;
                        if (ogVar.b(gVar, this) == objL) {
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
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0247a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            a(List<androidx.compose.foundation.interaction.g> list, kotlinx.coroutines.s0 s0Var, og ogVar) {
                this.f31036a = list;
                this.f31037b = s0Var;
                this.f31038c = ogVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                    this.f31036a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
                    this.f31036a.remove(((androidx.compose.foundation.interaction.e.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                    this.f31036a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                    this.f31036a.remove(((androidx.compose.foundation.interaction.c.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f31036a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f31036a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f31036a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                }
                kotlinx.coroutines.k.f(this.f31037b, null, null, new C0247a(this.f31038c, (androidx.compose.foundation.interaction.g) CollectionsKt.lastOrNull((List) this.f31036a), null), 3, null);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.foundation.interaction.h hVar, og ogVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f31034c = hVar;
            this.f31035d = ogVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f31034c, this.f31035d, dVar);
            bVar.f31033b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f31032a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f31033b;
                ArrayList arrayList = new ArrayList();
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f31034c.c();
                a aVar = new a(arrayList, s0Var, this.f31035d);
                this.f31032a = 1;
                if (iVarC.collect(aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ ng(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    @androidx.compose.runtime.o
    private final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> e(androidx.compose.foundation.interaction.h hVar, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1845106002, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:628)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z10 = (i12 > 4 && c0Var.D(hVar)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            Object ogVar = new og(this.f31025a, this.f31026b, this.f31028d, this.f31027c, null);
            c0Var.Y(ogVar);
            objI0 = ogVar;
        }
        og ogVar2 = (og) objI0;
        boolean zK0 = c0Var.k0(ogVar2) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(this)) || (i10 & 48) == 32);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new a(ogVar2, this, null);
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.i(this, (Function2) objI1, c0Var, (i10 >> 3) & 14);
        boolean zK1 = c0Var.k0(ogVar2) | ((i12 > 4 && c0Var.D(hVar)) || (i10 & 6) == 4);
        Object objI2 = c0Var.i0();
        if (zK1 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
            objI2 = new b(hVar, ogVar2, null);
            c0Var.Y(objI2);
        }
        androidx.compose.runtime.b2.i(hVar, (Function2) objI2, c0Var, i11);
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarC = ogVar2.c();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarC;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ng)) {
            return false;
        }
        ng ngVar = (ng) obj;
        if (androidx.compose.ui.unit.h.x(this.f31025a, ngVar.f31025a) && androidx.compose.ui.unit.h.x(this.f31026b, ngVar.f31026b) && androidx.compose.ui.unit.h.x(this.f31027c, ngVar.f31027c)) {
            return androidx.compose.ui.unit.h.x(this.f31028d, ngVar.f31028d);
        }
        return false;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f(@NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-424810125, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:619)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarE = e(hVar, c0Var, i10 & okhttp3.internal.ws.g.f334652s);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarE;
    }

    public final float g() {
        return this.f31025a;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.unit.h.D(this.f31025a) * 31) + androidx.compose.ui.unit.h.D(this.f31026b)) * 31) + androidx.compose.ui.unit.h.D(this.f31027c)) * 31) + androidx.compose.ui.unit.h.D(this.f31028d);
    }

    private ng(float f10, float f11, float f12, float f13) {
        this.f31025a = f10;
        this.f31026b = f11;
        this.f31027c = f12;
        this.f31028d = f13;
    }
}

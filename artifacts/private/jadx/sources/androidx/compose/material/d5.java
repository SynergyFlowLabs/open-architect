package androidx.compose.material;

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
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n1282#2,6:399\n1282#2,6:405\n1282#2,6:411\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n*L\n262#1:399,6\n271#1:405,6\n280#1:411,6\n*E\n"})
final class d5 implements v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f22494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f22495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f22496d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", i = {}, l = {com.badlogic.gdx.utils.compression.lzma.a.f95331z}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w8 f22498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d5 f22499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w8 w8Var, d5 d5Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f22498b = w8Var;
            this.f22499c = d5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f22498b, this.f22499c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f22497a;
            if (i10 == 0) {
                ResultKt.m(obj);
                w8 w8Var = this.f22498b;
                float f10 = this.f22499c.f22493a;
                float f11 = this.f22499c.f22494b;
                float f12 = this.f22499c.f22495c;
                float f13 = this.f22499c.f22496d;
                this.f22497a = 1;
                if (w8Var.f(f10, f11, f12, f13, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f22501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f22502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w8 f22503d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.foundation.interaction.g> f22504a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f22505b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w8 f22506c;

            /* JADX INFO: renamed from: androidx.compose.material.d5$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1", f = "FloatingActionButton.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
            static final class C0170a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f22507a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ w8 f22508b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.g f22509c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0170a(w8 w8Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super C0170a> dVar) {
                    super(2, dVar);
                    this.f22508b = w8Var;
                    this.f22509c = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0170a(this.f22508b, this.f22509c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f22507a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        w8 w8Var = this.f22508b;
                        androidx.compose.foundation.interaction.g gVar = this.f22509c;
                        this.f22507a = 1;
                        if (w8Var.b(gVar, this) == objL) {
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
                    return ((C0170a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            a(List<androidx.compose.foundation.interaction.g> list, kotlinx.coroutines.s0 s0Var, w8 w8Var) {
                this.f22504a = list;
                this.f22505b = s0Var;
                this.f22506c = w8Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                    this.f22504a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
                    this.f22504a.remove(((androidx.compose.foundation.interaction.e.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                    this.f22504a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                    this.f22504a.remove(((androidx.compose.foundation.interaction.c.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f22504a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f22504a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f22504a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                }
                kotlinx.coroutines.k.f(this.f22505b, null, null, new C0170a(this.f22506c, (androidx.compose.foundation.interaction.g) CollectionsKt.lastOrNull((List) this.f22504a), null), 3, null);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.foundation.interaction.h hVar, w8 w8Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f22502c = hVar;
            this.f22503d = w8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f22502c, this.f22503d, dVar);
            bVar.f22501b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f22500a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f22501b;
                ArrayList arrayList = new ArrayList();
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f22502c.c();
                a aVar = new a(arrayList, s0Var, this.f22503d);
                this.f22500a = 1;
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

    public /* synthetic */ d5(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    @Override // androidx.compose.material.v8
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.unit.h> a(@NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-478475335);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-478475335, i10, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:259)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z10 = (i12 > 4 && c0Var.D(hVar)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            Object w8Var = new w8(this.f22493a, this.f22494b, this.f22495c, this.f22496d, null);
            c0Var.Y(w8Var);
            objI0 = w8Var;
        }
        w8 w8Var2 = (w8) objI0;
        boolean zK0 = c0Var.k0(w8Var2) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(this)) || (i10 & 48) == 32);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new a(w8Var2, this, null);
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.i(this, (Function2) objI1, c0Var, (i10 >> 3) & 14);
        boolean zK1 = c0Var.k0(w8Var2) | ((i12 > 4 && c0Var.D(hVar)) || (i10 & 6) == 4);
        Object objI2 = c0Var.i0();
        if (zK1 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
            objI2 = new b(hVar, w8Var2, null);
            c0Var.Y(objI2);
        }
        androidx.compose.runtime.b2.i(hVar, (Function2) objI2, c0Var, i11);
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarC = w8Var2.c();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarC;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        if (androidx.compose.ui.unit.h.x(this.f22493a, d5Var.f22493a) && androidx.compose.ui.unit.h.x(this.f22494b, d5Var.f22494b) && androidx.compose.ui.unit.h.x(this.f22495c, d5Var.f22495c)) {
            return androidx.compose.ui.unit.h.x(this.f22496d, d5Var.f22496d);
        }
        return false;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.unit.h.D(this.f22493a) * 31) + androidx.compose.ui.unit.h.D(this.f22494b)) * 31) + androidx.compose.ui.unit.h.D(this.f22495c)) * 31) + androidx.compose.ui.unit.h.D(this.f22496d);
    }

    private d5(float f10, float f11, float f12, float f13) {
        this.f22493a = f10;
        this.f22494b = f11;
        this.f22495c = f12;
        this.f22496d = f13;
    }
}

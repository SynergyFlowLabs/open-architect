package androidx.compose.foundation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class v1 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v1 f21846a = new v1();

    private static final class a extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        private final androidx.compose.foundation.interaction.h f21847s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f21848t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f21849v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f21850w;

        /* JADX INFO: renamed from: androidx.compose.foundation.v1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
        static final class C0164a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21851a;

            /* JADX INFO: renamed from: androidx.compose.foundation.v1$a$a$a, reason: collision with other inner class name */
            static final class C0165a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.i1.f f21853a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.i1.f f21854b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.i1.f f21855c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f21856d;

                C0165a(kotlin.jvm.internal.i1.f fVar, kotlin.jvm.internal.i1.f fVar2, kotlin.jvm.internal.i1.f fVar3, a aVar) {
                    this.f21853a = fVar;
                    this.f21854b = fVar2;
                    this.f21855c = fVar3;
                    this.f21856d = aVar;
                }

                @Override // kotlinx.coroutines.flow.j
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                    boolean z10 = true;
                    if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                        this.f21853a.f312749a++;
                    } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                        this.f21853a.f312749a--;
                    } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                        this.f21853a.f312749a--;
                    } else if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                        this.f21854b.f312749a++;
                    } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
                        this.f21854b.f312749a--;
                    } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                        this.f21855c.f312749a++;
                    } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                        this.f21855c.f312749a--;
                    }
                    boolean z11 = false;
                    boolean z12 = this.f21853a.f312749a > 0;
                    boolean z13 = this.f21854b.f312749a > 0;
                    boolean z14 = this.f21855c.f312749a > 0;
                    if (this.f21856d.f21848t != z12) {
                        this.f21856d.f21848t = z12;
                        z11 = true;
                    }
                    if (this.f21856d.f21849v != z13) {
                        this.f21856d.f21849v = z13;
                        z11 = true;
                    }
                    if (this.f21856d.f21850w != z14) {
                        this.f21856d.f21850w = z14;
                    } else {
                        z10 = z11;
                    }
                    if (z10) {
                        androidx.compose.ui.node.u.a(this.f21856d);
                    }
                    return Unit.f312394a;
                }
            }

            C0164a(kotlin.coroutines.d<? super C0164a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return a.this.new C0164a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f21851a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
                    kotlin.jvm.internal.i1.f fVar2 = new kotlin.jvm.internal.i1.f();
                    kotlin.jvm.internal.i1.f fVar3 = new kotlin.jvm.internal.i1.f();
                    kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = a.this.f21847s.c();
                    C0165a c0165a = new C0165a(fVar, fVar2, fVar3, a.this);
                    this.f21851a = 1;
                    if (iVarC.collect(c0165a, this) == objL) {
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
                return ((C0164a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public a(@NotNull androidx.compose.foundation.interaction.h hVar) {
            this.f21847s = hVar;
        }

        @Override // androidx.compose.ui.node.t
        public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.E4();
            if (this.f21848t) {
                androidx.compose.ui.graphics.drawscope.f.V3(cVar, androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.d(), 0.0f, null, null, 0, 122, null);
            } else if (this.f21849v || this.f21850w) {
                androidx.compose.ui.graphics.drawscope.f.V3(cVar, androidx.compose.ui.graphics.q0.w(androidx.compose.ui.graphics.q0.f38131b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.d(), 0.0f, null, null, 0, 122, null);
            }
        }

        @Override // androidx.compose.ui.a0.d
        public void e9() {
            kotlinx.coroutines.k.f(Q8(), null, null, new C0164a(null), 3, null);
        }
    }

    private v1() {
    }

    @Override // androidx.compose.foundation.z2
    @NotNull
    public androidx.compose.ui.node.j a(@NotNull androidx.compose.foundation.interaction.h hVar) {
        return new a(hVar);
    }

    @Override // androidx.compose.foundation.z2
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.foundation.z2
    public int hashCode() {
        return -1;
    }
}

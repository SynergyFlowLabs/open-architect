package androidx.compose.material;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f25354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f25355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f25356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f25357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f25358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.g f25359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.g f25360g;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {androidx.media3.exoplayer.a5.S0}, m = "animateElevation", n = {"to"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f25361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25362b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25364d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25362b = obj;
            this.f25364d |= Integer.MIN_VALUE;
            return w8.this.b(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {}, l = {370}, m = "snapElevation", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25365a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25367c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25365a = obj;
            this.f25367c |= Integer.MIN_VALUE;
            return w8.this.e(this);
        }
    }

    public /* synthetic */ w8(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    private final float d(androidx.compose.foundation.interaction.g gVar) {
        if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
            return this.f25355b;
        }
        if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
            return this.f25356c;
        }
        return gVar instanceof androidx.compose.foundation.interaction.c.a ? this.f25357d : this.f25354a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object e(kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f25367c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f25367c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f25365a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f25367c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                float fD = d(this.f25360g);
                if (!androidx.compose.ui.unit.h.x(this.f25358e.s().O(), fD)) {
                    androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar = this.f25358e;
                    androidx.compose.ui.unit.h hVarO = androidx.compose.ui.unit.h.o(fD);
                    bVar.f25367c = 1;
                    if (cVar.C(hVarO, bVar) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f25359f = this.f25360g;
            return Unit.f312394a;
        } catch (Throwable th2) {
            this.f25359f = this.f25360g;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Unit] */
    @Nullable
    public final Object b(@Nullable androidx.compose.foundation.interaction.g gVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f25364d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f25364d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f25362b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f25364d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                float fD = d(gVar);
                this.f25360g = gVar;
                if (!androidx.compose.ui.unit.h.x(this.f25358e.s().O(), fD)) {
                    androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar = this.f25358e;
                    androidx.compose.foundation.interaction.g gVar2 = this.f25359f;
                    aVar.f25361a = gVar;
                    aVar.f25364d = 1;
                    if (p7.d(cVar, fD, gVar2, gVar, aVar) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (androidx.compose.foundation.interaction.g) aVar.f25361a;
                ResultKt.m(obj);
            }
            this.f25359f = gVar;
            this = Unit.f312394a;
            return this;
        } catch (Throwable th2) {
            this.f25359f = gVar;
            throw th2;
        }
    }

    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> c() {
        return this.f25358e.j();
    }

    @Nullable
    public final Object f(float f10, float f11, float f12, float f13, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f25354a = f10;
        this.f25355b = f11;
        this.f25356c = f12;
        this.f25357d = f13;
        Object objE = e(dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    private w8(float f10, float f11, float f12, float f13) {
        this.f25354a = f10;
        this.f25355b = f11;
        this.f25356c = f12;
        this.f25357d = f13;
        this.f25358e = new androidx.compose.animation.core.c<>(androidx.compose.ui.unit.h.o(this.f25354a), androidx.compose.animation.core.t4.L(androidx.compose.ui.unit.h.f42689b), null, null, 12, null);
    }
}

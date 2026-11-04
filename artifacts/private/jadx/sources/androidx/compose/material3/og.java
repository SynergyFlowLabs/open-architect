package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f31350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f31351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f31353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f31354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.g f31355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.g f31356g;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {753}, m = "animateElevation", n = {"to"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31358b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f31360d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31358b = obj;
            this.f31360d |= Integer.MIN_VALUE;
            return og.this.b(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {}, l = {739}, m = "snapElevation", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31361a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31363c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31361a = obj;
            this.f31363c |= Integer.MIN_VALUE;
            return og.this.e(this);
        }
    }

    public /* synthetic */ og(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    private final float d(androidx.compose.foundation.interaction.g gVar) {
        if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
            return this.f31351b;
        }
        if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
            return this.f31352c;
        }
        return gVar instanceof androidx.compose.foundation.interaction.c.a ? this.f31353d : this.f31350a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f31363c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f31363c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f31361a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f31363c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                float fD = d(this.f31356g);
                if (!androidx.compose.ui.unit.h.x(this.f31354e.s().O(), fD)) {
                    androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar = this.f31354e;
                    androidx.compose.ui.unit.h hVarO = androidx.compose.ui.unit.h.o(fD);
                    bVar.f31363c = 1;
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
            this.f31355f = this.f31356g;
            return Unit.f312394a;
        } catch (Throwable th2) {
            this.f31355f = this.f31356g;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Unit] */
    @Nullable
    public final Object b(@Nullable androidx.compose.foundation.interaction.g gVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f31360d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31360d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f31358b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f31360d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                float fD = d(gVar);
                this.f31356g = gVar;
                if (!androidx.compose.ui.unit.h.x(this.f31354e.s().O(), fD)) {
                    androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar = this.f31354e;
                    androidx.compose.foundation.interaction.g gVar2 = this.f31355f;
                    aVar.f31357a = gVar;
                    aVar.f31360d = 1;
                    if (androidx.compose.material3.internal.n2.d(cVar, fD, gVar2, gVar, aVar) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (androidx.compose.foundation.interaction.g) aVar.f31357a;
                ResultKt.m(obj);
            }
            this.f31355f = gVar;
            this = Unit.f312394a;
            return this;
        } catch (Throwable th2) {
            this.f31355f = gVar;
            throw th2;
        }
    }

    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> c() {
        return this.f31354e.j();
    }

    @Nullable
    public final Object f(float f10, float f11, float f12, float f13, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f31350a = f10;
        this.f31351b = f11;
        this.f31352c = f12;
        this.f31353d = f13;
        Object objE = e(dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    private og(float f10, float f11, float f12, float f13) {
        this.f31350a = f10;
        this.f31351b = f11;
        this.f31352c = f12;
        this.f31353d = f13;
        int i10 = 4 >> 0;
        this.f31354e = new androidx.compose.animation.core.c<>(androidx.compose.ui.unit.h.o(this.f31350a), androidx.compose.animation.core.t4.L(androidx.compose.ui.unit.h.f42689b), null, null, 12, null);
    }
}

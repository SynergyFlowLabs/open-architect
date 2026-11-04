package androidx.compose.foundation.gestures;

import androidx.compose.runtime.k7;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class s3 implements r3, androidx.compose.ui.unit.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14990e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.ui.unit.d f14991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f14994d = kotlinx.coroutines.sync.g.a(false);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {533}, m = "awaitRelease", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f14995a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14997c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14995a = obj;
            this.f14997c |= Integer.MIN_VALUE;
            return s3.this.e7(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {527}, m = MetricTracker.Object.RESET, n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f14998a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15000c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14998a = obj;
            this.f15000c |= Integer.MIN_VALUE;
            return s3.this.x(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {com.rabbitmq.client.a.f264853x}, m = "tryAwaitRelease", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f15001a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15003c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15001a = obj;
            this.f15003c |= Integer.MIN_VALUE;
            return s3.this.l6(this);
        }
    }

    public s3(@NotNull androidx.compose.ui.unit.d dVar) {
        this.f14991a = dVar;
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long C0(long j10) {
        return this.f14991a.C0(j10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float D3(int i10) {
        return this.f14991a.D3(i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float F3(float f10) {
        return this.f14991a.F3(f10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    @NotNull
    public n0.j N3(@NotNull androidx.compose.ui.unit.k kVar) {
        return this.f14991a.N3(kVar);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float S7(float f10) {
        return this.f14991a.S7(f10);
    }

    public final void c() {
        this.f14993c = true;
        if (this.f14994d.c()) {
            kotlinx.coroutines.sync.a.C2318a.d(this.f14994d, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int c8(long j10) {
        return this.f14991a.c8(j10);
    }

    @Override // androidx.compose.ui.unit.n
    @k7
    public long d0(float f10) {
        return this.f14991a.d0(f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // androidx.compose.foundation.gestures.r3
    @Nullable
    public Object e7(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f14997c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f14997c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objL6 = aVar.f14995a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f14997c;
        if (i11 == 0) {
            ResultKt.m(objL6);
            aVar.f14997c = 1;
            objL6 = l6(aVar);
            if (objL6 == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objL6);
        }
        if (((Boolean) objL6).booleanValue()) {
            return Unit.f312394a;
        }
        throw new f3("The press gesture was canceled.");
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int g6(float f10) {
        return this.f14991a.g6(f10);
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f14991a.getDensity();
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long j1(int i10) {
        return this.f14991a.j1(i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long k4(long j10) {
        return this.f14991a.k4(j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.compose.foundation.gestures.r3
    @Nullable
    public Object l6(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f15003c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f15003c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f15001a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f15003c;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!this.f14992b && !this.f14993c) {
                kotlinx.coroutines.sync.a aVar = this.f14994d;
                cVar.f15003c = 1;
                if (kotlinx.coroutines.sync.a.C2318a.b(aVar, null, cVar, 1, null) == objL) {
                    return objL;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(this.f14992b);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        kotlinx.coroutines.sync.a.C2318a.d(this.f14994d, null, 1, null);
        return kotlin.coroutines.jvm.internal.b.a(this.f14992b);
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f14991a.m0();
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long m1(float f10) {
        return this.f14991a.m1(f10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float p6(long j10) {
        return this.f14991a.p6(j10);
    }

    public final void w() {
        this.f14992b = true;
        if (this.f14994d.c()) {
            kotlinx.coroutines.sync.a.C2318a.d(this.f14994d, null, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object x(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f15000c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f15000c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f14998a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f15000c;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.sync.a aVar = this.f14994d;
            bVar.f15000c = 1;
            if (kotlinx.coroutines.sync.a.C2318a.b(aVar, null, bVar, 1, null) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.f14992b = false;
        this.f14993c = false;
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.unit.n
    @k7
    public float y(long j10) {
        return this.f14991a.y(j10);
    }
}

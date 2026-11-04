package androidx.compose.ui.scrollcapture;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nComposeScrollCaptureCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/RelativeScroller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<Float, kotlin.coroutines.d<? super Float>, Object> f41040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f41041c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {296}, m = "scrollBy", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41042a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41044c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41042a = obj;
            this.f41044c |= Integer.MIN_VALUE;
            return g.this.e(0.0f, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(int i10, @NotNull Function2<? super Float, ? super kotlin.coroutines.d<? super Float>, ? extends Object> function2) {
        this.f41039a = i10;
        this.f41040b = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object e(float f10, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f41044c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f41044c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objInvoke = aVar.f41042a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f41044c;
        if (i11 == 0) {
            ResultKt.m(objInvoke);
            Function2<Float, kotlin.coroutines.d<? super Float>, Object> function2 = this.f41040b;
            Float fE = kotlin.coroutines.jvm.internal.b.e(f10);
            aVar.f41044c = 1;
            objInvoke = function2.invoke(fE, aVar);
            if (objInvoke == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objInvoke);
        }
        this.f41041c += ((Number) objInvoke).floatValue();
        return Unit.f312394a;
    }

    public final float b() {
        return this.f41041c;
    }

    public final int c(int i10) {
        return r.I(i10 - kotlin.math.b.L0(this.f41041c), 0, this.f41039a);
    }

    public final void d() {
        this.f41041c = 0.0f;
    }

    @Nullable
    public final Object f(int i10, int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i12 = i11 - i10;
        int i13 = this.f41039a;
        if (i12 > i13) {
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.f41039a).toString());
        }
        float f10 = i10;
        float f11 = this.f41041c;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return Unit.f312394a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objG = g(i10, dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Nullable
    public final Object g(float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = e(f10 - this.f41041c, dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }
}

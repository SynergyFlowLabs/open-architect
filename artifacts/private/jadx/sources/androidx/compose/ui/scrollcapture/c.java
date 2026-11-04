package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.compose.runtime.d3;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.c3;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.unit.s;
import com.rabbitmq.client.k0;
import java.util.function.Consumer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@androidx.annotation.w0(31)
public final class c implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41006h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u f41007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s f41008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f41009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final View f41010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final s0 f41011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final g f41012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41013g;

    public interface a {
        void a();

        void b();
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41014a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f41016c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f41016c = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new b(this.f41016c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f41014a;
            if (i10 == 0) {
                ResultKt.m(obj);
                g gVar = c.this.f41012f;
                this.f41014a = 1;
                if (gVar.g(0.0f, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            c.this.f41009c.a();
            this.f41016c.run();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    static final class C0329c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41017a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f41019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Rect f41020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Consumer<Rect> f41021e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0329c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, kotlin.coroutines.d<? super C0329c> dVar) {
            super(2, dVar);
            this.f41019c = scrollCaptureSession;
            this.f41020d = rect;
            this.f41021e = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new C0329c(this.f41019c, this.f41020d, this.f41021e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f41017a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                ScrollCaptureSession scrollCaptureSession = this.f41019c;
                s sVarD = c3.d(this.f41020d);
                this.f41017a = 1;
                obj = cVar.g(scrollCaptureSession, sVarD, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f41021e.accept(c3.a((s) obj));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0329c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {132, 135}, m = "onScrollCaptureImageRequest", n = {io.sentry.cache.f.f305178k, "captureArea", "targetMin", "targetMax", io.sentry.cache.f.f305178k, "captureArea", "targetMin", "targetMax"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f41026e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f41028g;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41026e = obj;
            this.f41028g |= Integer.MIN_VALUE;
            return c.this.g(null, null, this);
        }
    }

    static final class e extends l0 implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f41029a = new e();

        e() {
            super(1);
        }

        public final void c(long j10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            c(l10.longValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160696i0}, m = "invokeSuspend", n = {"reverseScrolling"}, s = {"Z$0"})
    @SourceDebugExtension({"SMAP\nComposeScrollCaptureCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$scrollTracker$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,307:1\n91#2,5:308\n30#3:313\n53#4,3:314\n70#4:318\n69#5:317\n22#6:319\n*S KotlinDebug\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$scrollTracker$1\n*L\n75#1:308,5\n88#1:313\n88#1:314,3\n89#1:318\n89#1:317\n89#1:319\n*E\n"})
    static final class f extends o implements Function2<Float, kotlin.coroutines.d<? super Float>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f41030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ float f41032c;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = c.this.new f(dVar);
            fVar.f41032c = ((Number) obj).floatValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f10, kotlin.coroutines.d<? super Float> dVar) {
            return k(f10.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f41031b;
            if (i10 == 0) {
                ResultKt.m(obj);
                float f10 = this.f41032c;
                Function2<n0.g, kotlin.coroutines.d<? super n0.g>, Object> function2C = m.c(c.this.f41007a);
                if (function2C == null) {
                    s0.a.j("Required value was null.");
                    throw new a0();
                }
                boolean zB = ((androidx.compose.ui.semantics.l) c.this.f41007a.F().m(z.f41190a.Q())).b();
                if (zB) {
                    f10 = -f10;
                }
                n0.g gVarD = n0.g.d(n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & k0.f265952a)));
                this.f41030a = zB;
                this.f41031b = 1;
                obj = function2C.invoke(gVarD, this);
                if (obj == objL) {
                    return objL;
                }
                z10 = zB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = this.f41030a;
                ResultKt.m(obj);
            }
            long jB = ((n0.g) obj).B();
            return kotlin.coroutines.jvm.internal.b.e(z10 ? -Float.intBitsToFloat((int) (jB & k0.f265952a)) : Float.intBitsToFloat((int) (jB & k0.f265952a)));
        }

        public final Object k(float f10, kotlin.coroutines.d<? super Float> dVar) {
            return ((f) create(Float.valueOf(f10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c(@NotNull u uVar, @NotNull s sVar, @NotNull s0 s0Var, @NotNull a aVar, @NotNull View view) {
        this.f41007a = uVar;
        this.f41008b = sVar;
        this.f41009c = aVar;
        this.f41010d = view;
        this.f41011e = t0.m(s0Var, androidx.compose.ui.scrollcapture.f.f41038a);
        this.f41012f = new g(sVar.r(), new f(null));
    }

    private final void e(Canvas canvas) {
        canvas.drawColor(androidx.compose.ui.graphics.s0.t(q0.a.B(q0.f38131b, 360.0f * kotlin.random.f.f312895a.k(), 0.75f, 0.5f, 1.0f, null, 16, null)));
    }

    private final void f(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(l1.a.f316127c);
        paint.setTextSize(48.0f);
        canvas.drawCircle(0.0f, 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), canvas.getHeight(), 20.0f, paint);
        canvas.drawCircle(0.0f, canvas.getHeight(), 20.0f, paint);
        canvas.drawText(String.valueOf(this.f41013g), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
        this.f41013g++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(ScrollCaptureSession scrollCaptureSession, s sVar, kotlin.coroutines.d<? super s> dVar) {
        d dVar2;
        int iB;
        int iJ;
        s sVar2;
        int i10;
        ScrollCaptureSession scrollCaptureSession2;
        int i11;
        int iC;
        int iC2;
        s sVarH;
        Canvas canvasLockHardwareCanvas;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i12 = dVar2.f41028g;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar2.f41028g = i12 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f41026e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = dVar2.f41028g;
        if (i13 == 0) {
            ResultKt.m(obj);
            iB = sVar.B();
            iJ = sVar.j();
            g gVar = this.f41012f;
            dVar2.f41022a = scrollCaptureSession;
            dVar2.f41023b = sVar;
            dVar2.f41024c = iB;
            dVar2.f41025d = iJ;
            dVar2.f41028g = 1;
            if (gVar.f(iB, iJ, dVar2) != objL) {
            }
            return objL;
        }
        if (i13 == 1) {
            int i14 = dVar2.f41025d;
            int i15 = dVar2.f41024c;
            s sVar3 = (s) dVar2.f41023b;
            ScrollCaptureSession scrollCaptureSessionA = androidx.compose.ui.scrollcapture.a.a(dVar2.f41022a);
            ResultKt.m(obj);
            iB = i15;
            sVar = sVar3;
            iJ = i14;
            scrollCaptureSession = scrollCaptureSessionA;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = dVar2.f41025d;
            i10 = dVar2.f41024c;
            s sVar4 = (s) dVar2.f41023b;
            ScrollCaptureSession scrollCaptureSessionA2 = androidx.compose.ui.scrollcapture.a.a(dVar2.f41022a);
            ResultKt.m(obj);
            scrollCaptureSession2 = scrollCaptureSessionA2;
            sVar2 = sVar4;
        }
        iC = this.f41012f.c(i10);
        iC2 = this.f41012f.c(i11);
        sVarH = s.h(sVar2, 0, iC, 0, iC2, 5, null);
        if (iC == iC2) {
            return s.f42713e.a();
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-sVarH.t(), -sVarH.B());
            canvasLockHardwareCanvas.translate(-this.f41008b.t(), -this.f41008b.B());
            this.f41010d.getRootView().draw(canvasLockHardwareCanvas);
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            return sVarH.N(0, kotlin.math.b.L0(this.f41012f.b()));
        } catch (Throwable th2) {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            throw th2;
        }
        e eVar = e.f41029a;
        dVar2.f41022a = scrollCaptureSession;
        dVar2.f41023b = sVar;
        dVar2.f41024c = iB;
        dVar2.f41025d = iJ;
        dVar2.f41028g = 2;
        if (d3.f(eVar, dVar2) != objL) {
            sVar2 = sVar;
            i10 = iB;
            scrollCaptureSession2 = scrollCaptureSession;
            i11 = iJ;
            iC = this.f41012f.c(i10);
            iC2 = this.f41012f.c(i11);
            sVarH = s.h(sVar2, 0, iC, 0, iC2, 5, null);
            if (iC == iC2) {
                return s.f42713e.a();
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-sVarH.t(), -sVarH.B());
            canvasLockHardwareCanvas.translate(-this.f41008b.t(), -this.f41008b.B());
            this.f41010d.getRootView().draw(canvasLockHardwareCanvas);
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            return sVarH.N(0, kotlin.math.b.L0(this.f41012f.b()));
        }
        return objL;
    }

    public void onScrollCaptureEnd(@NotNull Runnable runnable) {
        kotlinx.coroutines.k.f(this.f41011e, kotlinx.coroutines.c3.f313552a, null, new b(runnable, null), 2, null);
    }

    public void onScrollCaptureImageRequest(@NotNull ScrollCaptureSession scrollCaptureSession, @NotNull CancellationSignal cancellationSignal, @NotNull Rect rect, @NotNull Consumer<Rect> consumer) {
        androidx.compose.ui.scrollcapture.e.c(this.f41011e, cancellationSignal, new C0329c(scrollCaptureSession, rect, consumer, null));
    }

    public void onScrollCaptureSearch(@NotNull CancellationSignal cancellationSignal, @NotNull Consumer<Rect> consumer) {
        consumer.accept(c3.a(this.f41008b));
    }

    public void onScrollCaptureStart(@NotNull ScrollCaptureSession scrollCaptureSession, @NotNull CancellationSignal cancellationSignal, @NotNull Runnable runnable) {
        this.f41012f.d();
        this.f41013g = 0;
        this.f41009c.b();
        runnable.run();
    }
}

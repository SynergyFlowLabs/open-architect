package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.g4;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.w6;
import androidx.compose.ui.graphics.r0;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@k7
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 6 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,475:1\n81#2:476\n107#2,2:477\n81#2:482\n107#2,2:483\n81#2:485\n107#2,2:486\n81#2:488\n107#2,2:489\n81#2:491\n107#2,2:492\n76#3:479\n109#3,2:480\n1#4:494\n26#5,5:495\n845#6,9:500\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n*L\n229#1:476\n229#1:477,2\n231#1:482\n231#1:483,2\n253#1:485\n253#1:486,2\n257#1:488\n257#1:489,2\n261#1:491\n261#1:492,2\n230#1:479\n230#1:480,2\n286#1:495,5\n330#1:500,9\n*E\n"})
public final class AsyncImagePainter extends androidx.compose.ui.graphics.painter.b implements m5 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f86944p0 = 0;

    @NotNull
    private final n3 X;

    @NotNull
    private final n3 Y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private s0 f86946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final k0<n0.n> f86947h = b1.a(n0.n.c(n0.n.f332724b.c()));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n3 f86948i = d7.g(null, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final k3 f86949j = g4.b(1.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final n3 f86950k = d7.g(null, null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private State f86951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.painter.b f86952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private Function1<? super State, ? extends State> f86953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Function1<? super State, Unit> f86954o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.layout.l f86955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f86956t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f86957v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final n3 f86958w;

    @NotNull
    public static final a Z = new a(null);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final Function1<State, State> f86945p1 = new Function1() { // from class: coil.compose.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AsyncImagePainter.p((AsyncImagePainter.State) obj);
        }
    };

    @w0(parameters = 1)
    public static abstract class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f86959a = 0;

        @w0(parameters = 0)
        public static final class Error extends State {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f86960c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final coil.request.f f86961b;

            @Nullable
            private final androidx.compose.ui.graphics.painter.b painter;

            public Error(@Nullable androidx.compose.ui.graphics.painter.b bVar, @NotNull coil.request.f fVar) {
                super(null);
                this.painter = bVar;
                this.f86961b = fVar;
            }

            public static /* synthetic */ Error e(Error error, androidx.compose.ui.graphics.painter.b bVar, coil.request.f fVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bVar = error.painter;
                }
                if ((i10 & 2) != 0) {
                    fVar = error.f86961b;
                }
                return error.d(bVar, fVar);
            }

            @Override // coil.compose.AsyncImagePainter.State
            @Nullable
            public androidx.compose.ui.graphics.painter.b a() {
                return this.painter;
            }

            @Nullable
            public final androidx.compose.ui.graphics.painter.b b() {
                return this.painter;
            }

            @NotNull
            public final coil.request.f c() {
                return this.f86961b;
            }

            @NotNull
            public final Error d(@Nullable androidx.compose.ui.graphics.painter.b bVar, @NotNull coil.request.f fVar) {
                return new Error(bVar, fVar);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.areEqual(this.painter, error.painter) && Intrinsics.areEqual(this.f86961b, error.f86961b);
            }

            @NotNull
            public final coil.request.f f() {
                return this.f86961b;
            }

            public int hashCode() {
                androidx.compose.ui.graphics.painter.b bVar = this.painter;
                return ((bVar == null ? 0 : bVar.hashCode()) * 31) + this.f86961b.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(painter=" + this.painter + ", result=" + this.f86961b + ')';
            }
        }

        @w0(parameters = 0)
        public static final class Loading extends State {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f86962b = 8;

            @Nullable
            private final androidx.compose.ui.graphics.painter.b painter;

            public Loading(@Nullable androidx.compose.ui.graphics.painter.b bVar) {
                super(null);
                this.painter = bVar;
            }

            public static /* synthetic */ Loading d(Loading loading, androidx.compose.ui.graphics.painter.b bVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bVar = loading.painter;
                }
                return loading.c(bVar);
            }

            @Override // coil.compose.AsyncImagePainter.State
            @Nullable
            public androidx.compose.ui.graphics.painter.b a() {
                return this.painter;
            }

            @Nullable
            public final androidx.compose.ui.graphics.painter.b b() {
                return this.painter;
            }

            @NotNull
            public final Loading c(@Nullable androidx.compose.ui.graphics.painter.b bVar) {
                return new Loading(bVar);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && Intrinsics.areEqual(this.painter, ((Loading) obj).painter);
            }

            public int hashCode() {
                androidx.compose.ui.graphics.painter.b bVar = this.painter;
                if (bVar == null) {
                    return 0;
                }
                return bVar.hashCode();
            }

            @NotNull
            public String toString() {
                return "Loading(painter=" + this.painter + ')';
            }
        }

        @w0(parameters = 0)
        public static final class Success extends State {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f86963c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final coil.request.r f86964b;

            @NotNull
            private final androidx.compose.ui.graphics.painter.b painter;

            public Success(@NotNull androidx.compose.ui.graphics.painter.b bVar, @NotNull coil.request.r rVar) {
                super(null);
                this.painter = bVar;
                this.f86964b = rVar;
            }

            public static /* synthetic */ Success e(Success success, androidx.compose.ui.graphics.painter.b bVar, coil.request.r rVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bVar = success.painter;
                }
                if ((i10 & 2) != 0) {
                    rVar = success.f86964b;
                }
                return success.d(bVar, rVar);
            }

            @Override // coil.compose.AsyncImagePainter.State
            @NotNull
            public androidx.compose.ui.graphics.painter.b a() {
                return this.painter;
            }

            @NotNull
            public final androidx.compose.ui.graphics.painter.b b() {
                return this.painter;
            }

            @NotNull
            public final coil.request.r c() {
                return this.f86964b;
            }

            @NotNull
            public final Success d(@NotNull androidx.compose.ui.graphics.painter.b bVar, @NotNull coil.request.r rVar) {
                return new Success(bVar, rVar);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.areEqual(this.painter, success.painter) && Intrinsics.areEqual(this.f86964b, success.f86964b);
            }

            @NotNull
            public final coil.request.r f() {
                return this.f86964b;
            }

            public int hashCode() {
                return (this.painter.hashCode() * 31) + this.f86964b.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(painter=" + this.painter + ", result=" + this.f86964b + ')';
            }
        }

        @w0(parameters = 1)
        public static final class a extends State {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final a f86965b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f86966c = 0;

            private a() {
                super(null);
            }

            @Override // coil.compose.AsyncImagePainter.State
            @Nullable
            public androidx.compose.ui.graphics.painter.b a() {
                return null;
            }

            public boolean equals(@Nullable Object obj) {
                if (this != obj && !(obj instanceof a)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1515560141;
            }

            @NotNull
            public String toString() {
                return "Empty";
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public abstract androidx.compose.ui.graphics.painter.b a();

        private State() {
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function1<State, State> a() {
            return AsyncImagePainter.f86945p1;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.compose.AsyncImagePainter$onRemembered$1$1", f = "AsyncImagePainter.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f86967a;

        @kotlin.coroutines.jvm.internal.f(c = "coil.compose.AsyncImagePainter$onRemembered$1$1$2", f = "AsyncImagePainter.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<coil.request.i, kotlin.coroutines.d<? super State>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f86969a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f86970b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f86971c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AsyncImagePainter asyncImagePainter, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f86971c = asyncImagePainter;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f86971c, dVar);
                aVar.f86970b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AsyncImagePainter asyncImagePainter;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f86969a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    coil.request.i iVar = (coil.request.i) this.f86970b;
                    AsyncImagePainter asyncImagePainter2 = this.f86971c;
                    coil.j jVarB = asyncImagePainter2.B();
                    coil.request.i iVarY = this.f86971c.Y(iVar);
                    this.f86970b = asyncImagePainter2;
                    this.f86969a = 1;
                    obj = jVarB.d(iVarY, this);
                    if (obj == objL) {
                        return objL;
                    }
                    asyncImagePainter = asyncImagePainter2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    asyncImagePainter = (AsyncImagePainter) this.f86970b;
                    ResultKt.m(obj);
                }
                return asyncImagePainter.X((coil.request.j) obj);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(coil.request.i iVar, kotlin.coroutines.d<? super State> dVar) {
                return ((a) create(iVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$b$b, reason: collision with other inner class name */
        /* synthetic */ class C0808b implements kotlinx.coroutines.flow.j, kotlin.jvm.internal.c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f86972a;

            C0808b(AsyncImagePainter asyncImagePainter) {
                this.f86972a = asyncImagePainter;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(State state, kotlin.coroutines.d<? super Unit> dVar) {
                Object objS = b.s(this.f86972a, state, dVar);
                return objS == kotlin.coroutines.intrinsics.b.l() ? objS : Unit.f312394a;
            }

            @Override // kotlin.jvm.internal.c0
            public final kotlin.x<?> b() {
                return new kotlin.jvm.internal.a(2, this.f86972a, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.j) && (obj instanceof kotlin.jvm.internal.c0)) {
                    return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final coil.request.i n(AsyncImagePainter asyncImagePainter) {
            return asyncImagePainter.E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object s(AsyncImagePainter asyncImagePainter, State state, kotlin.coroutines.d dVar) {
            asyncImagePainter.Z(state);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AsyncImagePainter.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f86967a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final AsyncImagePainter asyncImagePainter = AsyncImagePainter.this;
                kotlinx.coroutines.flow.i iVarY0 = kotlinx.coroutines.flow.k.Y0(w6.y(new Function0() { // from class: coil.compose.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AsyncImagePainter.b.n(asyncImagePainter);
                    }
                }), new a(AsyncImagePainter.this, null));
                C0808b c0808b = new C0808b(AsyncImagePainter.this);
                this.f86967a = 1;
                if (iVarY0.collect(c0808b, this) == objL) {
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
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$4\n+ 2 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$2\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$3\n*L\n1#1,852:1\n332#2,2:853\n847#3:855\n848#4:856\n*E\n"})
    public static final class c implements coil.target.c {
        public c() {
        }

        @Override // coil.target.c
        public void onError(Drawable drawable) {
        }

        @Override // coil.target.c
        public void onStart(Drawable drawable) {
            AsyncImagePainter.this.Z(new State.Loading(drawable != null ? AsyncImagePainter.this.W(drawable) : null));
        }

        @Override // coil.target.c
        public void onSuccess(Drawable drawable) {
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter$updateRequest$2$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,475:1\n56#2:476\n59#2:480\n46#3:477\n51#3:479\n105#4:478\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter$updateRequest$2$1\n*L\n338#1:476\n338#1:480\n338#1:477\n338#1:479\n338#1:478\n*E\n"})
    static final class d implements coil.size.j {

        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
        public static final class a implements kotlinx.coroutines.flow.i<coil.size.i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f86975a;

            /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$d$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter$updateRequest$2$1\n*L\n1#1,218:1\n57#2:219\n58#2:221\n338#3:220\n*E\n"})
            public static final class C0809a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j f86976a;

                /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$d$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
                public static final class C0810a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f86977a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f86978b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f86979c;

                    public C0810a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f86977a = obj;
                        this.f86978b |= Integer.MIN_VALUE;
                        return C0809a.this.emit(null, this);
                    }
                }

                public C0809a(kotlinx.coroutines.flow.j jVar) {
                    this.f86976a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.j
                @Nullable
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                    C0810a c0810a;
                    if (dVar instanceof C0810a) {
                        c0810a = (C0810a) dVar;
                        int i10 = c0810a.f86978b;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0810a.f86978b = i10 - Integer.MIN_VALUE;
                        } else {
                            c0810a = new C0810a(dVar);
                        }
                    } else {
                        c0810a = new C0810a(dVar);
                    }
                    Object obj2 = c0810a.f86977a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c0810a.f86978b;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        kotlinx.coroutines.flow.j jVar = this.f86976a;
                        coil.size.i iVarH = g.h(((n0.n) obj).y());
                        if (iVarH != null) {
                            c0810a.f86978b = 1;
                            if (jVar.emit(iVarH, c0810a) == objL) {
                                return objL;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj2);
                    }
                    return Unit.f312394a;
                }
            }

            public a(kotlinx.coroutines.flow.i iVar) {
                this.f86975a = iVar;
            }

            @Override // kotlinx.coroutines.flow.i
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.j<? super coil.size.i> jVar, @NotNull kotlin.coroutines.d dVar) {
                Object objCollect = this.f86975a.collect(new C0809a(jVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }

        d() {
        }

        @Override // coil.size.j
        public final Object a(kotlin.coroutines.d<? super coil.size.i> dVar) {
            return kotlinx.coroutines.flow.k.w0(new a(AsyncImagePainter.this.f86947h), dVar);
        }
    }

    public AsyncImagePainter(@NotNull coil.request.i iVar, @NotNull coil.j jVar) {
        State.a aVar = State.a.f86965b;
        this.f86951l = aVar;
        this.f86953n = f86945p1;
        this.f86955s = androidx.compose.ui.layout.l.f39405a.i();
        this.f86956t = androidx.compose.ui.graphics.drawscope.f.H.b();
        this.f86958w = d7.g(aVar, null, 2, null);
        this.X = d7.g(iVar, null, 2, null);
        this.Y = d7.g(jVar, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.ui.graphics.painter.b D() {
        return (androidx.compose.ui.graphics.painter.b) this.f86948i.getValue();
    }

    private final CrossfadePainter I(State state, State state2) {
        coil.request.j jVarF;
        if (!(state2 instanceof State.Success)) {
            if (state2 instanceof State.Error) {
                jVarF = ((State.Error) state2).f();
            }
            return null;
        }
        jVarF = ((State.Success) state2).f();
        coil.transition.c cVarA = jVarF.b().P().a(g.f87048a, jVarF);
        if (cVarA instanceof coil.transition.a) {
            coil.transition.a aVar = (coil.transition.a) cVarA;
            return new CrossfadePainter(state instanceof State.Loading ? state.a() : null, state2.a(), this.f86955s, aVar.b(), ((jVarF instanceof coil.request.r) && ((coil.request.r) jVarF).h()) ? false : true, aVar.c());
        }
        return null;
    }

    private final void J(float f10) {
        this.f86949j.q(f10);
    }

    private final void K(r0 r0Var) {
        this.f86950k.setValue(r0Var);
    }

    private final void P(androidx.compose.ui.graphics.painter.b bVar) {
        this.f86948i.setValue(bVar);
    }

    private final void S(State state) {
        this.f86958w.setValue(state);
    }

    private final void U(androidx.compose.ui.graphics.painter.b bVar) {
        this.f86952m = bVar;
        P(bVar);
    }

    private final void V(State state) {
        this.f86951l = state;
        S(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.graphics.painter.b W(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? androidx.compose.ui.graphics.painter.a.b(androidx.compose.ui.graphics.j.c(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.f86956t, 6, null) : new DrawablePainter(drawable.mutate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State X(coil.request.j jVar) {
        if (jVar instanceof coil.request.r) {
            coil.request.r rVar = (coil.request.r) jVar;
            return new State.Success(W(rVar.a()), rVar);
        }
        if (!(jVar instanceof coil.request.f)) {
            throw new kotlin.k0();
        }
        coil.request.f fVar = (coil.request.f) jVar;
        Drawable drawableA = fVar.a();
        return new State.Error(drawableA != null ? W(drawableA) : null, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final coil.request.i Y(coil.request.i iVar) {
        coil.request.i.a aVarM0 = coil.request.i.S(iVar, null, 1, null).m0(new c());
        if (iVar.q().o() == null) {
            aVarM0.h0(new d());
        }
        if (iVar.q().n() == null) {
            aVarM0.Y(g0.q(this.f86955s));
        }
        if (iVar.q().m() != coil.size.e.EXACT) {
            aVarM0.P(coil.size.e.INEXACT);
        }
        return aVarM0.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(State state) {
        State state2 = this.f86951l;
        State stateInvoke = this.f86953n.invoke(state);
        V(stateInvoke);
        androidx.compose.ui.graphics.painter.b bVarI = I(state2, stateInvoke);
        if (bVarI == null) {
            bVarI = stateInvoke.a();
        }
        U(bVarI);
        if (this.f86946g != null && state2.a() != stateInvoke.a()) {
            Object objA = state2.a();
            m5 m5Var = objA instanceof m5 ? (m5) objA : null;
            if (m5Var != null) {
                m5Var.k();
            }
            Object objA2 = stateInvoke.a();
            m5 m5Var2 = objA2 instanceof m5 ? (m5) objA2 : null;
            if (m5Var2 != null) {
                m5Var2.i();
            }
        }
        Function1<? super State, Unit> function1 = this.f86954o;
        if (function1 != null) {
            function1.invoke(stateInvoke);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State p(State state) {
        return state;
    }

    private final void w() {
        s0 s0Var = this.f86946g;
        if (s0Var != null) {
            t0.f(s0Var, null, 1, null);
        }
        this.f86946g = null;
    }

    private final float x() {
        return this.f86949j.V0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final r0 y() {
        return (r0) this.f86950k.getValue();
    }

    public final int A() {
        return this.f86956t;
    }

    @NotNull
    public final coil.j B() {
        return (coil.j) this.Y.getValue();
    }

    @Nullable
    public final Function1<State, Unit> C() {
        return this.f86954o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final coil.request.i E() {
        return (coil.request.i) this.X.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final State F() {
        return (State) this.f86958w.getValue();
    }

    @NotNull
    public final Function1<State, State> G() {
        return this.f86953n;
    }

    public final boolean H() {
        return this.f86957v;
    }

    public final void L(@NotNull androidx.compose.ui.layout.l lVar) {
        this.f86955s = lVar;
    }

    public final void M(int i10) {
        this.f86956t = i10;
    }

    public final void N(@NotNull coil.j jVar) {
        this.Y.setValue(jVar);
    }

    public final void O(@Nullable Function1<? super State, Unit> function1) {
        this.f86954o = function1;
    }

    public final void Q(boolean z10) {
        this.f86957v = z10;
    }

    public final void R(@NotNull coil.request.i iVar) {
        this.X.setValue(iVar);
    }

    public final void T(@NotNull Function1<? super State, ? extends State> function1) {
        this.f86953n = function1;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean a(float f10) {
        J(f10);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean b(@Nullable r0 r0Var) {
        K(r0Var);
        return true;
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f86946g == null) {
                s0 s0VarA = t0.a(q3.c(null, 1, null).plus(l1.e().R0()));
                this.f86946g = s0VarA;
                Object obj = this.f86952m;
                m5 m5Var = obj instanceof m5 ? (m5) obj : null;
                if (m5Var != null) {
                    m5Var.i();
                }
                if (this.f86957v) {
                    Drawable drawableF = coil.request.i.S(E(), null, 1, null).n(B().b()).f().F();
                    Z(new State.Loading(drawableF != null ? W(drawableF) : null));
                } else {
                    kotlinx.coroutines.k.f(s0VarA, null, null, new b(null), 3, null);
                }
            }
            Unit unit = Unit.f312394a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        w();
        Object obj = this.f86952m;
        m5 m5Var = obj instanceof m5 ? (m5) obj : null;
        if (m5Var != null) {
            m5Var.j();
        }
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        w();
        Object obj = this.f86952m;
        m5 m5Var = obj instanceof m5 ? (m5) obj : null;
        if (m5Var != null) {
            m5Var.k();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        androidx.compose.ui.graphics.painter.b bVarD = D();
        return bVarD != null ? bVarD.l() : n0.n.f332724b.a();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        this.f86947h.setValue(n0.n.c(fVar.d()));
        androidx.compose.ui.graphics.painter.b bVarD = D();
        if (bVarD != null) {
            bVarD.g(fVar, fVar.d(), x(), y());
        }
    }

    @NotNull
    public final androidx.compose.ui.layout.l z() {
        return this.f86955s;
    }
}

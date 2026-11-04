package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.l0;
import androidx.lifecycle.c0;
import coil.memory.MemoryCache;
import coil.request.p;
import coil.request.q;
import coil.request.r;
import coil.util.b0;
import coil.util.w;
import coil.util.z;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.t0;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRealImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ComponentRegistry.kt\ncoil/ComponentRegistry$Builder\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Utils.kt\ncoil/util/-Utils\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 8 Logs.kt\ncoil/util/-Logs\n*L\n1#1,301:1\n279#1,15:331\n279#1,15:350\n44#2,4:302\n138#3:306\n138#3:307\n138#3:308\n138#3:309\n138#3:310\n138#3:311\n146#3:312\n146#3:313\n154#3:314\n154#3:315\n154#3:316\n154#3:317\n154#3:318\n154#3:319\n154#3:320\n154#3:321\n1#4:322\n1#4:324\n173#5:323\n50#6:325\n28#7:326\n21#8,4:327\n21#8,4:346\n21#8,4:365\n*S KotlinDebug\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n*L\n246#1:331,15\n260#1:350,15\n78#1:302,4\n85#1:306\n86#1:307\n87#1:308\n88#1:309\n89#1:310\n90#1:311\n92#1:312\n93#1:313\n95#1:314\n96#1:315\n97#1:316\n98#1:317\n99#1:318\n100#1:319\n101#1:320\n102#1:321\n175#1:324\n175#1:323\n176#1:325\n176#1:326\n243#1:327,4\n257#1:346,4\n266#1:365,4\n*E\n"})
public final class m implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final a f87495p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f87496q = "RealImageLoader";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f87497r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f87498s = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f87499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final coil.request.c f87500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0<MemoryCache> f87501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0<coil.disk.a> f87502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0<okhttp3.e.a> f87503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final coil.d.InterfaceC0813d f87504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final coil.c f87505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final w f87506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final z f87507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final s0 f87508j = t0.a(q3.c(null, 1, null).plus(l1.e().R0()).plus(new g(o0.L2, this)));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final b0 f87509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final q f87510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final coil.c f87511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final List<coil.intercept.b> f87512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f87513o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super coil.request.j>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87514a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ coil.request.i f87516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(coil.request.i iVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f87516c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new b(this.f87516c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            z zVarP;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f87514a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m mVar = m.this;
                coil.request.i iVar = this.f87516c;
                this.f87514a = 1;
                obj = mVar.i(iVar, 0, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            m mVar2 = m.this;
            coil.request.j jVar = (coil.request.j) obj;
            if ((jVar instanceof coil.request.f) && (zVarP = mVar2.p()) != null) {
                coil.util.j.b(zVarP, m.f87496q, ((coil.request.f) jVar).e());
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super coil.request.j> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super coil.request.j>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f87518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ coil.request.i f87519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f87520d;

        @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super coil.request.j>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f87521a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f87522b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ coil.request.i f87523c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, coil.request.i iVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f87522b = mVar;
                this.f87523c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f87522b, this.f87523c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f87521a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                m mVar = this.f87522b;
                coil.request.i iVar = this.f87523c;
                this.f87521a = 1;
                Object objI = mVar.i(iVar, 1, this);
                return objI == objL ? objL : objI;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super coil.request.j> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(coil.request.i iVar, m mVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f87519c = iVar;
            this.f87520d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f87519c, this.f87520d, dVar);
            cVar.f87518b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f87517a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            a1<? extends coil.request.j> a1VarB = kotlinx.coroutines.k.b((s0) this.f87518b, l1.e().R0(), null, new a(this.f87520d, this.f87519c, null), 2, null);
            coil.util.l.t(((coil.target.d) this.f87519c.M()).getView()).b(a1VarB);
            this.f87517a = 1;
            Object objQ = a1VarB.q(this);
            return objQ == objL ? objL : objQ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super coil.request.j> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$execute$3", f = "RealImageLoader.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super coil.request.j>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87524a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ coil.request.i f87526c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(coil.request.i iVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f87526c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new d(this.f87526c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f87524a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            m mVar = m.this;
            coil.request.i iVar = this.f87526c;
            this.f87524a = 1;
            Object objI = mVar.i(iVar, 1, this);
            return objI == objL ? objL : objI;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super coil.request.j> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {171, 183, 187}, m = "executeMain", n = {"this", "requestDelegate", "request", "eventListener", "this", "requestDelegate", "request", "eventListener", "placeholderBitmap", "this", "requestDelegate", "request", "eventListener"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f87529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87532f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f87534h;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87532f = obj;
            this.f87534h |= Integer.MIN_VALUE;
            return m.this.i(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super coil.request.j>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ coil.request.i f87536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f87537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ coil.size.i f87538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ coil.d f87539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f87540f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(coil.request.i iVar, m mVar, coil.size.i iVar2, coil.d dVar, Bitmap bitmap, kotlin.coroutines.d<? super f> dVar2) {
            super(2, dVar2);
            this.f87536b = iVar;
            this.f87537c = mVar;
            this.f87538d = iVar2;
            this.f87539e = dVar;
            this.f87540f = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f87536b, this.f87537c, this.f87538d, this.f87539e, this.f87540f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f87535a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            coil.intercept.c cVar = new coil.intercept.c(this.f87536b, this.f87537c.f87512n, 0, this.f87536b, this.f87538d, this.f87539e, this.f87540f != null);
            coil.request.i iVar = this.f87536b;
            this.f87535a = 1;
            Object objA = cVar.a(iVar, this);
            return objA == objL ? objL : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super coil.request.j> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 RealImageLoader.kt\ncoil/RealImageLoader\n*L\n1#1,106:1\n78#2:107\n*E\n"})
    public static final class g extends kotlin.coroutines.a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f87541a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o0.b bVar, m mVar) {
            super(bVar);
            this.f87541a = mVar;
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            z zVarP = this.f87541a.p();
            if (zVarP != null) {
                coil.util.j.b(zVarP, m.f87496q, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull Context context, @NotNull coil.request.c cVar, @NotNull f0<? extends MemoryCache> f0Var, @NotNull f0<? extends coil.disk.a> f0Var2, @NotNull f0<? extends okhttp3.e.a> f0Var3, @NotNull coil.d.InterfaceC0813d interfaceC0813d, @NotNull coil.c cVar2, @NotNull w wVar, @Nullable z zVar) {
        this.f87499a = context;
        this.f87500b = cVar;
        this.f87501c = f0Var;
        this.f87502d = f0Var2;
        this.f87503e = f0Var3;
        this.f87504f = interfaceC0813d;
        this.f87505g = cVar2;
        this.f87506h = wVar;
        this.f87507i = zVar;
        b0 b0Var = new b0(this);
        this.f87509k = b0Var;
        q qVar = new q(this, b0Var, zVar);
        this.f87510l = qVar;
        this.f87511m = cVar2.h().h(new o4.c(), v.class).h(new o4.g(), String.class).h(new o4.b(), Uri.class).h(new o4.f(), Uri.class).h(new o4.e(), Integer.class).h(new o4.a(), byte[].class).f(new n4.c(), Uri.class).f(new n4.a(wVar.c()), File.class).c(new coil.fetch.j.b(f0Var3, f0Var2, wVar.g()), Uri.class).c(new coil.fetch.i.a(), File.class).c(new coil.fetch.a.C0818a(), Uri.class).c(new coil.fetch.d.a(), Uri.class).c(new coil.fetch.l.b(), Uri.class).c(new coil.fetch.e.a(), Drawable.class).c(new coil.fetch.b.a(), Bitmap.class).c(new coil.fetch.c.a(), ByteBuffer.class).a(new coil.decode.c.C0814c(wVar.e(), wVar.d())).i();
        this.f87512n = CollectionsKt.plus((Collection<? extends coil.intercept.a>) getComponents().c(), new coil.intercept.a(this, b0Var, qVar, zVar));
        this.f87513o = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0195 A[Catch: all -> 0x01a1, TryCatch #2 {all -> 0x01a1, blocks: (B:69:0x018f, B:71:0x0195, B:74:0x01a5, B:76:0x01a9, B:79:0x01b7, B:80:0x01bc), top: B:99:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a5 A[Catch: all -> 0x01a1, TryCatch #2 {all -> 0x01a1, blocks: (B:69:0x018f, B:71:0x0195, B:74:0x01a5, B:76:0x01a9, B:79:0x01b7, B:80:0x01bc), top: B:99:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01a9 A[Catch: all -> 0x01a1, TRY_LEAVE, TryCatch #2 {all -> 0x01a1, blocks: (B:69:0x018f, B:71:0x0195, B:74:0x01a5, B:76:0x01a9, B:79:0x01b7, B:80:0x01bc), top: B:99:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b7 A[Catch: all -> 0x01a1, TRY_ENTER, TryCatch #2 {all -> 0x01a1, blocks: (B:69:0x018f, B:71:0x0195, B:74:0x01a5, B:76:0x01a9, B:79:0x01b7, B:80:0x01bc), top: B:99:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @l0
    public final Object i(coil.request.i iVar, int i10, kotlin.coroutines.d<? super coil.request.j> dVar) {
        e eVar;
        p pVarG;
        coil.request.i iVarF;
        coil.d dVarB;
        coil.request.i iVar2;
        p pVar;
        coil.request.i iVar3;
        Bitmap bitmapC;
        m mVar;
        coil.request.i iVar4;
        coil.d dVar2;
        coil.d dVar3;
        coil.request.j jVar;
        m mVar2 = this;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.f87534h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f87534h = i11 - Integer.MIN_VALUE;
            } else {
                eVar = mVar2.new e(dVar);
            }
        } else {
            eVar = mVar2.new e(dVar);
        }
        Object objH = eVar.f87532f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = eVar.f87534h;
        if (i12 != 0) {
            if (i12 == 1) {
                coil.d dVar4 = (coil.d) eVar.f87530d;
                iVar3 = (coil.request.i) eVar.f87529c;
                pVar = (p) eVar.f87528b;
                m mVar3 = (m) eVar.f87527a;
                try {
                    ResultKt.m(objH);
                    dVarB = dVar4;
                    mVar2 = mVar3;
                    iVarF = iVar3;
                    pVarG = pVar;
                } catch (Throwable th2) {
                    th = th2;
                    dVarB = dVar4;
                    mVar2 = mVar3;
                    iVar2 = iVar3;
                    pVarG = pVar;
                }
            } else if (i12 == 2) {
                bitmapC = (Bitmap) eVar.f87531e;
                coil.d dVar5 = (coil.d) eVar.f87530d;
                coil.request.i iVar5 = (coil.request.i) eVar.f87529c;
                p pVar2 = (p) eVar.f87528b;
                m mVar4 = (m) eVar.f87527a;
                try {
                    ResultKt.m(objH);
                    dVar2 = dVar5;
                    iVar4 = iVar5;
                    pVarG = pVar2;
                    mVar = mVar4;
                    Bitmap bitmap = bitmapC;
                    try {
                        coil.size.i iVar6 = (coil.size.i) objH;
                        dVar2.x(iVar4, iVar6);
                        n0 n0VarY = iVar4.y();
                        f fVar = new f(iVar4, mVar, iVar6, dVar2, bitmap, null);
                        eVar.f87527a = mVar;
                        eVar.f87528b = pVarG;
                        eVar.f87529c = iVar4;
                        eVar.f87530d = dVar2;
                        eVar.f87531e = null;
                        eVar.f87534h = 3;
                        objH = kotlinx.coroutines.i.h(n0VarY, fVar, eVar);
                        if (objH != objL) {
                            iVar2 = iVar4;
                            dVar3 = dVar2;
                            jVar = (coil.request.j) objH;
                            if (jVar instanceof r) {
                                mVar.v((r) jVar, iVar2.M(), dVar3);
                            } else {
                                if (!(jVar instanceof coil.request.f)) {
                                    throw new k0();
                                }
                                mVar.u((coil.request.f) jVar, iVar2.M(), dVar3);
                            }
                            pVarG.complete();
                            return jVar;
                        }
                        return objL;
                    } catch (Throwable th3) {
                        th = th3;
                        iVar2 = iVar4;
                        mVar2 = mVar;
                        dVarB = dVar2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dVarB = dVar5;
                    iVar2 = iVar5;
                    pVarG = pVar2;
                    mVar2 = mVar4;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar3 = (coil.d) eVar.f87530d;
                iVar2 = (coil.request.i) eVar.f87529c;
                pVarG = (p) eVar.f87528b;
                m mVar5 = (m) eVar.f87527a;
                try {
                    ResultKt.m(objH);
                    mVar = mVar5;
                    try {
                        jVar = (coil.request.j) objH;
                        if (jVar instanceof r) {
                            mVar.v((r) jVar, iVar2.M(), dVar3);
                        } else {
                            if (!(jVar instanceof coil.request.f)) {
                                throw new k0();
                            }
                            mVar.u((coil.request.f) jVar, iVar2.M(), dVar3);
                        }
                        pVarG.complete();
                        return jVar;
                    } catch (Throwable th5) {
                        th = th5;
                        dVarB = dVar3;
                        mVar2 = mVar;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    dVarB = dVar3;
                    mVar2 = mVar5;
                }
            }
            try {
                if (th instanceof CancellationException) {
                    mVar2.t(iVar2, dVarB);
                    throw th;
                }
                coil.request.f fVarA = mVar2.f87510l.a(iVar2, th);
                mVar2.u(fVarA, iVar2.M(), dVarB);
                pVarG.complete();
                return fVarA;
            } catch (Throwable th7) {
                pVarG.complete();
                throw th7;
            }
        }
        ResultKt.m(objH);
        pVarG = mVar2.f87510l.g(iVar, s2.A(eVar.getContext()));
        pVarG.t();
        iVarF = coil.request.i.S(iVar, null, 1, null).n(mVar2.b()).f();
        dVarB = mVar2.f87504f.b(iVarF);
        try {
            if (iVarF.m() == coil.request.k.f87717a) {
                throw new coil.request.l();
            }
            pVarG.start();
            if (i10 == 0) {
                c0 c0VarZ = iVarF.z();
                eVar.f87527a = mVar2;
                eVar.f87528b = pVarG;
                eVar.f87529c = iVarF;
                eVar.f87530d = dVarB;
                eVar.f87534h = 1;
                if (coil.util.i.a(c0VarZ, eVar) != objL) {
                    pVar = pVarG;
                    iVar3 = iVarF;
                    iVarF = iVar3;
                    pVarG = pVar;
                }
            }
            return objL;
        } catch (Throwable th8) {
            th = th8;
            iVar2 = iVarF;
        }
        MemoryCache memoryCacheF = mVar2.f();
        if (memoryCacheF == null) {
            bitmapC = null;
        } else {
            MemoryCache.Key keyG = iVarF.G();
            MemoryCache.b bVarE = keyG != null ? memoryCacheF.e(keyG) : null;
            if (bVarE != null) {
                bitmapC = bVarE.c();
            } else {
                bitmapC = null;
            }
        }
        Drawable bitmapDrawable = bitmapC != null ? new BitmapDrawable(iVarF.l().getResources(), bitmapC) : iVarF.F();
        coil.target.c cVarM = iVarF.M();
        if (cVarM != null) {
            cVarM.onStart(bitmapDrawable);
        }
        dVarB.onStart(iVarF);
        coil.request.i.b bVarA = iVarF.A();
        if (bVarA != null) {
            bVarA.onStart(iVarF);
        }
        dVarB.I(iVarF);
        coil.size.j jVarK = iVarF.K();
        eVar.f87527a = mVar2;
        eVar.f87528b = pVarG;
        eVar.f87529c = iVarF;
        eVar.f87530d = dVarB;
        eVar.f87531e = bitmapC;
        eVar.f87534h = 2;
        Object objA = jVarK.a(eVar);
        if (objA != objL) {
            mVar = mVar2;
            iVar4 = iVarF;
            objH = objA;
            dVar2 = dVarB;
            Bitmap bitmap2 = bitmapC;
            coil.size.i iVar7 = (coil.size.i) objH;
            dVar2.x(iVar4, iVar7);
            n0 n0VarY2 = iVar4.y();
            f fVar2 = new f(iVar4, mVar, iVar7, dVar2, bitmap2, null);
            eVar.f87527a = mVar;
            eVar.f87528b = pVarG;
            eVar.f87529c = iVar4;
            eVar.f87530d = dVar2;
            eVar.f87531e = null;
            eVar.f87534h = 3;
            objH = kotlinx.coroutines.i.h(n0VarY2, fVar2, eVar);
            if (objH != objL) {
                iVar2 = iVar4;
                dVar3 = dVar2;
                jVar = (coil.request.j) objH;
                if (jVar instanceof r) {
                    mVar.v((r) jVar, iVar2.M(), dVar3);
                } else {
                    if (!(jVar instanceof coil.request.f)) {
                        throw new k0();
                    }
                    mVar.u((coil.request.f) jVar, iVar2.M(), dVar3);
                }
                pVarG.complete();
                return jVar;
            }
        }
        return objL;
    }

    private static Object m(m mVar) {
        return mVar.f87502d;
    }

    private static Object q(m mVar) {
        return mVar.f87501c;
    }

    private final void t(coil.request.i iVar, coil.d dVar) {
        z zVar = this.f87507i;
        if (zVar != null && zVar.g() <= 4) {
            zVar.h(f87496q, 4, "🏗  Cancelled - " + iVar.m(), null);
        }
        dVar.onCancel(iVar);
        coil.request.i.b bVarA = iVar.A();
        if (bVarA != null) {
            bVarA.onCancel(iVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    private final void u(coil.request.f fVar, coil.target.c cVar, coil.d dVar) {
        coil.request.i iVarB = fVar.b();
        z zVar = this.f87507i;
        if (zVar != null && zVar.g() <= 4) {
            int i10 = 0 >> 0;
            zVar.h(f87496q, 4, "🚨 Failed - " + iVarB.m() + " - " + fVar.e(), null);
        }
        if (cVar instanceof coil.transition.d) {
            coil.transition.c cVarA = fVar.b().P().a((coil.transition.d) cVar, fVar);
            if (cVarA instanceof coil.transition.b) {
                cVar.onError(fVar.a());
            } else {
                dVar.j(fVar.b(), cVarA);
                cVarA.a();
                dVar.n(fVar.b(), cVarA);
            }
        } else if (cVar != null) {
            cVar.onError(fVar.a());
        }
        dVar.onError(iVarB, fVar);
        coil.request.i.b bVarA = iVarB.A();
        if (bVarA != null) {
            bVarA.onError(iVarB, fVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    private final void v(r rVar, coil.target.c cVar, coil.d dVar) {
        coil.request.i iVarB = rVar.b();
        coil.decode.e eVarE = rVar.e();
        z zVar = this.f87507i;
        if (zVar != null && zVar.g() <= 4) {
            zVar.h(f87496q, 4, coil.util.l.l(eVarE) + " Successful (" + eVarE.name() + ") - " + iVarB.m(), null);
        }
        if (cVar instanceof coil.transition.d) {
            coil.transition.c cVarA = rVar.b().P().a((coil.transition.d) cVar, rVar);
            if (cVarA instanceof coil.transition.b) {
                cVar.onSuccess(rVar.a());
            } else {
                dVar.j(rVar.b(), cVarA);
                cVarA.a();
                dVar.n(rVar.b(), cVarA);
            }
        } else if (cVar != null) {
            cVar.onSuccess(rVar.a());
        }
        dVar.onSuccess(iVarB, rVar);
        coil.request.i.b bVarA = iVarB.A();
        if (bVarA != null) {
            bVarA.onSuccess(iVarB, rVar);
        }
    }

    private final void x(coil.request.j jVar, coil.target.c cVar, coil.d dVar, Function0<Unit> function0) {
        if (!(cVar instanceof coil.transition.d)) {
            function0.invoke();
            return;
        }
        coil.transition.c cVarA = jVar.b().P().a((coil.transition.d) cVar, jVar);
        if (cVarA instanceof coil.transition.b) {
            function0.invoke();
            return;
        }
        dVar.j(jVar.b(), cVarA);
        cVarA.a();
        dVar.n(jVar.b(), cVarA);
    }

    @Override // coil.j
    @Nullable
    public coil.disk.a a() {
        return this.f87502d.getValue();
    }

    @Override // coil.j
    @NotNull
    public coil.request.c b() {
        return this.f87500b;
    }

    @Override // coil.j
    @NotNull
    public coil.request.e c(@NotNull coil.request.i iVar) {
        a1<? extends coil.request.j> a1VarB = kotlinx.coroutines.k.b(this.f87508j, null, null, new b(iVar, null), 3, null);
        return iVar.M() instanceof coil.target.d ? coil.util.l.t(((coil.target.d) iVar.M()).getView()).b(a1VarB) : new coil.request.m(a1VarB);
    }

    @Override // coil.j
    @Nullable
    public Object d(@NotNull coil.request.i iVar, @NotNull kotlin.coroutines.d<? super coil.request.j> dVar) {
        return iVar.M() instanceof coil.target.d ? t0.g(new c(iVar, this, null), dVar) : kotlinx.coroutines.i.h(l1.e().R0(), new d(iVar, null), dVar);
    }

    @Override // coil.j
    @NotNull
    public j.a e() {
        return new j.a(this);
    }

    @Override // coil.j
    @Nullable
    public MemoryCache f() {
        return this.f87501c.getValue();
    }

    @Override // coil.j
    @NotNull
    public coil.c getComponents() {
        return this.f87511m;
    }

    @NotNull
    public final f0<okhttp3.e.a> j() {
        return this.f87503e;
    }

    @NotNull
    public final coil.c k() {
        return this.f87505g;
    }

    @NotNull
    public final Context l() {
        return this.f87499a;
    }

    @NotNull
    public final f0<coil.disk.a> n() {
        return this.f87502d;
    }

    @NotNull
    public final coil.d.InterfaceC0813d o() {
        return this.f87504f;
    }

    @Nullable
    public final z p() {
        return this.f87507i;
    }

    @NotNull
    public final f0<MemoryCache> r() {
        return this.f87501c;
    }

    @NotNull
    public final w s() {
        return this.f87506h;
    }

    @Override // coil.j
    public void shutdown() {
        if (!this.f87513o.getAndSet(true)) {
            t0.f(this.f87508j, null, 1, null);
            this.f87509k.j();
            MemoryCache memoryCacheF = f();
            if (memoryCacheF != null) {
                memoryCacheF.clear();
            }
        }
    }

    public final void w(int i10) {
        MemoryCache value;
        f0<MemoryCache> f0Var = this.f87501c;
        if (f0Var == null || (value = f0Var.getValue()) == null) {
            return;
        }
        value.b(i10);
    }
}

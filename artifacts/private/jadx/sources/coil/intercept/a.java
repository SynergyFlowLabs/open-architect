package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.l1;
import coil.fetch.m;
import coil.j;
import coil.memory.MemoryCache;
import coil.request.n;
import coil.request.q;
import coil.request.r;
import coil.util.b0;
import coil.util.l;
import coil.util.s;
import coil.util.z;
import com.google.firebase.remoteconfig.d0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Logs.kt\ncoil/util/-Logs\n*L\n1#1,306:1\n1#2:307\n1#2:309\n1#2:311\n184#3:308\n188#3:310\n21#4,4:312\n21#4,4:316\n21#4,4:320\n*S KotlinDebug\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n*L\n120#1:309\n121#1:311\n120#1:308\n121#1:310\n234#1:312,4\n266#1:316,4\n272#1:320,4\n*E\n"})
public final class a implements coil.intercept.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C0819a f87393f = new C0819a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f87394g = "EngineInterceptor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f87395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b0 f87396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q f87397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final z f87398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final coil.memory.c f87399e;

    /* JADX INFO: renamed from: coil.intercept.a$a, reason: collision with other inner class name */
    public static final class C0819a {
        public /* synthetic */ C0819a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0819a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Drawable f87400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f87401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final coil.decode.e f87402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f87403d;

        public b(@NotNull Drawable drawable, boolean z10, @NotNull coil.decode.e eVar, @Nullable String str) {
            this.f87400a = drawable;
            this.f87401b = z10;
            this.f87402c = eVar;
            this.f87403d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, coil.decode.e eVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f87400a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f87401b;
            }
            if ((i10 & 4) != 0) {
                eVar = bVar.f87402c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f87403d;
            }
            return bVar.a(drawable, z10, eVar, str);
        }

        @NotNull
        public final b a(@NotNull Drawable drawable, boolean z10, @NotNull coil.decode.e eVar, @Nullable String str) {
            return new b(drawable, z10, eVar, str);
        }

        @NotNull
        public final coil.decode.e c() {
            return this.f87402c;
        }

        @Nullable
        public final String d() {
            return this.f87403d;
        }

        @NotNull
        public final Drawable e() {
            return this.f87400a;
        }

        public final boolean f() {
            return this.f87401b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {203}, m = "decode", n = {"this", "fetchResult", "components", "request", "mappedData", io.sentry.rrweb.h.f306695g, "eventListener", "decoder", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f87406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f87410g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f87411h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f87412i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f87413j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f87415l;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87413j = obj;
            this.f87415l |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {okhttp3.internal.ws.g.f334652s, 130, com.planner5d.library.engine.input.f.b.G1}, m = "execute", n = {"this", "request", "mappedData", "eventListener", io.sentry.rrweb.h.f306695g, "components", "fetchResult", "this", "request", "eventListener", io.sentry.rrweb.h.f306695g, "fetchResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f87418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f87422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f87423h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f87424i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f87426k;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87424i = obj;
            this.f87426k |= Integer.MIN_VALUE;
            return a.this.j(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87427a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.h<coil.fetch.g> f87429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1.h<coil.c> f87430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ coil.request.i f87431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f87432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i1.h<n> f87433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ coil.d f87434h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(i1.h<coil.fetch.g> hVar, i1.h<coil.c> hVar2, coil.request.i iVar, Object obj, i1.h<n> hVar3, coil.d dVar, kotlin.coroutines.d<? super e> dVar2) {
            super(2, dVar2);
            this.f87429c = hVar;
            this.f87430d = hVar2;
            this.f87431e = iVar;
            this.f87432f = obj;
            this.f87433g = hVar3;
            this.f87434h = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new e(this.f87429c, this.f87430d, this.f87431e, this.f87432f, this.f87433g, this.f87434h, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f87427a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            a aVar = a.this;
            m mVar = (m) this.f87429c.f312751a;
            coil.c cVar = this.f87430d.f312751a;
            coil.request.i iVar = this.f87431e;
            Object obj2 = this.f87432f;
            n nVar = this.f87433g.f312751a;
            coil.d dVar = this.f87434h;
            this.f87427a = 1;
            Object objI = aVar.i(mVar, cVar, iVar, obj2, nVar, dVar, this);
            return objI == objL ? objL : objI;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super b> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {169}, m = d0.f124428k, n = {"this", "components", "request", "mappedData", io.sentry.rrweb.h.f306695g, "eventListener", "fetcher", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f87437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f87441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f87442h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f87443i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f87445k;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87443i = obj;
            this.f87445k |= Integer.MIN_VALUE;
            return a.this.k(null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0}, l = {75}, m = "intercept", n = {"this", "chain"}, s = {"L$0", "L$1"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f87448c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87450e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87448c = obj;
            this.f87450e |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
    static final class h extends o implements Function2<s0, kotlin.coroutines.d<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87451a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ coil.request.i f87453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f87454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f87455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ coil.d f87456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ MemoryCache.Key f87457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ coil.intercept.b.a f87458h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(coil.request.i iVar, Object obj, n nVar, coil.d dVar, MemoryCache.Key key, coil.intercept.b.a aVar, kotlin.coroutines.d<? super h> dVar2) {
            super(2, dVar2);
            this.f87453c = iVar;
            this.f87454d = obj;
            this.f87455e = nVar;
            this.f87456f = dVar;
            this.f87457g = key;
            this.f87458h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new h(this.f87453c, this.f87454d, this.f87455e, this.f87456f, this.f87457g, this.f87458h, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            h hVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f87451a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a aVar = a.this;
                coil.request.i iVar = this.f87453c;
                Object obj2 = this.f87454d;
                n nVar = this.f87455e;
                coil.d dVar = this.f87456f;
                this.f87451a = 1;
                hVar = this;
                obj = aVar.j(iVar, obj2, nVar, dVar, hVar);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                hVar = this;
            }
            b bVar = (b) obj;
            a.this.f87396b.g();
            boolean zH = a.this.f87399e.h(hVar.f87457g, hVar.f87453c, bVar);
            Drawable drawableE = bVar.e();
            coil.request.i iVar2 = hVar.f87453c;
            coil.decode.e eVarC = bVar.c();
            MemoryCache.Key key = hVar.f87457g;
            if (!zH) {
                key = null;
            }
            return new r(drawableE, iVar2, eVarC, key, bVar.d(), bVar.f(), l.C(hVar.f87458h));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super r> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", i = {0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.P1}, m = "invokeSuspend", n = {"$this$withContext", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$transform$3\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 5 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,306:1\n32#2,3:307\n36#2:311\n1#3:310\n50#4:312\n28#5:313\n*S KotlinDebug\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$transform$3\n*L\n245#1:307,3\n245#1:311\n249#1:312\n249#1:313\n*E\n"})
    static final class i extends o implements Function2<s0, kotlin.coroutines.d<? super b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f87461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f87462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f87464f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f87466h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ n f87467i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<q4.e> f87468j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ coil.d f87469k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ coil.request.i f87470l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(b bVar, n nVar, List<? extends q4.e> list, coil.d dVar, coil.request.i iVar, kotlin.coroutines.d<? super i> dVar2) {
            super(2, dVar2);
            this.f87466h = bVar;
            this.f87467i = nVar;
            this.f87468j = list;
            this.f87469k = dVar;
            this.f87470l = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = a.this.new i(this.f87466h, this.f87467i, this.f87468j, this.f87469k, this.f87470l, dVar);
            iVar.f87464f = obj;
            return iVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x006e  */
        /* JADX WARN: Code duplicated, block: B:13:0x008e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x008c -> B:14:0x008f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f87463e
                r10 = 3
                r2 = 1
                if (r1 == 0) goto L30
                r10 = 5
                if (r1 != r2) goto L24
                r10 = 4
                int r1 = r11.f87462d
                int r3 = r11.f87461c
                r10 = 1
                java.lang.Object r4 = r11.f87460b
                coil.request.n r4 = (coil.request.n) r4
                java.lang.Object r5 = r11.f87459a
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r11.f87464f
                r10 = 7
                kotlinx.coroutines.s0 r6 = (kotlinx.coroutines.s0) r6
                kotlin.ResultKt.m(r12)
                goto L8f
            L24:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r10 = 3
                java.lang.String r12 = "tvs o nt cach/o/el obe ui/s /ou/r/ftewii/romrne/kee"
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r10 = 3
                r11.<init>(r12)
                throw r11
            L30:
                r10 = 2
                kotlin.ResultKt.m(r12)
                java.lang.Object r12 = r11.f87464f
                r10 = 5
                kotlinx.coroutines.s0 r12 = (kotlinx.coroutines.s0) r12
                r10 = 2
                coil.intercept.a r1 = coil.intercept.a.this
                coil.intercept.a$b r3 = r11.f87466h
                android.graphics.drawable.Drawable r3 = r3.e()
                r10 = 5
                coil.request.n r4 = r11.f87467i
                java.util.List<q4.e> r5 = r11.f87468j
                android.graphics.Bitmap r1 = coil.intercept.a.b(r1, r3, r4, r5)
                coil.d r3 = r11.f87469k
                coil.request.i r4 = r11.f87470l
                r3.v(r4, r1)
                r10 = 3
                java.util.List<q4.e> r3 = r11.f87468j
                r10 = 0
                coil.request.n r4 = r11.f87467i
                r5 = r3
                r10 = 2
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r10 = 2
                r6 = 0
                r9 = r6
                r9 = r6
                r6 = r12
                r12 = r1
                r12 = r1
                r1 = r5
                r1 = r5
                r5 = r3
                r10 = 1
                r3 = r9
            L6c:
                if (r3 >= r1) goto L98
                java.lang.Object r7 = r5.get(r3)
                r10 = 2
                q4.e r7 = (q4.e) r7
                coil.size.i r8 = r4.p()
                r10 = 1
                r11.f87464f = r6
                r11.f87459a = r5
                r10 = 1
                r11.f87460b = r4
                r11.f87461c = r3
                r11.f87462d = r1
                r11.f87463e = r2
                java.lang.Object r12 = r7.transform(r12, r8, r11)
                r10 = 7
                if (r12 != r0) goto L8f
                return r0
            L8f:
                android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
                kotlinx.coroutines.t0.j(r6)
                r10 = 1
                int r3 = r3 + r2
                r10 = 6
                goto L6c
            L98:
                r10 = 4
                coil.d r0 = r11.f87469k
                coil.request.i r1 = r11.f87470l
                r0.E(r1, r12)
                r10 = 2
                coil.intercept.a$b r2 = r11.f87466h
                coil.request.i r11 = r11.f87470l
                r10 = 0
                android.content.Context r11 = r11.l()
                r10 = 1
                android.content.res.Resources r11 = r11.getResources()
                android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
                r3.<init>(r11, r12)
                r7 = 14
                r10 = 0
                r8 = 0
                r4 = 0
                r10 = 2
                r5 = 0
                r6 = 0
                r10 = 4
                coil.intercept.a$b r11 = coil.intercept.a.b.b(r2, r3, r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: coil.intercept.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super b> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a(@NotNull j jVar, @NotNull b0 b0Var, @NotNull q qVar, @Nullable z zVar) {
        this.f87395a = jVar;
        this.f87396b = b0Var;
        this.f87397c = qVar;
        this.f87398d = zVar;
        this.f87399e = new coil.memory.c(jVar, qVar, zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap h(Drawable drawable, n nVar, List<? extends q4.e> list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config configD = coil.util.a.d(bitmap);
            if (ArraysKt.contains(l.w(), configD)) {
                return bitmap;
            }
            z zVar = this.f87398d;
            if (zVar != null && zVar.g() <= 4) {
                zVar.h(f87394g, 4, "Converting bitmap with config " + configD + " to apply transformations: " + list + '.', null);
            }
        } else {
            z zVar2 = this.f87398d;
            if (zVar2 != null && zVar2.g() <= 4) {
                zVar2.h(f87394g, 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + list + '.', null);
            }
        }
        return s.f87858a.a(drawable, nVar.f(), nVar.p(), nVar.o(), nVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b4 -> B:21:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(coil.fetch.m r8, coil.c r9, coil.request.i r10, java.lang.Object r11, coil.request.n r12, coil.d r13, kotlin.coroutines.d<? super coil.intercept.a.b> r14) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.a.i(coil.fetch.m, coil.c, coil.request.i, java.lang.Object, coil.request.n, coil.d, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x020a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e1, code lost:
    
        if (r1 == r7) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, coil.c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, coil.c] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, coil.request.n] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(coil.request.i r24, java.lang.Object r25, coil.request.n r26, coil.d r27, kotlin.coroutines.d<? super coil.intercept.a.b> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.a.j(coil.request.i, java.lang.Object, coil.request.n, coil.d, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x007c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x00af  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00af -> B:22:0x00b9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(coil.c r8, coil.request.i r9, java.lang.Object r10, coil.request.n r11, coil.d r12, kotlin.coroutines.d<? super coil.fetch.g> r13) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.a.k(coil.c, coil.request.i, java.lang.Object, coil.request.n, coil.d, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil.intercept.b
    @Nullable
    public Object a(@NotNull coil.intercept.b.a aVar, @NotNull kotlin.coroutines.d<? super coil.request.j> dVar) throws Throwable {
        g gVar;
        Throwable th2;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f87450e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f87450e = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f87448c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f87450e;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            try {
                coil.request.i request = aVar.getRequest();
                Object objM = request.m();
                coil.size.i size = aVar.getSize();
                coil.d dVarM = l.m(aVar);
                n nVarF = this.f87397c.f(request, size);
                coil.size.h hVarO = nVarF.o();
                dVarM.t(request, objM);
                Object objG = this.f87395a.getComponents().g(objM, nVarF);
                dVarM.e(request, objG);
                MemoryCache.Key keyF = this.f87399e.f(request, objG, nVarF, dVarM);
                MemoryCache.b bVarA = keyF != null ? this.f87399e.a(request, keyF, size, hVarO) : null;
                if (bVarA != null) {
                    return this.f87399e.g(aVar, request, keyF, bVarA);
                }
                n0 n0VarV = request.v();
                try {
                    h hVar = new h(request, objG, nVarF, dVarM, keyF, aVar, null);
                    gVar.f87446a = this;
                    gVar.f87447b = aVar;
                    gVar.f87450e = 1;
                    Object objH = kotlinx.coroutines.i.h(n0VarV, hVar, gVar);
                    return objH == objL ? objL : objH;
                } catch (Throwable th3) {
                    th2 = th3;
                    this = this;
                    aVar = aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
            if (th2 instanceof CancellationException) {
                throw th2;
            }
            return this.f87397c.a(aVar.getRequest(), th2);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @l1
    @Nullable
    public final Object l(@NotNull b bVar, @NotNull coil.request.i iVar, @NotNull n nVar, @NotNull coil.d dVar, @NotNull kotlin.coroutines.d<? super b> dVar2) {
        List<q4.e> listO = iVar.O();
        if (listO.isEmpty()) {
            return bVar;
        }
        if ((bVar.e() instanceof BitmapDrawable) || iVar.g()) {
            return kotlinx.coroutines.i.h(iVar.N(), new i(bVar, nVar, listO, dVar, iVar, null), dVar2);
        }
        z zVar = this.f87398d;
        if (zVar != null && zVar.g() <= 4) {
            zVar.h(f87394g, 4, "allowConversionToBitmap=false, skipping transformations for type " + bVar.e().getClass().getCanonicalName() + '.', null);
        }
        return bVar;
    }
}

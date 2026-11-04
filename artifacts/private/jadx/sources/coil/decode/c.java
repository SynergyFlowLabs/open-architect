package coil.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import kotlin.ResultKt;
import kotlin.e1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.m2;
import okio.b1;
import okio.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBitmapFactoryDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 5 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 6 Utils.kt\ncoil/util/-Utils\n*L\n1#1,227:1\n78#2,9:228\n1#3:237\n50#4:238\n28#5:239\n219#6:240\n223#6:241\n*S KotlinDebug\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n*L\n45#1:228,9\n92#1:238\n92#1:239\n144#1:240\n145#1:241\n*E\n"})
public final class c implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f87127e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f87128f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f87129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final coil.request.n f87130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.h f87131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k f87132d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends okio.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Exception f87133a;

        public b(@NotNull b1 b1Var) {
            super(b1Var);
        }

        @Nullable
        public final Exception a() {
            return this.f87133a;
        }

        @Override // okio.y, okio.b1
        public long read(@NotNull okio.l lVar, long j10) throws Exception {
            try {
                return super.read(lVar, j10);
            } catch (Exception e10) {
                this.f87133a = e10;
                throw e10;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", i = {0, 0, 1}, l = {231, 46}, m = "decode", n = {"this", "$this$withPermit$iv", "$this$withPermit$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f87138c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87140e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87138c = obj;
            this.f87140e |= Integer.MIN_VALUE;
            return c.this.decode(this);
        }
    }

    public c(@NotNull v vVar, @NotNull coil.request.n nVar, @NotNull kotlinx.coroutines.sync.h hVar, @NotNull k kVar) {
        this.f87129a = vVar;
        this.f87130b = nVar;
        this.f87131c = hVar;
        this.f87132d = kVar;
    }

    private final void b(BitmapFactory.Options options, i iVar) {
        Bitmap.Config configF = this.f87130b.f();
        if (iVar.b() || m.a(iVar)) {
            configF = coil.util.a.h(configF);
        }
        if (this.f87130b.d() && configF == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            configF = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && configF != Bitmap.Config.HARDWARE) {
            configF = config2;
        }
        options.inPreferredConfig = configF;
    }

    private final void c(BitmapFactory.Options options, i iVar) {
        v.a aVarD = this.f87129a.d();
        if ((aVarD instanceof b0) && coil.size.b.f(this.f87130b.p())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((b0) aVarD).a();
            options.inTargetDensity = this.f87130b.g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = m.b(iVar) ? options.outHeight : options.outWidth;
        int i11 = m.b(iVar) ? options.outWidth : options.outHeight;
        coil.size.i iVarP = this.f87130b.p();
        int iJ = coil.size.b.f(iVarP) ? i10 : coil.util.l.J(iVarP.f(), this.f87130b.o());
        coil.size.i iVarP2 = this.f87130b.p();
        int iJ2 = coil.size.b.f(iVarP2) ? i11 : coil.util.l.J(iVarP2.e(), this.f87130b.o());
        int iA = g.a(i10, i11, iJ, iJ2, this.f87130b.o());
        options.inSampleSize = iA;
        double dB = g.b(((double) i10) / ((double) iA), ((double) i11) / ((double) iA), iJ, iJ2, this.f87130b.o());
        if (this.f87130b.c()) {
            dB = kotlin.ranges.r.z(dB, 1.0d);
        }
        boolean z10 = dB == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (dB > 1.0d) {
            options.inDensity = kotlin.math.b.K0(((double) Integer.MAX_VALUE) / dB);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = kotlin.math.b.K0(((double) Integer.MAX_VALUE) * dB);
        }
    }

    private final f d(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.f87129a.f());
        okio.n nVarE = l0.e(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(nVarE.peek().rf(), null, options);
        Exception excA = bVar.a();
        if (excA != null) {
            throw excA;
        }
        options.inJustDecodeBounds = false;
        l lVar = l.f87174a;
        i iVarA = lVar.a(options.outMimeType, nVarE, this.f87132d);
        Exception excA2 = bVar.a();
        if (excA2 != null) {
            throw excA2;
        }
        options.inMutable = false;
        if (this.f87130b.e() != null) {
            options.inPreferredColorSpace = this.f87130b.e();
        }
        options.inPremultiplied = this.f87130b.n();
        b(options, iVarA);
        c(options, iVarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(nVarE.rf(), null, options);
            kotlin.io.c.a(nVarE, null);
            Exception excA3 = bVar.a();
            if (excA3 != null) {
                throw excA3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.f87130b.g().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f87130b.g().getResources(), lVar.b(bitmapDecodeStream, iVarA));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new f(bitmapDrawable, z10);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(nVarE, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f e(c cVar) {
        return cVar.d(new BitmapFactory.Options());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // coil.decode.h
    @Nullable
    public Object decode(@NotNull kotlin.coroutines.d<? super f> dVar) throws Throwable {
        d dVar2;
        kotlinx.coroutines.sync.h hVar;
        Throwable th2;
        kotlinx.coroutines.sync.h hVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f87140e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f87140e = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f87138c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f87140e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                hVar = this.f87131c;
                dVar2.f87136a = this;
                dVar2.f87137b = hVar;
                dVar2.f87140e = 1;
                if (hVar.g(dVar2) == objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar2 = (kotlinx.coroutines.sync.h) dVar2.f87136a;
                try {
                    ResultKt.m(obj);
                    f fVar = (f) obj;
                    hVar2.release();
                    return fVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    hVar2.release();
                    throw th2;
                }
            }
            kotlinx.coroutines.sync.h hVar3 = (kotlinx.coroutines.sync.h) dVar2.f87137b;
            c cVar = (c) dVar2.f87136a;
            ResultKt.m(obj);
            hVar = hVar3;
            this = cVar;
            Function0 function0 = new Function0() { // from class: coil.decode.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.e(this.f87123a);
                }
            };
            dVar2.f87136a = hVar;
            dVar2.f87137b = null;
            dVar2.f87140e = 2;
            Object objC = m2.c(null, function0, dVar2, 1, null);
            if (objC != objL) {
                kotlinx.coroutines.sync.h hVar4 = hVar;
                obj = objC;
                hVar2 = hVar4;
                f fVar2 = (f) obj;
                hVar2.release();
                return fVar2;
            }
            return objL;
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.h hVar5 = hVar;
            th2 = th4;
            hVar2 = hVar5;
            hVar2.release();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: coil.decode.c$c, reason: collision with other inner class name */
    public static final class C0814c implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k f87134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.sync.h f87135b;

        public C0814c(int i10, @NotNull k kVar) {
            this.f87134a = kVar;
            this.f87135b = kotlinx.coroutines.sync.l.b(i10, 0, 2, null);
        }

        @Override // coil.decode.h.a
        @NotNull
        public h create(@NotNull coil.fetch.m mVar, @NotNull coil.request.n nVar, @NotNull coil.j jVar) {
            return new c(mVar.e(), nVar, this.f87135b, this.f87134a);
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof C0814c;
        }

        public int hashCode() {
            return C0814c.class.hashCode();
        }

        public /* synthetic */ C0814c(int i10, k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4 : i10, (i11 & 2) != 0 ? k.RESPECT_PERFORMANCE : kVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @e1(version = "999.9")
        public C0814c() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ C0814c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4 : i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.l(level = kotlin.n.HIDDEN, message = "Kept for binary compatibility.")
        public /* synthetic */ C0814c(int i10) {
            this(i10, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ c(v vVar, coil.request.n nVar, kotlinx.coroutines.sync.h hVar, k kVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, nVar, (i10 & 4) != 0 ? kotlinx.coroutines.sync.l.b(Integer.MAX_VALUE, 0, 2, null) : hVar, (i10 & 8) != 0 ? k.RESPECT_PERFORMANCE : kVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ c(v vVar, coil.request.n nVar) {
        this(vVar, nVar, null, null, 12, null);
    }

    public /* synthetic */ c(v vVar, coil.request.n nVar, kotlinx.coroutines.sync.h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, nVar, (i10 & 4) != 0 ? kotlinx.coroutines.sync.l.b(Integer.MAX_VALUE, 0, 2, null) : hVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ c(v vVar, coil.request.n nVar, kotlinx.coroutines.sync.h hVar) {
        this(vVar, nVar, hVar, null, 8, null);
    }
}

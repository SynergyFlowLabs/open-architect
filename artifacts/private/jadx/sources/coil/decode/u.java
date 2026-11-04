package coil.decode;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import androidx.annotation.w0;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.m2;
import kotlinx.coroutines.s0;
import okio.l0;
import okio.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(28)
@SourceDebugExtension({"SMAP\nImageDecoderDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoderDecoder.kt\ncoil/decode/ImageDecoderDecoder\n+ 2 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt\n*L\n1#1,187:1\n52#2:188\n*S KotlinDebug\n*F\n+ 1 ImageDecoderDecoder.kt\ncoil/decode/ImageDecoderDecoder\n*L\n54#1:188\n*E\n"})
public final class u implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f87212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final coil.request.n f87213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87214c;

    public static final class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f87215a;

        @oj.j
        public a() {
            this(false, 1, null);
        }

        private final boolean a(okio.n nVar) {
            g gVar = g.f87161a;
            if (p.c(gVar, nVar) || p.b(gVar, nVar)) {
                return true;
            }
            return Build.VERSION.SDK_INT >= 30 && p.a(gVar, nVar);
        }

        @Override // coil.decode.h.a
        @Nullable
        public h create(@NotNull coil.fetch.m mVar, @NotNull coil.request.n nVar, @NotNull coil.j jVar) {
            if (a(mVar.e().f())) {
                return new u(mVar.e(), nVar, this.f87215a);
            }
            return null;
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }

        @oj.j
        public a(boolean z10) {
            this.f87215a = z10;
        }

        public /* synthetic */ a(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0, 1}, l = {50, 90}, m = "decode", n = {"this", "isSampled", "isSampled"}, s = {"L$0", "L$1", "L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f87218c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87220e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87218c = obj;
            this.f87220e |= Integer.MIN_VALUE;
            return u.this.decode(this);
        }
    }

    @SourceDebugExtension({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeDrawable$1\n+ 2 ImageDecoderDecoder.kt\ncoil/decode/ImageDecoderDecoder\n+ 3 Size.kt\nandroidx/core/util/SizeKt\n+ 4 Utils.kt\ncoil/util/-GifUtils\n*L\n1#1,56:1\n56#2,4:57\n60#2:63\n61#2:65\n62#2,23:67\n37#3:61\n49#3:62\n59#4:64\n63#4:66\n*S KotlinDebug\n*F\n+ 1 ImageDecoderDecoder.kt\ncoil/decode/ImageDecoderDecoder\n*L\n59#1:61\n59#1:62\n60#1:64\n61#1:66\n*E\n"})
    public static final class c implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h f87221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f87222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.a f87223c;

        public c(i1.h hVar, u uVar, i1.a aVar) {
            this.f87221a = hVar;
            this.f87222b = uVar;
            this.f87223c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@NotNull ImageDecoder imageDecoder, @NotNull ImageDecoder.ImageInfo imageInfo, @NotNull ImageDecoder.Source source) {
            this.f87221a.f312751a = imageDecoder;
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            coil.size.i iVarP = this.f87222b.f87213b.p();
            int iJ = coil.size.b.f(iVarP) ? width : coil.util.g.j(iVarP.f(), this.f87222b.f87213b.o());
            coil.size.i iVarP2 = this.f87222b.f87213b.p();
            int iJ2 = coil.size.b.f(iVarP2) ? height : coil.util.g.j(iVarP2.e(), this.f87222b.f87213b.o());
            if (width > 0 && height > 0 && (width != iJ || height != iJ2)) {
                double dC = g.c(width, height, iJ, iJ2, this.f87222b.f87213b.o());
                i1.a aVar = this.f87223c;
                boolean z10 = dC < 1.0d;
                aVar.f312744a = z10;
                if (z10 || !this.f87222b.f87213b.c()) {
                    imageDecoder.setTargetSize(kotlin.math.b.K0(((double) width) * dC), kotlin.math.b.K0(dC * ((double) height)));
                }
            }
            this.f87222b.e(imageDecoder);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0}, l = {androidx.media2.widget.f.i.f59801t0}, m = "wrapDrawable", n = {"this", "baseDrawable"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f87226c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87228e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87226c = obj;
            this.f87228e |= Integer.MIN_VALUE;
            return u.this.h(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.decode.ImageDecoderDecoder$wrapDrawable$2", f = "ImageDecoderDecoder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f87230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f87231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f87232d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Drawable drawable, Function0<Unit> function0, Function0<Unit> function1, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f87230b = drawable;
            this.f87231c = function0;
            this.f87232d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f87230b, this.f87231c, this.f87232d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f87229a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((AnimatedImageDrawable) this.f87230b).registerAnimationCallback(coil.util.g.b(this.f87231c, this.f87232d));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @oj.j
    public u(@NotNull v vVar, @NotNull coil.request.n nVar) {
        this(vVar, nVar, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(coil.util.g.i(this.f87213b.f()) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!this.f87213b.d() ? 1 : 0);
        if (this.f87213b.e() != null) {
            imageDecoder.setTargetColorSpace(this.f87213b.e());
        }
        imageDecoder.setUnpremultipliedRequired(!this.f87213b.n());
        q4.a aVarB = coil.request.g.b(this.f87213b.m());
        imageDecoder.setPostProcessor(aVarB != null ? coil.util.g.d(aVarB) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Drawable f(u uVar, i1.a aVar) throws IOException {
        i1.h hVar = new i1.h();
        v vVarI = uVar.i(uVar.f87212a);
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(uVar.g(vVarI), new c(hVar, uVar, aVar));
            ImageDecoder imageDecoder = (ImageDecoder) hVar.f312751a;
            if (imageDecoder != null) {
                imageDecoder.close();
            }
            vVarI.close();
            return drawableDecodeDrawable;
        } catch (Throwable th2) {
            ImageDecoder imageDecoder2 = (ImageDecoder) hVar.f312751a;
            if (imageDecoder2 != null) {
                imageDecoder2.close();
            }
            vVarI.close();
            throw th2;
        }
    }

    private final ImageDecoder.Source g(v vVar) {
        r0 r0VarB = vVar.b();
        if (r0VarB != null) {
            return ImageDecoder.createSource(r0VarB.toFile());
        }
        v.a aVarD = vVar.d();
        if (aVarD instanceof coil.decode.a) {
            return ImageDecoder.createSource(this.f87213b.g().getAssets(), ((coil.decode.a) aVarD).c());
        }
        if (aVarD instanceof coil.decode.d) {
            return ImageDecoder.createSource(this.f87213b.g().getContentResolver(), ((coil.decode.d) aVarD).a());
        }
        if (aVarD instanceof b0) {
            b0 b0Var = (b0) aVarD;
            if (Intrinsics.areEqual(b0Var.b(), this.f87213b.g().getPackageName())) {
                return ImageDecoder.createSource(this.f87213b.g().getResources(), b0Var.c());
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return ImageDecoder.createSource(vVar.f().Y5());
        }
        return i10 == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(vVar.f().Y5())) : ImageDecoder.createSource(vVar.a().toFile());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object h(Drawable drawable, kotlin.coroutines.d<? super Drawable> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f87228e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f87228e = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f87226c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f87228e;
        boolean z10 = !false;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
            Integer numH = coil.request.g.h(this.f87213b.m());
            animatedImageDrawable.setRepeatCount(numH != null ? numH.intValue() : -1);
            Function0<Unit> function0D = coil.request.g.d(this.f87213b.m());
            Function0<Unit> function0C = coil.request.g.c(this.f87213b.m());
            if (function0D != null || function0C != null) {
                a3 a3VarR0 = l1.e().R0();
                e eVar = new e(drawable, function0D, function0C, null);
                dVar2.f87224a = this;
                dVar2.f87225b = drawable;
                dVar2.f87228e = 1;
                if (kotlinx.coroutines.i.h(a3VarR0, eVar, dVar2) == objL) {
                    return objL;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drawable = (Drawable) dVar2.f87225b;
            this = (u) dVar2.f87224a;
            ResultKt.m(obj);
        }
        return new coil.drawable.c(drawable, this.f87213b.o());
    }

    private final v i(v vVar) {
        return (this.f87214c && p.c(g.f87161a, vVar.f())) ? a0.i(l0.e(new o(vVar.f())), this.f87213b.g()) : vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // coil.decode.h
    @Nullable
    public Object decode(@NotNull kotlin.coroutines.d<? super f> dVar) {
        b bVar;
        final i1.a aVar;
        Object objC;
        i1.a aVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f87220e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f87220e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f87218c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f87220e;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = new i1.a();
            Function0 function0 = new Function0() { // from class: coil.decode.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u.f(this.f87210a, aVar);
                }
            };
            bVar.f87216a = this;
            bVar.f87217b = aVar;
            bVar.f87220e = 1;
            objC = m2.c(null, function0, bVar, 1, null);
            if (objC != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            i1.a aVar3 = (i1.a) bVar.f87217b;
            u uVar = (u) bVar.f87216a;
            ResultKt.m(obj);
            aVar = aVar3;
            this = uVar;
            objC = obj;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (i1.a) bVar.f87216a;
            ResultKt.m(obj);
        }
        return new f((Drawable) obj, aVar2.f312744a);
        bVar.f87216a = aVar;
        bVar.f87217b = null;
        bVar.f87220e = 2;
        Object objH = this.h((Drawable) objC, bVar);
        if (objH != objL) {
            i1.a aVar4 = aVar;
            obj = objH;
            aVar2 = aVar4;
            return new f((Drawable) obj, aVar2.f312744a);
        }
        return objL;
    }

    @oj.j
    public u(@NotNull v vVar, @NotNull coil.request.n nVar, boolean z10) {
        this.f87212a = vVar;
        this.f87213b = nVar;
        this.f87214c = z10;
    }

    public /* synthetic */ u(v vVar, coil.request.n nVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, nVar, (i10 & 4) != 0 ? true : z10);
    }
}

package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Movie;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.m2;
import okio.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nGifDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifDecoder.kt\ncoil/decode/GifDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public final class r implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f87201d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f87202e = "coil#repeat_count";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f87203f = "coil#animated_transformation";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f87204g = "coil#animation_start_callback";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f87205h = "coil#animation_end_callback";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f87206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final coil.request.n f87207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87208c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f87209a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public b() {
            this(false, 1, null);
            boolean z10 = false;
        }

        @Override // coil.decode.h.a
        @Nullable
        public h create(@NotNull coil.fetch.m mVar, @NotNull coil.request.n nVar, @NotNull coil.j jVar) {
            if (p.c(g.f87161a, mVar.e().f())) {
                return new r(mVar.e(), nVar, this.f87209a);
            }
            return null;
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return b.class.hashCode();
        }

        @oj.j
        public b(boolean z10) {
            this.f87209a = z10;
        }

        public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @oj.j
    public r(@NotNull v vVar, @NotNull coil.request.n nVar) {
        this(vVar, nVar, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f b(r rVar) throws IOException {
        Bitmap.Config configF;
        okio.n nVarE = rVar.f87208c ? l0.e(new o(rVar.f87206a.f())) : rVar.f87206a.f();
        try {
            Movie movieDecodeStream = Movie.decodeStream(nVarE.rf());
            kotlin.io.c.a(nVarE, null);
            if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                throw new IllegalStateException("Failed to decode GIF.");
            }
            if (movieDecodeStream.isOpaque() && rVar.f87207b.d()) {
                configF = Bitmap.Config.RGB_565;
            } else {
                configF = coil.util.g.i(rVar.f87207b.f()) ? Bitmap.Config.ARGB_8888 : rVar.f87207b.f();
            }
            coil.drawable.b bVar = new coil.drawable.b(movieDecodeStream, configF, rVar.f87207b.o());
            Integer numH = coil.request.g.h(rVar.f87207b.m());
            bVar.j(numH != null ? numH.intValue() : -1);
            Function0<Unit> function0D = coil.request.g.d(rVar.f87207b.m());
            Function0<Unit> function0C = coil.request.g.c(rVar.f87207b.m());
            if (function0D != null || function0C != null) {
                bVar.c(coil.util.g.c(function0D, function0C));
            }
            bVar.i(coil.request.g.b(rVar.f87207b.m()));
            return new f(bVar, false);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(nVarE, th2);
                throw th3;
            }
        }
    }

    @Override // coil.decode.h
    @Nullable
    public Object decode(@NotNull kotlin.coroutines.d<? super f> dVar) {
        return m2.c(null, new Function0() { // from class: coil.decode.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.b(this.f87200a);
            }
        }, dVar, 1, null);
    }

    @oj.j
    public r(@NotNull v vVar, @NotNull coil.request.n nVar, boolean z10) {
        this.f87206a = vVar;
        this.f87207b = nVar;
        this.f87208c = z10;
    }

    public /* synthetic */ r(v vVar, coil.request.n nVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, nVar, (i10 & 4) != 0 ? true : z10);
    }
}

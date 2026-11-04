package coil.decode;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nVideoFrameDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoFrameDecoder.kt\ncoil/decode/VideoFrameDecoder\n+ 2 Utils.kt\ncoil/util/-VideoUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 5 Dimension.kt\ncoil/size/-Dimensions\n+ 6 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,231:1\n18#2,2:232\n56#2:234\n60#2:235\n22#2,4:238\n1#3:236\n28#4:237\n57#5:242\n57#5:243\n57#5:248\n57#5:249\n95#6:244\n43#6,3:245\n*S KotlinDebug\n*F\n+ 1 VideoFrameDecoder.kt\ncoil/decode/VideoFrameDecoder\n*L\n41#1:232,2\n60#1:234\n61#1:235\n41#1:238,4\n114#1:237\n145#1:242\n146#1:243\n178#1:248\n179#1:249\n157#1:244\n158#1:245,3\n*E\n"})
public final class d0 implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f87147c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f87148d = "coil#video_frame_micros";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f87149e = "coil#video_frame_percent";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f87150f = "coil#video_frame_option";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f87151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final coil.request.n f87152b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements h.a {
        private final boolean a(String str) {
            return str != null && StringsKt.u2(str, "video/", false, 2, null);
        }

        @Override // coil.decode.h.a
        @Nullable
        public h create(@NotNull coil.fetch.m mVar, @NotNull coil.request.n nVar, @NotNull coil.j jVar) {
            if (a(mVar.d())) {
                return new d0(mVar.e(), nVar);
            }
            return null;
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return b.class.hashCode();
        }
    }

    public d0(@NotNull v vVar, @NotNull coil.request.n nVar) {
        this.f87151a = vVar;
        this.f87152b = nVar;
    }

    private final long a(MediaMetadataRetriever mediaMetadataRetriever) {
        Long lC1;
        Long lB = coil.request.t.b(this.f87152b.m());
        if (lB != null) {
            return lB.longValue();
        }
        Double dG = coil.request.t.g(this.f87152b.m());
        long jLongValue = 0;
        if (dG == null) {
            return 0L;
        }
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (strExtractMetadata != null && (lC1 = StringsKt.c1(strExtractMetadata)) != null) {
            jLongValue = lC1.longValue();
        }
        return ((long) 1000) * kotlin.math.b.M0(dG.doubleValue() * jLongValue);
    }

    private final boolean b(Bitmap bitmap, coil.request.n nVar) {
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        return config != config2 || nVar.f() == config2;
    }

    private final boolean c(Bitmap bitmap, coil.request.n nVar, coil.size.i iVar) {
        if (nVar.c()) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        coil.size.c cVarF = iVar.f();
        int width2 = cVarF instanceof coil.size.c.a ? ((coil.size.c.a) cVarF).f87767a : bitmap.getWidth();
        coil.size.c cVarE = iVar.e();
        return g.c(width, height, width2, cVarE instanceof coil.size.c.a ? ((coil.size.c.a) cVarE).f87767a : bitmap.getHeight(), nVar.o()) == 1.0d;
    }

    private final Bitmap d(Bitmap bitmap, coil.size.i iVar) {
        if (b(bitmap, this.f87152b) && c(bitmap, this.f87152b, iVar)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        coil.size.c cVarF = iVar.f();
        int width2 = cVarF instanceof coil.size.c.a ? ((coil.size.c.a) cVarF).f87767a : bitmap.getWidth();
        coil.size.c cVarE = iVar.e();
        float fC = (float) g.c(width, height, width2, cVarE instanceof coil.size.c.a ? ((coil.size.c.a) cVarE).f87767a : bitmap.getHeight(), this.f87152b.o());
        int iL0 = kotlin.math.b.L0(bitmap.getWidth() * fC);
        int iL1 = kotlin.math.b.L0(bitmap.getHeight() * fC);
        Bitmap.Config configF = this.f87152b.f() == Bitmap.Config.HARDWARE ? Bitmap.Config.ARGB_8888 : this.f87152b.f();
        Paint paint = new Paint(3);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iL0, iL1, configF);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(fC, fC);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    private final void e(MediaMetadataRetriever mediaMetadataRetriever, v vVar) throws IOException {
        if (vVar.d() instanceof coil.fetch.k.c) {
            v.a aVarD = vVar.d();
            Intrinsics.checkNotNull(aVarD, "null cannot be cast to non-null type coil.fetch.MediaDataSourceFetcher.MediaSourceMetadata");
            mediaMetadataRetriever.setDataSource(((coil.fetch.k.c) aVarD).a());
            return;
        }
        v.a aVarD2 = vVar.d();
        if (aVarD2 instanceof coil.decode.a) {
            AssetFileDescriptor assetFileDescriptorOpenFd = this.f87152b.g().getAssets().openFd(((coil.decode.a) aVarD2).c());
            try {
                mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(assetFileDescriptorOpenFd, null);
                return;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(assetFileDescriptorOpenFd, th2);
                    throw th3;
                }
            }
        }
        if (aVarD2 instanceof d) {
            mediaMetadataRetriever.setDataSource(this.f87152b.g(), ((d) aVarD2).a());
            return;
        }
        if (!(aVarD2 instanceof b0)) {
            mediaMetadataRetriever.setDataSource(vVar.a().toFile().getPath());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android.resource://");
        b0 b0Var = (b0) aVarD2;
        sb2.append(b0Var.b());
        sb2.append('/');
        sb2.append(b0Var.c());
        mediaMetadataRetriever.setDataSource(sb2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[PHI: r15
      0x0076: PHI (r15v17 int) = (r15v14 int), (r15v14 int), (r15v29 int), (r15v29 int) binds: [B:40:0x0094, B:42:0x009a, B:27:0x0066, B:29:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // coil.decode.h
    @Nullable
    public Object decode(@NotNull kotlin.coroutines.d<? super f> dVar) throws IOException {
        int iIntValue;
        Integer intOrNull;
        int iIntValue2;
        Integer intOrNull2;
        coil.size.i iVarA;
        Bitmap bitmapA;
        Integer intOrNull3;
        Integer intOrNull4;
        Integer intOrNull5;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            e(mediaMetadataRetriever, this.f87151a);
            Integer numE = coil.request.t.e(this.f87152b.m());
            int iIntValue3 = numE != null ? numE.intValue() : 2;
            long jA = a(mediaMetadataRetriever);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
            int iIntValue4 = (strExtractMetadata == null || (intOrNull5 = StringsKt.toIntOrNull(strExtractMetadata)) == null) ? 0 : intOrNull5.intValue();
            if (iIntValue4 == 90 || iIntValue4 == 270) {
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                iIntValue = (strExtractMetadata2 == null || (intOrNull2 = StringsKt.toIntOrNull(strExtractMetadata2)) == null) ? 0 : intOrNull2.intValue();
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
                if (strExtractMetadata3 == null || (intOrNull = StringsKt.toIntOrNull(strExtractMetadata3)) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = intOrNull.intValue();
                }
            } else {
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
                iIntValue = (strExtractMetadata4 == null || (intOrNull4 = StringsKt.toIntOrNull(strExtractMetadata4)) == null) ? 0 : intOrNull4.intValue();
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
                if (strExtractMetadata5 == null || (intOrNull3 = StringsKt.toIntOrNull(strExtractMetadata5)) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = intOrNull3.intValue();
                }
            }
            int height = iIntValue2;
            if (iIntValue <= 0 || height <= 0) {
                iVarA = coil.size.i.f87783d;
            } else {
                coil.size.i iVarP = this.f87152b.p();
                int iD = coil.size.b.f(iVarP) ? iIntValue : coil.util.o.d(iVarP.f(), this.f87152b.o());
                coil.size.i iVarP2 = this.f87152b.p();
                double dC = g.c(iIntValue, height, iD, coil.size.b.f(iVarP2) ? height : coil.util.o.d(iVarP2.e(), this.f87152b.o()), this.f87152b.o());
                if (this.f87152b.c()) {
                    dC = kotlin.ranges.r.z(dC, 1.0d);
                }
                iVarA = coil.size.b.a(kotlin.math.b.K0(((double) iIntValue) * dC), kotlin.math.b.K0(dC * ((double) height)));
            }
            coil.size.i iVar = iVarA;
            coil.size.c cVarA = iVar.a();
            coil.size.c cVarB = iVar.b();
            if ((cVarA instanceof coil.size.c.a) && (cVarB instanceof coil.size.c.a)) {
                bitmapA = coil.util.o.b(mediaMetadataRetriever, jA, iIntValue3, ((coil.size.c.a) cVarA).f87767a, ((coil.size.c.a) cVarB).f87767a, this.f87152b.f());
            } else {
                bitmapA = coil.util.o.a(mediaMetadataRetriever, jA, iIntValue3, this.f87152b.f());
                if (bitmapA != null) {
                    iIntValue = bitmapA.getWidth();
                    height = bitmapA.getHeight();
                } else {
                    bitmapA = null;
                }
            }
            if (bitmapA != null) {
                Bitmap bitmapD = d(bitmapA, iVar);
                f fVar = new f(new BitmapDrawable(this.f87152b.g().getResources(), bitmapD), iIntValue <= 0 || height <= 0 || g.c(iIntValue, height, bitmapD.getWidth(), bitmapD.getHeight(), this.f87152b.o()) < 1.0d);
                mediaMetadataRetriever.close();
                return fVar;
            }
            throw new IllegalStateException(("Failed to decode frame at " + jA + " microseconds.").toString());
        } catch (Throwable th2) {
            mediaMetadataRetriever.close();
            throw th2;
        }
    }
}

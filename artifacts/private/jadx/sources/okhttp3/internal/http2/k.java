package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import okio.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f334475a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final int[] f334476b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, com.planner5d.library.engine.input.f.b.R1, 2042, 1018, 1019, com.planner5d.library.engine.input.f.b.S1, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, com.planner5d.library.engine.input.f.b.U1, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, com.planner5d.library.engine.input.f.b.f160733u1, 104, 105, com.planner5d.library.engine.input.f.b.f160742x1, com.planner5d.library.engine.input.f.b.f160745y1, 108, 109, 110, com.rabbitmq.client.impl.k.b.p.f265340a, com.planner5d.library.engine.input.f.b.B, 113, 114, com.planner5d.library.engine.input.f.b.V1, 115, com.planner5d.library.engine.input.f.b.W1, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, androidx.media3.extractor.metadata.dvbsi.b.f67479d, me.relex.circleindicator.a.f332619e, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final byte[] f334477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final a f334478d;

    static {
        byte[] bArr = {com.google.common.base.c.f116462o, com.google.common.base.c.A, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.B, com.google.common.base.c.H, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.H, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.H, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, 6, 10, 10, com.google.common.base.c.f116461n, com.google.common.base.c.f116462o, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, com.google.common.base.c.f116464q, 6, com.google.common.base.c.f116461n, 10, com.google.common.base.c.f116462o, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, com.google.common.base.c.f116462o, 19, com.google.common.base.c.f116462o, com.google.common.base.c.f116463p, 6, com.google.common.base.c.f116464q, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, com.google.common.base.c.f116464q, 11, com.google.common.base.c.f116463p, com.google.common.base.c.f116462o, com.google.common.base.c.F, com.google.common.base.c.f116471x, com.google.common.base.c.f116473z, com.google.common.base.c.f116471x, com.google.common.base.c.f116471x, com.google.common.base.c.f116473z, com.google.common.base.c.f116473z, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.B, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.f116473z, com.google.common.base.c.f116472y, com.google.common.base.c.f116471x, com.google.common.base.c.f116473z, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.f116472y, com.google.common.base.c.A, com.google.common.base.c.f116473z, com.google.common.base.c.f116473z, com.google.common.base.c.B, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.f116472y, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.f116472y, com.google.common.base.c.A, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.f116471x, com.google.common.base.c.f116473z, com.google.common.base.c.f116473z, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.f116473z, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.D, com.google.common.base.c.D, com.google.common.base.c.f116471x, 19, com.google.common.base.c.f116473z, com.google.common.base.c.A, com.google.common.base.c.f116473z, com.google.common.base.c.C, com.google.common.base.c.D, com.google.common.base.c.D, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.D, com.google.common.base.c.B, com.google.common.base.c.C, 19, com.google.common.base.c.f116472y, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.B, com.google.common.base.c.f116472y, com.google.common.base.c.f116472y, com.google.common.base.c.D, com.google.common.base.c.D, com.google.common.base.c.F, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.f116471x, com.google.common.base.c.B, com.google.common.base.c.f116471x, com.google.common.base.c.f116472y, com.google.common.base.c.f116473z, com.google.common.base.c.f116472y, com.google.common.base.c.f116472y, com.google.common.base.c.A, com.google.common.base.c.f116473z, com.google.common.base.c.f116473z, com.google.common.base.c.C, com.google.common.base.c.C, com.google.common.base.c.B, com.google.common.base.c.B, com.google.common.base.c.D, com.google.common.base.c.A, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.D, com.google.common.base.c.D, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.F, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.E, com.google.common.base.c.D};
        f334477c = bArr;
        f334478d = new a();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            f334475a.a(i10, f334476b[i10], f334477c[i10]);
        }
    }

    private k() {
    }

    private final void a(int i10, int i11, int i12) {
        a aVar = new a(i10, i12);
        a aVar2 = f334478d;
        while (i12 > 8) {
            i12 -= 8;
            int i13 = (i11 >>> i12) & 255;
            a[] aVarArrA = aVar2.a();
            Intrinsics.checkNotNull(aVarArrA);
            a aVar3 = aVarArrA[i13];
            if (aVar3 == null) {
                aVar3 = new a();
                aVarArrA[i13] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i14 = 8 - i12;
        int i15 = (i11 << i14) & 255;
        a[] aVarArrA2 = aVar2.a();
        Intrinsics.checkNotNull(aVarArrA2);
        ArraysKt.fill(aVarArrA2, aVar, i15, (1 << i14) + i15);
    }

    public final void b(@NotNull okio.n source, long j10, @NotNull okio.m sink) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        a aVar = f334478d;
        int iD = 0;
        int iC = 0;
        for (long j11 = 0; j11 < j10; j11++) {
            iD = (iD << 8) | jk.f.d(source.readByte(), 255);
            iC += 8;
            while (iC >= 8) {
                a[] aVarArrA = aVar.a();
                Intrinsics.checkNotNull(aVarArrA);
                aVar = aVarArrA[(iD >>> (iC - 8)) & 255];
                Intrinsics.checkNotNull(aVar);
                if (aVar.a() == null) {
                    sink.writeByte(aVar.b());
                    iC -= aVar.c();
                    aVar = f334478d;
                } else {
                    iC -= 8;
                }
            }
        }
        while (iC > 0) {
            a[] aVarArrA2 = aVar.a();
            Intrinsics.checkNotNull(aVarArrA2);
            a aVar2 = aVarArrA2[(iD << (8 - iC)) & 255];
            Intrinsics.checkNotNull(aVar2);
            if (aVar2.a() != null || aVar2.c() > iC) {
                return;
            }
            sink.writeByte(aVar2.b());
            iC -= aVar2.c();
            aVar = f334478d;
        }
    }

    public final void c(@NotNull o source, @NotNull okio.m sink) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iV0 = source.v0();
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iV0; i11++) {
            int iD = jk.f.d(source.E(i11), 255);
            int i12 = f334476b[iD];
            byte b10 = f334477c[iD];
            j10 = (j10 << b10) | ((long) i12);
            i10 += b10;
            while (i10 >= 8) {
                i10 -= 8;
                sink.writeByte((int) (j10 >> i10));
            }
        }
        if (i10 > 0) {
            sink.writeByte((int) ((j10 << (8 - i10)) | (255 >>> i10)));
        }
    }

    public final int d(@NotNull o bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int iV0 = bytes.v0();
        long j10 = 0;
        for (int i10 = 0; i10 < iV0; i10++) {
            j10 += (long) f334477c[jk.f.d(bytes.E(i10), 255)];
        }
        return (int) ((j10 + ((long) 7)) >> 3);
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final a[] f334479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f334480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f334481c;

        public a() {
            this.f334479a = new a[256];
            this.f334480b = 0;
            this.f334481c = 0;
        }

        @Nullable
        public final a[] a() {
            return this.f334479a;
        }

        public final int b() {
            return this.f334480b;
        }

        public final int c() {
            return this.f334481c;
        }

        public a(int i10, int i11) {
            this.f334479a = null;
            this.f334480b = i10;
            int i12 = i11 & 7;
            this.f334481c = i12 == 0 ? 8 : i12;
        }
    }
}

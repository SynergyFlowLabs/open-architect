package androidx.media2.exoplayer.external.extractor.wav;

import androidx.annotation.b1;
import androidx.collection.g3;
import androidx.media2.exoplayer.external.audio.j0;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f55177a = "WavHeaderReader";

    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f55178c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f55180b;

        private a(int id2, long size) {
            this.f55179a = id2;
            this.f55180b = size;
        }

        public static a a(j input, x scratch) throws InterruptedException, IOException {
            input.i(scratch.f57720a, 0, 8);
            scratch.Q(0);
            return new a(scratch.l(), scratch.s());
        }
    }

    private d() {
    }

    public static c a(j input) throws InterruptedException, IOException {
        androidx.media2.exoplayer.external.util.a.g(input);
        x xVar = new x(16);
        if (a.a(input, xVar).f55179a != 1380533830) {
            return null;
        }
        input.i(xVar.f57720a, 0, 4);
        xVar.Q(0);
        int iL = xVar.l();
        if (iL != 1463899717) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Unsupported RIFF format: ");
            sb2.append(iL);
            p.d(f55177a, sb2.toString());
            return null;
        }
        a aVarA = a.a(input, xVar);
        while (aVarA.f55179a != 1718449184) {
            input.n((int) aVarA.f55180b);
            aVarA = a.a(input, xVar);
        }
        androidx.media2.exoplayer.external.util.a.i(aVarA.f55180b >= 16);
        input.i(xVar.f57720a, 0, 16);
        xVar.Q(0);
        int iV = xVar.v();
        int iV2 = xVar.v();
        int iU = xVar.u();
        int iU2 = xVar.u();
        int iV3 = xVar.v();
        int iV4 = xVar.v();
        int i10 = (iV2 * iV4) / 8;
        if (iV3 != i10) {
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("Expected block alignment: ");
            sb3.append(i10);
            sb3.append("; got: ");
            sb3.append(iV3);
            throw new k0(sb3.toString());
        }
        int iA = j0.a(iV, iV4);
        if (iA != 0) {
            input.n(((int) aVarA.f55180b) - 16);
            return new c(iV2, iU, iU2, iV3, iV4, iA);
        }
        StringBuilder sb4 = new StringBuilder(64);
        sb4.append("Unsupported WAV format: ");
        sb4.append(iV4);
        sb4.append(" bit/sample, type ");
        sb4.append(iV);
        p.d(f55177a, sb4.toString());
        return null;
    }

    public static void b(j input, c wavHeader) throws InterruptedException, IOException {
        androidx.media2.exoplayer.external.util.a.g(input);
        androidx.media2.exoplayer.external.util.a.g(wavHeader);
        input.l();
        x xVar = new x(8);
        a aVarA = a.a(input, xVar);
        while (true) {
            int i10 = aVarA.f55179a;
            if (i10 == 1684108385) {
                input.o(8);
                int position = (int) input.getPosition();
                long j10 = ((long) position) + aVarA.f55180b;
                long length = input.getLength();
                if (length != -1 && j10 > length) {
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("Data exceeds input length: ");
                    sb2.append(j10);
                    sb2.append(", ");
                    sb2.append(length);
                    p.l(f55177a, sb2.toString());
                    j10 = length;
                }
                wavHeader.j(position, j10);
                return;
            }
            if (i10 != 1380533830 && i10 != 1718449184) {
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("Ignoring unknown WAV chunk: ");
                sb3.append(i10);
                p.l(f55177a, sb3.toString());
            }
            long j11 = aVarA.f55180b + 8;
            if (aVarA.f55179a == 1380533830) {
                j11 = 12;
            }
            if (j11 > g3.f12256c) {
                int i11 = aVarA.f55179a;
                StringBuilder sb4 = new StringBuilder(51);
                sb4.append("Chunk is too large (~2GB+) to skip; id: ");
                sb4.append(i11);
                throw new k0(sb4.toString());
            }
            input.o((int) j11);
            aVarA = a.a(input, xVar);
        }
    }
}

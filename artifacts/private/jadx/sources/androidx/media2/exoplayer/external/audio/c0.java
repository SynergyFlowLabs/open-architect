package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class c0 extends w {
    c0() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0036 A[ADDED_TO_REGION, LOOP:0: B:15:0x0036->B:16:0x0038, LOOP_START, PHI: r0
      0x0036: PHI (r0v5 int) = (r0v0 int), (r0v6 int) binds: [B:14:0x0034, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[LOOP:0: B:15:0x0036->B:16:0x0038, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[ADDED_TO_REGION, LOOP:1: B:19:0x0056->B:20:0x0058, LOOP_START, PHI: r0
      0x0056: PHI (r0v3 int) = (r0v0 int), (r0v4 int) binds: [B:13:0x0032, B:20:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[LOOP:1: B:19:0x0056->B:20:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x006e A[ADDED_TO_REGION, LOOP:2: B:21:0x006e->B:22:0x0070, LOOP_START, PHI: r0
      0x006e: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0030, B:22:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0070 A[LOOP:2: B:21:0x006e->B:22:0x0070, LOOP_END] */
    @Override // androidx.media2.exoplayer.external.audio.j
    public void b(ByteBuffer inputBuffer) {
        int i10;
        ByteBuffer byteBufferM;
        int i11;
        int iPosition = inputBuffer.position();
        int iLimit = inputBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = this.f53512d;
        if (i13 != Integer.MIN_VALUE) {
            if (i13 != 3) {
                if (i13 != 1073741824) {
                    throw new IllegalStateException();
                }
                i10 = i12 / 2;
            }
            byteBufferM = m(i10);
            i11 = this.f53512d;
            if (i11 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    byteBufferM.put(inputBuffer.get(iPosition + 1));
                    byteBufferM.put(inputBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i11 != 3) {
                while (iPosition < iLimit) {
                    byteBufferM.put((byte) 0);
                    byteBufferM.put((byte) ((inputBuffer.get(iPosition) & 255) - 128));
                    iPosition++;
                }
            } else {
                if (i11 == 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    byteBufferM.put(inputBuffer.get(iPosition + 2));
                    byteBufferM.put(inputBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            inputBuffer.position(inputBuffer.limit());
            byteBufferM.flip();
        }
        i12 /= 3;
        i10 = i12 * 2;
        byteBufferM = m(i10);
        i11 = this.f53512d;
        if (i11 != Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                byteBufferM.put(inputBuffer.get(iPosition + 1));
                byteBufferM.put(inputBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i11 != 3) {
            while (iPosition < iLimit) {
                byteBufferM.put((byte) 0);
                byteBufferM.put((byte) ((inputBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else {
            if (i11 == 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM.put(inputBuffer.get(iPosition + 2));
                byteBufferM.put(inputBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        inputBuffer.position(inputBuffer.limit());
        byteBufferM.flip();
    }

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public int g() {
        return 2;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean h(int sampleRateHz, int channelCount, int encoding) throws j.a {
        if (encoding == 3 || encoding == 2 || encoding == Integer.MIN_VALUE || encoding == 1073741824) {
            return n(sampleRateHz, channelCount, encoding);
        }
        throw new j.a(sampleRateHz, channelCount, encoding);
    }

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public boolean isActive() {
        int i10 = this.f53512d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }
}

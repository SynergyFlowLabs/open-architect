package androidx.media3.extractor.mp4;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f68068a = "PsshAtomUtil";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f68069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f68071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final UUID[] f68072d;

        a(UUID uuid, int i10, byte[] bArr, @p0 UUID[] uuidArr) {
            this.f68069a = uuid;
            this.f68070b = i10;
            this.f68071c = bArr;
            this.f68072d = uuidArr;
        }
    }

    private r() {
    }

    public static byte[] a(UUID uuid, @p0 byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, @p0 UUID[] uuidArr, @p0 byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    @p0
    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        o0 o0Var = new o0(bArr);
        if (o0Var.g() < 32) {
            return null;
        }
        o0Var.a0(0);
        int iA = o0Var.a();
        int iS = o0Var.s();
        if (iS != iA) {
            androidx.media3.common.util.z.n(f68068a, "Advertised atom size (" + iS + ") does not match buffer size: " + iA);
            return null;
        }
        int iS2 = o0Var.s();
        if (iS2 != 1886614376) {
            androidx.media3.common.util.z.n(f68068a, "Atom type is not pssh: " + iS2);
            return null;
        }
        int iN = b.n(o0Var.s());
        if (iN > 1) {
            androidx.media3.common.util.z.n(f68068a, "Unsupported pssh version: " + iN);
            return null;
        }
        UUID uuid = new UUID(o0Var.E(), o0Var.E());
        if (iN == 1) {
            int iP = o0Var.P();
            uuidArr = new UUID[iP];
            for (int i10 = 0; i10 < iP; i10++) {
                uuidArr[i10] = new UUID(o0Var.E(), o0Var.E());
            }
        } else {
            uuidArr = null;
        }
        int iP2 = o0Var.P();
        int iA2 = o0Var.a();
        if (iP2 == iA2) {
            byte[] bArr2 = new byte[iP2];
            o0Var.n(bArr2, 0, iP2);
            return new a(uuid, iN, bArr2, uuidArr);
        }
        androidx.media3.common.util.z.n(f68068a, "Atom data size (" + iP2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    @p0
    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f68069a)) {
            return aVarD.f68071c;
        }
        androidx.media3.common.util.z.n(f68068a, "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f68069a + ".");
        return null;
    }

    @p0
    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f68069a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f68070b;
    }
}

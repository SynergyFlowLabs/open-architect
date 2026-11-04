package androidx.media2.exoplayer.external.extractor.mp4;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.x;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54506a = "PsshAtomUtil";

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UUID f54507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f54509c;

        public a(UUID uuid, int version, byte[] schemeData) {
            this.f54507a = uuid;
            this.f54508b = version;
            this.f54509c = schemeData;
        }
    }

    private j() {
    }

    public static byte[] a(UUID systemId, @p0 byte[] data) {
        return b(systemId, null, data);
    }

    public static byte[] b(UUID systemId, @p0 UUID[] keyIds, @p0 byte[] data) {
        int length = (data != null ? data.length : 0) + 32;
        if (keyIds != null) {
            length += (keyIds.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(keyIds != null ? 16777216 : 0);
        byteBufferAllocate.putLong(systemId.getMostSignificantBits());
        byteBufferAllocate.putLong(systemId.getLeastSignificantBits());
        if (keyIds != null) {
            byteBufferAllocate.putInt(keyIds.length);
            for (UUID uuid : keyIds) {
                byteBufferAllocate.putLong(uuid.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
            }
        }
        if (data != null && data.length != 0) {
            byteBufferAllocate.putInt(data.length);
            byteBufferAllocate.put(data);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] data) {
        return d(data) != null;
    }

    @p0
    private static a d(byte[] atom) {
        x xVar = new x(atom);
        if (xVar.d() < 32) {
            return null;
        }
        xVar.Q(0);
        if (xVar.l() != xVar.a() + 4 || xVar.l() != 1886614376) {
            return null;
        }
        int iC = androidx.media2.exoplayer.external.extractor.mp4.a.c(xVar.l());
        if (iC > 1) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Unsupported pssh version: ");
            sb2.append(iC);
            p.l(f54506a, sb2.toString());
            return null;
        }
        UUID uuid = new UUID(xVar.w(), xVar.w());
        if (iC == 1) {
            xVar.R(xVar.H() * 16);
        }
        int iH = xVar.H();
        if (iH != xVar.a()) {
            return null;
        }
        byte[] bArr = new byte[iH];
        xVar.i(bArr, 0, iH);
        return new a(uuid, iC, bArr);
    }

    @p0
    public static byte[] e(byte[] atom, UUID uuid) {
        a aVarD = d(atom);
        if (aVarD == null) {
            return null;
        }
        if (uuid == null || uuid.equals(aVarD.f54507a)) {
            return aVarD.f54509c;
        }
        String strValueOf = String.valueOf(uuid);
        String strValueOf2 = String.valueOf(aVarD.f54507a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length());
        sb2.append("UUID mismatch. Expected: ");
        sb2.append(strValueOf);
        sb2.append(", got: ");
        sb2.append(strValueOf2);
        sb2.append(".");
        p.l(f54506a, sb2.toString());
        return null;
    }

    @p0
    public static UUID f(byte[] atom) {
        a aVarD = d(atom);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f54507a;
    }

    public static int g(byte[] atom) {
        a aVarD = d(atom);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f54508b;
    }
}

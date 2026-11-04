package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f57685a = "NalUnitUtil";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57687c = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f57689e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f57690f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f57691g = 39;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f57686b = {0, 0, 0, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f57688d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f57692h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int[] f57693i = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f57695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f57696c;

        public a(int picParameterSetId, int seqParameterSetId, boolean bottomFieldPicOrderInFramePresentFlag) {
            this.f57694a = picParameterSetId;
            this.f57695b = seqParameterSetId;
            this.f57696c = bottomFieldPicOrderInFramePresentFlag;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f57698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f57699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f57700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f57701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f57702f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f57703g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f57704h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f57705i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f57706j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f57707k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f57708l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f57709m;

        public b(int profileIdc, int constraintsFlagsAndReservedZero2Bits, int levelIdc, int seqParameterSetId, int width, int height, float pixelWidthAspectRatio, boolean separateColorPlaneFlag, boolean frameMbsOnlyFlag, int frameNumLength, int picOrderCountType, int picOrderCntLsbLength, boolean deltaPicOrderAlwaysZeroFlag) {
            this.f57697a = profileIdc;
            this.f57698b = constraintsFlagsAndReservedZero2Bits;
            this.f57699c = levelIdc;
            this.f57700d = seqParameterSetId;
            this.f57701e = width;
            this.f57702f = height;
            this.f57703g = pixelWidthAspectRatio;
            this.f57704h = separateColorPlaneFlag;
            this.f57705i = frameMbsOnlyFlag;
            this.f57706j = frameNumLength;
            this.f57707k = picOrderCountType;
            this.f57708l = picOrderCntLsbLength;
            this.f57709m = deltaPicOrderAlwaysZeroFlag;
        }
    }

    private t() {
    }

    public static void a(boolean[] prefixFlags) {
        prefixFlags[0] = false;
        prefixFlags[1] = false;
        prefixFlags[2] = false;
    }

    public static void b(ByteBuffer data) {
        int iPosition = data.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                data.clear();
                return;
            }
            int i13 = data.get(i10) & 255;
            if (i11 == 3) {
                if (i13 == 1 && (data.get(i12) & com.google.common.base.c.I) == 7) {
                    ByteBuffer byteBufferDuplicate = data.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    data.position(0);
                    data.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0089  */
    /* JADX WARN: Code duplicated, block: B:57:0x008e  */
    public static int c(byte[] data, int startOffset, int endOffset, boolean[] prefixFlags) {
        boolean z10;
        int i10 = endOffset - startOffset;
        androidx.media2.exoplayer.external.util.a.i(i10 >= 0);
        if (i10 != 0) {
            if (prefixFlags != null) {
                if (prefixFlags[0]) {
                    a(prefixFlags);
                    return startOffset - 3;
                }
                if (i10 > 1 && prefixFlags[1] && data[startOffset] == 1) {
                    a(prefixFlags);
                    return startOffset - 2;
                }
                if (i10 > 2 && prefixFlags[2] && data[startOffset] == 0 && data[startOffset + 1] == 1) {
                    a(prefixFlags);
                    return startOffset - 1;
                }
            }
            int i11 = endOffset - 1;
            int i12 = startOffset + 2;
            while (i12 < i11) {
                byte b10 = data[i12];
                if ((b10 & 254) == 0) {
                    int i13 = i12 - 2;
                    if (data[i13] == 0 && data[i12 - 1] == 0 && b10 == 1) {
                        if (prefixFlags != null) {
                            a(prefixFlags);
                        }
                        return i13;
                    }
                    i12 -= 2;
                }
                i12 += 3;
            }
            if (prefixFlags != null) {
                if (i10 > 2) {
                    if (data[endOffset - 3] == 0 && data[endOffset - 2] == 0 && data[i11] == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (i10 == 2) {
                    if (prefixFlags[2] && data[endOffset - 2] == 0 && data[i11] == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (prefixFlags[1] && data[i11] == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                prefixFlags[0] = z10;
                prefixFlags[1] = i10 <= 1 ? prefixFlags[2] && data[i11] == 0 : data[endOffset + (-2)] == 0 && data[i11] == 0;
                prefixFlags[2] = data[i11] == 0;
            }
        }
        return endOffset;
    }

    private static int d(byte[] bytes, int offset, int limit) {
        while (offset < limit - 2) {
            if (bytes[offset] == 0 && bytes[offset + 1] == 0 && bytes[offset + 2] == 3) {
                return offset;
            }
            offset++;
        }
        return limit;
    }

    public static int e(byte[] data, int offset) {
        return (data[offset + 3] & 126) >> 1;
    }

    public static int f(byte[] data, int offset) {
        return data[offset + 3] & com.google.common.base.c.I;
    }

    public static boolean g(String mimeType, byte nalUnitHeaderFirstByte) {
        return ("video/avc".equals(mimeType) && (nalUnitHeaderFirstByte & com.google.common.base.c.I) == 6) || ("video/hevc".equals(mimeType) && ((nalUnitHeaderFirstByte & 126) >> 1) == 39);
    }

    public static a h(byte[] nalData, int nalOffset, int nalLimit) {
        y yVar = new y(nalData, nalOffset, nalLimit);
        yVar.l(8);
        int iH = yVar.h();
        int iH2 = yVar.h();
        yVar.k();
        return new a(iH, iH2, yVar.d());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:64:0x011d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0120  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0154  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0119, please report this as an issue */
    /*  JADX ERROR: StackOverflowError in pass: IfRegionVisitor
        java.lang.StackOverflowError
        	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1771)
        	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1759)
        	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:139)
        	at jadx.core.dex.instructions.args.SSAVar.use(SSAVar.java:132)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:514)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:96)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
        */
    public static androidx.media2.exoplayer.external.util.t.b i(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.util.t.i(byte[], int, int):androidx.media2.exoplayer.external.util.t$b");
    }

    private static void j(y bitArray, int size) {
        int iG = 8;
        int i10 = 8;
        for (int i11 = 0; i11 < size; i11++) {
            if (iG != 0) {
                iG = ((bitArray.g() + i10) + 256) % 256;
            }
            if (iG != 0) {
                i10 = iG;
            }
        }
    }

    public static int k(byte[] data, int limit) {
        int i10;
        synchronized (f57692h) {
            int i11 = 4 << 0;
            int iD = 0;
            int i12 = 0;
            while (iD < limit) {
                try {
                    iD = d(data, iD, limit);
                    if (iD < limit) {
                        int[] iArr = f57693i;
                        if (iArr.length <= i12) {
                            f57693i = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f57693i[i12] = iD;
                        iD += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i10 = limit - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f57693i[i15] - i14;
                System.arraycopy(data, i14, data, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                data[i17] = 0;
                i13 = i17 + 2;
                data[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(data, i14, data, i13, i10 - i13);
        }
        return i10;
    }
}

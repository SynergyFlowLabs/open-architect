package androidx.media2.exoplayer.external.extractor.mp4;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.collection.g3;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.s;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54367a = "AtomParsers";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f54368b = 1986618469;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f54369c = 1936684398;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f54370d = 1952807028;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f54371e = 1935832172;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f54372f = 1937072756;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f54373g = 1668047728;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54374h = 1835365473;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f54375i = 1835299937;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54376j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f54377k = q0.i0("OpusHead");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f54379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f54381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f54382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final x f54383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final x f54384g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f54385h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f54386i;

        public a(x stsc, x chunkOffsets, boolean chunkOffsetsAreLongs) {
            this.f54384g = stsc;
            this.f54383f = chunkOffsets;
            this.f54382e = chunkOffsetsAreLongs;
            chunkOffsets.Q(12);
            this.f54378a = chunkOffsets.H();
            stsc.Q(12);
            this.f54386i = stsc.H();
            androidx.media2.exoplayer.external.util.a.j(stsc.l() == 1, "first_chunk must be 1");
            this.f54379b = -1;
        }

        public boolean a() {
            int i10 = this.f54379b + 1;
            this.f54379b = i10;
            if (i10 == this.f54378a) {
                return false;
            }
            this.f54381d = this.f54382e ? this.f54383f.I() : this.f54383f.F();
            if (this.f54379b == this.f54385h) {
                this.f54380c = this.f54384g.H();
                this.f54384g.R(4);
                int i11 = this.f54386i - 1;
                this.f54386i = i11;
                this.f54385h = i11 > 0 ? this.f54384g.H() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.extractor.mp4.b$b, reason: collision with other inner class name */
    private interface InterfaceC0511b {
        int a();

        int b();

        boolean c();
    }

    private static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f54387e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m[] f54388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Format f54389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54391d = 0;

        public c(int numberOfEntries) {
            this.f54388a = new m[numberOfEntries];
        }
    }

    static final class d implements InterfaceC0511b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x f54394c;

        public d(androidx.media2.exoplayer.external.extractor.mp4.a.b stszAtom) {
            x xVar = stszAtom.f54366m1;
            this.f54394c = xVar;
            xVar.Q(12);
            this.f54392a = xVar.H();
            this.f54393b = xVar.H();
        }

        @Override // androidx.media2.exoplayer.external.extractor.mp4.b.InterfaceC0511b
        public int a() {
            int i10 = this.f54392a;
            return i10 == 0 ? this.f54394c.H() : i10;
        }

        @Override // androidx.media2.exoplayer.external.extractor.mp4.b.InterfaceC0511b
        public int b() {
            return this.f54393b;
        }

        @Override // androidx.media2.exoplayer.external.extractor.mp4.b.InterfaceC0511b
        public boolean c() {
            return this.f54392a != 0;
        }
    }

    static final class e implements InterfaceC0511b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f54395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f54398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f54399e;

        public e(androidx.media2.exoplayer.external.extractor.mp4.a.b stz2Atom) {
            x xVar = stz2Atom.f54366m1;
            this.f54395a = xVar;
            xVar.Q(12);
            this.f54397c = xVar.H() & 255;
            this.f54396b = xVar.H();
        }

        @Override // androidx.media2.exoplayer.external.extractor.mp4.b.InterfaceC0511b
        public int a() {
            int i10 = this.f54397c;
            if (i10 == 8) {
                return this.f54395a.D();
            }
            if (i10 == 16) {
                return this.f54395a.J();
            }
            int i11 = this.f54398d;
            this.f54398d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f54399e & 15;
            }
            int iD = this.f54395a.D();
            this.f54399e = iD;
            return (iD & 240) >> 4;
        }

        @Override // androidx.media2.exoplayer.external.extractor.mp4.b.InterfaceC0511b
        public int b() {
            return this.f54396b;
        }

        @Override // androidx.media2.exoplayer.external.extractor.mp4.b.InterfaceC0511b
        public boolean c() {
            return false;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f54401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54402c;

        public f(int id2, long duration, int rotationDegrees) {
            this.f54400a = id2;
            this.f54401b = duration;
            this.f54402c = rotationDegrees;
        }
    }

    private b() {
    }

    private static boolean a(long[] timestamps, long duration, long editStartTime, long editEndTime) {
        int length = timestamps.length - 1;
        return timestamps[0] <= editStartTime && editStartTime < timestamps[q0.r(4, 0, length)] && timestamps[q0.r(timestamps.length - 4, 0, length)] < editEndTime && editEndTime <= duration;
    }

    private static int b(x parent, int position, int size) {
        int iC = parent.c();
        while (iC - position < size) {
            parent.Q(iC);
            int iL = parent.l();
            androidx.media2.exoplayer.external.util.a.b(iL > 0, "childAtomSize should be positive");
            if (parent.l() == 1702061171) {
                return iC;
            }
            iC += iL;
        }
        return -1;
    }

    private static int c(int hdlr) {
        if (hdlr == f54369c) {
            return 1;
        }
        if (hdlr == f54368b) {
            return 2;
        }
        if (hdlr == f54370d || hdlr == f54371e || hdlr == f54372f || hdlr == f54373g) {
            return 3;
        }
        return hdlr == 1835365473 ? 4 : -1;
    }

    private static void d(x parent, int atomType, int position, int size, int trackId, String language, boolean isQuickTime, DrmInitData drmInitData, c out, int entryIndex) throws k0 {
        int iJ;
        int iE;
        int iH;
        String str;
        int iIntValue;
        DrmInitData drmInitData2;
        int i10;
        String str2;
        char c10;
        char c11;
        boolean z10;
        int i11;
        int i12 = position;
        int i13 = size;
        DrmInitData drmInitDataC = drmInitData;
        parent.Q(i12 + 16);
        if (isQuickTime) {
            iJ = parent.J();
            parent.R(6);
        } else {
            parent.R(8);
            iJ = 0;
        }
        boolean z11 = true;
        if (iJ == 0 || iJ == 1) {
            int iJ2 = parent.J();
            parent.R(6);
            iE = parent.E();
            if (iJ == 1) {
                parent.R(16);
            }
            iH = iJ2;
        } else {
            if (iJ != 2) {
                return;
            }
            parent.R(16);
            iE = (int) Math.round(parent.j());
            iH = parent.H();
            parent.R(20);
        }
        int iC = parent.c();
        int iIntValue2 = atomType;
        if (iIntValue2 == 1701733217) {
            Pair<Integer, m> pairP = p(parent, i12, i13);
            if (pairP != null) {
                iIntValue2 = ((Integer) pairP.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((m) pairP.second).f54527b);
                out.f54388a[entryIndex] = (m) pairP.second;
            }
            parent.Q(iC);
        }
        DrmInitData drmInitData3 = drmInitDataC;
        String str3 = "audio/raw";
        if (iIntValue2 == 1633889587) {
            str = "audio/ac3";
        } else if (iIntValue2 == 1700998451) {
            str = "audio/eac3";
        } else if (iIntValue2 == 1633889588) {
            str = "audio/ac4";
        } else if (iIntValue2 == 1685353315) {
            str = "audio/vnd.dts";
        } else if (iIntValue2 == 1685353320 || iIntValue2 == 1685353324) {
            str = "audio/vnd.dts.hd";
        } else if (iIntValue2 == 1685353317) {
            str = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue2 == 1935764850) {
            str = "audio/3gpp";
        } else if (iIntValue2 == 1935767394) {
            str = "audio/amr-wb";
        } else if (iIntValue2 == 1819304813 || iIntValue2 == 1936684916) {
            str = "audio/raw";
        } else if (iIntValue2 == 778924083) {
            str = "audio/mpeg";
        } else if (iIntValue2 == 1634492771) {
            str = "audio/alac";
        } else if (iIntValue2 == 1634492791) {
            str = "audio/g711-alaw";
        } else if (iIntValue2 == 1970037111) {
            str = "audio/g711-mlaw";
        } else if (iIntValue2 == 1332770163) {
            str = "audio/opus";
        } else {
            str = iIntValue2 == 1716281667 ? "audio/flac" : null;
        }
        int i14 = iE;
        String str4 = str;
        int i15 = i14;
        int iIntValue3 = iH;
        int i16 = iC;
        byte[] bArr = null;
        while (i16 - i12 < i13) {
            parent.Q(i16);
            int iL = parent.l();
            if (iL <= 0) {
                z11 = false;
            }
            androidx.media2.exoplayer.external.util.a.b(z11, "childAtomSize should be positive");
            int iL2 = parent.l();
            if (iL2 == 1702061171 || (isQuickTime && iL2 == 2002876005)) {
                iIntValue = i15;
                drmInitData2 = drmInitData3;
                i10 = iL;
                str2 = str3;
                c10 = 24931;
                c11 = 2;
                z10 = true;
                i11 = i16;
                int iB = iL2 == 1702061171 ? i11 : b(parent, i11, i10);
                if (iB != -1) {
                    Pair<String, byte[]> pairG = g(parent, iB);
                    str4 = (String) pairG.first;
                    bArr = (byte[]) pairG.second;
                    if ("audio/mp4a-latm".equals(str4)) {
                        Pair<Integer, Integer> pairJ = androidx.media2.exoplayer.external.util.d.j(bArr);
                        iIntValue = ((Integer) pairJ.first).intValue();
                        iIntValue3 = ((Integer) pairJ.second).intValue();
                    }
                }
            } else {
                if (iL2 == 1684103987) {
                    parent.Q(i16 + 8);
                    out.f54389b = androidx.media2.exoplayer.external.audio.a.d(parent, Integer.toString(trackId), language, drmInitData3);
                } else if (iL2 == 1684366131) {
                    parent.Q(i16 + 8);
                    out.f54389b = androidx.media2.exoplayer.external.audio.a.g(parent, Integer.toString(trackId), language, drmInitData3);
                } else {
                    if (iL2 == 1684103988) {
                        parent.Q(i16 + 8);
                        out.f54389b = androidx.media2.exoplayer.external.audio.b.b(parent, Integer.toString(trackId), language, drmInitData3);
                    } else if (iL2 == 1684305011) {
                        int i17 = i15;
                        drmInitData2 = drmInitData3;
                        str2 = str3;
                        i10 = iL;
                        c10 = 24931;
                        c11 = 2;
                        z10 = true;
                        Format formatS = Format.s(Integer.toString(trackId), str4, null, -1, -1, iIntValue3, i17, null, drmInitData2, 0, language);
                        iIntValue = i17;
                        out.f54389b = formatS;
                        i11 = i16;
                    } else {
                        iIntValue = i15;
                        int i18 = i16;
                        drmInitData2 = drmInitData3;
                        i10 = iL;
                        str2 = str3;
                        c10 = 24931;
                        c11 = 2;
                        z10 = true;
                        if (iL2 == 1682927731) {
                            int i19 = i10 - 8;
                            byte[] bArr2 = f54377k;
                            byte[] bArr3 = new byte[bArr2.length + i19];
                            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                            i11 = i18;
                            parent.Q(i11 + 8);
                            parent.i(bArr3, bArr2.length, i19);
                            bArr = bArr3;
                        } else {
                            i11 = i18;
                            if (i10 == 1684425825 || iL2 == 1634492771) {
                                int i20 = i10 - 12;
                                byte[] bArr4 = new byte[i20];
                                parent.Q(i11 + 12);
                                parent.i(bArr4, 0, i20);
                                bArr = bArr4;
                            }
                            str3 = str2;
                            i16 = i11 + i10;
                            drmInitData3 = drmInitData2;
                            z11 = z10;
                            i12 = position;
                            i13 = size;
                        }
                    }
                    i15 = iIntValue;
                    str3 = str2;
                    i16 = i11 + i10;
                    drmInitData3 = drmInitData2;
                    z11 = z10;
                    i12 = position;
                    i13 = size;
                }
                iIntValue = i15;
                drmInitData2 = drmInitData3;
                i10 = iL;
                str2 = str3;
                c10 = 24931;
                c11 = 2;
                z10 = true;
                i11 = i16;
                i15 = iIntValue;
                str3 = str2;
                i16 = i11 + i10;
                drmInitData3 = drmInitData2;
                z11 = z10;
                i12 = position;
                i13 = size;
            }
            i15 = iIntValue;
            str3 = str2;
            i16 = i11 + i10;
            drmInitData3 = drmInitData2;
            z11 = z10;
            i12 = position;
            i13 = size;
        }
        int i21 = i15;
        DrmInitData drmInitData4 = drmInitData3;
        String str5 = str3;
        if (out.f54389b != null || str4 == null) {
            return;
        }
        out.f54389b = Format.r(Integer.toString(trackId), str4, null, -1, -1, iIntValue3, i21, str5.equals(str4) ? 2 : -1, bArr != null ? Collections.singletonList(bArr) : null, drmInitData4, 0, language);
    }

    static Pair<Integer, m> e(x parent, int position, int size) {
        int i10 = position + 8;
        int i11 = -1;
        int i12 = 0;
        String strA = null;
        Integer numValueOf = null;
        while (i10 - position < size) {
            parent.Q(i10);
            int iL = parent.l();
            int iL2 = parent.l();
            if (iL2 == 1718775137) {
                numValueOf = Integer.valueOf(parent.l());
            } else if (iL2 == 1935894637) {
                parent.R(4);
                strA = parent.A(4);
            } else if (iL2 == 1935894633) {
                i11 = i10;
                i12 = iL;
            }
            i10 += iL;
        }
        if (!"cenc".equals(strA) && !"cbc1".equals(strA) && !"cens".equals(strA) && !"cbcs".equals(strA)) {
            return null;
        }
        androidx.media2.exoplayer.external.util.a.b(numValueOf != null, "frma atom is mandatory");
        androidx.media2.exoplayer.external.util.a.b(i11 != -1, "schi atom is mandatory");
        m mVarQ = q(parent, i11, i12, strA);
        androidx.media2.exoplayer.external.util.a.b(mVarQ != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, mVarQ);
    }

    private static Pair<long[], long[]> f(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a edtsAtom) {
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH;
        if (edtsAtom == null || (bVarH = edtsAtom.h(1701606260)) == null) {
            return Pair.create(null, null);
        }
        x xVar = bVarH.f54366m1;
        xVar.Q(8);
        int iC = androidx.media2.exoplayer.external.extractor.mp4.a.c(xVar.l());
        int iH = xVar.H();
        long[] jArr = new long[iH];
        long[] jArr2 = new long[iH];
        for (int i10 = 0; i10 < iH; i10++) {
            jArr[i10] = iC == 1 ? xVar.I() : xVar.F();
            jArr2[i10] = iC == 1 ? xVar.w() : xVar.l();
            if (xVar.z() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            xVar.R(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> g(x parent, int position) {
        parent.Q(position + 12);
        parent.R(1);
        h(parent);
        parent.R(2);
        int iD = parent.D();
        if ((iD & 128) != 0) {
            parent.R(2);
        }
        if ((iD & 64) != 0) {
            parent.R(parent.J());
        }
        if ((iD & 32) != 0) {
            parent.R(2);
        }
        parent.R(1);
        h(parent);
        String strE = s.e(parent.D());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return Pair.create(strE, null);
        }
        parent.R(12);
        parent.R(1);
        int iH = h(parent);
        byte[] bArr = new byte[iH];
        parent.i(bArr, 0, iH);
        return Pair.create(strE, bArr);
    }

    private static int h(x data) {
        int iD = data.D();
        int i10 = iD & 127;
        while ((iD & 128) == 128) {
            iD = data.D();
            i10 = (i10 << 7) | (iD & 127);
        }
        return i10;
    }

    private static int i(x hdlr) {
        hdlr.Q(16);
        return hdlr.l();
    }

    @p0
    private static Metadata j(x ilst, int limit) {
        ilst.R(8);
        ArrayList arrayList = new ArrayList();
        while (ilst.c() < limit) {
            Metadata.Entry entryD = g.d(ilst);
            if (entryD != null) {
                arrayList.add(entryD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> k(x mdhd) {
        mdhd.Q(8);
        int iC = androidx.media2.exoplayer.external.extractor.mp4.a.c(mdhd.l());
        mdhd.R(iC == 0 ? 8 : 16);
        long jF = mdhd.F();
        mdhd.R(iC == 0 ? 4 : 8);
        int iJ = mdhd.J();
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append((char) (((iJ >> 10) & 31) + 96));
        sb2.append((char) (((iJ >> 5) & 31) + 96));
        sb2.append((char) ((iJ & 31) + 96));
        return Pair.create(Long.valueOf(jF), sb2.toString());
    }

    @p0
    public static Metadata l(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a meta) {
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH = meta.h(1751411826);
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH2 = meta.h(1801812339);
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH3 = meta.h(1768715124);
        if (bVarH == null || bVarH2 == null || bVarH3 == null || i(bVarH.f54366m1) != f54375i) {
            return null;
        }
        x xVar = bVarH2.f54366m1;
        xVar.Q(12);
        int iL = xVar.l();
        String[] strArr = new String[iL];
        for (int i10 = 0; i10 < iL; i10++) {
            int iL2 = xVar.l();
            xVar.R(4);
            strArr[i10] = xVar.A(iL2 - 8);
        }
        x xVar2 = bVarH3.f54366m1;
        xVar2.Q(8);
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() > 8) {
            int iC = xVar2.c();
            int iL3 = xVar2.l();
            int iL4 = xVar2.l() - 1;
            if (iL4 < 0 || iL4 >= iL) {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Skipped metadata with unknown key index: ");
                sb2.append(iL4);
                p.l(f54367a, sb2.toString());
            } else {
                MdtaMetadataEntry mdtaMetadataEntryG = g.g(xVar2, iC + iL3, strArr[iL4]);
                if (mdtaMetadataEntryG != null) {
                    arrayList.add(mdtaMetadataEntryG);
                }
            }
            xVar2.Q(iC + iL3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static long m(x mvhd) {
        mvhd.Q(8);
        mvhd.R(androidx.media2.exoplayer.external.extractor.mp4.a.c(mvhd.l()) != 0 ? 16 : 8);
        return mvhd.F();
    }

    private static float n(x parent, int position) {
        parent.Q(position + 8);
        return parent.H() / parent.H();
    }

    private static byte[] o(x parent, int position, int size) {
        int i10 = position + 8;
        while (i10 - position < size) {
            parent.Q(i10);
            int iL = parent.l();
            if (parent.l() == 1886547818) {
                return Arrays.copyOfRange(parent.f57720a, i10, iL + i10);
            }
            i10 += iL;
        }
        return null;
    }

    private static Pair<Integer, m> p(x parent, int position, int size) {
        Pair<Integer, m> pairE;
        int iC = parent.c();
        while (iC - position < size) {
            parent.Q(iC);
            int iL = parent.l();
            androidx.media2.exoplayer.external.util.a.b(iL > 0, "childAtomSize should be positive");
            if (parent.l() == 1936289382 && (pairE = e(parent, iC, iL)) != null) {
                return pairE;
            }
            iC += iL;
        }
        return null;
    }

    private static m q(x parent, int position, int size, String schemeType) {
        int i10;
        int i11;
        int i12 = position + 8;
        while (true) {
            byte[] bArr = null;
            if (i12 - position >= size) {
                return null;
            }
            parent.Q(i12);
            int iL = parent.l();
            if (parent.l() == 1952804451) {
                int iC = androidx.media2.exoplayer.external.extractor.mp4.a.c(parent.l());
                parent.R(1);
                if (iC == 0) {
                    parent.R(1);
                    i11 = 0;
                    i10 = 0;
                } else {
                    int iD = parent.D();
                    i10 = iD & 15;
                    i11 = (iD & 240) >> 4;
                }
                boolean z10 = parent.D() == 1;
                int iD2 = parent.D();
                byte[] bArr2 = new byte[16];
                parent.i(bArr2, 0, 16);
                if (z10 && iD2 == 0) {
                    int iD3 = parent.D();
                    bArr = new byte[iD3];
                    parent.i(bArr, 0, iD3);
                }
                return new m(z10, schemeType, iD2, bArr2, i11, i10, bArr);
            }
            i12 += iL;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0260  */
    /* JADX WARN: Code duplicated, block: B:106:0x0274 A[LOOP:9: B:104:0x026e->B:106:0x0274, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x02af  */
    /* JADX WARN: Code duplicated, block: B:202:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0148 A[EDGE_INSN: B:207:0x0148->B:55:0x0148 BREAK  A[LOOP:1: B:51:0x0125->B:54:0x012d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0127  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d A[LOOP:1: B:51:0x0125->B:54:0x012d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x016c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0172 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x0199  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb A[LOOP:3: B:84:0x01e0->B:88:0x01eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x0203  */
    /* JADX WARN: Code duplicated, block: B:99:0x0206  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v15, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16, types: [int] */
    /* JADX WARN: Type inference failed for: r8v43 */
    public static o r(l lVar, androidx.media2.exoplayer.external.extractor.mp4.a.C0510a c0510a, androidx.media2.exoplayer.external.extractor.m mVar) throws k0 {
        InterfaceC0511b eVar;
        boolean z10;
        int iH;
        int iH2;
        boolean z11;
        boolean z12;
        int i10;
        long[] jArr;
        int[] iArr;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        int i11;
        long[] jArrCopyOf2;
        int[] iArr2;
        long j10;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        boolean z13;
        int i12;
        int i13;
        x xVar;
        int[] iArrCopyOf2;
        InterfaceC0511b interfaceC0511b;
        int iH3;
        x xVar2;
        int i14;
        int i15;
        int iL;
        int i16;
        int i17;
        long j11;
        long j12;
        int i18;
        int i19;
        int i20;
        boolean z14;
        String str;
        long j13;
        int i21;
        boolean zA;
        int i22;
        int iA;
        int i23;
        int iH4;
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH = c0510a.h(1937011578);
        if (bVarH != null) {
            eVar = new d(bVarH);
        } else {
            androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH2 = c0510a.h(1937013298);
            if (bVarH2 == null) {
                throw new k0("Track has no sample table size information");
            }
            eVar = new e(bVarH2);
        }
        int iB = eVar.b();
        if (iB == 0) {
            return new o(lVar, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH3 = c0510a.h(1937007471);
        if (bVarH3 == null) {
            bVarH3 = c0510a.h(1668232756);
            z10 = true;
        } else {
            z10 = false;
        }
        x xVar3 = bVarH3.f54366m1;
        x xVar4 = c0510a.h(1937011555).f54366m1;
        x xVar5 = c0510a.h(1937011827).f54366m1;
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH4 = c0510a.h(1937011571);
        x xVar6 = null;
        x xVar7 = bVarH4 != null ? bVarH4.f54366m1 : null;
        androidx.media2.exoplayer.external.extractor.mp4.a.b bVarH5 = c0510a.h(1668576371);
        x xVar8 = bVarH5 != null ? bVarH5.f54366m1 : null;
        a aVar = new a(xVar4, xVar3, z10);
        xVar5.Q(12);
        int iH5 = xVar5.H() - 1;
        int iH6 = xVar5.H();
        int iH7 = xVar5.H();
        if (xVar8 != null) {
            xVar8.Q(12);
            iH = xVar8.H();
        } else {
            iH = 0;
        }
        int iH8 = -1;
        if (xVar7 != null) {
            xVar7.Q(12);
            iH2 = xVar7.H();
            iH8 = iH2 > 0 ? xVar7.H() - 1 : -1;
            if (eVar.c()) {
                z11 = false;
                if (!"audio/raw".equals(lVar.f54519f.f53103i) && iH5 == 0 && iH == 0 && iH2 == 0) {
                    z12 = true;
                }
                if (z12) {
                    i10 = 1;
                    int i24 = aVar.f54378a;
                    jArr = new long[i24];
                    iArr = new int[i24];
                    while (aVar.a()) {
                        int i25 = aVar.f54379b;
                        jArr[i25] = aVar.f54381d;
                        iArr[i25] = aVar.f54380c;
                    }
                    Format format = lVar.f54519f;
                    androidx.media2.exoplayer.external.extractor.mp4.d.b bVarA = androidx.media2.exoplayer.external.extractor.mp4.d.a(q0.V(format.f53113p1, format.Z), jArr, iArr, iH7);
                    jArrCopyOf = bVarA.f54408a;
                    iArrCopyOf = bVarA.f54409b;
                    i11 = bVarA.f54410c;
                    jArrCopyOf2 = bVarA.f54411d;
                    iArr2 = bVarA.f54412e;
                    j10 = bVarA.f54413f;
                    iB = iB;
                } else {
                    jArrCopyOf = new long[iB];
                    iArrCopyOf = new int[iB];
                    i10 = 1;
                    jArrCopyOf2 = new long[iB];
                    xVar = xVar8;
                    iArrCopyOf2 = new int[iB];
                    int i26 = iH8;
                    interfaceC0511b = eVar;
                    iH3 = i26;
                    xVar2 = xVar6;
                    i14 = iH;
                    i15 = z11 ? 1 : 0;
                    iL = i15;
                    i11 = iL == true ? 1 : 0;
                    i16 = i11 == true ? 1 : 0;
                    i17 = i16;
                    j11 = 0;
                    j12 = 0;
                    while (true) {
                        if (i15 < iB) {
                            boolean z15 = iB == true ? 1 : 0;
                            i18 = iH5;
                            i19 = iH6;
                            i20 = i16;
                            break;
                        }
                        j13 = j12;
                        i21 = i16;
                        zA = true;
                        while (i21 == 0) {
                            zA = aVar.a();
                            if (zA) {
                                break;
                            }
                            int i27 = iH5;
                            long j14 = aVar.f54381d;
                            i21 = aVar.f54380c;
                            j13 = j14;
                            iH5 = i27;
                            iH6 = iH6;
                            iB = iB == true ? 1 : 0;
                        }
                        i22 = iB;
                        i18 = iH5;
                        i19 = iH6;
                        if (!zA) {
                            p.l(f54367a, "Unexpected end of chunk data");
                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                            iB = i15;
                            i20 = i21;
                            break;
                        }
                        if (xVar != null) {
                            boolean z16 = i17 == true ? 1 : 0;
                            iH4 = i17 == true ? 1 : 0;
                            while (iH4 == 0 && i14 > 0) {
                                iH4 = xVar.H();
                                iL = xVar.l();
                                i14--;
                            }
                            i17 = iH4 - 1;
                        }
                        jArrCopyOf[i15] = j13;
                        iA = interfaceC0511b.a();
                        iArrCopyOf[i15] = iA;
                        if (iA > i11) {
                            i11 = iA;
                        }
                        jArrCopyOf2[i15] = j11 + ((long) iL);
                        if (xVar2 == null) {
                            i23 = 1;
                        } else {
                            boolean z17 = z11 ? 1 : 0;
                            i23 = z11 ? 1 : 0;
                        }
                        iArrCopyOf2[i15] = i23;
                        if (i15 == iH3) {
                            iArrCopyOf2[i15] = 1;
                            iH2--;
                            if (iH2 > 0) {
                                iH3 = xVar2.H() - 1;
                            }
                        }
                        j11 += (long) iH7;
                        iH6 = i19 - 1;
                        if (iH6 == 0 || i18 <= 0) {
                            iH5 = i18;
                        } else {
                            iH5 = i18 - 1;
                            iH6 = xVar5.H();
                            iH7 = xVar5.l();
                        }
                        long j15 = j13 + ((long) iArrCopyOf[i15]);
                        i16 = i21 - 1;
                        i15++;
                        j12 = j15;
                        iB = i22 == true ? 1 : 0;
                    }
                    long j16 = j11 + ((long) iL);
                    while (true) {
                        if (i14 > 0) {
                            z14 = true;
                            break;
                        }
                        if (xVar.H() != 0) {
                            z14 = z11 ? 1 : 0;
                            break;
                        }
                        xVar.l();
                        i14--;
                    }
                    if (iH2 == 0 || i19 != 0 || i20 != 0 || i18 != 0 || i17 != 0 || !z14) {
                        int i28 = lVar.f54514a;
                        if (z14) {
                            str = "";
                        } else {
                            str = ", ctts invalid";
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 262);
                        sb2.append("Inconsistent stbl box for track ");
                        sb2.append(i28);
                        sb2.append(": remainingSynchronizationSamples ");
                        sb2.append(iH2);
                        sb2.append(", remainingSamplesAtTimestampDelta ");
                        sb2.append(i19);
                        sb2.append(", remainingSamplesInChunk ");
                        sb2.append(i20);
                        sb2.append(", remainingTimestampDeltaChanges ");
                        sb2.append(i18);
                        sb2.append(", remainingSamplesAtTimestampOffset ");
                        sb2.append(i17 == true ? 1 : 0 ? 1 : 0);
                        sb2.append(str);
                        p.l(f54367a, sb2.toString());
                    }
                    iArr2 = iArrCopyOf2;
                    j10 = j16;
                }
                iArr3 = iArrCopyOf;
                long jI0 = q0.I0(j10, 1000000L, lVar.f54516c);
                if (lVar.f54521h != null || mVar.a()) {
                    long[] jArr2 = jArrCopyOf2;
                    long[] jArr3 = jArrCopyOf;
                    int i29 = i11;
                    q0.K0(jArr2, 1000000L, lVar.f54516c);
                    return new o(lVar, jArr3, iArr3, i29 == true ? 1 : 0, jArr2, iArr2, jI0);
                }
                long[] jArr4 = lVar.f54521h;
                int i30 = i10;
                if (jArr4.length == i30 && lVar.f54515b == i30 && jArrCopyOf2.length >= 2) {
                    long j17 = lVar.f54522i[z11 ? 1 : 0];
                    long jI1 = q0.I0(jArr4[z11 ? 1 : 0], lVar.f54516c, lVar.f54517d) + j17;
                    if (a(jArrCopyOf2, j10, j17, jI1)) {
                        long jI2 = q0.I0(j17 - jArrCopyOf2[z11 ? 1 : 0], lVar.f54519f.f53112p0, lVar.f54516c);
                        long jI3 = q0.I0(j10 - jI1, lVar.f54519f.f53112p0, lVar.f54516c);
                        if ((jI2 != 0 || jI3 != 0) && jI2 <= g3.f12256c && jI3 <= g3.f12256c) {
                            mVar.f54081a = (int) jI2;
                            mVar.f54082b = (int) jI3;
                            q0.K0(jArrCopyOf2, 1000000L, lVar.f54516c);
                            return new o(lVar, jArrCopyOf, iArr3, i11 == true ? 1 : 0, jArrCopyOf2, iArr2, q0.I0(lVar.f54521h[z11 ? 1 : 0], 1000000L, lVar.f54517d));
                        }
                    }
                }
                int i31 = iB;
                long[] jArr5 = jArrCopyOf;
                long[] jArr6 = jArrCopyOf2;
                int i32 = i11;
                long[] jArr7 = lVar.f54521h;
                if (jArr7.length == 1 && jArr7[z11 ? 1 : 0] == 0) {
                    long j18 = lVar.f54522i[z11 ? 1 : 0];
                    for (int i33 = z11 ? 1 : 0; i33 < jArr6.length; i33++) {
                        jArr6[i33] = q0.I0(jArr6[i33] - j18, 1000000L, lVar.f54516c);
                    }
                    return new o(lVar, jArr5, iArr3, i32 == true ? 1 : 0, jArr6, iArr2, q0.I0(j10 - j18, 1000000L, lVar.f54516c));
                }
                boolean z18 = lVar.f54515b == 1 ? true : z11 ? 1 : 0;
                int[] iArr7 = new int[jArr7.length];
                int[] iArr8 = new int[jArr7.length];
                boolean z19 = z11 ? 1 : 0;
                int i34 = z11 ? 1 : 0;
                int i35 = i34;
                int i36 = i35 == true ? 1 : 0;
                int i37 = i36;
                while (true) {
                    long[] jArr8 = lVar.f54521h;
                    if (i34 >= jArr8.length) {
                        break;
                    }
                    int[] iArr9 = iArr8;
                    int[] iArr10 = iArr7;
                    long j19 = lVar.f54522i[i34];
                    if (j19 != -1) {
                        long jI4 = q0.I0(jArr8[i34], lVar.f54516c, lVar.f54517d);
                        iArr10[i34] = q0.e(jArr6, j19, true, true);
                        z13 = z11;
                        iArr9[i34] = q0.e(jArr6, j19 + jI4, z18, z13);
                        while (true) {
                            i12 = iArr10[i34];
                            i13 = iArr9[i34];
                            if (i12 >= i13 || (iArr2[i12] & 1) != 0) {
                                break;
                            }
                            iArr10[i34] = i12 + 1;
                        }
                        i36 += i13 - i12;
                        i35 = (i35 == true ? 1 : 0) | (i37 != i12 ? 1 : z13 ? 1 : 0);
                        i37 = i13;
                    } else {
                        z13 = z11;
                    }
                    i34++;
                    i32 = i32;
                    z11 = z13;
                    iArr7 = iArr10;
                    iArr8 = iArr9;
                }
                int i38 = i32;
                int[] iArr11 = iArr8;
                int[] iArr12 = iArr7;
                boolean z20 = z11;
                boolean z21 = (i35 == true ? 1 : 0) | (i36 != i31 ? true : z20);
                long[] jArr9 = z21 != 0 ? new long[i36] : jArr5;
                if (z21 != 0) {
                    iArr6 = new int[i36];
                } else {
                    iArr4 = iArr3;
                }
                boolean z22 = z21 != 0 ? z20 : i38 == true ? 1 : 0;
                if (z21 != 0) {
                    iArr4 = iArr6;
                    iArr4 = iArr6;
                    iArr5 = new int[i36];
                } else {
                    iArr4 = iArr6;
                    iArr4 = iArr6;
                    iArr5 = iArr2;
                }
                long[] jArr10 = new long[i36];
                ?? r11 = z22;
                ?? r10 = z20;
                long j20 = 0;
                boolean z23 = z21;
                ?? r12 = iArr3;
                for (?? r15 = z20; r15 < lVar.f54521h.length; r15++) {
                    long j21 = lVar.f54522i[r15];
                    int i39 = iArr12[r15];
                    boolean z24 = z23;
                    int i40 = iArr11[r15];
                    long[] jArr11 = jArr10;
                    if (z24 != 0) {
                        int i41 = i40 - i39;
                        System.arraycopy(jArr5, i39, jArr9, r10, i41);
                        System.arraycopy(r12, i39, iArr4, r10, i41);
                        System.arraycopy(iArr2, i39, iArr5, r10, i41);
                    }
                    while (i39 < i40) {
                        long[] jArr12 = jArr5;
                        ?? r13 = r12;
                        jArr11[r10] = q0.I0(j20, 1000000L, lVar.f54517d) + q0.I0(jArr6[i39] - j21, 1000000L, lVar.f54516c);
                        if (z24 != 0 && iArr4[r10] > r11) {
                            r11 = r13[i39];
                        }
                        r10++;
                        i39++;
                        r12 = r13;
                        jArr5 = jArr12;
                    }
                    j20 += lVar.f54521h[r15];
                    z23 = z24;
                    r12 = r12;
                    jArr10 = jArr11;
                    jArr5 = jArr5;
                    r10 = r10;
                    r11 = r11;
                }
                return new o(lVar, jArr9, iArr4, r11 == true ? 1 : 0, jArr10, iArr5, q0.I0(j20, 1000000L, lVar.f54517d));
            }
            z11 = false;
            boolean z25 = z11 ? 1 : 0;
            z12 = z11 ? 1 : 0;
            if (z12) {
                jArrCopyOf = new long[iB];
                iArrCopyOf = new int[iB];
                i10 = 1;
                jArrCopyOf2 = new long[iB];
                xVar = xVar8;
                iArrCopyOf2 = new int[iB];
                int i210 = iH8;
                interfaceC0511b = eVar;
                iH3 = i210;
                xVar2 = xVar6;
                i14 = iH;
                i15 = z11 ? 1 : 0;
                iL = i15;
                i11 = iL == true ? 1 : 0;
                i16 = i11 == true ? 1 : 0;
                i17 = i16;
                j11 = 0;
                j12 = 0;
                while (true) {
                    if (i15 < iB) {
                        boolean z110 = iB == true ? 1 : 0;
                        i18 = iH5;
                        i19 = iH6;
                        i20 = i16;
                        break;
                    }
                    j13 = j12;
                    i21 = i16;
                    zA = true;
                    while (i21 == 0) {
                        zA = aVar.a();
                        if (zA) {
                            break;
                            break;
                        }
                        int i211 = iH5;
                        long j110 = aVar.f54381d;
                        i21 = aVar.f54380c;
                        j13 = j110;
                        iH5 = i211;
                        iH6 = iH6;
                        iB = iB == true ? 1 : 0;
                    }
                    i22 = iB;
                    i18 = iH5;
                    i19 = iH6;
                    if (!zA) {
                        p.l(f54367a, "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                        iB = i15;
                        i20 = i21;
                        break;
                    }
                    if (xVar != null) {
                        boolean z111 = i17 == true ? 1 : 0;
                        iH4 = i17 == true ? 1 : 0;
                        while (iH4 == 0) {
                            iH4 = xVar.H();
                            iL = xVar.l();
                            i14--;
                        }
                        i17 = iH4 - 1;
                    }
                    jArrCopyOf[i15] = j13;
                    iA = interfaceC0511b.a();
                    iArrCopyOf[i15] = iA;
                    if (iA > i11) {
                        i11 = iA;
                    }
                    jArrCopyOf2[i15] = j11 + ((long) iL);
                    if (xVar2 == null) {
                        i23 = 1;
                    } else {
                        boolean z112 = z11 ? 1 : 0;
                        i23 = z11 ? 1 : 0;
                    }
                    iArrCopyOf2[i15] = i23;
                    if (i15 == iH3) {
                        iArrCopyOf2[i15] = 1;
                        iH2--;
                        if (iH2 > 0) {
                            iH3 = xVar2.H() - 1;
                        }
                    }
                    j11 += (long) iH7;
                    iH6 = i19 - 1;
                    if (iH6 == 0) {
                        iH5 = i18;
                    } else {
                        iH5 = i18;
                    }
                    long j111 = j13 + ((long) iArrCopyOf[i15]);
                    i16 = i21 - 1;
                    i15++;
                    j12 = j111;
                    iB = i22 == true ? 1 : 0;
                }
                long j112 = j11 + ((long) iL);
                while (true) {
                    if (i14 > 0) {
                        z14 = true;
                        break;
                    }
                    if (xVar.H() != 0) {
                        z14 = z11 ? 1 : 0;
                        break;
                    }
                    xVar.l();
                    i14--;
                }
                if (iH2 == 0) {
                    int i212 = lVar.f54514a;
                    if (z14) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb3 = new StringBuilder(str.length() + 262);
                    sb3.append("Inconsistent stbl box for track ");
                    sb3.append(i212);
                    sb3.append(": remainingSynchronizationSamples ");
                    sb3.append(iH2);
                    sb3.append(", remainingSamplesAtTimestampDelta ");
                    sb3.append(i19);
                    sb3.append(", remainingSamplesInChunk ");
                    sb3.append(i20);
                    sb3.append(", remainingTimestampDeltaChanges ");
                    sb3.append(i18);
                    sb3.append(", remainingSamplesAtTimestampOffset ");
                    sb3.append(i17 == true ? 1 : 0 ? 1 : 0);
                    sb3.append(str);
                    p.l(f54367a, sb3.toString());
                } else {
                    int i213 = lVar.f54514a;
                    if (z14) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb4 = new StringBuilder(str.length() + 262);
                    sb4.append("Inconsistent stbl box for track ");
                    sb4.append(i213);
                    sb4.append(": remainingSynchronizationSamples ");
                    sb4.append(iH2);
                    sb4.append(", remainingSamplesAtTimestampDelta ");
                    sb4.append(i19);
                    sb4.append(", remainingSamplesInChunk ");
                    sb4.append(i20);
                    sb4.append(", remainingTimestampDeltaChanges ");
                    sb4.append(i18);
                    sb4.append(", remainingSamplesAtTimestampOffset ");
                    sb4.append(i17 == true ? 1 : 0 ? 1 : 0);
                    sb4.append(str);
                    p.l(f54367a, sb4.toString());
                }
                iArr2 = iArrCopyOf2;
                j10 = j112;
            } else {
                i10 = 1;
                int i214 = aVar.f54378a;
                jArr = new long[i214];
                iArr = new int[i214];
                while (aVar.a()) {
                    int i215 = aVar.f54379b;
                    jArr[i215] = aVar.f54381d;
                    iArr[i215] = aVar.f54380c;
                }
                Format format2 = lVar.f54519f;
                androidx.media2.exoplayer.external.extractor.mp4.d.b bVarA2 = androidx.media2.exoplayer.external.extractor.mp4.d.a(q0.V(format2.f53113p1, format2.Z), jArr, iArr, iH7);
                jArrCopyOf = bVarA2.f54408a;
                iArrCopyOf = bVarA2.f54409b;
                i11 = bVarA2.f54410c;
                jArrCopyOf2 = bVarA2.f54411d;
                iArr2 = bVarA2.f54412e;
                j10 = bVarA2.f54413f;
                iB = iB;
            }
            iArr3 = iArrCopyOf;
            long jI5 = q0.I0(j10, 1000000L, lVar.f54516c);
            if (lVar.f54521h != null) {
            }
            long[] jArr13 = jArrCopyOf2;
            long[] jArr14 = jArrCopyOf;
            int i216 = i11;
            q0.K0(jArr13, 1000000L, lVar.f54516c);
            return new o(lVar, jArr14, iArr3, i216 == true ? 1 : 0, jArr13, iArr2, jI5);
        }
        iH2 = 0;
        xVar6 = xVar7;
        if (eVar.c()) {
            z11 = false;
            if (!"audio/raw".equals(lVar.f54519f.f53103i)) {
            }
            if (z12) {
                jArrCopyOf = new long[iB];
                iArrCopyOf = new int[iB];
                i10 = 1;
                jArrCopyOf2 = new long[iB];
                xVar = xVar8;
                iArrCopyOf2 = new int[iB];
                int i217 = iH8;
                interfaceC0511b = eVar;
                iH3 = i217;
                xVar2 = xVar6;
                i14 = iH;
                i15 = z11 ? 1 : 0;
                iL = i15;
                i11 = iL == true ? 1 : 0;
                i16 = i11 == true ? 1 : 0;
                i17 = i16;
                j11 = 0;
                j12 = 0;
                while (true) {
                    if (i15 < iB) {
                        boolean z113 = iB == true ? 1 : 0;
                        i18 = iH5;
                        i19 = iH6;
                        i20 = i16;
                        break;
                    }
                    j13 = j12;
                    i21 = i16;
                    zA = true;
                    while (i21 == 0) {
                        zA = aVar.a();
                        if (zA) {
                            break;
                            break;
                        }
                        int i218 = iH5;
                        long j113 = aVar.f54381d;
                        i21 = aVar.f54380c;
                        j13 = j113;
                        iH5 = i218;
                        iH6 = iH6;
                        iB = iB == true ? 1 : 0;
                    }
                    i22 = iB;
                    i18 = iH5;
                    i19 = iH6;
                    if (!zA) {
                        p.l(f54367a, "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                        iB = i15;
                        i20 = i21;
                        break;
                    }
                    if (xVar != null) {
                        boolean z114 = i17 == true ? 1 : 0;
                        iH4 = i17 == true ? 1 : 0;
                        while (iH4 == 0) {
                            iH4 = xVar.H();
                            iL = xVar.l();
                            i14--;
                        }
                        i17 = iH4 - 1;
                    }
                    jArrCopyOf[i15] = j13;
                    iA = interfaceC0511b.a();
                    iArrCopyOf[i15] = iA;
                    if (iA > i11) {
                        i11 = iA;
                    }
                    jArrCopyOf2[i15] = j11 + ((long) iL);
                    if (xVar2 == null) {
                        i23 = 1;
                    } else {
                        boolean z115 = z11 ? 1 : 0;
                        i23 = z11 ? 1 : 0;
                    }
                    iArrCopyOf2[i15] = i23;
                    if (i15 == iH3) {
                        iArrCopyOf2[i15] = 1;
                        iH2--;
                        if (iH2 > 0) {
                            iH3 = xVar2.H() - 1;
                        }
                    }
                    j11 += (long) iH7;
                    iH6 = i19 - 1;
                    if (iH6 == 0) {
                        iH5 = i18;
                    } else {
                        iH5 = i18;
                    }
                    long j114 = j13 + ((long) iArrCopyOf[i15]);
                    i16 = i21 - 1;
                    i15++;
                    j12 = j114;
                    iB = i22 == true ? 1 : 0;
                }
                long j115 = j11 + ((long) iL);
                while (true) {
                    if (i14 > 0) {
                        z14 = true;
                        break;
                    }
                    if (xVar.H() != 0) {
                        z14 = z11 ? 1 : 0;
                        break;
                    }
                    xVar.l();
                    i14--;
                }
                if (iH2 == 0) {
                    int i219 = lVar.f54514a;
                    if (z14) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb5 = new StringBuilder(str.length() + 262);
                    sb5.append("Inconsistent stbl box for track ");
                    sb5.append(i219);
                    sb5.append(": remainingSynchronizationSamples ");
                    sb5.append(iH2);
                    sb5.append(", remainingSamplesAtTimestampDelta ");
                    sb5.append(i19);
                    sb5.append(", remainingSamplesInChunk ");
                    sb5.append(i20);
                    sb5.append(", remainingTimestampDeltaChanges ");
                    sb5.append(i18);
                    sb5.append(", remainingSamplesAtTimestampOffset ");
                    sb5.append(i17 == true ? 1 : 0 ? 1 : 0);
                    sb5.append(str);
                    p.l(f54367a, sb5.toString());
                } else {
                    int i2110 = lVar.f54514a;
                    if (z14) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb6 = new StringBuilder(str.length() + 262);
                    sb6.append("Inconsistent stbl box for track ");
                    sb6.append(i2110);
                    sb6.append(": remainingSynchronizationSamples ");
                    sb6.append(iH2);
                    sb6.append(", remainingSamplesAtTimestampDelta ");
                    sb6.append(i19);
                    sb6.append(", remainingSamplesInChunk ");
                    sb6.append(i20);
                    sb6.append(", remainingTimestampDeltaChanges ");
                    sb6.append(i18);
                    sb6.append(", remainingSamplesAtTimestampOffset ");
                    sb6.append(i17 == true ? 1 : 0 ? 1 : 0);
                    sb6.append(str);
                    p.l(f54367a, sb6.toString());
                }
                iArr2 = iArrCopyOf2;
                j10 = j115;
            } else {
                i10 = 1;
                int i2111 = aVar.f54378a;
                jArr = new long[i2111];
                iArr = new int[i2111];
                while (aVar.a()) {
                    int i2112 = aVar.f54379b;
                    jArr[i2112] = aVar.f54381d;
                    iArr[i2112] = aVar.f54380c;
                }
                Format format3 = lVar.f54519f;
                androidx.media2.exoplayer.external.extractor.mp4.d.b bVarA3 = androidx.media2.exoplayer.external.extractor.mp4.d.a(q0.V(format3.f53113p1, format3.Z), jArr, iArr, iH7);
                jArrCopyOf = bVarA3.f54408a;
                iArrCopyOf = bVarA3.f54409b;
                i11 = bVarA3.f54410c;
                jArrCopyOf2 = bVarA3.f54411d;
                iArr2 = bVarA3.f54412e;
                j10 = bVarA3.f54413f;
                iB = iB;
            }
            iArr3 = iArrCopyOf;
            long jI6 = q0.I0(j10, 1000000L, lVar.f54516c);
            if (lVar.f54521h != null) {
            }
            long[] jArr15 = jArrCopyOf2;
            long[] jArr16 = jArrCopyOf;
            int i2113 = i11;
            q0.K0(jArr15, 1000000L, lVar.f54516c);
            return new o(lVar, jArr16, iArr3, i2113 == true ? 1 : 0, jArr15, iArr2, jI6);
        }
        z11 = false;
        boolean z26 = z11 ? 1 : 0;
        z12 = z11 ? 1 : 0;
        if (z12) {
            jArrCopyOf = new long[iB];
            iArrCopyOf = new int[iB];
            i10 = 1;
            jArrCopyOf2 = new long[iB];
            xVar = xVar8;
            iArrCopyOf2 = new int[iB];
            int i2114 = iH8;
            interfaceC0511b = eVar;
            iH3 = i2114;
            xVar2 = xVar6;
            i14 = iH;
            i15 = z11 ? 1 : 0;
            iL = i15;
            i11 = iL == true ? 1 : 0;
            i16 = i11 == true ? 1 : 0;
            i17 = i16;
            j11 = 0;
            j12 = 0;
            while (true) {
                if (i15 < iB) {
                    boolean z116 = iB == true ? 1 : 0;
                    i18 = iH5;
                    i19 = iH6;
                    i20 = i16;
                    break;
                }
                j13 = j12;
                i21 = i16;
                zA = true;
                while (i21 == 0) {
                    zA = aVar.a();
                    if (zA) {
                        break;
                        break;
                    }
                    int i2115 = iH5;
                    long j116 = aVar.f54381d;
                    i21 = aVar.f54380c;
                    j13 = j116;
                    iH5 = i2115;
                    iH6 = iH6;
                    iB = iB == true ? 1 : 0;
                }
                i22 = iB;
                i18 = iH5;
                i19 = iH6;
                if (!zA) {
                    p.l(f54367a, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i15);
                    iB = i15;
                    i20 = i21;
                    break;
                }
                if (xVar != null) {
                    boolean z117 = i17 == true ? 1 : 0;
                    iH4 = i17 == true ? 1 : 0;
                    while (iH4 == 0) {
                        iH4 = xVar.H();
                        iL = xVar.l();
                        i14--;
                    }
                    i17 = iH4 - 1;
                }
                jArrCopyOf[i15] = j13;
                iA = interfaceC0511b.a();
                iArrCopyOf[i15] = iA;
                if (iA > i11) {
                    i11 = iA;
                }
                jArrCopyOf2[i15] = j11 + ((long) iL);
                if (xVar2 == null) {
                    i23 = 1;
                } else {
                    boolean z118 = z11 ? 1 : 0;
                    i23 = z11 ? 1 : 0;
                }
                iArrCopyOf2[i15] = i23;
                if (i15 == iH3) {
                    iArrCopyOf2[i15] = 1;
                    iH2--;
                    if (iH2 > 0) {
                        iH3 = xVar2.H() - 1;
                    }
                }
                j11 += (long) iH7;
                iH6 = i19 - 1;
                if (iH6 == 0) {
                    iH5 = i18;
                } else {
                    iH5 = i18;
                }
                long j117 = j13 + ((long) iArrCopyOf[i15]);
                i16 = i21 - 1;
                i15++;
                j12 = j117;
                iB = i22 == true ? 1 : 0;
            }
            long j118 = j11 + ((long) iL);
            while (true) {
                if (i14 > 0) {
                    z14 = true;
                    break;
                }
                if (xVar.H() != 0) {
                    z14 = z11 ? 1 : 0;
                    break;
                }
                xVar.l();
                i14--;
            }
            if (iH2 == 0) {
                int i2116 = lVar.f54514a;
                if (z14) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb7 = new StringBuilder(str.length() + 262);
                sb7.append("Inconsistent stbl box for track ");
                sb7.append(i2116);
                sb7.append(": remainingSynchronizationSamples ");
                sb7.append(iH2);
                sb7.append(", remainingSamplesAtTimestampDelta ");
                sb7.append(i19);
                sb7.append(", remainingSamplesInChunk ");
                sb7.append(i20);
                sb7.append(", remainingTimestampDeltaChanges ");
                sb7.append(i18);
                sb7.append(", remainingSamplesAtTimestampOffset ");
                sb7.append(i17 == true ? 1 : 0 ? 1 : 0);
                sb7.append(str);
                p.l(f54367a, sb7.toString());
            } else {
                int i2117 = lVar.f54514a;
                if (z14) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb8 = new StringBuilder(str.length() + 262);
                sb8.append("Inconsistent stbl box for track ");
                sb8.append(i2117);
                sb8.append(": remainingSynchronizationSamples ");
                sb8.append(iH2);
                sb8.append(", remainingSamplesAtTimestampDelta ");
                sb8.append(i19);
                sb8.append(", remainingSamplesInChunk ");
                sb8.append(i20);
                sb8.append(", remainingTimestampDeltaChanges ");
                sb8.append(i18);
                sb8.append(", remainingSamplesAtTimestampOffset ");
                sb8.append(i17 == true ? 1 : 0 ? 1 : 0);
                sb8.append(str);
                p.l(f54367a, sb8.toString());
            }
            iArr2 = iArrCopyOf2;
            j10 = j118;
        } else {
            i10 = 1;
            int i2118 = aVar.f54378a;
            jArr = new long[i2118];
            iArr = new int[i2118];
            while (aVar.a()) {
                int i2119 = aVar.f54379b;
                jArr[i2119] = aVar.f54381d;
                iArr[i2119] = aVar.f54380c;
            }
            Format format4 = lVar.f54519f;
            androidx.media2.exoplayer.external.extractor.mp4.d.b bVarA4 = androidx.media2.exoplayer.external.extractor.mp4.d.a(q0.V(format4.f53113p1, format4.Z), jArr, iArr, iH7);
            jArrCopyOf = bVarA4.f54408a;
            iArrCopyOf = bVarA4.f54409b;
            i11 = bVarA4.f54410c;
            jArrCopyOf2 = bVarA4.f54411d;
            iArr2 = bVarA4.f54412e;
            j10 = bVarA4.f54413f;
            iB = iB;
        }
        iArr3 = iArrCopyOf;
        long jI7 = q0.I0(j10, 1000000L, lVar.f54516c);
        if (lVar.f54521h != null) {
        }
        long[] jArr17 = jArrCopyOf2;
        long[] jArr18 = jArrCopyOf;
        int i21110 = i11;
        q0.K0(jArr17, 1000000L, lVar.f54516c);
        return new o(lVar, jArr18, iArr3, i21110 == true ? 1 : 0, jArr17, iArr2, jI7);
    }

    private static c s(x stsd, int trackId, int rotationDegrees, String language, DrmInitData drmInitData, boolean isQuickTime) throws k0 {
        stsd.Q(12);
        int iL = stsd.l();
        c cVar = new c(iL);
        int i10 = 0;
        while (i10 < iL) {
            int iC = stsd.c();
            int iL2 = stsd.l();
            androidx.media2.exoplayer.external.util.a.b(iL2 > 0, "childAtomSize should be positive");
            int iL3 = stsd.l();
            if (iL3 == 1635148593 || iL3 == 1635148595 || iL3 == 1701733238 || iL3 == 1836070006 || iL3 == 1752589105 || iL3 == 1751479857 || iL3 == 1932670515 || iL3 == 1987063864 || iL3 == 1987063865 || iL3 == 1635135537 || iL3 == 1685479798 || iL3 == 1685479729 || iL3 == 1685481573 || iL3 == 1685481521) {
                c cVar2 = cVar;
                int i11 = i10;
                y(stsd, iL3, iC, iL2, trackId, rotationDegrees, drmInitData, cVar2, i11);
                cVar = cVar2;
                i10 = i11;
            } else if (iL3 == 1836069985 || iL3 == 1701733217 || iL3 == 1633889587 || iL3 == 1700998451 || iL3 == 1633889588 || iL3 == 1685353315 || iL3 == 1685353317 || iL3 == 1685353320 || iL3 == 1685353324 || iL3 == 1935764850 || iL3 == 1935767394 || iL3 == 1819304813 || iL3 == 1936684916 || iL3 == 778924083 || iL3 == 1634492771 || iL3 == 1634492791 || iL3 == 1970037111 || iL3 == 1332770163 || iL3 == 1716281667) {
                c cVar3 = cVar;
                d(stsd, iL3, iC, iL2, trackId, language, isQuickTime, drmInitData, cVar3, i10);
                cVar = cVar3;
            } else if (iL3 == 1414810956 || iL3 == 1954034535 || iL3 == 2004251764 || iL3 == 1937010800 || iL3 == 1664495672) {
                t(stsd, iL3, iC, iL2, trackId, language, cVar);
            } else if (iL3 == 1667329389) {
                cVar.f54389b = Format.x(Integer.toString(trackId), "application/x-camera-motion", null, -1, null);
            }
            stsd.Q(iC + iL2);
            i10++;
        }
        return cVar;
    }

    private static void t(x parent, int atomType, int position, int atomSize, int trackId, String language, c out) throws k0 {
        parent.Q(position + 16);
        String str = "application/ttml+xml";
        List listSingletonList = null;
        long j10 = Long.MAX_VALUE;
        if (atomType != 1414810956) {
            if (atomType == 1954034535) {
                int i10 = atomSize - 16;
                byte[] bArr = new byte[i10];
                parent.i(bArr, 0, i10);
                listSingletonList = Collections.singletonList(bArr);
                str = "application/x-quicktime-tx3g";
            } else if (atomType == 2004251764) {
                str = "application/x-mp4-vtt";
            } else if (atomType == 1937010800) {
                j10 = 0;
            } else {
                if (atomType != 1664495672) {
                    throw new IllegalStateException();
                }
                out.f54391d = 1;
                str = "application/x-mp4-cea-608";
            }
        }
        out.f54389b = Format.D(Integer.toString(trackId), str, null, -1, 0, language, -1, null, j10, listSingletonList);
    }

    private static f u(x tkhd) {
        long j10;
        tkhd.Q(8);
        int iC = androidx.media2.exoplayer.external.extractor.mp4.a.c(tkhd.l());
        tkhd.R(iC == 0 ? 8 : 16);
        int iL = tkhd.l();
        tkhd.R(4);
        int iC2 = tkhd.c();
        int i10 = iC == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i12 >= i10) {
                tkhd.R(i10);
                break;
            }
            if (tkhd.f57720a[iC2 + i12] != -1) {
                long jF = iC == 0 ? tkhd.F() : tkhd.I();
                if (jF != 0) {
                    j10 = jF;
                    break;
                }
                break;
            }
            i12++;
        }
        tkhd.R(16);
        int iL2 = tkhd.l();
        int iL3 = tkhd.l();
        tkhd.R(4);
        int iL4 = tkhd.l();
        int iL5 = tkhd.l();
        if (iL2 == 0 && iL3 == 65536 && iL4 == -65536 && iL5 == 0) {
            i11 = 90;
        } else if (iL2 == 0 && iL3 == -65536 && iL4 == 65536 && iL5 == 0) {
            i11 = 270;
        } else if (iL2 == -65536 && iL3 == 0 && iL4 == 0 && iL5 == -65536) {
            i11 = 180;
        }
        return new f(iL, j10, i11);
    }

    public static l v(androidx.media2.exoplayer.external.extractor.mp4.a.C0510a trak, androidx.media2.exoplayer.external.extractor.mp4.a.b mvhd, long duration, DrmInitData drmInitData, boolean ignoreEditLists, boolean isQuickTime) throws k0 {
        long[] jArr;
        long[] jArr2;
        androidx.media2.exoplayer.external.extractor.mp4.a.C0510a c0510aG = trak.g(1835297121);
        int iC = c(i(c0510aG.h(1751411826).f54366m1));
        if (iC == -1) {
            return null;
        }
        f fVarU = u(trak.h(1953196132).f54366m1);
        long j10 = duration == -9223372036854775807L ? fVarU.f54401b : duration;
        long jM = m(mvhd.f54366m1);
        long jI0 = j10 != -9223372036854775807L ? q0.I0(j10, 1000000L, jM) : -9223372036854775807L;
        androidx.media2.exoplayer.external.extractor.mp4.a.C0510a c0510aG2 = c0510aG.g(1835626086).g(1937007212);
        Pair<Long, String> pairK = k(c0510aG.h(1835296868).f54366m1);
        c cVarS = s(c0510aG2.h(1937011556).f54366m1, fVarU.f54400a, fVarU.f54402c, (String) pairK.second, drmInitData, isQuickTime);
        if (ignoreEditLists) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> pairF = f(trak.g(1701082227));
            long[] jArr3 = (long[]) pairF.first;
            jArr2 = (long[]) pairF.second;
            jArr = jArr3;
        }
        if (cVarS.f54389b == null) {
            return null;
        }
        return new l(fVarU.f54400a, iC, ((Long) pairK.first).longValue(), jM, jI0, cVarS.f54389b, cVarS.f54391d, cVarS.f54388a, cVarS.f54390c, jArr, jArr2);
    }

    @p0
    public static Metadata w(androidx.media2.exoplayer.external.extractor.mp4.a.b udtaAtom, boolean isQuickTime) {
        if (isQuickTime) {
            return null;
        }
        x xVar = udtaAtom.f54366m1;
        xVar.Q(8);
        while (xVar.a() >= 8) {
            int iC = xVar.c();
            int iL = xVar.l();
            if (xVar.l() == 1835365473) {
                xVar.Q(iC);
                return x(xVar, iC + iL);
            }
            xVar.Q(iC + iL);
        }
        return null;
    }

    @p0
    private static Metadata x(x meta, int limit) {
        meta.R(12);
        while (meta.c() < limit) {
            int iC = meta.c();
            int iL = meta.l();
            if (meta.l() == 1768715124) {
                meta.Q(iC);
                return j(meta, iC + iL);
            }
            meta.Q(iC + iL);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x017c A[PHI: r15
      0x017c: PHI (r15v13 int) = (r15v12 int), (r15v14 int) binds: [B:85:0x0171, B:87:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    private static void y(x parent, int atomType, int position, int size, int trackId, int rotationDegrees, DrmInitData drmInitData, c out, int entryIndex) throws k0 {
        String str;
        List<byte[]> list;
        DrmInitData drmInitDataC = drmInitData;
        parent.Q(position + 16);
        parent.R(16);
        int iJ = parent.J();
        int iJ2 = parent.J();
        parent.R(50);
        int iC = parent.c();
        String str2 = null;
        int iIntValue = atomType;
        if (iIntValue == 1701733238) {
            Pair<Integer, m> pairP = p(parent, position, size);
            if (pairP != null) {
                iIntValue = ((Integer) pairP.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((m) pairP.second).f54527b);
                out.f54388a[entryIndex] = (m) pairP.second;
            }
            parent.Q(iC);
        }
        DrmInitData drmInitData2 = drmInitDataC;
        float fN = 1.0f;
        String str3 = null;
        List<byte[]> listSingletonList = null;
        byte[] bArrO = null;
        int i10 = -1;
        boolean z10 = false;
        while (iC - position < size) {
            parent.Q(iC);
            int iC2 = parent.c();
            int iL = parent.l();
            if (iL == 0 && parent.c() - position == size) {
                break;
            }
            androidx.media2.exoplayer.external.util.a.b(iL > 0, "childAtomSize should be positive");
            int iL2 = parent.l();
            if (iL2 == 1635148611) {
                androidx.media2.exoplayer.external.util.a.i(str3 == null);
                parent.Q(iC2 + 8);
                androidx.media2.exoplayer.external.video.a aVarB = androidx.media2.exoplayer.external.video.a.b(parent);
                list = aVarB.f57750a;
                out.f54390c = aVarB.f57751b;
                if (!z10) {
                    fN = aVarB.f57754e;
                }
                str = "video/avc";
            } else {
                if (iL2 == 1752589123) {
                    androidx.media2.exoplayer.external.util.a.i(str3 == null);
                    parent.Q(iC2 + 8);
                    androidx.media2.exoplayer.external.video.c cVarA = androidx.media2.exoplayer.external.video.c.a(parent);
                    list = cVarA.f57758a;
                    out.f54390c = cVarA.f57759b;
                    str = "video/hevc";
                } else if (iL2 == 1685480259 || iL2 == 1685485123) {
                    androidx.media2.exoplayer.external.video.b bVarA = androidx.media2.exoplayer.external.video.b.a(parent);
                    if (bVarA != null) {
                        str2 = bVarA.f57757c;
                        str3 = "video/dolby-vision";
                    }
                } else {
                    if (iL2 == 1987076931) {
                        androidx.media2.exoplayer.external.util.a.i(str3 == null);
                        str = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (iL2 == 1635135811) {
                        androidx.media2.exoplayer.external.util.a.i(str3 == null);
                        str = "video/av01";
                    } else if (iL2 == 1681012275) {
                        androidx.media2.exoplayer.external.util.a.i(str3 == null);
                        str = "video/3gpp";
                    } else if (iL2 == 1702061171) {
                        androidx.media2.exoplayer.external.util.a.i(str3 == null);
                        Pair<String, byte[]> pairG = g(parent, iC2);
                        str3 = (String) pairG.first;
                        listSingletonList = Collections.singletonList((byte[]) pairG.second);
                    } else if (iL2 == 1885434736) {
                        fN = n(parent, iC2);
                        z10 = true;
                    } else if (iL2 == 1937126244) {
                        bArrO = o(parent, iC2, iL);
                    } else if (iL2 == 1936995172) {
                        int iD = parent.D();
                        parent.R(3);
                        if (iD == 0) {
                            int iD2 = parent.D();
                            if (iD2 != 0) {
                                int i11 = 1;
                                if (iD2 != 1) {
                                    i11 = 2;
                                    if (iD2 == 2) {
                                        i10 = i11;
                                    } else if (iD2 == 3) {
                                        i10 = 3;
                                    }
                                } else {
                                    i10 = i11;
                                }
                            } else {
                                i10 = 0;
                            }
                        }
                    }
                    str3 = str;
                }
                iC += iL;
            }
            listSingletonList = list;
            str3 = str;
            iC += iL;
        }
        if (str3 == null) {
            return;
        }
        out.f54389b = Format.I(Integer.toString(trackId), str3, str2, -1, -1, iJ, iJ2, -1.0f, listSingletonList, rotationDegrees, fN, bArrO, i10, null, drmInitData2);
    }
}

package androidx.media2.exoplayer.external.extractor.mp4;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.id3.ApicFrame;
import androidx.media2.exoplayer.external.metadata.id3.CommentFrame;
import androidx.media2.exoplayer.external.metadata.id3.Id3Frame;
import androidx.media2.exoplayer.external.metadata.id3.InternalFrame;
import androidx.media2.exoplayer.external.metadata.id3.TextInformationFrame;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.x;
import androidx.media3.common.s0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class g {
    private static final int A = 1885823344;
    private static final int B = 1936683886;
    private static final int C = 1953919848;
    private static final int D = 757935405;
    private static final int E = 3;
    private static final String[] F = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", com.google.common.net.d.L0, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    private static final String G = "und";
    private static final int H = 169;
    private static final int I = 253;
    private static final String J = "com.android.capture.fps";
    private static final int K = 23;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54452a = "MetadataUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f54453b = 7233901;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f54454c = 7631467;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f54455d = 6516084;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f54456e = 6578553;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f54457f = 4280916;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f54458g = 7630703;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54459h = 6384738;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f54460i = 6516589;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54461j = 7828084;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f54462k = 7108978;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54463l = 6776174;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f54464m = 1668249202;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f54465n = 1735291493;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f54466o = 6779504;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f54467p = 1684632427;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f54468q = 1953655662;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f54469r = 1953329263;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f54470s = 1668311404;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f54471t = 1631670868;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f54472u = 1936682605;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f54473v = 1936679276;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f54474w = 1936679282;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f54475x = 1936679265;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f54476y = 1936679791;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f54477z = 1920233063;

    private g() {
    }

    public static Format a(int trackType, Format format, @p0 Metadata udtaMetadata, @p0 Metadata mdtaMetadata, androidx.media2.exoplayer.external.extractor.m gaplessInfoHolder) {
        if (trackType == 1) {
            if (gaplessInfoHolder.a()) {
                format = format.h(gaplessInfoHolder.f54081a, gaplessInfoHolder.f54082b);
            }
            return udtaMetadata != null ? format.k(udtaMetadata) : format;
        }
        if (trackType == 2 && mdtaMetadata != null) {
            for (int i10 = 0; i10 < mdtaMetadata.e(); i10++) {
                Metadata.Entry entryC = mdtaMetadata.c(i10);
                if (entryC instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryC;
                    if ("com.android.capture.fps".equals(mdtaMetadataEntry.f54295a) && mdtaMetadataEntry.f54298d == 23) {
                        try {
                            format = format.g(ByteBuffer.wrap(mdtaMetadataEntry.f54296b).asFloatBuffer().get()).k(new Metadata(mdtaMetadataEntry));
                        } catch (NumberFormatException unused) {
                            p.l(f54452a, "Ignoring invalid framerate");
                        }
                    }
                }
            }
        }
        return format;
    }

    @p0
    private static CommentFrame b(int type, x data) {
        int iL = data.l();
        if (data.l() == 1684108385) {
            data.R(8);
            String strY = data.y(iL - 16);
            return new CommentFrame("und", strY, strY);
        }
        String strValueOf = String.valueOf(a.a(type));
        p.l(f54452a, strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    @p0
    private static ApicFrame c(x data) {
        String str;
        int iL = data.l();
        if (data.l() != 1684108385) {
            p.l(f54452a, "Failed to parse cover art attribute");
            return null;
        }
        int iB = a.b(data.l());
        if (iB == 13) {
            str = "image/jpeg";
        } else {
            str = iB == 14 ? s0.X0 : null;
        }
        if (str == null) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unrecognized cover art flags: ");
            sb2.append(iB);
            p.l(f54452a, sb2.toString());
            return null;
        }
        data.R(4);
        int i10 = iL - 16;
        byte[] bArr = new byte[i10];
        data.i(bArr, 0, i10);
        return new ApicFrame(str, null, 3, bArr);
    }

    @p0
    public static Metadata.Entry d(x ilst) {
        int iC = ilst.c() + ilst.l();
        int iL = ilst.l();
        int i10 = (iL >> 24) & 255;
        try {
            if (i10 == H || i10 == 253) {
                int i11 = 16777215 & iL;
                if (i11 == f54455d) {
                    CommentFrame commentFrameB = b(iL, ilst);
                    ilst.Q(iC);
                    return commentFrameB;
                }
                if (i11 == f54453b || i11 == f54454c) {
                    TextInformationFrame textInformationFrameI = i(iL, "TIT2", ilst);
                    ilst.Q(iC);
                    return textInformationFrameI;
                }
                if (i11 != f54460i && i11 != f54461j) {
                    if (i11 == f54456e) {
                        TextInformationFrame textInformationFrameI2 = i(iL, "TDRC", ilst);
                        ilst.Q(iC);
                        return textInformationFrameI2;
                    }
                    if (i11 == f54457f) {
                        TextInformationFrame textInformationFrameI3 = i(iL, "TPE1", ilst);
                        ilst.Q(iC);
                        return textInformationFrameI3;
                    }
                    if (i11 == f54458g) {
                        TextInformationFrame textInformationFrameI4 = i(iL, "TSSE", ilst);
                        ilst.Q(iC);
                        return textInformationFrameI4;
                    }
                    if (i11 == f54459h) {
                        TextInformationFrame textInformationFrameI5 = i(iL, "TALB", ilst);
                        ilst.Q(iC);
                        return textInformationFrameI5;
                    }
                    if (i11 == f54462k) {
                        TextInformationFrame textInformationFrameI6 = i(iL, "USLT", ilst);
                        ilst.Q(iC);
                        return textInformationFrameI6;
                    }
                    if (i11 == f54463l) {
                        TextInformationFrame textInformationFrameI7 = i(iL, "TCON", ilst);
                        ilst.Q(iC);
                        return textInformationFrameI7;
                    }
                    if (i11 == f54466o) {
                        TextInformationFrame textInformationFrameI8 = i(iL, "TIT1", ilst);
                        ilst.Q(iC);
                        return textInformationFrameI8;
                    }
                }
                TextInformationFrame textInformationFrameI9 = i(iL, "TCOM", ilst);
                ilst.Q(iC);
                return textInformationFrameI9;
            }
            if (iL == f54465n) {
                TextInformationFrame textInformationFrameH = h(ilst);
                ilst.Q(iC);
                return textInformationFrameH;
            }
            if (iL == f54467p) {
                TextInformationFrame textInformationFrameE = e(iL, "TPOS", ilst);
                ilst.Q(iC);
                return textInformationFrameE;
            }
            if (iL == f54468q) {
                TextInformationFrame textInformationFrameE2 = e(iL, "TRCK", ilst);
                ilst.Q(iC);
                return textInformationFrameE2;
            }
            if (iL == f54469r) {
                Id3Frame id3FrameJ = j(iL, "TBPM", ilst, true, false);
                ilst.Q(iC);
                return id3FrameJ;
            }
            if (iL == f54470s) {
                Id3Frame id3FrameJ2 = j(iL, "TCMP", ilst, true, true);
                ilst.Q(iC);
                return id3FrameJ2;
            }
            if (iL == f54464m) {
                ApicFrame apicFrameC = c(ilst);
                ilst.Q(iC);
                return apicFrameC;
            }
            if (iL == f54471t) {
                TextInformationFrame textInformationFrameI10 = i(iL, "TPE2", ilst);
                ilst.Q(iC);
                return textInformationFrameI10;
            }
            if (iL == f54472u) {
                TextInformationFrame textInformationFrameI11 = i(iL, "TSOT", ilst);
                ilst.Q(iC);
                return textInformationFrameI11;
            }
            if (iL == f54473v) {
                TextInformationFrame textInformationFrameI12 = i(iL, "TSO2", ilst);
                ilst.Q(iC);
                return textInformationFrameI12;
            }
            if (iL == f54474w) {
                TextInformationFrame textInformationFrameI13 = i(iL, "TSOA", ilst);
                ilst.Q(iC);
                return textInformationFrameI13;
            }
            if (iL == f54475x) {
                TextInformationFrame textInformationFrameI14 = i(iL, "TSOP", ilst);
                ilst.Q(iC);
                return textInformationFrameI14;
            }
            if (iL == f54476y) {
                TextInformationFrame textInformationFrameI15 = i(iL, "TSOC", ilst);
                ilst.Q(iC);
                return textInformationFrameI15;
            }
            if (iL == f54477z) {
                Id3Frame id3FrameJ3 = j(iL, "ITUNESADVISORY", ilst, false, false);
                ilst.Q(iC);
                return id3FrameJ3;
            }
            if (iL == A) {
                Id3Frame id3FrameJ4 = j(iL, "ITUNESGAPLESS", ilst, false, true);
                ilst.Q(iC);
                return id3FrameJ4;
            }
            if (iL == B) {
                TextInformationFrame textInformationFrameI16 = i(iL, "TVSHOWSORT", ilst);
                ilst.Q(iC);
                return textInformationFrameI16;
            }
            if (iL == C) {
                TextInformationFrame textInformationFrameI17 = i(iL, "TVSHOW", ilst);
                ilst.Q(iC);
                return textInformationFrameI17;
            }
            if (iL == D) {
                Id3Frame id3FrameF = f(ilst, iC);
                ilst.Q(iC);
                return id3FrameF;
            }
            String strValueOf = String.valueOf(a.a(iL));
            p.b(f54452a, strValueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(strValueOf) : new String("Skipped unknown metadata entry: "));
            ilst.Q(iC);
            return null;
        } catch (Throwable th2) {
            ilst.Q(iC);
            throw th2;
        }
    }

    @p0
    private static TextInformationFrame e(int type, String attributeName, x data) {
        int iL = data.l();
        if (data.l() == 1684108385 && iL >= 22) {
            data.R(10);
            int iJ = data.J();
            if (iJ > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(iJ);
                String string = sb2.toString();
                int iJ2 = data.J();
                if (iJ2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 12);
                    sb3.append(strValueOf);
                    sb3.append("/");
                    sb3.append(iJ2);
                    string = sb3.toString();
                }
                return new TextInformationFrame(attributeName, null, string);
            }
        }
        String strValueOf2 = String.valueOf(a.a(type));
        p.l(f54452a, strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    @p0
    private static Id3Frame f(x data, int endPosition) {
        String strY = null;
        String strY2 = null;
        int i10 = -1;
        int i11 = -1;
        while (data.c() < endPosition) {
            int iC = data.c();
            int iL = data.l();
            int iL2 = data.l();
            int i12 = 6 | 4;
            data.R(4);
            if (iL2 == 1835360622) {
                strY = data.y(iL - 12);
            } else if (iL2 == 1851878757) {
                strY2 = data.y(iL - 12);
            } else {
                if (iL2 == 1684108385) {
                    i10 = iC;
                    i11 = iL;
                }
                data.R(iL - 12);
            }
        }
        if (strY == null || strY2 == null || i10 == -1) {
            return null;
        }
        data.Q(i10);
        data.R(16);
        return new InternalFrame(strY, strY2, data.y(i11 - 16));
    }

    @p0
    public static MdtaMetadataEntry g(x ilst, int endPosition, String key) {
        while (true) {
            int iC = ilst.c();
            if (iC >= endPosition) {
                return null;
            }
            int iL = ilst.l();
            if (ilst.l() == 1684108385) {
                int iL2 = ilst.l();
                int iL3 = ilst.l();
                int i10 = iL - 16;
                byte[] bArr = new byte[i10];
                ilst.i(bArr, 0, i10);
                return new MdtaMetadataEntry(key, bArr, iL3, iL2);
            }
            ilst.Q(iC + iL);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    @p0
    private static TextInformationFrame h(x data) {
        String str;
        int iK = k(data);
        if (iK > 0) {
            String[] strArr = F;
            if (iK <= strArr.length) {
                str = strArr[iK - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        p.l(f54452a, "Failed to parse standard genre code");
        return null;
    }

    @p0
    private static TextInformationFrame i(int type, String id2, x data) {
        int iL = data.l();
        if (data.l() == 1684108385) {
            data.R(8);
            return new TextInformationFrame(id2, null, data.y(iL - 16));
        }
        String strValueOf = String.valueOf(a.a(type));
        p.l(f54452a, strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    @p0
    private static Id3Frame j(int type, String id2, x data, boolean isTextInformationFrame, boolean isBoolean) {
        int iK = k(data);
        if (isBoolean) {
            int i10 = 4 ^ 1;
            iK = Math.min(1, iK);
        }
        if (iK >= 0) {
            return isTextInformationFrame ? new TextInformationFrame(id2, null, Integer.toString(iK)) : new CommentFrame("und", id2, Integer.toString(iK));
        }
        String strValueOf = String.valueOf(a.a(type));
        p.l(f54452a, strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int k(x data) {
        data.R(4);
        if (data.l() == 1684108385) {
            data.R(8);
            return data.D();
        }
        p.l(f54452a, "Failed to parse uint8 attribute value");
        return -1;
    }
}

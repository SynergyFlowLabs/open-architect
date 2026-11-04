package androidx.media2.exoplayer.external;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f53091k3 = -1;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final long f53092l3 = Long.MAX_VALUE;
    public final int H1;

    @androidx.annotation.p0
    public final byte[] X;

    @androidx.annotation.p0
    public final ColorInfo Y;
    public final int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f53093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f53094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f53098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    public final Metadata f53099g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f53100g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f53101h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public final int f53102h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f53103i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @androidx.annotation.p0
    public final Class<? extends androidx.media2.exoplayer.external.drm.t> f53104i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f53105j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f53106j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<byte[]> f53107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    public final DrmInitData f53108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f53109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f53110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f53111o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f53112p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final int f53113p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public final int f53114p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f53115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f53116t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f53117v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f53118w;

    class a implements Parcelable.Creator<Format> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Format createFromParcel(Parcel in) {
            return new Format(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Format[] newArray(int size) {
            return new Format[size];
        }
    }

    Format(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String label, int selectionFlags, int roleFlags, int bitrate, @androidx.annotation.p0 String codecs, @androidx.annotation.p0 Metadata metadata, @androidx.annotation.p0 String containerMimeType, @androidx.annotation.p0 String sampleMimeType, int maxInputSize, @androidx.annotation.p0 List<byte[]> initializationData, @androidx.annotation.p0 DrmInitData drmInitData, long subsampleOffsetUs, int width, int height, float frameRate, int rotationDegrees, float pixelWidthHeightRatio, @androidx.annotation.p0 byte[] projectionData, int stereoMode, @androidx.annotation.p0 ColorInfo colorInfo, int channelCount, int sampleRate, int pcmEncoding, int encoderDelay, int encoderPadding, @androidx.annotation.p0 String language, int accessibilityChannel, @androidx.annotation.p0 Class<? extends androidx.media2.exoplayer.external.drm.t> exoMediaCryptoType) {
        this.f53093a = id2;
        this.f53094b = label;
        this.f53095c = selectionFlags;
        this.f53096d = roleFlags;
        this.f53097e = bitrate;
        this.f53098f = codecs;
        this.f53099g = metadata;
        this.f53101h = containerMimeType;
        this.f53103i = sampleMimeType;
        this.f53105j = maxInputSize;
        this.f53107k = initializationData == null ? Collections.EMPTY_LIST : initializationData;
        this.f53108l = drmInitData;
        this.f53109m = subsampleOffsetUs;
        this.f53110n = width;
        this.f53111o = height;
        this.f53115s = frameRate;
        int i10 = rotationDegrees;
        this.f53116t = i10 == -1 ? 0 : i10;
        this.f53117v = pixelWidthHeightRatio == -1.0f ? 1.0f : pixelWidthHeightRatio;
        this.X = projectionData;
        this.f53118w = stereoMode;
        this.Y = colorInfo;
        this.Z = channelCount;
        this.f53112p0 = sampleRate;
        this.f53113p1 = pcmEncoding;
        int i11 = encoderDelay;
        this.H1 = i11 == -1 ? 0 : i11;
        this.f53114p2 = encoderPadding != -1 ? encoderPadding : 0;
        this.f53100g3 = androidx.media2.exoplayer.external.util.q0.x0(language);
        this.f53102h3 = accessibilityChannel;
        this.f53104i3 = exoMediaCryptoType;
    }

    public static Format A(@androidx.annotation.p0 String id2, String sampleMimeType, int selectionFlags, @androidx.annotation.p0 String language) {
        return B(id2, sampleMimeType, selectionFlags, language, null);
    }

    public static Format B(@androidx.annotation.p0 String id2, String sampleMimeType, int selectionFlags, @androidx.annotation.p0 String language, @androidx.annotation.p0 DrmInitData drmInitData) {
        return D(id2, sampleMimeType, null, -1, selectionFlags, language, -1, drmInitData, Long.MAX_VALUE, Collections.EMPTY_LIST);
    }

    public static Format C(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int selectionFlags, @androidx.annotation.p0 String language, int accessibilityChannel, @androidx.annotation.p0 DrmInitData drmInitData) {
        return D(id2, sampleMimeType, codecs, bitrate, selectionFlags, language, accessibilityChannel, drmInitData, Long.MAX_VALUE, Collections.EMPTY_LIST);
    }

    public static Format D(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int selectionFlags, @androidx.annotation.p0 String language, int accessibilityChannel, @androidx.annotation.p0 DrmInitData drmInitData, long subsampleOffsetUs, List<byte[]> initializationData) {
        return new Format(id2, null, selectionFlags, 0, bitrate, codecs, null, null, sampleMimeType, -1, initializationData, drmInitData, subsampleOffsetUs, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, language, accessibilityChannel, null);
    }

    public static Format E(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int selectionFlags, @androidx.annotation.p0 String language, @androidx.annotation.p0 DrmInitData drmInitData, long subsampleOffsetUs) {
        return D(id2, sampleMimeType, codecs, bitrate, selectionFlags, language, -1, drmInitData, subsampleOffsetUs, Collections.EMPTY_LIST);
    }

    @Deprecated
    public static Format F(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String containerMimeType, String sampleMimeType, String codecs, int bitrate, int width, int height, float frameRate, @androidx.annotation.p0 List<byte[]> initializationData, int selectionFlags) {
        return G(id2, null, containerMimeType, sampleMimeType, codecs, null, bitrate, width, height, frameRate, initializationData, selectionFlags, 0);
    }

    public static Format G(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String label, @androidx.annotation.p0 String containerMimeType, String sampleMimeType, String codecs, @androidx.annotation.p0 Metadata metadata, int bitrate, int width, int height, float frameRate, @androidx.annotation.p0 List<byte[]> initializationData, int selectionFlags, int roleFlags) {
        return new Format(id2, label, selectionFlags, roleFlags, bitrate, codecs, metadata, containerMimeType, sampleMimeType, -1, initializationData, null, Long.MAX_VALUE, width, height, frameRate, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format H(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int maxInputSize, int width, int height, float frameRate, @androidx.annotation.p0 List<byte[]> initializationData, int rotationDegrees, float pixelWidthHeightRatio, @androidx.annotation.p0 DrmInitData drmInitData) {
        return I(id2, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, initializationData, rotationDegrees, pixelWidthHeightRatio, null, -1, null, drmInitData);
    }

    public static Format I(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int maxInputSize, int width, int height, float frameRate, @androidx.annotation.p0 List<byte[]> initializationData, int rotationDegrees, float pixelWidthHeightRatio, byte[] projectionData, int stereoMode, @androidx.annotation.p0 ColorInfo colorInfo, @androidx.annotation.p0 DrmInitData drmInitData) {
        return new Format(id2, null, 0, 0, bitrate, codecs, null, null, sampleMimeType, maxInputSize, initializationData, drmInitData, Long.MAX_VALUE, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format J(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int maxInputSize, int width, int height, float frameRate, @androidx.annotation.p0 List<byte[]> initializationData, @androidx.annotation.p0 DrmInitData drmInitData) {
        return H(id2, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, initializationData, -1, -1.0f, drmInitData);
    }

    public static String M(@androidx.annotation.p0 Format format) {
        if (format == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(format.f53093a);
        sb2.append(", mimeType=");
        sb2.append(format.f53103i);
        if (format.f53097e != -1) {
            sb2.append(", bitrate=");
            sb2.append(format.f53097e);
        }
        if (format.f53098f != null) {
            sb2.append(", codecs=");
            sb2.append(format.f53098f);
        }
        if (format.f53110n != -1 && format.f53111o != -1) {
            sb2.append(", res=");
            sb2.append(format.f53110n);
            sb2.append("x");
            sb2.append(format.f53111o);
        }
        if (format.f53115s != -1.0f) {
            sb2.append(", fps=");
            sb2.append(format.f53115s);
        }
        if (format.Z != -1) {
            sb2.append(", channels=");
            sb2.append(format.Z);
        }
        if (format.f53112p0 != -1) {
            sb2.append(", sample_rate=");
            sb2.append(format.f53112p0);
        }
        if (format.f53100g3 != null) {
            sb2.append(", language=");
            sb2.append(format.f53100g3);
        }
        if (format.f53094b != null) {
            sb2.append(", label=");
            sb2.append(format.f53094b);
        }
        return sb2.toString();
    }

    @Deprecated
    public static Format o(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String containerMimeType, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int channelCount, int sampleRate, @androidx.annotation.p0 List<byte[]> initializationData, int selectionFlags, @androidx.annotation.p0 String language) {
        return p(id2, null, containerMimeType, sampleMimeType, codecs, null, bitrate, channelCount, sampleRate, initializationData, selectionFlags, 0, language);
    }

    public static Format p(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String label, @androidx.annotation.p0 String containerMimeType, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, @androidx.annotation.p0 Metadata metadata, int bitrate, int channelCount, int sampleRate, @androidx.annotation.p0 List<byte[]> initializationData, int selectionFlags, int roleFlags, @androidx.annotation.p0 String language) {
        return new Format(id2, label, selectionFlags, roleFlags, bitrate, codecs, metadata, containerMimeType, sampleMimeType, -1, initializationData, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, channelCount, sampleRate, -1, -1, -1, language, -1, null);
    }

    public static Format q(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int maxInputSize, int channelCount, int sampleRate, int pcmEncoding, int encoderDelay, int encoderPadding, @androidx.annotation.p0 List<byte[]> initializationData, @androidx.annotation.p0 DrmInitData drmInitData, int selectionFlags, @androidx.annotation.p0 String language, @androidx.annotation.p0 Metadata metadata) {
        return new Format(id2, null, selectionFlags, 0, bitrate, codecs, metadata, null, sampleMimeType, maxInputSize, initializationData, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, language, -1, null);
    }

    public static Format r(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int maxInputSize, int channelCount, int sampleRate, int pcmEncoding, @androidx.annotation.p0 List<byte[]> initializationData, @androidx.annotation.p0 DrmInitData drmInitData, int selectionFlags, @androidx.annotation.p0 String language) {
        return q(id2, sampleMimeType, codecs, bitrate, maxInputSize, channelCount, sampleRate, pcmEncoding, -1, -1, initializationData, drmInitData, selectionFlags, language, null);
    }

    public static Format s(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int maxInputSize, int channelCount, int sampleRate, @androidx.annotation.p0 List<byte[]> initializationData, @androidx.annotation.p0 DrmInitData drmInitData, int selectionFlags, @androidx.annotation.p0 String language) {
        return r(id2, sampleMimeType, codecs, bitrate, maxInputSize, channelCount, sampleRate, -1, initializationData, drmInitData, selectionFlags, language);
    }

    @Deprecated
    public static Format t(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String containerMimeType, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int selectionFlags, @androidx.annotation.p0 String language) {
        return u(id2, null, containerMimeType, sampleMimeType, codecs, bitrate, selectionFlags, 0, language);
    }

    public static Format u(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String label, @androidx.annotation.p0 String containerMimeType, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int selectionFlags, int roleFlags, @androidx.annotation.p0 String language) {
        return new Format(id2, label, selectionFlags, roleFlags, bitrate, codecs, null, containerMimeType, sampleMimeType, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, language, -1, null);
    }

    public static Format v(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int selectionFlags, @androidx.annotation.p0 List<byte[]> initializationData, @androidx.annotation.p0 String language, @androidx.annotation.p0 DrmInitData drmInitData) {
        return new Format(id2, null, selectionFlags, 0, bitrate, codecs, null, null, sampleMimeType, -1, initializationData, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, language, -1, null);
    }

    public static Format w(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, long subsampleOffsetUs) {
        return new Format(id2, null, 0, 0, -1, null, null, null, sampleMimeType, -1, null, null, subsampleOffsetUs, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format x(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, @androidx.annotation.p0 DrmInitData drmInitData) {
        return new Format(id2, null, 0, 0, bitrate, codecs, null, null, sampleMimeType, -1, null, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format y(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String label, @androidx.annotation.p0 String containerMimeType, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int selectionFlags, int roleFlags, @androidx.annotation.p0 String language) {
        return z(id2, label, containerMimeType, sampleMimeType, codecs, bitrate, selectionFlags, roleFlags, language, -1);
    }

    public static Format z(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String label, @androidx.annotation.p0 String containerMimeType, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, int bitrate, int selectionFlags, int roleFlags, @androidx.annotation.p0 String language, int accessibilityChannel) {
        return new Format(id2, label, selectionFlags, roleFlags, bitrate, codecs, null, containerMimeType, sampleMimeType, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, language, accessibilityChannel, null);
    }

    public int K() {
        int i10;
        int i11 = this.f53110n;
        if (i11 != -1 && (i10 = this.f53111o) != -1) {
            return i11 * i10;
        }
        return -1;
    }

    public boolean L(Format other) {
        if (this.f53107k.size() != other.f53107k.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f53107k.size(); i10++) {
            if (!Arrays.equals(this.f53107k.get(i10), other.f53107k.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public Format a(@androidx.annotation.p0 DrmInitData drmInitData, @androidx.annotation.p0 Metadata metadata) {
        Metadata metadata2;
        if (drmInitData == this.f53108l) {
            metadata2 = metadata;
            if (metadata2 == this.f53099g) {
                return this;
            }
        } else {
            metadata2 = metadata;
        }
        return new Format(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53098f, metadata2, this.f53101h, this.f53103i, this.f53105j, this.f53107k, drmInitData, this.f53109m, this.f53110n, this.f53111o, this.f53115s, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, this.f53100g3, this.f53102h3, this.f53104i3);
    }

    public Format b(int bitrate) {
        return new Format(this.f53093a, this.f53094b, this.f53095c, this.f53096d, bitrate, this.f53098f, this.f53099g, this.f53101h, this.f53103i, this.f53105j, this.f53107k, this.f53108l, this.f53109m, this.f53110n, this.f53111o, this.f53115s, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, this.f53100g3, this.f53102h3, this.f53104i3);
    }

    public Format c(@androidx.annotation.p0 String id2, @androidx.annotation.p0 String label, @androidx.annotation.p0 String sampleMimeType, @androidx.annotation.p0 String codecs, @androidx.annotation.p0 Metadata metadata, int bitrate, int width, int height, int channelCount, int selectionFlags, @androidx.annotation.p0 String language) {
        Metadata metadata2 = this.f53099g;
        return new Format(id2, label, selectionFlags, this.f53096d, bitrate, codecs, metadata2 != null ? metadata2.b(metadata) : metadata, this.f53101h, sampleMimeType, this.f53105j, this.f53107k, this.f53108l, this.f53109m, width, height, this.f53115s, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, channelCount, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, language, this.f53102h3, this.f53104i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Format e(@androidx.annotation.p0 DrmInitData drmInitData) {
        return a(drmInitData, this.f53099g);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && Format.class == obj.getClass()) {
            Format format = (Format) obj;
            int i11 = this.f53106j3;
            if ((i11 == 0 || (i10 = format.f53106j3) == 0 || i11 == i10) && this.f53095c == format.f53095c && this.f53096d == format.f53096d && this.f53097e == format.f53097e && this.f53105j == format.f53105j && this.f53109m == format.f53109m && this.f53110n == format.f53110n && this.f53111o == format.f53111o && this.f53116t == format.f53116t && this.f53118w == format.f53118w && this.Z == format.Z && this.f53112p0 == format.f53112p0 && this.f53113p1 == format.f53113p1 && this.H1 == format.H1 && this.f53114p2 == format.f53114p2 && this.f53102h3 == format.f53102h3 && Float.compare(this.f53115s, format.f53115s) == 0 && Float.compare(this.f53117v, format.f53117v) == 0 && androidx.media2.exoplayer.external.util.q0.b(this.f53104i3, format.f53104i3) && androidx.media2.exoplayer.external.util.q0.b(this.f53093a, format.f53093a) && androidx.media2.exoplayer.external.util.q0.b(this.f53094b, format.f53094b) && androidx.media2.exoplayer.external.util.q0.b(this.f53098f, format.f53098f) && androidx.media2.exoplayer.external.util.q0.b(this.f53101h, format.f53101h) && androidx.media2.exoplayer.external.util.q0.b(this.f53103i, format.f53103i) && androidx.media2.exoplayer.external.util.q0.b(this.f53100g3, format.f53100g3) && Arrays.equals(this.X, format.X) && androidx.media2.exoplayer.external.util.q0.b(this.f53099g, format.f53099g) && androidx.media2.exoplayer.external.util.q0.b(this.Y, format.Y) && androidx.media2.exoplayer.external.util.q0.b(this.f53108l, format.f53108l) && L(format)) {
                return true;
            }
        }
        return false;
    }

    public Format f(Class<? extends androidx.media2.exoplayer.external.drm.t> exoMediaCryptoType) {
        return new Format(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53098f, this.f53099g, this.f53101h, this.f53103i, this.f53105j, this.f53107k, this.f53108l, this.f53109m, this.f53110n, this.f53111o, this.f53115s, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, this.f53100g3, this.f53102h3, exoMediaCryptoType);
    }

    public Format g(float frameRate) {
        return new Format(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53098f, this.f53099g, this.f53101h, this.f53103i, this.f53105j, this.f53107k, this.f53108l, this.f53109m, this.f53110n, this.f53111o, frameRate, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, this.f53100g3, this.f53102h3, this.f53104i3);
    }

    public Format h(int encoderDelay, int encoderPadding) {
        return new Format(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53098f, this.f53099g, this.f53101h, this.f53103i, this.f53105j, this.f53107k, this.f53108l, this.f53109m, this.f53110n, this.f53111o, this.f53115s, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, encoderDelay, encoderPadding, this.f53100g3, this.f53102h3, this.f53104i3);
    }

    public int hashCode() {
        if (this.f53106j3 == 0) {
            String str = this.f53093a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f53094b;
            int iHashCode2 = (((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f53095c) * 31) + this.f53096d) * 31) + this.f53097e) * 31;
            String str3 = this.f53098f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Metadata metadata = this.f53099g;
            int iHashCode4 = (iHashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str4 = this.f53101h;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f53103i;
            int iHashCode6 = (((((((((((((((((((((((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f53105j) * 31) + ((int) this.f53109m)) * 31) + this.f53110n) * 31) + this.f53111o) * 31) + Float.floatToIntBits(this.f53115s)) * 31) + this.f53116t) * 31) + Float.floatToIntBits(this.f53117v)) * 31) + this.f53118w) * 31) + this.Z) * 31) + this.f53112p0) * 31) + this.f53113p1) * 31) + this.H1) * 31) + this.f53114p2) * 31;
            String str6 = this.f53100g3;
            int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f53102h3) * 31;
            Class<? extends androidx.media2.exoplayer.external.drm.t> cls = this.f53104i3;
            this.f53106j3 = iHashCode7 + (cls != null ? cls.hashCode() : 0);
        }
        return this.f53106j3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    public Format i(Format manifestFormat) {
        String str;
        String str2;
        if (this == manifestFormat) {
            return this;
        }
        int iG = androidx.media2.exoplayer.external.util.s.g(this.f53103i);
        String str3 = manifestFormat.f53093a;
        String str4 = manifestFormat.f53094b;
        if (str4 == null) {
            str4 = this.f53094b;
        }
        String str5 = str4;
        String str6 = ((iG == 3 || iG == 1) && (str = manifestFormat.f53100g3) != null) ? str : this.f53100g3;
        int i10 = this.f53097e;
        if (i10 == -1) {
            i10 = manifestFormat.f53097e;
        }
        int i11 = i10;
        String str7 = this.f53098f;
        if (str7 == null) {
            String strI = androidx.media2.exoplayer.external.util.q0.I(manifestFormat.f53098f, iG);
            if (androidx.media2.exoplayer.external.util.q0.Q0(strI).length == 1) {
                str2 = strI;
            } else {
                str2 = str7;
            }
        } else {
            str2 = str7;
        }
        Metadata metadata = this.f53099g;
        Metadata metadataB = metadata == null ? manifestFormat.f53099g : metadata.b(manifestFormat.f53099g);
        float f10 = this.f53115s;
        if (f10 == -1.0f && iG == 2) {
            f10 = manifestFormat.f53115s;
        }
        return new Format(str3, str5, this.f53095c | manifestFormat.f53095c, this.f53096d | manifestFormat.f53096d, i11, str2, metadataB, this.f53101h, this.f53103i, this.f53105j, this.f53107k, DrmInitData.e(manifestFormat.f53108l, this.f53108l), this.f53109m, this.f53110n, this.f53111o, f10, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, str6, this.f53102h3, this.f53104i3);
    }

    public Format j(int maxInputSize) {
        return new Format(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53098f, this.f53099g, this.f53101h, this.f53103i, maxInputSize, this.f53107k, this.f53108l, this.f53109m, this.f53110n, this.f53111o, this.f53115s, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, this.f53100g3, this.f53102h3, this.f53104i3);
    }

    public Format k(@androidx.annotation.p0 Metadata metadata) {
        return a(this.f53108l, metadata);
    }

    public Format l(int rotationDegrees) {
        return new Format(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53098f, this.f53099g, this.f53101h, this.f53103i, this.f53105j, this.f53107k, this.f53108l, this.f53109m, this.f53110n, this.f53111o, this.f53115s, rotationDegrees, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, this.f53100g3, this.f53102h3, this.f53104i3);
    }

    public Format m(long subsampleOffsetUs) {
        return new Format(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53098f, this.f53099g, this.f53101h, this.f53103i, this.f53105j, this.f53107k, this.f53108l, subsampleOffsetUs, this.f53110n, this.f53111o, this.f53115s, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, this.f53100g3, this.f53102h3, this.f53104i3);
    }

    public Format n(int width, int height) {
        return new Format(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53098f, this.f53099g, this.f53101h, this.f53103i, this.f53105j, this.f53107k, this.f53108l, this.f53109m, width, height, this.f53115s, this.f53116t, this.f53117v, this.X, this.f53118w, this.Y, this.Z, this.f53112p0, this.f53113p1, this.H1, this.f53114p2, this.f53100g3, this.f53102h3, this.f53104i3);
    }

    public String toString() {
        String str = this.f53093a;
        String str2 = this.f53094b;
        String str3 = this.f53101h;
        String str4 = this.f53103i;
        String str5 = this.f53098f;
        int i10 = this.f53097e;
        String str6 = this.f53100g3;
        int i11 = this.f53110n;
        int i12 = this.f53111o;
        float f10 = this.f53115s;
        int i13 = this.Z;
        int i14 = this.f53112p0;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb2.append("Format(");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append("], [");
        sb2.append(i13);
        sb2.append(", ");
        sb2.append(i14);
        sb2.append("])");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f53093a);
        dest.writeString(this.f53094b);
        dest.writeInt(this.f53095c);
        dest.writeInt(this.f53096d);
        dest.writeInt(this.f53097e);
        dest.writeString(this.f53098f);
        boolean z10 = false;
        dest.writeParcelable(this.f53099g, 0);
        dest.writeString(this.f53101h);
        dest.writeString(this.f53103i);
        dest.writeInt(this.f53105j);
        int size = this.f53107k.size();
        dest.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            dest.writeByteArray(this.f53107k.get(i10));
        }
        dest.writeParcelable(this.f53108l, 0);
        dest.writeLong(this.f53109m);
        dest.writeInt(this.f53110n);
        dest.writeInt(this.f53111o);
        dest.writeFloat(this.f53115s);
        dest.writeInt(this.f53116t);
        dest.writeFloat(this.f53117v);
        if (this.X != null) {
            z10 = true;
            int i11 = 4 | 1;
        }
        androidx.media2.exoplayer.external.util.q0.Y0(dest, z10);
        byte[] bArr = this.X;
        if (bArr != null) {
            dest.writeByteArray(bArr);
        }
        dest.writeInt(this.f53118w);
        dest.writeParcelable(this.Y, flags);
        dest.writeInt(this.Z);
        dest.writeInt(this.f53112p0);
        dest.writeInt(this.f53113p1);
        dest.writeInt(this.H1);
        dest.writeInt(this.f53114p2);
        dest.writeString(this.f53100g3);
        dest.writeInt(this.f53102h3);
    }

    Format(Parcel in) {
        this.f53093a = in.readString();
        this.f53094b = in.readString();
        this.f53095c = in.readInt();
        this.f53096d = in.readInt();
        this.f53097e = in.readInt();
        this.f53098f = in.readString();
        this.f53099g = (Metadata) in.readParcelable(Metadata.class.getClassLoader());
        this.f53101h = in.readString();
        this.f53103i = in.readString();
        this.f53105j = in.readInt();
        int i10 = in.readInt();
        this.f53107k = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f53107k.add(in.createByteArray());
        }
        this.f53108l = (DrmInitData) in.readParcelable(DrmInitData.class.getClassLoader());
        this.f53109m = in.readLong();
        this.f53110n = in.readInt();
        this.f53111o = in.readInt();
        this.f53115s = in.readFloat();
        this.f53116t = in.readInt();
        this.f53117v = in.readFloat();
        this.X = androidx.media2.exoplayer.external.util.q0.E0(in) ? in.createByteArray() : null;
        this.f53118w = in.readInt();
        this.Y = (ColorInfo) in.readParcelable(ColorInfo.class.getClassLoader());
        this.Z = in.readInt();
        this.f53112p0 = in.readInt();
        this.f53113p1 = in.readInt();
        this.H1 = in.readInt();
        this.f53114p2 = in.readInt();
        this.f53100g3 = in.readString();
        this.f53102h3 = in.readInt();
        this.f53104i3 = null;
    }
}

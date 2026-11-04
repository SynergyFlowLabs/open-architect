package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.collection.g3;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.view.f0;
import androidx.media3.common.s0;
import com.facebook.appevents.p;
import com.rabbitmq.client.k0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final String A = "BitsPerSample";
    public static final String A0 = "PhotographicSensitivity";
    public static final String A1 = "GPSLatitude";
    private static final String A2 = "SubIFDPointer";
    public static final short A3 = 4;
    public static final short A4 = 1;
    public static final int A5 = 1;
    private static final int A6 = 2;
    private static final byte A7 = -58;
    public static final String B = "Compression";
    public static final String B0 = "OECF";
    public static final String B1 = "GPSLongitudeRef";
    private static final String B2 = "CameraSettingsIFDPointer";
    public static final short B3 = 9;
    public static final short B4 = 2;
    public static final int B5 = 0;
    private static final int B6 = 3;
    private static final byte B7 = -57;
    public static final String C = "PhotometricInterpretation";
    public static final String C0 = "SensitivityType";
    public static final String C1 = "GPSLongitude";
    private static final String C2 = "ImageProcessingIFDPointer";
    public static final short C3 = 10;
    public static final short C4 = 3;
    public static final int C5 = 1;
    private static final int C6 = 4;
    private static final byte C7 = -55;
    public static final String D = "Orientation";
    public static final String D0 = "StandardOutputSensitivity";
    public static final String D1 = "GPSAltitudeRef";
    private static final int D2 = 512;
    public static final short D3 = 11;
    public static final short D4 = 4;
    private static final int D5 = 1;
    private static final int D6 = 5;
    private static final byte D7 = -54;
    public static final String E = "SamplesPerPixel";
    public static final String E0 = "RecommendedExposureIndex";
    public static final String E1 = "GPSAltitude";
    public static final int E2 = 0;
    public static final short E3 = 12;
    public static final short E4 = 0;
    private static final int E5 = 2;
    private static final int E6 = 6;
    private static final byte E7 = -53;
    public static final String F = "PlanarConfiguration";
    public static final String F0 = "ISOSpeed";
    public static final String F1 = "GPSTimeStamp";
    public static final int F2 = 1;
    public static final short F3 = 13;
    public static final short F4 = 1;
    private static final int F5 = 3;
    private static final int F6 = 7;
    private static final byte F7 = -51;
    public static final String G = "YCbCrSubSampling";
    public static final String G0 = "ISOSpeedLatitudeyyy";
    public static final String G1 = "GPSSatellites";
    public static final int G2 = 2;
    public static final short G3 = 14;
    public static final short G4 = 2;
    private static final int G5 = 5000;
    private static final int G6 = 8;
    private static final byte G7 = -50;
    public static final String H = "YCbCrPositioning";
    public static final String H0 = "ISOSpeedLatitudezzz";
    public static final String H1 = "GPSStatus";
    public static final int H2 = 3;
    public static final short H3 = 15;
    public static final short H4 = 0;
    private static final int H6 = 9;
    private static final byte H7 = -49;
    public static final String I = "XResolution";
    public static final String I0 = "ShutterSpeedValue";
    public static final String I1 = "GPSMeasureMode";
    public static final int I2 = 4;
    public static final short I3 = 16;
    public static final short I4 = 0;
    private static final String I5 = "FUJIFILMCCD-RAW";
    private static final int I6 = 10;
    private static final byte I7 = -38;
    public static final String J = "YResolution";
    public static final String J0 = "ApertureValue";
    public static final String J1 = "GPSDOP";
    public static final int J2 = 5;
    public static final short J3 = 17;
    public static final short J4 = 0;
    private static final int J5 = 84;
    private static final int J6 = 11;

    @l1
    static final byte J7 = -31;
    public static final String K = "ResolutionUnit";
    public static final String K0 = "BrightnessValue";
    public static final String K1 = "GPSSpeedRef";
    public static final int K2 = 6;
    public static final short K3 = 18;
    public static final short K4 = 0;
    private static final int K6 = 12;
    private static final byte K7 = -2;
    public static final String L = "StripOffsets";
    public static final String L0 = "ExposureBiasValue";
    public static final String L1 = "GPSSpeed";
    public static final int L2 = 7;
    public static final short L3 = 19;
    public static final short L4 = 1;
    private static final int L6 = 13;
    private static final byte L7 = -39;
    public static final String M = "RowsPerStrip";
    public static final String M0 = "MaxApertureValue";
    public static final String M1 = "GPSTrackRef";
    public static final int M2 = 8;
    public static final short M3 = 20;
    public static final short M4 = 2;
    private static final int M6 = 8192;
    private static final int M7 = 0;
    public static final String N = "StripByteCounts";
    public static final String N0 = "SubjectDistance";
    public static final String N1 = "GPSTrack";
    public static final short N3 = 21;
    public static final short N4 = 0;
    private static final int N7 = 3;
    public static final String O = "JPEGInterchangeFormat";
    public static final String O0 = "MeteringMode";
    public static final String O1 = "GPSImgDirectionRef";
    public static final short O3 = 22;
    public static final short O4 = 1;
    private static final int O7 = 4;
    public static final String P = "JPEGInterchangeFormatLength";
    public static final String P0 = "LightSource";
    public static final String P1 = "GPSImgDirection";
    public static final short P2 = 1;
    public static final short P3 = 23;
    public static final short P4 = 2;
    private static final short P5 = 20306;
    private static final int P7 = 7;
    public static final String Q = "TransferFunction";
    public static final String Q0 = "Flash";
    public static final String Q1 = "GPSMapDatum";
    public static final short Q2 = 2;
    public static final short Q3 = 24;
    public static final short Q4 = 3;
    private static final short Q5 = 21330;
    private static final f[] Q6;
    private static final int Q7 = 8;
    public static final String R = "WhitePoint";
    public static final String R0 = "SubjectArea";
    public static final String R1 = "GPSDestLatitudeRef";
    public static final short R2 = 1;
    public static final short R3 = 255;
    public static final String R4 = "N";
    private static final f[] R6;
    private static final int R7 = 9;
    public static final String S = "PrimaryChromaticities";
    public static final String S0 = "FocalLength";
    public static final String S1 = "GPSDestLatitude";
    public static final short S2 = 2;
    public static final short S3 = 1;
    public static final String S4 = "S";
    private static final f[] S6;
    private static final int S7 = 10;
    public static final String T = "YCbCrCoefficients";
    public static final String T0 = "FlashEnergy";
    public static final String T1 = "GPSDestLongitudeRef";
    public static final short T2 = 2;
    public static final short T3 = 4;
    public static final String T4 = "E";
    private static final int T5 = 8;
    private static final f[] T6;
    private static final int T7 = 12;
    public static final String U = "ReferenceBlackWhite";
    public static final String U0 = "SpatialFrequencyResponse";
    public static final String U1 = "GPSDestLongitude";
    public static final short U2 = 3;
    public static final short U3 = 6;
    public static final String U4 = "W";
    private static final int U5 = 12;
    private static final f[] U6;
    private static final int U7 = 13;
    public static final String V = "DateTime";
    public static final String V0 = "FocalPlaneXResolution";
    public static final String V1 = "GPSDestBearingRef";
    public static final int V2 = 1;
    public static final short V3 = 8;
    public static final short V4 = 0;
    private static final short V5 = 85;
    private static final f V6;
    private static final int V7 = 14;
    public static final String W = "ImageDescription";
    public static final String W0 = "FocalPlaneYResolution";
    public static final String W1 = "GPSDestBearing";
    public static final int W2 = 65535;
    public static final short W3 = 16;
    public static final short W4 = 1;
    private static final String W5 = "PENTAX";
    private static final f[] W6;
    private static final int W7 = 15;
    public static final String X = "Make";
    public static final String X0 = "FocalPlaneResolutionUnit";
    public static final String X1 = "GPSDestDistanceRef";
    public static final short X2 = 0;
    public static final short X3 = 24;
    public static final String X4 = "A";
    private static final int X5 = 6;
    private static final f[] X6;
    private static final Pattern X7;
    public static final String Y = "Model";
    public static final String Y0 = "SubjectLocation";
    public static final String Y1 = "GPSDestDistance";
    public static final short Y2 = 1;
    public static final short Y3 = 32;
    public static final String Y4 = "V";
    private static final f[] Y6;
    private static final Pattern Y7;
    public static final String Z = "Software";
    public static final String Z0 = "ExposureIndex";
    public static final String Z1 = "GPSProcessingMethod";
    public static final short Z2 = 2;
    public static final short Z3 = 64;
    public static final String Z4 = "2";
    private static final int Z5 = 1700284774;
    private static final f[] Z6;
    private static final Pattern Z7;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f51340a0 = "Artist";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final String f51341a1 = "SensingMethod";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final String f51342a2 = "GPSAreaInformation";

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final short f51343a3 = 3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final short f51344a4 = 1;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final String f51345a5 = "3";

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    private static final int f51346a6 = 1767135348;

    /* JADX INFO: renamed from: a7, reason: collision with root package name */
    private static final int f51347a7 = 0;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    private static final Pattern f51348a8;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f51349b0 = "Copyright";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final String f51350b1 = "FileSource";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final String f51351b2 = "GPSDateStamp";

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final short f51352b3 = 4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final short f51353b4 = 2;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final String f51354b5 = "K";

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    private static final int f51355b6 = 1229472850;

    /* JADX INFO: renamed from: b7, reason: collision with root package name */
    private static final int f51356b7 = 1;

    /* JADX INFO: renamed from: b8, reason: collision with root package name */
    private static final int f51357b8 = 19;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f51358c0 = "ExifVersion";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final String f51359c1 = "SceneType";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final String f51360c2 = "GPSDifferential";

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final short f51361c3 = 5;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final short f51362c4 = 3;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final String f51363c5 = "M";

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    private static final int f51364c6 = 1229278788;

    /* JADX INFO: renamed from: c7, reason: collision with root package name */
    private static final int f51365c7 = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f51366d0 = "FlashpixVersion";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String f51367d1 = "CFAPattern";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final String f51368d2 = "GPSHPositioningError";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final short f51369d3 = 6;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final short f51370d4 = 4;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final String f51371d5 = "N";

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    private static final int f51372d6 = 4;

    /* JADX INFO: renamed from: d7, reason: collision with root package name */
    private static final int f51373d7 = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f51374e0 = "ColorSpace";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final String f51375e1 = "CustomRendered";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final String f51376e2 = "InteroperabilityIndex";

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final short f51377e3 = 7;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final short f51378e4 = 5;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final String f51379e5 = "T";

    /* JADX INFO: renamed from: e7, reason: collision with root package name */
    private static final int f51381e7 = 4;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f51382f0 = "Gamma";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f51383f1 = "ExposureMode";

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final String f51384f2 = "ThumbnailImageLength";

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final short f51385f3 = 8;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final short f51386f4 = 7;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final String f51387f5 = "M";

    /* JADX INFO: renamed from: f7, reason: collision with root package name */
    private static final int f51389f7 = 5;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f51390g0 = "PixelXDimension";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f51391g1 = "WhiteBalance";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final String f51392g2 = "ThumbnailImageWidth";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final short f51393g3 = 0;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final short f51394g4 = 8;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final String f51395g5 = "K";

    /* JADX INFO: renamed from: g7, reason: collision with root package name */
    private static final int f51397g7 = 6;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f51398h0 = "PixelYDimension";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final String f51399h1 = "DigitalZoomRatio";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f51400h2 = "ThumbnailOrientation";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final short f51401h3 = 1;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final short f51402h4 = 0;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final String f51403h5 = "M";

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    private static final int f51404h6 = 4;

    /* JADX INFO: renamed from: h7, reason: collision with root package name */
    private static final int f51405h7 = 7;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f51406i0 = "ComponentsConfiguration";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f51407i1 = "FocalLengthIn35mmFilm";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final String f51408i2 = "DNGVersion";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final short f51409i3 = 2;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final short f51410i4 = 1;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final String f51411i5 = "N";

    /* JADX INFO: renamed from: i7, reason: collision with root package name */
    private static final int f51413i7 = 8;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f51414j0 = "CompressedBitsPerPixel";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String f51415j1 = "SceneCaptureType";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final String f51416j2 = "DefaultCropSize";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final short f51417j3 = 3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final short f51418j4 = 2;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final short f51419j5 = 0;

    /* JADX INFO: renamed from: j7, reason: collision with root package name */
    private static final int f51421j7 = 9;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f51422k0 = "MakerNote";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String f51423k1 = "GainControl";

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final String f51424k2 = "ThumbnailImage";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final short f51425k3 = 4;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final short f51426k4 = 3;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final short f51427k5 = 1;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    private static final byte f51428k6 = 47;

    /* JADX INFO: renamed from: k7, reason: collision with root package name */
    static final f[][] f51429k7;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f51430l0 = "UserComment";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final String f51431l1 = "Contrast";

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final String f51432l2 = "PreviewImageStart";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final short f51433l3 = 5;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final short f51434l4 = 1;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final int f51435l5 = 1;

    /* JADX INFO: renamed from: l7, reason: collision with root package name */
    private static final f[] f51437l7;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f51438m0 = "RelatedSoundFile";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final String f51439m1 = "Saturation";

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final String f51440m2 = "PreviewImageLength";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final short f51441m3 = 6;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final short f51442m4 = 0;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final int f51443m5 = 2;

    /* JADX INFO: renamed from: m7, reason: collision with root package name */
    private static final HashMap<Integer, f>[] f51445m7;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f51446n0 = "DateTimeOriginal";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final String f51447n1 = "Sharpness";

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final String f51448n2 = "AspectFrame";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final short f51449n3 = 7;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final short f51450n4 = 1;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final int f51451n5 = 6;

    /* JADX INFO: renamed from: n7, reason: collision with root package name */
    private static final HashMap<String, f>[] f51453n7;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f51454o0 = "DateTimeDigitized";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final String f51455o1 = "DeviceSettingDescription";

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final String f51456o2 = "SensorBottomBorder";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final short f51457o3 = 0;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final short f51458o4 = 0;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final int f51459o5 = 7;

    /* JADX INFO: renamed from: o7, reason: collision with root package name */
    private static final Set<String> f51461o7;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f51462p0 = "OffsetTime";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f51463p1 = "SubjectDistanceRange";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f51464p2 = "SensorLeftBorder";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final short f51465p3 = 1;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final short f51466p4 = 1;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final int f51467p5 = 8;

    /* JADX INFO: renamed from: p7, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f51469p7;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f51470q0 = "OffsetTimeOriginal";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final String f51471q1 = "ImageUniqueID";

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final String f51472q2 = "SensorRightBorder";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final short f51473q3 = 2;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final short f51474q4 = 2;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final int f51475q5 = 32773;

    /* JADX INFO: renamed from: q6, reason: collision with root package name */
    private static final int f51476q6 = 10;

    /* JADX INFO: renamed from: q7, reason: collision with root package name */
    private static final Charset f51477q7;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f51478r0 = "OffsetTimeDigitized";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    @Deprecated
    public static final String f51479r1 = "CameraOwnerName";

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final String f51480r2 = "SensorTopBorder";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final short f51481r3 = 3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    @Deprecated
    public static final int f51482r4 = 0;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final int f51483r5 = 34892;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    private static final int f51484r6 = 4;

    /* JADX INFO: renamed from: r7, reason: collision with root package name */
    @l1
    static final byte[] f51485r7;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f51486s0 = "SubSecTime";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String f51487s1 = "CameraOwnerName";

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final String f51488s2 = "ISO";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final short f51489s3 = 4;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    @Deprecated
    public static final int f51490s4 = 1;

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    private static final int f51492s6 = 4;

    /* JADX INFO: renamed from: s7, reason: collision with root package name */
    private static final byte[] f51493s7;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f51494t0 = "SubSecTimeOriginal";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final String f51495t1 = "BodySerialNumber";

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final String f51496t2 = "JpgFromRaw";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final short f51497t3 = 5;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final short f51498t4 = 0;

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    private static final SimpleDateFormat f51500t6;

    /* JADX INFO: renamed from: t7, reason: collision with root package name */
    private static final byte f51501t7 = -1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f51502u0 = "SubSecTimeDigitized";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final String f51503u1 = "LensSpecification";

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final String f51504u2 = "Xmp";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final short f51505u3 = 6;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final short f51506u4 = 1;

    /* JADX INFO: renamed from: u6, reason: collision with root package name */
    private static final SimpleDateFormat f51508u6;

    /* JADX INFO: renamed from: u7, reason: collision with root package name */
    private static final byte f51509u7 = -40;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f51510v0 = "ExposureTime";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final String f51511v1 = "LensMake";

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final String f51512v2 = "NewSubfileType";

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final short f51513v3 = 255;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final short f51514v4 = 0;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final int f51515v5 = 0;

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    static final short f51516v6 = 18761;

    /* JADX INFO: renamed from: v7, reason: collision with root package name */
    private static final byte f51517v7 = -64;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f51519w0 = "FNumber";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final String f51520w1 = "LensModel";

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final String f51521w2 = "SubfileType";

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final short f51522w3 = 0;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final short f51523w4 = 1;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public static final int f51524w5 = 1;

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    static final short f51525w6 = 19789;

    /* JADX INFO: renamed from: w7, reason: collision with root package name */
    private static final byte f51526w7 = -63;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f51528x0 = "ExposureProgram";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f51529x1 = "LensSerialNumber";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f51530x2 = "ExifIFDPointer";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final short f51531x3 = 1;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final short f51532x4 = 2;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public static final int f51533x5 = 2;

    /* JADX INFO: renamed from: x7, reason: collision with root package name */
    private static final byte f51535x7 = -62;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f51536y = "ImageWidth";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f51537y0 = "SpectralSensitivity";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f51538y1 = "GPSVersionID";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final String f51539y2 = "GPSInfoIFDPointer";

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final short f51540y3 = 2;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final short f51541y4 = 3;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public static final int f51542y5 = 6;

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    private static final int f51543y6 = 8;

    /* JADX INFO: renamed from: y7, reason: collision with root package name */
    private static final byte f51544y7 = -61;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f51545z = "ImageLength";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @Deprecated
    public static final String f51546z0 = "ISOSpeedRatings";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final String f51547z1 = "GPSLatitudeRef";

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private static final String f51548z2 = "InteroperabilityIFDPointer";

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final short f51549z3 = 3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final short f51550z4 = 0;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final int f51551z5 = 0;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    private static final int f51552z6 = 1;

    /* JADX INFO: renamed from: z7, reason: collision with root package name */
    private static final byte f51553z7 = -59;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f51555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f51556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f51558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, d>[] f51559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<Integer> f51560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f51561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f51562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f51563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f51564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f51565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f51566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f51567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f51568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f51569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f51570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f51571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f51572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f51573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f51574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f51575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f51518w = "ExifInterface";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final boolean f51527x = Log.isLoggable(f51518w, 3);
    private static final List<Integer> N2 = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> O2 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final int[] f51491s5 = {8, 8, 8};

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final int[] f51499t5 = {4};

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public static final int[] f51507u5 = {8};
    static final byte[] H5 = {-1, -40, -1};
    private static final byte[] K5 = {102, 116, 121, 112};
    private static final byte[] L5 = {109, 105, 102, 49};
    private static final byte[] M5 = {104, 101, 105, 99};
    private static final byte[] N5 = {97, 118, 105, 102};
    private static final byte[] O5 = {97, 118, 105, 115};
    private static final byte[] R5 = {79, 76, 89, 77, 80, 0};
    private static final byte[] S5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] Y5 = {-119, 80, 78, 71, com.google.common.base.c.f116462o, 10, com.google.common.base.c.D, 10};

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    @l1
    static final byte[] f51380e6 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    private static final byte[] f51388f6 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    private static final byte[] f51396g6 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    private static final byte[] f51412i6 = {69, 88, 73, 70};

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    static final byte f51534x6 = 42;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    private static final byte[] f51420j6 = {-99, 1, f51534x6};

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    private static final byte[] f51436l6 = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    private static final byte[] f51444m6 = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    private static final byte[] f51452n6 = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    private static final byte[] f51460o6 = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    private static final byte[] f51468p6 = "ANMF".getBytes(Charset.defaultCharset());
    private static final String[] N6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int[] O6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] P6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    class C0465a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f51576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f51577b;

        C0465a(i iVar) {
            this.f51577b = iVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f51576a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f51577b.available())) {
                        return -1;
                    }
                    this.f51577b.g(j10);
                    this.f51576a = j10;
                }
                if (i11 > this.f51577b.available()) {
                    i11 = this.f51577b.available();
                }
                int i12 = this.f51577b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f51576a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f51576a = -1L;
            return -1;
        }
    }

    private static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DataOutputStream f51585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteOrder f51586b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f51585a = new DataOutputStream(outputStream);
            this.f51586b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f51586b = byteOrder;
        }

        public void b(int i10) throws IOException {
            this.f51585a.write(i10);
        }

        public void c(long j10) throws IOException {
            if (j10 > k0.f265952a) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            writeInt((int) j10);
        }

        public void d(int i10) throws IOException {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            oc((short) i10);
        }

        public void oc(short s10) throws IOException {
            ByteOrder byteOrder = this.f51586b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f51585a.write(s10 & 255);
                this.f51585a.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f51585a.write((s10 >>> 8) & 255);
                this.f51585a.write(s10 & 255);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f51585a.write(bArr);
        }

        public void writeInt(int i10) throws IOException {
            ByteOrder byteOrder = this.f51586b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f51585a.write(i10 & 255);
                this.f51585a.write((i10 >>> 8) & 255);
                this.f51585a.write((i10 >>> 16) & 255);
                this.f51585a.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f51585a.write((i10 >>> 24) & 255);
                this.f51585a.write((i10 >>> 16) & 255);
                this.f51585a.write((i10 >>> 8) & 255);
                this.f51585a.write(i10 & 255);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f51585a.write(bArr, i10, i11);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f51587e = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f51590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f51591d;

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1) {
                int i10 = 2 >> 0;
                if (str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                    return new d(1, 1, new byte[]{(byte) (str.charAt(0) - l.f338160j)});
                }
            }
            byte[] bytes = str.getBytes(a.f51477q7);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.O6[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.O6[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.O6[10] * hVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (h hVar : hVarArr) {
                byteBufferWrap.putInt((int) hVar.f51596a);
                byteBufferWrap.putInt((int) hVar.f51597b);
            }
            return new d(10, hVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f51477q7);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.O6[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(h hVar, ByteOrder byteOrder) {
            return i(new h[]{hVar}, byteOrder);
        }

        public static d i(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.O6[5] * hVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (h hVar : hVarArr) {
                byteBufferWrap.putInt((int) hVar.f51596a);
                byteBufferWrap.putInt((int) hVar.f51597b);
            }
            return new d(5, hVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.O6[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof h[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            h[] hVarArr = (h[]) objO;
            if (hVarArr.length == 1) {
                return hVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            int i10 = 5 >> 1;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objO instanceof h[])) {
                return null;
            }
            h[] hVarArr = (h[]) objO;
            while (i10 < hVarArr.length) {
                sb2.append(hVarArr[i10].f51596a);
                sb2.append('/');
                sb2.append(hVarArr[i10].f51597b);
                i10++;
                if (i10 != hVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        Object o(ByteOrder byteOrder) throws Throwable {
            Throwable th2;
            b bVar;
            byte b10;
            byte b11;
            b bVar2 = null;
            try {
                bVar = new b(this.f51591d);
                try {
                    bVar.e(byteOrder);
                    int length = 0;
                    switch (this.f51588a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.f51591d;
                            if (bArr.length != 1 || (b10 = bArr[0]) < 0 || b10 > 1) {
                                String str = new String(bArr, a.f51477q7);
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b10 + 48)});
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.f51589b >= a.P6.length) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= a.P6.length) {
                                        length = a.P6.length;
                                    } else if (this.f51591d[i10] == a.P6[i10]) {
                                        i10++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            while (length < this.f51589b && (b11 = this.f51591d[length]) != 0) {
                                if (b11 >= 32) {
                                    sb2.append((char) b11);
                                } else {
                                    sb2.append('?');
                                }
                                length++;
                            }
                            String string = sb2.toString();
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused3) {
                            }
                            return string;
                        case 3:
                            int[] iArr = new int[this.f51589b];
                            while (length < this.f51589b) {
                                iArr[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.f51589b];
                            while (length < this.f51589b) {
                                jArr[length] = bVar.d();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            h[] hVarArr = new h[this.f51589b];
                            while (length < this.f51589b) {
                                hVarArr[length] = new h(bVar.d(), bVar.d(), null);
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused6) {
                            }
                            return hVarArr;
                        case 8:
                            int[] iArr2 = new int[this.f51589b];
                            while (length < this.f51589b) {
                                iArr2[length] = bVar.readShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.f51589b];
                            while (length < this.f51589b) {
                                iArr3[length] = bVar.readInt();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            h[] hVarArr2 = new h[this.f51589b];
                            while (length < this.f51589b) {
                                hVarArr2[length] = new h(bVar.readInt(), bVar.readInt(), null);
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused9) {
                            }
                            return hVarArr2;
                        case 11:
                            double[] dArr = new double[this.f51589b];
                            while (length < this.f51589b) {
                                dArr[length] = bVar.readFloat();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.f51589b];
                            while (length < this.f51589b) {
                                dArr2[length] = bVar.readDouble();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused11) {
                            }
                            return dArr2;
                        default:
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused12) {
                            }
                            return null;
                    }
                } catch (IOException unused13) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException unused14) {
                        }
                    }
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    bVar2 = bVar;
                    if (bVar2 == null) {
                        throw th2;
                    }
                    try {
                        bVar2.close();
                        throw th2;
                    } catch (IOException unused15) {
                        throw th2;
                    }
                }
            } catch (IOException unused16) {
                bVar = null;
            } catch (Throwable th4) {
                th2 = th4;
            }
        }

        public int p() {
            return a.O6[this.f51588a] * this.f51589b;
        }

        public String toString() {
            return "(" + a.N6[this.f51588a] + ", data length:" + this.f51591d.length + ")";
        }

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f51588a = i10;
            this.f51589b = i11;
            this.f51590c = j10;
            this.f51591d = bArr;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface g {
    }

    @l1
    static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f51596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f51597b;

        /* synthetic */ h(long j10, long j11, C0465a c0465a) {
            this(j10, j11);
        }

        public static h b(double d10) {
            long j10;
            long j11;
            long j12 = 1;
            if (d10 >= 9.223372036854776E18d || d10 <= -9.223372036854776E18d) {
                return new h(d10 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double dAbs = Math.abs(d10);
            long j13 = 0;
            long j14 = 1;
            double d11 = dAbs;
            long j15 = 0;
            while (true) {
                double d12 = d11 % 1.0d;
                long j16 = (long) (d11 - d12);
                j10 = j15 + (j16 * j12);
                j11 = (j16 * j13) + j14;
                d11 = 1.0d / d12;
                long j17 = j12;
                if (Math.abs(dAbs - (j10 / j11)) <= 1.0E-8d * dAbs) {
                    break;
                }
                j14 = j13;
                j12 = j10;
                j15 = j17;
                j13 = j11;
            }
            if (d10 < 0.0d) {
                j10 = -j10;
            }
            return new h(j10, j11);
        }

        public double a() {
            return this.f51596a / this.f51597b;
        }

        public String toString() {
            return this.f51596a + "/" + this.f51597b;
        }

        private h(long j10, long j11) {
            if (j11 == 0) {
                this.f51596a = 0L;
                this.f51597b = 1L;
            } else {
                this.f51596a = j10;
                this.f51597b = j11;
            }
        }
    }

    static {
        f[] fVarArr = {new f(f51512v2, com.planner5d.library.engine.input.f.b.X1, 4), new f(f51521w2, 255, 4), new f(f51536y, 256, 3, 4), new f(f51545z, 257, 3, 4), new f(A, 258, 3), new f(B, 259, 3), new f(C, 262, 3), new f(W, 270, 2), new f(X, 271, 2), new f(Y, com.badlogic.gdx.utils.compression.lzma.a.f95331z, 2), new f(L, com.badlogic.gdx.utils.compression.lzma.a.A, 3, 4), new f(D, 274, 3), new f(E, 277, 3), new f(M, 278, 3, 4), new f(N, 279, 3, 4), new f(I, 282, 5), new f(J, 283, 5), new f(F, 284, 3), new f(K, 296, 3), new f(Q, 301, 3), new f(Z, 305, 2), new f(V, 306, 2), new f(f51340a0, 315, 2), new f(R, v.a.f43976s, 5), new f(S, 319, 5), new f(A2, 330, 4), new f(O, f0.f48707j, 4), new f(P, 514, 4), new f(T, 529, 5), new f(G, com.rabbitmq.client.a.f264852w, 3), new f(H, 531, 3), new f(U, 532, 5), new f(f51349b0, 33432, 2), new f(f51530x2, 34665, 4), new f(f51539y2, 34853, 4), new f(f51480r2, 4, 4), new f(f51464p2, 5, 4), new f(f51456o2, 6, 4), new f(f51472q2, 7, 4), new f(f51488s2, 23, 3), new f(f51496t2, 46, 7), new f(f51504u2, 700, 1)};
        Q6 = fVarArr;
        f[] fVarArr2 = {new f(f51510v0, 33434, 5), new f(f51519w0, 33437, 5), new f(f51528x0, 34850, 3), new f(f51537y0, 34852, 2), new f(A0, 34855, 3), new f(B0, 34856, 7), new f(C0, 34864, 3), new f(D0, 34865, 4), new f(E0, 34866, 4), new f(F0, 34867, 4), new f(G0, 34868, 4), new f(H0, 34869, 4), new f(f51358c0, 36864, 2), new f(f51446n0, 36867, 2), new f(f51454o0, 36868, 2), new f(f51462p0, 36880, 2), new f(f51470q0, 36881, 2), new f(f51478r0, 36882, 2), new f(f51406i0, 37121, 7), new f(f51414j0, 37122, 5), new f(I0, 37377, 10), new f(J0, 37378, 5), new f(K0, 37379, 10), new f(L0, 37380, 10), new f(M0, 37381, 5), new f(N0, 37382, 5), new f(O0, 37383, 3), new f(P0, 37384, 3), new f(Q0, 37385, 3), new f(S0, 37386, 5), new f(R0, 37396, 3), new f(f51422k0, 37500, 7), new f(f51430l0, 37510, 7), new f(f51486s0, 37520, 2), new f(f51494t0, 37521, 2), new f(f51502u0, 37522, 2), new f(f51366d0, 40960, 7), new f(f51374e0, 40961, 3), new f(f51390g0, 40962, 3, 4), new f(f51398h0, 40963, 3, 4), new f(f51438m0, 40964, 2), new f(f51548z2, 40965, 4), new f(T0, 41483, 5), new f(U0, 41484, 7), new f(V0, 41486, 5), new f(W0, 41487, 5), new f(X0, 41488, 3), new f(Y0, 41492, 3), new f(Z0, 41493, 5), new f(f51341a1, 41495, 3), new f(f51350b1, 41728, 7), new f(f51359c1, 41729, 7), new f(f51367d1, 41730, 7), new f(f51375e1, 41985, 3), new f(f51383f1, 41986, 3), new f(f51391g1, 41987, 3), new f(f51399h1, 41988, 5), new f(f51407i1, 41989, 3), new f(f51415j1, 41990, 3), new f(f51423k1, 41991, 3), new f(f51431l1, 41992, 3), new f(f51439m1, 41993, 3), new f(f51447n1, 41994, 3), new f(f51455o1, 41995, 7), new f(f51463p1, 41996, 3), new f(f51471q1, 42016, 2), new f("CameraOwnerName", 42032, 2), new f(f51495t1, 42033, 2), new f(f51503u1, 42034, 5), new f(f51511v1, 42035, 2), new f(f51520w1, 42036, 2), new f(f51382f0, 42240, 5), new f(f51408i2, 50706, 1), new f(f51416j2, 50720, 3, 4)};
        R6 = fVarArr2;
        f[] fVarArr3 = {new f(f51538y1, 0, 1), new f(f51547z1, 1, 2), new f(A1, 2, 5, 10), new f(B1, 3, 2), new f(C1, 4, 5, 10), new f(D1, 5, 1), new f(E1, 6, 5), new f(F1, 7, 5), new f(G1, 8, 2), new f(H1, 9, 2), new f(I1, 10, 2), new f(J1, 11, 5), new f(K1, 12, 2), new f(L1, 13, 5), new f(M1, 14, 2), new f(N1, 15, 5), new f(O1, 16, 2), new f(P1, 17, 5), new f(Q1, 18, 2), new f(R1, 19, 2), new f(S1, 20, 5), new f(T1, 21, 2), new f(U1, 22, 5), new f(V1, 23, 2), new f(W1, 24, 5), new f(X1, 25, 2), new f(Y1, 26, 5), new f(Z1, 27, 7), new f(f51342a2, 28, 7), new f(f51351b2, 29, 2), new f(f51360c2, 30, 3), new f(f51368d2, 31, 5)};
        S6 = fVarArr3;
        f[] fVarArr4 = {new f(f51376e2, 1, 2)};
        T6 = fVarArr4;
        f[] fVarArr5 = {new f(f51512v2, com.planner5d.library.engine.input.f.b.X1, 4), new f(f51521w2, 255, 4), new f(f51392g2, 256, 3, 4), new f(f51384f2, 257, 3, 4), new f(A, 258, 3), new f(B, 259, 3), new f(C, 262, 3), new f(W, 270, 2), new f(X, 271, 2), new f(Y, com.badlogic.gdx.utils.compression.lzma.a.f95331z, 2), new f(L, com.badlogic.gdx.utils.compression.lzma.a.A, 3, 4), new f(f51400h2, 274, 3), new f(E, 277, 3), new f(M, 278, 3, 4), new f(N, 279, 3, 4), new f(I, 282, 5), new f(J, 283, 5), new f(F, 284, 3), new f(K, 296, 3), new f(Q, 301, 3), new f(Z, 305, 2), new f(V, 306, 2), new f(f51340a0, 315, 2), new f(R, v.a.f43976s, 5), new f(S, 319, 5), new f(A2, 330, 4), new f(O, f0.f48707j, 4), new f(P, 514, 4), new f(T, 529, 5), new f(G, com.rabbitmq.client.a.f264852w, 3), new f(H, 531, 3), new f(U, 532, 5), new f(f51349b0, 33432, 2), new f(f51530x2, 34665, 4), new f(f51539y2, 34853, 4), new f(f51408i2, 50706, 1), new f(f51416j2, 50720, 3, 4)};
        U6 = fVarArr5;
        V6 = new f(L, com.badlogic.gdx.utils.compression.lzma.a.A, 3);
        f[] fVarArr6 = {new f(f51424k2, 256, 7), new f(B2, 8224, 4), new f(C2, 8256, 4)};
        W6 = fVarArr6;
        f[] fVarArr7 = {new f(f51432l2, 257, 4), new f(f51440m2, 258, 4)};
        X6 = fVarArr7;
        f[] fVarArr8 = {new f(f51448n2, 4371, 3)};
        Y6 = fVarArr8;
        f[] fVarArr9 = {new f(f51374e0, 55, 3)};
        Z6 = fVarArr9;
        f[][] fVarArr10 = {fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, fVarArr6, fVarArr7, fVarArr8, fVarArr9};
        f51429k7 = fVarArr10;
        f51437l7 = new f[]{new f(A2, 330, 4), new f(f51530x2, 34665, 4), new f(f51539y2, 34853, 4), new f(f51548z2, 40965, 4), new f(B2, 8224, 1), new f(C2, 8256, 1)};
        f51445m7 = new HashMap[fVarArr10.length];
        f51453n7 = new HashMap[fVarArr10.length];
        f51461o7 = Collections.unmodifiableSet(new HashSet(Arrays.asList(f51519w0, f51399h1, f51510v0, N0)));
        f51469p7 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f51477q7 = charsetForName;
        f51485r7 = "Exif\u0000\u0000".getBytes(charsetForName);
        f51493s7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f51500t6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f51508u6 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            f[][] fVarArr11 = f51429k7;
            if (i10 >= fVarArr11.length) {
                HashMap<Integer, Integer> map = f51469p7;
                f[] fVarArr12 = f51437l7;
                map.put(Integer.valueOf(fVarArr12[0].f51592a), 5);
                map.put(Integer.valueOf(fVarArr12[1].f51592a), 1);
                map.put(Integer.valueOf(fVarArr12[2].f51592a), 2);
                map.put(Integer.valueOf(fVarArr12[3].f51592a), 3);
                map.put(Integer.valueOf(fVarArr12[4].f51592a), 7);
                map.put(Integer.valueOf(fVarArr12[5].f51592a), 8);
                X7 = Pattern.compile(".*[1-9].*");
                Y7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Z7 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f51348a8 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f51445m7[i10] = new HashMap<>();
            f51453n7[i10] = new HashMap<>();
            for (f fVar : fVarArr11[i10]) {
                f51445m7[i10].put(Integer.valueOf(fVar.f51592a), fVar);
                f51453n7[i10].put(fVar.f51593b, fVar);
            }
            i10++;
        }
    }

    public a(File file) throws Throwable {
        f[][] fVarArr = f51429k7;
        this.f51559f = new HashMap[fVarArr.length];
        this.f51560g = new HashSet(fVarArr.length);
        this.f51561h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        T(file.getAbsolutePath());
    }

    private int A(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (W(bArr)) {
            return 4;
        }
        if (Z(bArr)) {
            return 9;
        }
        int iV = V(bArr);
        if (iV != 0) {
            return iV;
        }
        if (X(bArr)) {
            int i10 = 2 ^ 7;
            return 7;
        }
        if (a0(bArr)) {
            return 10;
        }
        if (Y(bArr)) {
            return 13;
        }
        return h0(bArr) ? 14 : 0;
    }

    private void B(i iVar) throws Throwable {
        int i10;
        int i11;
        E(iVar);
        d dVar = this.f51559f[1].get(f51422k0);
        if (dVar != null) {
            i iVar2 = new i(dVar.f51591d);
            iVar2.e(this.f51561h);
            byte[] bArr = R5;
            byte[] bArr2 = new byte[bArr.length];
            iVar2.readFully(bArr2);
            iVar2.g(0L);
            byte[] bArr3 = S5;
            byte[] bArr4 = new byte[bArr3.length];
            iVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iVar2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iVar2.g(12L);
            }
            o0(iVar2, 6);
            d dVar2 = this.f51559f[7].get(f51432l2);
            d dVar3 = this.f51559f[7].get(f51440m2);
            if (dVar2 != null && dVar3 != null) {
                this.f51559f[5].put(O, dVar2);
                this.f51559f[5].put(P, dVar3);
            }
            d dVar4 = this.f51559f[8].get(f51448n2);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f51561h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarJ = d.j(i14, this.f51561h);
                d dVarJ2 = d.j(i15, this.f51561h);
                this.f51559f[0].put(f51536y, dVarJ);
                this.f51559f[0].put(f51545z, dVarJ2);
            }
        }
    }

    private void C(b bVar) throws Throwable {
        if (f51527x) {
            Objects.toString(bVar);
        }
        bVar.e(ByteOrder.BIG_ENDIAN);
        int iB = bVar.b();
        bVar.f(Y5.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                break;
            }
            try {
                int i10 = bVar.readInt();
                int i11 = bVar.readInt();
                int iB2 = bVar.b() + i10 + 4;
                if (bVar.b() - iB == 16 && i11 != f51355b6) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i11 == f51364c6) {
                    break;
                }
                if (i11 == Z5 && !z10) {
                    this.f51569p = bVar.b() - iB;
                    byte[] bArr = new byte[i10];
                    bVar.readFully(bArr);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    G0(crc32, i11);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i12) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                    }
                    n0(bArr, 0);
                    I0();
                    D0(new b(bArr));
                    z10 = true;
                } else if (i11 == f51346a6 && !z11) {
                    byte[] bArr2 = f51380e6;
                    if (i10 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iB3 = bVar.b() - iB;
                            int i13 = i10 - length;
                            byte[] bArr4 = new byte[i13];
                            bVar.readFully(bArr4);
                            this.f51574u = new d(1, i13, iB3, bArr4);
                            z11 = true;
                        }
                    }
                }
                bVar.f(iB2 - bVar.b());
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
        this.f51575v = z11;
    }

    private void D(b bVar) throws Throwable {
        if (f51527x) {
            Objects.toString(bVar);
        }
        bVar.f(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.f(i10 - bVar.b());
        bVar.readFully(bArr4);
        x(new b(bArr4), i10, 5);
        bVar.f(i12 - bVar.b());
        bVar.e(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == V6.f51592a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarJ = d.j(s10, this.f51561h);
                d dVarJ2 = d.j(s11, this.f51561h);
                this.f51559f[0].put(f51545z, dVarJ);
                this.f51559f[0].put(f51536y, dVarJ2);
                return;
            }
            bVar.f(unsignedShort2);
        }
    }

    private void D0(b bVar) throws Throwable {
        HashMap<String, d> map = this.f51559f[4];
        d dVar = map.get(B);
        if (dVar == null) {
            this.f51568o = 6;
            P(bVar, map);
            return;
        }
        int iM = dVar.m(this.f51561h);
        this.f51568o = iM;
        if (iM != 1) {
            if (iM == 6) {
                P(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (c0(map)) {
            Q(bVar, map);
        }
    }

    private void E(i iVar) throws Throwable {
        d dVar;
        k0(iVar);
        o0(iVar, 0);
        H0(iVar, 0);
        H0(iVar, 5);
        H0(iVar, 4);
        I0();
        if (this.f51557d != 8 || (dVar = this.f51559f[1].get(f51422k0)) == null) {
            return;
        }
        i iVar2 = new i(dVar.f51591d);
        iVar2.e(this.f51561h);
        iVar2.f(6);
        o0(iVar2, 9);
        d dVar2 = this.f51559f[9].get(f51374e0);
        if (dVar2 != null) {
            this.f51559f[1].put(f51374e0, dVar2);
        }
    }

    private static boolean E0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void F0(int i10, int i11) throws Throwable {
        if (this.f51559f[i10].isEmpty() || this.f51559f[i11].isEmpty()) {
            return;
        }
        d dVar = this.f51559f[i10].get(f51545z);
        d dVar2 = this.f51559f[i10].get(f51536y);
        d dVar3 = this.f51559f[i11].get(f51545z);
        d dVar4 = this.f51559f[i11].get(f51536y);
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int iM = dVar.m(this.f51561h);
        int iM2 = dVar2.m(this.f51561h);
        int iM3 = dVar3.m(this.f51561h);
        int iM4 = dVar4.m(this.f51561h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f51559f;
        HashMap<String, d> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private void G(i iVar) throws Throwable {
        if (f51527x) {
            Objects.toString(iVar);
        }
        E(iVar);
        d dVar = this.f51559f[0].get(f51496t2);
        if (dVar != null) {
            x(new b(dVar.f51591d), (int) dVar.f51590c, 5);
        }
        d dVar2 = this.f51559f[0].get(f51488s2);
        d dVar3 = this.f51559f[1].get(A0);
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f51559f[1].put(A0, dVar2);
    }

    private static void G0(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    private boolean H(i iVar) throws IOException {
        byte[] bArr = f51485r7;
        byte[] bArr2 = new byte[bArr.length];
        iVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArrC = iVar.c();
        this.f51569p = bArr.length;
        n0(bArrC, 0);
        return true;
    }

    private void H0(i iVar, int i10) throws Throwable {
        d dVarJ;
        d dVarJ2;
        d dVar = this.f51559f[i10].get(f51416j2);
        d dVar2 = this.f51559f[i10].get(f51480r2);
        d dVar3 = this.f51559f[i10].get(f51464p2);
        d dVar4 = this.f51559f[i10].get(f51456o2);
        d dVar5 = this.f51559f[i10].get(f51472q2);
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                s0(iVar, i10);
                return;
            }
            int iM = dVar2.m(this.f51561h);
            int iM2 = dVar4.m(this.f51561h);
            int iM3 = dVar5.m(this.f51561h);
            int iM4 = dVar3.m(this.f51561h);
            if (iM2 > iM && iM3 > iM4) {
                d dVarJ3 = d.j(iM2 - iM, this.f51561h);
                d dVarJ4 = d.j(iM3 - iM4, this.f51561h);
                this.f51559f[i10].put(f51545z, dVarJ3);
                this.f51559f[i10].put(f51536y, dVarJ4);
            }
            return;
        }
        if (dVar.f51588a != 5) {
            int[] iArr = (int[]) dVar.o(this.f51561h);
            if (iArr != null && iArr.length == 2) {
                dVarJ = d.j(iArr[0], this.f51561h);
                dVarJ2 = d.j(iArr[1], this.f51561h);
            }
            Arrays.toString(iArr);
            return;
        }
        h[] hVarArr = (h[]) dVar.o(this.f51561h);
        if (hVarArr == null || hVarArr.length != 2) {
            Arrays.toString(hVarArr);
            return;
        } else {
            dVarJ = d.h(hVarArr[0], this.f51561h);
            dVarJ2 = d.h(hVarArr[1], this.f51561h);
        }
        this.f51559f[i10].put(f51536y, dVarJ);
        this.f51559f[i10].put(f51545z, dVarJ2);
    }

    private void I0() throws Throwable {
        F0(0, 5);
        F0(0, 4);
        F0(5, 4);
        d dVar = this.f51559f[1].get(f51390g0);
        d dVar2 = this.f51559f[1].get(f51398h0);
        if (dVar != null && dVar2 != null) {
            this.f51559f[0].put(f51536y, dVar);
            this.f51559f[0].put(f51545z, dVar2);
        }
        if (this.f51559f[4].isEmpty() && f0(this.f51559f[5])) {
            HashMap<String, d>[] mapArr = this.f51559f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        f0(this.f51559f[4]);
        q0(0, f51400h2, D);
        q0(0, f51384f2, f51545z);
        q0(0, f51392g2, f51536y);
        q0(5, f51400h2, D);
        q0(5, f51384f2, f51545z);
        q0(5, f51392g2, f51536y);
        q0(4, D, f51400h2);
        q0(4, f51545z, f51384f2);
        q0(4, f51536y, f51392g2);
    }

    private int J0(c cVar) throws IOException {
        long j10;
        f[][] fVarArr = f51429k7;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (f fVar : f51437l7) {
            p0(fVar.f51593b);
        }
        if (this.f51562i) {
            if (this.f51563j) {
                p0(L);
                p0(N);
            } else {
                p0(O);
                p0(P);
            }
        }
        for (int i10 = 0; i10 < f51429k7.length; i10++) {
            Iterator<Map.Entry<String, d>> it = this.f51559f[i10].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        long j11 = 0;
        if (!this.f51559f[1].isEmpty()) {
            this.f51559f[0].put(f51437l7[1].f51593b, d.f(0L, this.f51561h));
        }
        if (!this.f51559f[2].isEmpty()) {
            this.f51559f[0].put(f51437l7[2].f51593b, d.f(0L, this.f51561h));
        }
        if (!this.f51559f[3].isEmpty()) {
            this.f51559f[1].put(f51437l7[3].f51593b, d.f(0L, this.f51561h));
        }
        if (this.f51562i) {
            if (this.f51563j) {
                this.f51559f[4].put(L, d.j(0, this.f51561h));
                this.f51559f[4].put(N, d.j(this.f51566m, this.f51561h));
            } else {
                this.f51559f[4].put(O, d.f(0L, this.f51561h));
                this.f51559f[4].put(P, d.f(this.f51566m, this.f51561h));
            }
        }
        for (int i11 = 0; i11 < f51429k7.length; i11++) {
            Iterator<Map.Entry<String, d>> it2 = this.f51559f[i11].entrySet().iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                int iP = it2.next().getValue().p();
                if (iP > 4) {
                    i12 += iP;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < f51429k7.length; i13++) {
            if (!this.f51559f[i13].isEmpty()) {
                iArr[i13] = size;
                size += (this.f51559f[i13].size() * 12) + 6 + iArr2[i13];
            }
        }
        if (this.f51562i) {
            if (this.f51563j) {
                this.f51559f[4].put(L, d.j(size, this.f51561h));
            } else {
                this.f51559f[4].put(O, d.f(size, this.f51561h));
            }
            this.f51565l = size;
            size += this.f51566m;
        }
        if (this.f51557d == 4) {
            size += 8;
        }
        if (f51527x) {
            for (int i14 = 0; i14 < f51429k7.length; i14++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i14), Integer.valueOf(iArr[i14]), Integer.valueOf(this.f51559f[i14].size()), Integer.valueOf(iArr2[i14]), Integer.valueOf(size));
            }
        }
        if (!this.f51559f[1].isEmpty()) {
            this.f51559f[0].put(f51437l7[1].f51593b, d.f(iArr[1], this.f51561h));
        }
        if (!this.f51559f[r13].isEmpty()) {
            this.f51559f[0].put(f51437l7[r13].f51593b, d.f(iArr[2], this.f51561h));
        }
        if (!this.f51559f[r14].isEmpty()) {
            this.f51559f[1].put(f51437l7[r14].f51593b, d.f(iArr[3], this.f51561h));
        }
        int i15 = this.f51557d;
        if (i15 == 4) {
            if (size > 65535) {
                throw new IllegalStateException("Size of exif data (" + size + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.d(size);
            cVar.write(f51485r7);
        } else if (i15 == 13) {
            cVar.writeInt(size);
            cVar.writeInt(Z5);
        } else if (i15 == 14) {
            cVar.write(f51412i6);
            cVar.writeInt(size);
        }
        int size2 = cVar.f51585a.size();
        cVar.oc(this.f51561h == ByteOrder.BIG_ENDIAN ? f51525w6 : f51516v6);
        cVar.a(this.f51561h);
        cVar.d(42);
        cVar.c(8L);
        int i16 = 0;
        while (i16 < f51429k7.length) {
            if (this.f51559f[i16].isEmpty()) {
                j10 = j11;
            } else {
                cVar.d(this.f51559f[i16].size());
                int size3 = iArr[i16] + 2 + (this.f51559f[i16].size() * 12) + 4;
                for (Map.Entry<String, d> entry : this.f51559f[i16].entrySet()) {
                    int i17 = f51453n7[i16].get(entry.getKey()).f51592a;
                    d value = entry.getValue();
                    int iP2 = value.p();
                    cVar.d(i17);
                    cVar.d(value.f51588a);
                    cVar.writeInt(value.f51589b);
                    if (iP2 > 4) {
                        cVar.c(size3);
                        size3 += iP2;
                    } else {
                        cVar.write(value.f51591d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.b(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i16 != 0 || this.f51559f[4].isEmpty()) {
                    j10 = 0;
                    cVar.c(0L);
                } else {
                    cVar.c(iArr[4]);
                    j10 = 0;
                }
                Iterator<Map.Entry<String, d>> it3 = this.f51559f[i16].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = it3.next().getValue().f51591d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
            i16++;
            j11 = j10;
        }
        if (this.f51562i) {
            cVar.write(K());
        }
        if (this.f51557d == 14 && size % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return size2;
    }

    private void K0(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f51569p = cVar.f51585a.size() + J0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.writeInt((int) crc32.getValue());
    }

    private void L0(c cVar) throws IOException {
        cVar.writeInt(this.f51574u.f51591d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.writeInt(f51346a6);
        G0(crc32, f51346a6);
        byte[] bArr = f51380e6;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f51574u.f51591d);
        crc32.update(this.f51574u.f51591d);
        cVar.writeInt((int) crc32.getValue());
        this.f51575v = true;
    }

    private void M(b bVar) throws Throwable {
        if (f51527x) {
            Objects.toString(bVar);
        }
        bVar.e(ByteOrder.LITTLE_ENDIAN);
        bVar.f(f51388f6.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f51396g6;
        bVar.f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f51412i6, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f51485r7;
                    if (androidx.exifinterface.media.b.h(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f51569p = i12;
                    n0(bArrCopyOfRange, 0);
                    D0(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.f(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    private static int N(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) ? 2 : 1;
        }
        return 3;
    }

    private static Pair<Integer, Integer> O(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairO = O(strArrSplit[0]);
            if (((Integer) pairO.first).intValue() == 2) {
                return pairO;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairO2 = O(strArrSplit[i10]);
                int iIntValue = (((Integer) pairO2.first).equals(pairO.first) || ((Integer) pairO2.second).equals(pairO.first)) ? ((Integer) pairO.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairO.second).intValue() == -1 || !(((Integer) pairO2.first).equals(pairO.second) || ((Integer) pairO2.second).equals(pairO.second))) ? -1 : ((Integer) pairO.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairO = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairO = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairO;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    if (j10 < 0 || j10 > okhttp3.internal.ws.g.f334653t) {
                        return j10 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= g3.f12256c && j12 <= g3.f12256c) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void P(b bVar, HashMap<String, d> map) throws Throwable {
        d dVar = map.get(O);
        d dVar2 = map.get(P);
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.f51561h);
        int iM2 = dVar2.m(this.f51561h);
        if (this.f51557d == 7) {
            iM += this.f51570q;
        }
        if (iM <= 0 || iM2 <= 0) {
            return;
        }
        this.f51562i = true;
        if (this.f51554a == null && this.f51556c == null && this.f51555b == null) {
            byte[] bArr = new byte[iM2];
            bVar.f(iM);
            bVar.readFully(bArr);
            this.f51567n = bArr;
        }
        this.f51565l = iM;
        this.f51566m = iM2;
    }

    private void Q(b bVar, HashMap<String, d> map) throws IOException {
        d dVar = map.get(L);
        d dVar2 = map.get(N);
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrD = androidx.exifinterface.media.b.d(dVar.o(this.f51561h));
        long[] jArrD2 = androidx.exifinterface.media.b.d(dVar2.o(this.f51561h));
        if (jArrD == null || jArrD.length == 0 || jArrD2 == null || jArrD2.length == 0 || jArrD.length != jArrD2.length) {
            return;
        }
        long j10 = 0;
        for (long j11 : jArrD2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f51564k = true;
        this.f51563j = true;
        this.f51562i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jArrD.length; i13++) {
            int i14 = (int) jArrD[i13];
            int i15 = (int) jArrD2[i13];
            if (i13 < jArrD.length - 1 && i14 + i15 != jArrD[i13 + 1]) {
                this.f51564k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                return;
            }
            try {
                bVar.f(i16);
                int i17 = i11 + i16;
                byte[] bArr2 = new byte[i15];
                bVar.readFully(bArr2);
                i11 = i17 + i15;
                System.arraycopy(bArr2, 0, bArr, i12, i15);
                i12 += i15;
            } catch (EOFException unused) {
                return;
            }
        }
        this.f51567n = bArr;
        if (this.f51564k) {
            this.f51565l = (int) jArrD[0];
            this.f51566m = i10;
        }
    }

    private void T(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f51556c = null;
        this.f51554a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (b0(fileInputStream2.getFD())) {
                    this.f51555b = fileInputStream2.getFD();
                } else {
                    this.f51555b = null;
                }
                i0(fileInputStream2);
                androidx.exifinterface.media.b.c(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.b.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private int V(byte[] bArr) throws Throwable {
        long j10;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                long length = bVar2.readInt();
                byte[] bArr2 = new byte[4];
                bVar2.readFully(bArr2);
                if (!Arrays.equals(bArr2, K5)) {
                    bVar2.close();
                    return 0;
                }
                if (length == 1) {
                    length = bVar2.readLong();
                    j10 = 16;
                    if (length < 16) {
                        bVar2.close();
                        return 0;
                    }
                } else {
                    j10 = 8;
                }
                if (length > bArr.length) {
                    length = bArr.length;
                }
                long j11 = length - j10;
                if (j11 < 8) {
                    bVar2.close();
                    return 0;
                }
                byte[] bArr3 = new byte[4];
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                for (long j12 = 0; j12 < j11 / 4; j12++) {
                    try {
                        bVar2.readFully(bArr3);
                        if (j12 != 1) {
                            if (Arrays.equals(bArr3, L5)) {
                                z10 = true;
                            } else if (Arrays.equals(bArr3, M5)) {
                                z11 = true;
                            } else if (Arrays.equals(bArr3, N5) || Arrays.equals(bArr3, O5)) {
                                z12 = true;
                            }
                            if (!z10) {
                                continue;
                            } else {
                                if (z11) {
                                    bVar2.close();
                                    return 12;
                                }
                                if (z12) {
                                    bVar2.close();
                                    return 15;
                                }
                            }
                        }
                    } catch (EOFException unused) {
                        bVar2.close();
                        return 0;
                    }
                }
                bVar2.close();
            } catch (Exception unused2) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused3) {
        } catch (Throwable th3) {
            th = th3;
        }
        return 0;
    }

    private static boolean W(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = H5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean X(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderM0 = m0(bVar2);
                this.f51561h = byteOrderM0;
                bVar2.e(byteOrderM0);
                short s10 = bVar2.readShort();
                boolean z10 = s10 == 20306 || s10 == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean Y(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = Y5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean Z(byte[] bArr) throws IOException {
        byte[] bytes = I5.getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean a0(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderM0 = m0(bVar2);
                this.f51561h = byteOrderM0;
                bVar2.e(byteOrderM0);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean b0(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean c0(HashMap<String, d> map) throws Throwable {
        d dVar;
        d dVar2 = map.get(A);
        if (dVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dVar2.o(this.f51561h);
        int[] iArr2 = f51491s5;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f51557d != 3 || (dVar = map.get(C)) == null) {
            return false;
        }
        int iM = dVar.m(this.f51561h);
        return (iM == 1 && Arrays.equals(iArr, f51507u5)) || (iM == 6 && Arrays.equals(iArr, iArr2));
    }

    private static boolean d0(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private void e() {
        String strM = m(f51446n0);
        if (strM != null && m(V) == null) {
            this.f51559f[0].put(V, d.e(strM));
        }
        if (m(f51536y) == null) {
            this.f51559f[0].put(f51536y, d.f(0L, this.f51561h));
        }
        if (m(f51545z) == null) {
            this.f51559f[0].put(f51545z, d.f(0L, this.f51561h));
        }
        if (m(D) == null) {
            this.f51559f[0].put(D, d.f(0L, this.f51561h));
        }
        if (m(P0) == null) {
            this.f51559f[1].put(P0, d.f(0L, this.f51561h));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean e0(String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        byte b10 = -1;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    b10 = 0;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    b10 = 1;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    b10 = 2;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    b10 = 3;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    b10 = 4;
                }
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    b10 = 5;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    b10 = 6;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    b10 = 7;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    b10 = 8;
                }
                break;
            case -879258763:
                if (lowerCase.equals(s0.X0)) {
                    b10 = 9;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    b10 = 10;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    b10 = 11;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    private String f(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private boolean f0(HashMap<String, d> map) {
        d dVar = map.get(f51545z);
        d dVar2 = map.get(f51536y);
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f51561h) <= 512 && dVar2.m(this.f51561h) <= 512;
    }

    private static double g(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d12 = d10 + (d11 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals(S4) && !str2.equals(U4)) {
                if (!str2.equals("N") && !str2.equals(T4)) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private boolean h0(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f51388f6;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f51396g6;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f51388f6.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    private void i(b bVar, c cVar, byte[] bArr) throws IOException {
        int i10 = bVar.readInt();
        cVar.write(bArr);
        cVar.writeInt(i10);
        if (i10 % 2 == 1) {
            i10++;
        }
        androidx.exifinterface.media.b.f(bVar, cVar, i10);
    }

    private void i0(InputStream inputStream) throws Throwable {
        for (int i10 = 0; i10 < f51429k7.length; i10++) {
            try {
                try {
                    this.f51559f[i10] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException unused) {
                    boolean z10 = f51527x;
                    e();
                    if (z10) {
                        l0();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                e();
                if (f51527x) {
                    l0();
                }
                throw th2;
            }
        }
        if (!this.f51558e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f51557d = A(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (E0(this.f51557d)) {
            i iVar = new i(inputStream);
            if (!this.f51558e) {
                int i11 = this.f51557d;
                if (i11 == 12 || i11 == 15) {
                    w(iVar, i11);
                } else if (i11 == 7) {
                    B(iVar);
                } else if (i11 == 10) {
                    G(iVar);
                } else {
                    E(iVar);
                }
            } else if (!H(iVar)) {
                e();
                if (f51527x) {
                    l0();
                    return;
                }
                return;
            }
            iVar.g(this.f51569p);
            D0(iVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f51557d;
            if (i12 == 4) {
                x(bVar, 0, 0);
            } else if (i12 == 13) {
                C(bVar);
            } else if (i12 == 9) {
                D(bVar);
            } else if (i12 == 14) {
                M(bVar);
            }
        }
        e();
        if (f51527x) {
            l0();
        }
    }

    private static Long j0(String str, String str2, String str3) {
        if (str != null && X7.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f51500t6.parse(str, parsePosition);
                if (date == null && (date = f51508u6.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    int i10 = 1;
                    String strSubstring = str3.substring(0, 1);
                    int i11 = Integer.parseInt(str3.substring(1, 3));
                    int i12 = Integer.parseInt(str3.substring(4, 6));
                    if ((org.slf4j.h.f339615a3.equals(strSubstring) || "-".equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i11 <= 14) {
                        int i13 = ((i11 * 60) + i12) * 60000;
                        if (!"-".equals(strSubstring)) {
                            i10 = -1;
                        }
                        time += (long) (i13 * i10);
                    }
                }
                if (str2 != null) {
                    time += androidx.exifinterface.media.b.g(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private void k0(b bVar) throws IOException {
        ByteOrder byteOrderM0 = m0(bVar);
        this.f51561h = byteOrderM0;
        bVar.e(byteOrderM0);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f51557d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.f(i12);
        }
    }

    private void l0() throws Throwable {
        for (int i10 = 0; i10 < this.f51559f.length; i10++) {
            this.f51559f[i10].size();
            for (Map.Entry<String, d> entry : this.f51559f[i10].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.n(this.f51561h);
            }
        }
    }

    private ByteOrder m0(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    private void n0(byte[] bArr, int i10) throws IOException {
        i iVar = new i(bArr);
        k0(iVar);
        o0(iVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c1  */
    private void o0(i iVar, int i10) throws IOException {
        int i11;
        long j10;
        boolean z10;
        int unsignedShort;
        long jD;
        this.f51560g.add(Integer.valueOf(iVar.b()));
        short s10 = iVar.readShort();
        if (s10 <= 0) {
            return;
        }
        short s11 = 0;
        while (s11 < s10) {
            int unsignedShort2 = iVar.readUnsignedShort();
            int unsignedShort3 = iVar.readUnsignedShort();
            int i12 = iVar.readInt();
            long jB = ((long) iVar.b()) + 4;
            f fVar = f51445m7[i10].get(Integer.valueOf(unsignedShort2));
            boolean z11 = f51527x;
            if (z11) {
                i11 = 4;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), fVar != null ? fVar.f51593b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i12));
            } else {
                i11 = 4;
            }
            if (fVar != null && unsignedShort3 > 0) {
                int[] iArr = O6;
                if (unsignedShort3 >= iArr.length) {
                    j10 = 0;
                } else if (fVar.a(unsignedShort3)) {
                    if (unsignedShort3 == 7) {
                        unsignedShort3 = fVar.f51594c;
                    }
                    j10 = ((long) i12) * ((long) iArr[unsignedShort3]);
                    z10 = j10 >= 0 && j10 <= g3.f12256c;
                } else {
                    if (z11) {
                        String str = N6[unsignedShort3];
                    }
                    j10 = 0;
                }
            } else {
                j10 = 0;
            }
            if (z10) {
                if (j10 > 4) {
                    int i13 = iVar.readInt();
                    if (this.f51557d == 7) {
                        if (f51422k0.equals(fVar.f51593b)) {
                            this.f51570q = i13;
                        } else if (i10 == 6 && f51424k2.equals(fVar.f51593b)) {
                            this.f51571r = i13;
                            this.f51572s = i12;
                            d dVarJ = d.j(6, this.f51561h);
                            d dVarF = d.f(this.f51571r, this.f51561h);
                            d dVarF2 = d.f(this.f51572s, this.f51561h);
                            this.f51559f[i11].put(B, dVarJ);
                            this.f51559f[i11].put(O, dVarF);
                            this.f51559f[i11].put(P, dVarF2);
                        }
                    }
                    iVar.g(i13);
                } else {
                    z11 = z11;
                    unsignedShort2 = unsignedShort2;
                }
                Integer num = f51469p7.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i11) {
                            jD = iVar.d();
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = iVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = iVar.readInt();
                        } else {
                            jD = -1;
                        }
                        if (z11) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(jD), fVar.f51593b);
                        }
                        if (jD > 0 || (iVar.a() != -1 && jD >= iVar.a())) {
                            if (z11) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Skip jump into the IFD since its offset is invalid: ");
                                sb2.append(jD);
                                if (iVar.a() != -1) {
                                    iVar.a();
                                }
                            }
                        } else if (!this.f51560g.contains(Integer.valueOf((int) jD))) {
                            iVar.g(jD);
                            o0(iVar, num.intValue());
                        }
                        iVar.g(jB);
                    } else {
                        unsignedShort = iVar.readUnsignedShort();
                    }
                    jD = unsignedShort;
                    if (z11) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(jD), fVar.f51593b);
                    }
                    if (jD > 0) {
                        if (z11) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Skip jump into the IFD since its offset is invalid: ");
                            sb3.append(jD);
                            if (iVar.a() != -1) {
                                iVar.a();
                            }
                        }
                    } else if (z11) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Skip jump into the IFD since its offset is invalid: ");
                        sb4.append(jD);
                        if (iVar.a() != -1) {
                            iVar.a();
                        }
                    }
                    iVar.g(jB);
                } else {
                    int iB = iVar.b() + this.f51569p;
                    byte[] bArr = new byte[(int) j10];
                    iVar.readFully(bArr);
                    d dVar = new d(unsignedShort3, i12, iB, bArr);
                    this.f51559f[i10].put(fVar.f51593b, dVar);
                    if (f51408i2.equals(fVar.f51593b)) {
                        this.f51557d = 3;
                    }
                    if (((X.equals(fVar.f51593b) || Y.equals(fVar.f51593b)) && dVar.n(this.f51561h).contains(W5)) || (B.equals(fVar.f51593b) && dVar.m(this.f51561h) == 65535)) {
                        this.f51557d = 8;
                    }
                    if (iVar.b() != jB) {
                        iVar.g(jB);
                    }
                }
            } else {
                iVar.g(jB);
                s11 = s11;
            }
            s11 = (short) (s11 + 1);
            s10 = s10;
        }
        int i14 = iVar.readInt();
        if (f51527x) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i14));
        }
        long j11 = i14;
        if (j11 <= 0 || this.f51560g.contains(Integer.valueOf(i14))) {
            return;
        }
        iVar.g(j11);
        if (this.f51559f[4].isEmpty()) {
            o0(iVar, 4);
        } else if (this.f51559f[5].isEmpty()) {
            o0(iVar, 5);
        }
    }

    private void p0(String str) {
        for (int i10 = 0; i10 < f51429k7.length; i10++) {
            this.f51559f[i10].remove(str);
        }
    }

    private void q0(int i10, String str, String str2) {
        if (!this.f51559f[i10].isEmpty() && this.f51559f[i10].get(str) != null) {
            HashMap<String, d> map = this.f51559f[i10];
            map.put(str2, map.get(str));
            this.f51559f[i10].remove(str);
        }
    }

    private void s0(i iVar, int i10) throws Throwable {
        d dVar = this.f51559f[i10].get(f51545z);
        d dVar2 = this.f51559f[i10].get(f51536y);
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f51559f[i10].get(O);
            d dVar4 = this.f51559f[i10].get(P);
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.f51561h);
            int iM2 = dVar3.m(this.f51561h);
            iVar.g(iM);
            byte[] bArr = new byte[iM2];
            iVar.readFully(bArr);
            x(new b(bArr), iM, i10);
        }
    }

    private d u(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (f51546z0.equals(str)) {
            str = A0;
        }
        if (f51504u2.equals(str)) {
            int i10 = 3 ^ 2;
            if (N(this.f51557d) == 2 && (dVar2 = this.f51574u) != null) {
                return dVar2;
            }
        }
        for (int i11 = 0; i11 < f51429k7.length; i11++) {
            d dVar3 = this.f51559f[i11].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!f51504u2.equals(str) || (dVar = this.f51574u) == null) {
            return null;
        }
        return dVar;
    }

    private void v0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr;
        if (f51527x) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        cVar.b(-1);
        cVar.b(-31);
        this.f51569p = J0(cVar);
        if (this.f51574u != null) {
            cVar.write(-1);
            cVar.b(-31);
            byte[] bArr2 = f51493s7;
            cVar.d(bArr2.length + 2 + this.f51574u.f51591d.length);
            cVar.write(bArr2);
            cVar.write(this.f51574u.f51591d);
            this.f51575v = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.b(-1);
                cVar.b(b10);
                androidx.exifinterface.media.b.e(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.b(-1);
                cVar.b(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.d(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr3, 0, Math.min(i10, 4096));
                    if (i11 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i11);
                    i10 -= i11;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = f51493s7;
                if (length >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = f51485r7;
                    bArr = length >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (androidx.exifinterface.media.b.h(bArr, f51485r7) || androidx.exifinterface.media.b.h(bArr, bArr4)) {
                        bVar.f(length - bArr.length);
                    }
                }
                cVar.b(-1);
                cVar.b(b10);
                cVar.d(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i12 = bVar.read(bArr3, 0, Math.min(length, 4096));
                    if (i12 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i12);
                    length -= i12;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void w(i iVar, int i10) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i10 == 15 && i12 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                androidx.exifinterface.media.b.a.a(mediaMetadataRetriever, new C0465a(iVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f51559f[0].put(f51536y, d.j(Integer.parseInt(strExtractMetadata), this.f51561h));
                }
                if (strExtractMetadata3 != null) {
                    this.f51559f[0].put(f51545z, d.j(Integer.parseInt(strExtractMetadata3), this.f51561h));
                }
                if (strExtractMetadata2 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata2);
                    if (i13 == 90) {
                        i11 = 6;
                    } else if (i13 != 180) {
                        i11 = i13 != 270 ? 1 : 8;
                    } else {
                        i11 = 3;
                    }
                    this.f51559f[0].put(D, d.j(i11, this.f51561h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata4);
                    int i15 = Integer.parseInt(strExtractMetadata5);
                    if (i15 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    iVar.g(i14);
                    byte[] bArr = new byte[6];
                    iVar.readFully(bArr);
                    int i16 = i14 + 6;
                    int i17 = i15 - 6;
                    if (!Arrays.equals(bArr, f51485r7)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i17];
                    iVar.readFully(bArr2);
                    this.f51569p = i16;
                    n0(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i18 = Integer.parseInt(strExtractMetadata8);
                    int i19 = Integer.parseInt(strExtractMetadata9);
                    long j10 = i18;
                    iVar.g(j10);
                    byte[] bArr3 = new byte[i19];
                    iVar.readFully(bArr3);
                    this.f51574u = new d(1, i19, j10, bArr3);
                    this.f51575v = true;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x007c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x002c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0066 -> B:10:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:44:0x0068
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void w0(java.io.InputStream r10, java.io.OutputStream r11) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = androidx.exifinterface.media.a.f51527x
            if (r0 == 0) goto La
            java.util.Objects.toString(r10)
            java.util.Objects.toString(r11)
        La:
            androidx.exifinterface.media.a$b r0 = new androidx.exifinterface.media.a$b
            r0.<init>(r10)
            androidx.exifinterface.media.a$c r10 = new androidx.exifinterface.media.a$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r10.<init>(r11, r1)
            byte[] r11 = androidx.exifinterface.media.a.Y5
            int r11 = r11.length
            r8 = 0
            androidx.exifinterface.media.b.f(r0, r10, r11)
            r8 = 4
            androidx.exifinterface.media.a$d r11 = r9.f51574u
            r1 = 1
            r2 = 0
            r8 = r8 ^ r2
            if (r11 != 0) goto L29
            boolean r11 = r9.f51575v
            if (r11 == 0) goto L66
        L29:
            r8 = 2
            r11 = r1
            r11 = r1
        L2c:
            r8 = 7
            if (r1 != 0) goto L38
            if (r11 == 0) goto L33
            r8 = 7
            goto L38
        L33:
            androidx.exifinterface.media.b.e(r0, r10)
            r8 = 5
            return
        L38:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L68
            r10.writeInt(r3)
            r10.writeInt(r4)
            int r3 = r3 + 4
            androidx.exifinterface.media.b.f(r0, r10, r3)
            int r3 = r9.f51569p
            if (r3 != 0) goto L59
            r9.K0(r10)
            r1 = r2
            r1 = r2
        L59:
            androidx.exifinterface.media.a$d r3 = r9.f51574u
            r8 = 3
            if (r3 == 0) goto L2c
            boolean r3 = r9.f51575v
            if (r3 != 0) goto L2c
            r8 = 7
            r9.L0(r10)
        L66:
            r11 = r2
            goto L2c
        L68:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L7c
            r8 = 1
            if (r1 == 0) goto L7c
            r9.K0(r10)
            int r3 = r3 + 4
            r0.f(r3)
            r8 = 1
            r1 = r2
            r1 = r2
            goto L2c
        L7c:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lb8
            byte[] r5 = androidx.exifinterface.media.a.f51380e6
            r8 = 0
            int r6 = r5.length
            r8 = 7
            if (r3 < r6) goto Lb8
            int r6 = r5.length
            r8 = 5
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            r8 = 3
            int r6 = r3 - r6
            r8 = 7
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto La8
            androidx.exifinterface.media.a$d r11 = r9.f51574u
            r8 = 7
            if (r11 == 0) goto La4
            r8 = 1
            r9.L0(r10)
        La4:
            r0.f(r6)
            goto L66
        La8:
            r10.writeInt(r3)
            r8 = 2
            r10.writeInt(r4)
            r10.write(r7)
            r8 = 2
            androidx.exifinterface.media.b.f(r0, r10, r6)
            goto L2c
        Lb8:
            r10.writeInt(r3)
            r10.writeInt(r4)
            r8 = 2
            int r3 = r3 + 4
            androidx.exifinterface.media.b.f(r0, r10, r3)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.w0(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[LOOP:0: B:10:0x0024->B:55:0x0112, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0065. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void x(androidx.exifinterface.media.a.b r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.x(androidx.exifinterface.media.a$b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0201 A[Catch: all -> 0x0063, Exception -> 0x0068, TryCatch #5 {Exception -> 0x0068, all -> 0x0063, blocks: (B:7:0x0034, B:9:0x0040, B:11:0x0054, B:12:0x0056, B:80:0x01e3, B:82:0x0201, B:83:0x020a, B:19:0x006c, B:21:0x007b, B:23:0x0083, B:25:0x0088, B:28:0x0098, B:30:0x00a3, B:31:0x00a8, B:32:0x00aa, B:36:0x00b8, B:37:0x00bd, B:38:0x00c1, B:39:0x00cd, B:41:0x00d5, B:45:0x00e3, B:47:0x00eb, B:50:0x00f4, B:52:0x0103, B:54:0x0113, B:69:0x0172, B:71:0x017e, B:72:0x0185, B:74:0x01bf, B:79:0x01dc, B:76:0x01cd, B:78:0x01d5, B:55:0x0128, B:56:0x012f, B:57:0x0130, B:59:0x013a, B:61:0x0140, B:65:0x0159, B:66:0x0161, B:67:0x016a), top: B:97:0x0034 }] */
    private void x0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iJ0;
        boolean z10;
        if (f51527x) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f51388f6;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        int i15 = bVar.readInt();
        byte[] bArr2 = f51396g6;
        bVar.f(bArr2.length);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i16 = this.f51569p;
                    if (i16 == 0) {
                        byte[] bArr3 = new byte[4];
                        bVar.readFully(bArr3);
                        byte[] bArr4 = f51436l6;
                        boolean z11 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i17 = bVar.readInt();
                            byte[] bArr5 = new byte[i17 % 2 == 1 ? i17 + 1 : i17];
                            bVar.readFully(bArr5);
                            byte b10 = (byte) (bArr5[0] | 8);
                            bArr5[0] = b10;
                            boolean z12 = ((b10 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.writeInt(i17);
                            cVar2.write(bArr5);
                            if (z12) {
                                h(bVar, cVar2, f51460o6, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    try {
                                        bVar.readFully(bArr6);
                                        z10 = !Arrays.equals(bArr6, f51468p6);
                                    } catch (EOFException unused) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        break;
                                    } else {
                                        i(bVar, cVar2, bArr6);
                                    }
                                }
                                iJ0 = J0(cVar2);
                            } else {
                                h(bVar, cVar2, f51452n6, f51444m6);
                                iJ0 = J0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = f51452n6;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f51444m6)) {
                                int i18 = bVar.readInt();
                                int i19 = i18 % 2 == 1 ? i18 + 1 : i18;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.readFully(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    bVar.readFully(bArr9);
                                    if (!Arrays.equals(f51420j6, bArr9)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    i13 = bVar.readInt();
                                    i10 = -1;
                                    i12 = (i13 >> 16) & 16383;
                                    i11 = i19 - 10;
                                    i14 = i13 & 16383;
                                    z11 = false;
                                } else {
                                    i10 = -1;
                                    if (!Arrays.equals(bArr3, f51444m6)) {
                                        i11 = i19;
                                        i12 = 0;
                                        i13 = 0;
                                        z11 = false;
                                        i14 = 0;
                                    } else {
                                        if (bVar.readByte() != 47) {
                                            throw new IOException("Error checking VP8L signature");
                                        }
                                        i13 = bVar.readInt();
                                        int i20 = (i13 & 16383) + 1;
                                        int i21 = ((i13 & 268419072) >>> 14) + 1;
                                        if ((i13 & 268435456) == 0) {
                                            z11 = false;
                                        }
                                        i11 = i19 - 5;
                                        i14 = i20;
                                        i12 = i21;
                                    }
                                }
                                cVar2.write(bArr4);
                                cVar2.writeInt(10);
                                byte[] bArr10 = new byte[10];
                                if (z11) {
                                    bArr10[0] = (byte) (bArr10[0] | com.google.common.base.c.f116465r);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i22 = i14 - 1;
                                int i23 = i12 - 1;
                                bArr10[4] = (byte) i22;
                                bArr10[5] = (byte) (i22 >> 8);
                                bArr10[6] = (byte) (i22 >> 16);
                                bArr10[7] = (byte) i23;
                                bArr10[8] = (byte) (i23 >> 8);
                                bArr10[9] = (byte) (i23 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.writeInt(i18);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(f51420j6);
                                    cVar2.writeInt(i13);
                                } else if (Arrays.equals(bArr3, f51444m6)) {
                                    cVar2.write(47);
                                    cVar2.writeInt(i13);
                                }
                                androidx.exifinterface.media.b.f(bVar, cVar2, i11);
                                iJ0 = J0(cVar2);
                            } else {
                                iJ0 = -1;
                                i10 = -1;
                            }
                        }
                        androidx.exifinterface.media.b.f(bVar, cVar2, (i15 + 8) - bVar.b());
                        int size = byteArrayOutputStream2.size();
                        byte[] bArr11 = f51396g6;
                        cVar.writeInt(size + bArr11.length);
                        cVar.write(bArr11);
                        if (iJ0 != i10) {
                            this.f51569p = cVar.f51585a.size() + iJ0;
                        }
                        byteArrayOutputStream2.writeTo(cVar);
                        androidx.exifinterface.media.b.e(bVar, cVar);
                        androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                    }
                    androidx.exifinterface.media.b.f(bVar, cVar2, (i16 - ((bArr.length + 4) + bArr2.length)) - 8);
                    bVar.f(4);
                    int i24 = bVar.readInt();
                    if (i24 % 2 != 0) {
                        i24++;
                    }
                    bVar.f(i24);
                    iJ0 = J0(cVar2);
                    i10 = -1;
                    androidx.exifinterface.media.b.f(bVar, cVar2, (i15 + 8) - bVar.b());
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr12 = f51396g6;
                    cVar.writeInt(size2 + bArr12.length);
                    cVar.write(bArr12);
                    if (iJ0 != i10) {
                        this.f51569p = cVar.f51585a.size() + iJ0;
                    }
                    byteArrayOutputStream2.writeTo(cVar);
                    androidx.exifinterface.media.b.e(bVar, cVar);
                    androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    androidx.exifinterface.media.b.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @b1({b1.a.LIBRARY})
    public void A0(Long l10) {
        if (l10 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l10.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l10.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = p.f99189d0 + string;
        }
        z0(V, f51500t6.format(new Date(l10.longValue())));
        z0(f51486s0, string);
    }

    public void B0(Location location) {
        if (location == null) {
            return;
        }
        z0(Z1, location.getProvider());
        C0(location.getLatitude(), location.getLongitude());
        y0(location.getAltitude());
        z0(K1, "K");
        z0(L1, h.b((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f51500t6.format(new Date(location.getTime())).split("\\s+", -1);
        z0(f51351b2, strArrSplit[0]);
        z0(F1, strArrSplit[1]);
    }

    public void C0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        z0(f51547z1, d10 >= 0.0d ? "N" : S4);
        z0(A1, f(Math.abs(d10)));
        z0(B1, d11 >= 0.0d ? T4 : U4);
        z0(C1, f(Math.abs(d11)));
    }

    public int F() {
        switch (p(D, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] I() {
        int i10 = this.f51568o;
        if (i10 == 6 || i10 == 7) {
            return K();
        }
        return null;
    }

    public Bitmap J() throws Throwable {
        if (!this.f51562i) {
            return null;
        }
        if (this.f51567n == null) {
            this.f51567n = K();
        }
        int i10 = this.f51568o;
        if (i10 == 6 || i10 == 7) {
            return BitmapFactory.decodeByteArray(this.f51567n, 0, this.f51566m);
        }
        if (i10 == 1) {
            int length = this.f51567n.length / 3;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                byte[] bArr = this.f51567n;
                int i12 = i11 * 3;
                iArr[i11] = (bArr[i12] << com.google.common.base.c.f116465r) + (bArr[i12 + 1] << 8) + bArr[i12 + 2];
            }
            d dVar = this.f51559f[4].get(f51384f2);
            d dVar2 = this.f51559f[4].get(f51392g2);
            if (dVar != null && dVar2 != null) {
                return Bitmap.createBitmap(iArr, dVar2.m(this.f51561h), dVar.m(this.f51561h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    public byte[] K() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        InputStream inputStream = null;
        if (!this.f51562i) {
            return null;
        }
        byte[] bArr = this.f51567n;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.f51556c;
            if (fileInputStream != null) {
                try {
                    if (!fileInputStream.markSupported()) {
                        androidx.exifinterface.media.b.c(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                } catch (Exception unused) {
                    fileDescriptor = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptor = null;
                    inputStream = fileInputStream;
                    androidx.exifinterface.media.b.c(inputStream);
                    if (fileDescriptor != null) {
                        androidx.exifinterface.media.b.b(fileDescriptor);
                    }
                    throw th;
                }
                androidx.exifinterface.media.b.c(fileInputStream);
                if (fileDescriptor != null) {
                    androidx.exifinterface.media.b.b(fileDescriptor);
                }
                return null;
            }
            if (this.f51554a != null) {
                fileInputStream = new FileInputStream(this.f51554a);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorDup = Os.dup(this.f51555b);
                try {
                    Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = new FileInputStream(fileDescriptorDup);
                } catch (Exception unused2) {
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = fileDescriptorDup;
                    androidx.exifinterface.media.b.c(inputStream);
                    if (fileDescriptor != null) {
                        androidx.exifinterface.media.b.b(fileDescriptor);
                    }
                    throw th;
                }
            }
            try {
                b bVar = new b(fileInputStream);
                bVar.f(this.f51565l + this.f51569p);
                byte[] bArr2 = new byte[this.f51566m];
                bVar.readFully(bArr2);
                this.f51567n = bArr2;
                androidx.exifinterface.media.b.c(fileInputStream);
                if (fileDescriptor != null) {
                    androidx.exifinterface.media.b.b(fileDescriptor);
                }
                return bArr2;
            } catch (Exception unused3) {
            } catch (Throwable th4) {
                th = th4;
                inputStream = fileInputStream;
                androidx.exifinterface.media.b.c(inputStream);
                if (fileDescriptor != null) {
                    androidx.exifinterface.media.b.b(fileDescriptor);
                }
                throw th;
            }
        } catch (Exception unused4) {
            fileInputStream = null;
            fileDescriptor = null;
        } catch (Throwable th5) {
            th = th5;
            fileDescriptor = null;
        }
    }

    public long[] L() {
        if (this.f51573t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f51562i) {
            return null;
        }
        if (!this.f51563j || this.f51564k) {
            return new long[]{this.f51565l + this.f51569p, this.f51566m};
        }
        return null;
    }

    public boolean R(String str) {
        return u(str) != null;
    }

    public boolean S() {
        return this.f51562i;
    }

    public boolean U() {
        int iP = p(D, 1);
        return iP == 2 || iP == 7 || iP == 4 || iP == 5;
    }

    public boolean g0() {
        int i10 = 3 | 0;
        if (!this.f51562i) {
            return false;
        }
        int i11 = this.f51568o;
        return i11 == 6 || i11 == 7;
    }

    public void j() {
        int i10 = 1;
        switch (p(D, 1)) {
            case 1:
                i10 = 2;
                break;
            case 2:
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        z0(D, Integer.toString(i10));
    }

    public void k() {
        int i10 = 1;
        switch (p(D, 1)) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 0;
                break;
        }
        z0(D, Integer.toString(i10));
    }

    public double l(double d10) {
        double dO = o(E1, -1.0d);
        int iP = p(D1, -1);
        if (dO < 0.0d || iP < 0) {
            return d10;
        }
        return dO * ((double) (iP != 1 ? 1 : -1));
    }

    public String m(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarU = u(str);
        if (dVarU == null) {
            return null;
        }
        if (!str.equals(F1)) {
            if (!f51461o7.contains(str)) {
                return dVarU.n(this.f51561h);
            }
            try {
                return Double.toString(dVarU.l(this.f51561h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = dVarU.f51588a;
        if (i10 != 5 && i10 != 10) {
            return null;
        }
        h[] hVarArr = (h[]) dVarU.o(this.f51561h);
        if (hVarArr == null || hVarArr.length != 3) {
            Arrays.toString(hVarArr);
            return null;
        }
        h hVar = hVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (hVar.f51596a / hVar.f51597b));
        h hVar2 = hVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (hVar2.f51596a / hVar2.f51597b));
        h hVar3 = hVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (hVar3.f51596a / hVar3.f51597b)));
    }

    public byte[] n(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarU = u(str);
        if (dVarU != null) {
            return dVarU.f51591d;
        }
        return null;
    }

    public double o(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarU = u(str);
        if (dVarU != null) {
            try {
                return dVarU.l(this.f51561h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    public int p(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarU = u(str);
        if (dVarU != null) {
            try {
                return dVarU.m(this.f51561h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public long[] q(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f51573t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d dVarU = u(str);
        if (dVarU != null) {
            return new long[]{dVarU.f51590c, dVarU.f51591d.length};
        }
        return null;
    }

    @b1({b1.a.LIBRARY})
    public Long r() {
        return j0(m(V), m(f51486s0), m(f51462p0));
    }

    public void r0() {
        z0(D, Integer.toString(1));
    }

    @b1({b1.a.LIBRARY})
    public Long s() {
        return j0(m(f51454o0), m(f51502u0), m(f51478r0));
    }

    @b1({b1.a.LIBRARY})
    public Long t() {
        return j0(m(f51446n0), m(f51494t0), m(f51470q0));
    }

    public void t0(int i10) {
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int iP = p(D, 1);
        List<Integer> list = N2;
        int iIntValue = 0;
        if (list.contains(Integer.valueOf(iP))) {
            int iIndexOf = (list.indexOf(Integer.valueOf(iP)) + (i10 / 90)) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = O2;
            if (list2.contains(Integer.valueOf(iP))) {
                int iIndexOf2 = (list2.indexOf(Integer.valueOf(iP)) + (i10 / 90)) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        z0(D, Integer.toString(iIntValue));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x011e A[Catch: all -> 0x0128, Exception -> 0x012d, TryCatch #21 {Exception -> 0x012d, all -> 0x0128, blocks: (B:68:0x0119, B:70:0x011e, B:77:0x0143, B:76:0x0131), top: B:122:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0131 A[Catch: all -> 0x0128, Exception -> 0x012d, TryCatch #21 {Exception -> 0x012d, all -> 0x0128, blocks: (B:68:0x0119, B:70:0x011e, B:77:0x0143, B:76:0x0131), top: B:122:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0191  */
    public void u0() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        Exception exc;
        OutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        if (!d0(this.f51557d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f51555b == null && this.f51554a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f51562i && this.f51563j && !this.f51564k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        boolean z10 = true;
        this.f51573t = true;
        this.f51567n = I();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f51554a != null) {
                fileInputStream = new FileInputStream(this.f51554a);
            } else {
                Os.lseek(this.f51555b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f51555b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    androidx.exifinterface.media.b.e(fileInputStream, fileOutputStream);
                    androidx.exifinterface.media.b.c(fileInputStream);
                    androidx.exifinterface.media.b.c(fileOutputStream);
                    boolean z11 = false;
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f51554a != null) {
                                        fileOutputStream2 = new FileOutputStream(this.f51554a);
                                    } else {
                                        Os.lseek(this.f51555b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(this.f51555b);
                                    }
                                    try {
                                        bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i10 = this.f51557d;
                                                if (i10 == 4) {
                                                    v0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 13) {
                                                    w0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 14) {
                                                    x0(bufferedInputStream, bufferedOutputStream);
                                                }
                                                androidx.exifinterface.media.b.c(bufferedInputStream);
                                                androidx.exifinterface.media.b.c(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f51567n = null;
                                            } catch (Exception e10) {
                                                exc = e10;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.f51554a != null) {
                                                            fileOutputStream3 = new FileOutputStream(this.f51554a);
                                                        } else {
                                                            Os.lseek(this.f51555b, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream3 = new FileOutputStream(this.f51555b);
                                                        }
                                                        fileOutputStream2 = fileOutputStream3;
                                                        androidx.exifinterface.media.b.e(fileInputStream2, fileOutputStream2);
                                                        androidx.exifinterface.media.b.c(fileInputStream2);
                                                        androidx.exifinterface.media.b.c(fileOutputStream2);
                                                        throw new IOException("Failed to save new file", exc);
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        inputStream = fileInputStream2;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            try {
                                                                androidx.exifinterface.media.b.c(inputStream);
                                                                androidx.exifinterface.media.b.c(fileOutputStream2);
                                                                throw th;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                z11 = z10;
                                                                inputStream = bufferedInputStream;
                                                                androidx.exifinterface.media.b.c(inputStream);
                                                                androidx.exifinterface.media.b.c(bufferedOutputStream);
                                                                if (!z11) {
                                                                    fileCreateTempFile.delete();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        z10 = false;
                                                        inputStream = fileInputStream2;
                                                        androidx.exifinterface.media.b.c(inputStream);
                                                        androidx.exifinterface.media.b.c(fileOutputStream2);
                                                        throw th;
                                                    }
                                                } catch (Exception e12) {
                                                    e = e12;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    z10 = false;
                                                }
                                            }
                                        } catch (Exception e13) {
                                            bufferedOutputStream = null;
                                            inputStream = fileInputStream3;
                                            exc = e13;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            bufferedOutputStream = null;
                                            inputStream = bufferedInputStream;
                                            androidx.exifinterface.media.b.c(inputStream);
                                            androidx.exifinterface.media.b.c(bufferedOutputStream);
                                            if (!z11) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e14) {
                                        bufferedOutputStream = null;
                                        inputStream = fileInputStream3;
                                        exc = e14;
                                        bufferedInputStream = null;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    bufferedInputStream = null;
                                    bufferedOutputStream = null;
                                    inputStream = fileInputStream3;
                                    exc = e;
                                    fileOutputStream2 = bufferedOutputStream;
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    if (this.f51554a != null) {
                                        fileOutputStream3 = new FileOutputStream(this.f51554a);
                                    } else {
                                        Os.lseek(this.f51555b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.f51555b);
                                    }
                                    fileOutputStream2 = fileOutputStream3;
                                    androidx.exifinterface.media.b.e(fileInputStream2, fileOutputStream2);
                                    androidx.exifinterface.media.b.c(fileInputStream2);
                                    androidx.exifinterface.media.b.c(fileOutputStream2);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Exception e16) {
                                e = e16;
                                bufferedInputStream = null;
                                bufferedOutputStream = null;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            bufferedOutputStream = null;
                            androidx.exifinterface.media.b.c(inputStream);
                            androidx.exifinterface.media.b.c(bufferedOutputStream);
                            if (!z11) {
                                fileCreateTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Exception e17) {
                    e = e17;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th9) {
                        th = th9;
                        androidx.exifinterface.media.b.c(inputStream);
                        androidx.exifinterface.media.b.c(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    inputStream = fileInputStream;
                    androidx.exifinterface.media.b.c(inputStream);
                    androidx.exifinterface.media.b.c(fileOutputStream);
                    throw th;
                }
            } catch (Exception e18) {
                e = e18;
                fileOutputStream = null;
            } catch (Throwable th11) {
                th = th11;
                fileOutputStream = null;
            }
        } catch (Exception e19) {
            e = e19;
            fileOutputStream = null;
        } catch (Throwable th12) {
            th = th12;
            fileOutputStream = null;
        }
    }

    @e.a({"AutoBoxing"})
    public Long v() {
        String strM = m(f51351b2);
        String strM2 = m(F1);
        if (strM != null && strM2 != null) {
            Pattern pattern = X7;
            if (pattern.matcher(strM).matches() || pattern.matcher(strM2).matches()) {
                String str = strM + ' ' + strM2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = f51500t6.parse(str, parsePosition);
                    if (date == null && (date = f51508u6.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Deprecated
    public boolean y(float[] fArr) {
        double[] dArrZ = z();
        if (dArrZ == null) {
            return false;
        }
        fArr[0] = (float) dArrZ[0];
        fArr[1] = (float) dArrZ[1];
        return true;
    }

    public void y0(double d10) {
        String str = d10 >= 0.0d ? p.f99189d0 : "1";
        z0(E1, h.b(Math.abs(d10)).toString());
        z0(D1, str);
    }

    public double[] z() {
        String strM = m(A1);
        String strM2 = m(f51547z1);
        String strM3 = m(C1);
        String strM4 = m(B1);
        if (strM == null || strM2 == null || strM3 == null || strM4 == null) {
            return null;
        }
        try {
            return new double[]{g(strM, strM2), g(strM3, strM4)};
        } catch (IllegalArgumentException unused) {
            String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strM, strM2, strM3, strM4);
            return null;
        }
    }

    public void z0(String str, String str2) {
        f fVar;
        int i10;
        int i11;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (f51546z0.equals(str3)) {
            str3 = A0;
        }
        int i12 = 1;
        if (strReplaceAll != null) {
            if (f51461o7.contains(str3) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = h.b(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            } else if (str3.equals(F1)) {
                Matcher matcher = Y7.matcher(strReplaceAll);
                if (!matcher.find()) {
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if (V.equals(str3) || f51446n0.equals(str3) || f51454o0.equals(str3)) {
                boolean zFind = Z7.matcher(strReplaceAll).find();
                boolean zFind2 = f51348a8.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19) {
                    return;
                }
                if (!zFind && !zFind2) {
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        }
        if (f51504u2.equals(str3)) {
            boolean z10 = this.f51559f[0].containsKey(f51504u2) || this.f51559f[5].containsKey(f51504u2);
            int iN = N(this.f51557d);
            if ((iN == 2 && (this.f51574u != null || !z10)) || (iN == 3 && !z10)) {
                this.f51574u = strReplaceAll != null ? d.a(strReplaceAll) : null;
                return;
            }
        }
        int i13 = 0;
        while (i13 < f51429k7.length) {
            if ((i13 != 4 || this.f51562i) && (fVar = f51453n7[i13].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairO = O(strReplaceAll);
                    if (fVar.f51594c == ((Integer) pairO.first).intValue() || fVar.f51594c == ((Integer) pairO.second).intValue()) {
                        i10 = fVar.f51594c;
                    } else {
                        int i14 = fVar.f51595d;
                        if (i14 == -1 || !(i14 == ((Integer) pairO.first).intValue() || fVar.f51595d == ((Integer) pairO.second).intValue())) {
                            int i15 = fVar.f51594c;
                            if (i15 == i12 || i15 == 7 || i15 == 2) {
                                i10 = i15;
                            } else if (f51527x) {
                                String[] strArr = N6;
                                String str4 = strArr[fVar.f51594c];
                                if (fVar.f51595d != -1) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(", ");
                                    sb2.append(strArr[fVar.f51595d]);
                                }
                                String str5 = strArr[((Integer) pairO.first).intValue()];
                                if (((Integer) pairO.second).intValue() != -1) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(", ");
                                    sb3.append(strArr[((Integer) pairO.second).intValue()]);
                                }
                            }
                        } else {
                            i10 = fVar.f51595d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i12;
                            this.f51559f[i13].put(str3, d.a(strReplaceAll));
                            continue;
                        case 2:
                        case 7:
                            i11 = i12;
                            this.f51559f[i13].put(str3, d.e(strReplaceAll));
                            continue;
                        case 3:
                            i11 = i12;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i16 = 0; i16 < strArrSplit.length; i16++) {
                                iArr[i16] = Integer.parseInt(strArrSplit[i16]);
                            }
                            this.f51559f[i13].put(str3, d.k(iArr, this.f51561h));
                            continue;
                        case 4:
                            i11 = i12;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i17 = 0; i17 < strArrSplit2.length; i17++) {
                                jArr[i17] = Long.parseLong(strArrSplit2[i17]);
                            }
                            this.f51559f[i13].put(str3, d.g(jArr, this.f51561h));
                            continue;
                        case 5:
                            i11 = i12;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            h[] hVarArr = new h[strArrSplit3.length];
                            for (int i18 = 0; i18 < strArrSplit3.length; i18++) {
                                String[] strArrSplit4 = strArrSplit3[i18].split("/", -1);
                                hVarArr[i18] = new h((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i11]), null);
                            }
                            this.f51559f[i13].put(str3, d.i(hVarArr, this.f51561h));
                            continue;
                        case 9:
                            i11 = i12;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i19 = 0; i19 < strArrSplit5.length; i19++) {
                                iArr2[i19] = Integer.parseInt(strArrSplit5[i19]);
                            }
                            this.f51559f[i13].put(str3, d.c(iArr2, this.f51561h));
                            continue;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            h[] hVarArr2 = new h[strArrSplit6.length];
                            int i20 = 0;
                            while (i20 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i20].split("/", -1);
                                hVarArr2[i20] = new h((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i12]), null);
                                i20++;
                                i12 = i12;
                                strArrSplit6 = strArrSplit6;
                            }
                            i11 = i12;
                            this.f51559f[i13].put(str3, d.d(hVarArr2, this.f51561h));
                            continue;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i21 = 0; i21 < strArrSplit8.length; i21++) {
                                dArr[i21] = Double.parseDouble(strArrSplit8[i21]);
                            }
                            this.f51559f[i13].put(str3, d.b(dArr, this.f51561h));
                            break;
                    }
                } else {
                    this.f51559f[i13].remove(str3);
                }
                i11 = i12;
            } else {
                i11 = i12;
            }
            i13++;
            i12 = i11;
        }
    }

    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f51579f = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final DataInputStream f51580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f51581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f51582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f51583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51584e;

        b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f51584e = bArr.length;
        }

        public int a() {
            return this.f51584e;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f51580a.available();
        }

        public int b() {
            return this.f51581b;
        }

        public byte[] c() throws IOException {
            byte[] bArrCopyOf = new byte[1024];
            int i10 = 0;
            while (true) {
                if (i10 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i11 = this.f51580a.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
                if (i11 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i10);
                }
                i10 += i11;
                this.f51581b += i11;
            }
        }

        public long d() throws IOException {
            return ((long) readInt()) & k0.f265952a;
        }

        public void e(ByteOrder byteOrder) {
            this.f51582c = byteOrder;
        }

        public void f(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f51580a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f51583d == null) {
                        this.f51583d = new byte[8192];
                    }
                    iSkip = this.f51580a.read(this.f51583d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f51581b += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f51581b++;
            return this.f51580a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f51581b++;
            return this.f51580a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f51581b++;
            int i10 = this.f51580a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f51581b += 2;
            return this.f51580a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f51581b += i11;
            this.f51580a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f51581b += 4;
            int i10 = this.f51580a.read();
            int i11 = this.f51580a.read();
            int i12 = this.f51580a.read();
            int i13 = this.f51580a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f51582c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f51582c);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f51581b += 8;
            int i10 = this.f51580a.read();
            int i11 = this.f51580a.read();
            int i12 = this.f51580a.read();
            int i13 = this.f51580a.read();
            int i14 = this.f51580a.read();
            int i15 = this.f51580a.read();
            int i16 = this.f51580a.read();
            int i17 = this.f51580a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f51582c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f51582c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i10;
            this.f51581b += 2;
            int i11 = this.f51580a.read();
            int i12 = this.f51580a.read();
            if ((i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f51582c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                i10 = (i12 << 8) + i11;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    throw new IOException("Invalid byte order: " + this.f51582c);
                }
                i10 = (i11 << 8) + i12;
            }
            return (short) i10;
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f51581b += 2;
            return this.f51580a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f51581b++;
            return this.f51580a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f51581b += 2;
            int i10 = this.f51580a.read();
            int i11 = this.f51580a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f51582c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f51582c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f51580a.read(bArr, i10, i11);
            this.f51581b += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f51581b += bArr.length;
            this.f51580a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f51580a = dataInputStream;
            dataInputStream.mark(0);
            this.f51581b = 0;
            this.f51582c = byteOrder;
            this.f51584e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    private static class i extends b {
        i(byte[] bArr) throws IOException {
            super(bArr);
            this.f51580a.mark(Integer.MAX_VALUE);
        }

        public void g(long j10) throws IOException {
            int i10 = this.f51581b;
            if (i10 > j10) {
                this.f51581b = 0;
                this.f51580a.reset();
            } else {
                j10 -= (long) i10;
            }
            f((int) j10);
        }

        i(InputStream inputStream) throws IOException {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f51580a.mark(Integer.MAX_VALUE);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f51595d;

        f(String str, int i10, int i11) {
            this.f51593b = str;
            this.f51592a = i10;
            this.f51594c = i11;
            this.f51595d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f51594c;
            if (i12 != 7 && i10 != 7 && i12 != i10 && (i11 = this.f51595d) != i10) {
                if ((i12 == 4 || i11 == 4) && i10 == 3) {
                    return true;
                }
                if ((i12 == 9 || i11 == 9) && i10 == 8) {
                    return true;
                }
                return (i12 == 12 || i11 == 12) && i10 == 11;
            }
            return true;
        }

        f(String str, int i10, int i11, int i12) {
            this.f51593b = str;
            this.f51592a = i10;
            this.f51594c = i11;
            this.f51595d = i12;
        }
    }

    public a(String str) throws Throwable {
        f[][] fVarArr = f51429k7;
        this.f51559f = new HashMap[fVarArr.length];
        this.f51560g = new HashSet(fVarArr.length);
        this.f51561h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            T(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(FileDescriptor fileDescriptor) throws Throwable {
        boolean z10;
        f[][] fVarArr = f51429k7;
        this.f51559f = new HashMap[fVarArr.length];
        this.f51560g = new HashSet(fVarArr.length);
        this.f51561h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            FileInputStream fileInputStream = null;
            this.f51556c = null;
            this.f51554a = null;
            if (b0(fileDescriptor)) {
                this.f51555b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z10 = true;
                } catch (Exception e10) {
                    throw new IOException("Failed to duplicate file descriptor", e10);
                }
            } else {
                this.f51555b = null;
                z10 = false;
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileDescriptor);
                try {
                    i0(fileInputStream2);
                    androidx.exifinterface.media.b.c(fileInputStream2);
                    if (z10) {
                        androidx.exifinterface.media.b.b(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    androidx.exifinterface.media.b.c(fileInputStream);
                    if (z10) {
                        androidx.exifinterface.media.b.b(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    public a(InputStream inputStream, int i10) throws Throwable {
        f[][] fVarArr = f51429k7;
        this.f51559f = new HashMap[fVarArr.length];
        this.f51560g = new HashSet(fVarArr.length);
        this.f51561h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f51554a = null;
        boolean z10 = i10 == 1;
        this.f51558e = z10;
        if (z10) {
            this.f51556c = null;
            this.f51555b = null;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f51556c = (AssetManager.AssetInputStream) inputStream;
            this.f51555b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            if (b0(fileInputStream.getFD())) {
                this.f51556c = null;
                this.f51555b = fileInputStream.getFD();
            } else {
                this.f51556c = null;
                this.f51555b = null;
            }
        } else {
            this.f51556c = null;
            this.f51555b = null;
        }
        i0(inputStream);
    }
}

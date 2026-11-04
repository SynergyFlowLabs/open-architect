package androidx.media2.exoplayer.external.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.source.TrackGroup;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class DefaultTrackSelector extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f57037g = 0.98f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f57038h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f57039i = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m.b f57040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<Parameters> f57041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f57042f;

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parcelable.Creator<Parameters> CREATOR;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        public static final Parameters f57043j3;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        @Deprecated
        public static final Parameters f57044k3;

        @Deprecated
        public final boolean H1;
        public final boolean X;
        public final boolean Y;
        public final boolean Z;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f57045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f57046g;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        public final int f57047g3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f57048h;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> f57049h3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f57050i;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        private final SparseBooleanArray f57051i3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f57052j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f57053k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f57054l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f57055m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f57056n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f57057o;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f57058p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        @Deprecated
        public final boolean f57059p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        public final boolean f57060p2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f57061s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f57062t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f57063v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f57064w;

        class a implements Parcelable.Creator<Parameters> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Parameters createFromParcel(Parcel in) {
                return new Parameters(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Parameters[] newArray(int size) {
                return new Parameters[size];
            }
        }

        static {
            Parameters parameters = new Parameters();
            f57043j3 = parameters;
            f57044k3 = parameters;
            CREATOR = new a();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Parameters() {
            TrackSelectionParameters trackSelectionParameters = TrackSelectionParameters.f57112e;
            this(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, trackSelectionParameters.f57113a, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false, false, false, trackSelectionParameters.f57114b, trackSelectionParameters.f57115c, trackSelectionParameters.f57116d, false, false, true, 0, new SparseArray(), new SparseBooleanArray());
        }

        private static boolean e(SparseBooleanArray first, SparseBooleanArray second) {
            int size = first.size();
            if (second.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (second.indexOfKey(first.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean f(SparseArray<Map<TrackGroupArray, SelectionOverride>> first, SparseArray<Map<TrackGroupArray, SelectionOverride>> second) {
            int size = first.size();
            if (second.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = second.indexOfKey(first.keyAt(i10));
                if (iIndexOfKey < 0 || !g(first.valueAt(i10), second.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean g(Map<TrackGroupArray, SelectionOverride> first, Map<TrackGroupArray, SelectionOverride> second) {
            if (second.size() != first.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : first.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!second.containsKey(key) || !q0.b(entry.getValue(), second.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static Parameters i(Context context) {
            return f57043j3.a().M(context, true).a();
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> m(Parcel in) {
            int i10 = in.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = in.readInt();
                int i13 = in.readInt();
                HashMap map = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    map.put((TrackGroupArray) in.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) in.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(i12, map);
            }
            return sparseArray;
        }

        private static void n(Parcel dest, SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides) {
            int size = selectionOverrides.size();
            dest.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = selectionOverrides.keyAt(i10);
                Map<TrackGroupArray, SelectionOverride> mapValueAt = selectionOverrides.valueAt(i10);
                int size2 = mapValueAt.size();
                dest.writeInt(iKeyAt);
                dest.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : mapValueAt.entrySet()) {
                    dest.writeParcelable(entry.getKey(), 0);
                    dest.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters
        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(obj) && this.f57045f == parameters.f57045f && this.f57046g == parameters.f57046g && this.f57048h == parameters.f57048h && this.f57050i == parameters.f57050i && this.f57052j == parameters.f57052j && this.f57053k == parameters.f57053k && this.f57054l == parameters.f57054l && this.f57057o == parameters.f57057o && this.f57055m == parameters.f57055m && this.f57056n == parameters.f57056n && this.f57061s == parameters.f57061s && this.f57062t == parameters.f57062t && this.f57063v == parameters.f57063v && this.f57064w == parameters.f57064w && this.X == parameters.X && this.Y == parameters.Y && this.Z == parameters.Z && this.f57058p0 == parameters.f57058p0 && this.f57060p2 == parameters.f57060p2 && this.f57047g3 == parameters.f57047g3 && e(this.f57051i3, parameters.f57051i3) && f(this.f57049h3, parameters.f57049h3)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public d a() {
            return new d(this);
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f57045f) * 31) + this.f57046g) * 31) + this.f57048h) * 31) + this.f57050i) * 31) + (this.f57052j ? 1 : 0)) * 31) + (this.f57053k ? 1 : 0)) * 31) + (this.f57054l ? 1 : 0)) * 31) + (this.f57057o ? 1 : 0)) * 31) + this.f57055m) * 31) + this.f57056n) * 31) + this.f57061s) * 31) + this.f57062t) * 31) + (this.f57063v ? 1 : 0)) * 31) + (this.f57064w ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + (this.f57058p0 ? 1 : 0)) * 31) + (this.f57060p2 ? 1 : 0)) * 31) + this.f57047g3;
        }

        public final boolean j(int rendererIndex) {
            return this.f57051i3.get(rendererIndex);
        }

        @p0
        public final SelectionOverride k(int rendererIndex, TrackGroupArray groups) {
            Map<TrackGroupArray, SelectionOverride> map = this.f57049h3.get(rendererIndex);
            if (map != null) {
                return map.get(groups);
            }
            return null;
        }

        public final boolean l(int rendererIndex, TrackGroupArray groups) {
            Map<TrackGroupArray, SelectionOverride> map = this.f57049h3.get(rendererIndex);
            return map != null && map.containsKey(groups);
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f57045f);
            dest.writeInt(this.f57046g);
            dest.writeInt(this.f57048h);
            dest.writeInt(this.f57050i);
            q0.Y0(dest, this.f57052j);
            q0.Y0(dest, this.f57053k);
            q0.Y0(dest, this.f57054l);
            dest.writeInt(this.f57055m);
            dest.writeInt(this.f57056n);
            q0.Y0(dest, this.f57057o);
            dest.writeInt(this.f57061s);
            dest.writeInt(this.f57062t);
            q0.Y0(dest, this.f57063v);
            q0.Y0(dest, this.f57064w);
            q0.Y0(dest, this.X);
            q0.Y0(dest, this.Y);
            q0.Y0(dest, this.Z);
            q0.Y0(dest, this.f57058p0);
            q0.Y0(dest, this.f57060p2);
            dest.writeInt(this.f57047g3);
            n(dest, this.f57049h3);
            dest.writeSparseBooleanArray(this.f57051i3);
        }

        Parameters(int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, boolean exceedVideoConstraintsIfNecessary, boolean allowVideoMixedMimeTypeAdaptiveness, boolean allowVideoNonSeamlessAdaptiveness, int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange, @p0 String preferredAudioLanguage, int maxAudioChannelCount, int maxAudioBitrate, boolean exceedAudioConstraintsIfNecessary, boolean allowAudioMixedMimeTypeAdaptiveness, boolean allowAudioMixedSampleRateAdaptiveness, boolean allowAudioMixedChannelCountAdaptiveness, @p0 String preferredTextLanguage, boolean selectUndeterminedTextLanguage, int disabledTextTrackSelectionFlags, boolean forceLowestBitrate, boolean forceHighestSupportedBitrate, boolean exceedRendererCapabilitiesIfNecessary, int tunnelingAudioSessionId, SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides, SparseBooleanArray rendererDisabledFlags) {
            super(preferredAudioLanguage, preferredTextLanguage, selectUndeterminedTextLanguage, disabledTextTrackSelectionFlags);
            this.f57045f = maxVideoWidth;
            this.f57046g = maxVideoHeight;
            this.f57048h = maxVideoFrameRate;
            this.f57050i = maxVideoBitrate;
            this.f57052j = exceedVideoConstraintsIfNecessary;
            this.f57053k = allowVideoMixedMimeTypeAdaptiveness;
            this.f57054l = allowVideoNonSeamlessAdaptiveness;
            this.f57055m = viewportWidth;
            this.f57056n = viewportHeight;
            this.f57057o = viewportOrientationMayChange;
            this.f57061s = maxAudioChannelCount;
            this.f57062t = maxAudioBitrate;
            this.f57063v = exceedAudioConstraintsIfNecessary;
            this.f57064w = allowAudioMixedMimeTypeAdaptiveness;
            this.X = allowAudioMixedSampleRateAdaptiveness;
            this.Y = allowAudioMixedChannelCountAdaptiveness;
            this.Z = forceLowestBitrate;
            this.f57058p0 = forceHighestSupportedBitrate;
            this.f57060p2 = exceedRendererCapabilitiesIfNecessary;
            this.f57047g3 = tunnelingAudioSessionId;
            this.f57059p1 = allowVideoMixedMimeTypeAdaptiveness;
            this.H1 = allowVideoNonSeamlessAdaptiveness;
            this.f57049h3 = selectionOverrides;
            this.f57051i3 = rendererDisabledFlags;
        }

        Parameters(Parcel in) {
            super(in);
            this.f57045f = in.readInt();
            this.f57046g = in.readInt();
            this.f57048h = in.readInt();
            this.f57050i = in.readInt();
            this.f57052j = q0.E0(in);
            boolean zE0 = q0.E0(in);
            this.f57053k = zE0;
            boolean zE1 = q0.E0(in);
            this.f57054l = zE1;
            this.f57055m = in.readInt();
            this.f57056n = in.readInt();
            this.f57057o = q0.E0(in);
            this.f57061s = in.readInt();
            this.f57062t = in.readInt();
            this.f57063v = q0.E0(in);
            this.f57064w = q0.E0(in);
            this.X = q0.E0(in);
            this.Y = q0.E0(in);
            this.Z = q0.E0(in);
            this.f57058p0 = q0.E0(in);
            this.f57060p2 = q0.E0(in);
            this.f57047g3 = in.readInt();
            this.f57049h3 = m(in);
            this.f57051i3 = (SparseBooleanArray) q0.i(in.readSparseBooleanArray());
            this.f57059p1 = zE0;
            this.H1 = zE1;
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f57066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f57067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f57068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f57069e;

        class a implements Parcelable.Creator<SelectionOverride> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SelectionOverride createFromParcel(Parcel in) {
                return new SelectionOverride(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SelectionOverride[] newArray(int size) {
                return new SelectionOverride[size];
            }
        }

        public SelectionOverride(int groupIndex, int... tracks) {
            this(groupIndex, tracks, 2, 0);
        }

        public boolean a(int track) {
            for (int i10 : this.f57066b) {
                if (i10 == track) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.f57065a == selectionOverride.f57065a && Arrays.equals(this.f57066b, selectionOverride.f57066b) && this.f57068d == selectionOverride.f57068d && this.f57069e == selectionOverride.f57069e) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f57065a * 31) + Arrays.hashCode(this.f57066b)) * 31) + this.f57068d) * 31) + this.f57069e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f57065a);
            dest.writeInt(this.f57066b.length);
            dest.writeIntArray(this.f57066b);
            dest.writeInt(this.f57068d);
            dest.writeInt(this.f57069e);
        }

        public SelectionOverride(int groupIndex, int[] tracks, int reason, int data) {
            this.f57065a = groupIndex;
            int[] iArrCopyOf = Arrays.copyOf(tracks, tracks.length);
            this.f57066b = iArrCopyOf;
            this.f57067c = tracks.length;
            this.f57068d = reason;
            this.f57069e = data;
            Arrays.sort(iArrCopyOf);
        }

        SelectionOverride(Parcel in) {
            this.f57065a = in.readInt();
            int i10 = in.readByte();
            this.f57067c = i10;
            int[] iArr = new int[i10];
            this.f57066b = iArr;
            in.readIntArray(iArr);
            this.f57068d = in.readInt();
            this.f57069e = in.readInt();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f57071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final String f57072c;

        public b(int channelCount, int sampleRate, @p0 String mimeType) {
            this.f57070a = channelCount;
            this.f57071b = sampleRate;
            this.f57072c = mimeType;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f57070a == bVar.f57070a && this.f57071b == bVar.f57071b && TextUtils.equals(this.f57072c, bVar.f57072c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f57070a * 31) + this.f57071b) * 31;
            String str = this.f57072c;
            return i10 + (str != null ? str.hashCode() : 0);
        }
    }

    protected static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f57073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final String f57074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Parameters f57075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f57076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f57077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f57078f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f57079g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f57080h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f57081i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f57082j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f57083k;

        public c(Format format, Parameters parameters, int formatSupport) {
            this.f57075c = parameters;
            this.f57074b = DefaultTrackSelector.J(format.f53100g3);
            int i10 = 0;
            this.f57076d = DefaultTrackSelector.F(formatSupport, false);
            this.f57077e = DefaultTrackSelector.y(format, parameters.f57113a, false);
            boolean z10 = true;
            this.f57080h = (format.f53095c & 1) != 0;
            int i11 = format.Z;
            this.f57081i = i11;
            this.f57082j = format.f53112p0;
            int i12 = format.f53097e;
            this.f57083k = i12;
            if ((i12 != -1 && i12 > parameters.f57062t) || (i11 != -1 && i11 > parameters.f57061s)) {
                z10 = false;
            }
            this.f57073a = z10;
            String[] strArrC0 = q0.c0();
            int i13 = 0;
            while (i13 < strArrC0.length) {
                int iY = DefaultTrackSelector.y(format, strArrC0[i13], false);
                if (iY > 0) {
                    i10 = iY;
                    this.f57078f = i13;
                    this.f57079g = i10;
                }
                i13++;
            }
            i13 = Integer.MAX_VALUE;
            this.f57078f = i13;
            this.f57079g = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            int iR;
            int iQ;
            boolean z10 = this.f57076d;
            int i10 = -1;
            if (z10 != other.f57076d) {
                return z10 ? 1 : -1;
            }
            int i11 = this.f57077e;
            int i12 = other.f57077e;
            if (i11 != i12) {
                return DefaultTrackSelector.r(i11, i12);
            }
            boolean z11 = this.f57073a;
            if (z11 != other.f57073a) {
                return z11 ? 1 : -1;
            }
            if (this.f57075c.Z && (iQ = DefaultTrackSelector.q(this.f57083k, other.f57083k)) != 0) {
                return iQ > 0 ? -1 : 1;
            }
            boolean z12 = this.f57080h;
            if (z12 != other.f57080h) {
                return z12 ? 1 : -1;
            }
            int i13 = this.f57078f;
            int i14 = other.f57078f;
            if (i13 != i14) {
                return -DefaultTrackSelector.r(i13, i14);
            }
            int i15 = this.f57079g;
            int i16 = other.f57079g;
            if (i15 != i16) {
                return DefaultTrackSelector.r(i15, i16);
            }
            if (this.f57073a && this.f57076d) {
                i10 = 1;
            }
            int i17 = this.f57081i;
            int i18 = other.f57081i;
            if (i17 != i18) {
                iR = DefaultTrackSelector.r(i17, i18);
            } else {
                int i19 = this.f57082j;
                int i20 = other.f57082j;
                if (i19 != i20) {
                    iR = DefaultTrackSelector.r(i19, i20);
                } else {
                    if (!q0.b(this.f57074b, other.f57074b)) {
                        return 0;
                    }
                    iR = DefaultTrackSelector.r(this.f57083k, other.f57083k);
                }
            }
            return i10 * iR;
        }
    }

    public static final class d extends TrackSelectionParameters.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f57084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f57085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f57086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f57087h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f57088i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f57089j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f57090k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f57091l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f57092m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f57093n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f57094o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f57095p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f57096q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f57097r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f57098s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f57099t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f57100u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f57101v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f57102w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f57103x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> f57104y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final SparseBooleanArray f57105z;

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> l(SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>();
            for (int i10 = 0; i10 < selectionOverrides.size(); i10++) {
                sparseArray.put(selectionOverrides.keyAt(i10), new HashMap(selectionOverrides.valueAt(i10)));
            }
            return sparseArray;
        }

        public d A(int maxAudioChannelCount) {
            this.f57094o = maxAudioChannelCount;
            return this;
        }

        public d B(int maxVideoBitrate) {
            this.f57087h = maxVideoBitrate;
            return this;
        }

        public d C(int maxVideoFrameRate) {
            this.f57086g = maxVideoFrameRate;
            return this;
        }

        public d D(int maxVideoWidth, int maxVideoHeight) {
            this.f57084e = maxVideoWidth;
            this.f57085f = maxVideoHeight;
            return this;
        }

        public d E() {
            return D(androidx.media3.exoplayer.trackselection.a.E, androidx.media3.exoplayer.trackselection.a.F);
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public d c(@p0 String preferredAudioLanguage) {
            super.c(preferredAudioLanguage);
            return this;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public d d(@p0 String preferredTextLanguage) {
            super.d(preferredTextLanguage);
            return this;
        }

        public final d H(int rendererIndex, boolean disabled) {
            if (this.f57105z.get(rendererIndex) == disabled) {
                return this;
            }
            if (disabled) {
                this.f57105z.put(rendererIndex, true);
                return this;
            }
            this.f57105z.delete(rendererIndex);
            return this;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public d e(boolean selectUndeterminedTextLanguage) {
            super.e(selectUndeterminedTextLanguage);
            return this;
        }

        public final d J(int rendererIndex, TrackGroupArray groups, SelectionOverride override) {
            Map<TrackGroupArray, SelectionOverride> map = this.f57104y.get(rendererIndex);
            if (map == null) {
                map = new HashMap<>();
                this.f57104y.put(rendererIndex, map);
            }
            if (map.containsKey(groups) && q0.b(map.get(groups), override)) {
                return this;
            }
            map.put(groups, override);
            return this;
        }

        public d K(int tunnelingAudioSessionId) {
            this.f57103x = tunnelingAudioSessionId;
            return this;
        }

        public d L(int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange) {
            this.f57091l = viewportWidth;
            this.f57092m = viewportHeight;
            this.f57093n = viewportOrientationMayChange;
            return this;
        }

        public d M(Context context, boolean viewportOrientationMayChange) {
            Point pointW = q0.W(context);
            return L(pointW.x, pointW.y, viewportOrientationMayChange);
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Parameters a() {
            return new Parameters(this.f57084e, this.f57085f, this.f57086g, this.f57087h, this.f57088i, this.f57089j, this.f57090k, this.f57091l, this.f57092m, this.f57093n, this.f57117a, this.f57094o, this.f57095p, this.f57096q, this.f57097r, this.f57098s, this.f57099t, this.f57118b, this.f57119c, this.f57120d, this.f57100u, this.f57101v, this.f57102w, this.f57103x, this.f57104y, this.f57105z);
        }

        public final d g(int rendererIndex, TrackGroupArray groups) {
            Map<TrackGroupArray, SelectionOverride> map = this.f57104y.get(rendererIndex);
            if (map != null && map.containsKey(groups)) {
                map.remove(groups);
                if (map.isEmpty()) {
                    this.f57104y.remove(rendererIndex);
                }
            }
            return this;
        }

        public final d h() {
            if (this.f57104y.size() == 0) {
                return this;
            }
            this.f57104y.clear();
            return this;
        }

        public final d i(int rendererIndex) {
            Map<TrackGroupArray, SelectionOverride> map = this.f57104y.get(rendererIndex);
            if (map != null && !map.isEmpty()) {
                this.f57104y.remove(rendererIndex);
            }
            return this;
        }

        public d j() {
            return D(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public d k() {
            return L(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public d m(boolean allowAudioMixedChannelCountAdaptiveness) {
            this.f57099t = allowAudioMixedChannelCountAdaptiveness;
            return this;
        }

        public d n(boolean allowAudioMixedMimeTypeAdaptiveness) {
            this.f57097r = allowAudioMixedMimeTypeAdaptiveness;
            return this;
        }

        public d o(boolean allowAudioMixedSampleRateAdaptiveness) {
            this.f57098s = allowAudioMixedSampleRateAdaptiveness;
            return this;
        }

        @Deprecated
        public d p(boolean allowMixedMimeAdaptiveness) {
            n(allowMixedMimeAdaptiveness);
            r(allowMixedMimeAdaptiveness);
            return this;
        }

        @Deprecated
        public d q(boolean allowNonSeamlessAdaptiveness) {
            return s(allowNonSeamlessAdaptiveness);
        }

        public d r(boolean allowVideoMixedMimeTypeAdaptiveness) {
            this.f57089j = allowVideoMixedMimeTypeAdaptiveness;
            return this;
        }

        public d s(boolean allowVideoNonSeamlessAdaptiveness) {
            this.f57090k = allowVideoNonSeamlessAdaptiveness;
            return this;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public d b(int disabledTextTrackSelectionFlags) {
            super.b(disabledTextTrackSelectionFlags);
            return this;
        }

        public d u(boolean exceedAudioConstraintsIfNecessary) {
            this.f57096q = exceedAudioConstraintsIfNecessary;
            return this;
        }

        public d v(boolean exceedRendererCapabilitiesIfNecessary) {
            this.f57102w = exceedRendererCapabilitiesIfNecessary;
            return this;
        }

        public d w(boolean exceedVideoConstraintsIfNecessary) {
            this.f57088i = exceedVideoConstraintsIfNecessary;
            return this;
        }

        public d x(boolean forceHighestSupportedBitrate) {
            this.f57101v = forceHighestSupportedBitrate;
            return this;
        }

        public d y(boolean forceLowestBitrate) {
            this.f57100u = forceLowestBitrate;
            return this;
        }

        public d z(int maxAudioBitrate) {
            this.f57095p = maxAudioBitrate;
            return this;
        }

        @Deprecated
        public d() {
            this(Parameters.f57043j3);
        }

        public d(Context context) {
            this(Parameters.i(context));
        }

        private d(Parameters initialValues) {
            super(initialValues);
            this.f57084e = initialValues.f57045f;
            this.f57085f = initialValues.f57046g;
            this.f57086g = initialValues.f57048h;
            this.f57087h = initialValues.f57050i;
            this.f57088i = initialValues.f57052j;
            this.f57089j = initialValues.f57053k;
            this.f57090k = initialValues.f57054l;
            this.f57091l = initialValues.f57055m;
            this.f57092m = initialValues.f57056n;
            this.f57093n = initialValues.f57057o;
            this.f57094o = initialValues.f57061s;
            this.f57095p = initialValues.f57062t;
            this.f57096q = initialValues.f57063v;
            this.f57097r = initialValues.f57064w;
            this.f57098s = initialValues.X;
            this.f57099t = initialValues.Y;
            this.f57100u = initialValues.Z;
            this.f57101v = initialValues.f57058p0;
            this.f57102w = initialValues.f57060p2;
            this.f57103x = initialValues.f57047g3;
            this.f57104y = l(initialValues.f57049h3);
            this.f57105z = initialValues.f57051i3.clone();
        }
    }

    protected static final class e implements Comparable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f57106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f57107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f57108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f57109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f57110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f57111f;

        public e(Format format, Parameters parameters, int trackFormatSupport, @p0 String selectedAudioLanguage) {
            boolean z10 = false;
            this.f57107b = DefaultTrackSelector.F(trackFormatSupport, false);
            int i10 = format.f53095c & (~parameters.f57116d);
            boolean z11 = (i10 & 1) != 0;
            this.f57108c = z11;
            boolean z12 = (i10 & 2) != 0;
            int iY = DefaultTrackSelector.y(format, parameters.f57114b, parameters.f57115c);
            this.f57110e = iY;
            this.f57109d = (iY > 0 && !z12) || (iY == 0 && z12);
            int iY2 = DefaultTrackSelector.y(format, selectedAudioLanguage, DefaultTrackSelector.J(selectedAudioLanguage) == null);
            this.f57111f = iY2;
            if (iY > 0 || z11 || (z12 && iY2 > 0)) {
                z10 = true;
            }
            this.f57106a = z10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(e other) {
            boolean z10 = this.f57107b;
            if (z10 != other.f57107b) {
                return z10 ? 1 : -1;
            }
            int i10 = this.f57110e;
            int i11 = other.f57110e;
            if (i10 != i11) {
                return DefaultTrackSelector.r(i10, i11);
            }
            boolean z11 = this.f57108c;
            if (z11 != other.f57108c) {
                return z11 ? 1 : -1;
            }
            boolean z12 = this.f57109d;
            if (z12 != other.f57109d) {
                return z12 ? 1 : -1;
            }
            return DefaultTrackSelector.r(this.f57111f, other.f57111f);
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(new androidx.media2.exoplayer.external.trackselection.a.d());
    }

    private static List<Integer> D(TrackGroup group, int viewportWidth, int viewportHeight, boolean orientationMayChange) {
        int i10;
        ArrayList arrayList = new ArrayList(group.f55653a);
        for (int i11 = 0; i11 < group.f55653a; i11++) {
            arrayList.add(Integer.valueOf(i11));
        }
        if (viewportWidth != Integer.MAX_VALUE && viewportHeight != Integer.MAX_VALUE) {
            int i12 = Integer.MAX_VALUE;
            for (int i13 = 0; i13 < group.f55653a; i13++) {
                Format formatA = group.a(i13);
                int i14 = formatA.f53110n;
                if (i14 > 0 && (i10 = formatA.f53111o) > 0) {
                    Point pointZ = z(orientationMayChange, viewportWidth, viewportHeight, i14, i10);
                    int i15 = formatA.f53110n;
                    int i16 = formatA.f53111o;
                    int i17 = i15 * i16;
                    if (i15 >= ((int) (pointZ.x * f57037g)) && i16 >= ((int) (pointZ.y * f57037g)) && i17 < i12) {
                        i12 = i17;
                    }
                }
            }
            if (i12 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iK = group.a(((Integer) arrayList.get(size)).intValue()).K();
                    if (iK == -1 || iK > i12) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    protected static boolean F(int formatSupport, boolean allowExceedsCapabilities) {
        int i10 = formatSupport & 7;
        return i10 == 4 || (allowExceedsCapabilities && i10 == 3);
    }

    private static boolean G(Format format, int formatSupport, b configuration, int maxAudioBitrate, boolean allowMixedMimeTypeAdaptiveness, boolean allowMixedSampleRateAdaptiveness, boolean allowAudioMixedChannelCountAdaptiveness) {
        int i10;
        String str;
        int i11;
        if (F(formatSupport, false) && (((i10 = format.f53097e) == -1 || i10 <= maxAudioBitrate) && ((allowAudioMixedChannelCountAdaptiveness || ((i11 = format.Z) != -1 && i11 == configuration.f57070a)) && (allowMixedMimeTypeAdaptiveness || ((str = format.f53103i) != null && TextUtils.equals(str, configuration.f57072c)))))) {
            if (allowMixedSampleRateAdaptiveness) {
                return true;
            }
            int i12 = format.f53112p0;
            if (i12 != -1 && i12 == configuration.f57071b) {
                return true;
            }
        }
        return false;
    }

    private static boolean H(Format format, @p0 String mimeType, int formatSupport, int requiredAdaptiveSupport, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate) {
        int i10;
        int i11;
        int i12;
        if (F(formatSupport, false) && (formatSupport & requiredAdaptiveSupport) != 0 && ((mimeType == null || q0.b(format.f53103i, mimeType)) && (((i10 = format.f53110n) == -1 || i10 <= maxVideoWidth) && ((i11 = format.f53111o) == -1 || i11 <= maxVideoHeight)))) {
            float f10 = format.f53115s;
            if ((f10 == -1.0f || f10 <= maxVideoFrameRate) && ((i12 = format.f53097e) == -1 || i12 <= maxVideoBitrate)) {
                return true;
            }
        }
        return false;
    }

    private static void I(i.a mappedTrackInfo, int[][][] renderererFormatSupports, v0[] rendererConfigurations, m[] trackSelections, int tunnelingAudioSessionId) {
        boolean z10;
        if (tunnelingAudioSessionId == 0) {
            return;
        }
        boolean z11 = false;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i10 >= mappedTrackInfo.c()) {
                z10 = true;
                break;
            }
            int iE = mappedTrackInfo.e(i10);
            m mVar = trackSelections[i10];
            if ((iE == 1 || iE == 2) && mVar != null && K(renderererFormatSupports[i10], mappedTrackInfo.g(i10), mVar)) {
                if (iE == 1) {
                    if (i12 != -1) {
                        z10 = false;
                        break;
                    }
                    i12 = i10;
                } else {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i10;
                }
            }
            i10++;
        }
        if (i12 != -1 && i11 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            v0 v0Var = new v0(tunnelingAudioSessionId);
            rendererConfigurations[i12] = v0Var;
            rendererConfigurations[i11] = v0Var;
        }
    }

    @p0
    protected static String J(@p0 String language) {
        if (!TextUtils.isEmpty(language) && !TextUtils.equals(language, "und")) {
            return language;
        }
        return null;
    }

    private static boolean K(int[][] formatSupports, TrackGroupArray trackGroups, m selection) {
        if (selection == null) {
            return false;
        }
        int iB = trackGroups.b(selection.g());
        for (int i10 = 0; i10 < selection.length(); i10++) {
            if ((formatSupports[iB][selection.b(i10)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    @p0
    private static m.a L(TrackGroupArray groups, int[][] formatSupport, int mixedMimeTypeAdaptationSupports, Parameters params) {
        int i10 = params.f57054l ? 24 : 16;
        boolean z10 = params.f57053k && (mixedMimeTypeAdaptationSupports & i10) != 0;
        for (int i11 = 0; i11 < groups.f55657a; i11++) {
            TrackGroup trackGroupA = groups.a(i11);
            int[] iArrX = x(trackGroupA, formatSupport[i11], z10, i10, params.f57045f, params.f57046g, params.f57048h, params.f57050i, params.f57055m, params.f57056n, params.f57057o);
            if (iArrX.length > 0) {
                return new m.a(trackGroupA, iArrX);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    @p0
    private static m.a O(TrackGroupArray groups, int[][] formatSupports, Parameters params) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13 = -1;
        int i14 = -1;
        int iK = -1;
        int i15 = 0;
        TrackGroup trackGroup = null;
        int i16 = 0;
        int i17 = 0;
        while (i15 < groups.f55657a) {
            TrackGroup trackGroupA = groups.a(i15);
            List<Integer> listD = D(trackGroupA, params.f57055m, params.f57056n, params.f57057o);
            int[] iArr = formatSupports[i15];
            int i18 = 0;
            while (i18 < trackGroupA.f55653a) {
                if (F(iArr[i18], params.f57060p2)) {
                    Format formatA = trackGroupA.a(i18);
                    boolean z11 = true;
                    if (!listD.contains(Integer.valueOf(i18)) || (((i10 = formatA.f53110n) != i13 && i10 > params.f57045f) || ((i11 = formatA.f53111o) != i13 && i11 > params.f57046g))) {
                        z10 = false;
                    } else {
                        float f10 = formatA.f53115s;
                        if ((f10 == -1.0f || f10 <= params.f57048h) && ((i12 = formatA.f53097e) == i13 || i12 <= params.f57050i)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10 || params.f57052j) {
                        int i19 = z10 ? 2 : 1;
                        boolean zF = F(iArr[i18], false);
                        if (zF) {
                            i19 += 1000;
                        }
                        boolean z12 = i19 > i17;
                        if (i19 == i17) {
                            int iQ = q(formatA.f53097e, i14);
                            if (!params.Z || iQ == 0) {
                                int iK2 = formatA.K();
                                int iQ2 = iK2 != iK ? q(iK2, iK) : q(formatA.f53097e, i14);
                                if (!zF || !z10 ? iQ2 >= 0 : iQ2 <= 0) {
                                    z11 = false;
                                }
                            } else if (iQ >= 0) {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (z12) {
                            i14 = formatA.f53097e;
                            iK = formatA.K();
                            trackGroup = trackGroupA;
                            i16 = i18;
                            i17 = i19;
                        }
                    }
                }
                i18++;
                i13 = -1;
            }
            i15++;
            i13 = -1;
        }
        if (trackGroup == null) {
            return null;
        }
        return new m.a(trackGroup, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(int first, int second) {
        if (first == -1) {
            return second == -1 ? 0 : -1;
        }
        if (second == -1) {
            return 1;
        }
        return first - second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(int first, int second) {
        if (first > second) {
            return 1;
        }
        return second > first ? -1 : 0;
    }

    private static void t(TrackGroup group, int[] formatSupport, int requiredAdaptiveSupport, @p0 String mimeType, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, List<Integer> selectedTrackIndices) {
        for (int size = selectedTrackIndices.size() - 1; size >= 0; size--) {
            int iIntValue = selectedTrackIndices.get(size).intValue();
            if (!H(group.a(iIntValue), mimeType, formatSupport[iIntValue], requiredAdaptiveSupport, maxVideoWidth, maxVideoHeight, maxVideoFrameRate, maxVideoBitrate)) {
                selectedTrackIndices.remove(size);
            }
        }
    }

    private static int u(TrackGroup group, int[] formatSupport, b configuration, int maxAudioBitrate, boolean allowMixedMimeTypeAdaptiveness, boolean allowMixedSampleRateAdaptiveness, boolean allowAudioMixedChannelCountAdaptiveness) {
        int i10 = 0;
        for (int i11 = 0; i11 < group.f55653a; i11++) {
            if (G(group.a(i11), formatSupport[i11], configuration, maxAudioBitrate, allowMixedMimeTypeAdaptiveness, allowMixedSampleRateAdaptiveness, allowAudioMixedChannelCountAdaptiveness)) {
                i10++;
            }
        }
        return i10;
    }

    private static int[] v(TrackGroup group, int[] formatSupport, int maxAudioBitrate, boolean allowMixedMimeTypeAdaptiveness, boolean allowMixedSampleRateAdaptiveness, boolean allowAudioMixedChannelCountAdaptiveness) {
        int iU;
        HashSet hashSet = new HashSet();
        b bVar = null;
        int i10 = 0;
        for (int i11 = 0; i11 < group.f55653a; i11++) {
            Format formatA = group.a(i11);
            b bVar2 = new b(formatA.Z, formatA.f53112p0, formatA.f53103i);
            if (hashSet.add(bVar2) && (iU = u(group, formatSupport, bVar2, maxAudioBitrate, allowMixedMimeTypeAdaptiveness, allowMixedSampleRateAdaptiveness, allowAudioMixedChannelCountAdaptiveness)) > i10) {
                bVar = bVar2;
                i10 = iU;
            }
        }
        if (i10 <= 1) {
            return f57038h;
        }
        androidx.media2.exoplayer.external.util.a.g(bVar);
        int[] iArr = new int[i10];
        int i12 = 0;
        for (int i13 = 0; i13 < group.f55653a; i13++) {
            if (G(group.a(i13), formatSupport[i13], bVar, maxAudioBitrate, allowMixedMimeTypeAdaptiveness, allowMixedSampleRateAdaptiveness, allowAudioMixedChannelCountAdaptiveness)) {
                iArr[i12] = i13;
                i12++;
            }
        }
        return iArr;
    }

    private static int w(TrackGroup group, int[] formatSupport, int requiredAdaptiveSupport, @p0 String mimeType, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, List<Integer> selectedTrackIndices) {
        int i10 = 0;
        for (int i11 = 0; i11 < selectedTrackIndices.size(); i11++) {
            int iIntValue = selectedTrackIndices.get(i11).intValue();
            if (H(group.a(iIntValue), mimeType, formatSupport[iIntValue], requiredAdaptiveSupport, maxVideoWidth, maxVideoHeight, maxVideoFrameRate, maxVideoBitrate)) {
                i10++;
            }
        }
        return i10;
    }

    private static int[] x(TrackGroup group, int[] formatSupport, boolean allowMixedMimeTypes, int requiredAdaptiveSupport, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange) {
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        TrackGroup trackGroup;
        if (group.f55653a < 2) {
            return f57038h;
        }
        List<Integer> listD = D(group, viewportWidth, viewportHeight, viewportOrientationMayChange);
        if (listD.size() < 2) {
            return f57038h;
        }
        if (allowMixedMimeTypes) {
            i10 = maxVideoHeight;
            i11 = maxVideoWidth;
            i12 = maxVideoBitrate;
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            int i17 = 0;
            int i18 = 0;
            String str2 = null;
            while (i17 < listD.size()) {
                String str3 = group.a(listD.get(i17).intValue()).f53103i;
                if (hashSet.add(str3)) {
                    int i19 = maxVideoBitrate;
                    i15 = maxVideoFrameRate;
                    i16 = maxVideoHeight;
                    i13 = maxVideoWidth;
                    iArr = formatSupport;
                    trackGroup = group;
                    int iW = w(trackGroup, iArr, requiredAdaptiveSupport, str3, i13, i16, i15, i19, listD);
                    i14 = i19;
                    if (iW > i18) {
                        i18 = iW;
                        str2 = str3;
                    }
                } else {
                    int i20 = maxVideoHeight;
                    i13 = maxVideoWidth;
                    i14 = maxVideoBitrate;
                    i15 = maxVideoFrameRate;
                    i16 = i20;
                    iArr = formatSupport;
                    trackGroup = group;
                }
                i17++;
                int i21 = i15;
                maxVideoBitrate = i14;
                maxVideoWidth = i13;
                maxVideoHeight = i16;
                maxVideoFrameRate = i21;
                group = trackGroup;
                formatSupport = iArr;
            }
            i10 = maxVideoHeight;
            i11 = maxVideoWidth;
            i12 = maxVideoBitrate;
            str = str2;
        }
        t(group, formatSupport, requiredAdaptiveSupport, str, i11, i10, maxVideoFrameRate, i12, listD);
        return listD.size() < 2 ? f57038h : q0.T0(listD);
    }

    protected static int y(Format format, @p0 String language, boolean allowUndeterminedFormatLanguage) {
        if (!TextUtils.isEmpty(language) && language.equals(format.f53100g3)) {
            int i10 = 3 >> 4;
            return 4;
        }
        String strJ = J(language);
        String strJ2 = J(format.f53100g3);
        if (strJ2 == null || strJ == null) {
            return (allowUndeterminedFormatLanguage && strJ2 == null) ? 1 : 0;
        }
        if (strJ2.startsWith(strJ) || strJ.startsWith(strJ2)) {
            return 3;
        }
        return q0.P0(strJ2, "-")[0].equals(q0.P0(strJ, "-")[0]) ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0012  */
    private static Point z(boolean orientationMayChange, int viewportWidth, int viewportHeight, int videoWidth, int videoHeight) {
        if (orientationMayChange) {
            if ((videoWidth > videoHeight) == (viewportWidth > viewportHeight)) {
                viewportHeight = viewportWidth;
                viewportWidth = viewportHeight;
            }
        } else {
            viewportHeight = viewportWidth;
            viewportWidth = viewportHeight;
        }
        int i10 = videoWidth * viewportWidth;
        int i11 = videoHeight * viewportHeight;
        return i10 >= i11 ? new Point(viewportHeight, q0.k(i11, videoWidth)) : new Point(q0.k(i10, videoHeight), viewportWidth);
    }

    public Parameters A() {
        return this.f57041e.get();
    }

    @Deprecated
    public final boolean B(int rendererIndex) {
        return A().j(rendererIndex);
    }

    @p0
    @Deprecated
    public final SelectionOverride C(int rendererIndex, TrackGroupArray groups) {
        return A().k(rendererIndex, groups);
    }

    @Deprecated
    public final boolean E(int rendererIndex, TrackGroupArray groups) {
        return A().l(rendererIndex, groups);
    }

    protected m.a[] M(i.a mappedTrackInfo, int[][][] rendererFormatSupports, int[] rendererMixedMimeTypeAdaptationSupports, Parameters params) throws androidx.media2.exoplayer.external.i {
        String str;
        c cVar;
        DefaultTrackSelector defaultTrackSelector;
        int i10;
        String str2;
        int iC = mappedTrackInfo.c();
        m.a[] aVarArr = new m.a[iC];
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= iC) {
                break;
            }
            if (2 == mappedTrackInfo.e(i11)) {
                if (!z10) {
                    m.a aVarR = R(mappedTrackInfo.g(i11), rendererFormatSupports[i11], rendererMixedMimeTypeAdaptationSupports[i11], params, true);
                    aVarArr[i11] = aVarR;
                    z10 = aVarR != null;
                }
                z11 |= mappedTrackInfo.g(i11).f55657a > 0;
            }
            i11++;
        }
        DefaultTrackSelector defaultTrackSelector2 = this;
        int i12 = -1;
        String str3 = null;
        c cVar2 = null;
        int i13 = 0;
        while (i13 < iC) {
            if (1 == mappedTrackInfo.e(i13)) {
                str = str3;
                cVar = cVar2;
                i10 = i12;
                defaultTrackSelector = this;
                Pair<m.a, c> pairN = defaultTrackSelector.N(mappedTrackInfo.g(i13), rendererFormatSupports[i13], rendererMixedMimeTypeAdaptationSupports[i13], params, defaultTrackSelector2.f57042f || !z11);
                if (pairN != null && (cVar == null || ((c) pairN.second).compareTo(cVar) > 0)) {
                    if (i10 != -1) {
                        aVarArr[i10] = null;
                    }
                    m.a aVar = (m.a) pairN.first;
                    aVarArr[i13] = aVar;
                    str2 = aVar.f57218a.a(aVar.f57219b[0]).f53100g3;
                    cVar2 = (c) pairN.second;
                    i12 = i13;
                }
                i13++;
                String str4 = str2;
                defaultTrackSelector2 = defaultTrackSelector;
                str3 = str4;
            } else {
                str = str3;
                cVar = cVar2;
                defaultTrackSelector = defaultTrackSelector2;
                i10 = i12;
            }
            str2 = str;
            i12 = i10;
            cVar2 = cVar;
            i13++;
            String str5 = str2;
            defaultTrackSelector2 = defaultTrackSelector;
            str3 = str5;
        }
        String str6 = str3;
        DefaultTrackSelector defaultTrackSelector3 = defaultTrackSelector2;
        int i14 = -1;
        e eVar = null;
        for (int i15 = 0; i15 < iC; i15++) {
            int iE = mappedTrackInfo.e(i15);
            if (iE != 1 && iE != 2) {
                if (iE != 3) {
                    aVarArr[i15] = defaultTrackSelector3.P(iE, mappedTrackInfo.g(i15), rendererFormatSupports[i15], params);
                } else {
                    Pair<m.a, e> pairQ = defaultTrackSelector3.Q(mappedTrackInfo.g(i15), rendererFormatSupports[i15], params, str6);
                    if (pairQ != null && (eVar == null || ((e) pairQ.second).compareTo(eVar) > 0)) {
                        if (i14 != -1) {
                            aVarArr[i14] = null;
                        }
                        aVarArr[i15] = (m.a) pairQ.first;
                        eVar = (e) pairQ.second;
                        i14 = i15;
                    }
                }
            }
        }
        return aVarArr;
    }

    @p0
    protected Pair<m.a, c> N(TrackGroupArray groups, int[][] formatSupports, int mixedMimeTypeAdaptationSupports, Parameters params, boolean enableAdaptiveTrackSelection) throws androidx.media2.exoplayer.external.i {
        m.a aVar = null;
        int i10 = -1;
        int i11 = -1;
        c cVar = null;
        for (int i12 = 0; i12 < groups.f55657a; i12++) {
            TrackGroup trackGroupA = groups.a(i12);
            int[] iArr = formatSupports[i12];
            for (int i13 = 0; i13 < trackGroupA.f55653a; i13++) {
                if (F(iArr[i13], params.f57060p2)) {
                    c cVar2 = new c(trackGroupA.a(i13), params, iArr[i13]);
                    if ((cVar2.f57073a || params.f57063v) && (cVar == null || cVar2.compareTo(cVar) > 0)) {
                        i10 = i12;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        TrackGroup trackGroupA2 = groups.a(i10);
        if (!params.f57058p0 && !params.Z && enableAdaptiveTrackSelection) {
            int[] iArrV = v(trackGroupA2, formatSupports[i10], params.f57062t, params.f57064w, params.X, params.Y);
            if (iArrV.length > 0) {
                aVar = new m.a(trackGroupA2, iArrV);
            }
        }
        if (aVar == null) {
            aVar = new m.a(trackGroupA2, i11);
        }
        return Pair.create(aVar, (c) androidx.media2.exoplayer.external.util.a.g(cVar));
    }

    @p0
    protected m.a P(int trackType, TrackGroupArray groups, int[][] formatSupport, Parameters params) throws androidx.media2.exoplayer.external.i {
        TrackGroup trackGroup = null;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < groups.f55657a; i12++) {
            TrackGroup trackGroupA = groups.a(i12);
            int[] iArr = formatSupport[i12];
            for (int i13 = 0; i13 < trackGroupA.f55653a; i13++) {
                if (F(iArr[i13], params.f57060p2)) {
                    int i14 = (trackGroupA.a(i13).f53095c & 1) != 0 ? 2 : 1;
                    if (F(iArr[i13], false)) {
                        i14 += 1000;
                    }
                    if (i14 > i11) {
                        trackGroup = trackGroupA;
                        i10 = i13;
                        i11 = i14;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new m.a(trackGroup, i10);
    }

    @p0
    protected Pair<m.a, e> Q(TrackGroupArray groups, int[][] formatSupport, Parameters params, @p0 String selectedAudioLanguage) throws androidx.media2.exoplayer.external.i {
        int i10 = -1;
        TrackGroup trackGroup = null;
        e eVar = null;
        for (int i11 = 0; i11 < groups.f55657a; i11++) {
            TrackGroup trackGroupA = groups.a(i11);
            int[] iArr = formatSupport[i11];
            for (int i12 = 0; i12 < trackGroupA.f55653a; i12++) {
                if (F(iArr[i12], params.f57060p2)) {
                    e eVar2 = new e(trackGroupA.a(i12), params, iArr[i12], selectedAudioLanguage);
                    if (eVar2.f57106a && (eVar == null || eVar2.compareTo(eVar) > 0)) {
                        trackGroup = trackGroupA;
                        i10 = i12;
                        eVar = eVar2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return Pair.create(new m.a(trackGroup, i10), (e) androidx.media2.exoplayer.external.util.a.g(eVar));
    }

    @p0
    protected m.a R(TrackGroupArray groups, int[][] formatSupports, int mixedMimeTypeAdaptationSupports, Parameters params, boolean enableAdaptiveTrackSelection) throws androidx.media2.exoplayer.external.i {
        m.a aVarL = (params.f57058p0 || params.Z || !enableAdaptiveTrackSelection) ? null : L(groups, formatSupports, mixedMimeTypeAdaptationSupports, params);
        if (aVarL == null) {
            aVarL = O(groups, formatSupports, params);
        }
        return aVarL;
    }

    public void S(Parameters parameters) {
        androidx.media2.exoplayer.external.util.a.g(parameters);
        if (!this.f57041e.getAndSet(parameters).equals(parameters)) {
            c();
        }
    }

    public void T(d parametersBuilder) {
        S(parametersBuilder.a());
    }

    @Deprecated
    public final void U(int rendererIndex, boolean disabled) {
        T(m().H(rendererIndex, disabled));
    }

    @Deprecated
    public final void V(int rendererIndex, TrackGroupArray groups, SelectionOverride override) {
        T(m().J(rendererIndex, groups, override));
    }

    @Deprecated
    public void W(int tunnelingAudioSessionId) {
        T(m().K(tunnelingAudioSessionId));
    }

    @Override // androidx.media2.exoplayer.external.trackselection.i
    protected final Pair<v0[], m[]> j(i.a mappedTrackInfo, int[][][] rendererFormatSupports, int[] rendererMixedMimeTypeAdaptationSupports) throws androidx.media2.exoplayer.external.i {
        Parameters parameters = this.f57041e.get();
        int iC = mappedTrackInfo.c();
        m.a[] aVarArrM = M(mappedTrackInfo, rendererFormatSupports, rendererMixedMimeTypeAdaptationSupports, parameters);
        int i10 = 0;
        while (true) {
            if (i10 >= iC) {
                break;
            }
            if (parameters.j(i10)) {
                aVarArrM[i10] = null;
            } else {
                TrackGroupArray trackGroupArrayG = mappedTrackInfo.g(i10);
                if (parameters.l(i10, trackGroupArrayG)) {
                    SelectionOverride selectionOverrideK = parameters.k(i10, trackGroupArrayG);
                    aVarArrM[i10] = selectionOverrideK != null ? new m.a(trackGroupArrayG.a(selectionOverrideK.f57065a), selectionOverrideK.f57066b, selectionOverrideK.f57068d, Integer.valueOf(selectionOverrideK.f57069e)) : null;
                }
            }
            i10++;
        }
        m[] mVarArrB = this.f57040d.b(aVarArrM, a());
        v0[] v0VarArr = new v0[iC];
        for (int i11 = 0; i11 < iC; i11++) {
            v0VarArr[i11] = (parameters.j(i11) || (mappedTrackInfo.e(i11) != 6 && mVarArrB[i11] == null)) ? null : v0.f57728b;
        }
        I(mappedTrackInfo, rendererFormatSupports, v0VarArr, mVarArrB, parameters.f57047g3);
        return Pair.create(v0VarArr, mVarArrB);
    }

    public d m() {
        return A().a();
    }

    @Deprecated
    public final void n(int rendererIndex, TrackGroupArray groups) {
        T(m().g(rendererIndex, groups));
    }

    @Deprecated
    public final void o() {
        T(m().h());
    }

    @Deprecated
    public final void p(int rendererIndex) {
        T(m().i(rendererIndex));
    }

    public void s() {
        this.f57042f = true;
    }

    @Deprecated
    public DefaultTrackSelector(androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
        this(new androidx.media2.exoplayer.external.trackselection.a.d(bandwidthMeter));
    }

    @Deprecated
    public DefaultTrackSelector(m.b trackSelectionFactory) {
        this(Parameters.f57043j3, trackSelectionFactory);
    }

    public DefaultTrackSelector(Context context) {
        this(context, new androidx.media2.exoplayer.external.trackselection.a.d());
    }

    public DefaultTrackSelector(Context context, m.b trackSelectionFactory) {
        this(Parameters.i(context), trackSelectionFactory);
    }

    public DefaultTrackSelector(Parameters parameters, m.b trackSelectionFactory) {
        this.f57040d = trackSelectionFactory;
        this.f57041e = new AtomicReference<>(parameters);
    }
}

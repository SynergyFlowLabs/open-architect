package androidx.media2.exoplayer.external.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class TrackSelectionParameters implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f57113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f57114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TrackSelectionParameters f57112e = new TrackSelectionParameters();
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR = new a();

    class a implements Parcelable.Creator<TrackSelectionParameters> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters createFromParcel(Parcel in) {
            return new TrackSelectionParameters(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters[] newArray(int size) {
            return new TrackSelectionParameters[size];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        String f57117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        String f57118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f57119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f57120d;

        public b() {
            this(TrackSelectionParameters.f57112e);
        }

        public TrackSelectionParameters a() {
            return new TrackSelectionParameters(this.f57117a, this.f57118b, this.f57119c, this.f57120d);
        }

        public b b(int disabledTextTrackSelectionFlags) {
            this.f57120d = disabledTextTrackSelectionFlags;
            return this;
        }

        public b c(@p0 String preferredAudioLanguage) {
            this.f57117a = preferredAudioLanguage;
            return this;
        }

        public b d(@p0 String preferredTextLanguage) {
            this.f57118b = preferredTextLanguage;
            return this;
        }

        public b e(boolean selectUndeterminedTextLanguage) {
            this.f57119c = selectUndeterminedTextLanguage;
            return this;
        }

        b(TrackSelectionParameters initialValues) {
            this.f57117a = initialValues.f57113a;
            this.f57118b = initialValues.f57114b;
            this.f57119c = initialValues.f57115c;
            this.f57120d = initialValues.f57116d;
        }
    }

    TrackSelectionParameters() {
        this(null, null, false, 0);
    }

    public b a() {
        return new b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
            if (TextUtils.equals(this.f57113a, trackSelectionParameters.f57113a) && TextUtils.equals(this.f57114b, trackSelectionParameters.f57114b) && this.f57115c == trackSelectionParameters.f57115c && this.f57116d == trackSelectionParameters.f57116d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f57113a;
        int iHashCode = 0;
        int iHashCode2 = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f57114b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return ((((iHashCode2 + iHashCode) * 31) + (this.f57115c ? 1 : 0)) * 31) + this.f57116d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f57113a);
        dest.writeString(this.f57114b);
        q0.Y0(dest, this.f57115c);
        dest.writeInt(this.f57116d);
    }

    TrackSelectionParameters(@p0 String preferredAudioLanguage, @p0 String preferredTextLanguage, boolean selectUndeterminedTextLanguage, int disabledTextTrackSelectionFlags) {
        this.f57113a = q0.x0(preferredAudioLanguage);
        this.f57114b = q0.x0(preferredTextLanguage);
        this.f57115c = selectUndeterminedTextLanguage;
        this.f57116d = disabledTextTrackSelectionFlags;
    }

    TrackSelectionParameters(Parcel in) {
        this.f57113a = in.readString();
        this.f57114b = in.readString();
        this.f57115c = q0.E0(in);
        this.f57116d = in.readInt();
    }
}

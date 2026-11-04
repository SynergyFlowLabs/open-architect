package androidx.media2.exoplayer.external.metadata.scte35;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    public Format O0() {
        return androidx.media2.exoplayer.external.metadata.a.b(this);
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    public byte[] Y() {
        return androidx.media2.exoplayer.external.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName.length() != 0 ? "SCTE-35 splice command: type=".concat(simpleName) : new String("SCTE-35 splice command: type=");
    }
}

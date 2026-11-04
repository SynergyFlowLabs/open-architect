package androidx.media2.exoplayer.external.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Entry[] f55422a;

    public interface Entry extends Parcelable {
        @p0
        Format O0();

        @p0
        byte[] Y();
    }

    class a implements Parcelable.Creator<Metadata> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel in) {
            return new Metadata(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int size) {
            return new Metadata[size];
        }
    }

    public Metadata(Entry... entries) {
        this.f55422a = entries == null ? new Entry[0] : entries;
    }

    public Metadata a(Entry... entriesToAppend) {
        Entry[] entryArr = this.f55422a;
        Entry[] entryArr2 = (Entry[]) Arrays.copyOf(entryArr, entryArr.length + entriesToAppend.length);
        System.arraycopy(entriesToAppend, 0, entryArr2, this.f55422a.length, entriesToAppend.length);
        return new Metadata((Entry[]) q0.j(entryArr2));
    }

    public Metadata b(@p0 Metadata other) {
        return other == null ? this : a(other.f55422a);
    }

    public Entry c(int index) {
        return this.f55422a[index];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f55422a.length;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f55422a, ((Metadata) obj).f55422a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f55422a);
    }

    public String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.f55422a));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f55422a.length);
        for (Entry entry : this.f55422a) {
            dest.writeParcelable(entry, 0);
        }
    }

    public Metadata(List<? extends Entry> entries) {
        if (entries != null) {
            Entry[] entryArr = new Entry[entries.size()];
            this.f55422a = entryArr;
            entries.toArray(entryArr);
            return;
        }
        this.f55422a = new Entry[0];
    }

    Metadata(Parcel in) {
        this.f55422a = new Entry[in.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f55422a;
            if (i10 >= entryArr.length) {
                return;
            }
            entryArr[i10] = (Entry) in.readParcelable(Entry.class.getClassLoader());
            i10++;
        }
    }
}

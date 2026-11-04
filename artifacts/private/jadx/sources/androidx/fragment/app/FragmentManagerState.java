package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<String> f51721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<String> f51722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    BackStackRecordState[] f51723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f51724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f51725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<String> f51726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<BackStackState> f51727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f51728h;

    class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f51725e = null;
        this.f51726f = new ArrayList<>();
        this.f51727g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f51721a);
        parcel.writeStringList(this.f51722b);
        parcel.writeTypedArray(this.f51723c, i10);
        parcel.writeInt(this.f51724d);
        parcel.writeString(this.f51725e);
        parcel.writeStringList(this.f51726f);
        parcel.writeTypedList(this.f51727g);
        parcel.writeTypedList(this.f51728h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f51725e = null;
        this.f51726f = new ArrayList<>();
        this.f51727g = new ArrayList<>();
        this.f51721a = parcel.createStringArrayList();
        this.f51722b = parcel.createStringArrayList();
        this.f51723c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f51724d = parcel.readInt();
        this.f51725e = parcel.readString();
        this.f51726f = parcel.createStringArrayList();
        this.f51727g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f51728h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}

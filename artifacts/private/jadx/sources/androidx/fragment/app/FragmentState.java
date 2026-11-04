package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f51729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f51730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f51731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f51732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f51733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f51734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f51735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f51736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f51737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f51738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f51739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f51740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final String f51741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f51742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f51743o;

    class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    FragmentState(Fragment fragment) {
        this.f51729a = fragment.getClass().getName();
        this.f51730b = fragment.mWho;
        this.f51731c = fragment.mFromLayout;
        this.f51732d = fragment.mInDynamicContainer;
        this.f51733e = fragment.mFragmentId;
        this.f51734f = fragment.mContainerId;
        this.f51735g = fragment.mTag;
        this.f51736h = fragment.mRetainInstance;
        this.f51737i = fragment.mRemoving;
        this.f51738j = fragment.mDetached;
        this.f51739k = fragment.mHidden;
        this.f51740l = fragment.mMaxState.ordinal();
        this.f51741m = fragment.mTargetWho;
        this.f51742n = fragment.mTargetRequestCode;
        this.f51743o = fragment.mUserVisibleHint;
    }

    @NonNull
    Fragment a(@NonNull w wVar, @NonNull ClassLoader classLoader) {
        Fragment fragmentA = wVar.a(classLoader, this.f51729a);
        fragmentA.mWho = this.f51730b;
        fragmentA.mFromLayout = this.f51731c;
        fragmentA.mInDynamicContainer = this.f51732d;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.f51733e;
        fragmentA.mContainerId = this.f51734f;
        fragmentA.mTag = this.f51735g;
        fragmentA.mRetainInstance = this.f51736h;
        fragmentA.mRemoving = this.f51737i;
        fragmentA.mDetached = this.f51738j;
        fragmentA.mHidden = this.f51739k;
        fragmentA.mMaxState = androidx.lifecycle.c0.b.values()[this.f51740l];
        fragmentA.mTargetWho = this.f51741m;
        fragmentA.mTargetRequestCode = this.f51742n;
        fragmentA.mUserVisibleHint = this.f51743o;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f51729a);
        sb2.append(" (");
        sb2.append(this.f51730b);
        sb2.append(")}:");
        if (this.f51731c) {
            sb2.append(" fromLayout");
        }
        if (this.f51732d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f51734f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f51734f));
        }
        String str = this.f51735g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f51735g);
        }
        if (this.f51736h) {
            sb2.append(" retainInstance");
        }
        if (this.f51737i) {
            sb2.append(" removing");
        }
        if (this.f51738j) {
            sb2.append(" detached");
        }
        if (this.f51739k) {
            sb2.append(" hidden");
        }
        if (this.f51741m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f51741m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f51742n);
        }
        if (this.f51743o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f51729a);
        parcel.writeString(this.f51730b);
        parcel.writeInt(this.f51731c ? 1 : 0);
        parcel.writeInt(this.f51732d ? 1 : 0);
        parcel.writeInt(this.f51733e);
        parcel.writeInt(this.f51734f);
        parcel.writeString(this.f51735g);
        parcel.writeInt(this.f51736h ? 1 : 0);
        parcel.writeInt(this.f51737i ? 1 : 0);
        parcel.writeInt(this.f51738j ? 1 : 0);
        parcel.writeInt(this.f51739k ? 1 : 0);
        parcel.writeInt(this.f51740l);
        parcel.writeString(this.f51741m);
        parcel.writeInt(this.f51742n);
        parcel.writeInt(this.f51743o ? 1 : 0);
    }

    FragmentState(Parcel parcel) {
        this.f51729a = parcel.readString();
        this.f51730b = parcel.readString();
        this.f51731c = parcel.readInt() != 0;
        this.f51732d = parcel.readInt() != 0;
        this.f51733e = parcel.readInt();
        this.f51734f = parcel.readInt();
        this.f51735g = parcel.readString();
        this.f51736h = parcel.readInt() != 0;
        this.f51737i = parcel.readInt() != 0;
        this.f51738j = parcel.readInt() != 0;
        this.f51739k = parcel.readInt() != 0;
        this.f51740l = parcel.readInt();
        this.f51741m = parcel.readString();
        this.f51742n = parcel.readInt();
        this.f51743o = parcel.readInt() != 0;
    }
}

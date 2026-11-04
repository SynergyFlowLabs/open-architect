package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f9773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f9774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.support.v4.os.a f9775c;

    class a implements Parcelable.Creator<ResultReceiver> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    class b extends android.support.v4.os.a.b {
        b() {
        }

        @Override // android.support.v4.os.a
        public void j0(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f9774b;
            if (handler != null) {
                handler.post(resultReceiver.new c(i10, bundle));
            } else {
                resultReceiver.a(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f9777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f9778b;

        c(int i10, Bundle bundle) {
            this.f9777a = i10;
            this.f9778b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.f9777a, this.f9778b);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f9773a = true;
        this.f9774b = handler;
    }

    protected void a(int i10, Bundle bundle) {
    }

    public void b(int i10, Bundle bundle) {
        if (this.f9773a) {
            Handler handler = this.f9774b;
            if (handler != null) {
                handler.post(new c(i10, bundle));
                return;
            } else {
                a(i10, bundle);
                return;
            }
        }
        android.support.v4.os.a aVar = this.f9775c;
        if (aVar != null) {
            try {
                aVar.j0(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f9775c == null) {
                    this.f9775c = new b();
                }
                parcel.writeStrongBinder(this.f9775c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f9773a = false;
        this.f9774b = null;
        this.f9775c = android.support.v4.os.a.b.i(parcel.readStrongBinder());
    }

    /* JADX INFO: loaded from: classes14.dex */
    class MyRunnable implements Runnable {
        final int mResultCode;
        final Bundle mResultData;

        MyRunnable(int i10, Bundle bundle) {
            this.mResultCode = i10;
            this.mResultData = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.onReceiveResult(this.mResultCode, this.mResultData);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    class MyResultReceiver extends IResultReceiver.Stub {
        MyResultReceiver() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i10, Bundle bundle) {
            if (ResultReceiver.this.mHandler != null) {
                ResultReceiver.this.mHandler.post(ResultReceiver.this.new MyRunnable(i10, bundle));
            } else {
                ResultReceiver.this.onReceiveResult(i10, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes14.dex */
    class AnonymousClass1 implements Parcelable.Creator<ResultReceiver> {
        AnonymousClass1() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }
}

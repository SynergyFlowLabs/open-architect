package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AFb1vSDK {

    static final class AFa1uSDK implements IInterface {
        private final IBinder getMonetizationNetwork;

        AFa1uSDK(IBinder iBinder) {
            this.getMonetizationNetwork = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getMonetizationNetwork;
        }

        final boolean getMonetizationNetwork() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.getMonetizationNetwork.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z10 = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z10;
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }

        public final String getRevenue() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getMonetizationNetwork.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return string;
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
    }

    public static final class AFa1vSDK {
        public final String AFAdRevenueData;
        private final boolean getMediationNetwork;

        AFa1vSDK(String str, boolean z10) {
            this.AFAdRevenueData = str;
            this.getMediationNetwork = z10;
        }

        public final boolean getCurrencyIso4217Code() {
            return this.getMediationNetwork;
        }
    }

    static final class AFa1ySDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getCurrencyIso4217Code = new LinkedBlockingQueue<>(1);
        boolean getRevenue = false;

        AFa1ySDK() {
            int i10 = 4 ^ 1;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getCurrencyIso4217Code.put(iBinder);
            } catch (InterruptedException e10) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e10);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static AFa1vSDK AFAdRevenueData(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1ySDK aFa1ySDK = new AFa1ySDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1ySDK, 1)) {
                context.unbindService(aFa1ySDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1ySDK.getRevenue) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1ySDK.getRevenue = true;
            IBinder iBinderPoll = aFa1ySDK.getCurrencyIso4217Code.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1uSDK aFa1uSDK = new AFa1uSDK(iBinderPoll);
            AFa1vSDK aFa1vSDK = new AFa1vSDK(aFa1uSDK.getRevenue(), aFa1uSDK.getMonetizationNetwork());
            context.unbindService(aFa1ySDK);
            return aFa1vSDK;
        } catch (Throwable th2) {
            context.unbindService(aFa1ySDK);
            throw th2;
        }
    }
}

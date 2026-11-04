package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 implements Parcelable.Creator {
    static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, getServiceRequest.f106471a);
        i6.b.F(parcel, 2, getServiceRequest.f106472b);
        i6.b.F(parcel, 3, getServiceRequest.f106473c);
        i6.b.Y(parcel, 4, getServiceRequest.f106474d, false);
        i6.b.B(parcel, 5, getServiceRequest.f106475e, false);
        i6.b.c0(parcel, 6, getServiceRequest.f106476f, i10, false);
        i6.b.k(parcel, 7, getServiceRequest.f106477g, false);
        i6.b.S(parcel, 8, getServiceRequest.f106478h, i10, false);
        i6.b.c0(parcel, 10, getServiceRequest.f106479i, i10, false);
        i6.b.c0(parcel, 11, getServiceRequest.f106480j, i10, false);
        i6.b.g(parcel, 12, getServiceRequest.f106481k);
        i6.b.F(parcel, 13, getServiceRequest.f106482l);
        i6.b.g(parcel, 14, getServiceRequest.f106483m);
        i6.b.Y(parcel, 15, getServiceRequest.O1(), false);
        i6.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        Scope[] scopeArr = GetServiceRequest.f106469o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f106470s;
        Feature[] featureArr2 = featureArr;
        String strG = null;
        IBinder iBinderY = null;
        Account account = null;
        String strG2 = null;
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        boolean zP = false;
        int iZ4 = 0;
        boolean zP2 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 3:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 4:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 5:
                    iBinderY = i6.a.Y(parcel, iX);
                    break;
                case 6:
                    scopeArr = (Scope[]) i6.a.K(parcel, iX, Scope.CREATOR);
                    break;
                case 7:
                    bundle = i6.a.g(parcel, iX);
                    break;
                case 8:
                    account = (Account) i6.a.C(parcel, iX, Account.CREATOR);
                    break;
                case 9:
                default:
                    i6.a.h0(parcel, iX);
                    break;
                case 10:
                    featureArr = (Feature[]) i6.a.K(parcel, iX, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) i6.a.K(parcel, iX, Feature.CREATOR);
                    break;
                case 12:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 13:
                    iZ4 = i6.a.Z(parcel, iX);
                    break;
                case 14:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 15:
                    strG2 = i6.a.G(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new GetServiceRequest(iZ, iZ2, iZ3, strG, iBinderY, scopeArr, bundle, account, featureArr, featureArr2, zP, iZ4, zP2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}

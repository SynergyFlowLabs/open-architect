package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.l1;
import com.facebook.internal.w0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@l1(otherwise = 3)
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f100363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f100362i = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new KatanaProxyLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler[] newArray(int i10) {
            return new KatanaProxyLoginMethodHandler[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f100363h = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    public String k() {
        return this.f100363h;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean u() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    public int v(@NotNull LoginClient.Request request) {
        boolean z10;
        Intrinsics.checkNotNullParameter(request, "request");
        p pVarK = request.k();
        if (com.facebook.g0.M) {
            com.facebook.internal.h hVar = com.facebook.internal.h.f99880a;
            if (com.facebook.internal.h.a() == null || !pVarK.l()) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        String strA = LoginClient.f100364m.a();
        w0 w0Var = w0.f100148a;
        androidx.fragment.app.s sVarK = i().k();
        String strA2 = request.a();
        Set<String> setO = request.o();
        boolean zT = request.t();
        boolean zQ = request.q();
        e eVarH = request.h();
        if (eVarH == null) {
            eVarH = e.NONE;
        }
        e eVar = eVarH;
        String strH = h(request.b());
        String strC = request.c();
        String strM = request.m();
        boolean zP = request.p();
        boolean zR = request.r();
        boolean zE = request.E();
        String strN = request.n();
        String strE = request.e();
        com.facebook.login.b bVarF = request.f();
        List<Intent> listO = w0.o(sVarK, strA2, setO, strA, zT, zQ, eVar, strH, strC, z10, strM, zP, zR, zE, strN, strE, bVarF == null ? null : bVarF.name());
        a("e2e", strA);
        Iterator<Intent> it = listO.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            if (H(it.next(), LoginClient.f100364m.b())) {
                return i10;
            }
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f100363h = "katana_proxy_auth";
    }
}

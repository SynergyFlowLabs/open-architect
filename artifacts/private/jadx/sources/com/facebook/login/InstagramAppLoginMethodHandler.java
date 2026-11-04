package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.w0;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f100360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.facebook.g f100361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final b f100359j = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new InstagramAppLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler[] newArray(int i10) {
            return new InstagramAppLoginMethodHandler[i10];
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
    public InstagramAppLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f100360h = "instagram_login";
        this.f100361i = com.facebook.g.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    @NotNull
    public com.facebook.g A() {
        return this.f100361i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    public String k() {
        return this.f100360h;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    public int v(@NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient.c cVar = LoginClient.f100364m;
        String strA = cVar.a();
        w0 w0Var = w0.f100148a;
        Context contextK = i().k();
        if (contextK == null) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            contextK = com.facebook.g0.n();
        }
        String strA2 = request.a();
        Set<String> setO = request.o();
        boolean zT = request.t();
        boolean zQ = request.q();
        e eVarH = request.h();
        if (eVarH == null) {
            eVarH = e.NONE;
        }
        Intent intentJ = w0.j(contextK, strA2, setO, strA, zT, zQ, eVarH, h(request.b()), request.c(), request.m(), request.p(), request.r(), request.E());
        a("e2e", strA);
        return H(intentJ, cVar.b()) ? 1 : 0;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f100360h = "instagram_login";
        this.f100361i = com.facebook.g.INSTAGRAM_APPLICATION_WEB;
    }
}

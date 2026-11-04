package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import com.facebook.AccessToken;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class DeviceAuthMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f100351i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f100352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f100350h = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator<DeviceAuthMethodHandler> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DeviceAuthMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int i10) {
            return new DeviceAuthMethodHandler[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            try {
                if (DeviceAuthMethodHandler.f100351i == null) {
                    DeviceAuthMethodHandler.f100351i = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f100351i;
                if (scheduledThreadPoolExecutor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("backgroundExecutor");
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return scheduledThreadPoolExecutor;
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f100352g = "device_auth";
    }

    private final void D(LoginClient.Request request) {
        androidx.fragment.app.s sVarK = i().k();
        if (sVarK != null && !sVarK.isFinishing()) {
            DeviceAuthDialog deviceAuthDialogY = y();
            deviceAuthDialogY.show(sVarK.getSupportFragmentManager(), "login_with_facebook");
            deviceAuthDialogY.e0(request);
        }
    }

    @oj.n
    @NotNull
    public static final synchronized ScheduledThreadPoolExecutor z() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return f100350h.a();
    }

    public void A() {
        i().i(LoginClient.Result.f100396i.a(i().y(), LoginMethodHandler.f100411d));
    }

    public void B(@NotNull Exception ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        i().i(LoginClient.Result.c.e(LoginClient.Result.f100396i, i().y(), null, ex.getMessage(), null, 8, null));
    }

    public void C(@NotNull String accessToken, @NotNull String applicationId, @NotNull String userId, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable com.facebook.g gVar, @Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        i().i(LoginClient.Result.f100396i.f(i().y(), new AccessToken(accessToken, applicationId, userId, collection, collection2, collection3, gVar, date, date2, date3, null, 1024, null)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    public String k() {
        return this.f100352g;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int v(@NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        D(request);
        return 1;
    }

    @NotNull
    protected DeviceAuthDialog y() {
        return new DeviceAuthDialog();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected DeviceAuthMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f100352g = "device_auth";
    }
}

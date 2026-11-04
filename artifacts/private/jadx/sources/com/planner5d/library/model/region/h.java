package com.planner5d.library.model.region;

import android.app.Application;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@ij.f
public final class h implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f222789b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f222790a;

    @ij.a
    public h(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f222790a = application;
    }

    @Override // com.planner5d.library.services.e0
    @Nullable
    public String a() {
        TelephonyManager telephonyManager = (TelephonyManager) androidx.core.content.d.s(this.f222790a, TelephonyManager.class);
        if (telephonyManager != null) {
            return telephonyManager.getNetworkCountryIso();
        }
        return null;
    }
}

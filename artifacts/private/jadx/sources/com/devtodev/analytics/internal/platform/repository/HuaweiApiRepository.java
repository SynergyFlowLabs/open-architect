package com.devtodev.analytics.internal.platform.repository;

import android.content.Context;
import com.devtodev.analytics.internal.platform.HuaweiTokenData;
import com.devtodev.huawei.Huawei;
import com.devtodev.huawei.HuaweiToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class HuaweiApiRepository implements IHuaweiApiRepository {

    @NotNull
    private final Context context;

    @NotNull
    private final Huawei huawei;

    public HuaweiApiRepository(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.huawei = new Huawei(context);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IHuaweiApiRepository
    @NotNull
    public HuaweiTokenData getTokenData() {
        HuaweiToken token = this.huawei.getToken();
        return new HuaweiTokenData(token.getTokenId(), token.isLimitAdTrackingEnabled(), token.getException());
    }
}

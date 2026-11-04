package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1gSDK implements AFj1hSDK {
    @Override // com.appsflyer.internal.AFj1hSDK
    @NotNull
    public final String getRevenue() {
        Object objM785constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.checkNotNull(obj, "");
            objM785constructorimpl = Result.m785constructorimpl((String) obj);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m786isFailureimpl(objM785constructorimpl) ? "" : objM785constructorimpl);
    }
}

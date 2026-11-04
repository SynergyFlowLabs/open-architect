package io.customer.sdk.data.store;

import android.content.SharedPreferences;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPreferenceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferenceStore.kt\nio/customer/sdk/data/store/PreferenceStoreKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class n {
    @Nullable
    public static final <Value> Value a(@NotNull SharedPreferences sharedPreferences, @NotNull Function1<? super SharedPreferences, ? extends Value> action) {
        Object objM785constructorimpl;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = (Value) Result.m785constructorimpl(action.invoke(sharedPreferences));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m786isFailureimpl(objM785constructorimpl)) {
            objM785constructorimpl = (Value) null;
        }
        return (Value) objM785constructorimpl;
    }
}

package io.customer.messaginginapp.store;

import android.content.Context;
import android.content.SharedPreferences;
import io.customer.messaginginapp.store.InAppPreferenceStoreImpl;
import io.customer.sdk.data.store.m;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nInAppPreferenceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppPreferenceStore.kt\nio/customer/messaginginapp/store/InAppPreferenceStoreImpl\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n+ 3 PreferenceStore.kt\nio/customer/sdk/data/store/PreferenceStoreKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n39#2,12:31\n40#3:43\n1#4:44\n*S KotlinDebug\n*F\n+ 1 InAppPreferenceStore.kt\nio/customer/messaginginapp/store/InAppPreferenceStoreImpl\n*L\n22#1:31,12\n26#1:43\n26#1:44\n*E\n"})
public final class InAppPreferenceStoreImpl extends m implements InAppPreferenceStore {

    @NotNull
    private final f0 prefsName$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPreferenceStoreImpl(@NotNull final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.prefsName$delegate = g0.c(new Function0() { // from class: wg.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InAppPreferenceStoreImpl.prefsName_delegate$lambda$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prefsName_delegate$lambda$0(Context context) {
        return "io.customer.sdk.inApp." + context.getPackageName();
    }

    @Override // io.customer.messaginginapp.store.InAppPreferenceStore
    @Nullable
    public String getNetworkResponse(@NotNull String url) {
        Object objM785constructorimpl;
        Intrinsics.checkNotNullParameter(url, "url");
        SharedPreferences prefs = getPrefs();
        Object obj = null;
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(prefs.getString(url, null));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m786isFailureimpl(objM785constructorimpl)) {
            obj = objM785constructorimpl;
        }
        return (String) obj;
    }

    @Override // io.customer.sdk.data.store.m
    @NotNull
    public String getPrefsName() {
        return (String) this.prefsName$delegate.getValue();
    }

    @Override // io.customer.messaginginapp.store.InAppPreferenceStore
    public void saveNetworkResponse(@NotNull String url, @NotNull String response) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(response, "response");
        SharedPreferences.Editor editorEdit = getPrefs().edit();
        editorEdit.putString(url, response);
        editorEdit.apply();
    }
}

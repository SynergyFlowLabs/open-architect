package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class DeviceIdentifierHolderKt {
    @NotNull
    public static final String getDeviceIdentifier(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        String string = sharedPreferences.getString("device_identifier", "");
        if (string != null && !StringsKt.w3(string)) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("device_identifier", string2);
        editorEdit.apply();
        return string2;
    }
}

package com.superwall.sdk.paywall.view.webview;

import android.net.Uri;
import cj.h;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import java.net.URI;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallMessageKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final PaywallMessage parsePaywallMessage(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("event_name");
        if (string != null) {
            switch (string.hashCode()) {
                case -1539915881:
                    if (string.equals("custom_placement")) {
                        String string2 = jSONObject.getString("name");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                        return new PaywallMessage.CustomPlacement(string2, jSONObject2);
                    }
                    break;
                case -1349088399:
                    if (string.equals(h.L)) {
                        String string3 = jSONObject.getString("data");
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        return new PaywallMessage.Custom(string3);
                    }
                    break;
                case -504306182:
                    if (string.equals("open_url")) {
                        return new PaywallMessage.OpenUrl(new URI(jSONObject.getString("url")));
                    }
                    break;
                case 3441010:
                    if (string.equals("ping")) {
                        String string4 = jSONObject.getString("version");
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        return new PaywallMessage.OnReady(string4);
                    }
                    break;
                case 94756344:
                    if (string.equals("close")) {
                        return PaywallMessage.Close.INSTANCE;
                    }
                    break;
                case 651675760:
                    if (string.equals("open_url_external")) {
                        return new PaywallMessage.OpenUrlInBrowser(new URI(jSONObject.getString("url")));
                    }
                    break;
                case 1097519758:
                    if (string.equals("restore")) {
                        return PaywallMessage.Restore.INSTANCE;
                    }
                    break;
                case 1743324417:
                    if (string.equals(FirebaseAnalytics.c.D)) {
                        String string5 = jSONObject.getString("product");
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        String string6 = jSONObject.getString("product_identifier");
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        return new PaywallMessage.Purchase(string5, string6);
                    }
                    break;
                case 2097998776:
                    if (string.equals("open_deep_link")) {
                        Uri uri = Uri.parse(jSONObject.getString("link"));
                        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                        return new PaywallMessage.OpenDeepLink(uri);
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unknown event name: " + string);
    }

    @NotNull
    public static final WrappedPaywallMessages parseWrappedPaywallMessages(@NotNull String jsonString) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.superwallCore, "SWWebViewInterface " + jsonString, null, null, 24, null);
        JSONObject jSONObject = new JSONObject(jsonString);
        int iOptInt = jSONObject.optInt("version", 1);
        JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray(EventEntry.tableName);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            Intrinsics.checkNotNull(jSONObject2);
            arrayList.add(parsePaywallMessage(jSONObject2));
        }
        return new WrappedPaywallMessages(iOptInt, new PayloadMessages(arrayList));
    }
}

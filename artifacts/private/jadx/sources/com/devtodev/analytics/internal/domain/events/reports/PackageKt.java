package com.devtodev.analytics.internal.domain.events.reports;

import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.google.firebase.remoteconfig.e0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Package.kt\ncom/devtodev/analytics/internal/domain/events/reports/PackageKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public final class PackageKt {
    @NotNull
    public static final JSONObject encode(@NotNull Package r10) throws JSONException {
        Intrinsics.checkNotNullParameter(r10, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("language", r10.getLanguage());
        if (r10.getAppVersion() != null) {
            jSONObject.accumulate(e0.b.f124458s2, r10.getAppVersion());
        }
        if (r10.getAppBuildVersion() != null) {
            jSONObject.accumulate("appBuildVersion", r10.getAppBuildVersion());
        }
        jSONObject.accumulate(e0.b.f124461v2, r10.getSdkVersion());
        jSONObject.accumulate("sdkCodeVersion", Long.valueOf(r10.getSdkCodeVersion()));
        jSONObject.accumulate("engine", r10.getEngine());
        if (r10.getInstallationSource().length() > 0) {
            jSONObject.accumulate("installationSource", r10.getInstallationSource());
        }
        if (r10.getBundle() != null) {
            jSONObject.accumulate("bundle", r10.getBundle());
        }
        List<String> events = r10.getEvents();
        if (events != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = events.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(it.next()));
            }
            jSONObject.accumulate(EventEntry.tableName, jSONArray);
        }
        return jSONObject;
    }
}

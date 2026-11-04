package com.google.firebase.crashlytics.ndk;

import androidx.annotation.p0;
import io.sentry.k4;
import io.sentry.protocol.DebugImage;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class k {
    private k() {
    }

    private static String a(@p0 String str) {
        if (str == null) {
            str = "";
        }
        return str;
    }

    static String b(String str, String str2, long j10) {
        HashMap map = new HashMap();
        map.put("session_id", str);
        map.put("generator", str2);
        map.put("started_at_seconds", Long.valueOf(j10));
        return new JSONObject(map).toString();
    }

    static String c(String str, String str2, String str3, String str4, int i10, @p0 String str5, @p0 String str6) {
        HashMap map = new HashMap();
        map.put(io.sentry.protocol.a.b.f306109a, str);
        map.put(k4.c.f305761q, str2);
        map.put(k4.c.f305760p, str3);
        map.put("install_uuid", str4);
        map.put("delivery_mechanism", Integer.valueOf(i10));
        map.put("development_platform", a(str5));
        map.put("development_platform_version", a(str6));
        return new JSONObject(map).toString();
    }

    static String d(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        HashMap map = new HashMap();
        map.put(DebugImage.b.f306093i, Integer.valueOf(i10));
        map.put("build_model", str);
        map.put("available_processors", Integer.valueOf(i11));
        map.put("total_ram", Long.valueOf(j10));
        map.put("disk_space", Long.valueOf(j11));
        map.put("is_emulator", Boolean.valueOf(z10));
        map.put("state", Integer.valueOf(i12));
        map.put("build_manufacturer", str2);
        map.put("build_product", str3);
        return new JSONObject(map).toString();
    }

    static String e(String str, String str2, boolean z10) {
        HashMap map = new HashMap();
        map.put("version", str);
        map.put("build_version", str2);
        map.put("is_rooted", Boolean.valueOf(z10));
        return new JSONObject(map).toString();
    }
}

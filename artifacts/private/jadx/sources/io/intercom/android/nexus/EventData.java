package io.intercom.android.nexus;

import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class EventData extends HashMap<String, Object> {
    public EventData() {
    }

    public long optLong(String str) {
        return optLong(str, -1L);
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public EventData(int i10) {
        super(i10);
    }

    public long optLong(String str, long j10) {
        Object obj = get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return obj instanceof Long ? ((Long) obj).longValue() : j10;
    }

    public String optString(String str, String str2) {
        Object obj = get(str);
        return obj instanceof String ? (String) obj : str2;
    }
}

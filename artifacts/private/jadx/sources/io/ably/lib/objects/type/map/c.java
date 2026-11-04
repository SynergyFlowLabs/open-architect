package io.ably.lib.objects.type.map;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class c extends io.ably.lib.objects.type.c {

    public enum a {
        UPDATED,
        REMOVED
    }

    public c() {
        super(null);
    }

    @NotNull
    public Map<String, a> a() {
        return (Map) this.f287485a;
    }

    public String toString() {
        if (this.f287485a == null) {
            return "LiveMapUpdate{no change}";
        }
        return "LiveMapUpdate{changes=" + a() + "}";
    }

    public c(@NotNull Map<String, a> map) {
        super(map);
    }
}

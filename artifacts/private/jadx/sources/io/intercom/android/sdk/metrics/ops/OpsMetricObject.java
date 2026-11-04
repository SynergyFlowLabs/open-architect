package io.intercom.android.sdk.metrics.ops;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class OpsMetricObject {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f293110id;
    private final String name;
    private final String type;
    private final long value;

    public OpsMetricObject(String str, String str2, long j10, String str3) {
        this.type = str;
        this.name = str2;
        this.value = j10;
        this.f293110id = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            OpsMetricObject opsMetricObject = (OpsMetricObject) obj;
            if (this.value == opsMetricObject.value && this.type.equals(opsMetricObject.type) && this.name.equals(opsMetricObject.name)) {
                return this.f293110id.equals(opsMetricObject.f293110id);
            }
            return false;
        }
        return false;
    }

    public String getId() {
        return this.f293110id;
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.name.hashCode()) * 31;
        long j10 = this.value;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f293110id.hashCode();
    }

    public String toString() {
        return "OpsMetricObject{type='" + this.type + "', name='" + this.name + "', value=" + this.value + ", id='" + this.f293110id + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}

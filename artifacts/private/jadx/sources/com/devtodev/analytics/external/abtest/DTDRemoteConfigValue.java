package com.devtodev.analytics.external.abtest;

import com.facebook.internal.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDRemoteConfigValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f98017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DTDRemoteConfigSource f98018b;

    public DTDRemoteConfigValue(@NotNull Object value, @NotNull DTDRemoteConfigSource localSource) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(localSource, "localSource");
        this.f98017a = value;
        this.f98018b = localSource;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b6, code lost:
    
        if (r0.equals(com.facebook.internal.z0.P) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        if (r0.equals("yes") == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d8, code lost:
    
        if (r0.equals("y") == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
    
        if (r0.equals("t") == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e6, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getBooleanValue() {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.devtodev.analytics.external.abtest.DTDRemoteConfigValue.getBooleanValue():boolean");
    }

    public final double getDoubleValue() {
        Double dL0;
        Object obj = this.f98017a;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Float) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
        }
        if (!(obj instanceof String) || (dL0 = StringsKt.L0((String) obj)) == null) {
            return 0.0d;
        }
        return dL0.doubleValue();
    }

    public final float getFloatValue() {
        Float fN0;
        Object obj = this.f98017a;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Float) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof Double) {
            return (float) ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
        }
        if (!(obj instanceof String) || (fN0 = StringsKt.N0((String) obj)) == null) {
            return 0.0f;
        }
        return fN0.floatValue();
    }

    public final int getIntValue() {
        Integer intOrNull;
        Object obj = this.f98017a;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Number) obj).longValue();
        }
        if (obj instanceof Float) {
            return (int) ((Number) obj).floatValue();
        }
        if (obj instanceof Double) {
            return (int) ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (!(obj instanceof String) || (intOrNull = StringsKt.toIntOrNull((String) obj)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    @NotNull
    public final DTDRemoteConfigSource getLocalSource$DTDAnalytics_androidRelease() {
        return this.f98018b;
    }

    public final long getLongValue() {
        Long lC1;
        Object obj = this.f98017a;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Float) {
            return (long) ((Number) obj).floatValue();
        }
        if (obj instanceof Double) {
            return (long) ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1L : 0L;
        }
        if (!(obj instanceof String) || (lC1 = StringsKt.c1((String) obj)) == null) {
            return 0L;
        }
        return lC1.longValue();
    }

    @NotNull
    public final DTDRemoteConfigSource getSource() {
        return this.f98018b;
    }

    @Nullable
    public final String getStringValue() {
        Object obj = this.f98017a;
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? z0.P : "false";
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        return obj.toString();
    }

    @NotNull
    public final Object getValue$DTDAnalytics_androidRelease() {
        return this.f98017a;
    }

    public final void setLocalSource$DTDAnalytics_androidRelease(@NotNull DTDRemoteConfigSource dTDRemoteConfigSource) {
        Intrinsics.checkNotNullParameter(dTDRemoteConfigSource, "<set-?>");
        this.f98018b = dTDRemoteConfigSource;
    }

    public final void setValue$DTDAnalytics_androidRelease(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f98017a = obj;
    }
}

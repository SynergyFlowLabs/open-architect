package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private static y f106665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final RootTelemetryConfiguration f106666c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private RootTelemetryConfiguration f106667a;

    private y() {
    }

    @NonNull
    @g6.a
    public static synchronized y b() {
        try {
            if (f106665b == null) {
                f106665b = new y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f106665b;
    }

    @androidx.annotation.p0
    @g6.a
    public RootTelemetryConfiguration a() {
        return this.f106667a;
    }

    @androidx.annotation.l1
    public final synchronized void c(@androidx.annotation.p0 RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.f106667a = f106666c;
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f106667a;
            if (rootTelemetryConfiguration2 != null && rootTelemetryConfiguration2.getVersion() >= rootTelemetryConfiguration.getVersion()) {
                return;
            }
            this.f106667a = rootTelemetryConfiguration;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

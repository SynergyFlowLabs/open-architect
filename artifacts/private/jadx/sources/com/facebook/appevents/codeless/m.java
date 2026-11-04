package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f98833b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f98834c = 2.3d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private b f98835a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a();
    }

    public final void a(@Nullable b bVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            this.f98835a = bVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@NotNull Sensor sensor, int i10) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            b bVar = this.f98835a;
            if (bVar == null) {
                return;
            }
            float[] fArr = event.values;
            double d10 = fArr[0] / 9.80665f;
            double d11 = fArr[1] / 9.80665f;
            double d12 = fArr[2] / 9.80665f;
            if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > f98834c) {
                bVar.a();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }
}

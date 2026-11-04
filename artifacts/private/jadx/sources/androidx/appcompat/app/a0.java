package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.l1;
import androidx.core.content.i0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f10277d = "TwilightManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f10278e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f10279f = 22;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static a0 f10280g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f10282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f10283c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f10284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f10285b;

        a() {
        }
    }

    @l1
    a0(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f10281a = context;
        this.f10282b = locationManager;
    }

    static a0 a(@NonNull Context context) {
        if (f10280g == null) {
            Context applicationContext = context.getApplicationContext();
            f10280g = new a0(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.d.f120676s));
        }
        return f10280g;
    }

    @e.a({"MissingPermission"})
    private Location b() {
        Location locationC = i0.d(this.f10281a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c(com.segment.analytics.kotlin.android.plugins.a.f266547p0) : null;
        Location locationC2 = i0.d(this.f10281a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location c(String str) {
        try {
            if (this.f10282b.isProviderEnabled(str)) {
                return this.f10282b.getLastKnownLocation(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private boolean e() {
        return this.f10283c.f10285b > System.currentTimeMillis();
    }

    @l1
    static void f(a0 a0Var) {
        f10280g = a0Var;
    }

    private void g(@NonNull Location location) {
        long j10;
        a aVar = this.f10283c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        z zVarB = z.b();
        zVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        zVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = zVarB.f10424c == 1;
        long j11 = zVarB.f10423b;
        long j12 = zVarB.f10422a;
        zVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = zVarB.f10423b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f10284a = z10;
        aVar.f10285b = j10;
    }

    boolean d() {
        a aVar = this.f10283c;
        if (e()) {
            return aVar.f10284a;
        }
        Location locationB = b();
        if (locationB != null) {
            g(locationB);
            return aVar.f10284a;
        }
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}

package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.d1;
import androidx.annotation.l1;
import androidx.annotation.m1;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.db;
import com.google.android.gms.measurement.internal.h7;
import com.google.android.gms.measurement.internal.n8;
import com.google.android.gms.measurement.internal.ua;
import com.google.android.gms.measurement.internal.v8;
import com.google.android.gms.measurement.internal.w8;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @a0
    @g6.a
    public static final String f109714b = "crash";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @a0
    @g6.a
    public static final String f109715c = "fcm";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @a0
    @g6.a
    public static final String f109716d = "fiam";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile AppMeasurement f109717e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f109718a;

    @a0
    @g6.a
    public static class ConditionalUserProperty {

        @Keep
        @a0
        @g6.a
        public boolean mActive;

        @NonNull
        @Keep
        @g6.a
        @a0
        public String mAppId;

        @Keep
        @a0
        @g6.a
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        @g6.a
        @a0
        public String mName;

        @NonNull
        @Keep
        @g6.a
        @a0
        public String mOrigin;

        @Keep
        @a0
        @g6.a
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        @g6.a
        @a0
        public String mTriggerEventName;

        @Keep
        @a0
        @g6.a
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        @a0
        @g6.a
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        @g6.a
        @a0
        public Object mValue;

        @g6.a
        public ConditionalUserProperty() {
        }

        @l1
        ConditionalUserProperty(@NonNull Bundle bundle) {
            w.r(bundle);
            this.mAppId = (String) n8.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) n8.b(bundle, "origin", String.class, null);
            this.mName = (String) n8.b(bundle, "name", String.class, null);
            this.mValue = n8.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) n8.b(bundle, n6.a.C2338a.f332736d, String.class, null);
            this.mTriggerTimeout = ((Long) n8.b(bundle, n6.a.C2338a.f332737e, Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) n8.b(bundle, n6.a.C2338a.f332738f, String.class, null);
            this.mTimedOutEventParams = (Bundle) n8.b(bundle, n6.a.C2338a.f332739g, Bundle.class, null);
            this.mTriggeredEventName = (String) n8.b(bundle, n6.a.C2338a.f332740h, String.class, null);
            this.mTriggeredEventParams = (Bundle) n8.b(bundle, n6.a.C2338a.f332741i, Bundle.class, null);
            this.mTimeToLive = ((Long) n8.b(bundle, n6.a.C2338a.f332742j, Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) n8.b(bundle, n6.a.C2338a.f332743k, String.class, null);
            this.mExpiredEventParams = (Bundle) n8.b(bundle, n6.a.C2338a.f332744l, Bundle.class, null);
            this.mActive = ((Boolean) n8.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) n8.b(bundle, n6.a.C2338a.f332745m, Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) n8.b(bundle, n6.a.C2338a.f332747o, Long.class, 0L)).longValue();
        }

        @g6.a
        public ConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
            w.r(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object objB = db.b(obj);
                this.mValue = objB;
                if (objB == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
        }
    }

    @a0
    @g6.a
    public interface a extends v8 {
        @Override // com.google.android.gms.measurement.internal.v8
        @m1
        @a0
        @g6.a
        void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j10);
    }

    @a0
    @g6.a
    public interface b extends w8 {
        @Override // com.google.android.gms.measurement.internal.w8
        @m1
        @a0
        @g6.a
        void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j10);
    }

    public AppMeasurement(h7 h7Var) {
        this.f109718a = new com.google.android.gms.measurement.b(h7Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @NonNull
    @Keep
    @g6.a
    @Deprecated
    @a1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @a0
    public static AppMeasurement getInstance(@NonNull Context context) {
        if (f109717e == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f109717e == null) {
                        ua uaVar = (ua) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        if (uaVar != null) {
                            f109717e = new AppMeasurement(uaVar);
                        } else {
                            f109717e = new AppMeasurement(h7.O(context, new zzdd(0L, 0L, true, null, null), null));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f109717e;
    }

    @NonNull
    @g6.a
    public Boolean a() {
        return this.f109718a.r();
    }

    @NonNull
    @g6.a
    public Double b() {
        return this.f109718a.v();
    }

    @Keep
    public void beginAdUnitExposure(@NonNull @d1(min = 1) String str) {
        this.f109718a.g(str);
    }

    @NonNull
    @g6.a
    public Integer c() {
        return this.f109718a.s();
    }

    @Keep
    @a0
    @g6.a
    public void clearConditionalUserProperty(@NonNull @d1(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f109718a.o(str, str2, bundle);
    }

    @NonNull
    @g6.a
    public Long d() {
        return this.f109718a.u();
    }

    @NonNull
    @g6.a
    public String e() {
        return this.f109718a.t();
    }

    @Keep
    public void endAdUnitExposure(@NonNull @d1(min = 1) String str) {
        this.f109718a.c(str);
    }

    @NonNull
    @m1
    @g6.a
    @a0
    public Map<String, Object> f(boolean z10) {
        return this.f109718a.q(z10);
    }

    @a0
    @g6.a
    public void g(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j10) {
        this.f109718a.e(str, str2, bundle, j10);
    }

    @Keep
    public long generateEventId() {
        return this.f109718a.b();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f109718a.T();
    }

    @NonNull
    @Keep
    @m1
    @g6.a
    @a0
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @d1(max = 23, min = 1) String str2) {
        List listP = this.f109718a.p(str, str2);
        ArrayList arrayList = new ArrayList(listP == null ? 0 : listP.size());
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f109718a.f();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f109718a.R();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f109718a.d();
    }

    @Keep
    @m1
    @g6.a
    @a0
    public int getMaxUserProperties(@NonNull @d1(min = 1) String str) {
        return this.f109718a.h(str);
    }

    @NonNull
    @Keep
    @l1
    @m1
    protected Map<String, Object> getUserProperties(@NonNull String str, @NonNull @d1(max = 24, min = 1) String str2, boolean z10) {
        return this.f109718a.n(str, str2, z10);
    }

    @a0
    @g6.a
    public void h(@NonNull b bVar) {
        this.f109718a.k(bVar);
    }

    @m1
    @a0
    @g6.a
    public void i(@NonNull a aVar) {
        this.f109718a.i(aVar);
    }

    @a0
    @g6.a
    public void j(@NonNull b bVar) {
        this.f109718a.j(bVar);
    }

    @Keep
    @a0
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f109718a.a(str, str2, bundle);
    }

    @Keep
    @a0
    @g6.a
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        w.r(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            n8.a(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(n6.a.C2338a.f332736d, str4);
        }
        bundle.putLong(n6.a.C2338a.f332737e, conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(n6.a.C2338a.f332738f, str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(n6.a.C2338a.f332739g, bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(n6.a.C2338a.f332740h, str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(n6.a.C2338a.f332741i, bundle3);
        }
        bundle.putLong(n6.a.C2338a.f332742j, conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(n6.a.C2338a.f332743k, str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(n6.a.C2338a.f332744l, bundle4);
        }
        d dVar = this.f109718a;
        bundle.putLong(n6.a.C2338a.f332745m, conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong(n6.a.C2338a.f332747o, conditionalUserProperty.mTriggeredTimestamp);
        dVar.l(bundle);
    }

    public AppMeasurement(ua uaVar) {
        this.f109718a = new c(uaVar);
    }
}

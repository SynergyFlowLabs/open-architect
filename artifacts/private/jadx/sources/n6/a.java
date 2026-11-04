package n6;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.d1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.v8;
import com.google.android.gms.measurement.internal.w8;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f4 f332732a;

    /* JADX INFO: renamed from: n6.a$a, reason: collision with other inner class name */
    @g6.a
    public static final class C2338a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332733a = "origin";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332734b = "name";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332735c = "value";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332736d = "trigger_event_name";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332737e = "trigger_timeout";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332738f = "timed_out_event_name";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332739g = "timed_out_event_params";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332740h = "triggered_event_name";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332741i = "triggered_event_params";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332742j = "time_to_live";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332743k = "expired_event_name";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332744l = "expired_event_params";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332745m = "creation_timestamp";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332746n = "active";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NonNull
        @g6.a
        public static final String f332747o = "triggered_timestamp";

        private C2338a() {
        }
    }

    @a0
    @g6.a
    public interface b extends v8 {
        @Override // com.google.android.gms.measurement.internal.v8
        @m1
        @a0
        @g6.a
        void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j10);
    }

    @a0
    @g6.a
    public interface c extends w8 {
        @Override // com.google.android.gms.measurement.internal.w8
        @m1
        @a0
        @g6.a
        void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j10);
    }

    public a(f4 f4Var) {
        this.f332732a = f4Var;
    }

    @NonNull
    @g6.a
    @a1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @a0
    public static a k(@NonNull Context context) {
        return f4.v(context, null).w();
    }

    @NonNull
    @g6.a
    @Deprecated
    @a1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static a l(@NonNull Context context, @NonNull String str, @NonNull String str2, @p0 String str3, @NonNull Bundle bundle) {
        return f4.v(context, bundle).w();
    }

    @a0
    @g6.a
    public void A(@NonNull c cVar) {
        this.f332732a.B(cVar);
    }

    public final void B(boolean z10) {
        this.f332732a.k(z10);
    }

    @g6.a
    public void a(@NonNull @d1(min = 1) String str) {
        this.f332732a.P(str);
    }

    @g6.a
    public void b(@NonNull @d1(max = 24, min = 1) String str, @p0 String str2, @p0 Bundle bundle) {
        this.f332732a.H(str, str2, bundle);
    }

    @g6.a
    public void c(@NonNull @d1(min = 1) String str) {
        this.f332732a.Q(str);
    }

    @g6.a
    public long d() {
        return this.f332732a.U();
    }

    @p0
    @g6.a
    public String e() {
        return this.f332732a.i();
    }

    @p0
    @g6.a
    public String f() {
        return this.f332732a.T();
    }

    @NonNull
    @m1
    @g6.a
    public List<Bundle> g(@p0 String str, @d1(max = 23, min = 1) @p0 String str2) {
        return this.f332732a.I(str, str2);
    }

    @p0
    @g6.a
    public String h() {
        return this.f332732a.b();
    }

    @p0
    @g6.a
    public String i() {
        return this.f332732a.a();
    }

    @p0
    @g6.a
    public String j() {
        return this.f332732a.S();
    }

    @m1
    @g6.a
    public int m(@NonNull @d1(min = 1) String str) {
        return this.f332732a.f(str);
    }

    @NonNull
    @m1
    @g6.a
    public Map<String, Object> n(@p0 String str, @d1(max = 24, min = 1) @p0 String str2, boolean z10) {
        return this.f332732a.c(str, str2, z10);
    }

    @g6.a
    public void o(@NonNull String str, @NonNull String str2, @p0 Bundle bundle) {
        this.f332732a.D(str, str2, bundle);
    }

    @g6.a
    public void p(@NonNull String str, @NonNull String str2, @p0 Bundle bundle, long j10) {
        this.f332732a.E(str, str2, bundle, j10);
    }

    @g6.a
    public void q(@NonNull Bundle bundle) {
        this.f332732a.e(bundle, false);
    }

    @p0
    @g6.a
    public Bundle r(@NonNull Bundle bundle) {
        return this.f332732a.e(bundle, true);
    }

    @a0
    @g6.a
    public void s(@NonNull c cVar) {
        this.f332732a.A(cVar);
    }

    @g6.a
    public void t(@NonNull Bundle bundle) {
        this.f332732a.G(bundle);
    }

    @g6.a
    @Deprecated
    public void u(@NonNull Bundle bundle) {
    }

    @g6.a
    public void v(@NonNull Activity activity, @d1(max = 36, min = 1) @p0 String str, @d1(max = 36, min = 1) @p0 String str2) {
        this.f332732a.K(zzdf.O1(activity), str, str2);
    }

    @m1
    @a0
    @g6.a
    public void w(@NonNull b bVar) {
        this.f332732a.y(bVar);
    }

    @g6.a
    @Deprecated
    public void x(@p0 Boolean bool) {
    }

    @g6.a
    @Deprecated
    public void y(boolean z10) {
    }

    @g6.a
    public void z(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.f332732a.F(str, str2, obj, true);
    }
}

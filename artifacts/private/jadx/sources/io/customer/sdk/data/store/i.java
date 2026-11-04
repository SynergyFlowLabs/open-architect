package io.customer.sdk.data.store;

import io.sentry.k4;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f288531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f288532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f288533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f288534d;

    public i(@NotNull e buildStore, @NotNull a applicationStore, @NotNull g client, @NotNull String version) {
        Intrinsics.checkNotNullParameter(buildStore, "buildStore");
        Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f288531a = buildStore;
        this.f288532b = applicationStore;
        this.f288533c = client;
        this.f288534d = version;
    }

    @Override // io.customer.sdk.data.store.h
    @NotNull
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Customer.io " + l());
        sb2.append(" (" + d() + " " + i() + "; " + c() + ")");
        String strE = e();
        String strB = b();
        if (strB == null) {
            strB = "0.0.0";
        }
        sb2.append(" " + strE + "/" + strB);
        return sb2.toString();
    }

    @Override // io.customer.sdk.data.store.a
    @Nullable
    public String b() {
        return this.f288532b.b();
    }

    @Override // io.customer.sdk.data.store.e
    @Nullable
    public Integer c() {
        return this.f288531a.c();
    }

    @Override // io.customer.sdk.data.store.e
    @Nullable
    public String d() {
        return this.f288531a.d();
    }

    @Override // io.customer.sdk.data.store.a
    @NotNull
    public String e() {
        return this.f288532b.e();
    }

    @Override // io.customer.sdk.data.store.e
    @Nullable
    public String f() {
        return this.f288531a.f();
    }

    @Override // io.customer.sdk.data.store.h
    @NotNull
    public String g() {
        return this.f288534d;
    }

    @Override // io.customer.sdk.data.store.h
    @NotNull
    public Map<String, Object> h() {
        Pair pair = TuplesKt.to("device_os", c());
        Pair pair2 = TuplesKt.to(k4.c.f305748d, i());
        Pair pair3 = TuplesKt.to(k4.c.f305747c, d());
        String strB = b();
        if (strB == null) {
            strB = "";
        }
        return MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to(io.sentry.protocol.a.b.f306114f, strB), TuplesKt.to("cio_sdk_version", g()), TuplesKt.to(k4.c.f305746b, k()), TuplesKt.to("push_enabled", Boolean.valueOf(m())));
    }

    @Override // io.customer.sdk.data.store.e
    @Nullable
    public String i() {
        return this.f288531a.i();
    }

    @Override // io.customer.sdk.data.store.a
    @Nullable
    public String j() {
        return this.f288532b.j();
    }

    @Override // io.customer.sdk.data.store.e
    @Nullable
    public String k() {
        return this.f288531a.k();
    }

    @Override // io.customer.sdk.data.store.h
    @NotNull
    public g l() {
        return this.f288533c;
    }

    @Override // io.customer.sdk.data.store.a
    public boolean m() {
        return this.f288532b.m();
    }

    public /* synthetic */ i(e eVar, a aVar, g gVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, aVar, gVar, (i10 & 8) != 0 ? gVar.a() : str);
    }
}

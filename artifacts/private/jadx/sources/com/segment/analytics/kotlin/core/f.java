package com.segment.analytics.kotlin.core;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Object f266807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private u f266808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f266809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f266810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f266811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f266812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f266813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f266814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private List<? extends com.segment.analytics.kotlin.core.platform.policies.b> f266815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Settings f266816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f266817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private String f266818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private String f266819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private q f266820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private Function1<? super Throwable, Unit> f266821p;

    public f(@NotNull String writeKey, @Nullable Object obj, @NotNull u storageProvider, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, @NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> flushPolicies, @Nullable Settings settings, boolean z14, @NotNull String apiHost, @NotNull String cdnHost, @NotNull q requestFactory, @Nullable Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        Intrinsics.checkNotNullParameter(flushPolicies, "flushPolicies");
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        Intrinsics.checkNotNullParameter(cdnHost, "cdnHost");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        this.f266806a = writeKey;
        this.f266807b = obj;
        this.f266808c = storageProvider;
        this.f266809d = z10;
        this.f266810e = z11;
        this.f266811f = z12;
        this.f266812g = z13;
        this.f266813h = i10;
        this.f266814i = i11;
        this.f266815j = flushPolicies;
        this.f266816k = settings;
        this.f266817l = z14;
        this.f266818m = apiHost;
        this.f266819n = cdnHost;
        this.f266820o = requestFactory;
        this.f266821p = function1;
    }

    public final int A() {
        return this.f266814i;
    }

    @NotNull
    public final List<com.segment.analytics.kotlin.core.platform.policies.b> B() {
        return this.f266815j;
    }

    @NotNull
    public final q C() {
        return this.f266820o;
    }

    @NotNull
    public final u D() {
        return this.f266808c;
    }

    public final boolean E() {
        return this.f266810e;
    }

    public final boolean F() {
        return this.f266812g;
    }

    public final boolean G() {
        return this.f266811f;
    }

    @NotNull
    public final String H() {
        return this.f266806a;
    }

    public final boolean I() {
        return (StringsKt.w3(this.f266806a) || this.f266807b == null) ? false : true;
    }

    public final void J(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266818m = str;
    }

    public final void K(@Nullable Object obj) {
        this.f266807b = obj;
    }

    public final void L(boolean z10) {
        this.f266817l = z10;
    }

    public final void M(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266819n = str;
    }

    public final void N(boolean z10) {
        this.f266809d = z10;
    }

    public final void O(@Nullable Settings settings) {
        this.f266816k = settings;
    }

    public final void P(@Nullable Function1<? super Throwable, Unit> function1) {
        this.f266821p = function1;
    }

    public final void Q(int i10) {
        this.f266813h = i10;
    }

    public final void R(int i10) {
        this.f266814i = i10;
    }

    public final void S(@NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f266815j = list;
    }

    public final void T(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.f266820o = qVar;
    }

    public final void U(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        this.f266808c = uVar;
    }

    public final void V(boolean z10) {
        this.f266810e = z10;
    }

    public final void W(boolean z10) {
        this.f266812g = z10;
    }

    public final void X(boolean z10) {
        this.f266811f = z10;
    }

    @NotNull
    public final String a() {
        return this.f266806a;
    }

    @NotNull
    public final List<com.segment.analytics.kotlin.core.platform.policies.b> b() {
        return this.f266815j;
    }

    @Nullable
    public final Settings c() {
        return this.f266816k;
    }

    public final boolean d() {
        return this.f266817l;
    }

    @NotNull
    public final String e() {
        return this.f266818m;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f266806a, fVar.f266806a) && Intrinsics.areEqual(this.f266807b, fVar.f266807b) && Intrinsics.areEqual(this.f266808c, fVar.f266808c) && this.f266809d == fVar.f266809d && this.f266810e == fVar.f266810e && this.f266811f == fVar.f266811f && this.f266812g == fVar.f266812g && this.f266813h == fVar.f266813h && this.f266814i == fVar.f266814i && Intrinsics.areEqual(this.f266815j, fVar.f266815j) && Intrinsics.areEqual(this.f266816k, fVar.f266816k) && this.f266817l == fVar.f266817l && Intrinsics.areEqual(this.f266818m, fVar.f266818m) && Intrinsics.areEqual(this.f266819n, fVar.f266819n) && Intrinsics.areEqual(this.f266820o, fVar.f266820o) && Intrinsics.areEqual(this.f266821p, fVar.f266821p);
    }

    @NotNull
    public final String f() {
        return this.f266819n;
    }

    @NotNull
    public final q g() {
        return this.f266820o;
    }

    @Nullable
    public final Function1<Throwable, Unit> h() {
        return this.f266821p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public int hashCode() {
        int iHashCode = this.f266806a.hashCode() * 31;
        Object obj = this.f266807b;
        int iHashCode2 = (((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.f266808c.hashCode()) * 31;
        boolean z10 = this.f266809d;
        ?? r10 = 1;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode2 + r11) * 31;
        boolean z11 = this.f266810e;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i11 = (i10 + r12) * 31;
        boolean z12 = this.f266811f;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int i12 = (i11 + r13) * 31;
        boolean z13 = this.f266812g;
        ?? r14 = z13;
        if (z13) {
            r14 = 1;
        }
        int iHashCode3 = (((((((i12 + r14) * 31) + Integer.hashCode(this.f266813h)) * 31) + Integer.hashCode(this.f266814i)) * 31) + this.f266815j.hashCode()) * 31;
        Settings settings = this.f266816k;
        int iHashCode4 = (iHashCode3 + (settings == null ? 0 : settings.hashCode())) * 31;
        boolean z14 = this.f266817l;
        if (!z14) {
            r10 = z14;
        }
        int iHashCode5 = (((((((iHashCode4 + r10) * 31) + this.f266818m.hashCode()) * 31) + this.f266819n.hashCode()) * 31) + this.f266820o.hashCode()) * 31;
        Function1<? super Throwable, Unit> function1 = this.f266821p;
        return iHashCode5 + (function1 != null ? function1.hashCode() : 0);
    }

    @Nullable
    public final Object i() {
        return this.f266807b;
    }

    @NotNull
    public final u j() {
        return this.f266808c;
    }

    public final boolean k() {
        return this.f266809d;
    }

    public final boolean l() {
        return this.f266810e;
    }

    public final boolean m() {
        return this.f266811f;
    }

    public final boolean n() {
        return this.f266812g;
    }

    public final int o() {
        return this.f266813h;
    }

    public final int p() {
        return this.f266814i;
    }

    @NotNull
    public final f q(@NotNull String writeKey, @Nullable Object obj, @NotNull u storageProvider, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, @NotNull List<? extends com.segment.analytics.kotlin.core.platform.policies.b> flushPolicies, @Nullable Settings settings, boolean z14, @NotNull String apiHost, @NotNull String cdnHost, @NotNull q requestFactory, @Nullable Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        Intrinsics.checkNotNullParameter(flushPolicies, "flushPolicies");
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        Intrinsics.checkNotNullParameter(cdnHost, "cdnHost");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        return new f(writeKey, obj, storageProvider, z10, z11, z12, z13, i10, i11, flushPolicies, settings, z14, apiHost, cdnHost, requestFactory, function1);
    }

    @NotNull
    public final String s() {
        return this.f266818m;
    }

    @Nullable
    public final Object t() {
        return this.f266807b;
    }

    @NotNull
    public String toString() {
        return "Configuration(writeKey=" + this.f266806a + ", application=" + this.f266807b + ", storageProvider=" + this.f266808c + ", collectDeviceId=" + this.f266809d + ", trackApplicationLifecycleEvents=" + this.f266810e + ", useLifecycleObserver=" + this.f266811f + ", trackDeepLinks=" + this.f266812g + ", flushAt=" + this.f266813h + ", flushInterval=" + this.f266814i + ", flushPolicies=" + this.f266815j + ", defaultSettings=" + this.f266816k + ", autoAddSegmentDestination=" + this.f266817l + ", apiHost=" + this.f266818m + ", cdnHost=" + this.f266819n + ", requestFactory=" + this.f266820o + ", errorHandler=" + this.f266821p + ')';
    }

    public final boolean u() {
        return this.f266817l;
    }

    @NotNull
    public final String v() {
        return this.f266819n;
    }

    public final boolean w() {
        return this.f266809d;
    }

    @Nullable
    public final Settings x() {
        return this.f266816k;
    }

    @Nullable
    public final Function1<Throwable, Unit> y() {
        return this.f266821p;
    }

    public final int z() {
        return this.f266813h;
    }

    public /* synthetic */ f(String str, Object obj, u uVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, List list, Settings settings, boolean z14, String str2, String str3, q qVar, Function1 function1, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : obj, (i12 & 4) != 0 ? com.segment.analytics.kotlin.core.utilities.d.f266984a : uVar, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) == 0 ? z13 : false, (i12 & 128) != 0 ? 20 : i10, (i12 & 256) != 0 ? 30 : i11, (i12 & 512) != 0 ? CollectionsKt.emptyList() : list, (i12 & 1024) != 0 ? null : settings, (i12 & 2048) != 0 ? true : z14, (i12 & 4096) != 0 ? i.f266827c : str2, (i12 & 8192) != 0 ? i.f266828d : str3, (i12 & 16384) != 0 ? new q() : qVar, (i12 & 32768) != 0 ? null : function1);
    }
}

package com.sdk.growthbook;

import com.sdk.growthbook.model.q;
import com.sdk.growthbook.network.i;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f266270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, q> f266271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g, Unit> f266272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f266273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final i f266274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f266275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f266276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f266277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private Map<String, Integer> f266278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f266279k;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull String apiKey, @NotNull String hostURL, @NotNull Map<String, ? extends q> attributes, @NotNull Function2<? super com.sdk.growthbook.model.f, ? super com.sdk.growthbook.model.g, Unit> trackingCallback, @Nullable String str, @NotNull i networkDispatcher, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(hostURL, "hostURL");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(trackingCallback, "trackingCallback");
        Intrinsics.checkNotNullParameter(networkDispatcher, "networkDispatcher");
        this.f266269a = apiKey;
        this.f266270b = hostURL;
        this.f266271c = attributes;
        this.f266272d = trackingCallback;
        this.f266273e = str;
        this.f266274f = networkDispatcher;
        this.f266275g = z10;
        this.f266276h = z11;
        this.f266278j = new HashMap();
        this.f266279k = true;
    }

    @NotNull
    public final String a() {
        return this.f266269a;
    }

    @NotNull
    public final Map<String, q> b() {
        return this.f266271c;
    }

    public final boolean c() {
        return this.f266276h;
    }

    public final boolean d() {
        return this.f266279k;
    }

    @Nullable
    public final String e() {
        return this.f266273e;
    }

    @NotNull
    public final Map<String, Integer> f() {
        return this.f266278j;
    }

    @NotNull
    public final String g() {
        return this.f266270b;
    }

    @NotNull
    public final i h() {
        return this.f266274f;
    }

    public final boolean i() {
        return this.f266277i;
    }

    public final boolean j() {
        return this.f266275g;
    }

    @NotNull
    public final Function2<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g, Unit> k() {
        return this.f266272d;
    }

    @NotNull
    public abstract e l();

    @NotNull
    public final h m(boolean z10) {
        this.f266279k = z10;
        return this;
    }

    public final void n(boolean z10) {
        this.f266279k = z10;
    }

    @NotNull
    public final h o(@NotNull Map<String, Integer> forcedVariations) {
        Intrinsics.checkNotNullParameter(forcedVariations, "forcedVariations");
        this.f266278j = forcedVariations;
        return this;
    }

    public final void p(@NotNull Map<String, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f266278j = map;
    }

    @NotNull
    public final h q(boolean z10) {
        this.f266277i = z10;
        return this;
    }

    public final void r(boolean z10) {
        this.f266277i = z10;
    }
}

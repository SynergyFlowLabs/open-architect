package com.devtodev.analytics.external.analytics;

import com.devtodev.core.data.metrics.MetricConsts;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDSocialNetwork {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DTDSocialNetwork f98031b = new DTDSocialNetwork(MetricConsts.FacebookInfo);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DTDSocialNetwork f98032c = new DTDSocialNetwork("vk");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DTDSocialNetwork f98033d = new DTDSocialNetwork("tw");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DTDSocialNetwork f98034e = new DTDSocialNetwork("gp");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DTDSocialNetwork f98035f = new DTDSocialNetwork("wp");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DTDSocialNetwork f98036g = new DTDSocialNetwork("vb");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DTDSocialNetwork f98037h = new DTDSocialNetwork("en");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DTDSocialNetwork f98038i = new DTDSocialNetwork("gm");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final DTDSocialNetwork f98039j = new DTDSocialNetwork("in");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final DTDSocialNetwork f98040k = new DTDSocialNetwork("pi");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final DTDSocialNetwork f98041l = new DTDSocialNetwork("rt");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final DTDSocialNetwork f98042m = new DTDSocialNetwork("rr");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DTDSocialNetwork f98043n = new DTDSocialNetwork("tb");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final DTDSocialNetwork f98044o = new DTDSocialNetwork("qq");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98045a;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final DTDSocialNetwork getEvernote() {
            return DTDSocialNetwork.f98037h;
        }

        @NotNull
        public final DTDSocialNetwork getFacebook() {
            return DTDSocialNetwork.f98031b;
        }

        @NotNull
        public final DTDSocialNetwork getGooglemail() {
            return DTDSocialNetwork.f98038i;
        }

        @NotNull
        public final DTDSocialNetwork getGoogleplus() {
            return DTDSocialNetwork.f98034e;
        }

        @NotNull
        public final DTDSocialNetwork getLinkedin() {
            return DTDSocialNetwork.f98039j;
        }

        @NotNull
        public final DTDSocialNetwork getPinterest() {
            return DTDSocialNetwork.f98040k;
        }

        @NotNull
        public final DTDSocialNetwork getQzone() {
            return DTDSocialNetwork.f98044o;
        }

        @NotNull
        public final DTDSocialNetwork getReddit() {
            return DTDSocialNetwork.f98041l;
        }

        @NotNull
        public final DTDSocialNetwork getRenren() {
            return DTDSocialNetwork.f98042m;
        }

        @NotNull
        public final DTDSocialNetwork getTumblr() {
            return DTDSocialNetwork.f98043n;
        }

        @NotNull
        public final DTDSocialNetwork getTwitter() {
            return DTDSocialNetwork.f98033d;
        }

        @NotNull
        public final DTDSocialNetwork getViber() {
            return DTDSocialNetwork.f98036g;
        }

        @NotNull
        public final DTDSocialNetwork getVkontakte() {
            return DTDSocialNetwork.f98032c;
        }

        @NotNull
        public final DTDSocialNetwork getWhatsapp() {
            return DTDSocialNetwork.f98035f;
        }
    }

    public DTDSocialNetwork(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f98045a = name;
    }

    @NotNull
    public final String getName() {
        return this.f98045a;
    }

    @NotNull
    public String toString() {
        return "Name:" + this.f98045a;
    }
}

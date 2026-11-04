package com.facebook.bolts;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f99319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Uri f99320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<a> f99321c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f99322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f99323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Uri f99324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f99325d;

        public a(@NotNull String packageName, @NotNull String className, @NotNull Uri url, @NotNull String appName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.f99322a = packageName;
            this.f99323b = className;
            this.f99324c = url;
            this.f99325d = appName;
        }

        @NotNull
        public final String a() {
            return this.f99325d;
        }

        @NotNull
        public final String b() {
            return this.f99323b;
        }

        @NotNull
        public final String c() {
            return this.f99322a;
        }

        @NotNull
        public final Uri d() {
            return this.f99324c;
        }
    }

    public c(@NotNull Uri sourceUrl, @Nullable List<a> list, @NotNull Uri webUrl) {
        Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
        Intrinsics.checkNotNullParameter(webUrl, "webUrl");
        this.f99319a = sourceUrl;
        this.f99320b = webUrl;
        this.f99321c = list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final Uri a() {
        return this.f99319a;
    }

    @NotNull
    public final List<a> b() {
        List<a> listUnmodifiableList = Collections.unmodifiableList(this.f99321c);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(field)");
        return listUnmodifiableList;
    }

    @NotNull
    public final Uri c() {
        return this.f99320b;
    }
}

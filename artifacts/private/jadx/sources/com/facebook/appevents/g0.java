package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f98873b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f98874c = 20160629001L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<com.facebook.appevents.a, List<e>> f98875a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f98876b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f98877c = 20160629001L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final HashMap<com.facebook.appevents.a, List<e>> f98878a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(@NotNull HashMap<com.facebook.appevents.a, List<e>> proxyEvents) {
            Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
            this.f98878a = proxyEvents;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new g0(this.f98878a);
        }
    }

    public g0() {
        this.f98875a = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return new b(this.f98875a);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    public final void a(@NotNull com.facebook.appevents.a accessTokenAppIdPair, @NotNull List<e> appEvents) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            if (!this.f98875a.containsKey(accessTokenAppIdPair)) {
                this.f98875a.put(accessTokenAppIdPair, CollectionsKt.toMutableList((Collection) appEvents));
                return;
            }
            List<e> list = this.f98875a.get(accessTokenAppIdPair);
            if (list == null) {
                return;
            }
            list.addAll(appEvents);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final boolean b(@NotNull com.facebook.appevents.a accessTokenAppIdPair) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.f98875a.containsKey(accessTokenAppIdPair);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    @NotNull
    public final Set<Map.Entry<com.facebook.appevents.a, List<e>>> c() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Set<Map.Entry<com.facebook.appevents.a, List<e>>> setEntrySet = this.f98875a.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "events.entries");
            return setEntrySet;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @Nullable
    public final List<e> d(@NotNull com.facebook.appevents.a accessTokenAppIdPair) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.f98875a.get(accessTokenAppIdPair);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @NotNull
    public final Set<com.facebook.appevents.a> e() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Set<com.facebook.appevents.a> setKeySet = this.f98875a.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "events.keys");
            return setKeySet;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    public g0(@NotNull HashMap<com.facebook.appevents.a, List<e>> appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap<com.facebook.appevents.a, List<e>> map = new HashMap<>();
        this.f98875a = map;
        map.putAll(appEventMap);
    }
}

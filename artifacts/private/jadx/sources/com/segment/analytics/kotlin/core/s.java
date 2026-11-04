package com.segment.analytics.kotlin.core;

import java.io.InputStream;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface s {
    public static final int A2 = 32000;
    public static final int B2 = 475000;
    public static final int C2 = 475000;

    @NotNull
    public static final a Companion = a.f266963a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f266963a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f266964b = 32000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f266965c = 475000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f266966d = 475000;

        private a() {
        }
    }

    public enum b {
        UserId("segment.userId"),
        Traits("segment.traits"),
        AnonymousId("segment.anonymousId"),
        Settings("segment.settings"),
        Events("segment.events"),
        AppVersion("segment.app.version"),
        AppBuild("segment.app.build"),
        LegacyAppBuild("build"),
        DeviceId("segment.device.id");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f266977a;

        b(String str) {
            this.f266977a = str;
        }

        @NotNull
        public final String l() {
            return this.f266977a;
        }
    }

    @Nullable
    Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    InputStream b(@NotNull String str);

    void c(@NotNull b bVar, @NotNull String str);

    @Nullable
    String d(@NotNull b bVar);

    @Nullable
    Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object f(@NotNull b bVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    boolean g(@NotNull b bVar);

    boolean h(@NotNull String str);
}

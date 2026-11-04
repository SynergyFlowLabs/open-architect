package io.customer.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f288627b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f288628c = "Init";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f288629d = "Push";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ih.e f288630a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m(@NotNull ih.e logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f288630a = logger;
    }

    public final void a(@NotNull String token, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f288630a.a("Automatically registering device token: " + token + " to newly identified profile: " + userId, "Push");
    }

    public final void b() {
        this.f288630a.c("CustomerIO instance is already initialized, skipping the initialization", f288628c, new IllegalStateException("CustomerIO SDK already initialized"));
    }

    public final void c() {
        this.f288630a.a("Creating new instance of CustomerIO SDK version: 4.10.0...", f288628c);
    }

    public final void d() {
        this.f288630a.f("CustomerIO SDK is initialized and ready to use", f288628c);
    }

    public final void e() {
        this.f288630a.a("Deleting device token before identifying new profile", "Push");
    }

    public final void f() {
        this.f288630a.a("Token refreshed, deleting old token to avoid registering same device multiple times", "Push");
    }

    public final void g(@NotNull String token, @Nullable String str) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f288630a.a("Registering device token: " + token + " for user profile: " + str, "Push");
    }

    public final void h() {
        this.f288630a.a("Attempting to register blank token, ignoring request", "Push");
    }

    public final void i(@NotNull String token, @Nullable String str) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f288630a.a("Storing device token: " + token + " for user profile: " + str, "Push");
    }

    public final void j() {
        this.f288630a.a("No device token found. ignoring request to track device attributes", "Push");
    }

    public final void k(@NotNull hh.a<? extends hh.b> module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.f288630a.a("Initializing SDK module " + module.getModuleName() + " with config: " + module.getModuleConfig() + "...", f288628c);
    }

    public final void l(@NotNull hh.a<? extends hh.b> module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.f288630a.f("CustomerIO " + module.getModuleName() + " module is initialized and ready to use", f288628c);
    }
}

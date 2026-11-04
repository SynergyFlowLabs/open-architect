package io.sentry;

import java.io.File;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f305115i = "event.attachment";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f305116j = "event.view_hierarchy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private byte[] f305117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final k2 f305118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Callable<byte[]> f305119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f305120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f305121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f305122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f305123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private String f305124h;

    public b(@NotNull byte[] bArr, @NotNull String str) {
        this(bArr, str, (String) null);
    }

    @NotNull
    public static b a(@NotNull Callable<byte[]> callable, @NotNull String str, @Nullable String str2, boolean z10) {
        return new b(callable, str, str2, f305115i, z10);
    }

    @NotNull
    public static b b(byte[] bArr) {
        return new b(bArr, "screenshot.png", androidx.media3.common.s0.X0, false);
    }

    @NotNull
    public static b c(byte[] bArr) {
        return new b(bArr, "thread-dump.txt", "text/plain", false);
    }

    @NotNull
    public static b d(io.sentry.protocol.h0 h0Var) {
        return new b((k2) h0Var, "view-hierarchy.json", "application/json", f305116j, false);
    }

    @Nullable
    public String e() {
        return this.f305124h;
    }

    @Nullable
    public Callable<byte[]> f() {
        return this.f305119c;
    }

    @Nullable
    public byte[] g() {
        return this.f305117a;
    }

    @Nullable
    public String h() {
        return this.f305122f;
    }

    @NotNull
    public String i() {
        return this.f305121e;
    }

    @Nullable
    public String j() {
        return this.f305120d;
    }

    @Nullable
    public k2 k() {
        return this.f305118b;
    }

    boolean l() {
        return this.f305123g;
    }

    public b(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2) {
        this(bArr, str, str2, false);
    }

    public b(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2, boolean z10) {
        this(bArr, str, str2, f305115i, z10);
    }

    public b(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        this.f305117a = bArr;
        this.f305118b = null;
        this.f305119c = null;
        this.f305121e = str;
        this.f305122f = str2;
        this.f305124h = str3;
        this.f305123g = z10;
    }

    public b(@NotNull k2 k2Var, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        this.f305117a = null;
        this.f305118b = k2Var;
        this.f305119c = null;
        this.f305121e = str;
        this.f305122f = str2;
        this.f305124h = str3;
        this.f305123g = z10;
    }

    public b(@NotNull Callable<byte[]> callable, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        this.f305117a = null;
        this.f305118b = null;
        this.f305119c = callable;
        this.f305121e = str;
        this.f305122f = str2;
        this.f305124h = str3;
        this.f305123g = z10;
    }

    public b(@NotNull String str) {
        this(str, new File(str).getName());
    }

    public b(@NotNull String str, @NotNull String str2) {
        this(str, str2, (String) null);
    }

    public b(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this(str, str2, str3, f305115i, false);
    }

    public b(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z10) {
        this.f305120d = str;
        this.f305121e = str2;
        this.f305118b = null;
        this.f305119c = null;
        this.f305122f = str3;
        this.f305124h = str4;
        this.f305123g = z10;
    }

    public b(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z10) {
        this.f305124h = f305115i;
        this.f305120d = str;
        this.f305121e = str2;
        this.f305118b = null;
        this.f305119c = null;
        this.f305122f = str3;
        this.f305123g = z10;
    }

    public b(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z10, @Nullable String str4) {
        this.f305120d = str;
        this.f305121e = str2;
        this.f305118b = null;
        this.f305119c = null;
        this.f305122f = str3;
        this.f305123g = z10;
        this.f305124h = str4;
    }
}

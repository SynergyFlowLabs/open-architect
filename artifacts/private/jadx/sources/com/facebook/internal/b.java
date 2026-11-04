package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f99720d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static b f99721e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f99722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final UUID f99723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Intent f99724c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized boolean d(b bVar) {
            b bVarC;
            bVarC = c();
            b.b(bVar);
            return bVarC != null;
        }

        @oj.n
        @Nullable
        public final synchronized b b(@NotNull UUID callId, int i10) {
            try {
                Intrinsics.checkNotNullParameter(callId, "callId");
                b bVarC = c();
                if (bVarC != null && Intrinsics.areEqual(bVarC.d(), callId) && bVarC.e() == i10) {
                    d(null);
                    return bVarC;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Nullable
        public final b c() {
            return b.a();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public b(int i10) {
        this(i10, null, 2, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ b a() {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return null;
        }
        try {
            return f99721e;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(b bVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return;
        }
        try {
            f99721e = bVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
        }
    }

    @oj.n
    @Nullable
    public static final synchronized b c(@NotNull UUID uuid, int i10) {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
                return null;
            }
            try {
                return f99720d.b(uuid, i10);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
                return null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @NotNull
    public final UUID d() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f99723b;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    public final int e() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            return this.f99722a;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    @Nullable
    public final Intent f() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f99724c;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    public final boolean g() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            return f99720d.d(this);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    public final void h(int i10) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            this.f99722a = i10;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void i(@Nullable Intent intent) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            this.f99724c = intent;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.j
    public b(int i10, @NotNull UUID callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        this.f99722a = i10;
        this.f99723b = callId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(int i10, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 2) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
        this(i10, uuid);
    }
}

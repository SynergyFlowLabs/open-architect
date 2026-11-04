package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public final class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f125085b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final String f125086c = "firebase_sessions_enabled";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final String f125087d = "firebase_sessions_sessions_restart_timeout";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final String f125088e = "firebase_sessions_sampling_rate";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f125089a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @ij.a
    public b(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f125089a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // com.google.firebase.sessions.settings.n
    @Nullable
    public Double a() {
        if (this.f125089a.containsKey(f125088e)) {
            return Double.valueOf(this.f125089a.getDouble(f125088e));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.n
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return n.a.b(this, dVar);
    }

    @Override // com.google.firebase.sessions.settings.n
    @Nullable
    public Boolean c() {
        if (this.f125089a.containsKey(f125086c)) {
            return Boolean.valueOf(this.f125089a.getBoolean(f125086c));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.n
    @Nullable
    public kotlin.time.c d() {
        if (this.f125089a.containsKey(f125087d)) {
            return kotlin.time.c.q(kotlin.time.e.m0(this.f125089a.getInt(f125087d), kotlin.time.f.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.n
    public boolean e() {
        return n.a.a(this);
    }
}

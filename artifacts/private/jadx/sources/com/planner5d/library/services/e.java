package com.planner5d.library.services;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f224295d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Object f224296e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static e f224297f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final File f224298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final File f224299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f224300c;

    @SourceDebugExtension({"SMAP\nContextCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextCache.kt\ncom/planner5d/library/services/ContextCache$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final e a(@NotNull Context context) {
            e eVar;
            Intrinsics.checkNotNullParameter(context, "context");
            synchronized (e.f224296e) {
                try {
                    eVar = e.f224297f;
                    if (eVar == null || eVar.g()) {
                        eVar = new e(context, null);
                        a aVar = e.f224295d;
                        e.f224297f = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        return System.currentTimeMillis() > this.f224300c;
    }

    @Nullable
    public final File e() {
        return this.f224299b;
    }

    @Nullable
    public final File f() {
        return this.f224298a;
    }

    private e(Context context) {
        this.f224298a = context.getExternalFilesDir(null);
        this.f224299b = context.getExternalCacheDir();
        this.f224300c = System.currentTimeMillis() + ((long) 5000);
    }
}

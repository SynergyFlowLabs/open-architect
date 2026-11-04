package com.facebook.internal.logging.dumpsys;

import java.io.PrintWriter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0911a f99994a = C0911a.f99995a;

    /* JADX INFO: renamed from: com.facebook.internal.logging.dumpsys.a$a, reason: collision with other inner class name */
    public static final class C0911a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0911a f99995a = new C0911a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private static a f99996b;

        private C0911a() {
        }

        @Nullable
        public final a a() {
            return f99996b;
        }

        public final void b(@Nullable a aVar) {
            f99996b = aVar;
        }
    }

    boolean a(@NotNull String str, @NotNull PrintWriter printWriter, @Nullable String[] strArr);
}

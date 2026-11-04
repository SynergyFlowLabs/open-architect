package com.google.firebase.sessions.api;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface c {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f124870e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f124870e;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f124871a;

        public b(@NotNull String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.f124871a = sessionId;
        }

        public static /* synthetic */ b c(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f124871a;
            }
            return bVar.b(str);
        }

        @NotNull
        public final String a() {
            return this.f124871a;
        }

        @NotNull
        public final b b(@NotNull String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return new b(sessionId);
        }

        @NotNull
        public final String d() {
            return this.f124871a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f124871a, ((b) obj).f124871a);
        }

        public int hashCode() {
            return this.f124871a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SessionDetails(sessionId=" + this.f124871a + ')';
        }
    }

    boolean a();

    @NotNull
    a b();

    void c(@NotNull b bVar);
}

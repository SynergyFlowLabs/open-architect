package com.planner5d.library.model.manager.statistics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Long f217776a;

    public static final class a extends g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f217777b = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super(null, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1210126722;
        }

        @NotNull
        public String toString() {
            return "Anonymous";
        }
    }

    public static final class b extends g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f217778b;

        public b(long j10) {
            super(Long.valueOf(j10), null);
            this.f217778b = j10;
        }

        public static /* synthetic */ b d(b bVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = bVar.f217778b;
            }
            return bVar.c(j10);
        }

        @Override // com.planner5d.library.model.manager.statistics.g0
        @NotNull
        public Long a() {
            return Long.valueOf(this.f217778b);
        }

        public final long b() {
            return this.f217778b;
        }

        @NotNull
        public final b c(long j10) {
            return new b(j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f217778b == ((b) obj).f217778b;
        }

        public int hashCode() {
            return Long.hashCode(this.f217778b);
        }

        @NotNull
        public String toString() {
            return "LoggedIn(userId=" + this.f217778b + ")";
        }
    }

    public /* synthetic */ g0(Long l10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10);
    }

    @Nullable
    public Long a() {
        return this.f217776a;
    }

    private g0(Long l10) {
        this.f217776a = l10;
    }
}

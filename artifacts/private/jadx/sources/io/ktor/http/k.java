package io.ktor.http;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k {

    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f295911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f295912b;

        public a(long j10, long j11) {
            super(null);
            this.f295911a = j10;
            this.f295912b = j11;
        }

        public static /* synthetic */ a d(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = aVar.f295911a;
            }
            if ((i10 & 2) != 0) {
                j11 = aVar.f295912b;
            }
            return aVar.c(j10, j11);
        }

        public final long a() {
            return this.f295911a;
        }

        public final long b() {
            return this.f295912b;
        }

        @NotNull
        public final a c(long j10, long j11) {
            return new a(j10, j11);
        }

        public final long e() {
            return this.f295911a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f295911a == aVar.f295911a && this.f295912b == aVar.f295912b;
        }

        public final long f() {
            return this.f295912b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f295911a) * 31) + Long.hashCode(this.f295912b);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f295911a);
            sb2.append(org.apache.commons.codec.language.l.f335457d);
            sb2.append(this.f295912b);
            return sb2.toString();
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f295913a;

        public b(long j10) {
            super(null);
            this.f295913a = j10;
        }

        public static /* synthetic */ b c(b bVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = bVar.f295913a;
            }
            return bVar.b(j10);
        }

        public final long a() {
            return this.f295913a;
        }

        @NotNull
        public final b b(long j10) {
            return new b(j10);
        }

        public final long d() {
            return this.f295913a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f295913a == ((b) obj).f295913a;
        }

        public int hashCode() {
            return Long.hashCode(this.f295913a);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(org.apache.commons.codec.language.l.f335457d);
            sb2.append(this.f295913a);
            return sb2.toString();
        }
    }

    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f295914a;

        public c(long j10) {
            super(null);
            this.f295914a = j10;
        }

        public static /* synthetic */ c c(c cVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f295914a;
            }
            return cVar.b(j10);
        }

        public final long a() {
            return this.f295914a;
        }

        @NotNull
        public final c b(long j10) {
            return new c(j10);
        }

        public final long d() {
            return this.f295914a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f295914a == ((c) obj).f295914a;
        }

        public int hashCode() {
            return Long.hashCode(this.f295914a);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f295914a);
            sb2.append(org.apache.commons.codec.language.l.f335457d);
            return sb2.toString();
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}

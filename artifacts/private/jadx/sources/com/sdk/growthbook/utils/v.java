package com.sdk.growthbook.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface v {

    public static final class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f266529a;

        public a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f266529a = value;
        }

        public static /* synthetic */ a c(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f266529a;
            }
            return aVar.b(str);
        }

        @NotNull
        public final String a() {
            return this.f266529a;
        }

        @NotNull
        public final a b(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new a(value);
        }

        @NotNull
        public final String d() {
            return this.f266529a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f266529a, ((a) obj).f266529a);
        }

        public int hashCode() {
            return this.f266529a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(value=" + this.f266529a + ")";
        }
    }

    public static final class b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f266530a = new b();

        private b() {
        }
    }

    public static final class c implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f266531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f266532b;

        public c(@NotNull String field, @Nullable String str) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.f266531a = field;
            this.f266532b = str;
        }

        public static /* synthetic */ c d(c cVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f266531a;
            }
            if ((i10 & 2) != 0) {
                str2 = cVar.f266532b;
            }
            return cVar.c(str, str2);
        }

        @NotNull
        public final String a() {
            return this.f266531a;
        }

        @Nullable
        public final String b() {
            return this.f266532b;
        }

        @NotNull
        public final c c(@NotNull String field, @Nullable String str) {
            Intrinsics.checkNotNullParameter(field, "field");
            return new c(field, str);
        }

        @NotNull
        public final String e() {
            return this.f266531a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.areEqual(this.f266531a, cVar.f266531a) && Intrinsics.areEqual(this.f266532b, cVar.f266532b)) {
                return true;
            }
            return false;
        }

        @Nullable
        public final String f() {
            return this.f266532b;
        }

        public int hashCode() {
            int iHashCode = this.f266531a.hashCode() * 31;
            String str = this.f266532b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "UnNecessaryOrInvalidField(field=" + this.f266531a + ", value=" + this.f266532b + ")";
        }
    }
}

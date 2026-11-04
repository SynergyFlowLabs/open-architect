package com.sdk.growthbook.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class s<R> {

    public static final class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Exception f266520a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Exception exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f266520a = exception;
        }

        public static /* synthetic */ a c(a aVar, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = aVar.f266520a;
            }
            return aVar.b(exc);
        }

        @NotNull
        public final Exception a() {
            return this.f266520a;
        }

        @NotNull
        public final a b(@NotNull Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new a(exception);
        }

        @NotNull
        public final Exception d() {
            return this.f266520a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f266520a, ((a) obj).f266520a);
        }

        public int hashCode() {
            return this.f266520a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(exception=" + this.f266520a + ")";
        }
    }

    public static final class b<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f266521a;

        public b(T t10) {
            super(null);
            this.f266521a = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = bVar.f266521a;
            }
            return bVar.b(obj);
        }

        public final T a() {
            return this.f266521a;
        }

        @NotNull
        public final b<T> b(T t10) {
            return new b<>(t10);
        }

        public final T d() {
            return this.f266521a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f266521a, ((b) obj).f266521a);
        }

        public int hashCode() {
            T t10 = this.f266521a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(data=" + this.f266521a + ")";
        }
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private s() {
    }
}

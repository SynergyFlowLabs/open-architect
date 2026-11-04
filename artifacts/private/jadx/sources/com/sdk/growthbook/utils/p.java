package com.sdk.growthbook.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class p<T> {

    public static final class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f266511a = new a();

        private a() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1860197977;
        }

        @NotNull
        public String toString() {
            return "NotPresent";
        }
    }

    public static final class b<T> extends p<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f266512a;

        public b(T t10) {
            super(null);
            this.f266512a = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = bVar.f266512a;
            }
            return bVar.b(obj);
        }

        public final T a() {
            return this.f266512a;
        }

        @NotNull
        public final b<T> b(T t10) {
            return new b<>(t10);
        }

        public final T d() {
            return this.f266512a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f266512a, ((b) obj).f266512a);
        }

        public int hashCode() {
            T t10 = this.f266512a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Present(value=" + this.f266512a + ")";
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private p() {
    }
}

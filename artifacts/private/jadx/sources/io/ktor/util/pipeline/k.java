package io.ktor.util.pipeline;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {

    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final j f296783a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull j relativeTo) {
            super(null);
            Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
            this.f296783a = relativeTo;
        }

        @NotNull
        public final j a() {
            return this.f296783a;
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final j f296784a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull j relativeTo) {
            super(null);
            Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
            this.f296784a = relativeTo;
        }

        @NotNull
        public final j a() {
            return this.f296784a;
        }
    }

    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f296785a = new c();

        private c() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 967869129;
        }

        @NotNull
        public String toString() {
            return "Last";
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}

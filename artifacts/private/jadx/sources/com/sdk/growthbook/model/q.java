package com.sdk.growthbook.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class q {

    @NotNull
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f266379a = new b();

        private b() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1025661968;
        }

        @NotNull
        public String toString() {
            return com.facebook.internal.a.f99697t;
        }
    }

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean c() {
        return (this instanceof n) || (this instanceof c) || (this instanceof p) || (this instanceof o);
    }

    private q() {
    }
}

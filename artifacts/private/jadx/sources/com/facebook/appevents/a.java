package com.facebook.appevents;

import androidx.annotation.b1;
import com.facebook.AccessToken;
import com.facebook.internal.e1;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C0896a f98583c = new C0896a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f98584d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f98586b;

    /* JADX INFO: renamed from: com.facebook.appevents.a$a, reason: collision with other inner class name */
    public static final class C0896a {
        public /* synthetic */ C0896a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0896a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0897a f98587c = new C0897a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f98588d = -2488473066578201069L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f98589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f98590b;

        /* JADX INFO: renamed from: com.facebook.appevents.a$b$a, reason: collision with other inner class name */
        public static final class C0897a {
            public /* synthetic */ C0897a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0897a() {
            }
        }

        public b(@Nullable String str, @NotNull String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.f98589a = str;
            this.f98590b = appId;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new a(this.f98589a, this.f98590b);
        }
    }

    public a(@Nullable String str, @NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f98585a = applicationId;
        e1 e1Var = e1.f99794a;
        this.f98586b = e1.Z(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new b(this.f98586b, this.f98585a);
    }

    @Nullable
    public final String a() {
        return this.f98586b;
    }

    @NotNull
    public final String b() {
        return this.f98585a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        e1 e1Var = e1.f99794a;
        a aVar = (a) obj;
        return e1.e(aVar.f98586b, this.f98586b) && e1.e(aVar.f98585a, this.f98585a);
    }

    public int hashCode() {
        String str = this.f98586b;
        return this.f98585a.hashCode() ^ (str == null ? 0 : str.hashCode());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@NotNull AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        String strT = accessToken.t();
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        this(strT, com.facebook.g0.o());
    }
}

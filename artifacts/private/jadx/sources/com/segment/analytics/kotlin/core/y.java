package com.segment.analytics.kotlin.core;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class y implements sovran.kotlin.c {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f267091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f267092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private JsonObject f267093c;

    @SourceDebugExtension({"SMAP\nState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 State.kt\ncom/segment/analytics/kotlin/core/UserInfo$Companion\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,197:1\n96#2:198\n*S KotlinDebug\n*F\n+ 1 State.kt\ncom/segment/analytics/kotlin/core/UserInfo$Companion\n*L\n157#1:198\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final y a(@NotNull s storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            String strD = storage.d(s.b.UserId);
            Json.Default r10 = Json.Default;
            String strD2 = storage.d(s.b.Traits);
            if (strD2 == null) {
                strD2 = "{}";
            }
            r10.getSerializersModule();
            JsonObject jsonObject = (JsonObject) r10.decodeFromString(hk.a.v(JsonObject.Companion.serializer()), strD2);
            String strD3 = storage.d(s.b.AnonymousId);
            if (strD3 == null) {
                strD3 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(strD3, "randomUUID().toString()");
            }
            return new y(strD3, strD, jsonObject);
        }

        private a() {
        }
    }

    public static final class b implements sovran.kotlin.a<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f267094a;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final String b() {
            return this.f267094a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public y a(@NotNull y state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new y(this.f267094a, null, null);
        }

        public final void d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f267094a = str;
        }

        public b(@NotNull String anonymousId) {
            Intrinsics.checkNotNullParameter(anonymousId, "anonymousId");
            this.f267094a = anonymousId;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    public static final class c implements sovran.kotlin.a<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f267095a;

        public c(@NotNull String anonymousId) {
            Intrinsics.checkNotNullParameter(anonymousId, "anonymousId");
            this.f267095a = anonymousId;
        }

        @NotNull
        public final String b() {
            return this.f267095a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public y a(@NotNull y state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new y(this.f267095a, state.h(), state.g());
        }

        public final void d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f267095a = str;
        }
    }

    public static final class d implements sovran.kotlin.a<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private JsonObject f267096a;

        public d(@NotNull JsonObject traits) {
            Intrinsics.checkNotNullParameter(traits, "traits");
            this.f267096a = traits;
        }

        @NotNull
        public final JsonObject b() {
            return this.f267096a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public y a(@NotNull y state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new y(state.f(), state.h(), this.f267096a);
        }

        public final void d(@NotNull JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
            this.f267096a = jsonObject;
        }
    }

    public static final class e implements sovran.kotlin.a<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f267097a;

        public e(@NotNull String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.f267097a = userId;
        }

        @NotNull
        public final String b() {
            return this.f267097a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public y a(@NotNull y state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new y(state.f(), this.f267097a, state.g());
        }

        public final void d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f267097a = str;
        }
    }

    public static final class f implements sovran.kotlin.a<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f267098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private JsonObject f267099b;

        public f(@NotNull String userId, @NotNull JsonObject traits) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(traits, "traits");
            this.f267098a = userId;
            this.f267099b = traits;
        }

        @NotNull
        public final JsonObject b() {
            return this.f267099b;
        }

        @NotNull
        public final String c() {
            return this.f267098a;
        }

        @Override // sovran.kotlin.a
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public y a(@NotNull y state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new y(state.f(), this.f267098a, this.f267099b);
        }

        public final void e(@NotNull JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
            this.f267099b = jsonObject;
        }

        public final void f(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f267098a = str;
        }
    }

    public y(@NotNull String anonymousId, @Nullable String str, @Nullable JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(anonymousId, "anonymousId");
        this.f267091a = anonymousId;
        this.f267092b = str;
        this.f267093c = jsonObject;
    }

    public static /* synthetic */ y e(y yVar, String str, String str2, JsonObject jsonObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = yVar.f267091a;
        }
        if ((i10 & 2) != 0) {
            str2 = yVar.f267092b;
        }
        if ((i10 & 4) != 0) {
            jsonObject = yVar.f267093c;
        }
        return yVar.d(str, str2, jsonObject);
    }

    @NotNull
    public final String a() {
        return this.f267091a;
    }

    @Nullable
    public final String b() {
        return this.f267092b;
    }

    @Nullable
    public final JsonObject c() {
        return this.f267093c;
    }

    @NotNull
    public final y d(@NotNull String anonymousId, @Nullable String str, @Nullable JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(anonymousId, "anonymousId");
        return new y(anonymousId, str, jsonObject);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f267091a, yVar.f267091a) && Intrinsics.areEqual(this.f267092b, yVar.f267092b) && Intrinsics.areEqual(this.f267093c, yVar.f267093c);
    }

    @NotNull
    public final String f() {
        return this.f267091a;
    }

    @Nullable
    public final JsonObject g() {
        return this.f267093c;
    }

    @Nullable
    public final String h() {
        return this.f267092b;
    }

    public int hashCode() {
        int iHashCode = this.f267091a.hashCode() * 31;
        String str = this.f267092b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JsonObject jsonObject = this.f267093c;
        return iHashCode2 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final void i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f267091a = str;
    }

    public final void j(@Nullable JsonObject jsonObject) {
        this.f267093c = jsonObject;
    }

    public final void k(@Nullable String str) {
        this.f267092b = str;
    }

    @NotNull
    public String toString() {
        return "UserInfo(anonymousId=" + this.f267091a + ", userId=" + this.f267092b + ", traits=" + this.f267093c + ')';
    }
}

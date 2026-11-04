package androidx.navigation;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Uri f71405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f71406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f71407c;

    @SourceDebugExtension({"SMAP\nNavDeepLinkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkRequest.kt\nandroidx/navigation/NavDeepLinkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final C0633a f71408d = new C0633a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Uri f71409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f71410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f71411c;

        /* JADX INFO: renamed from: androidx.navigation.w1$a$a, reason: collision with other inner class name */
        public static final class C0633a {
            public /* synthetic */ C0633a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @oj.n
            @NotNull
            public final a a(@NotNull String action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
                }
                a aVar = new a(null);
                aVar.e(action);
                return aVar;
            }

            @oj.n
            @NotNull
            public final a b(@NotNull String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                a aVar = new a(null);
                aVar.f(mimeType);
                return aVar;
            }

            @oj.n
            @NotNull
            public final a c(@NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                a aVar = new a(null);
                aVar.g(uri);
                return aVar;
            }

            private C0633a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public static final a b(@NotNull String str) {
            return f71408d.a(str);
        }

        @oj.n
        @NotNull
        public static final a c(@NotNull String str) {
            return f71408d.b(str);
        }

        @oj.n
        @NotNull
        public static final a d(@NotNull Uri uri) {
            return f71408d.c(uri);
        }

        @NotNull
        public final w1 a() {
            return new w1(this.f71409a, this.f71410b, this.f71411c);
        }

        @NotNull
        public final a e(@NotNull String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
            }
            this.f71410b = action;
            return this;
        }

        @NotNull
        public final a f(@NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            if (new Regex("^[-\\w*.]+/[-\\w+*.]+$").k(mimeType)) {
                this.f71411c = mimeType;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + mimeType + " does not match to required \"type/subtype\" format").toString());
        }

        @NotNull
        public final a g(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f71409a = uri;
            return this;
        }

        private a() {
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public w1(@Nullable Uri uri, @Nullable String str, @Nullable String str2) {
        this.f71405a = uri;
        this.f71406b = str;
        this.f71407c = str2;
    }

    @Nullable
    public String a() {
        return this.f71406b;
    }

    @Nullable
    public String b() {
        return this.f71407c;
    }

    @Nullable
    public Uri c() {
        return this.f71405a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

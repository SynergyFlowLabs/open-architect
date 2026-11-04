package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final c f99974f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f99975g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f99976h = "%s/%s/picture";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f99977i = "height";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f99978j = "width";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f99979k = "access_token";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f99980l = "migration_overrides";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f99981m = "{october_2012:true}";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f99982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Uri f99983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final b f99984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f99985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f99986e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f99987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Uri f99988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private b f99989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f99990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Object f99991e;

        public a(@NotNull Context context, @NotNull Uri imageUri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            this.f99987a = context;
            this.f99988b = imageUri;
        }

        private final Context b() {
            return this.f99987a;
        }

        private final Uri c() {
            return this.f99988b;
        }

        public static /* synthetic */ a e(a aVar, Context context, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = aVar.f99987a;
            }
            if ((i10 & 2) != 0) {
                uri = aVar.f99988b;
            }
            return aVar.d(context, uri);
        }

        @NotNull
        public final l0 a() {
            Context context = this.f99987a;
            Uri uri = this.f99988b;
            b bVar = this.f99989c;
            boolean z10 = this.f99990d;
            Object obj = this.f99991e;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return new l0(context, uri, bVar, z10, obj, null);
        }

        @NotNull
        public final a d(@NotNull Context context, @NotNull Uri imageUri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            return new a(context, imageUri);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f99987a, aVar.f99987a) && Intrinsics.areEqual(this.f99988b, aVar.f99988b);
        }

        @NotNull
        public final a f(boolean z10) {
            this.f99990d = z10;
            return this;
        }

        @NotNull
        public final a g(@Nullable b bVar) {
            this.f99989c = bVar;
            return this;
        }

        @NotNull
        public final a h(@Nullable Object obj) {
            this.f99991e = obj;
            return this;
        }

        public int hashCode() {
            return (this.f99987a.hashCode() * 31) + this.f99988b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Builder(context=" + this.f99987a + ", imageUri=" + this.f99988b + ')';
        }
    }

    public interface b {
        void a(@Nullable m0 m0Var);
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final Uri a(@Nullable String str, int i10, int i11) {
            return b(str, i10, i11, "");
        }

        @oj.n
        @NotNull
        public final Uri b(@Nullable String str, int i10, int i11, @Nullable String str2) {
            f1 f1Var = f1.f99837a;
            f1.t(str, "userId");
            int i12 = 7 << 0;
            int iMax = Math.max(i10, 0);
            int iMax2 = Math.max(i11, 0);
            if (!((iMax == 0 && iMax2 == 0) ? false : true)) {
                throw new IllegalArgumentException("Either width or height must be greater than 0");
            }
            z0 z0Var = z0.f100267a;
            Uri.Builder builderBuildUpon = Uri.parse(z0.h()).buildUpon();
            q1 q1Var = q1.f312784a;
            Locale locale = Locale.US;
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            String str3 = String.format(locale, l0.f99976h, Arrays.copyOf(new Object[]{com.facebook.g0.B(), str}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(locale, format, *args)");
            Uri.Builder builderPath = builderBuildUpon.path(str3);
            if (iMax2 != 0) {
                builderPath.appendQueryParameter("height", String.valueOf(iMax2));
            }
            if (iMax != 0) {
                builderPath.appendQueryParameter("width", String.valueOf(iMax));
            }
            builderPath.appendQueryParameter(l0.f99980l, l0.f99981m);
            e1 e1Var = e1.f99794a;
            if (!e1.Z(str2)) {
                builderPath.appendQueryParameter("access_token", str2);
            } else if (!e1.Z(com.facebook.g0.v()) && !e1.Z(com.facebook.g0.o())) {
                builderPath.appendQueryParameter("access_token", com.facebook.g0.o() + '|' + com.facebook.g0.v());
            }
            Uri uriBuild = builderPath.build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "builder.build()");
            return uriBuild;
        }

        private c() {
        }
    }

    public /* synthetic */ l0(Context context, Uri uri, b bVar, boolean z10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, bVar, z10, obj);
    }

    @oj.n
    @NotNull
    public static final Uri f(@Nullable String str, int i10, int i11) {
        return f99974f.a(str, i10, i11);
    }

    @oj.n
    @NotNull
    public static final Uri g(@Nullable String str, int i10, int i11, @Nullable String str2) {
        return f99974f.b(str, i10, i11, str2);
    }

    public final boolean a() {
        return this.f99985d;
    }

    @Nullable
    public final b b() {
        return this.f99984c;
    }

    @NotNull
    public final Object c() {
        return this.f99986e;
    }

    @NotNull
    public final Context d() {
        return this.f99982a;
    }

    @NotNull
    public final Uri e() {
        return this.f99983b;
    }

    public final boolean h() {
        return this.f99985d;
    }

    private l0(Context context, Uri uri, b bVar, boolean z10, Object obj) {
        this.f99982a = context;
        this.f99983b = uri;
        this.f99984c = bVar;
        this.f99985d = z10;
        this.f99986e = obj;
    }
}

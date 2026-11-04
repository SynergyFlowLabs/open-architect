package w3;

import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSupportSQLiteQueryBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f385906j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f385907k = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f385908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f385909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String[] f385910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f385911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Object[] f385912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f385913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f385914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private String f385915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private String f385916i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final h a(@NotNull String tableName) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new h(tableName, null);
        }

        private a() {
        }
    }

    public /* synthetic */ h(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private final void a(StringBuilder sb2, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb2.append(str);
        sb2.append(str2);
    }

    private final void b(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        int i10 = 2 | 0;
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr[i11];
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(' ');
    }

    @n
    @NotNull
    public static final h c(@NotNull String str) {
        return f385906j.a(str);
    }

    @NotNull
    public final h d(@Nullable String[] strArr) {
        this.f385910c = strArr;
        return this;
    }

    @NotNull
    public final g e() {
        String str;
        String str2 = this.f385913f;
        if ((str2 == null || str2.length() == 0) && (str = this.f385914g) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("SELECT ");
        if (this.f385909b) {
            sb2.append("DISTINCT ");
        }
        String[] strArr = this.f385910c;
        if (strArr == null || strArr.length == 0) {
            sb2.append("* ");
        } else {
            Intrinsics.checkNotNull(strArr);
            b(sb2, strArr);
        }
        sb2.append("FROM ");
        sb2.append(this.f385908a);
        a(sb2, " WHERE ", this.f385911d);
        a(sb2, " GROUP BY ", this.f385913f);
        a(sb2, " HAVING ", this.f385914g);
        a(sb2, " ORDER BY ", this.f385915h);
        a(sb2, " LIMIT ", this.f385916i);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return new b(string, this.f385912e);
    }

    @NotNull
    public final h f() {
        this.f385909b = true;
        return this;
    }

    @NotNull
    public final h g(@Nullable String str) {
        this.f385913f = str;
        return this;
    }

    @NotNull
    public final h h(@Nullable String str) {
        this.f385914g = str;
        return this;
    }

    @NotNull
    public final h i(@NotNull String limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        boolean zMatches = f385907k.matcher(limit).matches();
        if (limit.length() == 0 || zMatches) {
            this.f385916i = limit;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + limit).toString());
    }

    @NotNull
    public final h j(@Nullable String str) {
        this.f385915h = str;
        return this;
    }

    @NotNull
    public final h k(@Nullable String str, @Nullable Object[] objArr) {
        this.f385911d = str;
        this.f385912e = objArr;
        return this;
    }

    private h(String str) {
        this.f385908a = str;
    }
}

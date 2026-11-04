package androidx.window.core;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Comparable<i> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f76281f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final i f76282g = new i(0, 0, 0, "");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final i f76283h = new i(0, 1, 0, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final i f76284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final i f76285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f76286k = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f76287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f76289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f76290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f76291e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final i a() {
            return i.f76285j;
        }

        @NotNull
        public final i b() {
            return i.f76282g;
        }

        @NotNull
        public final i c() {
            return i.f76283h;
        }

        @NotNull
        public final i d() {
            return i.f76284i;
        }

        @n
        @Nullable
        public final i e(@Nullable String str) {
            if (str != null && !StringsKt.w3(str)) {
                Matcher matcher = Pattern.compile(i.f76286k).matcher(str);
                if (!matcher.matches()) {
                    return null;
                }
                String strGroup = matcher.group(1);
                Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
                if (numValueOf == null) {
                    return null;
                }
                int iIntValue = numValueOf.intValue();
                String strGroup2 = matcher.group(2);
                Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
                if (numValueOf2 == null) {
                    return null;
                }
                int iIntValue2 = numValueOf2.intValue();
                String strGroup3 = matcher.group(3);
                Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
                if (numValueOf3 == null) {
                    return null;
                }
                int iIntValue3 = numValueOf3.intValue();
                String description = matcher.group(4) != null ? matcher.group(4) : "";
                Intrinsics.checkNotNullExpressionValue(description, "description");
                return new i(iIntValue, iIntValue2, iIntValue3, description, null);
            }
            return null;
        }

        private a() {
        }
    }

    static final class b extends l0 implements Function0<BigInteger> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(i.this.s()).shiftLeft(32).or(BigInteger.valueOf(i.this.t())).shiftLeft(32).or(BigInteger.valueOf(i.this.v()));
        }
    }

    static {
        i iVar = new i(1, 0, 0, "");
        f76284i = iVar;
        f76285j = iVar;
    }

    public /* synthetic */ i(int i10, int i11, int i12, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str);
    }

    private final BigInteger q() {
        Object value = this.f76291e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @n
    @Nullable
    public static final i w(@Nullable String str) {
        return f76281f.e(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f76287a == iVar.f76287a && this.f76288b == iVar.f76288b && this.f76289c == iVar.f76289c;
    }

    public int hashCode() {
        return ((((527 + this.f76287a) * 31) + this.f76288b) * 31) + this.f76289c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull i other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return q().compareTo(other.q());
    }

    @NotNull
    public final String r() {
        return this.f76290d;
    }

    public final int s() {
        return this.f76287a;
    }

    public final int t() {
        return this.f76288b;
    }

    @NotNull
    public String toString() {
        return this.f76287a + '.' + this.f76288b + '.' + this.f76289c + (!StringsKt.w3(this.f76290d) ? Intrinsics.stringPlus("-", this.f76290d) : "");
    }

    public final int v() {
        return this.f76289c;
    }

    private i(int i10, int i11, int i12, String str) {
        this.f76287a = i10;
        this.f76288b = i11;
        this.f76289c = i12;
        this.f76290d = str;
        this.f76291e = g0.c(new b());
    }
}

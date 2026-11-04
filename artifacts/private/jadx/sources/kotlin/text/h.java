package kotlin.text;

import kotlin.Unit;
import kotlin.a1;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.s
@e1(version = "1.9")
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c f313318d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final h f313319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final h f313320f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f313321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f313322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f313323c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f313324a = h.f313318d.a().e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private b.a f313325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private d.a f313326c;

        @a1
        public a() {
        }

        @kotlin.internal.f
        private final void b(Function1<? super b.a, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke(c());
        }

        @kotlin.internal.f
        private final void f(Function1<? super d.a, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke(d());
        }

        @a1
        @NotNull
        public final h a() {
            b bVarA;
            d dVarA;
            boolean z10 = this.f313324a;
            b.a aVar = this.f313325b;
            if (aVar == null || (bVarA = aVar.a()) == null) {
                bVarA = b.f313327j.a();
            }
            d.a aVar2 = this.f313326c;
            if (aVar2 == null || (dVarA = aVar2.a()) == null) {
                dVarA = d.f313344h.a();
            }
            return new h(z10, bVarA, dVarA);
        }

        @NotNull
        public final b.a c() {
            if (this.f313325b == null) {
                this.f313325b = new b.a();
            }
            b.a aVar = this.f313325b;
            Intrinsics.checkNotNull(aVar);
            return aVar;
        }

        @NotNull
        public final d.a d() {
            if (this.f313326c == null) {
                this.f313326c = new d.a();
            }
            d.a aVar = this.f313326c;
            Intrinsics.checkNotNull(aVar);
            return aVar;
        }

        public final boolean e() {
            return this.f313324a;
        }

        public final void g(boolean z10) {
            this.f313324a = z10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final C2267b f313327j = new C2267b(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private static final b f313328k = new b(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f313329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f313330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f313331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f313332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final String f313333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final String f313334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f313335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f313336h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f313337i;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f313338a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f313339b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private String f313340c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            private String f313341d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            private String f313342e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            private String f313343f;

            public a() {
                C2267b c2267b = b.f313327j;
                this.f313338a = c2267b.a().g();
                this.f313339b = c2267b.a().f();
                this.f313340c = c2267b.a().h();
                this.f313341d = c2267b.a().d();
                this.f313342e = c2267b.a().c();
                this.f313343f = c2267b.a().e();
            }

            @NotNull
            public final b a() {
                return new b(this.f313338a, this.f313339b, this.f313340c, this.f313341d, this.f313342e, this.f313343f);
            }

            @NotNull
            public final String b() {
                return this.f313342e;
            }

            @NotNull
            public final String c() {
                return this.f313341d;
            }

            @NotNull
            public final String d() {
                return this.f313343f;
            }

            public final int e() {
                return this.f313339b;
            }

            public final int f() {
                return this.f313338a;
            }

            @NotNull
            public final String g() {
                return this.f313340c;
            }

            public final void h(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.U2(value, '\n', false, 2, null) && !StringsKt__StringsKt.U2(value, org.apache.commons.lang3.k.f337188d, false, 2, null)) {
                    this.f313342e = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
            }

            public final void i(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.U2(value, '\n', false, 2, null) && !StringsKt__StringsKt.U2(value, org.apache.commons.lang3.k.f337188d, false, 2, null)) {
                    this.f313341d = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
            }

            public final void j(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int i10 = 0 >> 0;
                if (!StringsKt__StringsKt.U2(value, '\n', false, 2, null) && !StringsKt__StringsKt.U2(value, org.apache.commons.lang3.k.f337188d, false, 2, null)) {
                    this.f313343f = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
            }

            public final void k(int i10) {
                if (i10 > 0) {
                    this.f313339b = i10;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i10);
            }

            public final void l(int i10) {
                if (i10 > 0) {
                    this.f313338a = i10;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i10);
            }

            public final void m(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.f313340c = str;
            }
        }

        /* JADX INFO: renamed from: kotlin.text.h$b$b, reason: collision with other inner class name */
        public static final class C2267b {
            public /* synthetic */ C2267b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final b a() {
                return b.f313328k;
            }

            private C2267b() {
            }
        }

        public b(int i10, int i11, @NotNull String groupSeparator, @NotNull String byteSeparator, @NotNull String bytePrefix, @NotNull String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.f313329a = i10;
            this.f313330b = i11;
            this.f313331c = groupSeparator;
            this.f313332d = byteSeparator;
            this.f313333e = bytePrefix;
            this.f313334f = byteSuffix;
            this.f313335g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f313336h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f313337i = i.c(groupSeparator) || i.c(byteSeparator) || i.c(bytePrefix) || i.c(byteSuffix);
        }

        @NotNull
        public final StringBuilder b(@NotNull StringBuilder sb2, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f313329a);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f313330b);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f313331c);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f313332d);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f313333e);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f313334f);
            sb2.append("\"");
            return sb2;
        }

        @NotNull
        public final String c() {
            return this.f313333e;
        }

        @NotNull
        public final String d() {
            return this.f313332d;
        }

        @NotNull
        public final String e() {
            return this.f313334f;
        }

        public final int f() {
            return this.f313330b;
        }

        public final int g() {
            return this.f313329a;
        }

        @NotNull
        public final String h() {
            return this.f313331c;
        }

        public final boolean i() {
            return this.f313337i;
        }

        public final boolean j() {
            return this.f313335g;
        }

        public final boolean k() {
            return this.f313336h;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            StringBuilder sbB = b(sb2, "    ");
            sbB.append('\n');
            Intrinsics.checkNotNullExpressionValue(sbB, "append(...)");
            sb2.append(")");
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h a() {
            return h.f313319e;
        }

        @NotNull
        public final h b() {
            return h.f313320f;
        }

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final b f313344h = new b(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final d f313345i = new d("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f313346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f313347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f313348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f313349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f313350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f313351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f313352g;

        @SourceDebugExtension({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormat$NumberHexFormat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,844:1\n1#2:845\n*E\n"})
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private String f313353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private String f313354b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f313355c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f313356d;

            public a() {
                b bVar = d.f313344h;
                this.f313353a = bVar.a().f();
                this.f313354b = bVar.a().h();
                this.f313355c = bVar.a().g();
                this.f313356d = bVar.a().d();
            }

            @e1(version = "2.0")
            public static /* synthetic */ void c() {
            }

            @NotNull
            public final d a() {
                return new d(this.f313353a, this.f313354b, this.f313355c, this.f313356d);
            }

            public final int b() {
                return this.f313356d;
            }

            @NotNull
            public final String d() {
                return this.f313353a;
            }

            public final boolean e() {
                return this.f313355c;
            }

            @NotNull
            public final String f() {
                return this.f313354b;
            }

            public final void g(int i10) {
                if (i10 > 0) {
                    this.f313356d = i10;
                    return;
                }
                throw new IllegalArgumentException(("Non-positive values are prohibited for minLength, but was " + i10).toString());
            }

            public final void h(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.U2(value, '\n', false, 2, null) && !StringsKt__StringsKt.U2(value, org.apache.commons.lang3.k.f337188d, false, 2, null)) {
                    this.f313353a = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
            }

            public final void i(boolean z10) {
                this.f313355c = z10;
            }

            public final void j(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.U2(value, '\n', false, 2, null) && !StringsKt__StringsKt.U2(value, org.apache.commons.lang3.k.f337188d, false, 2, null)) {
                    this.f313354b = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final d a() {
                return d.f313345i;
            }

            private b() {
            }
        }

        public d(@NotNull String prefix, @NotNull String suffix, boolean z10, int i10) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.f313346a = prefix;
            this.f313347b = suffix;
            this.f313348c = z10;
            this.f313349d = i10;
            int i11 = 2 >> 0;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f313350e = z11;
            this.f313351f = z11 && i10 == 1;
            this.f313352g = i.c(prefix) || i.c(suffix);
        }

        @e1(version = "2.0")
        public static /* synthetic */ void e() {
        }

        @NotNull
        public final StringBuilder b(@NotNull StringBuilder sb2, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f313346a);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f313347b);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f313348c);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(AbstractJsonLexerKt.COMMA);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f313349d);
            return sb2;
        }

        public final boolean c() {
            return this.f313352g;
        }

        public final int d() {
            return this.f313349d;
        }

        @NotNull
        public final String f() {
            return this.f313346a;
        }

        public final boolean g() {
            return this.f313348c;
        }

        @NotNull
        public final String h() {
            return this.f313347b;
        }

        public final boolean i() {
            return this.f313350e;
        }

        public final boolean j() {
            return this.f313351f;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            StringBuilder sbB = b(sb2, "    ");
            sbB.append('\n');
            Intrinsics.checkNotNullExpressionValue(sbB, "append(...)");
            sb2.append(")");
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    static {
        b.C2267b c2267b = b.f313327j;
        b bVarA = c2267b.a();
        d.b bVar = d.f313344h;
        f313319e = new h(false, bVarA, bVar.a());
        f313320f = new h(true, c2267b.a(), bVar.a());
    }

    public h(boolean z10, @NotNull b bytes, @NotNull d number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f313321a = z10;
        this.f313322b = bytes;
        this.f313323c = number;
    }

    @NotNull
    public final b c() {
        return this.f313322b;
    }

    @NotNull
    public final d d() {
        return this.f313323c;
    }

    public final boolean e() {
        return this.f313321a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("    upperCase = ");
        sb2.append(this.f313321a);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(",");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("    bytes = BytesHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        StringBuilder sbB = this.f313322b.b(sb2, "        ");
        sbB.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbB, "append(...)");
        sb2.append("    ),");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("    number = NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        StringBuilder sbB2 = this.f313323c.b(sb2, "        ");
        sbB2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbB2, "append(...)");
        sb2.append("    )");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(")");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

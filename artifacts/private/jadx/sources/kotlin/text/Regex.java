package kotlin.text;

import io.ktor.http.t1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.CollectionsKt;
import kotlin.e1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n22#2,3:398\n1#3:401\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:398,3\n*E\n"})
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f313196c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Pattern f313197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Set<? extends n> f313198b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        @NotNull
        public final String c(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuote = Pattern.quote(literal);
            Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
            return strQuote;
        }

        @NotNull
        public final String d(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            Intrinsics.checkNotNullExpressionValue(strQuoteReplacement, "quoteReplacement(...)");
            return strQuoteReplacement;
        }

        @NotNull
        public final Regex e(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            return new Regex(literal, n.LITERAL);
        }

        private a() {
        }
    }

    private static final class b implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f313199c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f313200d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f313201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f313202b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(@NotNull String pattern, int i10) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.f313201a = pattern;
            this.f313202b = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f313201a, this.f313202b);
            Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }

        public final int a() {
            return this.f313202b;
        }

        @NotNull
        public final String b() {
            return this.f313201a;
        }
    }

    static final class c extends l0 implements Function0<MatchResult> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f313204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f313205c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence, int i10) {
            super(0);
            this.f313204b = charSequence;
            this.f313205c = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final MatchResult invoke() {
            return Regex.this.c(this.f313204b, this.f313205c);
        }
    }

    /* synthetic */ class d extends g0 implements Function1<MatchResult, MatchResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f313206a = new d();

        d() {
            super(1, MatchResult.class, t1.b.f296120h, "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final MatchResult invoke(MatchResult p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.next();
        }
    }

    static final class e extends l0 implements Function1<n, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f313207a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10) {
            super(1);
            this.f313207a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(n nVar) {
            n nVar2 = nVar;
            return Boolean.valueOf((this.f313207a & nVar2.k()) == nVar2.getValue());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {275, 283, 287}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    static final class f extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super String>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313211d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ CharSequence f313213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f313214g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CharSequence charSequence, int i10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f313213f = charSequence;
            this.f313214g = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = Regex.this.new f(this.f313213f, this.f313214g, dVar);
            fVar.f313211d = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0081 A[PHI: r1 r6 r11
          0x0081: PHI (r1v9 int) = (r1v8 int), (r1v14 int) binds: [B:21:0x007e, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x0081: PHI (r6v2 kotlin.sequences.n) = (r6v1 kotlin.sequences.n), (r6v4 kotlin.sequences.n) binds: [B:21:0x007e, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x0081: PHI (r11v5 java.util.regex.Matcher) = (r11v4 java.util.regex.Matcher), (r11v9 java.util.regex.Matcher) binds: [B:21:0x007e, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x008c  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
        
            if (r6.b(r11, r10) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
        
            if (r11.b(r1, r10) == r0) goto L34;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007e -> B:23:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super String> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @a1
    public Regex(@NotNull Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f313197a = nativePattern;
    }

    public static /* synthetic */ MatchResult d(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.c(charSequence, i10);
    }

    public static /* synthetic */ Sequence f(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
            int i12 = 5 & 0;
        }
        return regex.e(charSequence, i10);
    }

    public static /* synthetic */ List p(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.o(charSequence, i10);
    }

    public static /* synthetic */ Sequence r(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.q(charSequence, i10);
    }

    private final Object writeReplace() {
        String strPattern = this.f313197a.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return new b(strPattern, this.f313197a.flags());
    }

    public final boolean b(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f313197a.matcher(input).find();
    }

    @Nullable
    public final MatchResult c(@NotNull CharSequence input, int i10) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f313197a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return m.f(matcher, i10, input);
    }

    @NotNull
    public final Sequence<MatchResult> e(@NotNull CharSequence input, int i10) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (i10 >= 0 && i10 <= input.length()) {
            return kotlin.sequences.o.n(new c(input, i10), d.f313206a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + input.length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Set<n> g() {
        Set set = this.f313198b;
        Set set2 = set;
        if (set == null) {
            int iFlags = this.f313197a.flags();
            EnumSet enumSetAllOf = EnumSet.allOf(n.class);
            Intrinsics.checkNotNull(enumSetAllOf);
            CollectionsKt.retainAll(enumSetAllOf, new e(iFlags));
            Set setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
            this.f313198b = setUnmodifiableSet;
            set2 = setUnmodifiableSet;
        }
        return set2;
    }

    @NotNull
    public final String h() {
        String strPattern = this.f313197a.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return strPattern;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.7")
    @Nullable
    public final MatchResult i(@NotNull CharSequence input, int i10) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcherRegion = this.f313197a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        Intrinsics.checkNotNull(matcherRegion);
        return new l(matcherRegion, input);
    }

    @Nullable
    public final MatchResult j(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f313197a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return m.h(matcher, input);
    }

    public final boolean k(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f313197a.matcher(input).matches();
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.7")
    public final boolean l(@NotNull CharSequence input, int i10) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f313197a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length()).lookingAt();
    }

    @NotNull
    public final String m(@NotNull CharSequence input, @NotNull Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iIntValue = 0;
        MatchResult matchResultD = d(this, input, 0, 2, null);
        if (matchResultD == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, matchResultD.o6().u().intValue());
            sb2.append(transform.invoke(matchResultD));
            iIntValue = matchResultD.o6().i().intValue() + 1;
            matchResultD = matchResultD.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultD != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String n(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceFirst = this.f313197a.matcher(input).replaceFirst(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    @NotNull
    public final List<String> o(@NotNull CharSequence input, int i10) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt__StringsKt.N4(i10);
        Matcher matcher = this.f313197a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return CollectionsKt.listOf(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? kotlin.ranges.r.B(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.6")
    @NotNull
    public final Sequence<String> q(@NotNull CharSequence input, int i10) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt__StringsKt.N4(i10);
        return kotlin.sequences.o.b(new f(input, i10, null));
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceAll = this.f313197a.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @NotNull
    public final Pattern s() {
        return this.f313197a;
    }

    @NotNull
    public String toString() {
        String string = this.f313197a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern, @NotNull n option) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, f313196c.b(option.getValue()));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern, @NotNull Set<? extends n> options) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, f313196c.b(m.k(options)));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }
}

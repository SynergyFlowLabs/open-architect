package com.superwall.sdk.contrib.threeteen;

import androidx.media3.exoplayer.upstream.h;
import com.facebook.appevents.p;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.threeten.bp.format.f;
import org.threeten.bp.n;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAmountFormats.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmountFormats.kt\ncom/superwall/sdk/contrib/threeteen/AmountFormats\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,791:1\n295#2,2:792\n1#3:794\n*S KotlinDebug\n*F\n+ 1 AmountFormats.kt\ncom/superwall/sdk/contrib/threeteen/AmountFormats\n*L\n597#1:792,2\n*E\n"})
public final class AmountFormats {

    @NotNull
    private static final String BUNDLE_NAME = "com.superwall.extra.wordbased";
    private static final int DAYS_PER_WEEK = 7;

    @NotNull
    private static final List<DurationUnit> DURATION_UNITS;

    @NotNull
    private static final FractionScalarPart EMPTY_FRACTION;
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int NANOS_PER_MILLIS = 1000000;
    private static final int SECONDS_PER_MINUTE = 60;

    @NotNull
    private static final String WORDBASED_COMMASPACE = "WordBased.commaspace";

    @NotNull
    private static final String WORDBASED_DAY = "WordBased.day";

    @NotNull
    private static final String WORDBASED_HOUR = "WordBased.hour";

    @NotNull
    private static final String WORDBASED_MILLISECOND = "WordBased.millisecond";

    @NotNull
    private static final String WORDBASED_MINUTE = "WordBased.minute";

    @NotNull
    private static final String WORDBASED_MONTH = "WordBased.month";

    @NotNull
    private static final String WORDBASED_SECOND = "WordBased.second";

    @NotNull
    private static final String WORDBASED_SPACEANDSPACE = "WordBased.spaceandspace";

    @NotNull
    private static final String WORDBASED_WEEK = "WordBased.week";

    @NotNull
    private static final String WORDBASED_YEAR = "WordBased.year";

    @NotNull
    public static final AmountFormats INSTANCE = new AmountFormats();
    private static final Pattern SPLITTER = Pattern.compile("[|][|][|]");

    @NotNull
    private static final IntPredicate PREDICATE_1 = new IntPredicate() { // from class: com.superwall.sdk.contrib.threeteen.a
        @Override // com.superwall.sdk.contrib.threeteen.AmountFormats.IntPredicate
        public final boolean test(int i10) {
            return AmountFormats.PREDICATE_1$lambda$0(i10);
        }
    };

    @NotNull
    private static final IntPredicate PREDICATE_END1_NOT11 = new IntPredicate() { // from class: com.superwall.sdk.contrib.threeteen.b
        @Override // com.superwall.sdk.contrib.threeteen.AmountFormats.IntPredicate
        public final boolean test(int i10) {
            return AmountFormats.PREDICATE_END1_NOT11$lambda$1(i10);
        }
    };

    @NotNull
    private static final IntPredicate PREDICATE_END234_NOTTEENS = new IntPredicate() { // from class: com.superwall.sdk.contrib.threeteen.c
        @Override // com.superwall.sdk.contrib.threeteen.AmountFormats.IntPredicate
        public final boolean test(int i10) {
            return AmountFormats.PREDICATE_END234_NOTTEENS$lambda$2(i10);
        }
    };

    public interface DurationScalar {
        @NotNull
        org.threeten.bp.e applyTo(@NotNull DurationUnit durationUnit);
    }

    public static final class DurationUnit {

        @NotNull
        private final String abbrev;

        @NotNull
        private final org.threeten.bp.e value;

        public DurationUnit(@NotNull String abbrev, @NotNull org.threeten.bp.e value) {
            Intrinsics.checkNotNullParameter(abbrev, "abbrev");
            Intrinsics.checkNotNullParameter(value, "value");
            this.abbrev = abbrev;
            this.value = value;
        }

        @NotNull
        public final CharSequence consumeDurationUnit(@NotNull CharSequence text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return text.subSequence(this.abbrev.length(), text.length());
        }

        public final boolean prefixMatchesUnit(@NotNull CharSequence text) {
            Intrinsics.checkNotNullParameter(text, "text");
            if (text.length() >= this.abbrev.length()) {
                String str = this.abbrev;
                if (Intrinsics.areEqual(str, text.subSequence(0, str.length()))) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final org.threeten.bp.e scaleBy(@NotNull Function1<? super org.threeten.bp.e, org.threeten.bp.e> scaleFunc) {
            Intrinsics.checkNotNullParameter(scaleFunc, "scaleFunc");
            return scaleFunc.invoke(this.value);
        }
    }

    public static final class FractionScalarPart implements DurationScalar {
        private final long scale;
        private final long value;

        public FractionScalarPart(long j10, long j11) {
            this.value = j10;
            this.scale = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final org.threeten.bp.e applyTo$lambda$0(FractionScalarPart fractionScalarPart, org.threeten.bp.e d10) {
            Intrinsics.checkNotNullParameter(d10, "d");
            org.threeten.bp.e eVarR = d10.O(fractionScalarPart.value).r(fractionScalarPart.scale);
            Intrinsics.checkNotNull(eVarR, "null cannot be cast to non-null type org.threeten.bp.Duration");
            return eVarR;
        }

        @Override // com.superwall.sdk.contrib.threeteen.AmountFormats.DurationScalar
        @NotNull
        public org.threeten.bp.e applyTo(@NotNull DurationUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            if (this.value == 0) {
                org.threeten.bp.e eVar = org.threeten.bp.e.f340012c;
                Intrinsics.checkNotNull(eVar);
                return eVar;
            }
            org.threeten.bp.e eVarScaleBy = unit.scaleBy(new Function1() { // from class: com.superwall.sdk.contrib.threeteen.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AmountFormats.FractionScalarPart.applyTo$lambda$0(this.f267399a, (org.threeten.bp.e) obj);
                }
            });
            Intrinsics.checkNotNull(eVarScaleBy);
            return eVarScaleBy;
        }
    }

    public interface IntPredicate {
        boolean test(int i10);
    }

    public static final class IntegerScalarPart implements DurationScalar {
        private final long value;

        public IntegerScalarPart(long j10) {
            this.value = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final org.threeten.bp.e applyTo$lambda$0(IntegerScalarPart integerScalarPart, org.threeten.bp.e d10) {
            Intrinsics.checkNotNullParameter(d10, "d");
            return d10.O(integerScalarPart.value);
        }

        @Override // com.superwall.sdk.contrib.threeteen.AmountFormats.DurationScalar
        @NotNull
        public org.threeten.bp.e applyTo(@NotNull DurationUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            org.threeten.bp.e eVarScaleBy = unit.scaleBy(new Function1() { // from class: com.superwall.sdk.contrib.threeteen.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AmountFormats.IntegerScalarPart.applyTo$lambda$0(this.f267400a, (org.threeten.bp.e) obj);
                }
            });
            Intrinsics.checkNotNull(eVarScaleBy, "null cannot be cast to non-null type org.threeten.bp.Duration");
            return eVarScaleBy;
        }
    }

    public static final class ParsedUnitPart implements DurationScalar {

        @NotNull
        private final CharSequence remainingText;

        @NotNull
        private final DurationScalar scalar;

        public ParsedUnitPart(@NotNull CharSequence remainingText, @NotNull DurationScalar scalar) {
            Intrinsics.checkNotNullParameter(remainingText, "remainingText");
            Intrinsics.checkNotNullParameter(scalar, "scalar");
            this.remainingText = remainingText;
            this.scalar = scalar;
        }

        @Override // com.superwall.sdk.contrib.threeteen.AmountFormats.DurationScalar
        @NotNull
        public org.threeten.bp.e applyTo(@NotNull DurationUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this.scalar.applyTo(unit);
        }

        @NotNull
        public final CharSequence remainingText() {
            return this.remainingText;
        }
    }

    @SourceDebugExtension({"SMAP\nAmountFormats.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmountFormats.kt\ncom/superwall/sdk/contrib/threeteen/AmountFormats$PredicateFormat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,791:1\n1#2:792\n11165#3:793\n11500#3,3:794\n37#4,2:797\n*S KotlinDebug\n*F\n+ 1 AmountFormats.kt\ncom/superwall/sdk/contrib/threeteen/AmountFormats$PredicateFormat\n*L\n697#1:793\n697#1:794,3\n699#1:797,2\n*E\n"})
    public static final class PredicateFormat implements UnitFormat {

        @NotNull
        private final IntPredicate[] predicates;

        @NotNull
        private final String[] text;

        public PredicateFormat(@NotNull String[] predicateStrs, @NotNull String[] text) {
            Intrinsics.checkNotNullParameter(predicateStrs, "predicateStrs");
            Intrinsics.checkNotNullParameter(text, "text");
            if (predicateStrs.length + 1 != text.length) {
                throw new IllegalStateException("Invalid word-based resource");
            }
            ArrayList arrayList = new ArrayList(predicateStrs.length);
            for (String str : predicateStrs) {
                Intrinsics.checkNotNull(str);
                arrayList.add(findPredicate(str));
            }
            this.predicates = (IntPredicate[]) arrayList.toArray(new IntPredicate[0]);
            this.text = text;
        }

        private final IntPredicate findPredicate(String str) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1690360067) {
                if (iHashCode != -1663276706) {
                    if (iHashCode == 79430 && str.equals("One")) {
                        return AmountFormats.PREDICATE_1;
                    }
                } else if (str.equals("End234NotTeens")) {
                    return AmountFormats.PREDICATE_END234_NOTTEENS;
                }
            } else if (str.equals("End1Not11")) {
                return AmountFormats.PREDICATE_END1_NOT11;
            }
            throw new IllegalStateException("Invalid word-based resource");
        }

        @Override // com.superwall.sdk.contrib.threeteen.AmountFormats.UnitFormat
        public void formatTo(int i10, @NotNull StringBuilder buf) {
            Intrinsics.checkNotNullParameter(buf, "buf");
            int length = this.predicates.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (this.predicates[i11].test(i10)) {
                    buf.append(i10);
                    buf.append(this.text[i11]);
                    return;
                }
            }
            buf.append(i10);
            buf.append(this.text[this.predicates.length]);
        }
    }

    public static final class SinglePluralFormat implements UnitFormat {

        @NotNull
        private final String plural;

        @NotNull
        private final String single;

        public SinglePluralFormat(@NotNull String single, @NotNull String plural) {
            Intrinsics.checkNotNullParameter(single, "single");
            Intrinsics.checkNotNullParameter(plural, "plural");
            this.single = single;
            this.plural = plural;
        }

        @Override // com.superwall.sdk.contrib.threeteen.AmountFormats.UnitFormat
        public void formatTo(int i10, @NotNull StringBuilder buf) {
            Intrinsics.checkNotNullParameter(buf, "buf");
            buf.append(i10);
            buf.append((i10 == -1 || i10 == 1) ? this.single : this.plural);
        }
    }

    public interface UnitFormat {

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @NotNull
            public final UnitFormat of(@NotNull ResourceBundle bundle, @NotNull String keyStem) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(keyStem, "keyStem");
                if (!bundle.containsKey(keyStem + "s.predicates")) {
                    String string = bundle.getString(keyStem);
                    String string2 = bundle.getString(keyStem + "s");
                    Intrinsics.checkNotNull(string);
                    Intrinsics.checkNotNull(string2);
                    return new SinglePluralFormat(string, string2);
                }
                String string3 = bundle.getString(keyStem + "s.predicates");
                String string4 = bundle.getString(keyStem + "s.list");
                String[] strArrSplit = AmountFormats.SPLITTER.split(string3);
                String[] strArrSplit2 = AmountFormats.SPLITTER.split(string4);
                Intrinsics.checkNotNull(strArrSplit);
                Intrinsics.checkNotNull(strArrSplit2);
                return new PredicateFormat(strArrSplit, strArrSplit2);
            }
        }

        public static final class DefaultImpls {
            public static void formatTo(@NotNull UnitFormat unitFormat, int i10, @NotNull StringBuilder buf) {
                Intrinsics.checkNotNullParameter(buf, "buf");
            }
        }

        void formatTo(int i10, @NotNull StringBuilder sb2);
    }

    public static final class WordBased {

        @NotNull
        private final String lastSeparator;

        @NotNull
        private final String separator;

        @NotNull
        private final UnitFormat[] units;

        public WordBased(@NotNull UnitFormat[] units, @NotNull String separator, @NotNull String lastSeparator) {
            Intrinsics.checkNotNullParameter(units, "units");
            Intrinsics.checkNotNullParameter(separator, "separator");
            Intrinsics.checkNotNullParameter(lastSeparator, "lastSeparator");
            this.units = units;
            this.separator = separator;
            this.lastSeparator = lastSeparator;
        }

        @NotNull
        public final String format(@NotNull int[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            StringBuilder sb2 = new StringBuilder(32);
            int i10 = 0;
            for (int i11 : values) {
                if (i11 != 0) {
                    i10++;
                }
            }
            int length = values.length;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = values[i13];
                if (i14 != 0 || (i12 == 0 && i13 == values.length - 1)) {
                    this.units[i13].formatTo(i14, sb2);
                    int i15 = i10 - 2;
                    if (i12 < i15) {
                        sb2.append(this.separator);
                    } else if (i12 == i15) {
                        sb2.append(this.lastSeparator);
                    }
                    i12++;
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    static {
        org.threeten.bp.e eVarX = org.threeten.bp.e.X(1L);
        Intrinsics.checkNotNullExpressionValue(eVarX, "ofNanos(...)");
        DurationUnit durationUnit = new DurationUnit("ns", eVarX);
        org.threeten.bp.e eVarX2 = org.threeten.bp.e.X(1000L);
        Intrinsics.checkNotNullExpressionValue(eVarX2, "ofNanos(...)");
        DurationUnit durationUnit2 = new DurationUnit("µs", eVarX2);
        org.threeten.bp.e eVarX3 = org.threeten.bp.e.X(1000L);
        Intrinsics.checkNotNullExpressionValue(eVarX3, "ofNanos(...)");
        DurationUnit durationUnit3 = new DurationUnit("μs", eVarX3);
        org.threeten.bp.e eVarX4 = org.threeten.bp.e.X(1000L);
        Intrinsics.checkNotNullExpressionValue(eVarX4, "ofNanos(...)");
        DurationUnit durationUnit4 = new DurationUnit("us", eVarX4);
        org.threeten.bp.e eVarV = org.threeten.bp.e.V(1L);
        Intrinsics.checkNotNullExpressionValue(eVarV, "ofMillis(...)");
        DurationUnit durationUnit5 = new DurationUnit("ms", eVarV);
        org.threeten.bp.e eVarY = org.threeten.bp.e.Y(1L);
        Intrinsics.checkNotNullExpressionValue(eVarY, "ofSeconds(...)");
        DurationUnit durationUnit6 = new DurationUnit("s", eVarY);
        org.threeten.bp.e eVarW = org.threeten.bp.e.W(1L);
        Intrinsics.checkNotNullExpressionValue(eVarW, "ofMinutes(...)");
        DurationUnit durationUnit7 = new DurationUnit(h.f66001o, eVarW);
        org.threeten.bp.e eVarU = org.threeten.bp.e.U(1L);
        Intrinsics.checkNotNullExpressionValue(eVarU, "ofHours(...)");
        DURATION_UNITS = CollectionsKt.listOf((Object[]) new DurationUnit[]{durationUnit, durationUnit2, durationUnit3, durationUnit4, durationUnit5, durationUnit6, durationUnit7, new DurationUnit(h.f65993g, eVarU)});
        EMPTY_FRACTION = new FractionScalarPart(0L, 0L);
    }

    private AmountFormats() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PREDICATE_1$lambda$0(int i10) {
        return i10 == 1 || i10 == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PREDICATE_END1_NOT11$lambda$1(int i10) {
        int iAbs = Math.abs(i10);
        return iAbs % 10 == 1 && (iAbs % 100) / 10 != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PREDICATE_END234_NOTTEENS$lambda$2(int i10) {
        int iAbs = Math.abs(i10);
        int i11 = iAbs % 10;
        return i11 >= 2 && i11 <= 4 && (iAbs % 100) / 10 != 1;
    }

    private final ParsedUnitPart consumeDurationFraction(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11 = 0;
        long j10 = 0;
        long j11 = 1;
        boolean z10 = false;
        while (i11 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i11);
            if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                break;
            }
            if (z10 || j10 > 922337203685477580L) {
                i11++;
            } else {
                long j12 = 10;
                long j13 = (j10 * j12) + ((long) (cCharAt - '0'));
                if (j13 < 0) {
                    i11++;
                    z10 = true;
                } else {
                    j11 *= j12;
                    i11++;
                    j10 = j13;
                }
            }
        }
        if (i11 != 0) {
            return new ParsedUnitPart(charSequence.subSequence(i11, charSequence.length()), new FractionScalarPart(j10, j11));
        }
        throw new f("Missing numeric fraction after '.'", charSequence2, i10);
    }

    private final ParsedUnitPart consumeDurationLeadingInt(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        long j10 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                break;
            }
            if (j10 > 922337203685477580L) {
                throw new f("Duration string exceeds valid numeric range", charSequence2, i11 + i10);
            }
            j10 = (j10 * ((long) 10)) + ((long) (cCharAt - '0'));
            if (j10 < 0) {
                throw new f("Duration string exceeds valid numeric range", charSequence2, i11 + i10);
            }
            i11++;
        }
        if (i11 != 0) {
            return new ParsedUnitPart(charSequence.subSequence(i11, charSequence.length()), new IntegerScalarPart(j10));
        }
        throw new f("Missing leading integer", charSequence2, i10);
    }

    /* JADX INFO: renamed from: consumePrefix-gIAlu-s, reason: not valid java name */
    private final Object m21consumePrefixgIAlus(CharSequence charSequence, char c10) {
        if (charSequence.length() <= 0 || charSequence.charAt(0) != c10) {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(new Exception("Prefix not found")));
        }
        Result.a aVar2 = Result.Companion;
        return Result.m785constructorimpl(charSequence.subSequence(1, charSequence.length()));
    }

    /* JADX INFO: renamed from: findUnit-IoAF18A, reason: not valid java name */
    private final Object m22findUnitIoAF18A(CharSequence charSequence) {
        Object next;
        Iterator<T> it = DURATION_UNITS.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((DurationUnit) next).prefixMatchesUnit(charSequence));
        DurationUnit durationUnit = (DurationUnit) next;
        Result.a aVar = Result.Companion;
        return durationUnit != null ? Result.m785constructorimpl(durationUnit) : Result.m785constructorimpl(ResultKt.createFailure(new Exception("No matching duration unit found")));
    }

    private final boolean oppositeSigns(int i10, int i11) {
        if (i10 < 0) {
            return i11 >= 0;
        }
        return i11 < 0;
    }

    @NotNull
    public final ResourceBundle getResourceBundle(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            return ResourceBundle.getBundle(BUNDLE_NAME, locale);
        } catch (MissingResourceException e10) {
            Logger.INSTANCE.debug(LogLevel.error, LogScope.localizationManager, "Resource not found: com.superwall.extra.wordbased", MapsKt.mapOf(TuplesKt.to("locale", locale)), e10);
            return ResourceBundle.getBundle(BUNDLE_NAME, Locale.ENGLISH);
        }
    }

    @NotNull
    public final String iso8601(@NotNull n period, @NotNull org.threeten.bp.e duration) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Objects.requireNonNull(period, "period must not be null");
        Objects.requireNonNull(duration, "duration must not be null");
        if (period.g()) {
            String string = duration.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        if (duration.x()) {
            String string2 = period.toString();
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = duration.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String strSubstring = string3.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return period + strSubstring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final org.threeten.bp.e parseUnitBasedDuration(@NotNull CharSequence durationText) {
        CharSequence charSequence;
        byte b10;
        int i10;
        DurationScalar durationScalar;
        Intrinsics.checkNotNullParameter(durationText, "durationText");
        Objects.requireNonNull(durationText, "durationText must not be null");
        Object objM21consumePrefixgIAlus = m21consumePrefixgIAlus(durationText, l.f335457d);
        boolean z10 = true;
        if (Result.h(objM21consumePrefixgIAlus)) {
            if (Result.m786isFailureimpl(objM21consumePrefixgIAlus)) {
                objM21consumePrefixgIAlus = null;
            }
            Intrinsics.checkNotNull(objM21consumePrefixgIAlus);
            charSequence = (CharSequence) objM21consumePrefixgIAlus;
            b10 = -1;
        } else {
            Object objM21consumePrefixgIAlus2 = m21consumePrefixgIAlus(durationText, '+');
            boolean zH = Result.h(objM21consumePrefixgIAlus2);
            if (Result.m786isFailureimpl(objM21consumePrefixgIAlus2)) {
                objM21consumePrefixgIAlus2 = null;
            }
            charSequence = (CharSequence) objM21consumePrefixgIAlus2;
            if (charSequence == null) {
                charSequence = durationText;
            }
            z10 = zH;
            b10 = 1;
        }
        if (Intrinsics.areEqual(charSequence, p.f99189d0)) {
            org.threeten.bp.e ZERO = org.threeten.bp.e.f340012c;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        if (charSequence.length() == 0) {
            throw new f("Not a numeric value", durationText, 0);
        }
        org.threeten.bp.e eVarG0 = org.threeten.bp.e.f340012c;
        int length = charSequence.length();
        while (length > 0) {
            ParsedUnitPart parsedUnitPartConsumeDurationLeadingInt = consumeDurationLeadingInt(charSequence, durationText, i10);
            int length2 = i10 + (charSequence.length() - parsedUnitPartConsumeDurationLeadingInt.remainingText().length());
            CharSequence charSequenceRemainingText = parsedUnitPartConsumeDurationLeadingInt.remainingText();
            FractionScalarPart fractionScalarPart = EMPTY_FRACTION;
            Object objM21consumePrefixgIAlus3 = m21consumePrefixgIAlus(charSequenceRemainingText, '.');
            if (Result.h(objM21consumePrefixgIAlus3)) {
                int i11 = length2 + 1;
                if (Result.m786isFailureimpl(objM21consumePrefixgIAlus3)) {
                    i10 = z10;
                    durationScalar = fractionScalarPart;
                    objM21consumePrefixgIAlus3 = null;
                }
                i10 = z10;
                durationScalar = fractionScalarPart;
                Intrinsics.checkNotNull(objM21consumePrefixgIAlus3);
                CharSequence charSequence2 = (CharSequence) objM21consumePrefixgIAlus3;
                ParsedUnitPart parsedUnitPartConsumeDurationFraction = consumeDurationFraction(charSequence2, durationText, i11);
                length2 = i11 + (charSequence2.length() - parsedUnitPartConsumeDurationFraction.remainingText().length());
                charSequenceRemainingText = parsedUnitPartConsumeDurationFraction.remainingText();
                durationScalar = parsedUnitPartConsumeDurationFraction;
            }
            i10 = z10;
            durationScalar = fractionScalarPart;
            Object objM22findUnitIoAF18A = m22findUnitIoAF18A(charSequenceRemainingText);
            if (Result.m786isFailureimpl(objM22findUnitIoAF18A)) {
                throw new f("Invalid duration unit", durationText, length2);
            }
            if (Result.m786isFailureimpl(objM22findUnitIoAF18A)) {
                objM22findUnitIoAF18A = null;
            }
            Intrinsics.checkNotNull(objM22findUnitIoAF18A);
            DurationUnit durationUnit = (DurationUnit) objM22findUnitIoAF18A;
            try {
                eVarG0 = eVarG0.g0(parsedUnitPartConsumeDurationLeadingInt.applyTo(durationUnit).g0(durationScalar.applyTo(durationUnit)));
                CharSequence charSequenceConsumeDurationUnit = durationUnit.consumeDurationUnit(charSequenceRemainingText);
                int length3 = length2 + (charSequenceRemainingText.length() - charSequenceConsumeDurationUnit.length());
                length = charSequenceConsumeDurationUnit.length();
                charSequence = charSequenceConsumeDurationUnit;
                i10 = length3;
            } catch (ArithmeticException e10) {
                throw new f("Duration string exceeds valid numeric range", durationText, length2, e10);
            }
        }
        if (b10 >= 0) {
            i10 = z10;
            Intrinsics.checkNotNull(eVarG0);
            return eVarG0;
        }
        i10 = z10;
        org.threeten.bp.e eVarR = eVarG0.R();
        Intrinsics.checkNotNullExpressionValue(eVarR, "negated(...)");
        return eVarR;
    }

    @NotNull
    public final String wordBased(@NotNull n period, @NotNull Locale locale) {
        int iP;
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Objects.requireNonNull(period, "period must not be null");
        Objects.requireNonNull(locale, "locale must not be null");
        ResourceBundle resourceBundle = getResourceBundle(locale);
        UnitFormat.Companion companion = UnitFormat.Companion;
        int iP2 = 0;
        UnitFormat[] unitFormatArr = {companion.of(resourceBundle, WORDBASED_YEAR), companion.of(resourceBundle, WORDBASED_MONTH), companion.of(resourceBundle, WORDBASED_WEEK), companion.of(resourceBundle, WORDBASED_DAY)};
        String string = resourceBundle.getString(WORDBASED_COMMASPACE);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = resourceBundle.getString(WORDBASED_SPACEANDSPACE);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        WordBased wordBased = new WordBased(unitFormatArr, string, string2);
        if (oppositeSigns(period.q(), period.r())) {
            period = period.k();
        }
        if (period.p() % 7 == 0) {
            iP2 = period.p() / 7;
            iP = 0;
        } else {
            iP = period.p();
        }
        return wordBased.format(new int[]{period.r(), period.q(), iP2, iP});
    }

    @NotNull
    public final String wordBased(@NotNull org.threeten.bp.e duration, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Objects.requireNonNull(duration, "duration must not be null");
        Objects.requireNonNull(locale, "locale must not be null");
        ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);
        UnitFormat.Companion companion = UnitFormat.Companion;
        Intrinsics.checkNotNull(bundle);
        UnitFormat[] unitFormatArr = {companion.of(bundle, WORDBASED_HOUR), companion.of(bundle, WORDBASED_MINUTE), companion.of(bundle, WORDBASED_SECOND), companion.of(bundle, WORDBASED_MILLISECOND)};
        String string = bundle.getString(WORDBASED_COMMASPACE);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = bundle.getString(WORDBASED_SPACEANDSPACE);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        long j10 = 60;
        return new WordBased(unitFormatArr, string, string2).format(new int[]{(int) duration.q0(), (int) (duration.u0() % j10), (int) (duration.v() % j10), duration.t() / 1000000});
    }

    @NotNull
    public final String wordBased(@NotNull n period, @NotNull org.threeten.bp.e duration, @NotNull Locale locale) {
        int iP;
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Objects.requireNonNull(period, "period must not be null");
        Objects.requireNonNull(duration, "duration must not be null");
        Objects.requireNonNull(locale, "locale must not be null");
        ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);
        UnitFormat.Companion companion = UnitFormat.Companion;
        Intrinsics.checkNotNull(bundle);
        int iP2 = 0;
        int i10 = 2 & 3;
        UnitFormat[] unitFormatArr = {companion.of(bundle, WORDBASED_YEAR), companion.of(bundle, WORDBASED_MONTH), companion.of(bundle, WORDBASED_WEEK), companion.of(bundle, WORDBASED_DAY), companion.of(bundle, WORDBASED_HOUR), companion.of(bundle, WORDBASED_MINUTE), companion.of(bundle, WORDBASED_SECOND), companion.of(bundle, WORDBASED_MILLISECOND)};
        String string = bundle.getString(WORDBASED_COMMASPACE);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = bundle.getString(WORDBASED_SPACEANDSPACE);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        WordBased wordBased = new WordBased(unitFormatArr, string, string2);
        if (oppositeSigns(period.q(), period.r())) {
            period = period.k();
        }
        if (period.p() % 7 == 0) {
            iP = period.p() / 7;
        } else {
            iP = 0;
            iP2 = period.p();
        }
        long jQ0 = duration.q0();
        long j10 = 24;
        long j11 = 60;
        return wordBased.format(new int[]{period.r(), period.q(), iP, iP2 + ((int) (jQ0 / j10)), (int) (jQ0 % j10), (int) (duration.u0() % j11), (int) (duration.v() % j11), duration.t() / 1000000});
    }
}

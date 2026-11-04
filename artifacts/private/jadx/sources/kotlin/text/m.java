package kotlin.text;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1797#2,3:398\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:398,3\n*E\n"})
public final class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> extends l0 implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f313364a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f313364a = i10;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Enum r10) {
            f fVar = (f) r10;
            return Boolean.valueOf((this.f313364a & fVar.k()) == fVar.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult f(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new l(matcher, charSequence);
        }
        return null;
    }

    private static final /* synthetic */ <T extends Enum<T> & f> Set<T> g(int i10) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        EnumSet enumSetAllOf = EnumSet.allOf(Enum.class);
        Intrinsics.checkNotNull(enumSetAllOf);
        Intrinsics.needClassReification();
        CollectionsKt.retainAll(enumSetAllOf, new a(i10));
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult h(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new l(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange i(java.util.regex.MatchResult matchResult) {
        return kotlin.ranges.r.W1(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange j(java.util.regex.MatchResult matchResult, int i10) {
        return kotlin.ranges.r.W1(matchResult.start(i10), matchResult.end(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(Iterable<? extends f> iterable) {
        Iterator<? extends f> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}

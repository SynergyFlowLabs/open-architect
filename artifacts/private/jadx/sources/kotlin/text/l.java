package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class l implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Matcher f313357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CharSequence f313358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j f313359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private List<String> f313360d;

    public static final class a extends AbstractList<String> {
        a() {
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = l.this.e().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        public /* bridge */ int d(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return l.this.e().groupCount() + 1;
        }

        public /* bridge */ int i(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return d((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return i((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains(str);
        }
    }

    public l(@NotNull Matcher matcher, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f313357a = matcher;
        this.f313358b = input;
        this.f313359c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult e() {
        return this.f313357a;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public MatchResult.b a() {
        return MatchResult.a.a(this);
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public j b() {
        return this.f313359c;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public List<String> c() {
        if (this.f313360d == null) {
            this.f313360d = new a();
        }
        List<String> list = this.f313360d;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public String getValue() {
        String strGroup = e().group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    @Nullable
    public MatchResult next() {
        int iEnd = e().end() + (e().end() == e().start() ? 1 : 0);
        if (iEnd > this.f313358b.length()) {
            return null;
        }
        Matcher matcher = this.f313357a.pattern().matcher(this.f313358b);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return m.f(matcher, iEnd, this.f313358b);
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public IntRange o6() {
        return m.i(e());
    }

    public static final class b extends AbstractCollection<MatchGroup> implements k {

        static final class a extends l0 implements Function1<Integer, MatchGroup> {
            a() {
                super(1);
            }

            public final MatchGroup c(int i10) {
                return b.this.get(i10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MatchGroup invoke(Integer num) {
                return c(num.intValue());
            }
        }

        b() {
        }

        public /* bridge */ boolean c(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return c((MatchGroup) obj);
            }
            return false;
        }

        @Override // kotlin.text.j
        public MatchGroup get(int i10) {
            IntRange intRangeJ = m.j(l.this.e(), i10);
            if (intRangeJ.u().intValue() < 0) {
                return null;
            }
            String strGroup = l.this.e().group(i10);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            return new MatchGroup(strGroup, intRangeJ);
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return l.this.e().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<MatchGroup> iterator() {
            return kotlin.sequences.o.k1(CollectionsKt.asSequence(CollectionsKt.getIndices(this)), new a()).iterator();
        }

        @Override // kotlin.text.k
        public MatchGroup get(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return kotlin.internal.m.f312513a.c(l.this.e(), name);
        }
    }
}

package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b(emulated = true)
@k
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.e f116603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f116604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f116605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f116606d;

    class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.e f116607a;

        /* JADX INFO: renamed from: com.google.common.base.o0$a$a, reason: collision with other inner class name */
        class C1047a extends g {
            C1047a(o0 splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // com.google.common.base.o0.g
            int f(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // com.google.common.base.o0.g
            int g(int start) {
                return a.this.f116607a.o(this.f116621c, start);
            }
        }

        a(final com.google.common.base.e val$separatorMatcher) {
            this.f116607a = val$separatorMatcher;
        }

        @Override // com.google.common.base.o0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(o0 splitter, final CharSequence toSplit) {
            return new C1047a(splitter, toSplit);
        }
    }

    class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f116609a;

        class a extends g {
            a(o0 splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // com.google.common.base.o0.g
            public int f(int separatorPosition) {
                return separatorPosition + b.this.f116609a.length();
            }

            @Override // com.google.common.base.o0.g
            public int g(int start) {
                int length = b.this.f116609a.length();
                int length2 = this.f116621c.length() - length;
                while (start <= length2) {
                    for (int i10 = 0; i10 < length; i10++) {
                        if (this.f116621c.charAt(i10 + start) != b.this.f116609a.charAt(i10)) {
                            start++;
                        }
                    }
                    return start;
                }
                return -1;
            }
        }

        b(final String val$separator) {
            this.f116609a = val$separator;
        }

        @Override // com.google.common.base.o0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(o0 splitter, CharSequence toSplit) {
            return new a(splitter, toSplit);
        }
    }

    class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.h f116611a;

        class a extends g {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.google.common.base.g f116612h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ c f116613i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(final c this$0, o0 splitter, CharSequence toSplit, final com.google.common.base.g val$matcher) {
                super(splitter, toSplit);
                this.f116612h = val$matcher;
                this.f116613i = this$0;
            }

            @Override // com.google.common.base.o0.g
            public int f(int separatorPosition) {
                return this.f116612h.a();
            }

            @Override // com.google.common.base.o0.g
            public int g(int start) {
                if (this.f116612h.c(start)) {
                    return this.f116612h.f();
                }
                return -1;
            }
        }

        c(final com.google.common.base.h val$separatorPattern) {
            this.f116611a = val$separatorPattern;
        }

        @Override // com.google.common.base.o0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(final o0 splitter, CharSequence toSplit) {
            return new a(this, splitter, toSplit, this.f116611a.d(toSplit));
        }
    }

    class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f116614a;

        class a extends g {
            a(o0 splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // com.google.common.base.o0.g
            public int f(int separatorPosition) {
                return separatorPosition;
            }

            @Override // com.google.common.base.o0.g
            public int g(int start) {
                int i10 = start + d.this.f116614a;
                if (i10 < this.f116621c.length()) {
                    return i10;
                }
                return -1;
            }
        }

        d(final int val$length) {
            this.f116614a = val$length;
        }

        @Override // com.google.common.base.o0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(final o0 splitter, CharSequence toSplit) {
            return new a(splitter, toSplit);
        }
    }

    class e implements Iterable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f116616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f116617b;

        e(final o0 this$0, final CharSequence val$sequence) {
            this.f116616a = val$sequence;
            this.f116617b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f116617b.p(this.f116616a);
        }

        public String toString() {
            a0 a0VarP = a0.p(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            StringBuilder sbF = a0VarP.f(sb2, this);
            sbF.append(AbstractJsonLexerKt.END_LIST);
            return sbF.toString();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f116618c = "Chunk [%s] is not a valid entry";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f116619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f116620b;

        /* synthetic */ f(o0 o0Var, o0 o0Var2, a aVar) {
            this(o0Var, o0Var2);
        }

        public Map<String, String> a(CharSequence sequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f116619a.n(sequence)) {
                Iterator itP = this.f116620b.p(str);
                j0.u(itP.hasNext(), f116618c, str);
                String str2 = (String) itP.next();
                j0.u(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                j0.u(itP.hasNext(), f116618c, str);
                linkedHashMap.put(str2, (String) itP.next());
                j0.u(!itP.hasNext(), f116618c, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private f(o0 outerSplitter, o0 entrySplitter) {
            this.f116619a = outerSplitter;
            this.f116620b = (o0) j0.E(entrySplitter);
        }
    }

    private static abstract class g extends com.google.common.base.b<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f116621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.common.base.e f116622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f116623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f116624f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116625g;

        protected g(o0 splitter, CharSequence toSplit) {
            this.f116622d = splitter.f116603a;
            this.f116623e = splitter.f116604b;
            this.f116625g = splitter.f116606d;
            this.f116621c = toSplit;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.b
        @fj.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b() {
            int i10 = this.f116624f;
            while (true) {
                int i11 = this.f116624f;
                if (i11 == -1) {
                    return c();
                }
                int iG = g(i11);
                if (iG == -1) {
                    iG = this.f116621c.length();
                    this.f116624f = -1;
                } else {
                    this.f116624f = f(iG);
                }
                int i12 = this.f116624f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f116624f = i13;
                    if (i13 > this.f116621c.length()) {
                        this.f116624f = -1;
                    }
                } else {
                    while (i10 < iG && this.f116622d.B(this.f116621c.charAt(i10))) {
                        i10++;
                    }
                    while (iG > i10 && this.f116622d.B(this.f116621c.charAt(iG - 1))) {
                        iG--;
                    }
                    if (!this.f116623e || i10 != iG) {
                        int i14 = this.f116625g;
                        if (i14 == 1) {
                            iG = this.f116621c.length();
                            this.f116624f = -1;
                            while (iG > i10 && this.f116622d.B(this.f116621c.charAt(iG - 1))) {
                                iG--;
                            }
                        } else {
                            this.f116625g = i14 - 1;
                        }
                        return this.f116621c.subSequence(i10, iG).toString();
                    }
                    i10 = this.f116624f;
                }
            }
        }

        abstract int f(int separatorPosition);

        abstract int g(int start);
    }

    private interface h {
        Iterator<String> a(o0 splitter, CharSequence toSplit);
    }

    private o0(h strategy) {
        this(strategy, false, com.google.common.base.e.G(), Integer.MAX_VALUE);
    }

    public static o0 e(final int length) {
        j0.e(length > 0, "The length may not be less than 1");
        return new o0(new d(length));
    }

    public static o0 h(char separator) {
        return i(com.google.common.base.e.q(separator));
    }

    public static o0 i(final com.google.common.base.e separatorMatcher) {
        j0.E(separatorMatcher);
        return new o0(new a(separatorMatcher));
    }

    public static o0 j(final String separator) {
        j0.e(separator.length() != 0, "The separator may not be the empty string.");
        return separator.length() == 1 ? h(separator.charAt(0)) : new o0(new b(separator));
    }

    @com.google.common.annotations.c
    public static o0 k(Pattern separatorPattern) {
        return m(new z(separatorPattern));
    }

    @com.google.common.annotations.c
    public static o0 l(String separatorPattern) {
        return m(i0.a(separatorPattern));
    }

    static o0 m(final com.google.common.base.h separatorPattern) {
        j0.u(!separatorPattern.d("").d(), "The pattern may not match the empty string: %s", separatorPattern);
        return new o0(new c(separatorPattern));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> p(CharSequence sequence) {
        return this.f116605c.a(this, sequence);
    }

    public o0 f(int maxItems) {
        j0.k(maxItems > 0, "must be greater than zero: %s", maxItems);
        return new o0(this.f116605c, this.f116604b, this.f116603a, maxItems);
    }

    public o0 g() {
        return new o0(this.f116605c, true, this.f116603a, this.f116606d);
    }

    public Iterable<String> n(final CharSequence sequence) {
        j0.E(sequence);
        return new e(this, sequence);
    }

    public List<String> o(CharSequence sequence) {
        j0.E(sequence);
        Iterator<String> itP = p(sequence);
        ArrayList arrayList = new ArrayList();
        while (itP.hasNext()) {
            arrayList.add(itP.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public o0 q() {
        return r(com.google.common.base.e.X());
    }

    public o0 r(com.google.common.base.e trimmer) {
        j0.E(trimmer);
        return new o0(this.f116605c, this.f116604b, trimmer, this.f116606d);
    }

    public f s(char separator) {
        return t(h(separator));
    }

    public f t(o0 keyValueSplitter) {
        return new f(this, keyValueSplitter, null);
    }

    public f u(String separator) {
        return t(j(separator));
    }

    private o0(h strategy, boolean omitEmptyStrings, com.google.common.base.e trimmer, int limit) {
        this.f116605c = strategy;
        this.f116604b = omitEmptyStrings;
        this.f116603a = trimmer;
        this.f116606d = limit;
    }
}

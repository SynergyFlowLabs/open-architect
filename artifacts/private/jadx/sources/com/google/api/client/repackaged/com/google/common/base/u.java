package com.google.api.client.repackaged.com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@r7.b(emulated = true)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.api.client.repackaged.com.google.common.base.c f115919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f115920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f115921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f115922d;

    static class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.api.client.repackaged.com.google.common.base.c f115923a;

        /* JADX INFO: renamed from: com.google.api.client.repackaged.com.google.common.base.u$a$a, reason: collision with other inner class name */
        class C1031a extends g {
            C1031a(u uVar, CharSequence charSequence) {
                super(uVar, charSequence);
            }

            @Override // com.google.api.client.repackaged.com.google.common.base.u.g
            int f(int i10) {
                return i10 + 1;
            }

            @Override // com.google.api.client.repackaged.com.google.common.base.u.g
            int g(int i10) {
                return a.this.f115923a.o(this.f115937c, i10);
            }
        }

        a(com.google.api.client.repackaged.com.google.common.base.c cVar) {
            this.f115923a = cVar;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.u.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(u uVar, CharSequence charSequence) {
            return new C1031a(uVar, charSequence);
        }
    }

    static class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f115925a;

        class a extends g {
            a(u uVar, CharSequence charSequence) {
                super(uVar, charSequence);
            }

            @Override // com.google.api.client.repackaged.com.google.common.base.u.g
            public int f(int i10) {
                return i10 + b.this.f115925a.length();
            }

            @Override // com.google.api.client.repackaged.com.google.common.base.u.g
            public int g(int i10) {
                int length = b.this.f115925a.length();
                int length2 = this.f115937c.length() - length;
                while (i10 <= length2) {
                    for (int i11 = 0; i11 < length; i11++) {
                        if (this.f115937c.charAt(i11 + i10) != b.this.f115925a.charAt(i11)) {
                            i10++;
                        }
                    }
                    return i10;
                }
                return -1;
            }
        }

        b(String str) {
            this.f115925a = str;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.u.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(u uVar, CharSequence charSequence) {
            return new a(uVar, charSequence);
        }
    }

    static class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.api.client.repackaged.com.google.common.base.e f115927a;

        class a extends g {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ com.google.api.client.repackaged.com.google.common.base.d f115928h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, CharSequence charSequence, com.google.api.client.repackaged.com.google.common.base.d dVar) {
                super(uVar, charSequence);
                this.f115928h = dVar;
            }

            @Override // com.google.api.client.repackaged.com.google.common.base.u.g
            public int f(int i10) {
                return this.f115928h.a();
            }

            @Override // com.google.api.client.repackaged.com.google.common.base.u.g
            public int g(int i10) {
                if (this.f115928h.c(i10)) {
                    return this.f115928h.f();
                }
                return -1;
            }
        }

        c(com.google.api.client.repackaged.com.google.common.base.e eVar) {
            this.f115927a = eVar;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.u.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(u uVar, CharSequence charSequence) {
            return new a(uVar, charSequence, this.f115927a.b(charSequence));
        }
    }

    static class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f115930a;

        class a extends g {
            a(u uVar, CharSequence charSequence) {
                super(uVar, charSequence);
            }

            @Override // com.google.api.client.repackaged.com.google.common.base.u.g
            public int f(int i10) {
                return i10;
            }

            @Override // com.google.api.client.repackaged.com.google.common.base.u.g
            public int g(int i10) {
                int i11 = i10 + d.this.f115930a;
                if (i11 < this.f115937c.length()) {
                    return i11;
                }
                return -1;
            }
        }

        d(int i10) {
            this.f115930a = i10;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.u.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(u uVar, CharSequence charSequence) {
            return new a(uVar, charSequence);
        }
    }

    class e implements Iterable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f115932a;

        e(CharSequence charSequence) {
            this.f115932a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return u.this.p(this.f115932a);
        }

        public String toString() {
            k kVarP = k.p(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            StringBuilder sbF = kVarP.f(sb2, this);
            sbF.append(AbstractJsonLexerKt.END_LIST);
            return sbF.toString();
        }
    }

    @r7.a
    public static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f115934c = "Chunk [%s] is not a valid entry";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f115935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f115936b;

        /* synthetic */ f(u uVar, u uVar2, a aVar) {
            this(uVar, uVar2);
        }

        public Map<String, String> a(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f115935a.n(charSequence)) {
                Iterator itP = this.f115936b.p(str);
                q.u(itP.hasNext(), f115934c, str);
                String str2 = (String) itP.next();
                q.u(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                q.u(itP.hasNext(), f115934c, str);
                linkedHashMap.put(str2, (String) itP.next());
                q.u(!itP.hasNext(), f115934c, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private f(u uVar, u uVar2) {
            this.f115935a = uVar;
            this.f115936b = (u) q.E(uVar2);
        }
    }

    private static abstract class g extends com.google.api.client.repackaged.com.google.common.base.b<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f115937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.api.client.repackaged.com.google.common.base.c f115938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f115939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f115940f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f115941g;

        protected g(u uVar, CharSequence charSequence) {
            this.f115938d = uVar.f115919a;
            this.f115939e = uVar.f115920b;
            this.f115941g = uVar.f115922d;
            this.f115937c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.client.repackaged.com.google.common.base.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b() {
            int i10 = this.f115940f;
            while (true) {
                int i11 = this.f115940f;
                if (i11 == -1) {
                    return c();
                }
                int iG = g(i11);
                if (iG == -1) {
                    iG = this.f115937c.length();
                    this.f115940f = -1;
                } else {
                    this.f115940f = f(iG);
                }
                int i12 = this.f115940f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f115940f = i13;
                    if (i13 >= this.f115937c.length()) {
                        this.f115940f = -1;
                    }
                } else {
                    while (i10 < iG && this.f115938d.B(this.f115937c.charAt(i10))) {
                        i10++;
                    }
                    while (iG > i10 && this.f115938d.B(this.f115937c.charAt(iG - 1))) {
                        iG--;
                    }
                    if (!this.f115939e || i10 != iG) {
                        int i14 = this.f115941g;
                        if (i14 == 1) {
                            iG = this.f115937c.length();
                            this.f115940f = -1;
                            while (iG > i10 && this.f115938d.B(this.f115937c.charAt(iG - 1))) {
                                iG--;
                            }
                        } else {
                            this.f115941g = i14 - 1;
                        }
                        return this.f115937c.subSequence(i10, iG).toString();
                    }
                    i10 = this.f115940f;
                }
            }
        }

        abstract int f(int i10);

        abstract int g(int i10);
    }

    private interface h {
        Iterator<String> a(u uVar, CharSequence charSequence);
    }

    private u(h hVar) {
        this(hVar, false, com.google.api.client.repackaged.com.google.common.base.c.G(), Integer.MAX_VALUE);
    }

    public static u e(int i10) {
        q.e(i10 > 0, "The length may not be less than 1");
        return new u(new d(i10));
    }

    public static u h(char c10) {
        return i(com.google.api.client.repackaged.com.google.common.base.c.q(c10));
    }

    public static u i(com.google.api.client.repackaged.com.google.common.base.c cVar) {
        q.E(cVar);
        return new u(new a(cVar));
    }

    private static u j(com.google.api.client.repackaged.com.google.common.base.e eVar) {
        q.u(!eVar.b("").d(), "The pattern may not match the empty string: %s", eVar);
        return new u(new c(eVar));
    }

    public static u k(String str) {
        q.e(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? h(str.charAt(0)) : new u(new b(str));
    }

    @r7.c
    public static u l(Pattern pattern) {
        return j(new j(pattern));
    }

    @r7.c
    public static u m(String str) {
        return j(p.a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> p(CharSequence charSequence) {
        return this.f115921c.a(this, charSequence);
    }

    public u f(int i10) {
        q.k(i10 > 0, "must be greater than zero: %s", i10);
        return new u(this.f115921c, this.f115920b, this.f115919a, i10);
    }

    public u g() {
        return new u(this.f115921c, true, this.f115919a, this.f115922d);
    }

    public Iterable<String> n(CharSequence charSequence) {
        q.E(charSequence);
        return new e(charSequence);
    }

    @r7.a
    public List<String> o(CharSequence charSequence) {
        q.E(charSequence);
        Iterator<String> itP = p(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itP.hasNext()) {
            arrayList.add(itP.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public u q() {
        return r(com.google.api.client.repackaged.com.google.common.base.c.X());
    }

    public u r(com.google.api.client.repackaged.com.google.common.base.c cVar) {
        q.E(cVar);
        return new u(this.f115921c, this.f115920b, cVar, this.f115922d);
    }

    @r7.a
    public f s(char c10) {
        return t(h(c10));
    }

    @r7.a
    public f t(u uVar) {
        return new f(this, uVar, null);
    }

    @r7.a
    public f u(String str) {
        return t(k(str));
    }

    private u(h hVar, boolean z10, com.google.api.client.repackaged.com.google.common.base.c cVar, int i10) {
        this.f115921c = hVar;
        this.f115920b = z10;
        this.f115919a = cVar;
        this.f115922d = i10;
    }
}

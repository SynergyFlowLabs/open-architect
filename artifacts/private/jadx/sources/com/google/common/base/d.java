package com.google.common.base;

import java.io.Serializable;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public abstract class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f116475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f116476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f116477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f116478g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.e f116480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f116481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f116474c = new a("LOWER_HYPHEN", 0, com.google.common.base.e.q(org.apache.commons.codec.language.l.f335457d), "-");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ d[] f116479h = k();

    final enum a extends d {
        a(String $enum$name, int $enum$ordinal, com.google.common.base.e wordBoundary, String wordSeparator) {
            super($enum$name, $enum$ordinal, wordBoundary, wordSeparator, null);
        }

        @Override // com.google.common.base.d
        String n(d format, String s10) {
            if (format == d.f116475d) {
                return s10.replace(org.apache.commons.codec.language.l.f335457d, '_');
            }
            return format == d.f116478g ? com.google.common.base.c.j(s10.replace(org.apache.commons.codec.language.l.f335457d, '_')) : super.n(format, s10);
        }

        @Override // com.google.common.base.d
        String r(String word) {
            return com.google.common.base.c.g(word);
        }
    }

    private static final class f extends i<String, String> implements Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f116482e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f116483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f116484d;

        f(d sourceFormat, d targetFormat) {
            this.f116483c = (d) j0.E(sourceFormat);
            this.f116484d = (d) j0.E(targetFormat);
        }

        @Override // com.google.common.base.i, com.google.common.base.t
        public boolean equals(@fj.a Object object) {
            if (object instanceof f) {
                f fVar = (f) object;
                if (this.f116483c.equals(fVar.f116483c) && this.f116484d.equals(fVar.f116484d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f116484d.hashCode() ^ this.f116483c.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String g(String s10) {
            return this.f116484d.s(this.f116483c, s10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String h(String s10) {
            return this.f116483c.s(this.f116484d, s10);
        }

        public String toString() {
            return this.f116483c + ".converterTo(" + this.f116484d + ")";
        }
    }

    static {
        int i10 = 4 ^ 1;
        String str = "_";
        f116475d = new d("LOWER_UNDERSCORE", 1, com.google.common.base.e.q('_'), str) { // from class: com.google.common.base.d.b
            {
                a aVar = null;
            }

            @Override // com.google.common.base.d
            String n(d format, String s10) {
                if (format == d.f116474c) {
                    return s10.replace('_', org.apache.commons.codec.language.l.f335457d);
                }
                return format == d.f116478g ? com.google.common.base.c.j(s10) : super.n(format, s10);
            }

            @Override // com.google.common.base.d
            String r(String word) {
                return com.google.common.base.c.g(word);
            }
        };
        String str2 = "";
        f116476e = new d("LOWER_CAMEL", 2, com.google.common.base.e.m('A', 'Z'), str2) { // from class: com.google.common.base.d.c
            {
                a aVar = null;
            }

            @Override // com.google.common.base.d
            String q(String word) {
                return com.google.common.base.c.g(word);
            }

            @Override // com.google.common.base.d
            String r(String word) {
                return d.p(word);
            }
        };
        f116477f = new d("UPPER_CAMEL", 3, com.google.common.base.e.m('A', 'Z'), str2) { // from class: com.google.common.base.d.d
            {
                a aVar = null;
            }

            @Override // com.google.common.base.d
            String r(String word) {
                return d.p(word);
            }
        };
        f116478g = new d("UPPER_UNDERSCORE", 4, com.google.common.base.e.q('_'), str) { // from class: com.google.common.base.d.e
            {
                a aVar = null;
            }

            @Override // com.google.common.base.d
            String n(d format, String s10) {
                if (format == d.f116474c) {
                    return com.google.common.base.c.g(s10.replace('_', org.apache.commons.codec.language.l.f335457d));
                }
                return format == d.f116475d ? com.google.common.base.c.g(s10) : super.n(format, s10);
            }

            @Override // com.google.common.base.d
            String r(String word) {
                return com.google.common.base.c.j(word);
            }
        };
    }

    /* synthetic */ d(String str, int i10, com.google.common.base.e eVar, String str2, a aVar) {
        this(str, i10, eVar, str2);
    }

    private static /* synthetic */ d[] k() {
        return new d[]{f116474c, f116475d, f116476e, f116477f, f116478g};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String p(String word) {
        if (word.isEmpty()) {
            return word;
        }
        return com.google.common.base.c.h(word.charAt(0)) + com.google.common.base.c.g(word.substring(1));
    }

    public static d valueOf(String name) {
        return (d) Enum.valueOf(d.class, name);
    }

    public static d[] values() {
        return (d[]) f116479h.clone();
    }

    String n(d format, String s10) {
        StringBuilder sb2 = null;
        int length = 0;
        int iO = -1;
        while (true) {
            iO = this.f116480a.o(s10, iO + 1);
            if (iO == -1) {
                break;
            }
            if (length == 0) {
                sb2 = new StringBuilder(s10.length() + (format.f116481b.length() * 4));
                sb2.append(format.q(s10.substring(length, iO)));
            } else {
                Objects.requireNonNull(sb2);
                sb2.append(format.r(s10.substring(length, iO)));
            }
            sb2.append(format.f116481b);
            length = this.f116481b.length() + iO;
        }
        if (length == 0) {
            return format.q(s10);
        }
        Objects.requireNonNull(sb2);
        sb2.append(format.r(s10.substring(length)));
        return sb2.toString();
    }

    public i<String, String> o(d targetFormat) {
        return new f(this, targetFormat);
    }

    String q(String word) {
        return r(word);
    }

    abstract String r(String word);

    public final String s(d format, String str) {
        j0.E(format);
        j0.E(str);
        return format == this ? str : n(format, str);
    }

    private d(String $enum$name, int $enum$ordinal, com.google.common.base.e wordBoundary, String wordSeparator) {
        super($enum$name, $enum$ordinal);
        this.f116480a = wordBoundary;
        this.f116481b = wordSeparator;
    }
}

package com.badlogic.gdx.utils;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Writer f95454a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f95456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f95457d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.badlogic.gdx.utils.b<b> f95455b = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f95458e = c.json;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f95459f = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95460a;

        static {
            int[] iArr = new int[c.values().length];
            f95460a = iArr;
            try {
                iArr[c.minimal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 3 << 2;
                f95460a[c.javascript.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f95461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f95462b;

        b(boolean z10) throws IOException {
            this.f95461a = z10;
            d0.this.f95454a.write(z10 ? 91 : 123);
        }

        void a() throws IOException {
            d0.this.f95454a.write(this.f95461a ? 93 : 125);
        }
    }

    public enum c {
        json,
        javascript,
        minimal;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static Pattern f95467d = Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*$");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Pattern f95468e = Pattern.compile("^[^\":,}/ ][^:]*$");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Pattern f95469f = Pattern.compile("^[^\":,{\\[\\]/ ][^}\\],]*$");

        public String l(String str) {
            String strReplace = str.replace("\\", "\\\\").replace(org.apache.commons.lang3.z.f337565d, "\\r").replace("\n", "\\n").replace("\t", "\\t");
            int i10 = a.f95460a[ordinal()];
            if (i10 != 1) {
                int i11 = 7 >> 2;
                if (i10 == 2) {
                }
                return '\"' + strReplace.replace("\"", "\\\"") + '\"';
            }
            if (!strReplace.contains("//") && !strReplace.contains("/*") && f95468e.matcher(strReplace).matches()) {
                return strReplace;
            }
            if (f95467d.matcher(strReplace).matches()) {
                return strReplace;
            }
            return '\"' + strReplace.replace("\"", "\\\"") + '\"';
        }

        public String n(Object obj) {
            int length;
            if (obj == null) {
                return AbstractJsonLexerKt.NULL;
            }
            String string = obj.toString();
            if ((obj instanceof Number) || (obj instanceof Boolean)) {
                return string;
            }
            String strReplace = string.replace("\\", "\\\\").replace(org.apache.commons.lang3.z.f337565d, "\\r").replace("\n", "\\n").replace("\t", "\\t");
            if (this == minimal && !strReplace.equals(com.facebook.internal.z0.P) && !strReplace.equals("false") && !strReplace.equals(AbstractJsonLexerKt.NULL) && !strReplace.contains("//") && !strReplace.contains("/*") && (length = strReplace.length()) > 0 && strReplace.charAt(length - 1) != ' ' && f95469f.matcher(strReplace).matches()) {
                return strReplace;
            }
            return '\"' + strReplace.replace("\"", "\\\"") + '\"';
        }
    }

    public d0(Writer writer) {
        this.f95454a = writer;
    }

    private void l() throws IOException {
        b bVar = this.f95456c;
        if (bVar == null) {
            return;
        }
        if (!bVar.f95461a) {
            if (!this.f95457d) {
                throw new IllegalStateException("Name must be set.");
            }
            this.f95457d = false;
        } else if (bVar.f95462b) {
            this.f95454a.write(44);
        } else {
            bVar.f95462b = true;
        }
    }

    public d0 a() throws IOException {
        l();
        com.badlogic.gdx.utils.b<b> bVar = this.f95455b;
        b bVar2 = new b(true);
        this.f95456c = bVar2;
        bVar.c(bVar2);
        return this;
    }

    public d0 b(String str) throws IOException {
        return f(str).a();
    }

    public Writer c() {
        return this.f95454a;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.f95455b.f95174b > 0) {
            j();
        }
        this.f95454a.close();
    }

    public d0 d(String str) throws IOException {
        l();
        this.f95454a.write(str);
        return this;
    }

    public d0 e(String str, String str2) throws IOException {
        return f(str).d(str2);
    }

    public d0 f(String str) throws IOException {
        b bVar = this.f95456c;
        if (bVar == null || bVar.f95461a) {
            throw new IllegalStateException("Current item must be an object.");
        }
        if (bVar.f95462b) {
            this.f95454a.write(44);
        } else {
            bVar.f95462b = true;
        }
        this.f95454a.write(this.f95458e.l(str));
        this.f95454a.write(58);
        this.f95457d = true;
        return this;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f95454a.flush();
    }

    public d0 g() throws IOException {
        l();
        com.badlogic.gdx.utils.b<b> bVar = this.f95455b;
        b bVar2 = new b(false);
        this.f95456c = bVar2;
        bVar.c(bVar2);
        return this;
    }

    public d0 h(String str) throws IOException {
        return f(str).g();
    }

    public d0 j() throws IOException {
        if (this.f95457d) {
            throw new IllegalStateException("Expected an object, array, or value since a name was set.");
        }
        this.f95455b.pop().a();
        com.badlogic.gdx.utils.b<b> bVar = this.f95455b;
        this.f95456c = bVar.f95174b == 0 ? null : bVar.peek();
        return this;
    }

    public d0 m(String str, Object obj) throws IOException {
        return f(str).r(obj);
    }

    public void o(c cVar) {
        this.f95458e = cVar;
    }

    public void q(boolean z10) {
        this.f95459f = z10;
    }

    public d0 r(Object obj) throws IOException {
        if (this.f95459f && ((obj instanceof Long) || (obj instanceof Double) || (obj instanceof BigDecimal) || (obj instanceof BigInteger))) {
            obj = obj.toString();
        } else if (obj instanceof Number) {
            Number number = (Number) obj;
            long jLongValue = number.longValue();
            if (number.doubleValue() == jLongValue) {
                obj = Long.valueOf(jLongValue);
            }
        }
        l();
        this.f95454a.write(this.f95458e.n(obj));
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        this.f95454a.write(cArr, i10, i11);
    }
}

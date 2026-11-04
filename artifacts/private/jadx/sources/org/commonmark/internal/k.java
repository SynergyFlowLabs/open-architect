package org.commonmark.internal;

import java.util.regex.Pattern;
import org.commonmark.node.x;

/* JADX INFO: loaded from: classes14.dex */
public class k extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern[][] f337618e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.commonmark.node.n f337619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f337620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f337621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.commonmark.internal.a f337622d;

    public static class b extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.e
        public org.commonmark.parser.block.f a(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            int iD = hVar.d();
            CharSequence charSequenceC = hVar.c();
            if (hVar.a() < 4 && charSequenceC.charAt(iD) == '<') {
                for (int i10 = 1; i10 <= 7; i10++) {
                    if (i10 != 7 || !(gVar.a().e() instanceof x)) {
                        Pattern pattern = k.f337618e[i10][0];
                        Pattern pattern2 = k.f337618e[i10][1];
                        if (pattern.matcher(charSequenceC.subSequence(iD, charSequenceC.length())).find()) {
                            return org.commonmark.parser.block.f.d(new k(pattern2)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return org.commonmark.parser.block.f.c();
        }
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        if (this.f337621c) {
            return org.commonmark.parser.block.c.d();
        }
        return (hVar.b() && this.f337620b == null) ? org.commonmark.parser.block.c.d() : org.commonmark.parser.block.c.b(hVar.getIndex());
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.node.b e() {
        return this.f337619a;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void f(CharSequence charSequence) {
        this.f337622d.a(charSequence);
        Pattern pattern = this.f337620b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f337621c = true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void h() {
        this.f337619a.r(this.f337622d.b());
        this.f337622d = null;
    }

    private k(Pattern pattern) {
        this.f337619a = new org.commonmark.node.n();
        this.f337621c = false;
        this.f337622d = new org.commonmark.internal.a();
        this.f337620b = pattern;
    }
}

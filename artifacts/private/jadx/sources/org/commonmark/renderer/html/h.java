package org.commonmark.renderer.html;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f337776c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Appendable f337777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char f337778b = 0;

    public h(Appendable appendable) {
        if (appendable == null) {
            throw new NullPointerException("out must not be null");
        }
        this.f337777a = appendable;
    }

    protected void a(String str) {
        try {
            this.f337777a.append(str);
            int length = str.length();
            if (length != 0) {
                this.f337778b = str.charAt(length - 1);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void b() {
        char c10 = this.f337778b;
        if (c10 == 0 || c10 == '\n') {
            return;
        }
        a("\n");
    }

    public void c(String str) {
        a(str);
    }

    public void d(String str) {
        e(str, f337776c);
    }

    public void e(String str, Map<String, String> map) {
        f(str, map, false);
    }

    public void f(String str, Map<String, String> map, boolean z10) {
        a("<");
        a(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(" ");
                a(org.commonmark.internal.util.a.b(entry.getKey()));
                a("=\"");
                a(org.commonmark.internal.util.a.b(entry.getValue()));
                a("\"");
            }
        }
        if (z10) {
            a(" /");
        }
        a(">");
    }

    public void g(String str) {
        a(org.commonmark.internal.util.a.b(str));
    }
}

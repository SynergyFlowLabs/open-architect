package org.commonmark.renderer.text;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Appendable f337790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char f337791b;

    public e(Appendable appendable) {
        this.f337790a = appendable;
    }

    private void a(char c10) {
        try {
            this.f337790a.append(c10);
            this.f337791b = c10;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void b(String str) {
        try {
            this.f337790a.append(str);
            int length = str.length();
            if (length != 0) {
                this.f337791b = str.charAt(length - 1);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void c() {
        char c10 = this.f337791b;
        if (c10 == 0 || c10 == ':') {
            return;
        }
        a(AbstractJsonLexerKt.COLON);
    }

    public void d() {
        char c10 = this.f337791b;
        if (c10 != 0 && c10 != '\n') {
            a('\n');
        }
    }

    public void e() {
        char c10 = this.f337791b;
        if (c10 == 0 || c10 == ' ') {
            return;
        }
        a(' ');
    }

    public void f(char c10) {
        a(c10);
    }

    public void g(String str) {
        b(str);
    }

    public void h(String str) {
        b(str.replaceAll("[\\r\\n\\s]+", " "));
    }
}

package com.google.common.xml;

import com.google.common.escape.h;
import com.google.common.escape.i;
import kotlin.text.b0;
import org.apache.commons.lang3.k;

/* JADX INFO: loaded from: classes5.dex */
@a
@com.google.common.annotations.b
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char f120396a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char f120397b = 31;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f120398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f120399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f120400e;

    static {
        i.b bVarA = i.a();
        bVarA.d((char) 0, (char) 65533);
        bVarA.e("�");
        for (char c10 = 0; c10 <= 31; c10 = (char) (c10 + 1)) {
            if (c10 != '\t' && c10 != '\n' && c10 != '\r') {
                bVarA.b(c10, "�");
            }
        }
        bVarA.b(b0.f313279d, "&amp;");
        bVarA.b(b0.f313280e, "&lt;");
        bVarA.b(b0.f313281f, "&gt;");
        f120399d = bVarA.c();
        bVarA.b('\'', "&apos;");
        bVarA.b('\"', "&quot;");
        f120398c = bVarA.c();
        bVarA.b('\t', "&#x9;");
        bVarA.b('\n', "&#xA;");
        bVarA.b(k.f337188d, "&#xD;");
        f120400e = bVarA.c();
    }

    private c() {
    }

    public static h a() {
        return f120400e;
    }

    public static h b() {
        return f120399d;
    }
}

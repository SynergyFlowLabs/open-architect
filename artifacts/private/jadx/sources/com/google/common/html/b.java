package com.google.common.html;

import com.google.common.escape.h;
import com.google.common.escape.i;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes5.dex */
@a
@com.google.common.annotations.b
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f118925a = i.a().b('\"', "&quot;").b('\'', "&#39;").b(b0.f313279d, "&amp;").b(b0.f313280e, "&lt;").b(b0.f313281f, "&gt;").c();

    private b() {
    }

    public static h a() {
        return f118925a;
    }
}

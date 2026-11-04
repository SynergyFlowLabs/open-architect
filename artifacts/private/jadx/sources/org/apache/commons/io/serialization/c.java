package org.apache.commons.io.serialization;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f336821a;

    public c(String str) {
        this(Pattern.compile(str));
    }

    @Override // org.apache.commons.io.serialization.a
    public boolean a(String str) {
        return this.f336821a.matcher(str).matches();
    }

    public c(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Null pattern");
        }
        this.f336821a = pattern;
    }
}

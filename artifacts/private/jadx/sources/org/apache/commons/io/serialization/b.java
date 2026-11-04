package org.apache.commons.io.serialization;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f336820a;

    public b(String... strArr) {
        this.f336820a = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    @Override // org.apache.commons.io.serialization.a
    public boolean a(String str) {
        return this.f336820a.contains(str);
    }
}

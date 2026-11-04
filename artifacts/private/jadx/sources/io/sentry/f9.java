package io.sentry;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class f9<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<T> f305437a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305438a = "values";
    }

    f9(@Nullable List<T> list) {
        this.f305437a = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    @NotNull
    public List<T> a() {
        return this.f305437a;
    }
}
